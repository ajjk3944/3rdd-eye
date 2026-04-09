package H8;

import J8.C0694i;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.lifecycle.AbstractC1781n;
import b9.C2001h;
import b9.p;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;

/* compiled from: SplashScreenConfiguratorImpl.kt */
/* loaded from: classes3.dex */
public class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final p f2329c;

    public j(PHSplashActivity pHSplashActivity) {
        super(pHSplashActivity);
        this.f2329c = C2001h.b(new d(pHSplashActivity, 1));
    }

    @Override // H8.i
    public void a() {
        Object value = this.f2329c.getValue();
        kotlin.jvm.internal.l.e(value, "getValue(...)");
        ValueAnimator valueAnimatorA = C0694i.a((ProgressBar) value, 0.0f, 1.0f);
        valueAnimatorA.setStartDelay(1000L);
        valueAnimatorA.setDuration(500L);
        valueAnimatorA.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorA.addListener(new a());
        C0694i.b(valueAnimatorA, this.f2327a.getLifecycle(), AbstractC1781n.a.ON_STOP);
        valueAnimatorA.start();
    }

    @Override // H8.i
    public void b() {
    }

    /* compiled from: Animator.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PHSplashActivity.a aVar = j.this.f2328b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
