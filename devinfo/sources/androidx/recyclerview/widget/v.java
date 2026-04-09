package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1517a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1519c;

    public v(View view, boolean z3) {
        this.f1517a = 1;
        this.f1518b = z3;
        this.f1519c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1517a) {
            case 0:
                this.f1518b = true;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                this.f1518b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1517a) {
            case 0:
                x xVar = (x) this.f1519c;
                if (!this.f1518b) {
                    if (((Float) xVar.f1550z.getAnimatedValue()).floatValue() != 0.0f) {
                        xVar.A = 2;
                        xVar.f1543s.invalidate();
                        break;
                    } else {
                        xVar.A = 0;
                        xVar.e(0);
                        break;
                    }
                } else {
                    this.f1518b = false;
                    break;
                }
            case 1:
                if (!this.f1518b) {
                    ((View) this.f1519c).setVisibility(4);
                    break;
                }
                break;
            default:
                yc.f fVar = (yc.f) this.f1519c;
                fVar.f37561r = 0;
                fVar.f37556m = null;
                if (!this.f1518b) {
                    fVar.f37562s.a(4, false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1517a) {
            case 1:
                if (this.f1518b) {
                    ((View) this.f1519c).setVisibility(0);
                    break;
                }
                break;
            case 2:
                yc.f fVar = (yc.f) this.f1519c;
                fVar.f37562s.a(0, false);
                fVar.f37561r = 1;
                fVar.f37556m = animator;
                this.f1518b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public v(yc.f fVar) {
        this.f1517a = 2;
        this.f1519c = fVar;
    }

    public v(x xVar) {
        this.f1517a = 0;
        this.f1519c = xVar;
        this.f1518b = false;
    }
}
