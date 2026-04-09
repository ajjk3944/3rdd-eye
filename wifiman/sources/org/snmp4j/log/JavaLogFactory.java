package org.snmp4j.log;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class JavaLogFactory extends LogFactory {

    public class JavaLogAdapterIterator implements Iterator {
        private Enumeration<String> loggerNames;

        protected JavaLogAdapterIterator(Enumeration<String> enumeration) {
            this.loggerNames = enumeration;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.loggerNames.hasMoreElements();
        }

        @Override // java.util.Iterator
        public Object next() {
            return new JavaLogAdapter(Logger.getLogger(this.loggerNames.nextElement()));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.snmp4j.log.LogFactory
    protected LogAdapter createLogger(Class cls) {
        return new JavaLogAdapter(Logger.getLogger(cls.getName()));
    }

    @Override // org.snmp4j.log.LogFactory
    public LogAdapter getRootLogger() {
        return new JavaLogAdapter(Logger.getLogger(""));
    }

    @Override // org.snmp4j.log.LogFactory
    public Iterator loggers() {
        return new JavaLogAdapterIterator(LogManager.getLogManager().getLoggerNames());
    }

    @Override // org.snmp4j.log.LogFactory
    protected LogAdapter createLogger(String str) {
        return new JavaLogAdapter(Logger.getLogger(str));
    }
}
