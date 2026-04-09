package bq;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.staircase3.opensignal.views.SpeedDialView;
import com.survicate.surveys.presentation.widget.MicroDotsProgressBar;
import r8.v;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2860b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2859a = i10;
        this.f2860b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f2859a;
        Object obj = this.f2860b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj;
                int i11 = MicroDotsProgressBar.f6547r;
                br.l.e(imageView, "$dot");
                br.l.e(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                br.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                imageView.setScaleX(fFloatValue);
                imageView.setScaleY(fFloatValue);
                break;
            case 1:
                com.google.android.exoplayer2.ui.e eVar = (com.google.android.exoplayer2.ui.e) obj;
                eVar.getClass();
                eVar.f4642d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.invalidate(eVar.f4637a);
                break;
            case 2:
                je.j jVar = (je.j) obj;
                jVar.getClass();
                jVar.f13651d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                nd.c cVar = (nd.c) obj;
                cVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.j.setAlpha((int) (255.0f * fFloatValue2));
                cVar.f17517x = fFloatValue2;
                break;
            case 4:
                SpeedDialView speedDialView = (SpeedDialView) obj;
                int i12 = SpeedDialView.f6338c0;
                br.l.e(valueAnimator, "it");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                br.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                speedDialView.S = ((Float) animatedValue2).floatValue();
                speedDialView.invalidate();
                break;
            default:
                v vVar = (v) obj;
                r8.a aVar = vVar.f21386i0;
                if (aVar == null) {
                    aVar = r8.d.f21312a;
                }
                if (aVar != r8.a.ENABLED) {
                    a9.d dVar = vVar.L;
                    if (dVar != null) {
                        dVar.r(vVar.f21379d.a());
                        break;
                    }
                } else {
                    vVar.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
