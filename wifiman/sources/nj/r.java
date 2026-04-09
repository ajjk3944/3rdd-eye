package nj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes3.dex */
public class r extends u {

    /* renamed from: g, reason: collision with root package name */
    private String[] f54855g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f54856h;

    /* renamed from: i, reason: collision with root package name */
    private int f54857i;

    public r(byte b10, byte[] bArr) throws IOException {
        super((byte) 8);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        boolean z10 = false;
        this.f54857i = 0;
        this.f54855g = new String[10];
        this.f54856h = new int[10];
        while (!z10) {
            try {
                this.f54855g[this.f54857i] = u.d(dataInputStream);
                int[] iArr = this.f54856h;
                int i10 = this.f54857i;
                this.f54857i = i10 + 1;
                iArr[i10] = dataInputStream.readByte();
            } catch (Exception unused) {
                z10 = true;
            }
        }
        dataInputStream.close();
    }

    @Override // nj.u
    protected byte k() {
        return (byte) ((this.f54864c ? 8 : 0) | 2);
    }

    @Override // nj.u
    public byte[] l() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i10 = 0;
            while (true) {
                String[] strArr = this.f54855g;
                if (i10 >= strArr.length) {
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                u.g(dataOutputStream, strArr[i10]);
                dataOutputStream.writeByte(this.f54856h[i10]);
                i10++;
            }
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // nj.u
    protected byte[] o() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.f54863b);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    @Override // nj.u
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" names:[");
        for (int i10 = 0; i10 < this.f54857i; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"");
            stringBuffer.append(this.f54855g[i10]);
            stringBuffer.append("\"");
        }
        stringBuffer.append("] qos:[");
        for (int i11 = 0; i11 < this.f54857i; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f54856h[i11]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public r(String[] strArr, int[] iArr) {
        super((byte) 8);
        if (strArr != null && iArr != null) {
            this.f54855g = (String[]) strArr.clone();
            int[] iArr2 = (int[]) iArr.clone();
            this.f54856h = iArr2;
            if (this.f54855g.length == iArr2.length) {
                this.f54857i = strArr.length;
                for (int i10 : iArr) {
                    MqttMessage.validateQos(i10);
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
