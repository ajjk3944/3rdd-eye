package J3;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2085b;

    public /* synthetic */ b(i iVar, int i) {
        this.f2084a = i;
        this.f2085b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2084a) {
            case 0:
                this.f2085b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar = this.f2085b;
                iVar.i.setScaleX(fFloatValue);
                iVar.i.setScaleY(fFloatValue);
                break;
            case 2:
                this.f2085b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.f2085b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
