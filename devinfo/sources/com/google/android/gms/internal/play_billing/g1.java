package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g1 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g1 f20131c = new g1(u1.f20234b);

    /* renamed from: a, reason: collision with root package name */
    public int f20132a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20133b;

    static {
        int i4 = d1.f20101a;
    }

    public g1(byte[] bArr) {
        bArr.getClass();
        this.f20133b = bArr;
    }

    public static int f(int i4, int i10, int i11) {
        int i12 = i10 - i4;
        if ((i4 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r5.c.h(i4, "Beginning index: ", " < 0"));
        }
        if (i10 < i4) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a0.g.i(i10, i11, "End index: ", " >= "));
    }

    public static g1 g(int i4, int i10, byte[] bArr) {
        f(i4, i4 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i4, bArr2, 0, i10);
        return new g1(bArr2);
    }

    public byte a(int i4) {
        return this.f20133b[i4];
    }

    public byte c(int i4) {
        return this.f20133b[i4];
    }

    public int d() {
        return this.f20133b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g1) && d() == ((g1) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof g1)) {
                return obj.equals(this);
            }
            g1 g1Var = (g1) obj;
            int i4 = this.f20132a;
            int i10 = g1Var.f20132a;
            if (i4 == 0 || i10 == 0 || i4 == i10) {
                int iD = d();
                if (iD > g1Var.d()) {
                    throw new IllegalArgumentException("Length too large: " + iD + d());
                }
                if (iD > g1Var.d()) {
                    throw new IllegalArgumentException(a0.g.i(iD, g1Var.d(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = g1Var.f20133b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iD) {
                    if (this.f20133b[i11] == bArr[i12]) {
                        i11++;
                        i12++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f20132a;
        if (i4 != 0) {
            return i4;
        }
        int iD = d();
        int i10 = iD;
        for (int i11 = 0; i11 < iD; i11++) {
            i10 = (i10 * 31) + this.f20133b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f20132a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = a.a.x(this);
        } else {
            int iF = f(0, 47, d());
            strConcat = a.a.x(iF == 0 ? f20131c : new f1(this.f20133b, iF)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iD);
        sb2.append(" contents=\"");
        return d.h.w(sb2, strConcat, "\">");
    }
}
