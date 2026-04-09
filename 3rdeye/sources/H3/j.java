package h3;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f38213b;

    public j(d dVar) {
        super(dVar);
        this.f38213b = RecyclerView.UNDEFINED_DURATION;
    }

    public final long a(long j4) {
        int i = this.f38213b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j4 <= ((long) i)) ? j4 : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f38213b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void c(long j4) {
        int i = this.f38213b;
        if (i == Integer.MIN_VALUE || j4 == -1) {
            return;
        }
        this.f38213b = (int) (i - j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f38213b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f38213b = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        long jA = a(j4);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int iA = (int) a(i10);
        if (iA == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i, iA);
        c(i11);
        return i11;
    }
}
