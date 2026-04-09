package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f6611a;

    /* renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f6612b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f6613c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Class<? extends d> f6614a;

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f6615b;

        /* renamed from: c, reason: collision with root package name */
        private Object[] f6616c;

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
                this.f6614a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f6615b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f6616c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b5) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f6612b;
    }

    public final Object[] b() {
        return this.f6613c;
    }

    private h(a aVar) {
        this.f6611a = aVar.f6614a;
        this.f6612b = aVar.f6615b;
        this.f6613c = aVar.f6616c;
        if (this.f6611a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
