package eh;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b5.o0;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;
import com.liuzh.deviceinfo.view.SimpleShimmerLayout;
import com.liuzh.deviceinfo.view.StarAnimView;
import ed.n;
import f7.x;
import gd.e;
import hh.v;
import java.util.ArrayList;
import kd.l;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23478b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f23477a = i4;
        this.f23478b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f23477a;
        Object obj = this.f23478b;
        switch (i4) {
            case 0:
                o0 o0Var = LogInActivity.D;
                k.e(valueAnimator, "it");
                ((LogInActivity) obj).getClass();
                k.k("binding");
                throw null;
            case 1:
                x xVar = (x) obj;
                f7.a aVar = xVar.L;
                if (aVar == null) {
                    aVar = f7.a.f23689a;
                }
                if (aVar == f7.a.f23690b) {
                    xVar.invalidateSelf();
                    return;
                }
                n7.b bVar = xVar.f23813o;
                if (bVar != null) {
                    bVar.r(xVar.f23802b.e());
                    return;
                }
                return;
            case 2:
                e eVar = (e) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = eVar.f24659l;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    nd.a aVar2 = (nd.a) obj2;
                    aVar2.U = fFloatValue;
                    aVar2.V = fFloatValue;
                    aVar2.Y = jc.a.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    aVar2.invalidateSelf();
                }
                eVar.postInvalidateOnAnimation();
                return;
            case 3:
                k.e(valueAnimator, "it");
                n nVar = ((v) obj).Z;
                if (nVar == null) {
                    k.k("binding");
                    throw null;
                }
                ImageView imageView = (ImageView) nVar.f23347f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                k.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                imageView.setTranslationY(((Float) animatedValue).floatValue());
                return;
            case 4:
                l lVar = (l) obj;
                lVar.getClass();
                lVar.f28198d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                int i11 = SimpleShimmerLayout.f21355e;
                ((SimpleShimmerLayout) obj).invalidate();
                return;
            case 6:
                StarAnimView starAnimView = (StarAnimView) obj;
                int i12 = StarAnimView.j;
                starAnimView.getClass();
                starAnimView.f21361b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                double animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.7d && animatedFraction <= 0.9d) {
                    starAnimView.f21363d = (int) (((0.7d - animatedFraction) / 0.2d) * 255.0d);
                }
                if (animatedFraction >= 0.8d) {
                    starAnimView.f21362c = (int) (((1.0f - r14) / 0.2d) * 255.0d);
                }
                starAnimView.invalidate();
                return;
            default:
                k.e(valueAnimator, "animation");
                ((TextView) obj).setText(valueAnimator.getAnimatedValue().toString());
                return;
        }
    }
}
