package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class V3 implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final V3 f35128b = new C4365h4(F4.f35001b);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC4329d4 f35129c = new C4356g4();

    /* renamed from: a, reason: collision with root package name */
    private int f35130a = 0;

    static {
        new Y3();
    }

    V3() {
    }

    public static V3 C(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        return new C4365h4(f35129c.a(bArr, i10, i11));
    }

    static C4347f4 b0(int i10) {
        return new C4347f4(i10);
    }

    static /* synthetic */ int m(byte b10) {
        return b10 & 255;
    }

    static int o(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static V3 v(String str) {
        return new C4365h4(str.getBytes(F4.f35000a));
    }

    public static V3 y(byte[] bArr) {
        return C(bArr, 0, bArr.length);
    }

    abstract void F(X3 x32);

    abstract byte J(int i10);

    public abstract int S();

    protected abstract int T(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int iT = this.f35130a;
        if (iT == 0) {
            int iS = S();
            iT = T(iS, 0, iS);
            if (iT == 0) {
                iT = 1;
            }
            this.f35130a = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new Z3(this);
    }

    protected final int j() {
        return this.f35130a;
    }

    public abstract V3 s(int i10, int i11);

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(S());
        if (S() <= 50) {
            strA = I5.a(this);
        } else {
            strA = I5.a(s(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strA);
    }
}
