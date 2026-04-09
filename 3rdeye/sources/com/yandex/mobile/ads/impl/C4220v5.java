package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import c9.C2097r;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4220v5 implements sd0, zy1 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f34374a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4209u1 f34375b;

    /* renamed from: c, reason: collision with root package name */
    private final tr f34376c;

    /* renamed from: d, reason: collision with root package name */
    private final C4199s5 f34377d;

    /* renamed from: e, reason: collision with root package name */
    private final ExtendedNativeAdView f34378e;

    /* renamed from: f, reason: collision with root package name */
    private final C4202t1 f34379f;

    /* renamed from: g, reason: collision with root package name */
    private final rl1 f34380g;

    /* renamed from: h, reason: collision with root package name */
    private final up f34381h;
    private final tr1 i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f34382j;

    /* renamed from: k, reason: collision with root package name */
    private final List<y5> f34383k;

    /* renamed from: l, reason: collision with root package name */
    private final long f34384l;

    /* renamed from: m, reason: collision with root package name */
    private int f34385m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f34386n;

    /* renamed from: com.yandex.mobile.ads.impl.v5$a */
    public final class a implements InterfaceC4224w2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4224w2
        public final void a() {
            C4220v5.this.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4224w2
        public final void b() {
            int i = C4220v5.this.f34385m - 1;
            if (i == C4220v5.this.f34377d.c() && !C4220v5.this.f34386n) {
                C4220v5.this.f34386n = true;
                C4220v5.this.f34375b.b();
            }
            y5 y5Var = (y5) C2097r.r0(i, C4220v5.this.f34383k);
            if ((y5Var != null ? y5Var.c() : null) != a6.f24441c || y5Var.b() == null) {
                C4220v5.this.d();
            }
        }
    }

    public C4220v5(Context context, h61 nativeAdPrivate, lt adEventListener, es1 closeVerificationController, ArrayList arrayList, w20 w20Var, ViewGroup subAdsContainer, InterfaceC4209u1 adBlockCompleteListener, tr contentCloseListener, yq0 layoutDesignsControllerCreator, C4199s5 adPod, ExtendedNativeAdView nativeAdView, C4202t1 adBlockBinder, rl1 progressIncrementer, up closeTimerProgressIncrementer, tr1 timerViewController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(subAdsContainer, "subAdsContainer");
        kotlin.jvm.internal.l.f(adBlockCompleteListener, "adBlockCompleteListener");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(layoutDesignsControllerCreator, "layoutDesignsControllerCreator");
        kotlin.jvm.internal.l.f(adPod, "adPod");
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(adBlockBinder, "adBlockBinder");
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        kotlin.jvm.internal.l.f(timerViewController, "timerViewController");
        this.f34374a = subAdsContainer;
        this.f34375b = adBlockCompleteListener;
        this.f34376c = contentCloseListener;
        this.f34377d = adPod;
        this.f34378e = nativeAdView;
        this.f34379f = adBlockBinder;
        this.f34380g = progressIncrementer;
        this.f34381h = closeTimerProgressIncrementer;
        this.i = timerViewController;
        List<y5> listB = adPod.b();
        this.f34383k = listB;
        Iterator<T> it = listB.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((y5) it.next()).a();
        }
        this.f34384l = jA;
        this.f34382j = layoutDesignsControllerCreator.a(context, this.f34378e, nativeAdPrivate, adEventListener, new a(), closeVerificationController, this.f34380g, new C4234x5(this), arrayList, w20Var, this.f34377d, this.f34381h);
    }

    @Override // com.yandex.mobile.ads.impl.sd0
    public final void invalidate() {
        Iterator it = this.f34382j.iterator();
        while (it.hasNext()) {
            ((xq0) it.next()).b();
        }
        this.f34379f.a();
    }

    private final void b() {
        this.f34374a.setContentDescription("pageIndex: " + this.f34385m);
    }

    @Override // com.yandex.mobile.ads.impl.zy1
    public final void a() {
        z5 z5VarB;
        int i = this.f34385m - 1;
        if (i == this.f34377d.c() && !this.f34386n) {
            this.f34386n = true;
            this.f34375b.b();
        }
        if (this.f34385m < this.f34382j.size()) {
            xq0 xq0Var = (xq0) C2097r.r0(i, this.f34382j);
            if (xq0Var != null) {
                xq0Var.b();
            }
            y5 y5Var = (y5) C2097r.r0(i, this.f34383k);
            if (((y5Var == null || (z5VarB = y5Var.b()) == null) ? null : z5VarB.b()) != jz1.f29395c) {
                d();
                return;
            }
            int size = this.f34382j.size() - 1;
            this.f34385m = size;
            Iterator<T> it = this.f34383k.subList(i, size).iterator();
            long jA = 0;
            while (it.hasNext()) {
                jA += ((y5) it.next()).a();
            }
            this.f34380g.a(jA);
            this.f34381h.b();
            int i10 = this.f34385m;
            this.f34385m = i10 + 1;
            if (((xq0) this.f34382j.get(i10)).a()) {
                b();
                this.i.a(this.f34378e, this.f34384l, this.f34380g.a());
            } else if (this.f34385m >= this.f34382j.size()) {
                this.f34376c.f();
            } else {
                d();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sd0
    public final void c() {
        ViewGroup viewGroup = this.f34374a;
        ExtendedNativeAdView extendedNativeAdView = this.f34378e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        if (this.f34379f.a(this.f34378e)) {
            this.f34385m = 1;
            this.f34386n = false;
            xq0 xq0Var = (xq0) C2097r.q0(this.f34382j);
            if (xq0Var != null && xq0Var.a()) {
                b();
                this.i.a(this.f34378e, this.f34384l, this.f34380g.a());
            } else if (this.f34385m >= this.f34382j.size()) {
                this.f34376c.f();
            } else {
                d();
            }
        }
    }

    public final void d() {
        y5 y5Var = (y5) C2097r.r0(this.f34385m - 1, this.f34383k);
        this.f34380g.a(y5Var != null ? y5Var.a() : 0L);
        this.f34381h.b();
        if (this.f34385m < this.f34382j.size()) {
            int i = this.f34385m;
            this.f34385m = i + 1;
            if (((xq0) this.f34382j.get(i)).a()) {
                b();
                this.i.a(this.f34378e, this.f34384l, this.f34380g.a());
            } else if (this.f34385m >= this.f34382j.size()) {
                this.f34376c.f();
            } else {
                d();
            }
        }
    }
}
