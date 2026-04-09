package nj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: e, reason: collision with root package name */
    protected static final Charset f54860e = StandardCharsets.UTF_8;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f54861f = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    /* renamed from: a, reason: collision with root package name */
    private byte f54862a;

    /* renamed from: d, reason: collision with root package name */
    private MqttToken f54865d;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f54864c = false;

    /* renamed from: b, reason: collision with root package name */
    protected int f54863b = 0;

    public u(byte b10) {
        this.f54862a = b10;
    }

    private static u a(InputStream inputStream) throws MqttException, IOException {
        try {
            DataInputStream dataInputStream = new DataInputStream(new C6995a(inputStream));
            int unsignedByte = dataInputStream.readUnsignedByte();
            byte b10 = (byte) (unsignedByte >> 4);
            byte b11 = (byte) (unsignedByte & 15);
            long jA = (r0.a() + q(dataInputStream).a()) - r0.a();
            byte[] bArr = new byte[0];
            if (jA > 0) {
                int i10 = (int) jA;
                byte[] bArr2 = new byte[i10];
                dataInputStream.readFully(bArr2, 0, i10);
                bArr = bArr2;
            }
            if (b10 == 1) {
                return new C6998d(b11, bArr);
            }
            if (b10 == 3) {
                return new o(b11, bArr);
            }
            if (b10 == 4) {
                return new k(b11, bArr);
            }
            if (b10 == 7) {
                return new l(b11, bArr);
            }
            if (b10 == 2) {
                return new C6997c(b11, bArr);
            }
            if (b10 == 12) {
                return new i(b11, bArr);
            }
            if (b10 == 13) {
                return new j(b11, bArr);
            }
            if (b10 == 8) {
                return new r(b11, bArr);
            }
            if (b10 == 9) {
                return new q(b11, bArr);
            }
            if (b10 == 10) {
                return new t(b11, bArr);
            }
            if (b10 == 11) {
                return new s(b11, bArr);
            }
            if (b10 == 6) {
                return new n(b11, bArr);
            }
            if (b10 == 5) {
                return new m(b11, bArr);
            }
            if (b10 == 14) {
                return new C6999e(b11, bArr);
            }
            throw kj.i.a(6);
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public static u b(MqttPersistable mqttPersistable) throws MqttPersistenceException {
        byte[] payloadBytes = mqttPersistable.getPayloadBytes();
        if (payloadBytes == null) {
            payloadBytes = new byte[0];
        }
        return a(new v(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength(), payloadBytes, mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength()));
    }

    public static u c(byte[] bArr) {
        return a(new ByteArrayInputStream(bArr));
    }

    public static String d(DataInputStream dataInputStream) throws MqttException, IOException {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            String str = new String(bArr, f54860e);
            u(str);
            return str;
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public static byte[] e(long j10) {
        v((int) j10);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        do {
            byte b10 = (byte) (j10 % 128);
            j10 /= 128;
            if (j10 > 0) {
                b10 = (byte) (b10 | 128);
            }
            byteArrayOutputStream.write(b10);
            i10++;
            if (j10 <= 0) {
                break;
            }
        } while (i10 < 4);
        return byteArrayOutputStream.toByteArray();
    }

    public static void g(DataOutputStream dataOutputStream, String str) throws MqttException, IOException {
        u(str);
        try {
            byte[] bytes = str.getBytes(f54860e);
            byte length = (byte) ((bytes.length >>> 8) & 255);
            byte length2 = (byte) (bytes.length & 255);
            dataOutputStream.write(length);
            dataOutputStream.write(length2);
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e10) {
            throw new MqttException(e10);
        } catch (IOException e11) {
            throw new MqttException(e11);
        }
    }

    public static w q(DataInputStream dataInputStream) throws IOException {
        byte b10;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        do {
            b10 = dataInputStream.readByte();
            i10++;
            i11 += (b10 & 127) * i12;
            i12 *= 128;
        } while ((b10 & 128) != 0);
        if (i11 >= 0 && i11 <= 268435455) {
            return new w(i11, i10);
        }
        throw new IOException("This property must be a number between 0 and 268435455. Read value was: " + i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r1
  0x003c: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v7 int) binds: [B:25:0x004e, B:29:0x0057, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(java.lang.String r7) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.length()
            if (r1 < r2) goto L9
            return
        L9:
            char r2 = r7.charAt(r1)
            boolean r3 = java.lang.Character.isHighSurrogate(r2)
            r4 = 65534(0xfffe, float:9.1833E-41)
            r5 = 1
            if (r3 == 0) goto L3e
            int r1 = r1 + 1
            int r3 = r7.length()
            if (r1 != r3) goto L21
        L1f:
            r3 = r5
            goto L5a
        L21:
            char r3 = r7.charAt(r1)
            boolean r6 = java.lang.Character.isLowSurrogate(r3)
            if (r6 == 0) goto L2c
            goto L1f
        L2c:
            r6 = r2 & 1023(0x3ff, float:1.434E-42)
            int r6 = r6 << 10
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r3 = r3 | r6
            r6 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r6
            if (r3 == r6) goto L1f
            if (r3 != r4) goto L3c
            goto L1f
        L3c:
            r3 = r0
            goto L5a
        L3e:
            boolean r3 = java.lang.Character.isISOControl(r2)
            if (r3 != 0) goto L1f
            boolean r3 = java.lang.Character.isLowSurrogate(r2)
            if (r3 == 0) goto L4b
            goto L1f
        L4b:
            r3 = 64976(0xfdd0, float:9.1051E-41)
            if (r2 < r3) goto L3c
            if (r2 == r4) goto L1f
            if (r2 >= r3) goto L1f
            r3 = 64991(0xfddf, float:9.1072E-41)
            if (r2 > r3) goto L3c
            goto L1f
        L5a:
            if (r3 != 0) goto L5e
            int r1 = r1 + r5
            goto L2
        L5e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Invalid UTF-8 char: [%x]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.u.u(java.lang.String):void");
    }

    public static void v(int i10) {
        if (i10 < 0 || i10 > 268435455) {
            throw new IllegalArgumentException("This property must be a number between 0 and 268435455");
        }
    }

    protected byte[] f() throws MqttException, IOException {
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

    public byte[] h() throws MqttException, IOException {
        try {
            int iN = ((n() & 15) << 4) ^ (k() & 15);
            byte[] bArrO = o();
            int length = bArrO.length + l().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(iN);
            dataOutputStream.write(e(length));
            dataOutputStream.write(bArrO);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public String i() {
        return Integer.toString(j());
    }

    public int j() {
        return this.f54863b;
    }

    protected abstract byte k();

    public byte[] l() {
        return new byte[0];
    }

    public MqttToken m() {
        return this.f54865d;
    }

    public byte n() {
        return this.f54862a;
    }

    protected abstract byte[] o();

    public boolean p() {
        return true;
    }

    public void r(boolean z10) {
        this.f54864c = z10;
    }

    public void s(int i10) {
        this.f54863b = i10;
    }

    public void t(MqttToken mqttToken) {
        this.f54865d = mqttToken;
    }

    public String toString() {
        return f54861f[this.f54862a];
    }
}
