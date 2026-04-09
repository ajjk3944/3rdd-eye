package com.staircase3.opensignal.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6178d;

    public /* synthetic */ b(boolean z10, View view, Object obj, int i10) {
        this.f6175a = i10;
        this.f6176b = z10;
        this.f6177c = view;
        this.f6178d = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6175a) {
            case 0:
                if (this.f6176b) {
                    this.f6177c.setVisibility(4);
                }
                d dVar = (d) this.f6178d;
                if (dVar != null) {
                    dVar.D();
                    break;
                }
                break;
            default:
                View view = (View) this.f6178d;
                if (!this.f6176b) {
                    this.f6177c.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6175a) {
            case 1:
                View view = (View) this.f6178d;
                if (this.f6176b) {
                    this.f6177c.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
