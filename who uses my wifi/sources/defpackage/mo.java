package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                oo ooVar = (oo) this.b;
                ooVar.v.e = ooVar.A.getInterpolation(ooVar.z.getAnimatedFraction());
                break;
            case 1:
                tq tqVar = (tq) this.b;
                tqVar.getClass();
                tqVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                i90 i90Var = (i90) this.b;
                x8 x8Var = i90Var.Q;
                if (x8Var == null) {
                    x8Var = x8.f;
                }
                if (x8Var != x8.g) {
                    fh fhVar = i90Var.t;
                    if (fhVar != null) {
                        fhVar.r(i90Var.g.a());
                        break;
                    }
                } else {
                    i90Var.invalidateSelf();
                    break;
                }
                break;
            default:
                fc0 fc0Var = (fc0) this.b;
                fc0Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var.j.setAlpha((int) (255.0f * fFloatValue));
                fc0Var.x = fFloatValue;
                break;
        }
    }
}
