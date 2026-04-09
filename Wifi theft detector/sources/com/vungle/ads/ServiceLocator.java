package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.fid.Constants;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s7.c;
import t7.b;

/* loaded from: classes3.dex */
public final class ServiceLocator {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile ServiceLocator INSTANCE;

    @NotNull
    private final Map<Class<?>, Object> cache;

    @NotNull
    private final Map<Class<?>, a> creators;

    @NotNull
    private final Context ctx;

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003R*\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/vungle/ads/ServiceLocator;", Constants.GET_INSTANCE, "(Landroid/content/Context;)Lcom/vungle/ads/ServiceLocator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ly8/h;", "inject", "(Landroid/content/Context;)Ly8/h;", "Ly8/s;", "deInit", "INSTANCE", "Lcom/vungle/ads/ServiceLocator;", "getINSTANCE$vungle_ads_release", "()Lcom/vungle/ads/ServiceLocator;", "setINSTANCE$vungle_ads_release", "(Lcom/vungle/ads/ServiceLocator;)V", "getINSTANCE$vungle_ads_release$annotations", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        @Nullable
        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        @NotNull
        public final ServiceLocator getInstance(@NotNull Context context) {
            ServiceLocator iNSTANCE$vungle_ads_release;
            kotlin.jvm.internal.p.e(context, "context");
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

        public final /* synthetic */ <T> y8.h inject(final Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
            kotlin.jvm.internal.p.i();
            return kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.ServiceLocator$Companion$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final T invoke() {
                    ServiceLocator companion = ServiceLocator.Companion.getInstance(context);
                    kotlin.jvm.internal.p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                    return companion.getService(Object.class);
                }
            });
        }

        public final void setINSTANCE$vungle_ads_release(@Nullable ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }

        private Companion() {
        }
    }

    public abstract class a {
        private final boolean isSingleton;

        public a(boolean z10) {
            this.isSingleton = z10;
        }

        public abstract Object create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }

        public /* synthetic */ a(ServiceLocator serviceLocator, boolean z10, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    public static final class b extends a {
        public b() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public BidTokenEncoder create() {
            return new BidTokenEncoder(ServiceLocator.this.ctx);
        }
    }

    public static final class c extends a {
        public c() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.util.q create() {
            return new com.vungle.ads.internal.util.q(ServiceLocator.this.ctx);
        }
    }

    public static final class d extends a {
        public d() {
            super(false);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public Downloader create() {
            return new AssetDownloader(((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getDownloaderExecutor(), (com.vungle.ads.internal.util.q) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.q.class));
        }
    }

    public static final class e extends a {
        public e(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.util.f create() {
            return new com.vungle.ads.internal.util.f();
        }
    }

    public static final class f extends a {
        public f() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public SignalManager create() {
            return new SignalManager(ServiceLocator.this.ctx);
        }
    }

    public static final class g extends a {
        public g() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.network.h create() {
            return new com.vungle.ads.internal.network.h((VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor(), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), (com.vungle.ads.internal.util.q) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.q.class), (SignalManager) ServiceLocator.this.getOrBuild(SignalManager.class));
        }
    }

    public static final class h extends a {
        public h() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.task.a create() {
            return new com.vungle.ads.internal.task.g(ServiceLocator.this.ctx, (com.vungle.ads.internal.util.q) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.q.class));
        }
    }

    public static final class i extends a {
        public i() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.task.c create() {
            return new com.vungle.ads.internal.task.h((com.vungle.ads.internal.task.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.task.a.class), ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getJobExecutor(), new com.vungle.ads.internal.task.d());
        }
    }

    public static final class j extends a {
        public j() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public VungleApiClient create() {
            return new VungleApiClient(ServiceLocator.this.ctx, (com.vungle.ads.internal.platform.d) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.platform.d.class), (t7.b) ServiceLocator.this.getOrBuild(t7.b.class));
        }
    }

    public static final class k extends a {
        public k() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.platform.d create() {
            return new AndroidPlatform(ServiceLocator.this.ctx, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getUaExecutor(), null, null, 12, null);
        }
    }

    public static final class l extends a {
        public l(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public com.vungle.ads.internal.executor.a create() {
            return new com.vungle.ads.internal.executor.d();
        }
    }

    public static final class m extends a {
        public m() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public s7.b create() {
            return new s7.b(ServiceLocator.this.ctx);
        }
    }

    public static final class n extends a {
        public n(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public c.b create() {
            return new c.b();
        }
    }

    public static final class o extends a {
        public o() {
            super(ServiceLocator.this, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public t7.b create() {
            return b.a.get$default(t7.b.Companion, ((com.vungle.ads.internal.executor.a) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.a.class)).getIoExecutor(), (com.vungle.ads.internal.util.q) ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.q.class), null, 4, null);
        }
    }

    public static final class p extends a {
        public p(ServiceLocator serviceLocator) {
            super(serviceLocator, false, 1, null);
        }

        @Override // com.vungle.ads.ServiceLocator.a
        @NotNull
        public p7.a create() {
            return new p7.b();
        }
    }

    public /* synthetic */ ServiceLocator(Context context, kotlin.jvm.internal.i iVar) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.a.class, new h());
        this.creators.put(com.vungle.ads.internal.task.c.class, new i());
        this.creators.put(VungleApiClient.class, new j());
        this.creators.put(com.vungle.ads.internal.platform.d.class, new k());
        this.creators.put(com.vungle.ads.internal.executor.a.class, new l(this));
        this.creators.put(s7.b.class, new m());
        this.creators.put(c.b.class, new n(this));
        this.creators.put(t7.b.class, new o());
        this.creators.put(p7.a.class, new p(this));
        this.creators.put(BidTokenEncoder.class, new b());
        this.creators.put(com.vungle.ads.internal.util.q.class, new c());
        this.creators.put(Downloader.class, new d());
        this.creators.put(com.vungle.ads.internal.util.f.class, new e(this));
        this.creators.put(SignalManager.class, new f());
        this.creators.put(com.vungle.ads.internal.network.h.class, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t10 = (T) this.cache.get(serviceClass);
        if (t10 != null) {
            return t10;
        }
        a aVar = this.creators.get(serviceClass);
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
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    @VisibleForTesting
    public final <T> void bindService$vungle_ads_release(@NotNull Class<?> serviceClass, T t10) {
        kotlin.jvm.internal.p.e(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t10);
    }

    public final synchronized <T> T getService(@NotNull Class<T> serviceClass) {
        kotlin.jvm.internal.p.e(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(@NotNull Class<T> serviceClass) {
        kotlin.jvm.internal.p.e(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.p.d(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
