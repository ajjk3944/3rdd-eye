package nj;

import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes3.dex */
public class p extends MqttMessage {
    public void a(int i10) {
        super.setId(i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttMessage
    public void setDuplicate(boolean z10) {
        super.setDuplicate(z10);
    }
}
