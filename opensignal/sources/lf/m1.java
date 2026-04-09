package lf;

import android.os.Build;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15352b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15353c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15354d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15356f;

    public m1(int i10, int i11, long j, long j7, boolean z10, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f15351a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f15352b = i11;
        this.f15353c = j;
        this.f15354d = j7;
        this.f15355e = z10;
        this.f15356f = i12;
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
        if (this.f15351a != m1Var.f15351a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f15352b != m1Var.f15352b || this.f15353c != m1Var.f15353c || this.f15354d != m1Var.f15354d || this.f15355e != m1Var.f15355e || this.f15356f != m1Var.f15356f) {
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
        int iHashCode = (((((this.f15351a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f15352b) * 1000003;
        long j = this.f15353c;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f15354d;
        return ((((((((i10 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ (this.f15355e ? 1231 : 1237)) * 1000003) ^ this.f15356f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f15351a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f15352b);
        sb2.append(", totalRam=");
        sb2.append(this.f15353c);
        sb2.append(", diskSpace=");
        sb2.append(this.f15354d);
        sb2.append(", isEmulator=");
        sb2.append(this.f15355e);
        sb2.append(", state=");
        sb2.append(this.f15356f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return w.g.j(sb2, Build.PRODUCT, "}");
    }
}
