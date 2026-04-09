package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class Q4 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10569a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10570b;

    public Q4(J4 j42, int i) {
        this.f10570b = j42;
        ((ByteArrayOutputStream) this).buf = j42.l(Math.max(i, 256));
    }

    private final synchronized void a(int i) {
        d(1);
        super.write(i);
    }

    private final synchronized void b(int i, int i3, byte[] bArr) {
        d(i3);
        super.write(bArr, i, i3);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f10569a) {
            case 0:
                ((J4) this.f10570b).p(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void d(int i) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        J4 j42 = (J4) this.f10570b;
        int i6 = i3 + i;
        byte[] bArrL = j42.l(i6 + i6);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrL, 0, ((ByteArrayOutputStream) this).count);
        j42.p(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrL;
    }

    public void finalize() throws Throwable {
        switch (this.f10569a) {
            case 0:
                ((J4) this.f10570b).p(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f10569a) {
            case 1:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((j1.d) this.f10570b).f21315b.name());
                } catch (UnsupportedEncodingException e6) {
                    throw new AssertionError(e6);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.f10569a) {
            case 0:
                a(i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i3) {
        switch (this.f10569a) {
            case 0:
                b(i, i3, bArr);
                break;
            default:
                super.write(bArr, i, i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(j1.d dVar, int i) {
        super(i);
        this.f10570b = dVar;
    }
}
