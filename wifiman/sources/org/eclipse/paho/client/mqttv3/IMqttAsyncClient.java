package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public interface IMqttAsyncClient extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close() throws MqttException;

    IMqttToken connect() throws MqttException;

    IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttToken connect(MqttConnectOptions mqttConnectOptions) throws MqttException;

    IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    void deleteBufferedMessage(int i10);

    IMqttToken disconnect() throws MqttException;

    IMqttToken disconnect(long j10) throws MqttException;

    IMqttToken disconnect(long j10, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    void disconnectForcibly() throws MqttException;

    void disconnectForcibly(long j10) throws MqttException;

    void disconnectForcibly(long j10, long j11) throws MqttException;

    MqttMessage getBufferedMessage(int i10);

    int getBufferedMessageCount();

    String getClientId();

    int getInFlightMessageCount();

    IMqttDeliveryToken[] getPendingDeliveryTokens();

    String getServerURI();

    boolean isConnected();

    void messageArrivedComplete(int i10, int i11) throws MqttException;

    IMqttDeliveryToken publish(String str, MqttMessage mqttMessage) throws MqttException;

    IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10) throws MqttException;

    IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    void reconnect() throws MqttException;

    boolean removeMessage(IMqttDeliveryToken iMqttDeliveryToken) throws MqttException;

    void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions);

    void setCallback(MqttCallback mqttCallback);

    void setManualAcks(boolean z10);

    IMqttToken subscribe(String str, int i10) throws MqttException;

    IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribe(String[] strArr, int[] iArr) throws MqttException;

    IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken unsubscribe(String str) throws MqttException;

    IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;

    IMqttToken unsubscribe(String[] strArr) throws MqttException;

    IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException;
}
