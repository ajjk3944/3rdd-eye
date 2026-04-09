package me;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29236b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29237c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29239e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29240f;

    public m1(int i4, int i10, long j, long j8, boolean z3, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f29235a = i4;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f29236b = i10;
        this.f29237c = j;
        this.f29238d = j8;
        this.f29239e = z3;
        this.f29240f = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f29235a != m1Var.f29235a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f29236b != m1Var.f29236b || this.f29237c != m1Var.f29237c || this.f29238d != m1Var.f29238d || this.f29239e != m1Var.f29239e || this.f29240f != m1Var.f29240f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f29235a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f29236b) * 1000003;
        long j = this.f29237c;
        int i4 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j8 = this.f29238d;
        return ((((((((i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f29239e ? 1231 : 1237)) * 1000003) ^ this.f29240f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f29235a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f29236b);
        sb2.append(", totalRam=");
        sb2.append(this.f29237c);
        sb2.append(", diskSpace=");
        sb2.append(this.f29238d);
        sb2.append(", isEmulator=");
        sb2.append(this.f29239e);
        sb2.append(", state=");
        sb2.append(this.f29240f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return d.h.w(sb2, Build.PRODUCT, "}");
    }
}
