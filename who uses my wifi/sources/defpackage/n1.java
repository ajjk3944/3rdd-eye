package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 11:
                tg4 tg4Var = (tg4) this.b;
                tg4Var.setEnabled(true);
                tg4Var.f.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 1:
                n4 n4Var = (n4) this.b;
                ArrayList arrayList = new ArrayList(n4Var.j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fa) arrayList.get(i)).a(n4Var);
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                tq tqVar = (tq) this.b;
                tqVar.p();
                tqVar.r.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) this.b).b = null;
                break;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.b).l = null;
                break;
            case 6:
                ((HideViewOnScrollBehavior) this.b).k = null;
                break;
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                rb0 rb0Var = (rb0) this.b;
                rb0Var.b.setTranslationY(0.0f);
                rb0Var.b(0.0f);
                break;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 10:
                ((v21) this.b).m();
                animator.removeListener(this);
                break;
            case 11:
                tg4 tg4Var = (tg4) this.b;
                tg4Var.setEnabled(true);
                tg4Var.f.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 7:
                super.onAnimationRepeat(animator);
                n60 n60Var = (n60) this.b;
                n60Var.f = (n60Var.f + 1) % n60Var.e.e.length;
                n60Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                n4 n4Var = (n4) this.b;
                ArrayList arrayList = new ArrayList(n4Var.j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fa) arrayList.get(i)).b(n4Var);
                }
                break;
            case 11:
                tg4 tg4Var = (tg4) this.b;
                tg4Var.setEnabled(false);
                tg4Var.f.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
