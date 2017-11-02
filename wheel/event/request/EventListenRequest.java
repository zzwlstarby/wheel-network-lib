package com.xhystc.wheel.event.request;

import com.xhystc.wheel.event.handler.EventHandler;

public class EventListenRequest
{
	protected int registEvents = 0;
	protected int readyEvents=0;
	EventHandler handler;

	protected EventListenRequest(EventHandler handler){
		this.handler = handler;
	}

	public EventHandler getHandler()
	{
		return handler;
	}

	protected boolean isReady(int eventType){
		return (readyEvents & eventType) >0;
	}

	protected void registEvents(int eventType){
		registEvents |= eventType;
	}
	public int getRegistEvents(){
		return registEvents;
	}

	public void setRegistEvents(int registEvents)
	{
		this.registEvents = registEvents;
	}

	public void setReadyEvents(int ops){
		readyEvents=ops;
	}

}





