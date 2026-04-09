package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* loaded from: classes.dex */
abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f8273a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f8274b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f8275c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f8276d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f8277e;

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f8277e = layoutParams;
        this.f8275c = bVar;
        this.f8273a = kVar;
        this.f8274b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f8276d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f8276d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f8275c.n(), (this.f8275c.u0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f7685a, dVar.f7689e, dVar.f7688d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f7687c;
        layoutParams.setMargins(i11, dVar.f7686b, i11, 0);
        layoutParams.gravity = i10;
        this.f8276d.addView(gVar, layoutParams);
    }
}
