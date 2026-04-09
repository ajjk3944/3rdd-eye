package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4130a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4131b;

    /* renamed from: c, reason: collision with root package name */
    private final View f4132c;

    public f8(View view, com.applovin.impl.sdk.k kVar) {
        this.f4130a = kVar;
        this.f4131b = kVar.O();
        this.f4132c = view;
    }

    public long a(h3 h3Var) {
        long j;
        if (com.applovin.impl.sdk.o.a()) {
            this.f4131b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = o0.b(this.f4132c.getContext());
        if (this.f4132c.isShown()) {
            j = 0;
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f4132c.getAlpha() < h3Var.j0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f4132c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f4132c.getParent() == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f4132c.getContext(), this.f4132c.getWidth());
        if (iPxToDp < Math.min(h3Var.p0(), pointB.x)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f4132c.getContext(), this.f4132c.getHeight());
        if (iPxToDp2 < h3Var.l0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f4132c.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        Rect rect2 = new Rect(i4, iArr[1], this.f4132c.getWidth() + i4, this.f4132c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity activityB = this.f4130a.e().b();
        if (activityB != null && !e8.a(this.f4132c, activityB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4131b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4131b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
