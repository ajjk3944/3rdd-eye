package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Closeable, Iterable {
    public static final byte[] G = new byte[4096];
    public final byte[] B = new byte[32];
    public int D = 0;
    public final int E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f12148a;

    /* renamed from: d, reason: collision with root package name */
    public final File f12149d;

    /* renamed from: g, reason: collision with root package name */
    public long f12150g;

    /* renamed from: r, reason: collision with root package name */
    public int f12151r;

    /* renamed from: x, reason: collision with root package name */
    public g f12152x;

    /* renamed from: y, reason: collision with root package name */
    public g f12153y;

    public i(File file, RandomAccessFile randomAccessFile, int i10) throws IOException {
        this.f12149d = file;
        this.f12148a = randomAccessFile;
        this.E = i10;
        Z();
    }

    public static RandomAccessFile b(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public static int f0(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static long i0(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 56) + ((bArr[i10 + 1] & 255) << 48) + ((bArr[i10 + 2] & 255) << 40) + ((bArr[i10 + 3] & 255) << 32) + ((bArr[i10 + 4] & 255) << 24) + ((bArr[i10 + 5] & 255) << 16) + ((bArr[i10 + 6] & 255) << 8) + (bArr[i10 + 7] & 255);
    }

    public static void t0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void u0(int i10, long j, byte[] bArr) {
        bArr[i10] = (byte) (j >> 56);
        bArr[i10 + 1] = (byte) (j >> 48);
        bArr[i10 + 2] = (byte) (j >> 40);
        bArr[i10 + 3] = (byte) (j >> 32);
        bArr[i10 + 4] = (byte) (j >> 24);
        bArr[i10 + 5] = (byte) (j >> 16);
        bArr[i10 + 6] = (byte) (j >> 8);
        bArr[i10 + 7] = (byte) j;
    }

    public final g Y(long j) {
        if (j != 0) {
            byte[] bArr = this.B;
            if (p0(4, j, bArr)) {
                return new g(f0(0, bArr), j);
            }
        }
        return g.f12141c;
    }

    public final void Z() throws IOException {
        this.f12148a.seek(0L);
        RandomAccessFile randomAccessFile = this.f12148a;
        byte[] bArr = this.B;
        randomAccessFile.readFully(bArr);
        this.f12150g = i0(4, bArr);
        this.f12151r = f0(12, bArr);
        long jI0 = i0(16, bArr);
        long jI02 = i0(24, bArr);
        if (this.f12150g > this.f12148a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f12150g + ", Actual length: " + this.f12148a.length());
        }
        if (this.f12150g <= 32) {
            throw new IOException(c7.a.n(this.f12150g, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
        this.f12152x = Y(jI0);
        this.f12153y = Y(jI02);
    }

    public final void clear() throws IOException {
        if (this.F) {
            throw new IllegalStateException("closed");
        }
        s0(0, 4096L, 0L, 0L);
        this.f12148a.seek(32L);
        this.f12148a.write(G, 0, 4064);
        this.f12151r = 0;
        g gVar = g.f12141c;
        this.f12152x = gVar;
        this.f12153y = gVar;
        if (this.f12150g > 4096) {
            this.f12148a.setLength(4096L);
            this.f12148a.getChannel().force(true);
        }
        this.f12150g = 4096L;
        this.D++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.F = true;
        this.f12148a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }

    public final void n0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Cannot remove negative (", i10, ") number of elements."));
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f12151r;
        if (i10 == i11) {
            clear();
            return;
        }
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(h0.b.i(this.f12151r, ").", h0.b.u("Cannot remove more elements (", i10, ") than present in queue (")));
        }
        g gVar = this.f12152x;
        long j = gVar.f12142a;
        int iF0 = gVar.f12143b;
        long jR0 = j;
        long j7 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j7 += iF0 + 4;
            jR0 = r0(jR0 + 4 + iF0);
            byte[] bArr = this.B;
            if (!p0(4, jR0, bArr)) {
                return;
            }
            iF0 = f0(0, bArr);
        }
        s0(this.f12151r - i10, this.f12150g, jR0, this.f12153y.f12142a);
        this.f12151r -= i10;
        this.D++;
        this.f12152x = new g(iF0, jR0);
        while (j7 > 0) {
            int iMin = (int) Math.min(j7, 4096);
            q0(iMin, j, G);
            long j10 = iMin;
            j7 -= j10;
            j += j10;
        }
    }

    public final void o0() {
        this.f12148a.close();
        File file = this.f12149d;
        file.delete();
        this.f12148a = b(file);
        Z();
    }

    public final boolean p0(int i10, long j, byte[] bArr) throws IOException {
        try {
            long jR0 = r0(j);
            long j7 = i10 + jR0;
            long j10 = this.f12150g;
            if (j7 <= j10) {
                this.f12148a.seek(jR0);
                this.f12148a.readFully(bArr, 0, i10);
                return true;
            }
            int i11 = (int) (j10 - jR0);
            this.f12148a.seek(jR0);
            this.f12148a.readFully(bArr, 0, i11);
            this.f12148a.seek(32L);
            this.f12148a.readFully(bArr, i11, i10 - i11);
            return true;
        } catch (EOFException unused) {
            o0();
            return false;
        } catch (IOException e4) {
            throw e4;
        } catch (Throwable unused2) {
            o0();
            return false;
        }
    }

    public final void q0(int i10, long j, byte[] bArr) throws IOException {
        long jR0 = r0(j);
        long j7 = i10 + jR0;
        long j10 = this.f12150g;
        if (j7 <= j10) {
            this.f12148a.seek(jR0);
            this.f12148a.write(bArr, 0, i10);
            return;
        }
        int i11 = (int) (j10 - jR0);
        this.f12148a.seek(jR0);
        this.f12148a.write(bArr, 0, i11);
        this.f12148a.seek(32L);
        this.f12148a.write(bArr, i11, i10 - i11);
    }

    public final long r0(long j) {
        long j7 = this.f12150g;
        return j < j7 ? j : (j + 32) - j7;
    }

    public final void s0(int i10, long j, long j7, long j10) throws IOException {
        this.f12148a.seek(0L);
        byte[] bArr = this.B;
        t0(bArr, 0, -2147483647);
        u0(4, j, bArr);
        t0(bArr, 12, i10);
        u0(16, j7, bArr);
        u0(24, j10, bArr);
        this.f12148a.write(bArr, 0, 32);
    }

    public final String toString() {
        return "QueueFile{file=" + this.f12149d + ", zero=true, length=" + this.f12150g + ", size=" + this.f12151r + ", first=" + this.f12152x + ", last=" + this.f12153y + '}';
    }
}
