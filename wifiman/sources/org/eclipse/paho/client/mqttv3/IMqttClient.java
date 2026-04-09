package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public interface IMqttClient extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close() throws MqttException;

    void connect() throws MqttException;

    void connect(MqttConnectOptions mqttConnectOptions) throws MqttException;

    IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions) throws MqttException;

    void disconnect() throws MqttException;

    void disconnect(long j10) throws MqttException;

    void disconnectForcibly() throws MqttException;

    void disconnectForcibly(long j10) throws MqttException;

    void disconnectForcibly(long j10, long j11) throws MqttException;

    String getClientId();

    IMqttDeliveryToken[] getPendingDeliveryTokens();

    String getServerURI();

    MqttTopic getTopic(String str);

    boolean isConnected();

    void messageArrivedComplete(int i10, int i11) throws MqttException;

    void publish(String str, MqttMessage mqttMessage) throws MqttException;

    void publish(String str, byte[] bArr, int i10, boolean z10) throws MqttException;

    void reconnect() throws MqttException;

    void setCallback(MqttCallback mqttCallback);

    void setManualAcks(boolean z10);

    void subscribe(String str) throws MqttException;

    void subscribe(String str, int i10) throws MqttException;

    void subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) throws MqttException;

    void subscribe(String str, IMqttMessageListener iMqttMessageListener) throws MqttException;

    void subscribe(String[] strArr) throws MqttException;

    void subscribe(String[] strArr, int[] iArr) throws MqttException;

    void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken subscribeWithResponse(String str) throws MqttException;

    IMqttToken subscribeWithResponse(String str, int i10) throws MqttException;

    IMqttToken subscribeWithResponse(String str, int i10, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException;

    void unsubscribe(String str) throws MqttException;

    void unsubscribe(String[] strArr) throws MqttException;
}
