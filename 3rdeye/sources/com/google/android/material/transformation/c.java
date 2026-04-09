package com.google.android.material.transformation;

import V3.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23222a;

    public c(d dVar) {
        this.f23222a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f23222a;
        d.C0183d revealInfo = dVar.getRevealInfo();
        revealInfo.f12920c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
