package A3;

import R.T;
import R.W;
import R.a0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import u.C2936e;

/* renamed from: A3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366c;

    public /* synthetic */ C0134c(View view, int i, Object obj) {
        this.f364a = i;
        this.f365b = obj;
        this.f366c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f364a) {
            case 2:
                ((T) this.f365b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f364a) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) this.f365b;
                drawerLayout.b((NavigationView) this.f366c, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                ((C2936e) this.f365b).remove(animator);
                ((L0.l) this.f366c).f2456C.remove(animator);
                break;
            case 2:
                ((T) this.f365b).c();
                break;
            default:
                ((a0) this.f365b).f3300a.d(1.0f);
                W.e((View) this.f366c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f364a) {
            case 1:
                ((L0.l) this.f366c).f2456C.add(animator);
                break;
            case 2:
                ((T) this.f365b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0134c(L0.l lVar, C2936e c2936e) {
        this.f364a = 1;
        this.f366c = lVar;
        this.f365b = c2936e;
    }
}
