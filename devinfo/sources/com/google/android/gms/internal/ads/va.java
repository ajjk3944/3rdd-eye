package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class va extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17571a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17572b;

    public va(oa oaVar, int i4) {
        this.f17572b = oaVar;
        ((ByteArrayOutputStream) this).buf = oaVar.j(Math.max(i4, 256));
    }

    private final synchronized void c(int i4) {
        g(1);
        super.write(i4);
    }

    private final synchronized void e(int i4, int i10, byte[] bArr) {
        g(i10);
        super.write(bArr, i4, i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f17571a) {
            case 0:
                ((oa) this.f17572b).o(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f17571a) {
            case 0:
                ((oa) this.f17572b).o(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    public void g(int i4) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i4 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        oa oaVar = (oa) this.f17572b;
        int i11 = i10 + i4;
        byte[] bArrJ = oaVar.j(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrJ, 0, ((ByteArrayOutputStream) this).count);
        oaVar.o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrJ;
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f17571a) {
            case 1:
                int i4 = ((ByteArrayOutputStream) this).count;
                if (i4 > 0 && ((ByteArrayOutputStream) this).buf[i4 - 1] == 13) {
                    i4--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i4, ((v7.d) this.f17572b).f35969b.name());
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i4) {
        switch (this.f17571a) {
            case 0:
                c(i4);
                break;
            default:
                super.write(i4);
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i4, int i10) {
        switch (this.f17571a) {
            case 0:
                e(i4, i10, bArr);
                break;
            default:
                super.write(bArr, i4, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(v7.d dVar, int i4) {
        super(i4);
        this.f17572b = dVar;
    }
}
