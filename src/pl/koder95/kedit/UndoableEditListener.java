package pl.koder95.kedit;

import javax.swing.event.UndoableEditEvent;

/**
 * Class for implementing the Undo listener to handle the Undo and Redo actions
 */
public class UndoableEditListener implements javax.swing.event.UndoableEditListener {

    private final UndoRedoActionContext context;

    public UndoableEditListener(UndoRedoActionContext context) {
        this.context = context;
    }

    public void undoableEditHappened(UndoableEditEvent uee) {
        context.getManager().addEdit(uee.getEdit());
        context.updateStates();
    }
}
