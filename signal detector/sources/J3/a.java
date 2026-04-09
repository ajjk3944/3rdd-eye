package J3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2083b;

    public /* synthetic */ a(i iVar, int i) {
        this.f2082a = i;
        this.f2083b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2082a) {
            case 0:
                this.f2083b.b();
                break;
            case 1:
                this.f2083b.c();
                break;
            case 2:
                this.f2083b.b();
                break;
            default:
                this.f2083b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2082a) {
            case 1:
                i iVar = this.f2083b;
                j jVar = iVar.f2118j;
                int i = iVar.f2112c;
                int i3 = iVar.f2110a;
                int i6 = i - i3;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) jVar;
                snackbarContentLayout.f18441a.setAlpha(0.0f);
                long j6 = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.f18441a.animate().alpha(1.0f).setDuration(j6);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f18443c;
                long j7 = i6;
                duration.setInterpolator(timeInterpolator).setStartDelay(j7).start();
                if (snackbarContentLayout.f18442b.getVisibility() == 0) {
                    snackbarContentLayout.f18442b.setAlpha(0.0f);
                    snackbarContentLayout.f18442b.animate().alpha(1.0f).setDuration(j6).setInterpolator(timeInterpolator).setStartDelay(j7).start();
                    break;
                }
                break;
            case 2:
                i iVar2 = this.f2083b;
                j jVar2 = iVar2.f2118j;
                int i7 = iVar2.f2111b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) jVar2;
                snackbarContentLayout2.f18441a.setAlpha(1.0f);
                long j8 = i7;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f18441a.animate().alpha(0.0f).setDuration(j8);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f18443c;
                long j9 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j9).start();
                if (snackbarContentLayout2.f18442b.getVisibility() == 0) {
                    snackbarContentLayout2.f18442b.setAlpha(1.0f);
                    snackbarContentLayout2.f18442b.animate().alpha(0.0f).setDuration(j8).setInterpolator(timeInterpolator2).setStartDelay(j9).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(i iVar, int i, int i3) {
        this.f2082a = i3;
        this.f2083b = iVar;
    }
}
