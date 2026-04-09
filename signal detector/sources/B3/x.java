package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import x3.AbstractC2993B;
import z3.C3021f;

/* loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f678b;

    public /* synthetic */ x(int i, Object obj) {
        this.f677a = i;
        this.f678b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f677a) {
            case 10:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f678b;
                actionBarOverlayLayout.f4826K = null;
                actionBarOverlayLayout.f4839j = false;
                break;
            case 11:
                s2.l lVar = (s2.l) this.f678b;
                lVar.setEnabled(true);
                lVar.f23495a.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f677a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f678b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f18420D;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f18420D.get()).requestLayout();
                    break;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                I3.e eVar = (I3.e) this.f678b;
                ViewGroup viewGroupF = AbstractC2993B.f(eVar);
                ViewOverlay overlay = viewGroupF == null ? null : viewGroupF.getOverlay();
                if (overlay != null) {
                    ArrayList arrayList = eVar.f1977l;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        overlay.remove((P3.b) obj);
                    }
                    break;
                }
                break;
            case 3:
                ((L0.l) this.f678b).m();
                animator.removeListener(this);
                break;
            case 4:
                M0.f fVar = (M0.f) this.f678b;
                ArrayList arrayList2 = new ArrayList(fVar.f2639e);
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((c) arrayList2.get(i3)).a(fVar);
                }
                break;
            case 5:
                M3.k kVar = (M3.k) this.f678b;
                kVar.q();
                kVar.f2865r.start();
                break;
            case 6:
                ((ExpandableTransformationBehavior) this.f678b).f18609b = null;
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f678b).f18095k = null;
                break;
            case 8:
                ((HideViewOnScrollBehavior) this.f678b).f18105k = null;
                break;
            case 9:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f678b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference2 = bottomSheetBehavior.f18156k0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f18156k0.get()).requestLayout();
                    break;
                }
                break;
            case 10:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f678b;
                actionBarOverlayLayout.f4826K = null;
                actionBarOverlayLayout.f4839j = false;
                break;
            case 11:
                s2.l lVar = (s2.l) this.f678b;
                lVar.setEnabled(true);
                lVar.f23495a.setEnabled(true);
                break;
            case 12:
                v3.f fVar2 = (v3.f) this.f678b;
                fVar2.f23885r = 0;
                fVar2.f23880m = null;
                break;
            case 13:
                C3021f c3021f = (C3021f) this.f678b;
                c3021f.f24463b.setTranslationY(0.0f);
                c3021f.b(0.0f);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f677a) {
            case 0:
                super.onAnimationRepeat(animator);
                y yVar = (y) this.f678b;
                yVar.f682f = (yVar.f682f + 1) % yVar.f681e.f563e.length;
                yVar.f683g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f677a) {
            case 4:
                M0.f fVar = (M0.f) this.f678b;
                ArrayList arrayList = new ArrayList(fVar.f2639e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).b(fVar);
                }
                break;
            case 11:
                s2.l lVar = (s2.l) this.f678b;
                lVar.setEnabled(false);
                lVar.f23495a.setEnabled(false);
                break;
            case 12:
                v3.f fVar2 = (v3.f) this.f678b;
                fVar2.f23886s.a(0, false);
                fVar2.f23885r = 2;
                fVar2.f23880m = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
