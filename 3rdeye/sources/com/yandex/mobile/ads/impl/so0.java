package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.InterfaceC0594o0;
import D9.C0641c;
import D9.InterfaceC0644f;
import b9.C1992A;
import c9.C2099t;
import com.yandex.mobile.ads.impl.ax;
import com.yandex.mobile.ads.impl.dy;
import com.yandex.mobile.ads.impl.xx;
import com.yandex.mobile.ads.impl.yk0;
import com.yandex.mobile.ads.impl.yx;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class so0 extends vg2 {

    /* renamed from: b, reason: collision with root package name */
    private final he0 f33151b;

    /* renamed from: c, reason: collision with root package name */
    private final j32 f33152c;

    /* renamed from: d, reason: collision with root package name */
    private final ge0 f33153d;

    /* renamed from: e, reason: collision with root package name */
    private final fe0 f33154e;

    /* renamed from: f, reason: collision with root package name */
    private final ee0 f33155f;

    /* renamed from: g, reason: collision with root package name */
    private final ie0 f33156g;

    /* renamed from: h, reason: collision with root package name */
    private final fx f33157h;
    private final x9 i;

    /* renamed from: j, reason: collision with root package name */
    private final u9 f33158j;

    /* renamed from: k, reason: collision with root package name */
    private final r9 f33159k;

    /* renamed from: l, reason: collision with root package name */
    private final lz0 f33160l;

    /* renamed from: m, reason: collision with root package name */
    private final D9.y<ay> f33161m;

    /* renamed from: n, reason: collision with root package name */
    private final D9.I<ay> f33162n;

    /* renamed from: o, reason: collision with root package name */
    private final C9.g<yx> f33163o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC0644f<yx> f33164p;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$sendEvent$1", f = "IntegrationInspectorViewModel.kt", l = {158}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33165b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ yx f33167d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yx yxVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f33167d = yxVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return so0.this.new a(this.f33167d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return so0.this.new a(this.f33167d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f33165b;
            if (i == 0) {
                b9.n.b(obj);
                C9.g gVar = so0.this.f33163o;
                yx yxVar = this.f33167d;
                this.f33165b = 1;
                if (gVar.m(this, yxVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$shareReport$1", f = "IntegrationInspectorViewModel.kt", l = {131}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33168b;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return so0.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return so0.this.new b(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            yx cVar;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f33168b;
            if (i == 0) {
                b9.n.b(obj);
                he0 he0Var = so0.this.f33151b;
                this.f33168b = 1;
                obj = he0Var.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            yk0 yk0Var = (yk0) obj;
            if (yk0Var instanceof yk0.c) {
                cVar = new yx.d(((yk0.c) yk0Var).a());
            } else if (yk0Var instanceof yk0.a) {
                cVar = new yx.c(((yk0.a) yk0Var).a());
            } else {
                if (!(yk0Var instanceof yk0.b)) {
                    throw new b9.j();
                }
                cVar = yx.b.f36089a;
            }
            so0.this.a(cVar);
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$showMessage$1", f = "IntegrationInspectorViewModel.kt", l = {144}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33170b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33172d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f33172d = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return so0.this.new c(this.f33172d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return so0.this.new c(this.f33172d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f33170b;
            if (i == 0) {
                b9.n.b(obj);
                C9.g gVar = so0.this.f33163o;
                yx.e eVar = new yx.e(this.f33172d);
                this.f33170b = 1;
                if (gVar.m(this, eVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    public so0(he0 getInspectorReportUseCase, j32 switchDebugErrorIndicatorVisibilityUseCase, ge0 getDebugPanelFeedDataUseCase, fe0 getAdUnitsDataUseCase, ee0 getAdUnitDataUseCase, ie0 getMediationNetworkDataUseCase, fx debugPanelFeedUiMapper, x9 adUnitsUiMapper, u9 adUnitUiMapper, r9 adUnitMediationAdapterUiMapper, lz0 mediationNetworkUiMapper) {
        kotlin.jvm.internal.l.f(getInspectorReportUseCase, "getInspectorReportUseCase");
        kotlin.jvm.internal.l.f(switchDebugErrorIndicatorVisibilityUseCase, "switchDebugErrorIndicatorVisibilityUseCase");
        kotlin.jvm.internal.l.f(getDebugPanelFeedDataUseCase, "getDebugPanelFeedDataUseCase");
        kotlin.jvm.internal.l.f(getAdUnitsDataUseCase, "getAdUnitsDataUseCase");
        kotlin.jvm.internal.l.f(getAdUnitDataUseCase, "getAdUnitDataUseCase");
        kotlin.jvm.internal.l.f(getMediationNetworkDataUseCase, "getMediationNetworkDataUseCase");
        kotlin.jvm.internal.l.f(debugPanelFeedUiMapper, "debugPanelFeedUiMapper");
        kotlin.jvm.internal.l.f(adUnitsUiMapper, "adUnitsUiMapper");
        kotlin.jvm.internal.l.f(adUnitUiMapper, "adUnitUiMapper");
        kotlin.jvm.internal.l.f(adUnitMediationAdapterUiMapper, "adUnitMediationAdapterUiMapper");
        kotlin.jvm.internal.l.f(mediationNetworkUiMapper, "mediationNetworkUiMapper");
        this.f33151b = getInspectorReportUseCase;
        this.f33152c = switchDebugErrorIndicatorVisibilityUseCase;
        this.f33153d = getDebugPanelFeedDataUseCase;
        this.f33154e = getAdUnitsDataUseCase;
        this.f33155f = getAdUnitDataUseCase;
        this.f33156g = getMediationNetworkDataUseCase;
        this.f33157h = debugPanelFeedUiMapper;
        this.i = adUnitsUiMapper;
        this.f33158j = adUnitUiMapper;
        this.f33159k = adUnitMediationAdapterUiMapper;
        this.f33160l = mediationNetworkUiMapper;
        D9.J jC = D9.E.c(new ay(null, ax.d.f25011b, false, C2099t.f18581b));
        this.f33161m = jC;
        this.f33162n = D9.H.a(jC);
        C9.b bVarA = C9.j.a(0, 7, null);
        this.f33163o = bVarA;
        this.f33164p = new C0641c(bVarA);
    }

    public static final void m(so0 so0Var) {
        ay ayVarB = so0Var.f33161m.getValue().b();
        if (ayVarB == null) {
            so0Var.a(yx.a.f36088a);
            return;
        }
        ay ayVarA = ay.a(ayVarB, null, null, false, null, 11);
        D9.y<ay> yVar = so0Var.f33161m;
        while (!yVar.a(yVar.getValue(), ayVarA)) {
        }
    }

    private final void e() {
        C0575f.e(b(), null, null, new b(null), 3);
    }

    private final void f() {
        C0575f.e(b(), null, null, new to0(this, false, null), 3);
    }

    public final InterfaceC0644f<yx> c() {
        return this.f33164p;
    }

    public final D9.I<ay> d() {
        return this.f33162n;
    }

    public static final void a(so0 so0Var, ay ayVar) {
        D9.y<ay> yVar = so0Var.f33161m;
        while (!yVar.a(yVar.getValue(), ayVar)) {
        }
    }

    public final void a(xx action) {
        ax eVar;
        kotlin.jvm.internal.l.f(action, "action");
        if (action instanceof xx.a) {
            f();
            return;
        }
        if (action instanceof xx.g) {
            e();
            return;
        }
        if (action instanceof xx.e) {
            this.f33152c.a();
            f();
            return;
        }
        if (action instanceof xx.d) {
            ay ayVarB = this.f33161m.getValue().b();
            if (ayVarB == null) {
                a(yx.a.f36088a);
                return;
            }
            ay ayVarA = ay.a(ayVarB, null, null, false, null, 11);
            D9.y<ay> yVar = this.f33161m;
            while (!yVar.a(yVar.getValue(), ayVarA)) {
            }
            return;
        }
        if (action instanceof xx.c) {
            ax.c cVar = ax.c.f25010b;
            ay value = this.f33161m.getValue();
            ay ayVarA2 = ay.a(value, value, cVar, false, null, 12);
            D9.y<ay> yVar2 = this.f33161m;
            while (!yVar2.a(yVar2.getValue(), ayVarA2)) {
            }
            f();
            return;
        }
        if (action instanceof xx.b) {
            ax.a aVar = new ax.a(((xx.b) action).a());
            ay value2 = this.f33161m.getValue();
            ay ayVarA3 = ay.a(value2, value2, aVar, false, null, 12);
            D9.y<ay> yVar3 = this.f33161m;
            while (!yVar3.a(yVar3.getValue(), ayVarA3)) {
            }
            f();
            return;
        }
        if (action instanceof xx.f) {
            ax axVarA = this.f33161m.getValue().a();
            dy.g gVarA = ((xx.f) action).a();
            if (axVarA instanceof ax.a) {
                eVar = new ax.b(gVarA);
            } else {
                eVar = new ax.e(gVarA.f());
            }
            ax axVar = eVar;
            ay value3 = this.f33161m.getValue();
            ay ayVarA4 = ay.a(value3, value3, axVar, false, null, 12);
            D9.y<ay> yVar4 = this.f33161m;
            while (!yVar4.a(yVar4.getValue(), ayVarA4)) {
            }
            f();
            return;
        }
        if (action instanceof xx.h) {
            a(((xx.h) action).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0594o0 a(yx yxVar) {
        return C0575f.e(b(), null, null, new a(yxVar, null), 3);
    }

    private final void a(String str) {
        C0575f.e(b(), null, null, new c(str, null), 3);
    }
}
