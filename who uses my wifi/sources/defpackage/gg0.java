package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gg0 implements Comparable, Serializable {
    public static final gg0 l;
    public static final gg0 m;
    public byte[] f;
    public long g;
    public transient int h;
    public int i;
    public static final i80 j = k80.d(gg0.class);
    public static final byte[] k = {0};
    public static final byte[] n = new byte[256];

    static {
        int i = 0;
        while (true) {
            byte[] bArr = n;
            if (i >= bArr.length) {
                gg0 gg0Var = new gg0();
                l = gg0Var;
                gg0Var.f = k;
                gg0Var.i = 1;
                gg0 gg0Var2 = new gg0();
                m = gg0Var2;
                gg0Var2.f = new byte[0];
                return;
            }
            if (i < 65 || i > 90) {
                bArr[i] = (byte) i;
            } else {
                bArr[i] = (byte) (i + 32);
            }
            i++;
        }
    }

    public gg0(cm cmVar) throws t91 {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int i = cmVar.i();
            int i2 = cmVar.f;
            ByteBuffer byteBuffer = (ByteBuffer) cmVar.j;
            int i3 = i & 192;
            if (i3 != 0) {
                if (i3 != 192) {
                    throw new t91("bad label type");
                }
                int i4 = cmVar.i() + ((i & (-193)) << 8);
                Integer numValueOf = Integer.valueOf(byteBuffer.position() - i2);
                Integer numValueOf2 = Integer.valueOf(i4);
                i80 i80Var = j;
                i80Var.j("currently {}, pointer to {}", numValueOf, numValueOf2);
                if (i4 >= (byteBuffer.position() - i2) - 2) {
                    throw new t91("bad compression");
                }
                if (!z2) {
                    cmVar.h = byteBuffer.position();
                    cmVar.i = byteBuffer.limit();
                    z2 = true;
                }
                int i5 = i2 + i4;
                int i6 = cmVar.g;
                if (i5 >= i6) {
                    throw new IllegalArgumentException("cannot jump past end of input");
                }
                byteBuffer.position(i5);
                byteBuffer.limit(i6);
                i80Var.j("current name '{}', seeking to {}", this, Integer.valueOf(i4));
            } else if (i == 0) {
                a(1, k);
                z = true;
            } else {
                bArr[0] = (byte) i;
                cmVar.j(i);
                byteBuffer.get(bArr, 1, i);
                a(1, bArr);
            }
        }
        if (z2) {
            ByteBuffer byteBuffer2 = (ByteBuffer) cmVar.j;
            int i7 = cmVar.h;
            if (i7 < 0) {
                throw new IllegalStateException("no previous state");
            }
            byteBuffer2.position(i7);
            byteBuffer2.limit(cmVar.i);
            cmVar.h = -1;
            cmVar.i = -1;
        }
    }

    public static gg0 e(gg0 gg0Var, gg0 gg0Var2) throws hg0 {
        if (gg0Var.isAbsolute()) {
            return gg0Var;
        }
        gg0 gg0Var3 = new gg0();
        gg0Var3.a(gg0Var.i, gg0Var.f);
        gg0Var3.a(gg0Var2.i, gg0Var2.f);
        return gg0Var3;
    }

    public static void f(gg0 gg0Var, gg0 gg0Var2) {
        gg0Var2.f = gg0Var.f;
        gg0Var2.g = gg0Var.g;
        gg0Var2.i = gg0Var.i;
    }

    public static gg0 h(String str) {
        try {
            return j(str, null);
        } catch (f11 unused) {
            throw new IllegalArgumentException(ex0.h("Invalid name '", str, "'"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.gg0 j(java.lang.String r17, defpackage.gg0 r18) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg0.j(java.lang.String, gg0):gg0");
    }

    public final void a(int i, byte[] bArr) throws hg0 {
        byte[] bArr2 = this.f;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i3] + 1;
            i3 += i5;
            i2 += i5;
        }
        int i6 = length + i2;
        if (i6 > 255) {
            throw new hg0();
        }
        byte[] bArr3 = this.f;
        byte[] bArrCopyOf = bArr3 != null ? Arrays.copyOf(bArr3, i6) : new byte[i6];
        System.arraycopy(bArr, 0, bArrCopyOf, length, i2);
        this.f = bArrCopyOf;
        for (int i7 = 0; i7 < i && i7 < 9; i7++) {
            n(this.i + i7, length);
            length += bArrCopyOf[length] + 1;
        }
        this.i += i;
    }

    public final void b(char[] cArr, int i) throws hg0 {
        byte[] bArr = this.f;
        int length = bArr == null ? 0 : bArr.length;
        int i2 = length + 1;
        int i3 = i2 + i;
        if (i3 > 255) {
            throw new hg0();
        }
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, i3) : new byte[i3];
        bArrCopyOf[length] = (byte) i;
        this.f = bArrCopyOf;
        n(this.i, length);
        this.i++;
        for (int i4 = 0; i4 < i; i4++) {
            this.f[i2 + i4] = (byte) cArr[i4];
        }
    }

    public final void c(String str, char[] cArr, int i) throws f11 {
        try {
            b(cArr, i);
        } catch (hg0 e) {
            throw new f11(ex0.h("'", str, "': Name too long"), e);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gg0 gg0Var) {
        if (this == gg0Var) {
            return 0;
        }
        int i = gg0Var.i;
        int iMin = Math.min(this.i, i);
        for (int i2 = 1; i2 <= iMin; i2++) {
            int iL = l(this.i - i2);
            int iL2 = gg0Var.l(i - i2);
            byte b = this.f[iL];
            byte b2 = gg0Var.f[iL2];
            for (int i3 = 0; i3 < b && i3 < b2; i3++) {
                int i4 = this.f[i3 + iL + 1] & 255;
                byte[] bArr = n;
                int i5 = (bArr[i4] & 255) - (bArr[gg0Var.f[(i3 + iL2) + 1] & 255] & 255);
                if (i5 != 0) {
                    return i5;
                }
            }
            if (b != b2) {
                return b - b2;
            }
        }
        return this.i - i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        if (gg0Var.i == this.i && gg0Var.hashCode() == hashCode()) {
            return g(0, gg0Var.f);
        }
        return false;
    }

    public final boolean g(int i, byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.i; i3++) {
            byte b = this.f[i2];
            if (b != bArr[i]) {
                return false;
            }
            i2++;
            i++;
            int i4 = 0;
            while (i4 < b) {
                int i5 = i2 + 1;
                int i6 = this.f[i2] & 255;
                byte[] bArr2 = n;
                int i7 = i + 1;
                if (bArr2[i6] != bArr2[bArr[i] & 255]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i = i7;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int iL = l(0);
        while (true) {
            byte[] bArr = this.f;
            if (iL >= bArr.length) {
                this.h = i2;
                return i2;
            }
            i2 += (i2 << 3) + (n[bArr[iL] & 255] & 255);
            iL++;
        }
    }

    public final gg0 i(bm bmVar) throws hg0 {
        gg0 gg0Var = bmVar.f;
        gg0 gg0Var2 = bmVar.k;
        if (!o(gg0Var)) {
            return null;
        }
        int i = this.i - gg0Var.i;
        int iK = k() - gg0Var.k();
        int i2 = gg0Var2.i;
        short sK = gg0Var2.k();
        int i3 = iK + sK;
        if (i3 > 255) {
            throw new hg0();
        }
        gg0 gg0Var3 = new gg0();
        int i4 = i + i2;
        gg0Var3.i = i4;
        byte[] bArrCopyOf = Arrays.copyOf(this.f, i3);
        gg0Var3.f = bArrCopyOf;
        System.arraycopy(gg0Var2.f, 0, bArrCopyOf, iK, sK);
        int i5 = 0;
        for (int i6 = 0; i6 < 9 && i6 < i4; i6++) {
            gg0Var3.n(i6, i5);
            i5 += gg0Var3.f[i5] + 1;
        }
        return gg0Var3;
    }

    public final boolean isAbsolute() {
        int i = this.i;
        return i != 0 && this.f[l(i - 1)] == 0;
    }

    public final short k() {
        if (this.i == 0) {
            return (short) 0;
        }
        return (short) this.f.length;
    }

    public final int l(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 1 || i >= this.i) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 9) {
            return ((int) (this.g >>> ((i - 1) * 8))) & 255;
        }
        int i2 = ((int) (this.g >>> 56)) & 255;
        for (int i3 = 8; i3 < i; i3++) {
            i2 += this.f[i2] + 1;
        }
        return i2;
    }

    public final gg0 m(gg0 gg0Var) {
        if (gg0Var == null || !o(gg0Var)) {
            return this;
        }
        gg0 gg0Var2 = new gg0();
        int iK = k() - gg0Var.k();
        gg0Var2.i = this.i - gg0Var.i;
        gg0Var2.g = this.g;
        byte[] bArr = new byte[iK];
        gg0Var2.f = bArr;
        System.arraycopy(this.f, 0, bArr, 0, iK);
        return gg0Var2;
    }

    public final void n(int i, int i2) {
        if (i == 0 || i >= 9) {
            return;
        }
        int i3 = (i - 1) * 8;
        this.g = (i2 << i3) | (this.g & (~(255 << i3)));
    }

    public final boolean o(gg0 gg0Var) {
        int i = gg0Var.i;
        int i2 = this.i;
        if (i > i2) {
            return false;
        }
        if (i == i2) {
            return equals(gg0Var);
        }
        return gg0Var.g(l(i2 - i), this.f);
    }

    public final String p(boolean z) {
        int i = this.i;
        if (i == 0) {
            return "@";
        }
        int i2 = 0;
        if (i == 1 && this.f[0] == 0) {
            return ".";
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            if (i2 >= this.i) {
                break;
            }
            byte b = this.f[i3];
            if (b != 0) {
                if (i2 > 0) {
                    sb.append('.');
                }
                byte[] bArr = this.f;
                StringBuilder sb2 = new StringBuilder();
                int i4 = i3 + 1;
                byte b2 = bArr[i3];
                for (int i5 = i4; i5 < i4 + b2; i5++) {
                    int i6 = bArr[i5] & 255;
                    if (i6 <= 32 || i6 >= 127) {
                        sb2.append('\\');
                        if (i6 < 10) {
                            sb2.append("00");
                        } else if (i6 < 100) {
                            sb2.append('0');
                        }
                        sb2.append(i6);
                    } else if (i6 == 34 || i6 == 40 || i6 == 41 || i6 == 46 || i6 == 59 || i6 == 92 || i6 == 64 || i6 == 36) {
                        sb2.append('\\');
                        sb2.append((char) i6);
                    } else {
                        sb2.append((char) i6);
                    }
                }
                sb.append(sb2.toString());
                i3 += b + 1;
                i2++;
            } else if (!z) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    public final void q(t3 t3Var, jh jhVar) {
        int i;
        if (!isAbsolute()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int i2 = 0;
        while (i2 < this.i - 1) {
            gg0 gg0Var = i2 == 0 ? this : new gg0(this, i2);
            int i3 = -1;
            if (jhVar != null) {
                for (so1 so1Var = jhVar.a[(gg0Var.hashCode() & Integer.MAX_VALUE) % 17]; so1Var != null; so1Var = (so1) so1Var.h) {
                    if (((gg0) so1Var.g).equals(gg0Var)) {
                        i3 = so1Var.f;
                    }
                }
                jh.b.j("Looking for {}, found {}", gg0Var, Integer.valueOf(i3));
            }
            if (i3 >= 0) {
                t3Var.m(49152 | i3);
                return;
            }
            if (jhVar != null && (i = t3Var.g) <= 16383) {
                int iHashCode = (Integer.MAX_VALUE & gg0Var.hashCode()) % 17;
                so1 so1Var2 = new so1();
                so1Var2.g = gg0Var;
                so1Var2.f = i;
                so1[] so1VarArr = jhVar.a;
                so1Var2.h = so1VarArr[iHashCode];
                so1VarArr[iHashCode] = so1Var2;
                jh.b.j("Adding {} at {}", gg0Var, Integer.valueOf(i));
            }
            int iL = l(i2);
            byte[] bArr = this.f;
            t3Var.k(bArr, iL, bArr[iL] + 1);
            i2++;
        }
        t3Var.q(0);
    }

    public final void r(t3 t3Var, jh jhVar, boolean z) {
        if (z) {
            s(t3Var);
        } else {
            q(t3Var, jhVar);
        }
    }

    public final void s(t3 t3Var) {
        byte[] bArr;
        if (this.i == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[this.f.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.i; i3++) {
                byte b = this.f[i];
                i++;
                bArr[i2] = b;
                i2++;
                int i4 = 0;
                while (i4 < b) {
                    bArr[i2] = n[this.f[i] & 255];
                    i4++;
                    i2++;
                    i++;
                }
            }
        }
        t3Var.getClass();
        t3Var.k(bArr, 0, bArr.length);
    }

    public final String toString() {
        return p(false);
    }

    public gg0(gg0 gg0Var, int i) {
        int i2 = gg0Var.i;
        if (i > i2) {
            throw new IllegalArgumentException("attempted to remove too many labels");
        }
        if (i == i2) {
            f(m, this);
            return;
        }
        this.i = i2 - i;
        this.f = Arrays.copyOfRange(gg0Var.f, gg0Var.l(i), gg0Var.f.length);
        int iL = gg0Var.l(i);
        for (int i3 = 1; i3 < 9 && i3 < this.i; i3++) {
            n(i3, gg0Var.l(i3 + i) - iL);
        }
    }
}
