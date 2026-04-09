package kf;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class k implements Closeable {
    public static final Logger B = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f14318a;

    /* renamed from: d, reason: collision with root package name */
    public int f14319d;

    /* renamed from: g, reason: collision with root package name */
    public int f14320g;

    /* renamed from: r, reason: collision with root package name */
    public h f14321r;

    /* renamed from: x, reason: collision with root package name */
    public h f14322x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f14323y;

    public k(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f14323y = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    Z(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f14318a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iW = w(0, bArr);
        this.f14319d = iW;
        if (iW > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f14319d + ", Actual length: " + randomAccessFile2.length());
        }
        this.f14320g = w(4, bArr);
        int iW2 = w(8, bArr);
        int iW3 = w(12, bArr);
        this.f14321r = q(iW2);
        this.f14322x = q(iW3);
    }

    public static void Z(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static int w(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final void G(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iV = V(i10);
        int i13 = iV + i12;
        int i14 = this.f14319d;
        RandomAccessFile randomAccessFile = this.f14318a;
        if (i13 <= i14) {
            randomAccessFile.seek(iV);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iV;
        randomAccessFile.seek(iV);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void L(byte[] bArr, int i10, int i11) throws IOException {
        int iV = V(i10);
        int i12 = iV + i11;
        int i13 = this.f14319d;
        RandomAccessFile randomAccessFile = this.f14318a;
        if (i12 <= i13) {
            randomAccessFile.seek(iV);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iV;
        randomAccessFile.seek(iV);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int R() {
        if (this.f14320g == 0) {
            return 16;
        }
        h hVar = this.f14322x;
        int i10 = hVar.f14313a;
        int i11 = this.f14321r.f14313a;
        return i10 >= i11 ? (i10 - i11) + 4 + hVar.f14314b + 16 : (((i10 + 4) + hVar.f14314b) + this.f14319d) - i11;
    }

    public final int V(int i10) {
        int i11 = this.f14319d;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void Y(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f14323y;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f14318a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                Z(bArr, i15, iArr[i14]);
                i15 += 4;
                i14++;
            }
        }
    }

    public final void b(byte[] bArr) {
        int iV;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zI = i();
                    if (zI) {
                        iV = 16;
                    } else {
                        h hVar = this.f14322x;
                        iV = V(hVar.f14313a + 4 + hVar.f14314b);
                    }
                    h hVar2 = new h(iV, length);
                    Z(this.f14323y, 0, length);
                    L(this.f14323y, iV, 4);
                    L(bArr, iV + 4, length);
                    Y(this.f14319d, this.f14320g + 1, zI ? iV : this.f14321r.f14313a, iV);
                    this.f14322x = hVar2;
                    this.f14320g++;
                    if (zI) {
                        this.f14321r = hVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f14318a.close();
    }

    public final void f(int i10) throws IOException {
        int i11 = i10 + 4;
        int iR = this.f14319d - R();
        if (iR >= i11) {
            return;
        }
        int i12 = this.f14319d;
        do {
            iR += i12;
            i12 <<= 1;
        } while (iR < i11);
        RandomAccessFile randomAccessFile = this.f14318a;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f14322x;
        int iV = V(hVar.f14313a + 4 + hVar.f14314b);
        if (iV < this.f14321r.f14313a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f14319d);
            long j = iV - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f14322x.f14313a;
        int i14 = this.f14321r.f14313a;
        if (i13 < i14) {
            int i15 = (this.f14319d + i13) - 16;
            Y(i12, this.f14320g, i14, i15);
            this.f14322x = new h(i15, this.f14322x.f14314b);
        } else {
            Y(i12, this.f14320g, i14, i13);
        }
        this.f14319d = i12;
    }

    public final synchronized void h(j jVar) {
        int iV = this.f14321r.f14313a;
        for (int i10 = 0; i10 < this.f14320g; i10++) {
            h hVarQ = q(iV);
            jVar.d(new i(this, hVarQ), hVarQ.f14314b);
            iV = V(hVarQ.f14313a + 4 + hVarQ.f14314b);
        }
    }

    public final synchronized boolean i() {
        return this.f14320g == 0;
    }

    public final h q(int i10) throws IOException {
        if (i10 == 0) {
            return h.f14312c;
        }
        RandomAccessFile randomAccessFile = this.f14318a;
        randomAccessFile.seek(i10);
        return new h(i10, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f14319d);
        sb2.append(", size=");
        sb2.append(this.f14320g);
        sb2.append(", first=");
        sb2.append(this.f14321r);
        sb2.append(", last=");
        sb2.append(this.f14322x);
        sb2.append(", element lengths=[");
        try {
            h(new ab.g((Object) sb2, 8, false));
        } catch (IOException e4) {
            B.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final synchronized void y() {
        if (i()) {
            throw new NoSuchElementException();
        }
        if (this.f14320g == 1) {
            synchronized (this) {
                Y(4096, 0, 0, 0);
                this.f14320g = 0;
                h hVar = h.f14312c;
                this.f14321r = hVar;
                this.f14322x = hVar;
                if (this.f14319d > 4096) {
                    RandomAccessFile randomAccessFile = this.f14318a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f14319d = 4096;
            }
        } else {
            h hVar2 = this.f14321r;
            int iV = V(hVar2.f14313a + 4 + hVar2.f14314b);
            G(iV, 0, 4, this.f14323y);
            int iW = w(0, this.f14323y);
            Y(this.f14319d, this.f14320g - 1, iV, this.f14322x.f14313a);
            this.f14320g--;
            this.f14321r = new h(iV, iW);
        }
    }
}
