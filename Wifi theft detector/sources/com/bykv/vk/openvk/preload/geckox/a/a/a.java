package com.bykv.vk.openvk.preload.geckox.a.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f9029a;

    /* renamed from: b, reason: collision with root package name */
    final c f9030b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9031c;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0090a {

        /* renamed from: a, reason: collision with root package name */
        private int f9032a;

        /* renamed from: b, reason: collision with root package name */
        private b f9033b = b.f9035a;

        /* renamed from: c, reason: collision with root package name */
        private c f9034c;

        public final C0090a a() {
            this.f9032a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0090a a(b bVar) {
            if (bVar == null) {
                bVar = b.f9035a;
            }
            this.f9033b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0090a c0090a, byte b10) {
        this(c0090a);
    }

    public final b a() {
        return this.f9031c;
    }

    private a(C0090a c0090a) {
        this.f9029a = c0090a.f9032a;
        this.f9031c = c0090a.f9033b;
        this.f9030b = c0090a.f9034c;
    }
}
