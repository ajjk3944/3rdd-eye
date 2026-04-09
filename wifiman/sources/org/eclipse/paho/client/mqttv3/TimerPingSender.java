package org.eclipse.paho.client.mqttv3;

import java.util.Timer;
import java.util.TimerTask;
import kj.C6473a;
import org.eclipse.paho.client.mqttv3.logging.a;
import org.eclipse.paho.client.mqttv3.logging.b;

/* loaded from: classes3.dex */
public class TimerPingSender implements MqttPingSender {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.TimerPingSender";
    private String clientid;
    private C6473a comms;
    private a log = b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", CLASS_NAME);
    private Timer timer;

    private class PingTask extends TimerTask {
        private static final String methodName = "PingTask.run";

        private PingTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            TimerPingSender.this.log.fine(TimerPingSender.CLASS_NAME, methodName, "660", new Object[]{Long.valueOf(System.nanoTime())});
            TimerPingSender.this.comms.n();
        }

        /* synthetic */ PingTask(TimerPingSender timerPingSender, PingTask pingTask) {
            this();
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void init(C6473a c6473a) {
        if (c6473a == null) {
            throw new IllegalArgumentException("ClientComms cannot be null.");
        }
        this.comms = c6473a;
        String clientId = c6473a.B().getClientId();
        this.clientid = clientId;
        this.log.setResourceName(clientId);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void schedule(long j10) {
        this.timer.schedule(new PingTask(this, null), j10);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void start() {
        this.log.fine(CLASS_NAME, "start", "659", new Object[]{this.clientid});
        Timer timer = new Timer("MQTT Ping: " + this.clientid);
        this.timer = timer;
        timer.schedule(new PingTask(this, null), this.comms.C());
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void stop() {
        this.log.fine(CLASS_NAME, "stop", "661", null);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }
}
