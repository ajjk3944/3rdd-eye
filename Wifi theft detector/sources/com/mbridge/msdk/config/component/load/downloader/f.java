package com.mbridge.msdk.config.component.load.downloader;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private long f13524a;

    /* renamed from: b, reason: collision with root package name */
    private long f13525b;

    /* renamed from: c, reason: collision with root package name */
    private long f13526c;

    /* renamed from: d, reason: collision with root package name */
    private long f13527d;

    /* renamed from: e, reason: collision with root package name */
    private int f13528e;

    /* renamed from: f, reason: collision with root package name */
    private int f13529f;

    /* renamed from: g, reason: collision with root package name */
    private int f13530g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f13531a;

        /* renamed from: b, reason: collision with root package name */
        private long f13532b;

        /* renamed from: c, reason: collision with root package name */
        private long f13533c;

        /* renamed from: d, reason: collision with root package name */
        private long f13534d;

        /* renamed from: e, reason: collision with root package name */
        private int f13535e;

        /* renamed from: f, reason: collision with root package name */
        private int f13536f;

        /* renamed from: g, reason: collision with root package name */
        private int f13537g;

        public b() {
            this(null);
        }

        public b(f fVar) {
            this.f13531a = 20000L;
            this.f13532b = 10L;
            this.f13533c = 20000L;
            this.f13534d = 20000L;
            this.f13535e = 64;
            this.f13536f = 20;
            this.f13537g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(fVar)) {
                this.f13533c = fVar.c();
                this.f13531a = fVar.a();
                this.f13535e = fVar.f();
                this.f13534d = fVar.d();
                this.f13536f = fVar.g();
                this.f13532b = fVar.b();
                this.f13537g = fVar.e();
            }
        }

        public f a() {
            return new f(this);
        }

        public b a(int i10) {
            this.f13537g = i10;
            return this;
        }
    }

    public long a() {
        return this.f13524a;
    }

    public long b() {
        return this.f13525b;
    }

    public long c() {
        return this.f13526c;
    }

    public long d() {
        return this.f13527d;
    }

    public int e() {
        return this.f13530g;
    }

    public int f() {
        return this.f13528e;
    }

    public int g() {
        return this.f13529f;
    }

    private f(b bVar) {
        this.f13524a = bVar.f13531a;
        this.f13526c = bVar.f13533c;
        this.f13527d = bVar.f13534d;
        this.f13528e = bVar.f13535e;
        this.f13529f = bVar.f13536f;
        this.f13525b = bVar.f13532b;
        this.f13530g = bVar.f13537g;
    }
}
