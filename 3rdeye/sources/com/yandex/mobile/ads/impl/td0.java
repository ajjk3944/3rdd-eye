package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.x22;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class td0<T extends td0<T>> extends u52 {

    /* renamed from: k, reason: collision with root package name */
    private final C4072a3 f33549k;

    /* renamed from: l, reason: collision with root package name */
    private final pc0 f33550l;

    /* renamed from: m, reason: collision with root package name */
    private final wc0<T> f33551m;

    /* renamed from: n, reason: collision with root package name */
    private final C4129i4 f33552n;

    /* renamed from: o, reason: collision with root package name */
    private final id0 f33553o;

    /* renamed from: p, reason: collision with root package name */
    private final C4198s4 f33554p;

    /* renamed from: q, reason: collision with root package name */
    private final x22 f33555q;

    /* renamed from: r, reason: collision with root package name */
    private final f7 f33556r;

    /* renamed from: s, reason: collision with root package name */
    private hd0 f33557s;

    public /* synthetic */ td0(Context context, a8 a8Var, C4072a3 c4072a3, pc0 pc0Var, wc0 wc0Var, C4129i4 c4129i4) {
        id0 id0Var = new id0();
        C4198s4 c4198s4 = new C4198s4();
        x22 x22VarA = x22.a.a();
        dg0 dg0Var = new dg0();
        dg0Var.a((a8<String>) a8Var);
        dg0Var.a(c4072a3);
        this(context, a8Var, c4072a3, pc0Var, wc0Var, c4129i4, id0Var, c4198s4, x22VarA, new f7(context, a8Var, c4072a3, c4198s4, dg0Var));
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean a(int i) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean k() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean l() {
        return true;
    }

    public final ms n() {
        C4129i4 c4129i4 = this.f33552n;
        Context context = e();
        a8<T> adResponse = d();
        C4072a3 adConfiguration = this.f33549k;
        String adInfo = this.f33551m.getAdInfo();
        c4129i4.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        String strP = adResponse.p();
        if (strP == null && (strP = adConfiguration.c()) == null) {
            strP = "";
        }
        vy1 vy1VarM = adResponse.M();
        if (vy1VarM.getWidth() == 0 || vy1VarM.getHeight() == 0) {
            vy1VarM = null;
        }
        return new ms(strP, vy1VarM != null ? new t8(vy1VarM.c(context), vy1VarM.a(context)) : null, adInfo);
    }

    public abstract T o();

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onLeftApplication() {
        hd0 hd0Var = this.f33557s;
        if (hd0Var != null) {
            hd0Var.onAdClicked();
        }
    }

    public final void p() {
        h();
        this.f33555q.a(kq0.f29756c, this);
        hd0 hd0Var = this.f33557s;
        if (hd0Var != null) {
            hd0Var.onAdDismissed();
        }
    }

    public final void q() {
        hd0 hd0Var = this.f33557s;
        if (hd0Var != null) {
            hd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dk0.a
    public final void a(C4108f4 c4108f4) {
        hd0 hd0Var = this.f33557s;
        if (hd0Var != null) {
            hd0Var.a(c4108f4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u52, com.yandex.mobile.ads.impl.InterfaceC4086c3
    public void a(int i, Bundle bundle) {
        getClass().toString();
        fp0.d(new Object[0]);
        Map<String, String> map = null;
        map = null;
        if (i == 0) {
            if (bundle != null) {
                Serializable serializable = bundle.getSerializable("extra_tracking_parameters");
                if (serializable instanceof Map) {
                    map = (Map) serializable;
                }
            }
            this.f33554p.a(EnumC4191r4.f32457f);
            this.f33556r.a();
            q();
            id0 id0Var = this.f33553o;
            a8<T> a8VarD = d();
            id0Var.getClass();
            if (a8VarD == null || a8VarD.v() != cs.f25764c) {
                a(map);
                return;
            }
            return;
        }
        if (i == 16) {
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof C4108f4 ? (C4108f4) parcelable : null);
                return;
            } else {
                a((C4108f4) null);
                return;
            }
        }
        if (i == 17) {
            hd0 hd0Var = this.f33557s;
            if (hd0Var != null) {
                hd0Var.onAdClicked();
                return;
            }
            return;
        }
        if (i == 2) {
            this.f33550l.a(0);
            b(0);
        } else if (i == 3) {
            this.f33550l.a(8);
            b(8);
        } else if (i == 4) {
            p();
        } else if (i != 5) {
            super.a(i, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(Context context, a8<String> adResponse, C4072a3 adConfiguration, pc0 fullScreenAdVisibilityValidator, wc0<T> fullScreenController, C4129i4 adInfoMapper, id0 fullScreenTrackingController, C4198s4 adLoadingPhasesManager, x22 strongReferenceKeepingManager, f7 adRenderingResultReporter) {
        super(context, fullScreenAdVisibilityValidator, adResponse, adConfiguration);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        kotlin.jvm.internal.l.f(adInfoMapper, "adInfoMapper");
        kotlin.jvm.internal.l.f(fullScreenTrackingController, "fullScreenTrackingController");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        kotlin.jvm.internal.l.f(adRenderingResultReporter, "adRenderingResultReporter");
        this.f33549k = adConfiguration;
        this.f33550l = fullScreenAdVisibilityValidator;
        this.f33551m = fullScreenController;
        this.f33552n = adInfoMapper;
        this.f33553o = fullScreenTrackingController;
        this.f33554p = adLoadingPhasesManager;
        this.f33555q = strongReferenceKeepingManager;
        this.f33556r = adRenderingResultReporter;
        C4140k1.f29460b.a().a("window_type_fullscreen", new C4091d1());
    }

    public final void a(hd0 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f33557s = listener;
    }

    public final Object a(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        g();
        b9.n.a(d6.a());
        synchronized (this) {
        }
        C4198s4 c4198s4 = this.f33554p;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32457f;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        x22 x22Var = this.f33555q;
        kq0 kq0Var = kq0.f29756c;
        x22Var.b(kq0Var, this);
        Object objA = this.f33551m.a((wc0<T>) o(), activity);
        if (b9.m.a(objA) != null) {
            this.f33554p.a(enumC4191r4);
            if (!aa.a((lo) this)) {
                this.f33555q.a(kq0Var, this);
                this.f33551m.a(e());
                super.c();
            }
        }
        return objA;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onReturnedToApplication() {
    }
}
