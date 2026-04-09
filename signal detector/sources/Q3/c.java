package Q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.C0317n;
import v3.f;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3188c;

    public c(View view, boolean z6) {
        this.f3186a = 0;
        this.f3187b = z6;
        this.f3188c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3186a) {
            case 1:
                this.f3187b = true;
                break;
            case 2:
                this.f3187b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3186a) {
            case 0:
                if (!this.f3187b) {
                    ((View) this.f3188c).setVisibility(4);
                    break;
                }
                break;
            case 1:
                C0317n c0317n = (C0317n) this.f3188c;
                if (!this.f3187b) {
                    if (((Float) c0317n.f5553z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0317n.f5527A = 2;
                        c0317n.f5546s.invalidate();
                        break;
                    } else {
                        c0317n.f5527A = 0;
                        c0317n.d(0);
                        break;
                    }
                } else {
                    this.f3187b = false;
                    break;
                }
            default:
                f fVar = (f) this.f3188c;
                fVar.f23885r = 0;
                fVar.f23880m = null;
                if (!this.f3187b) {
                    fVar.f23886s.a(4, false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3186a) {
            case 0:
                if (this.f3187b) {
                    ((View) this.f3188c).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                f fVar = (f) this.f3188c;
                fVar.f23886s.a(0, false);
                fVar.f23885r = 1;
                fVar.f23880m = animator;
                this.f3187b = false;
                break;
        }
    }

    public c(f fVar) {
        this.f3186a = 2;
        this.f3188c = fVar;
    }

    public c(C0317n c0317n) {
        this.f3186a = 1;
        this.f3188c = c0317n;
        this.f3187b = false;
    }
}
