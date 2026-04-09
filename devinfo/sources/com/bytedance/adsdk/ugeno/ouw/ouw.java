package com.bytedance.adsdk.ugeno.ouw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends AnimatorListenerAdapter {
    private com.bytedance.adsdk.ugeno.ouw.ouw.ouw bly;
    private lh fkw;

    /* renamed from: le, reason: collision with root package name */
    private Context f6913le;

    /* renamed from: lh, reason: collision with root package name */
    public vt f6914lh;
    public ValueAnimator ouw;
    private int pno = 1;
    private int ra;
    public String vt;
    private com.bytedance.adsdk.ugeno.vt.lh yu;

    public ouw(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, lh lhVar2) {
        this.yu = lhVar;
        this.fkw = lhVar2;
        this.f6913le = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.ValueAnimator lh() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.ouw.ouw.lh():android.animation.ValueAnimator");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        vt vtVar = this.f6914lh;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        vt vtVar = this.f6914lh;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    public final void ouw() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator == null || this.pno == 0 || this.ra == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public final void vt() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void vt(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.vt(canvas);
        }
    }

    public final void ouw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(canvas);
        }
    }

    public final void ouw(int i4, int i10) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(i4, i10);
        }
    }
}
