package nj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes3.dex */
public class o extends h {

    /* renamed from: g, reason: collision with root package name */
    private MqttMessage f54851g;

    /* renamed from: h, reason: collision with root package name */
    private String f54852h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f54853i;

    public o(String str, MqttMessage mqttMessage) {
        super((byte) 3);
        this.f54853i = null;
        this.f54852h = str;
        this.f54851g = mqttMessage;
    }

    protected static byte[] w(MqttMessage mqttMessage) {
        return mqttMessage.getPayload();
    }

    @Override // nj.h, org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getPayloadLength() {
        try {
            return l().length;
        } catch (MqttException unused) {
            return 0;
        }
    }

    @Override // nj.u
    protected byte k() {
        byte qos = (byte) (this.f54851g.getQos() << 1);
        if (this.f54851g.isRetained()) {
            qos = (byte) (qos | 1);
        }
        return (this.f54851g.isDuplicate() || this.f54864c) ? (byte) (qos | 8) : qos;
    }

    @Override // nj.u
    public byte[] l() {
        if (this.f54853i == null) {
            this.f54853i = w(this.f54851g);
        }
        return this.f54853i;
    }

    @Override // nj.u
    protected byte[] o() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            u.g(dataOutputStream, this.f54852h);
            if (this.f54851g.getQos() > 0) {
                dataOutputStream.writeShort(this.f54863b);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // nj.u
    public boolean p() {
        return true;
    }

    @Override // nj.u
    public void s(int i10) {
        super.s(i10);
        MqttMessage mqttMessage = this.f54851g;
        if (mqttMessage instanceof p) {
            ((p) mqttMessage).a(i10);
        }
    }

    @Override // nj.u
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] payload = this.f54851g.getPayload();
        int iMin = Math.min(payload.length, 20);
        for (int i10 = 0; i10 < iMin; i10++) {
            String hexString = Integer.toHexString(payload[i10]);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString);
        }
        try {
            str = new String(payload, 0, iMin, "UTF-8");
        } catch (Exception unused) {
            str = "?";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(super.toString());
        stringBuffer2.append(" qos:");
        stringBuffer2.append(this.f54851g.getQos());
        if (this.f54851g.getQos() > 0) {
            stringBuffer2.append(" msgId:");
            stringBuffer2.append(this.f54863b);
        }
        stringBuffer2.append(" retained:");
        stringBuffer2.append(this.f54851g.isRetained());
        stringBuffer2.append(" dup:");
        stringBuffer2.append(this.f54864c);
        stringBuffer2.append(" topic:\"");
        stringBuffer2.append(this.f54852h);
        stringBuffer2.append("\"");
        stringBuffer2.append(" payload:[hex:");
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(" utf8:\"");
        stringBuffer2.append(str);
        stringBuffer2.append("\"");
        stringBuffer2.append(" length:");
        stringBuffer2.append(payload.length);
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public MqttMessage x() {
        return this.f54851g;
    }

    public String y() {
        return this.f54852h;
    }

    public o(byte b10, byte[] bArr) throws IllegalStateException, IOException {
        super((byte) 3);
        this.f54853i = null;
        p pVar = new p();
        this.f54851g = pVar;
        pVar.setQos(3 & (b10 >> 1));
        if ((b10 & 1) == 1) {
            this.f54851g.setRetained(true);
        }
        if ((b10 & 8) == 8) {
            ((p) this.f54851g).setDuplicate(true);
        }
        C6995a c6995a = new C6995a(new ByteArrayInputStream(bArr));
        DataInputStream dataInputStream = new DataInputStream(c6995a);
        this.f54852h = u.d(dataInputStream);
        if (this.f54851g.getQos() > 0) {
            this.f54863b = dataInputStream.readUnsignedShort();
        }
        byte[] bArr2 = new byte[bArr.length - c6995a.a()];
        dataInputStream.readFully(bArr2);
        dataInputStream.close();
        this.f54851g.setPayload(bArr2);
    }
}
