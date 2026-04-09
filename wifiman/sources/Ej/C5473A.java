package ej;

import Zg.AbstractC3682n;
import fj.AbstractC5836c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ej.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5473A extends h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f46433f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f46434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5473A(byte[][] segments, int[] directory) {
        super(h.f46471e.n());
        AbstractC6492s.i(segments, "segments");
        AbstractC6492s.i(directory, "directory");
        this.f46433f = segments;
        this.f46434g = directory;
    }

    private final h P0() {
        return new h(K0());
    }

    @Override // ej.h
    public boolean C(int i10, h other, int i11, int i12) {
        AbstractC6492s.i(other, "other");
        if (i10 < 0 || i10 > b0() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = AbstractC5836c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : E0()[iB - 1];
            int i15 = E0()[iB] - i14;
            int i16 = E0()[G0().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.E(i11, G0()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // ej.h
    public void C0(C5481e buffer, int i10, int i11) {
        AbstractC6492s.i(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = AbstractC5836c.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : E0()[iB - 1];
            int i14 = E0()[iB] - i13;
            int i15 = E0()[G0().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            y yVar = new y(G0()[iB], i16, i16 + iMin, true, false);
            y yVar2 = buffer.f46459a;
            if (yVar2 == null) {
                yVar.f46532g = yVar;
                yVar.f46531f = yVar;
                buffer.f46459a = yVar;
            } else {
                AbstractC6492s.f(yVar2);
                y yVar3 = yVar2.f46532g;
                AbstractC6492s.f(yVar3);
                yVar3.c(yVar);
            }
            i10 += iMin;
            iB++;
        }
        buffer.C0(buffer.D0() + i11);
    }

    @Override // ej.h
    public boolean E(int i10, byte[] other, int i11, int i12) {
        AbstractC6492s.i(other, "other");
        if (i10 < 0 || i10 > b0() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = AbstractC5836c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : E0()[iB - 1];
            int i15 = E0()[iB] - i14;
            int i16 = E0()[G0().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC5478b.a(G0()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    public final int[] E0() {
        return this.f46434g;
    }

    public final byte[][] G0() {
        return this.f46433f;
    }

    public byte[] K0() {
        byte[] bArr = new byte[b0()];
        int length = G0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = E0()[length + i10];
            int i14 = E0()[i10];
            int i15 = i14 - i11;
            AbstractC3682n.h(G0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ej.h
    public ByteBuffer a() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(K0()).asReadOnlyBuffer();
        AbstractC6492s.h(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // ej.h
    public String c() {
        return P0().c();
    }

    @Override // ej.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.b0() == b0() && C(0, hVar, 0, b0())) {
                return true;
            }
        }
        return false;
    }

    @Override // ej.h
    public h f0() {
        return P0().f0();
    }

    @Override // ej.h
    public h h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC6492s.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = G0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = E0()[length + i10];
            int i13 = E0()[i10];
            messageDigest.update(G0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC6492s.f(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // ej.h
    public int hashCode() {
        int iP = p();
        if (iP != 0) {
            return iP;
        }
        int length = G0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = E0()[length + i10];
            int i14 = E0()[i10];
            byte[] bArr = G0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        J(i11);
        return i11;
    }

    @Override // ej.h
    public int r() {
        return E0()[G0().length - 1];
    }

    @Override // ej.h
    public String t() {
        return P0().t();
    }

    @Override // ej.h
    public String toString() {
        return P0().toString();
    }

    @Override // ej.h
    public byte[] v() {
        return K0();
    }

    @Override // ej.h
    public byte y(int i10) {
        AbstractC5478b.b(E0()[G0().length - 1], i10, 1L);
        int iB = AbstractC5836c.b(this, i10);
        return G0()[iB][(i10 - (iB == 0 ? 0 : E0()[iB - 1])) + E0()[G0().length + iB]];
    }
}
