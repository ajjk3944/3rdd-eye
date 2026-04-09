package ej;

import Zg.AbstractC3682n;
import com.google.ar.core.ImageMetadata;
import fj.AbstractC5834a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;
import org.snmp4j.smi.Counter32;

/* renamed from: ej.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5481e implements InterfaceC5483g, InterfaceC5482f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public y f46459a;

    /* renamed from: b, reason: collision with root package name */
    private long f46460b;

    /* renamed from: ej.e$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public C5481e f46461a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f46462b;

        /* renamed from: c, reason: collision with root package name */
        private y f46463c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f46465e;

        /* renamed from: d, reason: collision with root package name */
        public long f46464d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f46466f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f46467g = -1;

        public final y a() {
            return this.f46463c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f46461a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f46461a = null;
            p(null);
            this.f46464d = -1L;
            this.f46465e = null;
            this.f46466f = -1;
            this.f46467g = -1;
        }

        public final int g() {
            long j10 = this.f46464d;
            C5481e c5481e = this.f46461a;
            AbstractC6492s.f(c5481e);
            if (j10 == c5481e.D0()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f46464d;
            return j(j11 == -1 ? 0L : j11 + (this.f46467g - this.f46466f));
        }

        public final long h(long j10) {
            C5481e c5481e = this.f46461a;
            if (c5481e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f46462b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long jD0 = c5481e.D0();
            if (j10 <= jD0) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = jD0 - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    y yVar = c5481e.f46459a;
                    AbstractC6492s.f(yVar);
                    y yVar2 = yVar.f46532g;
                    AbstractC6492s.f(yVar2);
                    int i10 = yVar2.f46528c;
                    long j12 = i10 - yVar2.f46527b;
                    if (j12 > j11) {
                        yVar2.f46528c = i10 - ((int) j11);
                        break;
                    }
                    c5481e.f46459a = yVar2.b();
                    z.b(yVar2);
                    j11 -= j12;
                }
                p(null);
                this.f46464d = j10;
                this.f46465e = null;
                this.f46466f = -1;
                this.f46467g = -1;
            } else if (j10 > jD0) {
                long j13 = j10 - jD0;
                boolean z10 = true;
                while (j13 > 0) {
                    y yVarG0 = c5481e.G0(1);
                    int iMin = (int) Math.min(j13, 8192 - yVarG0.f46528c);
                    yVarG0.f46528c += iMin;
                    j13 -= iMin;
                    if (z10) {
                        p(yVarG0);
                        this.f46464d = jD0;
                        this.f46465e = yVarG0.f46526a;
                        int i11 = yVarG0.f46528c;
                        this.f46466f = i11 - iMin;
                        this.f46467g = i11;
                        z10 = false;
                    }
                }
            }
            c5481e.C0(j10);
            return jD0;
        }

        public final int j(long j10) {
            y yVarC;
            C5481e c5481e = this.f46461a;
            if (c5481e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > c5481e.D0()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + c5481e.D0());
            }
            if (j10 == -1 || j10 == c5481e.D0()) {
                p(null);
                this.f46464d = j10;
                this.f46465e = null;
                this.f46466f = -1;
                this.f46467g = -1;
                return -1;
            }
            long jD0 = c5481e.D0();
            y yVarA = c5481e.f46459a;
            long j11 = 0;
            if (a() != null) {
                long j12 = this.f46464d;
                int i10 = this.f46466f;
                AbstractC6492s.f(a());
                long j13 = j12 - (i10 - r9.f46527b);
                if (j13 > j10) {
                    yVarC = yVarA;
                    yVarA = a();
                    jD0 = j13;
                } else {
                    yVarC = a();
                    j11 = j13;
                }
            } else {
                yVarC = yVarA;
            }
            if (jD0 - j10 > j10 - j11) {
                while (true) {
                    AbstractC6492s.f(yVarC);
                    int i11 = yVarC.f46528c;
                    int i12 = yVarC.f46527b;
                    if (j10 < (i11 - i12) + j11) {
                        break;
                    }
                    j11 += i11 - i12;
                    yVarC = yVarC.f46531f;
                }
            } else {
                while (jD0 > j10) {
                    AbstractC6492s.f(yVarA);
                    yVarA = yVarA.f46532g;
                    AbstractC6492s.f(yVarA);
                    jD0 -= yVarA.f46528c - yVarA.f46527b;
                }
                j11 = jD0;
                yVarC = yVarA;
            }
            if (this.f46462b) {
                AbstractC6492s.f(yVarC);
                if (yVarC.f46529d) {
                    y yVarF = yVarC.f();
                    if (c5481e.f46459a == yVarC) {
                        c5481e.f46459a = yVarF;
                    }
                    yVarC = yVarC.c(yVarF);
                    y yVar = yVarC.f46532g;
                    AbstractC6492s.f(yVar);
                    yVar.b();
                }
            }
            p(yVarC);
            this.f46464d = j10;
            AbstractC6492s.f(yVarC);
            this.f46465e = yVarC.f46526a;
            int i13 = yVarC.f46527b + ((int) (j10 - j11));
            this.f46466f = i13;
            int i14 = yVarC.f46528c;
            this.f46467g = i14;
            return i14 - i13;
        }

        public final void p(y yVar) {
            this.f46463c = yVar;
        }
    }

    /* renamed from: ej.e$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C5481e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C5481e.this.u(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            AbstractC6492s.i(data, "data");
            C5481e.this.write(data, i10, i11);
        }
    }

    public static /* synthetic */ a u0(C5481e c5481e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = AbstractC5478b.d();
        }
        return c5481e.t0(aVar);
    }

    @Override // ej.InterfaceC5483g
    public long A() throws EOFException {
        if (D0() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            y yVar = this.f46459a;
            AbstractC6492s.f(yVar);
            byte[] bArr = yVar.f46526a;
            int i11 = yVar.f46527b;
            int i12 = yVar.f46528c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i13 < j11)) {
                        C5481e c5481eU = new C5481e().h0(j10).u(b10);
                        if (!z10) {
                            c5481eU.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + c5481eU.z0());
                    }
                    j10 = (j10 * 10) + i13;
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f46459a = yVar.b();
                z.b(yVar);
            } else {
                yVar.f46527b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f46459a != null);
        C0(D0() - i10);
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (D0() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC5478b.j(f0(0L)));
    }

    public String A0(long j10) throws EOFException {
        return y0(j10, C6510d.f52215b);
    }

    public int B0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (D0() == 0) {
            throw new EOFException();
        }
        byte bF0 = f0(0L);
        if ((bF0 & 128) == 0) {
            i10 = bF0 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bF0 & 224) == 192) {
            i10 = bF0 & BER.ASN_EXTENSION_ID;
            i11 = 2;
            i12 = 128;
        } else if ((bF0 & 240) == 224) {
            i10 = bF0 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bF0 & 248) != 240) {
                d(1L);
                return 65533;
            }
            i10 = bF0 & 7;
            i11 = 4;
            i12 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        long j10 = i11;
        if (D0() < j10) {
            throw new EOFException("size < " + i11 + ": " + D0() + " (to read code point prefixed 0x" + AbstractC5478b.j(bF0) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bF02 = f0(j11);
            if ((bF02 & BER.ASN_PRIVATE) != 128) {
                d(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bF02 & 63);
        }
        d(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    public final void C0(long j10) {
        this.f46460b = j10;
    }

    @Override // ej.InterfaceC5483g
    public String D(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jM0 = m0((byte) 10, 0L, j11);
        if (jM0 != -1) {
            return AbstractC5834a.d(this, jM0);
        }
        if (j11 < D0() && f0(j11 - 1) == 13 && f0(j11) == 10) {
            return AbstractC5834a.d(this, j11);
        }
        C5481e c5481e = new C5481e();
        S(c5481e, 0L, Math.min(32, D0()));
        throw new EOFException("\\n not found: limit=" + Math.min(D0(), j10) + " content=" + c5481e.v0().t() + (char) 8230);
    }

    public final long D0() {
        return this.f46460b;
    }

    @Override // ej.InterfaceC5483g
    public int E(s options) throws EOFException {
        AbstractC6492s.i(options, "options");
        int iF = AbstractC5834a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        d(options.C()[iF].b0());
        return iF;
    }

    public final h E0() {
        if (D0() <= 2147483647L) {
            return F0((int) D0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + D0()).toString());
    }

    public final h F0(int i10) {
        if (i10 == 0) {
            return h.f46471e;
        }
        AbstractC5478b.b(D0(), 0L, i10);
        y yVar = this.f46459a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC6492s.f(yVar);
            int i14 = yVar.f46528c;
            int i15 = yVar.f46527b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            yVar = yVar.f46531f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        y yVar2 = this.f46459a;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC6492s.f(yVar2);
            bArr[i16] = yVar2.f46526a;
            i11 += yVar2.f46528c - yVar2.f46527b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = yVar2.f46527b;
            yVar2.f46529d = true;
            i16++;
            yVar2 = yVar2.f46531f;
        }
        return new C5473A(bArr, iArr);
    }

    @Override // ej.InterfaceC5483g
    public String G(Charset charset) {
        AbstractC6492s.i(charset, "charset");
        return y0(this.f46460b, charset);
    }

    public final y G0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        y yVar = this.f46459a;
        if (yVar != null) {
            AbstractC6492s.f(yVar);
            y yVar2 = yVar.f46532g;
            AbstractC6492s.f(yVar2);
            return (yVar2.f46528c + i10 > 8192 || !yVar2.f46530e) ? yVar2.c(z.c()) : yVar2;
        }
        y yVarC = z.c();
        this.f46459a = yVarC;
        yVarC.f46532g = yVarC;
        yVarC.f46531f = yVarC;
        return yVarC;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public C5481e R(h byteString) {
        AbstractC6492s.i(byteString, "byteString");
        byteString.C0(this, 0, byteString.b0());
        return this;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C5481e X(byte[] source) {
        AbstractC6492s.i(source, "source");
        return write(source, 0, source.length);
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C5481e write(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        long j10 = i11;
        AbstractC5478b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            y yVarG0 = G0(1);
            int iMin = Math.min(i12 - i10, 8192 - yVarG0.f46528c);
            int i13 = i10 + iMin;
            AbstractC3682n.h(source, yVarG0.f46526a, yVarG0.f46528c, i10, i13);
            yVarG0.f46528c += iMin;
            i10 = i13;
        }
        C0(D0() + j10);
        return this;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C5481e u(int i10) {
        y yVarG0 = G0(1);
        byte[] bArr = yVarG0.f46526a;
        int i11 = yVarG0.f46528c;
        yVarG0.f46528c = i11 + 1;
        bArr[i11] = (byte) i10;
        C0(D0() + 1);
        return this;
    }

    @Override // ej.InterfaceC5483g
    public long M(h targetBytes) {
        AbstractC6492s.i(targetBytes, "targetBytes");
        return o0(targetBytes, 0L);
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public C5481e h0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return u(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return F("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        y yVarG0 = G0(i10);
        byte[] bArr = yVarG0.f46526a;
        int i11 = yVarG0.f46528c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = AbstractC5834a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        yVarG0.f46528c += i10;
        C0(D0() + i10);
        return this;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C5481e K(long j10) {
        if (j10 == 0) {
            return u(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        y yVarG0 = G0(i10);
        byte[] bArr = yVarG0.f46526a;
        int i11 = yVarG0.f46528c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = AbstractC5834a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        yVarG0.f46528c += i10;
        C0(D0() + i10);
        return this;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C5481e o(int i10) {
        y yVarG0 = G0(4);
        byte[] bArr = yVarG0.f46526a;
        int i11 = yVarG0.f46528c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        yVarG0.f46528c = i11 + 4;
        C0(D0() + 4);
        return this;
    }

    public final C5481e P() {
        C5481e c5481e = new C5481e();
        if (D0() != 0) {
            y yVar = this.f46459a;
            AbstractC6492s.f(yVar);
            y yVarD = yVar.d();
            c5481e.f46459a = yVarD;
            yVarD.f46532g = yVarD;
            yVarD.f46531f = yVarD;
            for (y yVar2 = yVar.f46531f; yVar2 != yVar; yVar2 = yVar2.f46531f) {
                y yVar3 = yVarD.f46532g;
                AbstractC6492s.f(yVar3);
                AbstractC6492s.f(yVar2);
                yVar3.c(yVar2.d());
            }
            c5481e.C0(D0());
        }
        return c5481e;
    }

    public C5481e P0(long j10) {
        y yVarG0 = G0(8);
        byte[] bArr = yVarG0.f46526a;
        int i10 = yVarG0.f46528c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        yVarG0.f46528c = i10 + 8;
        C0(D0() + 8);
        return this;
    }

    @Override // ej.InterfaceC5483g
    public String Q() {
        return D(Long.MAX_VALUE);
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public C5481e n(int i10) {
        y yVarG0 = G0(2);
        byte[] bArr = yVarG0.f46526a;
        int i11 = yVarG0.f46528c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        yVarG0.f46528c = i11 + 2;
        C0(D0() + 2);
        return this;
    }

    public C5481e R0(String string, int i10, int i11, Charset charset) {
        AbstractC6492s.i(string, "string");
        AbstractC6492s.i(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (AbstractC6492s.d(charset, C6510d.f52215b)) {
            return H(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        AbstractC6492s.h(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public final C5481e S(C5481e out, long j10, long j11) {
        AbstractC6492s.i(out, "out");
        AbstractC5478b.b(D0(), j10, j11);
        if (j11 != 0) {
            out.C0(out.D0() + j11);
            y yVar = this.f46459a;
            while (true) {
                AbstractC6492s.f(yVar);
                int i10 = yVar.f46528c;
                int i11 = yVar.f46527b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                yVar = yVar.f46531f;
            }
            while (j11 > 0) {
                AbstractC6492s.f(yVar);
                y yVarD = yVar.d();
                int i12 = yVarD.f46527b + ((int) j10);
                yVarD.f46527b = i12;
                yVarD.f46528c = Math.min(i12 + ((int) j11), yVarD.f46528c);
                y yVar2 = out.f46459a;
                if (yVar2 == null) {
                    yVarD.f46532g = yVarD;
                    yVarD.f46531f = yVarD;
                    out.f46459a = yVarD;
                } else {
                    AbstractC6492s.f(yVar2);
                    y yVar3 = yVar2.f46532g;
                    AbstractC6492s.f(yVar3);
                    yVar3.c(yVarD);
                }
                j11 -= yVarD.f46528c - yVarD.f46527b;
                yVar = yVar.f46531f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C5481e F(String string) {
        AbstractC6492s.i(string, "string");
        return H(string, 0, string.length());
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C5481e H(String string, int i10, int i11) {
        char cCharAt;
        AbstractC6492s.i(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                y yVarG0 = G0(1);
                byte[] bArr = yVarG0.f46526a;
                int i12 = yVarG0.f46528c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = yVarG0.f46528c;
                int i15 = (i12 + i10) - i14;
                yVarG0.f46528c = i14 + i15;
                C0(D0() + i15);
            } else {
                if (cCharAt2 < 2048) {
                    y yVarG02 = G0(2);
                    byte[] bArr2 = yVarG02.f46526a;
                    int i16 = yVarG02.f46528c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    yVarG02.f46528c = i16 + 2;
                    C0(D0() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    y yVarG03 = G0(3);
                    byte[] bArr3 = yVarG03.f46526a;
                    int i17 = yVarG03.f46528c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    yVarG03.f46528c = i17 + 3;
                    C0(D0() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        u(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        y yVarG04 = G0(4);
                        byte[] bArr4 = yVarG04.f46526a;
                        int i20 = yVarG04.f46528c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        yVarG04.f46528c = i20 + 4;
                        C0(D0() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) {
        AbstractC6492s.i(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (D0() == 0) {
            return -1L;
        }
        if (j10 > D0()) {
            j10 = D0();
        }
        sink.Z(this, j10);
        return j10;
    }

    public C5481e U0(int i10) {
        if (i10 < 128) {
            u(i10);
        } else if (i10 < 2048) {
            y yVarG0 = G0(2);
            byte[] bArr = yVarG0.f46526a;
            int i11 = yVarG0.f46528c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            yVarG0.f46528c = i11 + 2;
            C0(D0() + 2);
        } else if (55296 <= i10 && i10 < 57344) {
            u(63);
        } else if (i10 < 65536) {
            y yVarG02 = G0(3);
            byte[] bArr2 = yVarG02.f46526a;
            int i12 = yVarG02.f46528c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            yVarG02.f46528c = i12 + 3;
            C0(D0() + 3);
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC5478b.k(i10));
            }
            y yVarG03 = G0(4);
            byte[] bArr3 = yVarG03.f46526a;
            int i13 = yVarG03.f46528c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            yVarG03.f46528c = i13 + 4;
            C0(D0() + 4);
        }
        return this;
    }

    @Override // ej.InterfaceC5483g
    public byte[] V(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (D0() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // ej.InterfaceC5483g
    public long W(h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        return n0(bytes, 0L);
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C5481e m() {
        return this;
    }

    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) {
        y yVar;
        AbstractC6492s.i(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC5478b.b(source.D0(), 0L, j10);
        while (j10 > 0) {
            y yVar2 = source.f46459a;
            AbstractC6492s.f(yVar2);
            int i10 = yVar2.f46528c;
            AbstractC6492s.f(source.f46459a);
            if (j10 < i10 - r1.f46527b) {
                y yVar3 = this.f46459a;
                if (yVar3 != null) {
                    AbstractC6492s.f(yVar3);
                    yVar = yVar3.f46532g;
                } else {
                    yVar = null;
                }
                if (yVar != null && yVar.f46530e) {
                    if ((yVar.f46528c + j10) - (yVar.f46529d ? 0 : yVar.f46527b) <= 8192) {
                        y yVar4 = source.f46459a;
                        AbstractC6492s.f(yVar4);
                        yVar4.g(yVar, (int) j10);
                        source.C0(source.D0() - j10);
                        C0(D0() + j10);
                        return;
                    }
                }
                y yVar5 = source.f46459a;
                AbstractC6492s.f(yVar5);
                source.f46459a = yVar5.e((int) j10);
            }
            y yVar6 = source.f46459a;
            AbstractC6492s.f(yVar6);
            long j11 = yVar6.f46528c - yVar6.f46527b;
            source.f46459a = yVar6.b();
            y yVar7 = this.f46459a;
            if (yVar7 == null) {
                this.f46459a = yVar6;
                yVar6.f46532g = yVar6;
                yVar6.f46531f = yVar6;
            } else {
                AbstractC6492s.f(yVar7);
                y yVar8 = yVar7.f46532g;
                AbstractC6492s.f(yVar8);
                yVar8.c(yVar6).a();
            }
            source.C0(source.D0() - j11);
            C0(D0() + j11);
            j10 -= j11;
        }
    }

    @Override // ej.InterfaceC5483g, ej.InterfaceC5482f
    public C5481e b() {
        return this;
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return E.f46437f;
    }

    public final void clear() throws EOFException {
        d(D0());
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ej.InterfaceC5483g
    public void d(long j10) throws EOFException {
        while (j10 > 0) {
            y yVar = this.f46459a;
            if (yVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, yVar.f46528c - yVar.f46527b);
            long j11 = iMin;
            C0(D0() - j11);
            j10 -= j11;
            int i10 = yVar.f46527b + iMin;
            yVar.f46527b = i10;
            if (i10 == yVar.f46528c) {
                this.f46459a = yVar.b();
                z.b(yVar);
            }
        }
    }

    @Override // ej.InterfaceC5482f
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C5481e z() {
        return this;
    }

    @Override // ej.InterfaceC5482f
    public long e0(InterfaceC5476D source) {
        AbstractC6492s.i(source, "source");
        long j10 = 0;
        while (true) {
            long jU = source.U(this, 8192L);
            if (jU == -1) {
                return j10;
            }
            j10 += jU;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5481e) {
            C5481e c5481e = (C5481e) obj;
            if (D0() == c5481e.D0()) {
                if (D0() == 0) {
                    return true;
                }
                y yVar = this.f46459a;
                AbstractC6492s.f(yVar);
                y yVar2 = c5481e.f46459a;
                AbstractC6492s.f(yVar2);
                int i10 = yVar.f46527b;
                int i11 = yVar2.f46527b;
                long j10 = 0;
                while (j10 < D0()) {
                    long jMin = Math.min(yVar.f46528c - i10, yVar2.f46528c - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (yVar.f46526a[i10] == yVar2.f46526a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == yVar.f46528c) {
                        yVar = yVar.f46531f;
                        AbstractC6492s.f(yVar);
                        i10 = yVar.f46527b;
                    }
                    if (i11 == yVar2.f46528c) {
                        yVar2 = yVar2.f46531f;
                        AbstractC6492s.f(yVar2);
                        i11 = yVar2.f46527b;
                    }
                    j10 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public final byte f0(long j10) {
        AbstractC5478b.b(D0(), j10, 1L);
        y yVar = this.f46459a;
        if (yVar == null) {
            AbstractC6492s.f(null);
            throw null;
        }
        if (D0() - j10 < j10) {
            long jD0 = D0();
            while (jD0 > j10) {
                yVar = yVar.f46532g;
                AbstractC6492s.f(yVar);
                jD0 -= yVar.f46528c - yVar.f46527b;
            }
            AbstractC6492s.f(yVar);
            return yVar.f46526a[(int) ((yVar.f46527b + j10) - jD0)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (yVar.f46528c - yVar.f46527b) + j11;
            if (j12 > j10) {
                AbstractC6492s.f(yVar);
                return yVar.f46526a[(int) ((yVar.f46527b + j10) - j11)];
            }
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            j11 = j12;
        }
    }

    @Override // ej.InterfaceC5482f, ej.InterfaceC5474B, java.io.Flushable
    public void flush() {
    }

    @Override // ej.InterfaceC5483g
    public void g0(long j10) throws EOFException {
        if (this.f46460b < j10) {
            throw new EOFException();
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5481e clone() {
        return P();
    }

    public int hashCode() {
        y yVar = this.f46459a;
        if (yVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = yVar.f46528c;
            for (int i12 = yVar.f46527b; i12 < i11; i12++) {
                i10 = (i10 * 31) + yVar.f46526a[i12];
            }
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
        } while (yVar != this.f46459a);
        return i10;
    }

    @Override // ej.InterfaceC5483g
    public boolean i0(long j10, h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        return r0(j10, bytes, 0, bytes.b0());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // ej.InterfaceC5483g
    public long j0(byte b10) {
        return m0(b10, 0L, Long.MAX_VALUE);
    }

    @Override // ej.InterfaceC5483g
    public C5481e k() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // ej.InterfaceC5483g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long k0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.D0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            ej.y r6 = r14.f46459a
            kotlin.jvm.internal.AbstractC6492s.f(r6)
            byte[] r7 = r6.f46526a
            int r8 = r6.f46527b
            int r9 = r6.f46528c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            ej.e r0 = new ej.e
            r0.<init>()
            ej.e r0 = r0.K(r4)
            ej.e r0 = r0.u(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.z0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = ej.AbstractC5478b.j(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            ej.y r7 = r6.b()
            r14.f46459a = r7
            ej.z.b(r6)
            goto La1
        L9f:
            r6.f46527b = r8
        La1:
            if (r1 != 0) goto La7
            ej.y r6 = r14.f46459a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.D0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.C0(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.C5481e.k0():long");
    }

    @Override // ej.InterfaceC5483g
    public h l(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (D0() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new h(V(j10));
        }
        h hVarF0 = F0((int) j10);
        d(j10);
        return hVarF0;
    }

    @Override // ej.InterfaceC5483g
    public InputStream l0() {
        return new b();
    }

    public long m0(byte b10, long j10, long j11) {
        y yVar;
        int i10;
        long jD0 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + D0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > D0()) {
            j11 = D0();
        }
        if (j10 == j11 || (yVar = this.f46459a) == null) {
            return -1L;
        }
        if (D0() - j10 < j10) {
            jD0 = D0();
            while (jD0 > j10) {
                yVar = yVar.f46532g;
                AbstractC6492s.f(yVar);
                jD0 -= yVar.f46528c - yVar.f46527b;
            }
            while (jD0 < j11) {
                byte[] bArr = yVar.f46526a;
                int iMin = (int) Math.min(yVar.f46528c, (yVar.f46527b + j11) - jD0);
                i10 = (int) ((yVar.f46527b + j10) - jD0);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                jD0 += yVar.f46528c - yVar.f46527b;
                yVar = yVar.f46531f;
                AbstractC6492s.f(yVar);
                j10 = jD0;
            }
            return -1L;
        }
        while (true) {
            long j12 = (yVar.f46528c - yVar.f46527b) + jD0;
            if (j12 > j10) {
                break;
            }
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            jD0 = j12;
        }
        while (jD0 < j11) {
            byte[] bArr2 = yVar.f46526a;
            int iMin2 = (int) Math.min(yVar.f46528c, (yVar.f46527b + j11) - jD0);
            i10 = (int) ((yVar.f46527b + j10) - jD0);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            jD0 += yVar.f46528c - yVar.f46527b;
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            j10 = jD0;
        }
        return -1L;
        return (i10 - yVar.f46527b) + jD0;
    }

    public long n0(h bytes, long j10) {
        int i10;
        long j11 = j10;
        AbstractC6492s.i(bytes, "bytes");
        if (bytes.b0() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long jD0 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        y yVar = this.f46459a;
        if (yVar != null) {
            if (D0() - j11 < j11) {
                jD0 = D0();
                while (jD0 > j11) {
                    yVar = yVar.f46532g;
                    AbstractC6492s.f(yVar);
                    jD0 -= yVar.f46528c - yVar.f46527b;
                }
                byte[] bArrV = bytes.v();
                byte b10 = bArrV[0];
                int iB0 = bytes.b0();
                long jD02 = (D0() - iB0) + 1;
                while (jD0 < jD02) {
                    byte[] bArr = yVar.f46526a;
                    long j12 = jD02;
                    int iMin = (int) Math.min(yVar.f46528c, (yVar.f46527b + jD02) - jD0);
                    i10 = (int) ((yVar.f46527b + j11) - jD0);
                    while (i10 < iMin) {
                        if (bArr[i10] == b10 && AbstractC5834a.c(yVar, i10 + 1, bArrV, 1, iB0)) {
                            return (i10 - yVar.f46527b) + jD0;
                        }
                        i10++;
                    }
                    jD0 += yVar.f46528c - yVar.f46527b;
                    yVar = yVar.f46531f;
                    AbstractC6492s.f(yVar);
                    j11 = jD0;
                    jD02 = j12;
                }
            } else {
                while (true) {
                    long j13 = (yVar.f46528c - yVar.f46527b) + jD0;
                    if (j13 > j11) {
                        break;
                    }
                    yVar = yVar.f46531f;
                    AbstractC6492s.f(yVar);
                    jD0 = j13;
                }
                byte[] bArrV2 = bytes.v();
                byte b11 = bArrV2[0];
                int iB02 = bytes.b0();
                long jD03 = (D0() - iB02) + 1;
                while (jD0 < jD03) {
                    byte[] bArr2 = yVar.f46526a;
                    int iMin2 = (int) Math.min(yVar.f46528c, (yVar.f46527b + jD03) - jD0);
                    i10 = (int) ((yVar.f46527b + j11) - jD0);
                    while (i10 < iMin2) {
                        if (bArr2[i10] == b11 && AbstractC5834a.c(yVar, i10 + 1, bArrV2, 1, iB02)) {
                            return (i10 - yVar.f46527b) + jD0;
                        }
                        i10++;
                    }
                    jD0 += yVar.f46528c - yVar.f46527b;
                    yVar = yVar.f46531f;
                    AbstractC6492s.f(yVar);
                    j11 = jD0;
                }
            }
        }
        return -1L;
    }

    public long o0(h targetBytes, long j10) {
        int i10;
        int i11;
        AbstractC6492s.i(targetBytes, "targetBytes");
        long jD0 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        y yVar = this.f46459a;
        if (yVar == null) {
            return -1L;
        }
        if (D0() - j10 < j10) {
            jD0 = D0();
            while (jD0 > j10) {
                yVar = yVar.f46532g;
                AbstractC6492s.f(yVar);
                jD0 -= yVar.f46528c - yVar.f46527b;
            }
            if (targetBytes.b0() == 2) {
                byte bL = targetBytes.l(0);
                byte bL2 = targetBytes.l(1);
                while (jD0 < D0()) {
                    byte[] bArr = yVar.f46526a;
                    i10 = (int) ((yVar.f46527b + j10) - jD0);
                    int i12 = yVar.f46528c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bL || b10 == bL2) {
                            i11 = yVar.f46527b;
                        } else {
                            i10++;
                        }
                    }
                    jD0 += yVar.f46528c - yVar.f46527b;
                    yVar = yVar.f46531f;
                    AbstractC6492s.f(yVar);
                    j10 = jD0;
                }
                return -1L;
            }
            byte[] bArrV = targetBytes.v();
            while (jD0 < D0()) {
                byte[] bArr2 = yVar.f46526a;
                i10 = (int) ((yVar.f46527b + j10) - jD0);
                int i13 = yVar.f46528c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrV) {
                        if (b11 == b12) {
                            i11 = yVar.f46527b;
                        }
                    }
                    i10++;
                }
                jD0 += yVar.f46528c - yVar.f46527b;
                yVar = yVar.f46531f;
                AbstractC6492s.f(yVar);
                j10 = jD0;
            }
            return -1L;
        }
        while (true) {
            long j11 = (yVar.f46528c - yVar.f46527b) + jD0;
            if (j11 > j10) {
                break;
            }
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            jD0 = j11;
        }
        if (targetBytes.b0() == 2) {
            byte bL3 = targetBytes.l(0);
            byte bL4 = targetBytes.l(1);
            while (jD0 < D0()) {
                byte[] bArr3 = yVar.f46526a;
                i10 = (int) ((yVar.f46527b + j10) - jD0);
                int i14 = yVar.f46528c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bL3 || b13 == bL4) {
                        i11 = yVar.f46527b;
                    } else {
                        i10++;
                    }
                }
                jD0 += yVar.f46528c - yVar.f46527b;
                yVar = yVar.f46531f;
                AbstractC6492s.f(yVar);
                j10 = jD0;
            }
            return -1L;
        }
        byte[] bArrV2 = targetBytes.v();
        while (jD0 < D0()) {
            byte[] bArr4 = yVar.f46526a;
            i10 = (int) ((yVar.f46527b + j10) - jD0);
            int i15 = yVar.f46528c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrV2) {
                    if (b14 == b15) {
                        i11 = yVar.f46527b;
                    }
                }
                i10++;
            }
            jD0 += yVar.f46528c - yVar.f46527b;
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            j10 = jD0;
        }
        return -1L;
        return (i10 - i11) + jD0;
    }

    public final long p() {
        long jD0 = D0();
        if (jD0 == 0) {
            return 0L;
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        y yVar2 = yVar.f46532g;
        AbstractC6492s.f(yVar2);
        if (yVar2.f46528c < 8192 && yVar2.f46530e) {
            jD0 -= r3 - yVar2.f46527b;
        }
        return jD0;
    }

    public OutputStream p0() {
        return new c();
    }

    @Override // ej.InterfaceC5483g
    public InterfaceC5483g peek() {
        return p.d(new u(this));
    }

    @Override // ej.InterfaceC5483g
    public long q(InterfaceC5474B sink) {
        AbstractC6492s.i(sink, "sink");
        long jD0 = D0();
        if (jD0 > 0) {
            sink.Z(this, jD0);
        }
        return jD0;
    }

    @Override // ej.InterfaceC5483g
    public byte[] r() {
        return V(D0());
    }

    public boolean r0(long j10, h bytes, int i10, int i11) {
        AbstractC6492s.i(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || D0() - j10 < i11 || bytes.b0() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f0(i12 + j10) != bytes.l(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC6492s.i(sink, "sink");
        y yVar = this.f46459a;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), yVar.f46528c - yVar.f46527b);
        sink.put(yVar.f46526a, yVar.f46527b, iMin);
        int i10 = yVar.f46527b + iMin;
        yVar.f46527b = i10;
        this.f46460b -= iMin;
        if (i10 == yVar.f46528c) {
            this.f46459a = yVar.b();
            z.b(yVar);
        }
        return iMin;
    }

    @Override // ej.InterfaceC5483g
    public byte readByte() throws EOFException {
        if (D0() == 0) {
            throw new EOFException();
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46527b;
        int i11 = yVar.f46528c;
        int i12 = i10 + 1;
        byte b10 = yVar.f46526a[i10];
        C0(D0() - 1);
        if (i12 == i11) {
            this.f46459a = yVar.b();
            z.b(yVar);
        } else {
            yVar.f46527b = i12;
        }
        return b10;
    }

    @Override // ej.InterfaceC5483g
    public void readFully(byte[] sink) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int iS0 = s0(sink, i10, sink.length - i10);
            if (iS0 == -1) {
                throw new EOFException();
            }
            i10 += iS0;
        }
    }

    @Override // ej.InterfaceC5483g
    public int readInt() throws EOFException {
        if (D0() < 4) {
            throw new EOFException();
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46527b;
        int i11 = yVar.f46528c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = yVar.f46526a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        C0(D0() - 4);
        if (i14 == i11) {
            this.f46459a = yVar.b();
            z.b(yVar);
        } else {
            yVar.f46527b = i14;
        }
        return i15;
    }

    @Override // ej.InterfaceC5483g
    public long readLong() throws EOFException {
        if (D0() < 8) {
            throw new EOFException();
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46527b;
        int i11 = yVar.f46528c;
        if (i11 - i10 < 8) {
            return ((readInt() & Counter32.MAX_COUNTER32_VALUE) << 32) | (Counter32.MAX_COUNTER32_VALUE & readInt());
        }
        byte[] bArr = yVar.f46526a;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        C0(D0() - 8);
        if (i13 == i11) {
            this.f46459a = yVar.b();
            z.b(yVar);
        } else {
            yVar.f46527b = i13;
        }
        return j11;
    }

    @Override // ej.InterfaceC5483g
    public short readShort() throws EOFException {
        if (D0() < 2) {
            throw new EOFException();
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46527b;
        int i11 = yVar.f46528c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = yVar.f46526a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        C0(D0() - 2);
        if (i14 == i11) {
            this.f46459a = yVar.b();
            z.b(yVar);
        } else {
            yVar.f46527b = i14;
        }
        return (short) i15;
    }

    @Override // ej.InterfaceC5483g
    public boolean request(long j10) {
        return this.f46460b >= j10;
    }

    public int s0(byte[] sink, int i10, int i11) {
        AbstractC6492s.i(sink, "sink");
        AbstractC5478b.b(sink.length, i10, i11);
        y yVar = this.f46459a;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, yVar.f46528c - yVar.f46527b);
        byte[] bArr = yVar.f46526a;
        int i12 = yVar.f46527b;
        AbstractC3682n.h(bArr, sink, i10, i12, i12 + iMin);
        yVar.f46527b += iMin;
        C0(D0() - iMin);
        if (yVar.f46527b == yVar.f46528c) {
            this.f46459a = yVar.b();
            z.b(yVar);
        }
        return iMin;
    }

    @Override // ej.InterfaceC5483g
    public boolean t() {
        return this.f46460b == 0;
    }

    public final a t0(a unsafeCursor) {
        AbstractC6492s.i(unsafeCursor, "unsafeCursor");
        return AbstractC5834a.a(this, unsafeCursor);
    }

    public String toString() {
        return E0().toString();
    }

    public h v0() {
        return l(D0());
    }

    @Override // ej.InterfaceC5483g
    public void w(C5481e sink, long j10) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        if (D0() >= j10) {
            sink.Z(this, j10);
        } else {
            sink.Z(this, D0());
            throw new EOFException();
        }
    }

    public int w0() {
        return AbstractC5478b.h(readInt());
    }

    public short x0() {
        return AbstractC5478b.i(readShort());
    }

    public String y0(long j10, Charset charset) throws EOFException {
        AbstractC6492s.i(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f46460b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        y yVar = this.f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46527b;
        if (i10 + j10 > yVar.f46528c) {
            return new String(V(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(yVar.f46526a, i10, i11, charset);
        int i12 = yVar.f46527b + i11;
        yVar.f46527b = i12;
        this.f46460b -= j10;
        if (i12 == yVar.f46528c) {
            this.f46459a = yVar.b();
            z.b(yVar);
        }
        return str;
    }

    public String z0() {
        return y0(this.f46460b, C6510d.f52215b);
    }

    /* renamed from: ej.e$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C5481e.this.D0(), MPv3.MAX_MESSAGE_ID);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C5481e.this.D0() > 0) {
                return C5481e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C5481e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            AbstractC6492s.i(sink, "sink");
            return C5481e.this.s0(sink, i10, i11);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC6492s.i(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            y yVarG0 = G0(1);
            int iMin = Math.min(i10, 8192 - yVarG0.f46528c);
            source.get(yVarG0.f46526a, yVarG0.f46528c, iMin);
            i10 -= iMin;
            yVarG0.f46528c += iMin;
        }
        this.f46460b += iRemaining;
        return iRemaining;
    }
}
