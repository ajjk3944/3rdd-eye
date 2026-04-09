package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ap0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f24776a;

    /* renamed from: b, reason: collision with root package name */
    private final vs0 f24777b;

    /* renamed from: c, reason: collision with root package name */
    private final zs0 f24778c;

    /* renamed from: d, reason: collision with root package name */
    private final ew1 f24779d;

    /* renamed from: e, reason: collision with root package name */
    private final ti f24780e;

    /* renamed from: f, reason: collision with root package name */
    private final bp0 f24781f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f24782g;

    /* renamed from: h, reason: collision with root package name */
    private int f24783h;
    private int i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration) {
        this(context, attributeSet, i, adConfiguration, null, null, null, null, null, 496, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
    }

    private final bp0 a() {
        return cp0.a(this, this.f24780e);
    }

    public abstract ti a(Context context, si siVar, C4198s4 c4198s4);

    public final void addVisibilityChangeListener(kh2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f24782g.add(listener);
    }

    public final String c() {
        this.f24778c.a();
        return this.f24780e.B();
    }

    public final de2 d() {
        this.f24778c.a();
        return this.f24780e.D();
    }

    public void destroy() {
        this.f24778c.a();
        this.f24777b.a();
        this.f24782g.clear();
        int i = aa.f24578b;
        if (aa.a((lo) this.f24780e)) {
            return;
        }
        this.f24780e.e();
    }

    public final C4072a3 getAdConfiguration$mobileads_externalRelease() {
        return this.f24776a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.i;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.f24783h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        fp0.d(new Object[0]);
        bp0 bp0Var = this.f24781f;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        bp0Var.b(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        int i;
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i10 = aa.f24578b;
        if (!aa.a((lo) this.f24780e)) {
            if (this.f24780e.z()) {
                i = 0;
            } else {
                h7 h7VarA = this.f24776a.a();
                if (h7VarA != null) {
                    a(h7VarA);
                }
                i = 8;
            }
            setVisibility(i);
        }
        newConfig.toString();
        fp0.d(new Object[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        fp0.d(new Object[0]);
        bp0 bp0Var = this.f24781f;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        bp0Var.a(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        this.f24783h = i;
        this.i = i10;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.l.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (this.f24779d == null) {
            return;
        }
        changedView.toString();
        fp0.d(new Object[0]);
        ew1 ew1Var = this.f24779d;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        du1 du1VarA = ew1Var.a(context);
        if (du1VarA == null || !du1VarA.q0()) {
            a(i);
        } else if (this == changedView) {
            a(i);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        fp0.d(new Object[0]);
        a((i == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(kh2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f24782g.remove(listener);
    }

    public void setAdUnitId(String str) {
        this.f24778c.a();
        this.f24780e.a(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration, vs0 mainThreadExecutor) {
        this(context, attributeSet, i, adConfiguration, mainThreadExecutor, null, null, null, null, 480, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
    }

    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f24778c.a();
        this.f24777b.a(new V1(2, this, adRequestData));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.ts b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.zs0 r0 = r4.f24778c
            r0.a()
            com.yandex.mobile.ads.impl.ti r0 = r4.f24780e
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.l.f(r0, r1)
            com.yandex.mobile.ads.impl.a8 r1 = r0.k()
            r2 = 0
            if (r1 == 0) goto L29
            com.yandex.mobile.ads.impl.vy1 r1 = r1.M()
            if (r1 == 0) goto L29
            int r3 = r1.getWidth()
            if (r3 != 0) goto L27
            int r3 = r1.getHeight()
            if (r3 == 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 != 0) goto L2d
        L29:
            com.yandex.mobile.ads.impl.vy1 r1 = r0.q()
        L2d:
            if (r1 == 0) goto L35
            com.yandex.mobile.ads.impl.ts r0 = new com.yandex.mobile.ads.impl.ts
            r0.<init>(r1)
            return r0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ap0.b():com.yandex.mobile.ads.impl.ts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration, vs0 mainThreadExecutor, zs0 mainThreadUsageValidator) {
        this(context, attributeSet, i, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, null, null, null, 448, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration, vs0 mainThreadExecutor, zs0 mainThreadUsageValidator, C4198s4 adLoadingPhasesManager) {
        this(context, attributeSet, i, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, adLoadingPhasesManager, null, null, 384, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration, vs0 mainThreadExecutor, zs0 mainThreadUsageValidator, C4198s4 adLoadingPhasesManager, si bannerAdListener) {
        this(context, attributeSet, i, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, adLoadingPhasesManager, bannerAdListener, null, 256, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(bannerAdListener, "bannerAdListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ap0 this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f24780e.b(adRequestData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, int i, C4072a3 adConfiguration, vs0 mainThreadExecutor, zs0 mainThreadUsageValidator, C4198s4 adLoadingPhasesManager, si bannerAdListener, ew1 ew1Var) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(bannerAdListener, "bannerAdListener");
        this.f24776a = adConfiguration;
        this.f24777b = mainThreadExecutor;
        this.f24778c = mainThreadUsageValidator;
        this.f24779d = ew1Var;
        this.f24782g = new ArrayList();
        mainThreadUsageValidator.a();
        ti tiVarA = a(context, bannerAdListener, adLoadingPhasesManager);
        this.f24780e = tiVarA;
        bannerAdListener.a(tiVarA.f());
        bp0 bp0VarA = a();
        this.f24781f = bp0VarA;
        bp0VarA.a(context, this);
    }

    private final void a(int i) {
        fp0.d(new Object[0]);
        int i10 = aa.f24578b;
        if (aa.a((lo) this.f24780e)) {
            return;
        }
        Iterator it = this.f24782g.iterator();
        while (it.hasNext()) {
            ((kh2) it.next()).a(i);
        }
    }

    public final void a(ss ssVar) {
        this.f24778c.a();
        this.f24780e.a(ssVar);
    }

    public final void a(ts tsVar) {
        this.f24778c.a();
        this.f24780e.a(tsVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ap0(Context context, AttributeSet attributeSet, int i, C4072a3 c4072a3, vs0 vs0Var, zs0 zs0Var, C4198s4 c4198s4, si siVar, ew1 ew1Var, int i10, kotlin.jvm.internal.g gVar) {
        AttributeSet attributeSet2 = (i10 & 2) != 0 ? null : attributeSet;
        int i11 = (i10 & 4) != 0 ? 0 : i;
        vs0 vs0Var2 = (i10 & 16) != 0 ? new vs0() : vs0Var;
        zs0 zs0Var2 = (i10 & 32) != 0 ? new zs0(context) : zs0Var;
        C4198s4 c4198s42 = (i10 & 64) != 0 ? new C4198s4() : c4198s4;
        this(context, attributeSet2, i11, c4072a3, vs0Var2, zs0Var2, c4198s42, (i10 & 128) != 0 ? new si(context, c4072a3, c4198s42) : siVar, (i10 & 256) != 0 ? ew1.a.a() : ew1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, AttributeSet attributeSet, C4072a3 adConfiguration) {
        this(context, attributeSet, 0, adConfiguration, null, null, null, null, null, 500, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ap0(Context context, C4072a3 adConfiguration) {
        this(context, null, 0, adConfiguration, null, null, null, null, null, 502, null);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
    }
}
