package com.bykv.vk.openvk.preload.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f6602a;

    /* renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f6603b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f6604c;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Class<? extends d> f6605a;

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f6606b;

        /* renamed from: c, reason: collision with root package name */
        private Object[] f6607c;

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
                this.f6605a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f6606b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f6607c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f6603b;
    }

    public final Object[] b() {
        return this.f6604c;
    }

    private h(a aVar) {
        this.f6602a = aVar.f6605a;
        this.f6603b = aVar.f6606b;
        this.f6604c = aVar.f6607c;
        if (this.f6602a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
