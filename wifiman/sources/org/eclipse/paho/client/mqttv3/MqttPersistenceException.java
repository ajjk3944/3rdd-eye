package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public class MqttPersistenceException extends MqttException {
    public static final short REASON_CODE_PERSISTENCE_IN_USE = 32200;
    private static final long serialVersionUID = 300;

    public MqttPersistenceException() {
        super(0);
    }

    public MqttPersistenceException(int i10) {
        super(i10);
    }

    public MqttPersistenceException(Throwable th2) {
        super(th2);
    }

    public MqttPersistenceException(int i10, Throwable th2) {
        super(i10, th2);
    }
}
