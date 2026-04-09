package nj;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import kj.C6474b;
import org.eclipse.paho.client.mqttv3.MqttException;

/* renamed from: nj.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7000f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final String f54839a;

    /* renamed from: b, reason: collision with root package name */
    private final org.eclipse.paho.client.mqttv3.logging.a f54840b;

    /* renamed from: c, reason: collision with root package name */
    private C6474b f54841c;

    /* renamed from: d, reason: collision with root package name */
    private DataInputStream f54842d;

    /* renamed from: e, reason: collision with root package name */
    private ByteArrayOutputStream f54843e;

    /* renamed from: f, reason: collision with root package name */
    private int f54844f;

    /* renamed from: g, reason: collision with root package name */
    private int f54845g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f54846h;

    public C7000f(C6474b c6474b, InputStream inputStream) {
        String name = C7000f.class.getName();
        this.f54839a = name;
        this.f54840b = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", name);
        this.f54841c = c6474b;
        this.f54842d = new DataInputStream(inputStream);
        this.f54843e = new ByteArrayOutputStream();
        this.f54844f = -1;
    }

    private void a() throws IOException {
        int size = this.f54843e.size();
        int i10 = this.f54845g;
        int i11 = size + i10;
        int i12 = this.f54844f - i10;
        if (i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i13 = 0;
        while (i13 < i12) {
            try {
                int i14 = this.f54842d.read(this.f54846h, i11 + i13, i12 - i13);
                if (i14 < 0) {
                    throw new EOFException();
                }
                this.f54841c.z(i14);
                i13 += i14;
            } catch (SocketTimeoutException e10) {
                this.f54845g += i13;
                throw e10;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f54842d.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54842d.close();
    }

    public u g() throws MqttException, IOException {
        try {
            if (this.f54844f < 0) {
                this.f54843e.reset();
                byte b10 = this.f54842d.readByte();
                this.f54841c.z(1);
                byte b11 = (byte) ((b10 >>> 4) & 15);
                if (b11 < 1 || b11 > 14) {
                    throw kj.i.a(32108);
                }
                this.f54844f = u.q(this.f54842d).a();
                this.f54843e.write(b10);
                this.f54843e.write(u.e(this.f54844f));
                this.f54846h = new byte[this.f54843e.size() + this.f54844f];
                this.f54845g = 0;
            }
            if (this.f54844f < 0) {
                return null;
            }
            a();
            this.f54844f = -1;
            byte[] byteArray = this.f54843e.toByteArray();
            System.arraycopy(byteArray, 0, this.f54846h, 0, byteArray.length);
            u uVarC = u.c(this.f54846h);
            this.f54840b.fine(this.f54839a, "readMqttWireMessage", "301", new Object[]{uVarC});
            return uVarC;
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f54842d.read();
    }
}
