package org.snmp4j.log;

/* loaded from: classes2.dex */
public class ConsoleLogFactory extends LogFactory {
    private ConsoleLogAdapter logAdapter = new ConsoleLogAdapter();

    @Override // org.snmp4j.log.LogFactory
    protected LogAdapter createLogger(Class cls) {
        return this.logAdapter;
    }

    @Override // org.snmp4j.log.LogFactory
    public LogAdapter getRootLogger() {
        return this.logAdapter;
    }

    @Override // org.snmp4j.log.LogFactory
    protected LogAdapter createLogger(String str) {
        return this.logAdapter;
    }
}
