package org.eclipse.paho.client.mqttv3;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kj.C6473a;
import org.eclipse.paho.client.mqttv3.logging.a;
import org.eclipse.paho.client.mqttv3.logging.b;

/* loaded from: classes3.dex */
public class ScheduledExecutorPingSender implements MqttPingSender {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.ScheduledExecutorPingSender";
    private String clientid;
    private C6473a comms;
    private ScheduledExecutorService executorService;
    private final a log = b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", CLASS_NAME);
    private ScheduledFuture scheduledFuture;

    private class PingRunnable implements Runnable {
        private static final String methodName = "PingTask.run";

        private PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("MQTT Ping: " + ScheduledExecutorPingSender.this.clientid);
            ScheduledExecutorPingSender.this.log.fine(ScheduledExecutorPingSender.CLASS_NAME, methodName, "660", new Object[]{Long.valueOf(System.nanoTime())});
            ScheduledExecutorPingSender.this.comms.n();
            Thread.currentThread().setName(name);
        }

        /* synthetic */ PingRunnable(ScheduledExecutorPingSender scheduledExecutorPingSender, PingRunnable pingRunnable) {
            this();
        }
    }

    public ScheduledExecutorPingSender(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService == null) {
            throw new IllegalArgumentException("ExecutorService cannot be null.");
        }
        this.executorService = scheduledExecutorService;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void init(C6473a c6473a) {
        if (c6473a == null) {
            throw new IllegalArgumentException("ClientComms cannot be null.");
        }
        this.comms = c6473a;
        this.clientid = c6473a.B().getClientId();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void schedule(long j10) {
        this.scheduledFuture = this.executorService.schedule(new PingRunnable(this, null), j10, TimeUnit.MILLISECONDS);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void start() {
        this.log.fine(CLASS_NAME, "start", "659", new Object[]{this.clientid});
        schedule(this.comms.C());
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void stop() {
        this.log.fine(CLASS_NAME, "stop", "661", null);
        ScheduledFuture scheduledFuture = this.scheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }
}
