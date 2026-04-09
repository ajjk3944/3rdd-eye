package A3;

import android.animation.ValueAnimator;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.lefan.signal.ad.FreeAdActivity;
import com.lefan.signal.ui.noise.NoiseView;
import com.lefan.signal.ui.sensor.TemperatureView;
import com.lefan.signal.ui.speed.SpeedView;
import e3.AbstractC2303a;
import java.util.ArrayList;
import m3.C2663c;

/* renamed from: A3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0133b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f363b;

    public /* synthetic */ C0133b(int i, Object obj) {
        this.f362a = i;
        this.f363b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f362a;
        int i3 = 0;
        Object obj = this.f363b;
        switch (i) {
            case 0:
                ((DrawerLayout) obj).setScrimColor(J.a.e(-1728053248, AbstractC2303a.c(valueAnimator.getAnimatedFraction(), AbstractC0135d.f367a, 0)));
                break;
            case 1:
                B3.o oVar = (B3.o) obj;
                oVar.f623E.f650e = oVar.f628J.getInterpolation(oVar.f627I.getAnimatedFraction());
                break;
            case 2:
                I3.e eVar = (I3.e) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = eVar.f1977l;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    P3.b bVar = (P3.b) obj2;
                    bVar.f3140i0 = fFloatValue;
                    bVar.f3141j0 = fFloatValue;
                    bVar.f3144m0 = AbstractC2303a.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    bVar.invalidateSelf();
                }
                eVar.postInvalidateOnAnimation();
                break;
            case 3:
                int i6 = FreeAdActivity.f18830R;
                q5.i.e(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                q5.i.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                ((TextView) obj).setText(String.valueOf(((Integer) animatedValue).intValue()));
                break;
            case 4:
                M3.k kVar = (M3.k) obj;
                kVar.getClass();
                kVar.f2898d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                NoiseView noiseView = (NoiseView) obj;
                int i7 = NoiseView.f19030D;
                q5.i.e(valueAnimator, "it");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                q5.i.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                noiseView.f19032a = ((Float) animatedValue2).floatValue();
                noiseView.postInvalidate();
                break;
            case 6:
                TemperatureView temperatureView = (TemperatureView) obj;
                int i8 = TemperatureView.f19270C;
                q5.i.e(valueAnimator, "it");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                q5.i.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                temperatureView.f19278h = ((Float) animatedValue3).floatValue();
                temperatureView.postInvalidate();
                break;
            case 7:
                SpeedView speedView = (SpeedView) obj;
                int i9 = SpeedView.f19328G;
                q5.i.e(valueAnimator, "it");
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                q5.i.c(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                speedView.f19333a = ((Float) animatedValue4).floatValue();
                speedView.postInvalidate();
                break;
            default:
                C2663c c2663c = (C2663c) obj;
                c2663c.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2663c.f21963j.setAlpha((int) (255.0f * fFloatValue2));
                c2663c.f21977x = fFloatValue2;
                break;
        }
    }
}
