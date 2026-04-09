package androidx.work;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f4353i = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public NetworkType f4354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4355b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4356c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4358e;

    /* renamed from: f, reason: collision with root package name */
    public long f4359f;

    /* renamed from: g, reason: collision with root package name */
    public long f4360g;

    /* renamed from: h, reason: collision with root package name */
    public c f4361h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4362a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4363b = false;

        /* renamed from: c, reason: collision with root package name */
        public NetworkType f4364c = NetworkType.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4365d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4366e = false;

        /* renamed from: f, reason: collision with root package name */
        public long f4367f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f4368g = -1;

        /* renamed from: h, reason: collision with root package name */
        public c f4369h = new c();

        public b a() {
            return new b(this);
        }

        public a b(NetworkType networkType) {
            this.f4364c = networkType;
            return this;
        }
    }

    public b() {
        this.f4354a = NetworkType.NOT_REQUIRED;
        this.f4359f = -1L;
        this.f4360g = -1L;
        this.f4361h = new c();
    }

    public c a() {
        return this.f4361h;
    }

    public NetworkType b() {
        return this.f4354a;
    }

    public long c() {
        return this.f4359f;
    }

    public long d() {
        return this.f4360g;
    }

    public boolean e() {
        return this.f4361h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4355b == bVar.f4355b && this.f4356c == bVar.f4356c && this.f4357d == bVar.f4357d && this.f4358e == bVar.f4358e && this.f4359f == bVar.f4359f && this.f4360g == bVar.f4360g && this.f4354a == bVar.f4354a) {
            return this.f4361h.equals(bVar.f4361h);
        }
        return false;
    }

    public boolean f() {
        return this.f4357d;
    }

    public boolean g() {
        return this.f4355b;
    }

    public boolean h() {
        return this.f4356c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f4354a.hashCode() * 31) + (this.f4355b ? 1 : 0)) * 31) + (this.f4356c ? 1 : 0)) * 31) + (this.f4357d ? 1 : 0)) * 31) + (this.f4358e ? 1 : 0)) * 31;
        long j10 = this.f4359f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4360g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f4361h.hashCode();
    }

    public boolean i() {
        return this.f4358e;
    }

    public void j(c cVar) {
        this.f4361h = cVar;
    }

    public void k(NetworkType networkType) {
        this.f4354a = networkType;
    }

    public void l(boolean z10) {
        this.f4357d = z10;
    }

    public void m(boolean z10) {
        this.f4355b = z10;
    }

    public void n(boolean z10) {
        this.f4356c = z10;
    }

    public void o(boolean z10) {
        this.f4358e = z10;
    }

    public void p(long j10) {
        this.f4359f = j10;
    }

    public void q(long j10) {
        this.f4360g = j10;
    }

    public b(a aVar) {
        this.f4354a = NetworkType.NOT_REQUIRED;
        this.f4359f = -1L;
        this.f4360g = -1L;
        this.f4361h = new c();
        this.f4355b = aVar.f4362a;
        int i10 = Build.VERSION.SDK_INT;
        this.f4356c = aVar.f4363b;
        this.f4354a = aVar.f4364c;
        this.f4357d = aVar.f4365d;
        this.f4358e = aVar.f4366e;
        if (i10 >= 24) {
            this.f4361h = aVar.f4369h;
            this.f4359f = aVar.f4367f;
            this.f4360g = aVar.f4368g;
        }
    }

    public b(b bVar) {
        this.f4354a = NetworkType.NOT_REQUIRED;
        this.f4359f = -1L;
        this.f4360g = -1L;
        this.f4361h = new c();
        this.f4355b = bVar.f4355b;
        this.f4356c = bVar.f4356c;
        this.f4354a = bVar.f4354a;
        this.f4357d = bVar.f4357d;
        this.f4358e = bVar.f4358e;
        this.f4361h = bVar.f4361h;
    }
}
