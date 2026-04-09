package od;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.j9;
import com.liuzh.deviceinfo.splash.SplashActivity;
import o.e;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30523a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f30525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f30526d;

    public b(boolean z3, View view, View view2) {
        this.f30524b = z3;
        this.f30525c = view;
        this.f30526d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30523a) {
            case 0:
                View view = (View) this.f30526d;
                if (!this.f30524b) {
                    this.f30525c.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f30526d;
                if (!i0.l(splashActivity)) {
                    splashActivity.F.a(splashActivity, new e(12, new j9(this, this.f30524b, (ViewGroup) this.f30525c, 4)));
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f30523a) {
            case 0:
                View view = (View) this.f30526d;
                if (this.f30524b) {
                    this.f30525c.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public b(SplashActivity splashActivity, boolean z3, ViewGroup viewGroup) {
        this.f30526d = splashActivity;
        this.f30524b = z3;
        this.f30525c = viewGroup;
    }
}
