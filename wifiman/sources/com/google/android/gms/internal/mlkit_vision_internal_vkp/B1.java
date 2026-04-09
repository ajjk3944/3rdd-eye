package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class B1 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final B1 f35555b = new A1(AbstractC4593h2.f35692b);

    /* renamed from: a, reason: collision with root package name */
    private int f35556a = 0;

    static {
        int i10 = AbstractC4636l1.f35700a;
    }

    B1() {
    }

    public static B1 J(byte[] bArr, int i10, int i11) {
        y(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new A1(bArr2);
    }

    static void S(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int y(int i10, int i11, int i12) {
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

    protected final int C() {
        return this.f35556a;
    }

    @Override // java.lang.Iterable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC4756w1 iterator() {
        return new C4723t1(this);
    }

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int iO = this.f35556a;
        if (iO == 0) {
            int iM = m();
            iO = o(iM, 0, iM);
            if (iO == 0) {
                iO = 1;
            }
            this.f35556a = iO;
        }
        return iO;
    }

    abstract byte j(int i10);

    public abstract int m();

    protected abstract int o(int i10, int i11, int i12);

    public abstract B1 s(int i10, int i11);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m()), m() <= 50 ? U2.a(this) : U2.a(s(0, 47)).concat("..."));
    }

    abstract void v(AbstractC4712s1 abstractC4712s1);
}
