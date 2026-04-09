package Q4;

import Q4.g0;
import android.os.Build;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes2.dex */
public final class d0 extends g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f11185a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11186b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11187c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11188d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11189e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11191g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11192h;
    public final String i;

    public d0(int i, int i10, long j4, long j10, boolean z10, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f11185a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f11186b = str;
        this.f11187c = i10;
        this.f11188d = j4;
        this.f11189e = j10;
        this.f11190f = z10;
        this.f11191g = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f11192h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = str3;
    }

    @Override // Q4.g0.b
    public final int a() {
        return this.f11185a;
    }

    @Override // Q4.g0.b
    public final int b() {
        return this.f11187c;
    }

    @Override // Q4.g0.b
    public final long c() {
        return this.f11189e;
    }

    @Override // Q4.g0.b
    public final boolean d() {
        return this.f11190f;
    }

    @Override // Q4.g0.b
    public final String e() {
        return this.f11192h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f11185a == bVar.a() && this.f11186b.equals(bVar.f()) && this.f11187c == bVar.b() && this.f11188d == bVar.i() && this.f11189e == bVar.c() && this.f11190f == bVar.d() && this.f11191g == bVar.h() && this.f11192h.equals(bVar.e()) && this.i.equals(bVar.g());
    }

    @Override // Q4.g0.b
    public final String f() {
        return this.f11186b;
    }

    @Override // Q4.g0.b
    public final String g() {
        return this.i;
    }

    @Override // Q4.g0.b
    public final int h() {
        return this.f11191g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11185a ^ 1000003) * 1000003) ^ this.f11186b.hashCode()) * 1000003) ^ this.f11187c) * 1000003;
        long j4 = this.f11188d;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f11189e;
        return ((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f11190f ? 1231 : 1237)) * 1000003) ^ this.f11191g) * 1000003) ^ this.f11192h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // Q4.g0.b
    public final long i() {
        return this.f11188d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f11185a);
        sb.append(", model=");
        sb.append(this.f11186b);
        sb.append(", availableProcessors=");
        sb.append(this.f11187c);
        sb.append(", totalRam=");
        sb.append(this.f11188d);
        sb.append(", diskSpace=");
        sb.append(this.f11189e);
        sb.append(", isEmulator=");
        sb.append(this.f11190f);
        sb.append(", state=");
        sb.append(this.f11191g);
        sb.append(", manufacturer=");
        sb.append(this.f11192h);
        sb.append(", modelClass=");
        return B4.f.c(sb, this.i, "}");
    }
}
