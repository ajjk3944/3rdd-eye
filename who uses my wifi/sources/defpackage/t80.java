package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t80 implements m90 {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public t80(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.m90
    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.l;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    m90 m90Var = lottieAnimationView.k;
                    if (m90Var == null) {
                        m90Var = LottieAnimationView.v;
                    }
                    m90Var.onResult(th);
                    break;
                }
                break;
            default:
                u80 u80Var = (u80) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(u80Var);
                    break;
                }
                break;
        }
    }
}
