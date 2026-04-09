package P4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f10614h = Logger.getLogger(h.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f10615b;

    /* renamed from: c, reason: collision with root package name */
    public int f10616c;

    /* renamed from: d, reason: collision with root package name */
    public int f10617d;

    /* renamed from: e, reason: collision with root package name */
    public b f10618e;

    /* renamed from: f, reason: collision with root package name */
    public b f10619f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f10620g;

    /* compiled from: QueueFile.java */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10621a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f10622b;

        public a(StringBuilder sb) {
            this.f10622b = sb;
        }

        @Override // P4.h.d
        public final void a(c cVar, int i) throws IOException {
            boolean z10 = this.f10621a;
            StringBuilder sb = this.f10622b;
            if (z10) {
                this.f10621a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    /* compiled from: QueueFile.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f10623c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f10624a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10625b;

        public b(int i, int i10) {
            this.f10624a = i;
            this.f10625b = i10;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f10624a);
            sb.append(", length = ");
            return B4.i.j(sb, this.f10625b, "]");
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void a(c cVar, int i) throws IOException;
    }

    public h(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f10620g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    m0(bArr2, i, iArr[i10]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f10615b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iN = n(bArr, 0);
        this.f10616c = iN;
        if (iN > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f10616c + ", Actual length: " + randomAccessFile2.length());
        }
        this.f10617d = n(bArr, 4);
        int iN2 = n(bArr, 8);
        int iN3 = n(bArr, 12);
        this.f10618e = l(iN2);
        this.f10619f = l(iN3);
    }

    public static void m0(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    public static int n(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final synchronized void A() throws IOException {
        try {
            if (k()) {
                throw new NoSuchElementException();
            }
            if (this.f10617d == 1) {
                c();
            } else {
                b bVar = this.f10618e;
                int iW = W(bVar.f10624a + 4 + bVar.f10625b);
                B(iW, this.f10620g, 0, 4);
                int iN = n(this.f10620g, 0);
                k0(this.f10616c, this.f10617d - 1, iW, this.f10619f.f10624a);
                this.f10617d--;
                this.f10618e = new b(iW, iN);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void B(int i, byte[] bArr, int i10, int i11) throws IOException {
        int iW = W(i);
        int i12 = iW + i11;
        int i13 = this.f10616c;
        RandomAccessFile randomAccessFile = this.f10615b;
        if (i12 <= i13) {
            randomAccessFile.seek(iW);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iW;
        randomAccessFile.seek(iW);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void D(int i, int i10, byte[] bArr) throws IOException {
        int iW = W(i);
        int i11 = iW + i10;
        int i12 = this.f10616c;
        RandomAccessFile randomAccessFile = this.f10615b;
        if (i11 <= i12) {
            randomAccessFile.seek(iW);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - iW;
        randomAccessFile.seek(iW);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int F() {
        if (this.f10617d == 0) {
            return 16;
        }
        b bVar = this.f10619f;
        int i = bVar.f10624a;
        int i10 = this.f10618e.f10624a;
        return i >= i10 ? (i - i10) + 4 + bVar.f10625b + 16 : (((i + 4) + bVar.f10625b) + this.f10616c) - i10;
    }

    public final int W(int i) {
        int i10 = this.f10616c;
        return i < i10 ? i : (i + 16) - i10;
    }

    public final void a(byte[] bArr) throws IOException {
        int iW;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    d(length);
                    boolean zK = k();
                    if (zK) {
                        iW = 16;
                    } else {
                        b bVar = this.f10619f;
                        iW = W(bVar.f10624a + 4 + bVar.f10625b);
                    }
                    b bVar2 = new b(iW, length);
                    m0(this.f10620g, 0, length);
                    D(iW, 4, this.f10620g);
                    D(iW + 4, length, bArr);
                    k0(this.f10616c, this.f10617d + 1, zK ? iW : this.f10618e.f10624a, iW);
                    this.f10619f = bVar2;
                    this.f10617d++;
                    if (zK) {
                        this.f10618e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() throws IOException {
        k0(4096, 0, 0, 0);
        this.f10617d = 0;
        b bVar = b.f10623c;
        this.f10618e = bVar;
        this.f10619f = bVar;
        if (this.f10616c > 4096) {
            RandomAccessFile randomAccessFile = this.f10615b;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f10616c = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f10615b.close();
    }

    public final void d(int i) throws IOException {
        int i10 = i + 4;
        int iF = this.f10616c - F();
        if (iF >= i10) {
            return;
        }
        int i11 = this.f10616c;
        do {
            iF += i11;
            i11 <<= 1;
        } while (iF < i10);
        RandomAccessFile randomAccessFile = this.f10615b;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        b bVar = this.f10619f;
        int iW = W(bVar.f10624a + 4 + bVar.f10625b);
        if (iW < this.f10618e.f10624a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f10616c);
            long j4 = iW - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f10619f.f10624a;
        int i13 = this.f10618e.f10624a;
        if (i12 < i13) {
            int i14 = (this.f10616c + i12) - 16;
            k0(i11, this.f10617d, i13, i14);
            this.f10619f = new b(i14, this.f10619f.f10625b);
        } else {
            k0(i11, this.f10617d, i13, i12);
        }
        this.f10616c = i11;
    }

    public final synchronized void e(d dVar) throws IOException {
        int iW = this.f10618e.f10624a;
        for (int i = 0; i < this.f10617d; i++) {
            b bVarL = l(iW);
            dVar.a(new c(bVarL), bVarL.f10625b);
            iW = W(bVarL.f10624a + 4 + bVarL.f10625b);
        }
    }

    public final synchronized boolean k() {
        return this.f10617d == 0;
    }

    public final void k0(int i, int i10, int i11, int i12) throws IOException {
        int[] iArr = {i, i10, i11, i12};
        byte[] bArr = this.f10620g;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            m0(bArr, i13, iArr[i14]);
            i13 += 4;
        }
        RandomAccessFile randomAccessFile = this.f10615b;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final b l(int i) throws IOException {
        if (i == 0) {
            return b.f10623c;
        }
        RandomAccessFile randomAccessFile = this.f10615b;
        randomAccessFile.seek(i);
        return new b(i, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f10616c);
        sb.append(", size=");
        sb.append(this.f10617d);
        sb.append(", first=");
        sb.append(this.f10618e);
        sb.append(", last=");
        sb.append(this.f10619f);
        sb.append(", element lengths=[");
        try {
            e(new a(sb));
        } catch (IOException e4) {
            f10614h.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* compiled from: QueueFile.java */
    public final class c extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public int f10626b;

        /* renamed from: c, reason: collision with root package name */
        public int f10627c;

        public c(b bVar) {
            this.f10626b = h.this.W(bVar.f10624a + 4);
            this.f10627c = bVar.f10625b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i10) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i10) < 0 || i10 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = this.f10627c;
            if (i11 <= 0) {
                return -1;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            int i12 = this.f10626b;
            h hVar = h.this;
            hVar.B(i12, bArr, i, i10);
            this.f10626b = hVar.W(this.f10626b + i10);
            this.f10627c -= i10;
            return i10;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f10627c == 0) {
                return -1;
            }
            h hVar = h.this;
            hVar.f10615b.seek(this.f10626b);
            int i = hVar.f10615b.read();
            this.f10626b = hVar.W(this.f10626b + 1);
            this.f10627c--;
            return i;
        }
    }
}
