package H8;

import android.animation.Animator;
import android.widget.TextView;
import b9.C2001h;
import b9.p;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;

/* compiled from: SplashScreenConfiguratorImpl33.kt */
/* loaded from: classes3.dex */
public final class l extends k {

    /* renamed from: e, reason: collision with root package name */
    public final p f2332e;

    /* renamed from: f, reason: collision with root package name */
    public final p f2333f;

    public l(PHSplashActivity pHSplashActivity) {
        super(pHSplashActivity);
        this.f2332e = C2001h.b(new c(pHSplashActivity, 1));
        this.f2333f = C2001h.b(new d(pHSplashActivity, 2));
    }

    @Override // H8.j, H8.i
    public final void a() {
        Object value = this.f2333f.getValue();
        kotlin.jvm.internal.l.e(value, "getValue(...)");
        ((TextView) value).setAlpha(0.0f);
        I0.b bVar = this.f2331d;
        if (bVar == null) {
            kotlin.jvm.internal.l.l("splashScreen");
            throw null;
        }
        bVar.f2382a.b(new F3.h(2));
    }

    @Override // H8.k, H8.j, H8.i
    public final void b() {
        super.b();
        I0.b bVar = this.f2331d;
        if (bVar == null) {
            kotlin.jvm.internal.l.l("splashScreen");
            throw null;
        }
        bVar.f2382a.b(new B4.i(2));
        I0.b bVar2 = this.f2331d;
        if (bVar2 == null) {
            kotlin.jvm.internal.l.l("splashScreen");
            throw null;
        }
        bVar2.f2382a.c(new B.d(this, 6));
    }

    /* compiled from: Animator.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PHSplashActivity.a aVar = l.this.f2328b;
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

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I0.k f2335a;

        public b(I0.k kVar) {
            this.f2335a = kVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f2335a.f2403a.d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
