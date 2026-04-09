package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f8990a;

    /* renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f8991b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f8992c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Class<? extends d> f8993a;

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f8994b;

        /* renamed from: c, reason: collision with root package name */
        private Object[] f8995c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f8993a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f8994b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f8995c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f8991b;
    }

    public final Object[] b() {
        return this.f8992c;
    }

    private h(a aVar) {
        this.f8990a = aVar.f8993a;
        this.f8991b = aVar.f8994b;
        this.f8992c = aVar.f8995c;
        if (this.f8990a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
