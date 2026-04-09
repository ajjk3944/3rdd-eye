package com.bykv.vk.openvk.preload.geckox.a.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f6650a;

    /* renamed from: b, reason: collision with root package name */
    final c f6651b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6652c;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0005a {

        /* renamed from: a, reason: collision with root package name */
        private int f6653a;

        /* renamed from: b, reason: collision with root package name */
        private b f6654b = b.f6656a;

        /* renamed from: c, reason: collision with root package name */
        private c f6655c;

        public final C0005a a() {
            this.f6653a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0005a a(b bVar) {
            if (bVar == null) {
                bVar = b.f6656a;
            }
            this.f6654b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0005a c0005a, byte b5) {
        this(c0005a);
    }

    public final b a() {
        return this.f6652c;
    }

    private a(C0005a c0005a) {
        this.f6650a = c0005a.f6653a;
        this.f6652c = c0005a.f6654b;
        this.f6651b = c0005a.f6655c;
    }
}
