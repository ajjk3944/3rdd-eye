package t8;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f34515a;

    public j(e eVar) {
        super(eVar);
        this.f34515a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i4 = this.f34515a;
        return i4 == Integer.MIN_VALUE ? super.available() : Math.min(i4, super.available());
    }

    public final long c(long j) {
        int i4 = this.f34515a;
        if (i4 == 0) {
            return -1L;
        }
        return (i4 == Integer.MIN_VALUE || j <= ((long) i4)) ? j : i4;
    }

    public final void e(long j) {
        int i4 = this.f34515a;
        if (i4 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f34515a = (int) (i4 - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
        super.mark(i4);
        this.f34515a = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (c(1L) == -1) {
            return -1;
        }
        int i4 = super.read();
        e(1L);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f34515a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jC = c(j);
        if (jC == -1) {
            return 0L;
        }
        long jSkip = super.skip(jC);
        e(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int iC = (int) c(i10);
        if (iC == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i4, iC);
        e(i11);
        return i11;
    }
}
