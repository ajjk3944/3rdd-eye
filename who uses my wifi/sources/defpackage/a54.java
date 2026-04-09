package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class a54 implements Iterable, Serializable {
    public static final y44 g = new y44(y54.b);
    public int f = 0;

    static {
        int i = u44.a;
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ga1.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), "Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), "End index: ", i2, " >= ", i3));
    }

    public static a54 e(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("length (" + i + ") must be >= 1");
        }
        if (i == 1) {
            return (a54) it.next();
        }
        int i2 = i >>> 1;
        a54 a54VarE = e(it, i2);
        a54 a54VarE2 = e(it, i - i2);
        if (Integer.MAX_VALUE - a54VarE.d() < a54VarE2.d()) {
            int iD = a54VarE.d();
            int iD2 = a54VarE2.d();
            throw new IllegalArgumentException(ga1.l(new StringBuilder(String.valueOf(iD).length() + 31 + String.valueOf(iD2).length()), "ByteString would be too long: ", iD, "+", iD2));
        }
        if (a54VarE2.d() == 0) {
            return a54VarE;
        }
        if (a54VarE.d() == 0) {
            return a54VarE2;
        }
        int iD3 = a54VarE2.d() + a54VarE.d();
        if (iD3 < 128) {
            int iD4 = a54VarE.d();
            int iD5 = a54VarE2.d();
            int i3 = iD4 + iD5;
            byte[] bArr = new byte[i3];
            a(0, iD4, a54VarE.d());
            a(0, iD4, i3);
            if (iD4 > 0) {
                a54VarE.f(0, 0, iD4, bArr);
            }
            a(0, iD5, a54VarE2.d());
            a(iD4, i3, i3);
            if (iD5 > 0) {
                a54VarE2.f(0, iD4, iD5, bArr);
            }
            return new y44(bArr);
        }
        if (a54VarE instanceof u64) {
            u64 u64Var = (u64) a54VarE;
            a54 a54Var = u64Var.i;
            a54 a54Var2 = u64Var.j;
            if (a54VarE2.d() + a54Var2.d() < 128) {
                int iD6 = a54Var2.d();
                int iD7 = a54VarE2.d();
                int i4 = iD6 + iD7;
                byte[] bArr2 = new byte[i4];
                a(0, iD6, a54Var2.d());
                a(0, iD6, i4);
                if (iD6 > 0) {
                    a54Var2.f(0, 0, iD6, bArr2);
                }
                a(0, iD7, a54VarE2.d());
                a(iD6, i4, i4);
                if (iD7 > 0) {
                    a54VarE2.f(0, iD6, iD7, bArr2);
                }
                return new u64(a54Var, new y44(bArr2));
            }
            if (a54Var.g() > a54Var2.g() && u64Var.l > a54VarE2.g()) {
                return new u64(a54Var, new u64(a54Var2, a54VarE2));
            }
        }
        if (iD3 >= u64.r(Math.max(a54VarE.g(), a54VarE2.g()) + 1)) {
            return new u64(a54VarE, a54VarE2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        um.I(a54VarE, arrayDeque);
        um.I(a54VarE2, arrayDeque);
        a54 u64Var2 = (a54) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            u64Var2 = new u64((a54) arrayDeque.pop(), u64Var2);
        }
        return u64Var2;
    }

    public static y44 n(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new y44(bArr2);
    }

    public static a54 o(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? g : e(arrayList.iterator(), size);
    }

    public static void q(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(ex0.j(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length()), "Index > length: ", i, ", ", i2));
        }
    }

    public abstract byte b(int i);

    public abstract byte c(int i);

    public abstract int d();

    public abstract boolean equals(Object obj);

    public abstract void f(int i, int i2, int i3, byte[] bArr);

    public abstract int g();

    public abstract boolean h();

    public final int hashCode() {
        int iK = this.f;
        if (iK == 0) {
            int iD = d();
            iK = k(iD, 0, iD);
            if (iK == 0) {
                iK = 1;
            }
            this.f = iK;
        }
        return iK;
    }

    public abstract a54 i(int i, int i2);

    public abstract void j(g54 g54Var);

    public abstract int k(int i, int i2, int i3);

    public abstract m0 l();

    @Override // java.lang.Iterable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public yq2 iterator() {
        return new w44(this);
    }

    public final byte[] p() {
        int iD = d();
        if (iD == 0) {
            return y54.b;
        }
        byte[] bArr = new byte[iD];
        f(0, 0, iD, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        String strK = d() <= 50 ? a30.k(this) : a30.k(i(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return ex0.k(sb, strK, "\">");
    }
}
