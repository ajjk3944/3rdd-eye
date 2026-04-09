package wd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f24441c;

    public d(h hVar, boolean z10) {
        this.f24441c = hVar;
        this.f24440b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f24439a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f24441c;
        hVar.f24464r = 0;
        hVar.f24459m = null;
        if (this.f24439a) {
            return;
        }
        FloatingActionButton floatingActionButton = hVar.f24465s;
        boolean z10 = this.f24440b;
        floatingActionButton.a(z10 ? 8 : 4, z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        h hVar = this.f24441c;
        hVar.f24465s.a(0, this.f24440b);
        hVar.f24464r = 1;
        hVar.f24459m = animator;
        this.f24439a = false;
    }
}
