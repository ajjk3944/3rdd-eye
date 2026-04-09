package org.snmp4j.util;

import java.util.Date;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public interface CommonTimer {
    void cancel();

    void schedule(TimerTask timerTask, long j10);

    void schedule(TimerTask timerTask, long j10, long j11);

    void schedule(TimerTask timerTask, Date date, long j10);
}
