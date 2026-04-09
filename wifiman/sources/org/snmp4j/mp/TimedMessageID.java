package org.snmp4j.mp;

/* loaded from: classes2.dex */
public class TimedMessageID extends SimpleMessageID {
    private static final long serialVersionUID = 952343921331667512L;
    private long creationNanoTime;

    public TimedMessageID(int i10) {
        super(i10);
        this.creationNanoTime = System.nanoTime();
    }

    public long getCreationNanoTime() {
        return this.creationNanoTime;
    }

    @Override // org.snmp4j.mp.SimpleMessageID
    public String toString() {
        return "TimedMessageID{msgID=" + getID() + ",creationNanoTime=" + this.creationNanoTime + "}";
    }
}
