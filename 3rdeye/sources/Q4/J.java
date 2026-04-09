package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes2.dex */
public final class J extends f0.e.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f11027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11029c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11030d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11031e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11032f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11033g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11034h;
    public final String i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class a extends f0.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        public int f11035a;

        /* renamed from: b, reason: collision with root package name */
        public String f11036b;

        /* renamed from: c, reason: collision with root package name */
        public int f11037c;

        /* renamed from: d, reason: collision with root package name */
        public long f11038d;

        /* renamed from: e, reason: collision with root package name */
        public long f11039e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11040f;

        /* renamed from: g, reason: collision with root package name */
        public int f11041g;

        /* renamed from: h, reason: collision with root package name */
        public String f11042h;
        public String i;

        /* renamed from: j, reason: collision with root package name */
        public byte f11043j;

        public final J a() {
            String str;
            String str2;
            String str3;
            if (this.f11043j == 63 && (str = this.f11036b) != null && (str2 = this.f11042h) != null && (str3 = this.i) != null) {
                return new J(this.f11035a, str, this.f11037c, this.f11038d, this.f11039e, this.f11040f, this.f11041g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f11043j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f11036b == null) {
                sb.append(" model");
            }
            if ((this.f11043j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f11043j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f11043j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f11043j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f11043j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f11042h == null) {
                sb.append(" manufacturer");
            }
            if (this.i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public J(int i, String str, int i10, long j4, long j10, boolean z10, int i11, String str2, String str3) {
        this.f11027a = i;
        this.f11028b = str;
        this.f11029c = i10;
        this.f11030d = j4;
        this.f11031e = j10;
        this.f11032f = z10;
        this.f11033g = i11;
        this.f11034h = str2;
        this.i = str3;
    }

    @Override // Q4.f0.e.c
    public final int a() {
        return this.f11027a;
    }

    @Override // Q4.f0.e.c
    public final int b() {
        return this.f11029c;
    }

    @Override // Q4.f0.e.c
    public final long c() {
        return this.f11031e;
    }

    @Override // Q4.f0.e.c
    public final String d() {
        return this.f11034h;
    }

    @Override // Q4.f0.e.c
    public final String e() {
        return this.f11028b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.c)) {
            return false;
        }
        f0.e.c cVar = (f0.e.c) obj;
        return this.f11027a == cVar.a() && this.f11028b.equals(cVar.e()) && this.f11029c == cVar.b() && this.f11030d == cVar.g() && this.f11031e == cVar.c() && this.f11032f == cVar.i() && this.f11033g == cVar.h() && this.f11034h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // Q4.f0.e.c
    public final String f() {
        return this.i;
    }

    @Override // Q4.f0.e.c
    public final long g() {
        return this.f11030d;
    }

    @Override // Q4.f0.e.c
    public final int h() {
        return this.f11033g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11027a ^ 1000003) * 1000003) ^ this.f11028b.hashCode()) * 1000003) ^ this.f11029c) * 1000003;
        long j4 = this.f11030d;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f11031e;
        return ((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f11032f ? 1231 : 1237)) * 1000003) ^ this.f11033g) * 1000003) ^ this.f11034h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // Q4.f0.e.c
    public final boolean i() {
        return this.f11032f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f11027a);
        sb.append(", model=");
        sb.append(this.f11028b);
        sb.append(", cores=");
        sb.append(this.f11029c);
        sb.append(", ram=");
        sb.append(this.f11030d);
        sb.append(", diskSpace=");
        sb.append(this.f11031e);
        sb.append(", simulator=");
        sb.append(this.f11032f);
        sb.append(", state=");
        sb.append(this.f11033g);
        sb.append(", manufacturer=");
        sb.append(this.f11034h);
        sb.append(", modelClass=");
        return B4.f.c(sb, this.i, "}");
    }
}
