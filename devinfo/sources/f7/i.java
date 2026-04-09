package f7;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23748a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f23749b;

    public i(LottieAnimationView lottieAnimationView, int i4) {
        this.f23748a = i4;
        switch (i4) {
            case 1:
                this.f23749b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f23749b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // f7.a0
    public final void onResult(Object obj) {
        switch (this.f23748a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f23749b.get();
                if (lottieAnimationView != null) {
                    int i4 = lottieAnimationView.g;
                    if (i4 != 0) {
                        lottieAnimationView.setImageResource(i4);
                    }
                    a0 a0Var = lottieAnimationView.f2978f;
                    if (a0Var == null) {
                        a0Var = LottieAnimationView.f2975q;
                    }
                    a0Var.onResult(th2);
                    break;
                }
                break;
            default:
                j jVar = (j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f23749b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(jVar);
                    break;
                }
                break;
        }
    }
}
