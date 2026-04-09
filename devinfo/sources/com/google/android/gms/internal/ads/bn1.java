package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class bn1 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final zm1 f9729b = new zm1(yn1.f18812b);

    /* renamed from: a, reason: collision with root package name */
    public int f9730a = 0;

    static {
        int i4 = um1.f17262a;
    }

    public static void a(int i4, int i10) {
        if (((i10 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(d.h.q(i4, "Index < 0: ", new StringBuilder(String.valueOf(i4).length() + 11)));
            }
            throw new ArrayIndexOutOfBoundsException(je.u.q(i4, i10, "Index > length: ", ", ", new StringBuilder(String.valueOf(i4).length() + 18 + String.valueOf(i10).length())));
        }
    }

    public static int c(int i4, int i10, int i11) {
        int i12 = i10 - i4;
        if ((i4 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 21), "Beginning index: ", i4, " < 0"));
        }
        if (i10 < i4) {
            throw new IndexOutOfBoundsException(je.u.q(i4, i10, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i4).length() + 44 + String.valueOf(i10).length())));
        }
        throw new IndexOutOfBoundsException(je.u.q(i10, i11, "End index: ", " >= ", new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length())));
    }

    public static /* synthetic */ boolean d(byte[] bArr, int i4, byte[] bArr2, int i10, int i11) {
        int i12 = i4 + i11;
        c(i4, i12, bArr.length);
        c(i10, i11 + i10, bArr2.length);
        while (i4 < i12) {
            if (bArr[i4] != bArr2[i10]) {
                return false;
            }
            i4++;
            i10++;
        }
        return true;
    }

    public static bn1 p(Iterator it, int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "length (", ") must be >= 1"));
        }
        if (i4 == 1) {
            return (bn1) it.next();
        }
        int i10 = i4 >>> 1;
        bn1 bn1VarP = p(it, i10);
        bn1 bn1VarP2 = p(it, i4 - i10);
        if (Integer.MAX_VALUE - bn1VarP.i() < bn1VarP2.i()) {
            int i11 = bn1VarP.i();
            int i12 = bn1VarP2.i();
            throw new IllegalArgumentException(je.u.q(i11, i12, "ByteString would be too long: ", "+", new StringBuilder(String.valueOf(i11).length() + 31 + String.valueOf(i12).length())));
        }
        if (bn1VarP2.i() == 0) {
            return bn1VarP;
        }
        if (bn1VarP.i() == 0) {
            return bn1VarP2;
        }
        int i13 = bn1VarP2.i() + bn1VarP.i();
        if (i13 < 128) {
            int i14 = bn1VarP.i();
            int i15 = bn1VarP2.i();
            int i16 = i14 + i15;
            byte[] bArr = new byte[i16];
            c(0, i14, bn1VarP.i());
            c(0, i14, i16);
            if (i14 > 0) {
                bn1VarP.k(0, bArr, 0, i14);
            }
            c(0, i15, bn1VarP2.i());
            c(i14, i16, i16);
            if (i15 > 0) {
                bn1VarP2.k(0, bArr, i14, i15);
            }
            try {
                return new zm1(bArr);
            } catch (ao1 e2) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            }
        }
        if (bn1VarP instanceof wo1) {
            wo1 wo1Var = (wo1) bn1VarP;
            bn1 bn1Var = wo1Var.f18069d;
            bn1 bn1Var2 = wo1Var.f18070e;
            if (bn1VarP2.i() + bn1Var2.i() < 128) {
                int i17 = bn1Var2.i();
                int i18 = bn1VarP2.i();
                int i19 = i17 + i18;
                byte[] bArr2 = new byte[i19];
                c(0, i17, bn1Var2.i());
                c(0, i17, i19);
                if (i17 > 0) {
                    bn1Var2.k(0, bArr2, 0, i17);
                }
                c(0, i18, bn1VarP2.i());
                c(i17, i19, i19);
                if (i18 > 0) {
                    bn1VarP2.k(0, bArr2, i17, i18);
                }
                try {
                    return new wo1(bn1Var, new zm1(bArr2));
                } catch (ao1 e10) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
                }
            }
            if (bn1Var.s() > bn1Var2.s() && wo1Var.g > bn1VarP2.s()) {
                return new wo1(bn1Var, new wo1(bn1Var2, bn1VarP2));
            }
        }
        if (i13 >= wo1.z(Math.max(bn1VarP.s(), bn1VarP2.s()) + 1)) {
            return new wo1(bn1VarP, bn1VarP2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        yr1.v(bn1VarP, arrayDeque);
        yr1.v(bn1VarP2, arrayDeque);
        bn1 wo1Var2 = (bn1) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            wo1Var2 = new wo1((bn1) arrayDeque.pop(), wo1Var2);
        }
        return wo1Var2;
    }

    public static zm1 v(int i4, int i10, byte[] bArr) {
        try {
            return w(i4, i10, bArr);
        } catch (ao1 e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static zm1 w(int i4, int i10, byte[] bArr) {
        c(i4, i4 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i4, bArr2, 0, i10);
        return new zm1(bArr2);
    }

    public static bn1 x(ArrayList arrayList) {
        int size;
        if (a0.g.C(arrayList)) {
            size = arrayList.size();
        } else {
            int size2 = arrayList.size();
            size = 0;
            int i4 = 0;
            while (i4 < size2) {
                arrayList.get(i4);
                i4++;
                size++;
            }
        }
        return size == 0 ? f9729b : p(arrayList.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1Var = (bn1) obj;
        int i4 = i();
        if (i4 != bn1Var.i()) {
            return false;
        }
        if (i4 == 0) {
            return true;
        }
        int i10 = this.f9730a;
        int i11 = bn1Var.f9730a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return o(bn1Var);
        }
        return false;
    }

    public abstract byte f(int i4);

    public abstract byte g(int i4);

    public final int hashCode() {
        int iQ = this.f9730a;
        if (iQ == 0) {
            int i4 = i();
            iQ = q(i4, 0, i4);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f9730a = iQ;
        }
        return iQ;
    }

    public abstract int i();

    public abstract bn1 j(int i4, int i10);

    public abstract void k(int i4, byte[] bArr, int i10, int i11);

    public abstract ByteBuffer l();

    public abstract void m(hn1 hn1Var);

    public abstract boolean o(bn1 bn1Var);

    public abstract int q(int i4, int i10, int i11);

    public abstract en1 r();

    public abstract int s();

    public abstract boolean t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i4 = i();
        String strG = i() <= 50 ? mq0.g(this) : mq0.g(j(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(i4);
        sb2.append(" contents=\"");
        return d.h.w(sb2, strG, "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public h61 iterator() {
        return new wm1(this);
    }

    public final byte[] y() {
        int i4 = i();
        if (i4 == 0) {
            return yn1.f18812b;
        }
        byte[] bArr = new byte[i4];
        k(0, bArr, 0, i4);
        return bArr;
    }
}
