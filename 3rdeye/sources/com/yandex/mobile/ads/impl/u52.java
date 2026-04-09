package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.a92;
import com.yandex.mobile.ads.impl.dk0;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class u52 extends xf0 implements dk0.a, InterfaceC4132j0 {

    /* renamed from: e, reason: collision with root package name */
    private final ha f33939e;

    /* renamed from: f, reason: collision with root package name */
    private final ck0 f33940f;

    /* renamed from: g, reason: collision with root package name */
    private final u21 f33941g;

    /* renamed from: h, reason: collision with root package name */
    private final dk0 f33942h;
    private final C4118h0 i;

    /* renamed from: j, reason: collision with root package name */
    private final no1 f33943j;

    public final class a implements w52 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.w52
        public final a92 a(int i) {
            return new a92(u52.a(u52.this) ? a92.a.f24572o : !u52.this.l() ? a92.a.f24574q : !u52.this.k() ? a92.a.f24568k : a92.a.f24561c, null);
        }

        @Override // com.yandex.mobile.ads.impl.w52
        public final a92 b(int i) {
            return new a92(u52.this.f() ? a92.a.f24562d : u52.a(u52.this) ? a92.a.f24572o : !u52.this.l() ? a92.a.f24574q : (u52.this.a(i) && u52.this.k()) ? a92.a.f24561c : a92.a.f24568k, null);
        }
    }

    public /* synthetic */ u52(Context context, ha haVar, a8 a8Var, C4072a3 c4072a3) {
        this(context, haVar, a8Var, c4072a3, new ck0(), new C4101e4(new yf0(a8Var)), new gk0(context, a8Var, c4072a3, a8Var.B()), new oo1(), new jd1(), new ek0(), new hd1());
    }

    public static final boolean a(u52 u52Var) {
        return !u52Var.f33939e.b();
    }

    public abstract boolean a(int i);

    public final ck0 j() {
        return this.f33940f;
    }

    public abstract boolean k();

    public abstract boolean l();

    public final synchronized void m() {
        toString();
        fp0.d(new Object[0]);
        this.f33941g.b();
        this.f33943j.b();
    }

    @Override // com.yandex.mobile.ads.impl.xf0, com.yandex.mobile.ads.impl.sj
    public final void b() {
        toString();
        fp0.d(new Object[0]);
        super.b();
        this.f33941g.a();
        this.f33943j.c();
    }

    @Override // com.yandex.mobile.ads.impl.ah1.b
    public final void a(xg1 phoneState) {
        kotlin.jvm.internal.l.f(phoneState, "phoneState");
        this.f33939e.b();
        phoneState.toString();
        fp0.d(new Object[0]);
        this.f33941g.a(phoneState, this.f33939e.b());
    }

    public final void b(int i) {
        fp0.d(new Object[0]);
        du1 du1VarA = ew1.a.a().a(e());
        if (du1VarA == null || !du1VarA.q0()) {
            if (this.f33939e.b()) {
                this.f33941g.b();
            } else {
                this.f33941g.a();
            }
        } else if (i == 0) {
            this.f33941g.b();
        } else {
            this.f33941g.a();
        }
        fp0.d(getClass().toString(), Integer.valueOf(i));
    }

    public void a(int i, Bundle bundle) {
        fp0.d(new Object[0]);
        if (i == 14) {
            this.f33940f.e();
            return;
        }
        if (i != 15) {
            switch (i) {
                case 6:
                    onLeftApplication();
                    this.i.g();
                    break;
                case 7:
                    onLeftApplication();
                    this.i.e();
                    break;
                case 8:
                    this.i.f();
                    break;
                case 9:
                    fp0.d(new Object[0]);
                    this.i.a();
                    this.f33940f.a();
                    break;
            }
            return;
        }
        this.f33940f.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(Context context, ha adVisibilityValidator, a8<String> adResponse, C4072a3 adConfiguration, ck0 impressionEventsObservable, C4101e4 adIdStorageManager, gk0 impressionReporter, oo1 renderTrackingManagerFactory, jd1 noticeTrackingManagerProvider, ek0 impressionManagerCreator, hd1 noticeTrackerForceImpressionListenerFactory) {
        super(context, adResponse);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adVisibilityValidator, "adVisibilityValidator");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(renderTrackingManagerFactory, "renderTrackingManagerFactory");
        kotlin.jvm.internal.l.f(noticeTrackingManagerProvider, "noticeTrackingManagerProvider");
        kotlin.jvm.internal.l.f(impressionManagerCreator, "impressionManagerCreator");
        kotlin.jvm.internal.l.f(noticeTrackerForceImpressionListenerFactory, "noticeTrackerForceImpressionListenerFactory");
        this.f33939e = adVisibilityValidator;
        this.f33940f = impressionEventsObservable;
        this.i = new C4118h0(context, adConfiguration, adResponse, this, adResponse.z());
        a aVar = new a();
        this.f33942h = ek0.a(context, this, impressionReporter, adIdStorageManager, impressionEventsObservable);
        u21 u21VarA = noticeTrackingManagerProvider.a(context, adConfiguration, impressionReporter, aVar, aa.a(this), e9.f26735b);
        this.f33941g = u21VarA;
        u21VarA.a(impressionEventsObservable);
        impressionEventsObservable.a(hd1.a(u21VarA));
        this.f33943j = oo1.a(context, adResponse, adConfiguration, adIdStorageManager, adVisibilityValidator, impressionEventsObservable);
    }

    public final void a(Map<String, String> map) {
        toString();
        fp0.d(new Object[0]);
        ArrayList arrayListA = aa.a(d(), map);
        this.f33942h.a(arrayListA, d().B());
        this.f33941g.a(d(), arrayListA);
        m();
    }
}
