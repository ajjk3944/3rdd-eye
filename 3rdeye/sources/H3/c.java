package h3;

import androidx.work.s;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f38197b;

    /* renamed from: c, reason: collision with root package name */
    public int f38198c;

    public c(InputStream inputStream, long j4) {
        super(inputStream);
        this.f38197b = j4;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.f38198c += i;
            return;
        }
        long j4 = this.f38198c;
        long j10 = this.f38197b;
        if (j10 - j4 <= 0) {
            return;
        }
        StringBuilder sbJ = s.j("Failed to read all expected data, expected: ", ", but read: ", j10);
        sbJ.append(this.f38198c);
        throw new IOException(sbJ.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f38197b - this.f38198c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        i11 = super.read(bArr, i, i10);
        a(i11);
        return i11;
    }
}
