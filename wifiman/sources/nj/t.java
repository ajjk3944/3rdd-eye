package nj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes3.dex */
public class t extends u {

    /* renamed from: g, reason: collision with root package name */
    private String[] f54858g;

    /* renamed from: h, reason: collision with root package name */
    private int f54859h;

    public t(String[] strArr) {
        super((byte) 10);
        if (strArr != null) {
            this.f54858g = (String[]) strArr.clone();
        }
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
            for (String str : this.f54858g) {
                u.g(dataOutputStream, str);
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
        for (int i10 = 0; i10 < this.f54859h; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"" + this.f54858g[i10] + "\"");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public t(byte b10, byte[] bArr) throws IOException {
        super((byte) 10);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f54863b = dataInputStream.readUnsignedShort();
        boolean z10 = false;
        this.f54859h = 0;
        this.f54858g = new String[10];
        while (!z10) {
            try {
                this.f54858g[this.f54859h] = u.d(dataInputStream);
            } catch (Exception unused) {
                z10 = true;
            }
        }
        dataInputStream.close();
    }
}
