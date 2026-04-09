package M4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class h implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f12511g = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f12512a;

    /* renamed from: b, reason: collision with root package name */
    int f12513b;

    /* renamed from: c, reason: collision with root package name */
    private int f12514c;

    /* renamed from: d, reason: collision with root package name */
    private b f12515d;

    /* renamed from: e, reason: collision with root package name */
    private b f12516e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f12517f = new byte[16];

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f12518a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f12519b;

        a(StringBuilder sb2) {
            this.f12519b = sb2;
        }

        @Override // M4.h.d
        public void a(InputStream inputStream, int i10) {
            if (this.f12518a) {
                this.f12518a = false;
            } else {
                this.f12519b.append(", ");
            }
            this.f12519b.append(i10);
        }
    }

    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f12521c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f12522a;

        /* renamed from: b, reason: collision with root package name */
        final int f12523b;

        b(int i10, int i11) {
            this.f12522a = i10;
            this.f12523b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f12522a + ", length = " + this.f12523b + "]";
        }
    }

    private final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f12524a;

        /* renamed from: b, reason: collision with root package name */
        private int f12525b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.P(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f12525b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.m0(this.f12524a, bArr, i10, i11);
            this.f12524a = h.this.q0(this.f12524a + i11);
            this.f12525b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f12524a = h.this.q0(bVar.f12522a + 4);
            this.f12525b = bVar.f12523b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f12525b == 0) {
                return -1;
            }
            h.this.f12512a.seek(this.f12524a);
            int i10 = h.this.f12512a.read();
            this.f12524a = h.this.q0(this.f12524a + 1);
            this.f12525b--;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            C(file);
        }
        this.f12512a = S(file);
        Y();
    }

    private static void C(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileS = S(file2);
        try {
            randomAccessFileS.setLength(4096L);
            randomAccessFileS.seek(0L);
            byte[] bArr = new byte[16];
            t0(bArr, 4096, 0, 0, 0);
            randomAccessFileS.write(bArr);
            randomAccessFileS.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileS.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object P(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile S(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b T(int i10) throws IOException {
        if (i10 == 0) {
            return b.f12521c;
        }
        this.f12512a.seek(i10);
        return new b(i10, this.f12512a.readInt());
    }

    private void Y() throws IOException {
        this.f12512a.seek(0L);
        this.f12512a.readFully(this.f12517f);
        int iB0 = b0(this.f12517f, 0);
        this.f12513b = iB0;
        if (iB0 <= this.f12512a.length()) {
            this.f12514c = b0(this.f12517f, 4);
            int iB02 = b0(this.f12517f, 8);
            int iB03 = b0(this.f12517f, 12);
            this.f12515d = T(iB02);
            this.f12516e = T(iB03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f12513b + ", Actual length: " + this.f12512a.length());
    }

    private static int b0(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int d0() {
        return this.f12513b - p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iQ0 = q0(i10);
        int i13 = iQ0 + i12;
        int i14 = this.f12513b;
        if (i13 <= i14) {
            this.f12512a.seek(iQ0);
            this.f12512a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iQ0;
        this.f12512a.seek(iQ0);
        this.f12512a.readFully(bArr, i11, i15);
        this.f12512a.seek(16L);
        this.f12512a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void n0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iQ0 = q0(i10);
        int i13 = iQ0 + i12;
        int i14 = this.f12513b;
        if (i13 <= i14) {
            this.f12512a.seek(iQ0);
            this.f12512a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iQ0;
        this.f12512a.seek(iQ0);
        this.f12512a.write(bArr, i11, i15);
        this.f12512a.seek(16L);
        this.f12512a.write(bArr, i11 + i15, i12 - i15);
    }

    private void o0(int i10) throws IOException {
        this.f12512a.setLength(i10);
        this.f12512a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q0(int i10) {
        int i11 = this.f12513b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void r0(int i10, int i11, int i12, int i13) throws IOException {
        t0(this.f12517f, i10, i11, i12, i13);
        this.f12512a.seek(0L);
        this.f12512a.write(this.f12517f);
    }

    private static void s0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void t0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            s0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void v(int i10) throws IOException {
        int i11 = i10 + 4;
        int iD0 = d0();
        if (iD0 >= i11) {
            return;
        }
        int i12 = this.f12513b;
        do {
            iD0 += i12;
            i12 <<= 1;
        } while (iD0 < i11);
        o0(i12);
        b bVar = this.f12516e;
        int iQ0 = q0(bVar.f12522a + 4 + bVar.f12523b);
        if (iQ0 < this.f12515d.f12522a) {
            FileChannel channel = this.f12512a.getChannel();
            channel.position(this.f12513b);
            long j10 = iQ0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f12516e.f12522a;
        int i14 = this.f12515d.f12522a;
        if (i13 < i14) {
            int i15 = (this.f12513b + i13) - 16;
            r0(i12, this.f12514c, i14, i15);
            this.f12516e = new b(i15, this.f12516e.f12523b);
        } else {
            r0(i12, this.f12514c, i14, i13);
        }
        this.f12513b = i12;
    }

    public synchronized boolean J() {
        return this.f12514c == 0;
    }

    public synchronized void clear() {
        try {
            r0(4096, 0, 0, 0);
            this.f12514c = 0;
            b bVar = b.f12521c;
            this.f12515d = bVar;
            this.f12516e = bVar;
            if (this.f12513b > 4096) {
                o0(4096);
            }
            this.f12513b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f12512a.close();
    }

    public synchronized void f0() {
        try {
            if (J()) {
                throw new NoSuchElementException();
            }
            if (this.f12514c == 1) {
                clear();
            } else {
                b bVar = this.f12515d;
                int iQ0 = q0(bVar.f12522a + 4 + bVar.f12523b);
                m0(iQ0, this.f12517f, 0, 4);
                int iB0 = b0(this.f12517f, 0);
                r0(this.f12513b, this.f12514c - 1, iQ0, this.f12516e.f12522a);
                this.f12514c--;
                this.f12515d = new b(iQ0, iB0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void p(byte[] bArr) {
        s(bArr, 0, bArr.length);
    }

    public int p0() {
        if (this.f12514c == 0) {
            return 16;
        }
        b bVar = this.f12516e;
        int i10 = bVar.f12522a;
        int i11 = this.f12515d.f12522a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f12523b + 16 : (((i10 + 4) + bVar.f12523b) + this.f12513b) - i11;
    }

    public synchronized void s(byte[] bArr, int i10, int i11) {
        int iQ0;
        try {
            P(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            v(i11);
            boolean zJ = J();
            if (zJ) {
                iQ0 = 16;
            } else {
                b bVar = this.f12516e;
                iQ0 = q0(bVar.f12522a + 4 + bVar.f12523b);
            }
            b bVar2 = new b(iQ0, i11);
            s0(this.f12517f, 0, i11);
            n0(bVar2.f12522a, this.f12517f, 0, 4);
            n0(bVar2.f12522a + 4, bArr, i10, i11);
            r0(this.f12513b, this.f12514c + 1, zJ ? bVar2.f12522a : this.f12515d.f12522a, bVar2.f12522a);
            this.f12516e = bVar2;
            this.f12514c++;
            if (zJ) {
                this.f12515d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f12513b);
        sb2.append(", size=");
        sb2.append(this.f12514c);
        sb2.append(", first=");
        sb2.append(this.f12515d);
        sb2.append(", last=");
        sb2.append(this.f12516e);
        sb2.append(", element lengths=[");
        try {
            y(new a(sb2));
        } catch (IOException e10) {
            f12511g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized void y(d dVar) {
        int iQ0 = this.f12515d.f12522a;
        for (int i10 = 0; i10 < this.f12514c; i10++) {
            b bVarT = T(iQ0);
            dVar.a(new c(this, bVarT, null), bVarT.f12523b);
            iQ0 = q0(bVarT.f12522a + 4 + bVarT.f12523b);
        }
    }
}
