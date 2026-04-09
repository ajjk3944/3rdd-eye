package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class s7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20947a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20948b;

    /* renamed from: c, reason: collision with root package name */
    private final View f20949c;

    public s7(View view, com.applovin.impl.sdk.k kVar) {
        this.f20947a = kVar;
        this.f20948b = kVar.O();
        this.f20949c = view;
    }

    public long a(y2 y2Var) {
        long j4;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20948b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = AbstractC2128k0.b(this.f20949c.getContext());
        if (this.f20949c.isShown()) {
            j4 = 0;
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View is hidden");
            }
            j4 = 2;
        }
        if (this.f20949c.getAlpha() < y2Var.c0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View is transparent");
            }
            j4 |= 4;
        }
        Animation animation = this.f20949c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View is animating");
            }
            j4 |= 8;
        }
        if (this.f20949c.getParent() == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "No parent view found");
            }
            j4 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f20949c.getContext(), this.f20949c.getWidth());
        if (iPxToDp < Math.min(y2Var.i0(), pointB.x)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j4 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f20949c.getContext(), this.f20949c.getHeight());
        if (iPxToDp2 < y2Var.e0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j4 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f20949c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.f20949c.getWidth() + i, this.f20949c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j4 |= 128;
        }
        Activity activityB = this.f20947a.e().b();
        if (activityB != null && !r7.a(this.f20949c, activityB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20948b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j4 |= 256;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20948b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j4));
        }
        return j4;
    }
}
