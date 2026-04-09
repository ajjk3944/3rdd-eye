package ge;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9520b;

    public /* synthetic */ a(h hVar, int i10) {
        this.f9519a = i10;
        this.f9520b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9519a) {
            case 0:
                this.f9520b.b();
                break;
            case 1:
                this.f9520b.c();
                break;
            case 2:
                this.f9520b.b();
                break;
            default:
                this.f9520b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9519a) {
            case 1:
                h hVar = this.f9520b;
                i iVar = hVar.j;
                int i10 = hVar.f9540c;
                int i11 = hVar.f9538a;
                int i12 = i10 - i11;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) iVar;
                snackbarContentLayout.f5705a.setAlpha(0.0f);
                long j = i11;
                ViewPropertyAnimator duration = snackbarContentLayout.f5705a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f5707g;
                long j7 = i12;
                duration.setInterpolator(timeInterpolator).setStartDelay(j7).start();
                if (snackbarContentLayout.f5706d.getVisibility() == 0) {
                    snackbarContentLayout.f5706d.setAlpha(0.0f);
                    snackbarContentLayout.f5706d.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j7).start();
                    break;
                }
                break;
            case 2:
                h hVar2 = this.f9520b;
                i iVar2 = hVar2.j;
                int i13 = hVar2.f9539b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) iVar2;
                snackbarContentLayout2.f5705a.setAlpha(1.0f);
                long j10 = i13;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f5705a.animate().alpha(0.0f).setDuration(j10);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f5707g;
                long j11 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j11).start();
                if (snackbarContentLayout2.f5706d.getVisibility() == 0) {
                    snackbarContentLayout2.f5706d.setAlpha(1.0f);
                    snackbarContentLayout2.f5706d.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator2).setStartDelay(j11).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(h hVar, int i10, int i11) {
        this.f9519a = i11;
        this.f9520b = hVar;
    }
}
