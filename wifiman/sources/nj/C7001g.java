package nj;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kj.C6474b;
import org.eclipse.paho.client.mqttv3.MqttException;

/* renamed from: nj.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7001g extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    private static final String f54847d = "nj.g";

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f54848a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f54847d);

    /* renamed from: b, reason: collision with root package name */
    private C6474b f54849b;

    /* renamed from: c, reason: collision with root package name */
    private BufferedOutputStream f54850c;

    public C7001g(C6474b c6474b, OutputStream outputStream) {
        this.f54849b = c6474b;
        this.f54850c = new BufferedOutputStream(outputStream);
    }

    public void a(u uVar) throws MqttException, IOException {
        byte[] bArrH = uVar.h();
        byte[] bArrL = uVar.l();
        int i10 = 0;
        this.f54850c.write(bArrH, 0, bArrH.length);
        this.f54849b.D(bArrH.length);
        while (i10 < bArrL.length) {
            int iMin = Math.min(1024, bArrL.length - i10);
            this.f54850c.write(bArrL, i10, iMin);
            i10 += 1024;
            this.f54849b.D(iMin);
        }
        this.f54848a.fine(f54847d, "write", "529", new Object[]{uVar});
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54850c.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f54850c.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f54850c.write(bArr);
        this.f54849b.D(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f54850c.write(bArr, i10, i11);
        this.f54849b.D(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f54850c.write(i10);
    }
}
