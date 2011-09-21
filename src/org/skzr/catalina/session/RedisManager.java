/**
 * Copyright (c) 2011-2030 by skzr.org
 * All rights reserved.
 * @author <a href="mailto:skzr.org@gmail.com">skzr.org</a>
 * @date 2011-9-20 下午10:53:39
 */
package org.skzr.catalina.session;

import java.beans.PropertyChangeListener;
import java.io.IOException;

import org.apache.catalina.Container;
import org.apache.catalina.Manager;
import org.apache.catalina.Session;

/**
 * @author <a href="mailto:skzr.org@gmail.com">skzr.org</a>
 * @version 1.0.0
 * @since JDK1.6
 */
public class RedisManager implements Manager {

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainer(Container container) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getDistributable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDistributable(boolean distributable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxInactiveInterval() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxInactiveInterval(int interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSessionIdLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSessionIdLength(int idLength) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getSessionCounter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSessionCounter(long sessionCounter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaxActive() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxActive(int maxActive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getActiveSessions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getExpiredSessions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setExpiredSessions(long expiredSessions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRejectedSessions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSessionMaxAliveTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSessionMaxAliveTime(int sessionMaxAliveTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSessionAverageAliveTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSessionCreateRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSessionExpireRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeSessionId(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session createEmptySession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session createSession(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session findSession(String id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session[] findSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Session session, boolean update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unload() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backgroundProcess() {
		// TODO Auto-generated method stub
		
	}


}
