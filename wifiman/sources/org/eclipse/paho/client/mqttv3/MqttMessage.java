package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public class MqttMessage {
    private int messageId;
    private byte[] payload;
    private boolean mutable = true;
    private int qos = 1;
    private boolean retained = false;
    private boolean dup = false;

    public MqttMessage() throws IllegalStateException {
        setPayload(new byte[0]);
    }

    public static void validateQos(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException();
        }
    }

    protected void checkMutable() throws IllegalStateException {
        if (!this.mutable) {
            throw new IllegalStateException();
        }
    }

    public void clearPayload() throws IllegalStateException {
        checkMutable();
        this.payload = new byte[0];
    }

    public int getId() {
        return this.messageId;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getQos() {
        return this.qos;
    }

    public boolean isDuplicate() {
        return this.dup;
    }

    public boolean isRetained() {
        return this.retained;
    }

    protected void setDuplicate(boolean z10) {
        this.dup = z10;
    }

    public void setId(int i10) {
        this.messageId = i10;
    }

    protected void setMutable(boolean z10) {
        this.mutable = z10;
    }

    public void setPayload(byte[] bArr) throws IllegalStateException {
        checkMutable();
        bArr.getClass();
        this.payload = (byte[]) bArr.clone();
    }

    public void setQos(int i10) throws IllegalStateException {
        checkMutable();
        validateQos(i10);
        this.qos = i10;
    }

    public void setRetained(boolean z10) throws IllegalStateException {
        checkMutable();
        this.retained = z10;
    }

    public String toString() {
        return new String(this.payload);
    }

    public MqttMessage(byte[] bArr) throws IllegalStateException {
        setPayload(bArr);
    }
}
