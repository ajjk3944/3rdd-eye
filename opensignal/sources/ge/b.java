package ge;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9522b;

    public /* synthetic */ b(h hVar, int i10) {
        this.f9521a = i10;
        this.f9522b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9521a) {
            case 0:
                this.f9522b.f9546i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = this.f9522b;
                hVar.f9546i.setScaleX(fFloatValue);
                hVar.f9546i.setScaleY(fFloatValue);
                break;
            case 2:
                this.f9522b.f9546i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.f9522b.f9546i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
