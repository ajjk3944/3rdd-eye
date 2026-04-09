package com.google.android.gms.internal.consent_sdk;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class p5 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final p5 f19462c = new p5(a6.f19265b);

    /* renamed from: a, reason: collision with root package name */
    public int f19463a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19464b;

    static {
        int i4 = n5.f19444a;
    }

    public p5(byte[] bArr) {
        bArr.getClass();
        this.f19464b = bArr;
    }

    public static void g(int i4) {
        if (((i4 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(je.u.r(i4, "End index: 47 >= "));
        }
    }

    public byte a(int i4) {
        return this.f19464b[i4];
    }

    public byte c(int i4) {
        return this.f19464b[i4];
    }

    public int d() {
        return this.f19464b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        int iD = d();
        if (iD != p5Var.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i4 = this.f19463a;
        int i10 = p5Var.f19463a;
        if (i4 == 0 || i10 == 0 || i4 == i10) {
            return f(p5Var);
        }
        return false;
    }

    public final boolean f(p5 p5Var) {
        if (!(p5Var instanceof p5)) {
            return p5Var.f(this);
        }
        int iD = d();
        if (iD > p5Var.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > p5Var.d()) {
            throw new IllegalArgumentException(a0.g.i(iD, p5Var.d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = p5Var.f19464b;
        int i4 = 0;
        int i10 = 0;
        while (i4 < iD) {
            if (this.f19464b[i4] != bArr[i10]) {
                return false;
            }
            i4++;
            i10++;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.f19463a;
        if (i4 != 0) {
            return i4;
        }
        int iD = d();
        int i10 = iD;
        for (int i11 = 0; i11 < iD; i11++) {
            i10 = (i10 * 31) + this.f19464b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f19463a = i10;
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
            strConcat = f0.b(this);
        } else {
            g(d());
            byte[] bArr = this.f19464b;
            o5 o5Var = new o5(bArr);
            g(bArr.length);
            strConcat = f0.b(o5Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iD);
        sb2.append(" contents=\"");
        return d.h.w(sb2, strConcat, "\">");
    }
}
