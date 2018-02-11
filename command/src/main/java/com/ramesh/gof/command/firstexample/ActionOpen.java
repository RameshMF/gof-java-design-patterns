package com.ramesh.gof.command.firstexample;

public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }

}
