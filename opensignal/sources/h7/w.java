package h7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10225a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10227c;

    public w(View view, boolean z10) {
        this.f10225a = 1;
        this.f10226b = z10;
        this.f10227c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10225a) {
            case 0:
                this.f10226b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10225a) {
            case 0:
                x xVar = (x) this.f10227c;
                if (!this.f10226b) {
                    if (((Float) xVar.f10258z.getAnimatedValue()).floatValue() != 0.0f) {
                        xVar.A = 2;
                        xVar.f10251s.invalidate();
                        break;
                    } else {
                        xVar.A = 0;
                        xVar.i(0);
                        break;
                    }
                } else {
                    this.f10226b = false;
                    break;
                }
            case 1:
                if (!this.f10226b) {
                    ((View) this.f10227c).setVisibility(4);
                    break;
                }
                break;
            default:
                wd.h hVar = (wd.h) this.f10227c;
                hVar.f24464r = 0;
                hVar.f24459m = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10225a) {
            case 1:
                if (this.f10226b) {
                    ((View) this.f10227c).setVisibility(0);
                    break;
                }
                break;
            case 2:
                wd.h hVar = (wd.h) this.f10227c;
                hVar.f24465s.a(0, this.f10226b);
                hVar.f24464r = 2;
                hVar.f24459m = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public w(x xVar) {
        this.f10225a = 0;
        this.f10227c = xVar;
        this.f10226b = false;
    }

    public w(wd.h hVar, boolean z10) {
        this.f10225a = 2;
        this.f10227c = hVar;
        this.f10226b = z10;
    }
}
