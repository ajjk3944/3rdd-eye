package le;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements Closeable {
    public static final Logger g = Logger.getLogger(l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f28725a;

    /* renamed from: b, reason: collision with root package name */
    public int f28726b;

    /* renamed from: c, reason: collision with root package name */
    public int f28727c;

    /* renamed from: d, reason: collision with root package name */
    public i f28728d;

    /* renamed from: e, reason: collision with root package name */
    public i f28729e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f28730f;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f28730f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {Buffer.SEGMENTING_THRESHOLD, 0, 0, 0};
                int i4 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    N(i4, iArr[i10], bArr2);
                    i4 += 4;
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
        this.f28725a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iW = w(0, bArr);
        this.f28726b = iW;
        if (iW > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f28726b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f28727c = w(4, bArr);
        int iW2 = w(8, bArr);
        int iW3 = w(12, bArr);
        this.f28728d = v(iW2);
        this.f28729e = v(iW3);
    }

    public static void N(int i4, int i10, byte[] bArr) {
        bArr[i4] = (byte) (i10 >> 24);
        bArr[i4 + 1] = (byte) (i10 >> 16);
        bArr[i4 + 2] = (byte) (i10 >> 8);
        bArr[i4 + 3] = (byte) i10;
    }

    public static int w(int i4, byte[] bArr) {
        return ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    public final void A(int i4, byte[] bArr, int i10, int i11) throws IOException {
        int iG = G(i4);
        int i12 = iG + i11;
        int i13 = this.f28726b;
        RandomAccessFile randomAccessFile = this.f28725a;
        if (i12 <= i13) {
            randomAccessFile.seek(iG);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iG;
        randomAccessFile.seek(iG);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void E(int i4, int i10, byte[] bArr) throws IOException {
        int iG = G(i4);
        int i11 = iG + i10;
        int i12 = this.f28726b;
        RandomAccessFile randomAccessFile = this.f28725a;
        if (i11 <= i12) {
            randomAccessFile.seek(iG);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - iG;
        randomAccessFile.seek(iG);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int F() {
        if (this.f28727c == 0) {
            return 16;
        }
        i iVar = this.f28729e;
        int i4 = iVar.f28720a;
        int i10 = this.f28728d.f28720a;
        return i4 >= i10 ? (i4 - i10) + 4 + iVar.f28721b + 16 : (((i4 + 4) + iVar.f28721b) + this.f28726b) - i10;
    }

    public final int G(int i4) {
        int i10 = this.f28726b;
        return i4 < i10 ? i4 : (i4 + 16) - i10;
    }

    public final void L(int i4, int i10, int i11, int i12) throws IOException {
        int[] iArr = {i4, i10, i11, i12};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f28730f;
            if (i13 >= 4) {
                RandomAccessFile randomAccessFile = this.f28725a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                N(i14, iArr[i13], bArr);
                i14 += 4;
                i13++;
            }
        }
    }

    public final void c(byte[] bArr) {
        int iG;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    g(length);
                    boolean zP = p();
                    if (zP) {
                        iG = 16;
                    } else {
                        i iVar = this.f28729e;
                        iG = G(iVar.f28720a + 4 + iVar.f28721b);
                    }
                    i iVar2 = new i(iG, length);
                    N(0, length, this.f28730f);
                    E(iG, 4, this.f28730f);
                    E(iG + 4, length, bArr);
                    L(this.f28726b, this.f28727c + 1, zP ? iG : this.f28728d.f28720a, iG);
                    this.f28729e = iVar2;
                    this.f28727c++;
                    if (zP) {
                        this.f28728d = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f28725a.close();
    }

    public final synchronized void e() {
        L(Buffer.SEGMENTING_THRESHOLD, 0, 0, 0);
        this.f28727c = 0;
        i iVar = i.f28719c;
        this.f28728d = iVar;
        this.f28729e = iVar;
        if (this.f28726b > 4096) {
            RandomAccessFile randomAccessFile = this.f28725a;
            randomAccessFile.setLength(Buffer.SEGMENTING_THRESHOLD);
            randomAccessFile.getChannel().force(true);
        }
        this.f28726b = Buffer.SEGMENTING_THRESHOLD;
    }

    public final void g(int i4) throws IOException {
        int i10 = i4 + 4;
        int iF = this.f28726b - F();
        if (iF >= i10) {
            return;
        }
        int i11 = this.f28726b;
        do {
            iF += i11;
            i11 <<= 1;
        } while (iF < i10);
        RandomAccessFile randomAccessFile = this.f28725a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        i iVar = this.f28729e;
        int iG = G(iVar.f28720a + 4 + iVar.f28721b);
        if (iG < this.f28728d.f28720a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f28726b);
            long j = iG - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f28729e.f28720a;
        int i13 = this.f28728d.f28720a;
        if (i12 < i13) {
            int i14 = (this.f28726b + i12) - 16;
            L(i11, this.f28727c, i13, i14);
            this.f28729e = new i(i14, this.f28729e.f28721b);
        } else {
            L(i11, this.f28727c, i13, i12);
        }
        this.f28726b = i11;
    }

    public final synchronized void m(k kVar) {
        int iG = this.f28728d.f28720a;
        for (int i4 = 0; i4 < this.f28727c; i4++) {
            i iVarV = v(iG);
            kVar.b(new j(this, iVarV), iVarV.f28721b);
            iG = G(iVarV.f28720a + 4 + iVarV.f28721b);
        }
    }

    public final synchronized boolean p() {
        return this.f28727c == 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f28726b);
        sb2.append(", size=");
        sb2.append(this.f28727c);
        sb2.append(", first=");
        sb2.append(this.f28728d);
        sb2.append(", last=");
        sb2.append(this.f28729e);
        sb2.append(", element lengths=[");
        try {
            m(new a4.d((Object) sb2, (byte) 0));
        } catch (IOException e2) {
            g.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final i v(int i4) throws IOException {
        if (i4 == 0) {
            return i.f28719c;
        }
        RandomAccessFile randomAccessFile = this.f28725a;
        randomAccessFile.seek(i4);
        return new i(i4, randomAccessFile.readInt());
    }

    public final synchronized void y() {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.f28727c == 1) {
                e();
            } else {
                i iVar = this.f28728d;
                int iG = G(iVar.f28720a + 4 + iVar.f28721b);
                A(iG, this.f28730f, 0, 4);
                int iW = w(0, this.f28730f);
                L(this.f28726b, this.f28727c - 1, iG, this.f28729e.f28720a);
                this.f28727c--;
                this.f28728d = new i(iG, iW);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
