package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.i62;

/* loaded from: classes3.dex */
public final class z61 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f36218d = {fa.a(z61.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final i62.a f36219a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f36220b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f36221c;

    public z61(View view, i62.a trackingListener) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
        this.f36219a = trackingListener;
        this.f36220b = bo1.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f36220b.getValue(this, f36218d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f36220b.getValue(this, f36218d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = (View) this.f36220b.getValue(this, f36218d[0]);
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f36221c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f36221c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f36219a.a();
            } else {
                this.f36219a.b();
            }
        }
    }
}
