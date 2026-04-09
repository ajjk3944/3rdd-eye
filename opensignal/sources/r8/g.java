package r8;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21321a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f21322b;

    public g(LottieAnimationView lottieAnimationView, int i10) {
        this.f21321a = i10;
        switch (i10) {
            case 1:
                this.f21322b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f21322b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // r8.y
    public final void onResult(Object obj) {
        switch (this.f21321a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f21322b.get();
                if (lottieAnimationView != null) {
                    int i10 = lottieAnimationView.B;
                    if (i10 != 0) {
                        lottieAnimationView.setImageResource(i10);
                    }
                    y yVar = lottieAnimationView.f4003y;
                    if (yVar == null) {
                        yVar = LottieAnimationView.M;
                    }
                    yVar.onResult(th2);
                    break;
                }
                break;
            default:
                h hVar = (h) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f21322b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(hVar);
                    break;
                }
                break;
        }
    }
}
