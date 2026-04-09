package com.vungle.ads.internal;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import a6.C1653b;
import a6.C1656e;
import a6.C1661j;
import android.content.Context;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2069b;
import c9.C2092m;
import com.vungle.ads.C;
import com.vungle.ads.C4046d;
import com.vungle.ads.C4047e;
import com.vungle.ads.C4049g;
import com.vungle.ads.C4050h;
import com.vungle.ads.C4055m;
import com.vungle.ads.C4063v;
import com.vungle.ads.G;
import com.vungle.ads.I;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleAds;
import com.vungle.ads.W;
import com.vungle.ads.X;
import com.vungle.ads.c0;
import com.vungle.ads.f0;
import com.vungle.ads.i0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.a;
import com.vungle.ads.k0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;

/* compiled from: AdInternal.kt */
/* loaded from: classes2.dex */
public abstract class a implements com.vungle.ads.internal.load.a {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private EnumC0369a adState;
    private C1653b advertisement;
    private com.vungle.ads.internal.load.c baseAdLoader;
    private C1656e bidPayload;
    private final Context context;
    private C1661j placement;
    private WeakReference<Context> playContext;
    private f0 requestMetric;
    private final InterfaceC2000g signalManager$delegate;
    private final InterfaceC2000g vungleApiClient$delegate;
    public static final c Companion = new c(null);
    private static final AbstractC1564a json = t.a(b.INSTANCE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdInternal.kt */
    /* renamed from: com.vungle.ads.internal.a$a, reason: collision with other inner class name */
    public static final class EnumC0369a {
        public static final EnumC0369a NEW = new d("NEW", 0);
        public static final EnumC0369a LOADING = new c("LOADING", 1);
        public static final EnumC0369a READY = new f("READY", 2);
        public static final EnumC0369a PLAYING = new e("PLAYING", 3);
        public static final EnumC0369a FINISHED = new b("FINISHED", 4);
        public static final EnumC0369a ERROR = new C0370a("ERROR", 5);
        private static final /* synthetic */ EnumC0369a[] $VALUES = $values();

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$a, reason: collision with other inner class name */
        public static final class C0370a extends EnumC0369a {
            public C0370a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return adState == EnumC0369a.FINISHED;
            }
        }

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$b */
        public static final class b extends EnumC0369a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return false;
            }
        }

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$c */
        public static final class c extends EnumC0369a {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return adState == EnumC0369a.READY || adState == EnumC0369a.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$d */
        public static final class d extends EnumC0369a {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return adState == EnumC0369a.LOADING || adState == EnumC0369a.READY || adState == EnumC0369a.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$e */
        public static final class e extends EnumC0369a {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return adState == EnumC0369a.FINISHED || adState == EnumC0369a.ERROR;
            }
        }

        /* compiled from: AdInternal.kt */
        /* renamed from: com.vungle.ads.internal.a$a$f */
        public static final class f extends EnumC0369a {
            public f(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0369a
            public boolean canTransitionTo(EnumC0369a adState) {
                kotlin.jvm.internal.l.f(adState, "adState");
                return adState == EnumC0369a.PLAYING || adState == EnumC0369a.FINISHED || adState == EnumC0369a.ERROR;
            }
        }

        private static final /* synthetic */ EnumC0369a[] $values() {
            return new EnumC0369a[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        public /* synthetic */ EnumC0369a(String str, int i, kotlin.jvm.internal.g gVar) {
            this(str, i);
        }

        public static EnumC0369a valueOf(String str) {
            return (EnumC0369a) Enum.valueOf(EnumC0369a.class, str);
        }

        public static EnumC0369a[] values() {
            return (EnumC0369a[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(EnumC0369a enumC0369a);

        public final boolean isTerminalState() {
            return C2092m.W(FINISHED, ERROR).contains(this);
        }

        public final EnumC0369a transitionTo(EnumC0369a adState) {
            kotlin.jvm.internal.l.f(adState, "adState");
            if (this == adState || canTransitionTo(adState)) {
                return adState;
            }
            String str = "Cannot transition from " + name() + " to " + adState.name();
            if (a.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            com.vungle.ads.internal.util.k.Companion.e(a.TAG, "Illegal state transition", new IllegalStateException(str));
            return adState;
        }

        private EnumC0369a(String str, int i) {
        }
    }

    /* compiled from: AdInternal.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<C1568e, C1992A> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    /* compiled from: AdInternal.kt */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        private c() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* compiled from: AdInternal.kt */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0369a.values().length];
            iArr[EnumC0369a.NEW.ordinal()] = 1;
            iArr[EnumC0369a.LOADING.ordinal()] = 2;
            iArr[EnumC0369a.READY.ordinal()] = 3;
            iArr[EnumC0369a.PLAYING.ordinal()] = 4;
            iArr[EnumC0369a.FINISHED.ordinal()] = 5;
            iArr[EnumC0369a.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.task.f> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.f, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.task.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.f.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<C2069b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c6.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C2069b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C2069b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class g extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.d> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class h extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class i extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.downloader.d> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.d, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.downloader.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.downloader.d.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class j extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.d> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class k extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
        }
    }

    /* compiled from: AdInternal.kt */
    public static final class l extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.vungle.ads.internal.presenter.b bVar, a aVar) {
            super(bVar);
            this.this$0 = aVar;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            this.this$0.setAdState(EnumC0369a.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            this.this$0.setAdState(EnumC0369a.PLAYING);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(k0 error) {
            kotlin.jvm.internal.l.f(error, "error");
            this.this$0.setAdState(EnumC0369a.ERROR);
            super.onFailure(error);
        }
    }

    /* compiled from: AdInternal.kt */
    public static final class m extends com.vungle.ads.internal.presenter.a {
        public m(com.vungle.ads.internal.presenter.b bVar, C1661j c1661j) {
            super(bVar, c1661j);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class n extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class o extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    public a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
        this.adState = EnumC0369a.NEW;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        this.vungleApiClient$delegate = C2001h.a(iVar, new n(context));
        this.signalManager$delegate = C2001h.a(iVar, new o(context));
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.task.f m26_set_adState_$lambda1$lambda0(InterfaceC2000g<? extends com.vungle.ads.internal.task.f> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public static /* synthetic */ k0 canPlayAd$default(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return aVar.canPlayAd(z10);
    }

    private final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.g getVungleApiClient() {
        return (com.vungle.ads.internal.network.g) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final C2069b m27loadAd$lambda2(InterfaceC2000g<C2069b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m28loadAd$lambda3(InterfaceC2000g<com.vungle.ads.internal.executor.d> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.util.l m29loadAd$lambda4(InterfaceC2000g<com.vungle.ads.internal.util.l> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.downloader.d m30loadAd$lambda5(InterfaceC2000g<? extends com.vungle.ads.internal.downloader.d> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m31onSuccess$lambda9$lambda6(InterfaceC2000g<com.vungle.ads.internal.executor.d> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.util.l m32onSuccess$lambda9$lambda7(InterfaceC2000g<com.vungle.ads.internal.util.l> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
    }

    public final k0 canPlayAd(boolean z10) {
        k0 g10;
        C1653b c1653b = this.advertisement;
        if (c1653b == null) {
            g10 = new C4050h();
        } else if (c1653b == null || !c1653b.hasExpired()) {
            EnumC0369a enumC0369a = this.adState;
            if (enumC0369a == EnumC0369a.PLAYING) {
                g10 = new C4063v();
            } else {
                if (enumC0369a == EnumC0369a.READY) {
                    return null;
                }
                g10 = new G(0, null, null, null, null, null, 63, null);
            }
        } else {
            g10 = z10 ? new C4047e() : new C4046d();
        }
        if (z10) {
            C1661j c1661j = this.placement;
            k0 placementId$vungle_ads_release = g10.setPlacementId$vungle_ads_release(c1661j != null ? c1661j.getReferenceId() : null);
            C1653b c1653b2 = this.advertisement;
            k0 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(c1653b2 != null ? c1653b2.getCreativeId() : null);
            C1653b c1653b3 = this.advertisement;
            creativeId$vungle_ads_release.setEventId$vungle_ads_release(c1653b3 != null ? c1653b3.eventId() : null).logErrorNoReturnValue$vungle_ads_release();
        }
        return g10;
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.load.c cVar = this.baseAdLoader;
        if (cVar != null) {
            cVar.cancel();
        }
    }

    public abstract i0 getAdSizeForAdRequest();

    public final EnumC0369a getAdState() {
        return this.adState;
    }

    public final C1653b getAdvertisement() {
        return this.advertisement;
    }

    public final C1656e getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final C1661j getPlacement() {
        return this.placement;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == EnumC0369a.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(i0 i0Var);

    public abstract boolean isValidAdTypeForPlacement(C1661j c1661j);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String, kotlin.jvm.internal.g] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void loadAd(String placementId, String str, com.vungle.ads.internal.load.a adLoaderCallback) {
        int i10;
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        if (!VungleAds.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new c0());
            return;
        }
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        C1661j placement = fVar.getPlacement(placementId);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new W(placement.getReferenceId()).logError$vungle_ads_release());
                return;
            }
            if ((placement.getHeaderBidding() && (str == null || str.length() == 0)) || (!placement.getHeaderBidding() && str != null && str.length() != 0)) {
                adLoaderCallback.onFailure(new I(placementId).logError$vungle_ads_release());
                return;
            }
        } else if (fVar.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new X(placementId).logError$vungle_ads_release());
            return;
        } else {
            C1661j c1661j = new C1661j(placementId, false, (String) null, 6, (kotlin.jvm.internal.g) null);
            this.placement = c1661j;
            placement = c1661j;
        }
        i0 adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new C(k0.INVALID_SIZE, str, 2, str));
            return;
        }
        EnumC0369a enumC0369a = this.adState;
        if (enumC0369a != EnumC0369a.NEW) {
            switch (d.$EnumSwitchMapping$0[enumC0369a.ordinal()]) {
                case 1:
                    throw new b9.k(0);
                case 2:
                    i10 = 203;
                    break;
                case 3:
                    i10 = 204;
                    break;
                case 4:
                    i10 = 205;
                    break;
                case 5:
                    i10 = 202;
                    break;
                case 6:
                    i10 = 206;
                    break;
                default:
                    throw new b9.j();
            }
            Sdk$SDKError.b bVarCodeToLoggableReason = k0.Companion.codeToLoggableReason(i10);
            String str2 = this.adState + " state is incorrect for load";
            C1653b c1653b = this.advertisement;
            String creativeId = c1653b != null ? c1653b.getCreativeId() : null;
            C1653b c1653b2 = this.advertisement;
            adLoaderCallback.onFailure(new G(k0.INVALID_AD_STATE, bVarCodeToLoggableReason, str2, placementId, creativeId, c1653b2 != null ? c1653b2.eventId() : null).logError$vungle_ads_release());
            return;
        }
        f0 f0Var = new f0(Sdk$SDKMetric.b.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = f0Var;
        f0Var.markStart();
        if (str != null && str.length() != 0) {
            try {
                AbstractC1564a abstractC1564a = json;
                this.bidPayload = (C1656e) abstractC1564a.a(u.L(abstractC1564a.f11782b, x.b(C1656e.class)), str);
            } catch (IllegalArgumentException e4) {
                C4055m c4055m = C4055m.INSTANCE;
                String str3 = "Unable to decode payload into BidPayload object. Error: " + e4.getLocalizedMessage();
                C1653b c1653b3 = this.advertisement;
                C4055m.logError$vungle_ads_release$default(c4055m, 213, str3, placementId, (String) null, c1653b3 != null ? c1653b3.eventId() : null, 8, (Object) null);
                adLoaderCallback.onFailure(new C4049g());
                return;
            } catch (Throwable th) {
                C4055m c4055m2 = C4055m.INSTANCE;
                String str4 = "Unable to decode payload into BidPayload object. Error: " + th.getLocalizedMessage();
                C1653b c1653b4 = this.advertisement;
                C4055m.logError$vungle_ads_release$default(c4055m2, 209, str4, placementId, (String) null, c1653b4 != null ? c1653b4.eventId() : 0, 8, (Object) null);
                adLoaderCallback.onFailure(new C4049g());
                return;
            }
        }
        setAdState(EnumC0369a.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        b9.i iVar = b9.i.SYNCHRONIZED;
        InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new f(context));
        InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new g(this.context));
        InterfaceC2000g interfaceC2000gA3 = C2001h.a(iVar, new h(this.context));
        InterfaceC2000g interfaceC2000gA4 = C2001h.a(iVar, new i(this.context));
        if (str == null || str.length() == 0) {
            com.vungle.ads.internal.load.d dVar = new com.vungle.ads.internal.load.d(this.context, getVungleApiClient(), m28loadAd$lambda3(interfaceC2000gA2), m27loadAd$lambda2(interfaceC2000gA), m30loadAd$lambda5(interfaceC2000gA4), m29loadAd$lambda4(interfaceC2000gA3), new com.vungle.ads.internal.load.b(placement, null, adSizeForAdRequest));
            this.baseAdLoader = dVar;
            dVar.loadAd(this);
        } else {
            com.vungle.ads.internal.load.g gVar = new com.vungle.ads.internal.load.g(this.context, getVungleApiClient(), m28loadAd$lambda3(interfaceC2000gA2), m27loadAd$lambda2(interfaceC2000gA), m30loadAd$lambda5(interfaceC2000gA4), m29loadAd$lambda4(interfaceC2000gA3), new com.vungle.ads.internal.load.b(placement, this.bidPayload, adSizeForAdRequest));
            this.baseAdLoader = gVar;
            gVar.loadAd(this);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(k0 error) {
        kotlin.jvm.internal.l.f(error, "error");
        setAdState(EnumC0369a.ERROR);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(C1653b advertisement) throws Throwable {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(EnumC0369a.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        f0 f0Var = this.requestMetric;
        if (f0Var != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                f0Var.setMetricType(Sdk$SDKMetric.b.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            f0Var.markEnd();
            C4055m c4055m = C4055m.INSTANCE;
            C1661j c1661j = this.placement;
            C4055m.logMetric$vungle_ads_release$default(c4055m, f0Var, c1661j != null ? c1661j.getReferenceId() : null, advertisement.getCreativeId(), advertisement.eventId(), (String) null, 16, (Object) null);
            long jCalculateIntervalDuration = f0Var.calculateIntervalDuration();
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context = this.context;
            b9.i iVar = b9.i.SYNCHRONIZED;
            InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new j(context));
            InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new k(this.context));
            List tpatUrls$default = C1653b.getTpatUrls$default(advertisement, com.vungle.ads.internal.g.AD_LOAD_DURATION_TPAT_KEY, String.valueOf(jCalculateIntervalDuration), null, 4, null);
            if (tpatUrls$default != null) {
                new com.vungle.ads.internal.network.e(getVungleApiClient(), advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), m31onSuccess$lambda9$lambda6(interfaceC2000gA).getIoExecutor(), m32onSuccess$lambda9$lambda7(interfaceC2000gA2), getSignalManager()).sendTpats(tpatUrls$default, m31onSuccess$lambda9$lambda6(interfaceC2000gA).getJobExecutor());
            }
        }
    }

    public final void play(Context context, com.vungle.ads.internal.presenter.b adPlayCallback) {
        kotlin.jvm.internal.l.f(adPlayCallback, "adPlayCallback");
        this.playContext = context != null ? new WeakReference<>(context) : null;
        k0 k0VarCanPlayAd = canPlayAd(true);
        if (k0VarCanPlayAd != null) {
            adPlayCallback.onFailure(k0VarCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(k0VarCanPlayAd.getCode())) {
                setAdState(EnumC0369a.ERROR);
                return;
            }
            return;
        }
        C1653b c1653b = this.advertisement;
        if (c1653b == null) {
            return;
        }
        l lVar = new l(adPlayCallback, this);
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(lVar, c1653b);
    }

    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.b bVar, C1653b advertisement) {
        Context context;
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        a.C0394a c0394a = com.vungle.ads.internal.ui.a.Companion;
        c0394a.setEventListener$vungle_ads_release(new m(bVar, this.placement));
        c0394a.setAdvertisement$vungle_ads_release(advertisement);
        c0394a.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        kotlin.jvm.internal.l.e(context, "playContext?.get() ?: context");
        C1661j c1661j = this.placement;
        if (c1661j == null) {
            return;
        }
        com.vungle.ads.internal.util.b.Companion.startWhenForeground(context, null, c0394a.createIntent(context, c1661j.getReferenceId(), advertisement.eventId()), null);
    }

    public final void setAdState(EnumC0369a value) {
        C1653b c1653b;
        String strEventId;
        kotlin.jvm.internal.l.f(value, "value");
        if (value.isTerminalState() && (c1653b = this.advertisement) != null && (strEventId = c1653b.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            m26_set_adState_$lambda1$lambda0(C2001h.a(b9.i.SYNCHRONIZED, new e(this.context))).execute(com.vungle.ads.internal.task.a.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
    }

    public final void setAdvertisement(C1653b c1653b) {
        this.advertisement = c1653b;
    }

    public final void setBidPayload(C1656e c1656e) {
        this.bidPayload = c1656e;
    }

    public final void setPlacement(C1661j c1661j) {
        this.placement = c1661j;
    }
}
