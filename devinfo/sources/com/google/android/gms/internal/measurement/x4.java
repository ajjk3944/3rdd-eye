package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class x4 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final x4 f20031c = new x4(n5.f19844b);

    /* renamed from: a, reason: collision with root package name */
    public int f20032a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20033b;

    static {
        int i4 = u4.f19947a;
    }

    public x4(byte[] bArr) {
        bArr.getClass();
        this.f20033b = bArr;
    }

    public static x4 f(int i4, int i10, byte[] bArr) {
        g(i4, i4 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i4, bArr2, 0, i10);
        return new x4(bArr2);
    }

    public static int g(int i4, int i10, int i11) {
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

    public byte a(int i4) {
        return this.f20033b[i4];
    }

    public byte c(int i4) {
        return this.f20033b[i4];
    }

    public int d() {
        return this.f20033b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x4) && d() == ((x4) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof x4)) {
                return obj.equals(this);
            }
            x4 x4Var = (x4) obj;
            int i4 = this.f20032a;
            int i10 = x4Var.f20032a;
            if (i4 == 0 || i10 == 0 || i4 == i10) {
                int iD = d();
                if (iD > x4Var.d()) {
                    int iD2 = d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
                    sb2.append("Length too large: ");
                    sb2.append(iD);
                    sb2.append(iD2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (iD > x4Var.d()) {
                    int iD3 = x4Var.d();
                    throw new IllegalArgumentException(je.u.q(iD, iD3, "Ran off end of other: 0, ", ", ", new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length())));
                }
                byte[] bArr = x4Var.f20033b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iD) {
                    if (this.f20033b[i11] == bArr[i12]) {
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
        int i4 = this.f20032a;
        if (i4 != 0) {
            return i4;
        }
        int iD = d();
        int i10 = iD;
        for (int i11 = 0; i11 < iD; i11++) {
            i10 = (i10 * 31) + this.f20033b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f20032a = i10;
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
            strConcat = d5.A(this);
        } else {
            int iG = g(0, 47, d());
            strConcat = d5.A(iG == 0 ? f20031c : new w4(this.f20033b, iG)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iD);
        sb2.append(" contents=\"");
        return d.h.w(sb2, strConcat, "\">");
    }
}
