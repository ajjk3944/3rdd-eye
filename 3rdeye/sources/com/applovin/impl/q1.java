package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* loaded from: classes.dex */
abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f20748a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f20749b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f20750c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f20751d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f20752e;

    public q1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f20752e = layoutParams;
        this.f20750c = bVar;
        this.f20748a = kVar;
        this.f20749b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f20751d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f20751d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f20750c.o(), (this.f20750c.G0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f21059a, dVar.f21063e, dVar.f21062d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i10 = dVar.f21061c;
        layoutParams.setMargins(i10, dVar.f21060b, i10, 0);
        layoutParams.gravity = i;
        this.f20751d.addView(gVar, layoutParams);
    }
}
