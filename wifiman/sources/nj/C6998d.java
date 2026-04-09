package nj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.snmp4j.asn1.BER;

/* renamed from: nj.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6998d extends u {

    /* renamed from: g, reason: collision with root package name */
    private String f54831g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f54832h;

    /* renamed from: i, reason: collision with root package name */
    private MqttMessage f54833i;

    /* renamed from: j, reason: collision with root package name */
    private String f54834j;

    /* renamed from: k, reason: collision with root package name */
    private char[] f54835k;

    /* renamed from: l, reason: collision with root package name */
    private int f54836l;

    /* renamed from: m, reason: collision with root package name */
    private String f54837m;

    /* renamed from: n, reason: collision with root package name */
    private int f54838n;

    public C6998d(byte b10, byte[] bArr) throws MqttException, IOException {
        super((byte) 1);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        u.d(dataInputStream);
        dataInputStream.readByte();
        dataInputStream.readByte();
        this.f54836l = dataInputStream.readUnsignedShort();
        this.f54831g = u.d(dataInputStream);
        dataInputStream.close();
    }

    @Override // nj.u
    public String i() {
        return "Con";
    }

    @Override // nj.u
    protected byte k() {
        return (byte) 0;
    }

    @Override // nj.u
    public byte[] l() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            u.g(dataOutputStream, this.f54831g);
            if (this.f54833i != null) {
                u.g(dataOutputStream, this.f54837m);
                dataOutputStream.writeShort(this.f54833i.getPayload().length);
                dataOutputStream.write(this.f54833i.getPayload());
            }
            String str = this.f54834j;
            if (str != null) {
                u.g(dataOutputStream, str);
                char[] cArr = this.f54835k;
                if (cArr != null) {
                    u.g(dataOutputStream, new String(cArr));
                }
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // nj.u
    protected byte[] o() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i10 = this.f54838n;
            if (i10 == 3) {
                u.g(dataOutputStream, "MQIsdp");
            } else if (i10 == 4) {
                u.g(dataOutputStream, "MQTT");
            }
            dataOutputStream.write(this.f54838n);
            byte qos = this.f54832h ? (byte) 2 : (byte) 0;
            MqttMessage mqttMessage = this.f54833i;
            if (mqttMessage != null) {
                qos = (byte) (((byte) (qos | 4)) | (mqttMessage.getQos() << 3));
                if (this.f54833i.isRetained()) {
                    qos = (byte) (qos | BER.ASN_CONSTRUCTOR);
                }
            }
            if (this.f54834j != null) {
                qos = (byte) (qos | 128);
                if (this.f54835k != null) {
                    qos = (byte) (qos | 64);
                }
            }
            dataOutputStream.write(qos);
            dataOutputStream.writeShort(this.f54836l);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // nj.u
    public boolean p() {
        return false;
    }

    @Override // nj.u
    public String toString() {
        return String.valueOf(super.toString()) + " clientId " + this.f54831g + " keepAliveInterval " + this.f54836l;
    }

    public C6998d(String str, int i10, boolean z10, int i11, String str2, char[] cArr, MqttMessage mqttMessage, String str3) {
        super((byte) 1);
        this.f54831g = str;
        this.f54832h = z10;
        this.f54836l = i11;
        this.f54834j = str2;
        if (cArr != null) {
            this.f54835k = (char[]) cArr.clone();
        }
        this.f54833i = mqttMessage;
        this.f54837m = str3;
        this.f54838n = i10;
    }
}
