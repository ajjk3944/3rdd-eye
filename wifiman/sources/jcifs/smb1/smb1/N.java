package jcifs.smb1.smb1;

import f.AbstractC5487d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import jcifs.smb1.util.transport.TransportException;

/* loaded from: classes4.dex */
public class N extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f50406a;

    /* renamed from: b, reason: collision with root package name */
    private int f50407b;

    /* renamed from: c, reason: collision with root package name */
    private int f50408c;

    /* renamed from: d, reason: collision with root package name */
    private int f50409d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f50410e;

    /* renamed from: f, reason: collision with root package name */
    M f50411f;

    public N(String str) {
        this(new M(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        return (int) (r10 - r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(byte[] r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.N.a(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        M m10 = this.f50411f;
        if (m10.f50401q != 16) {
            return 0;
        }
        try {
            AbstractC5487d.a(m10);
            throw null;
        } catch (SmbException e10) {
            throw g(e10);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f50411f.b();
            this.f50410e = null;
        } catch (SmbException e10) {
            throw g(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected IOException g(SmbException smbException) {
        Throwable thG = smbException.g();
        SmbException smbException2 = smbException;
        if (thG instanceof TransportException) {
            TransportException transportException = (TransportException) thG;
            thG = transportException.a();
            smbException2 = transportException;
        }
        if (!(thG instanceof InterruptedException)) {
            return smbException2;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(thG.getMessage());
        interruptedIOException.initCause(thG);
        return interruptedIOException;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f50410e, 0, 1) == -1) {
            return -1;
        }
        return this.f50410e[0] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        this.f50406a += j10;
        return j10;
    }

    public N(M m10) {
        this(m10, 1);
    }

    N(M m10, int i10) {
        this.f50410e = new byte[1];
        this.f50411f = m10;
        this.f50408c = i10 & 65535;
        int i11 = 65535 & (i10 >>> 16);
        this.f50409d = i11;
        if (m10.f50401q != 16) {
            m10.t(i10, i11, 128, 0);
            this.f50408c &= -81;
        } else {
            m10.e();
        }
        Q q10 = m10.f50398n.f50492f.f50437h;
        this.f50407b = Math.min(q10.f50467z - 70, q10.f50463v.f50469b - 70);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(bArr, i10, i11);
    }
}
