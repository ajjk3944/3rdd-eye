package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class jj extends hg0 {

    /* renamed from: o, reason: collision with root package name */
    private final vy1 f29157o;

    /* renamed from: p, reason: collision with root package name */
    private lb0 f29158p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29159q;

    /* renamed from: r, reason: collision with root package name */
    private int f29160r;

    /* renamed from: s, reason: collision with root package name */
    private int f29161s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(Context context, a8<?> adResponse, C4072a3 adConfiguration, vy1 configurationSizeInfo) {
        super(context, adResponse, adConfiguration);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(configurationSizeInfo, "configurationSizeInfo");
        this.f29157o = configurationSizeInfo;
        this.f29159q = true;
        if (n()) {
            this.f29160r = configurationSizeInfo.c(context);
            this.f29161s = configurationSizeInfo.a(context);
        } else {
            this.f29160r = adResponse.r() == 0 ? configurationSizeInfo.c(context) : adResponse.r();
            this.f29161s = adResponse.c();
        }
        this.f29158p = a(this.f29160r, this.f29161s);
    }

    @Override // com.yandex.mobile.ads.impl.hg0
    @SuppressLint({"AddJavascriptInterface"})
    public final void a(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        addJavascriptInterface(b(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.hg0
    public final void b(int i, String str) {
        if (k().c() != 0) {
            i = k().c();
        }
        this.f29161s = i;
        super.b(i, str);
    }

    @Override // com.yandex.mobile.ads.impl.hg0, com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.pk
    public final String c() {
        String strA;
        if (k().U()) {
            int i = ej2.f26881c;
            strA = ej2.a(this.f29160r);
        } else {
            strA = "";
        }
        vy1 vy1Var = this.f29157o;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        int iC = vy1Var.c(context);
        vy1 vy1Var2 = this.f29157o;
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        return B4.g.o(strA, n() ? ej2.a(iC, vy1Var2.a(context2)) : "", super.c());
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void h() {
        if (this.f29159q) {
            this.f29158p = new lb0(this.f29160r, this.f29161s, this.f29157o.a());
            og0 og0VarJ = j();
            if (og0VarJ != null) {
                Context context = getContext();
                kotlin.jvm.internal.l.e(context, "getContext(...)");
                if (ca.a(context, this.f29158p, this.f29157o) || k().N()) {
                    og0VarJ.a(this, l());
                } else {
                    Context context2 = getContext();
                    vy1 vy1Var = this.f29157o;
                    kotlin.jvm.internal.l.c(context2);
                    C4128i3 c4128i3A = i7.a(vy1Var.c(context2), this.f29157o.a(context2), this.f29158p.getWidth(), this.f29158p.getHeight(), jh2.d(context2), jh2.b(context2));
                    uo0.a(c4128i3A.d(), new Object[0]);
                    og0VarJ.a(c4128i3A);
                }
            }
            this.f29159q = false;
        }
    }

    public final boolean n() {
        if (!m() || k().r() != 0 || k().c() != 0) {
            return false;
        }
        vy1 vy1Var = this.f29157o;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        if (vy1Var.c(context) <= 0) {
            return false;
        }
        vy1 vy1Var2 = this.f29157o;
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        return vy1Var2.a(context2) > 0;
    }

    public final vy1 o() {
        return this.f29158p;
    }

    public final void setBannerHeight(int i) {
        this.f29161s = i;
    }

    public final void setBannerWidth(int i) {
        this.f29160r = i;
    }

    private final lb0 a(int i, int i10) {
        return new lb0(i, i10, this.f29157o.a());
    }
}
