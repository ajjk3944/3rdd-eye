package com.vungle.ads;

import N7.H7;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b9.InterfaceC2000g;
import c6.C2069b;
import c6.C2070c;
import d6.C4277a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ServiceLocator.kt */
/* loaded from: classes2.dex */
public final class ServiceLocator {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, a<?>> creators;
    private final Context ctx;

    /* compiled from: ServiceLocator.kt */
    @Keep
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final ServiceLocator getInstance(Context context) {
            ServiceLocator iNSTANCE$vungle_ads_release;
            kotlin.jvm.internal.l.f(context, "context");
            ServiceLocator iNSTANCE$vungle_ads_release2 = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release2 != null) {
                return iNSTANCE$vungle_ads_release2;
            }
            synchronized (this) {
                Companion companion = ServiceLocator.Companion;
                iNSTANCE$vungle_ads_release = companion.getINSTANCE$vungle_ads_release();
                if (iNSTANCE$vungle_ads_release == null) {
                    iNSTANCE$vungle_ads_release = new ServiceLocator(context, null);
                    companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release);
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final <T> InterfaceC2000g<T> inject(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            b9.i iVar = b9.i.SYNCHRONIZED;
            throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }

        private Companion() {
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public abstract class a<T> {
        private final boolean isSingleton;

        public a(boolean z10) {
            this.isSingleton = z10;
        }

        public abstract T create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }

        public /* synthetic */ a(ServiceLocator serviceLocator, boolean z10, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? true : z10);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends a<com.vungle.ads.internal.bidding.a> {
        public b() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.bidding.a create() {
            return new com.vungle.ads.internal.bidding.a(ServiceLocator.this.ctx);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends a<com.vungle.ads.internal.util.l> {
        public c() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.util.l create() {
            return new com.vungle.ads.internal.util.l(ServiceLocator.this.ctx);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class d extends a<com.vungle.ads.internal.downloader.d> {
        public d() {
            super(false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.downloader.d create() {
            return new com.vungle.ads.internal.downloader.b(((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getDownloaderExecutor(), (com.vungle.ads.internal.util.l) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.l.class));
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends a<com.vungle.ads.internal.util.d> {
        public e(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.util.d create() {
            return new com.vungle.ads.internal.util.d();
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends a<com.vungle.ads.internal.signals.b> {
        public f() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.signals.b create() {
            return new com.vungle.ads.internal.signals.b(ServiceLocator.this.ctx);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class g extends a<com.vungle.ads.internal.task.c> {
        public g() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.task.c create() {
            return new com.vungle.ads.internal.task.l(ServiceLocator.this.ctx, (com.vungle.ads.internal.util.l) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.l.class));
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class h extends a<com.vungle.ads.internal.task.f> {
        public h() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.task.f create() {
            return new com.vungle.ads.internal.task.m((com.vungle.ads.internal.task.c) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.task.c.class), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), new com.vungle.ads.internal.task.g());
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class i extends a<com.vungle.ads.internal.network.g> {
        public i() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.network.g create() {
            return new com.vungle.ads.internal.network.g(ServiceLocator.this.ctx, (com.vungle.ads.internal.platform.b) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.platform.b.class), (C4277a) ServiceLocator.this.getOrBuild(C4277a.class));
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class j extends a<com.vungle.ads.internal.platform.b> {
        public j() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.platform.b create() {
            return new com.vungle.ads.internal.platform.a(ServiceLocator.this.ctx, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getUaExecutor());
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class k extends a<com.vungle.ads.internal.executor.a> {
        public k(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public com.vungle.ads.internal.executor.a create() {
            return new com.vungle.ads.internal.executor.d();
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class l extends a<C2069b> {
        public l() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public C2069b create() {
            return new C2069b(ServiceLocator.this.ctx);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class m extends a<C2070c.b> {
        public m(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public C2070c.b create() {
            return new C2070c.b();
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class n extends a<C4277a> {
        public n() {
            super(ServiceLocator.this, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public C4277a create() {
            return C4277a.C0439a.get$default(C4277a.Companion, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor(), (com.vungle.ads.internal.util.l) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.l.class), null, 4, null);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class o extends a<Z5.a> {
        public o(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.ads.ServiceLocator.a
        public Z5.a create() {
            return new Z5.b();
        }
    }

    public /* synthetic */ ServiceLocator(Context context, kotlin.jvm.internal.g gVar) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.c.class, new g());
        this.creators.put(com.vungle.ads.internal.task.f.class, new h());
        this.creators.put(com.vungle.ads.internal.network.g.class, new i());
        this.creators.put(com.vungle.ads.internal.platform.b.class, new j());
        this.creators.put(com.vungle.ads.internal.executor.a.class, new k(this));
        this.creators.put(C2069b.class, new l());
        this.creators.put(C2070c.b.class, new m(this));
        this.creators.put(C4277a.class, new n());
        this.creators.put(Z5.a.class, new o(this));
        this.creators.put(com.vungle.ads.internal.bidding.a.class, new b());
        this.creators.put(com.vungle.ads.internal.util.l.class, new c());
        this.creators.put(com.vungle.ads.internal.downloader.d.class, new d());
        this.creators.put(com.vungle.ads.internal.util.d.class, new e(this));
        this.creators.put(com.vungle.ads.internal.signals.b.class, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t10 = (T) this.cache.get(serviceClass);
        if (t10 != null) {
            return t10;
        }
        a<?> aVar = this.creators.get(serviceClass);
        if (aVar == null) {
            throw new IllegalArgumentException("Unknown class");
        }
        T t11 = (T) aVar.create();
        if (aVar.isSingleton()) {
            this.cache.put(serviceClass, t11);
        }
        return t11;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException(H7.o(cls, "Unknown dependency for "));
    }

    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T t10) {
        kotlin.jvm.internal.l.f(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t10);
    }

    public final synchronized <T> T getService(Class<T> serviceClass) {
        kotlin.jvm.internal.l.f(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(Class<T> serviceClass) {
        kotlin.jvm.internal.l.f(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
