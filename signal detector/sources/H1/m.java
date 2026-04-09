package H1;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f1774a;

    public m(e eVar) {
        super(eVar);
        this.f1774a = LinearLayoutManager.INVALID_OFFSET;
    }

    public final long a(long j6) {
        int i = this.f1774a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j6 <= ((long) i)) ? j6 : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f1774a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void b(long j6) {
        int i = this.f1774a;
        if (i == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f1774a = (int) (i - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f1774a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f1774a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jA = a(j6);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        int iA = (int) a(i3);
        if (iA == -1) {
            return -1;
        }
        int i6 = super.read(bArr, i, iA);
        b(i6);
        return i6;
    }
}
