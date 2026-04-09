package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f5869a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f5870b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f5871c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f5872d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f5873e;

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f5873e = layoutParams;
        this.f5871c = bVar;
        this.f5869a = kVar;
        this.f5870b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f5872d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f5872d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f5871c.n(), (this.f5871c.u0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i4, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f5427a, dVar.f5431e, dVar.f5430d, i4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i10 = dVar.f5429c;
        layoutParams.setMargins(i10, dVar.f5428b, i10, 0);
        layoutParams.gravity = i4;
        this.f5872d.addView(gVar, layoutParams);
    }
}
