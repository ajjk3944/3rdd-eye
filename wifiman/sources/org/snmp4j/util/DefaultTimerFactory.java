package org.snmp4j.util;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class DefaultTimerFactory implements TimerFactory {

    class TimerAdapter implements CommonTimer {
        private Timer timer = new Timer(true);

        TimerAdapter() {
        }

        @Override // org.snmp4j.util.CommonTimer
        public void cancel() {
            this.timer.cancel();
        }

        @Override // org.snmp4j.util.CommonTimer
        public void schedule(TimerTask timerTask, long j10) {
            this.timer.schedule(timerTask, j10);
        }

        @Override // org.snmp4j.util.CommonTimer
        public void schedule(TimerTask timerTask, Date date, long j10) {
            this.timer.schedule(timerTask, date, j10);
        }

        @Override // org.snmp4j.util.CommonTimer
        public void schedule(TimerTask timerTask, long j10, long j11) {
            this.timer.schedule(timerTask, j10, j11);
        }
    }

    @Override // org.snmp4j.util.TimerFactory
    public CommonTimer createTimer() {
        return new TimerAdapter();
    }
}
