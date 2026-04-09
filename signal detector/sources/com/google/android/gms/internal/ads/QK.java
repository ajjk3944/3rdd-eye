package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class QK implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final OK f10609b = new OK(AbstractC1528mL.f15611b);

    /* renamed from: a, reason: collision with root package name */
    public int f10610a = 0;

    static {
        int i = JK.f9277a;
    }

    public static void a(int i, int i3) {
        if (((i3 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(A.f.i(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
            }
            throw new ArrayIndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i3).length()), "Index > length: ", i, ", ", i3));
        }
    }

    public static int b(int i, int i3, int i6) {
        int i7 = i3 - i;
        if ((i | i3 | i7 | (i6 - i3)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(A.f.n(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i3 < i) {
            throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i3).length()), "Beginning index larger than ending index: ", i, ", ", i3));
        }
        throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i6).length()), "End index: ", i3, " >= ", i6));
    }

    public static /* synthetic */ boolean c(byte[] bArr, int i, byte[] bArr2, int i3, int i6) {
        int i7 = i + i6;
        b(i, i7, bArr.length);
        b(i3, i6 + i3, bArr2.length);
        while (i < i7) {
            if (bArr[i] != bArr2[i3]) {
                return false;
            }
            i++;
            i3++;
        }
        return true;
    }

    public static QK l(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(A.f.h(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (QK) it.next();
        }
        int i3 = i >>> 1;
        QK qkL = l(it, i3);
        QK qkL2 = l(it, i - i3);
        if (Integer.MAX_VALUE - qkL.f() < qkL2.f()) {
            int iF = qkL.f();
            int iF2 = qkL2.f();
            throw new IllegalArgumentException(A.f.o(new StringBuilder(String.valueOf(iF).length() + 31 + String.valueOf(iF2).length()), "ByteString would be too long: ", iF, "+", iF2));
        }
        if (qkL2.f() == 0) {
            return qkL;
        }
        if (qkL.f() == 0) {
            return qkL2;
        }
        int iF3 = qkL2.f() + qkL.f();
        if (iF3 < 128) {
            int iF4 = qkL.f();
            int iF5 = qkL2.f();
            int i6 = iF4 + iF5;
            byte[] bArr = new byte[i6];
            b(0, iF4, qkL.f());
            b(0, iF4, i6);
            if (iF4 > 0) {
                qkL.h(0, bArr, 0, iF4);
            }
            b(0, iF5, qkL2.f());
            b(iF4, i6, i6);
            if (iF5 > 0) {
                qkL2.h(0, bArr, iF4, iF5);
            }
            try {
                return new OK(bArr);
            } catch (C1636oL e6) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
            }
        }
        if (qkL instanceof IL) {
            IL il = (IL) qkL;
            QK qk = il.f9089d;
            QK qk2 = il.f9090e;
            if (qkL2.f() + qk2.f() < 128) {
                int iF6 = qk2.f();
                int iF7 = qkL2.f();
                int i7 = iF6 + iF7;
                byte[] bArr2 = new byte[i7];
                b(0, iF6, qk2.f());
                b(0, iF6, i7);
                if (iF6 > 0) {
                    qk2.h(0, bArr2, 0, iF6);
                }
                b(0, iF7, qkL2.f());
                b(iF6, i7, i7);
                if (iF7 > 0) {
                    qkL2.h(0, bArr2, iF6, iF7);
                }
                try {
                    return new IL(qk, new OK(bArr2));
                } catch (C1636oL e7) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e7);
                }
            }
            if (qk.o() > qk2.o() && il.f9092g > qkL2.o()) {
                return new IL(qk, new IL(qk2, qkL2));
            }
        }
        if (iF3 >= IL.v(Math.max(qkL.o(), qkL2.o()) + 1)) {
            return new IL(qkL, qkL2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        C1476lN.w(qkL, arrayDeque);
        C1476lN.w(qkL2, arrayDeque);
        QK il2 = (QK) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            il2 = new IL((QK) arrayDeque.pop(), il2);
        }
        return il2;
    }

    public static OK r(int i, int i3, byte[] bArr) {
        try {
            return s(i, i3, bArr);
        } catch (C1636oL e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    public static OK s(int i, int i3, byte[] bArr) {
        b(i, i + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new OK(bArr2);
    }

    public static QK t(ArrayList arrayList) {
        int size;
        if (A.f.y(arrayList)) {
            size = arrayList.size();
        } else {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        }
        return size == 0 ? f10609b : l(arrayList.iterator(), size);
    }

    public abstract byte d(int i);

    public abstract byte e(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QK)) {
            return false;
        }
        QK qk = (QK) obj;
        int iF = f();
        if (iF != qk.f()) {
            return false;
        }
        if (iF == 0) {
            return true;
        }
        int i = this.f10610a;
        int i3 = qk.f10610a;
        if (i == 0 || i3 == 0 || i == i3) {
            return k(qk);
        }
        return false;
    }

    public abstract int f();

    public abstract QK g(int i, int i3);

    public abstract void h(int i, byte[] bArr, int i3, int i6);

    public final int hashCode() {
        int iM = this.f10610a;
        if (iM == 0) {
            int iF = f();
            iM = m(iF, 0, iF);
            if (iM == 0) {
                iM = 1;
            }
            this.f10610a = iM;
        }
        return iM;
    }

    public abstract ByteBuffer i();

    public abstract void j(VK vk);

    public abstract boolean k(QK qk);

    public abstract int m(int i, int i3, int i6);

    public abstract D5.b n();

    public abstract int o();

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC1896tC iterator() {
        return new LK(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iF = f();
        String strG = f() <= 50 ? AbstractC0582Jp.g(this) : AbstractC0582Jp.g(g(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iF);
        sb.append(" contents=\"");
        return A.f.p(sb, strG, "\">");
    }

    public final byte[] u() {
        int iF = f();
        if (iF == 0) {
            return AbstractC1528mL.f15611b;
        }
        byte[] bArr = new byte[iF];
        h(0, bArr, 0, iF);
        return bArr;
    }
}
