package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ah1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.y61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class p81 {

    /* renamed from: A, reason: collision with root package name */
    private final i62 f31639A;

    /* renamed from: B, reason: collision with root package name */
    private final hc1 f31640B;

    /* renamed from: C, reason: collision with root package name */
    private final fv f31641C;

    /* renamed from: D, reason: collision with root package name */
    private final g51 f31642D;

    /* renamed from: E, reason: collision with root package name */
    private final String f31643E;

    /* renamed from: F, reason: collision with root package name */
    private final u21 f31644F;

    /* renamed from: G, reason: collision with root package name */
    private final b62 f31645G;

    /* renamed from: H, reason: collision with root package name */
    private final C4210u2 f31646H;

    /* renamed from: I, reason: collision with root package name */
    private final vo f31647I;

    /* renamed from: J, reason: collision with root package name */
    private final hg f31648J;

    /* renamed from: K, reason: collision with root package name */
    private x61 f31649K;

    /* renamed from: L, reason: collision with root package name */
    private final ah1.b f31650L;

    /* renamed from: M, reason: collision with root package name */
    private final List<w20> f31651M;

    /* renamed from: N, reason: collision with root package name */
    private final c91 f31652N;

    /* renamed from: a, reason: collision with root package name */
    private final Context f31653a;

    /* renamed from: b, reason: collision with root package name */
    private final v41 f31654b;

    /* renamed from: c, reason: collision with root package name */
    private final tb1 f31655c;

    /* renamed from: d, reason: collision with root package name */
    private final ca1 f31656d;

    /* renamed from: e, reason: collision with root package name */
    private final vb1 f31657e;

    /* renamed from: f, reason: collision with root package name */
    private final j51 f31658f;

    /* renamed from: g, reason: collision with root package name */
    private final C4072a3 f31659g;

    /* renamed from: h, reason: collision with root package name */
    private final a8<?> f31660h;
    private final p61 i;

    /* renamed from: j, reason: collision with root package name */
    private final nx1 f31661j;

    /* renamed from: k, reason: collision with root package name */
    private final j81 f31662k;

    /* renamed from: l, reason: collision with root package name */
    private final rt f31663l;

    /* renamed from: m, reason: collision with root package name */
    private final u32 f31664m;

    /* renamed from: n, reason: collision with root package name */
    private final ck0 f31665n;

    /* renamed from: o, reason: collision with root package name */
    private final vl f31666o;

    /* renamed from: p, reason: collision with root package name */
    private final y61 f31667p;

    /* renamed from: q, reason: collision with root package name */
    private final cx0 f31668q;

    /* renamed from: r, reason: collision with root package name */
    private final ng f31669r;

    /* renamed from: s, reason: collision with root package name */
    private final gk0 f31670s;

    /* renamed from: t, reason: collision with root package name */
    private final po1 f31671t;

    /* renamed from: u, reason: collision with root package name */
    private final ll f31672u;

    /* renamed from: v, reason: collision with root package name */
    private final f70 f31673v;

    /* renamed from: w, reason: collision with root package name */
    private final y31 f31674w;

    /* renamed from: x, reason: collision with root package name */
    private final zn1 f31675x;

    /* renamed from: y, reason: collision with root package name */
    private final g70 f31676y;

    /* renamed from: z, reason: collision with root package name */
    private final yg f31677z;

    public final class a implements ah1.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ah1.b
        public final void a(xg1 phoneState) {
            kotlin.jvm.internal.l.f(phoneState, "phoneState");
            boolean z10 = !p81.this.f().b();
            phoneState.toString();
            a.class.toString();
            fp0.d(new Object[0]);
            p81.this.f31644F.a(phoneState, z10);
        }
    }

    public final class b implements w52 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.w52
        public final a92 a(int i) {
            return p81.this.f().b(p81.this.f31653a, i);
        }

        @Override // com.yandex.mobile.ads.impl.w52
        public final a92 b(int i) {
            return p81.this.f().a(p81.this.f31653a, i);
        }
    }

    public /* synthetic */ p81(Context context, el elVar, v41 v41Var) {
        InterfaceC4143k4 interfaceC4143k4;
        ir0 ir0VarE;
        tb1 tb1VarH = elVar.h();
        ca1 ca1VarG = elVar.g();
        vb1 vb1VarI = elVar.i();
        j41 j41VarD = elVar.d();
        vu1 vu1VarJ = elVar.j();
        j51 j51VarE = elVar.e();
        h81 h81VarC = elVar.c();
        ea eaVarB = elVar.b();
        w31 w31VarF = elVar.f();
        e9 e9VarA = elVar.a();
        C4072a3 c4072a3A = j41VarD.a();
        ns nsVarB = c4072a3A.b();
        a8<?> a8VarB = j41VarD.b();
        p61 p61VarC = j41VarD.c();
        List<ag<?>> listB = vb1VarI.b();
        String strA = vb1VarI.a();
        nx1 nx1VarH = p61VarC.h();
        j81 j81Var = new j81();
        rt rtVar = new rt(j81Var);
        u32 u32Var = new u32();
        ck0 ck0Var = new ck0();
        jd1 jd1Var = new jd1();
        ah1 ah1VarA = ah1.f24667h.a(context);
        ro1 ro1Var = new ro1();
        vl vlVar = new vl();
        ek0 ek0Var = new ek0();
        InterfaceC4143k4 interfaceC4143k4A = j51VarE.a();
        y61 y61VarA = y61.a.a();
        cx0 cx0Var = new cx0(context, c4072a3A);
        g71 g71Var = new g71(ca1VarG);
        g7 g7Var = new g7(g71Var, eaVarB);
        ng ngVar = new ng(listB);
        d91 d91Var = new d91(ngVar);
        gk0 gk0Var = new gk0(context, a8VarB, c4072a3A, vb1VarI.c());
        po1 po1Var = new po1(listB);
        ll llVar = new ll(interfaceC4143k4A, nsVarB, a8VarB, strA, c4072a3A.q().c());
        f70 f70Var = new f70(context, c4072a3A, interfaceC4143k4A, nsVarB, a8VarB, strA);
        y31 y31Var = new y31(context, c4072a3A, interfaceC4143k4A, nsVarB, strA);
        zn1 zn1Var = new zn1(context, c4072a3A, interfaceC4143k4A, nsVarB, a8VarB, strA);
        g70 g70Var = new g70(listB);
        yg ygVar = new yg(listB);
        q51 q51Var = new q51(strA);
        C4101e4 c4101e4 = new C4101e4(q51Var);
        i62 i62Var = new i62();
        if (w31VarF != null) {
            interfaceC4143k4 = interfaceC4143k4A;
            ir0VarE = w31VarF.e();
        } else {
            interfaceC4143k4 = interfaceC4143k4A;
            ir0VarE = null;
        }
        this(context, elVar, v41Var, tb1VarH, ca1VarG, vb1VarI, j41VarD, vu1VarJ, j51VarE, h81VarC, eaVarB, w31VarF, e9VarA, c4072a3A, nsVarB, a8VarB, p61VarC, listB, nx1VarH, j81Var, rtVar, u32Var, ck0Var, jd1Var, ah1VarA, ro1Var, vlVar, ek0Var, interfaceC4143k4, y61VarA, cx0Var, g71Var, g7Var, ngVar, d91Var, gk0Var, po1Var, llVar, f70Var, y31Var, zn1Var, g70Var, ygVar, q51Var, c4101e4, i62Var, new hc1(c4072a3A, a8VarB, listB, ir0VarE), new fv(context, c4072a3A, w31VarF != null ? w31VarF.e() : null));
    }

    public final List<w20> c() {
        return this.f31651M;
    }

    public final void destroy() {
        x61 x61Var = this.f31649K;
        if (x61Var != null) {
            x61Var.b();
        }
    }

    public final a8<?> e() {
        return this.f31660h;
    }

    public final ca1 f() {
        return this.f31656d;
    }

    public final vb1 g() {
        return this.f31657e;
    }

    public rt getNativeAdVideoController() {
        return this.f31663l;
    }

    public final void h() {
        j();
        this.f31639A.a(this.f31653a);
        x61 x61Var = this.f31649K;
        if (x61Var != null) {
            this.f31655c.a(x61Var);
            this.f31645G.a(x61Var);
            this.f31677z.a(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.x61 r0 = r4.f31649K
            r1 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.e()
            if (r0 == 0) goto L13
            boolean r0 = r0.isAttachedToWindow()
            r2 = 1
            if (r0 != r2) goto L13
            goto L14
        L13:
            r2 = r1
        L14:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.d(r0)
            if (r2 == 0) goto L26
            com.yandex.mobile.ads.impl.b62 r0 = r4.f31645G
            android.content.Context r1 = r4.f31653a
            com.yandex.mobile.ads.impl.ah1$b r2 = r4.f31650L
            com.yandex.mobile.ads.impl.x61 r3 = r4.f31649K
            r0.a(r1, r2, r3)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p81.i():void");
    }

    public final void j() {
        fp0.d(new Object[0]);
        this.f31645G.a(this.f31653a, this.f31650L);
    }

    public abstract void loadImages();

    public final void a(View nativeAdView, ej0 imageProvider, i71 nativeAdWeakViewHolder, xo clickListenerFactory, oo clickConnector) throws v51 {
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        kotlin.jvm.internal.l.f(clickListenerFactory, "clickListenerFactory");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        y61 y61VarA = y61.a.a();
        p81 p81VarA = y61VarA.a(nativeAdView);
        if (equals(p81VarA)) {
            return;
        }
        if (p81VarA != null) {
            p81VarA.h();
        }
        if (y61VarA.a(this)) {
            h();
        }
        y61VarA.a(nativeAdView, this);
        x61 x61Var = new x61(nativeAdWeakViewHolder, this.f31659g, imageProvider, this.f31665n, clickListenerFactory, this.f31658f, this.f31669r, this.f31652N, this.f31662k, this.f31660h, this.f31657e, this.f31654b, this.f31668q, this.f31661j, this.f31641C);
        x61Var.a();
        this.f31649K = x61Var;
        this.f31677z.a(x61Var);
        this.f31656d.a(x61Var);
        this.f31655c.a(x61Var);
        clickConnector.a(this.f31648J.a(clickListenerFactory, x61Var));
        b(x61Var);
        this.f31639A.a(nativeAdView, new q81(this));
    }

    public final c91 b() {
        return this.f31652N;
    }

    private final void b(x61 x61Var) throws v51 {
        this.f31655c.a(x61Var, this.f31647I);
        boolean z10 = kotlin.jvm.internal.l.b(this.f31660h.E(), s81.f32895c.a()) || kotlin.jvm.internal.l.b(this.f31660h.E(), s81.f32896d.a());
        if (this.f31640B.a() && !z10) {
            loadImages();
        }
        this.f31674w.a(this.f31671t.a(x61Var), ip1.b.f28783I);
        fp0.d(new Object[0]);
        i();
    }

    public final void a(View nativeAdView, ej0 imageProvider, i71 nativeAdWeakViewHolder, xo clickListenerFactory) throws v51 {
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        kotlin.jvm.internal.l.f(clickListenerFactory, "clickListenerFactory");
        p81 p81VarA = this.f31667p.a(nativeAdView);
        if (equals(p81VarA)) {
            return;
        }
        if (p81VarA != null) {
            p81VarA.h();
        }
        if (this.f31667p.a(this)) {
            h();
        }
        this.f31667p.a(nativeAdView, this);
        a(new x61(nativeAdWeakViewHolder, this.f31659g, imageProvider, this.f31665n, clickListenerFactory, this.f31658f, this.f31669r, this.f31652N, this.f31662k, this.f31660h, this.f31657e, this.f31654b, this.f31668q, this.f31661j, this.f31641C));
        this.f31639A.a(nativeAdView, new q81(this));
    }

    public p81(Context context, el binderConfiguration, v41 nativeAdControllers, tb1 renderer, ca1 nativeAdValidator, vb1 nativeVisualBlock, j41 nativeAdBlock, vu1 sdkEnvironmentModule, j51 nativeAdFactoriesProvider, h81 forceImpressionConfigurator, ea adViewRenderingValidator, w31 w31Var, e9 adStructureType, C4072a3 adConfiguration, ns adType, a8 adResponse, p61 nativeAdResponse, List assets, nx1 nx1Var, j81 nativeForcePauseObserver, rt nativeAdVideoController, u32 targetUrlHandlerProvider, ck0 impressionEventsObservable, jd1 noticeTrackingManagerProvider, ah1 phoneStateTracker, qo1 renderedTimer, vl boundAssetsProvider, ek0 impressionManagerCreator, InterfaceC4143k4 infoReportDataProviderFactory, y61 bindingManager, cx0 mediaViewRenderController, g71 nativeAdVisibilityValidator, g7 adRenderingValidator, ng assetValueProvider, d91 nativeMediaContentFactory, gk0 impressionReporter, po1 renderedAssetsProvider, ll bindingFailureReporter, f70 expectedViewMissingReporter, y31 nativeAdAssetNamesReporter, zn1 rebindAdReporter, g70 expectedViewsAssetProvider, yg assetsRenderedReportParameterProvider, q51 adIdProvider, C4101e4 adIdStorageManager, i62 trackingTrigger, hc1 needLoadChecker, fv customAssetTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(binderConfiguration, "binderConfiguration");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(renderer, "renderer");
        kotlin.jvm.internal.l.f(nativeAdValidator, "nativeAdValidator");
        kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(forceImpressionConfigurator, "forceImpressionConfigurator");
        kotlin.jvm.internal.l.f(adViewRenderingValidator, "adViewRenderingValidator");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(nativeAdVideoController, "nativeAdVideoController");
        kotlin.jvm.internal.l.f(targetUrlHandlerProvider, "targetUrlHandlerProvider");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(noticeTrackingManagerProvider, "noticeTrackingManagerProvider");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(boundAssetsProvider, "boundAssetsProvider");
        kotlin.jvm.internal.l.f(impressionManagerCreator, "impressionManagerCreator");
        kotlin.jvm.internal.l.f(infoReportDataProviderFactory, "infoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(bindingManager, "bindingManager");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(nativeAdVisibilityValidator, "nativeAdVisibilityValidator");
        kotlin.jvm.internal.l.f(adRenderingValidator, "adRenderingValidator");
        kotlin.jvm.internal.l.f(assetValueProvider, "assetValueProvider");
        kotlin.jvm.internal.l.f(nativeMediaContentFactory, "nativeMediaContentFactory");
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(renderedAssetsProvider, "renderedAssetsProvider");
        kotlin.jvm.internal.l.f(bindingFailureReporter, "bindingFailureReporter");
        kotlin.jvm.internal.l.f(expectedViewMissingReporter, "expectedViewMissingReporter");
        kotlin.jvm.internal.l.f(nativeAdAssetNamesReporter, "nativeAdAssetNamesReporter");
        kotlin.jvm.internal.l.f(rebindAdReporter, "rebindAdReporter");
        kotlin.jvm.internal.l.f(expectedViewsAssetProvider, "expectedViewsAssetProvider");
        kotlin.jvm.internal.l.f(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        kotlin.jvm.internal.l.f(adIdProvider, "adIdProvider");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(trackingTrigger, "trackingTrigger");
        kotlin.jvm.internal.l.f(needLoadChecker, "needLoadChecker");
        kotlin.jvm.internal.l.f(customAssetTracker, "customAssetTracker");
        this.f31653a = context;
        this.f31654b = nativeAdControllers;
        this.f31655c = renderer;
        this.f31656d = nativeAdValidator;
        this.f31657e = nativeVisualBlock;
        this.f31658f = nativeAdFactoriesProvider;
        this.f31659g = adConfiguration;
        this.f31660h = adResponse;
        this.i = nativeAdResponse;
        this.f31661j = nx1Var;
        this.f31662k = nativeForcePauseObserver;
        this.f31663l = nativeAdVideoController;
        this.f31664m = targetUrlHandlerProvider;
        this.f31665n = impressionEventsObservable;
        this.f31666o = boundAssetsProvider;
        this.f31667p = bindingManager;
        this.f31668q = mediaViewRenderController;
        this.f31669r = assetValueProvider;
        this.f31670s = impressionReporter;
        this.f31671t = renderedAssetsProvider;
        this.f31672u = bindingFailureReporter;
        this.f31673v = expectedViewMissingReporter;
        this.f31674w = nativeAdAssetNamesReporter;
        this.f31675x = rebindAdReporter;
        this.f31676y = expectedViewsAssetProvider;
        this.f31677z = assetsRenderedReportParameterProvider;
        this.f31639A = trackingTrigger;
        this.f31640B = needLoadChecker;
        this.f31641C = customAssetTracker;
        g51 g51VarA = nativeAdFactoriesProvider.b().a(context, adResponse, adConfiguration);
        this.f31642D = g51VarA;
        String strA = aa.a(this);
        this.f31643E = strA;
        this.f31650L = new a();
        b bVar = new b();
        this.f31651M = nativeAdResponse.c();
        this.f31652N = nativeMediaContentFactory.a();
        dk0 dk0VarA = ek0.a(context, g51VarA, impressionReporter, adIdStorageManager, impressionEventsObservable);
        List<tx1> listE = nativeVisualBlock.e();
        dk0VarA.a(listE, nativeVisualBlock.c());
        C4210u2 c4210u2 = new C4210u2(context, sdkEnvironmentModule, adResponse, adConfiguration, g51VarA, targetUrlHandlerProvider);
        this.f31646H = c4210u2;
        this.f31647I = new vo(c4210u2, renderedTimer, impressionEventsObservable);
        u21 u21VarA = noticeTrackingManagerProvider.a(context, adConfiguration, impressionReporter, bVar, strA, adStructureType);
        this.f31644F = u21VarA;
        forceImpressionConfigurator.a(impressionEventsObservable);
        impressionEventsObservable.a(new gd1(u21VarA));
        b62 b62VarA = nativeAdFactoriesProvider.e().a(u21VarA, new no1(context, adRenderingValidator, adResponse, adConfiguration, adStructureType, adIdStorageManager, impressionEventsObservable, renderedTimer, nativeVisualBlock.d()), new ok0(nativeAdValidator, listE), phoneStateTracker);
        this.f31645G = b62VarA;
        b62VarA.a(impressionEventsObservable);
        b62VarA.a((a8<?>) adResponse, listE);
        this.f31648J = new hg(assets, c4210u2, renderedTimer, impressionEventsObservable, w31Var != null ? w31Var.e() : null);
    }

    private final void a(x61 x61Var) throws v51 {
        x61Var.a();
        this.f31675x.a();
        this.f31666o.getClass();
        Map<String, bg<?>> mapC = x61Var.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, bg<?>> entry : mapC.entrySet()) {
            bg<?> value = entry.getValue();
            if (value != null && value.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.f31674w.a(arrayList, ip1.b.f28782H);
        ArrayList arrayListA = this.f31676y.a(x61Var);
        if (!arrayListA.isEmpty()) {
            this.f31673v.a(arrayListA);
        }
        this.f31649K = x61Var;
        this.f31677z.a(x61Var);
        this.f31656d.a(x61Var);
        kq1 kq1VarA = this.f31656d.a();
        if (kq1VarA.a()) {
            this.f31655c.a(x61Var);
            b(x61Var);
            return;
        }
        String strB = kq1VarA.b();
        this.f31672u.a(strB);
        throw new v51(C4215v0.a(new Object[0], 0, "Resource for required view " + strB + " is not present", "format(...)"));
    }

    public final p61 a() {
        return this.i;
    }

    public final void a(com.yandex.mobile.ads.nativeads.c cVar) {
        this.f31664m.a(cVar);
    }

    public void a(lt ltVar) {
        this.f31642D.a(ltVar);
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f31646H.a(reportParameterManager);
        this.f31670s.a(reportParameterManager);
        this.f31642D.a(reportParameterManager);
        this.f31645G.a(new j91(reportParameterManager, this.f31677z));
        this.f31672u.a(reportParameterManager);
        this.f31673v.a(reportParameterManager);
        this.f31674w.a(reportParameterManager);
        this.f31675x.a(reportParameterManager);
    }
}
