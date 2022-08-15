package pl.koder95.kedit;

import com.hexidec.util.Translatrix;

import javax.swing.*;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionEvent;

public class UndoRedoActionContext {

    private final UndoManager manager;
    private final UndoAction undoAction;
    private final RedoAction redoAction;

    private UndoRedoActionContext(UndoManager manager, UndoAction undoAction, RedoAction redoAction) {
        this.manager = manager;
        this.undoAction = undoAction;
        this.redoAction = redoAction;
        this.undoAction.context = this;
        this.redoAction.context = this;
    }

    public UndoRedoActionContext(UndoManager manager) {
        this(manager, new UndoAction(), new RedoAction());
    }

    public UndoRedoActionContext() {
        this(new UndoManager());
    }

    public UndoManager getManager() {
        return manager;
    }

    public UndoAction getUndoAction() {
        return undoAction;
    }

    public RedoAction getRedoAction() {
        return redoAction;
    }

    public void updateStates() {
        undoAction.updateUndoState();
        redoAction.updateRedoState();
    }

    /**
     *  Class for implementing Undo as an autonomous action
     */
    public static class UndoAction extends AbstractAction {

        private UndoRedoActionContext context = null;

        public UndoAction() {
            super(Translatrix.getTranslationString("Undo"));
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            if (context == null) return;
            try {
                context.getManager().undo();
            } catch(CannotUndoException ex) {
                ex.printStackTrace();
            }
            context.updateStates();
        }

        void updateUndoState() {
            if (context == null) return;
            setEnabled(context.getManager().canUndo());
        }
    }

    /**
     * Class for implementing Redo as an autonomous action
     */
    public static class RedoAction extends AbstractAction {

        private UndoRedoActionContext context = null;

        public RedoAction() {
            super(Translatrix.getTranslationString("Redo"));
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            if (context == null) return;
            try {
                context.getManager().redo();
            } catch(CannotUndoException ex) {
                ex.printStackTrace();
            }
            context.updateStates();
        }

        void updateRedoState() {
            if (context == null) return;
            setEnabled(context.getManager().canRedo());
        }
    }
}
