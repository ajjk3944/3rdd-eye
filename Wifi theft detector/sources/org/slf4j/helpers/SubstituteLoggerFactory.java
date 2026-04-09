package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

/* loaded from: classes4.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {
    final ConcurrentMap<String, SubstituteLogger> loggers = new ConcurrentHashMap();
    final List<SubstituteLoggingEvent> eventList = Collections.synchronizedList(new ArrayList());

    public void clear() {
        this.loggers.clear();
        this.eventList.clear();
    }

    public List<SubstituteLoggingEvent> getEventList() {
        return this.eventList;
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        SubstituteLogger substituteLoggerPutIfAbsent;
        SubstituteLogger substituteLogger = this.loggers.get(str);
        return (substituteLogger != null || (substituteLoggerPutIfAbsent = this.loggers.putIfAbsent(str, (substituteLogger = new SubstituteLogger(str, this.eventList)))) == null) ? substituteLogger : substituteLoggerPutIfAbsent;
    }

    public List<String> getLoggerNames() {
        return new ArrayList(this.loggers.keySet());
    }

    public List<SubstituteLogger> getLoggers() {
        return new ArrayList(this.loggers.values());
    }
}
