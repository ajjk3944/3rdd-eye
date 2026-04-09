package ad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.view.StarAnimView;
import eg.l;
import j6.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import nk.k;
import t6.i0;
import xa.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f333b;

    public /* synthetic */ g(int i4, Object obj) {
        this.f332a = i4;
        this.f333b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f332a) {
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f333b;
                actionBarOverlayLayout.f741w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 15:
                m mVar = (m) this.f333b;
                mVar.setEnabled(true);
                mVar.f37073a.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f332a) {
            case 0:
                h hVar = (h) this.f333b;
                hVar.f322b.setTranslationY(0.0f);
                hVar.b(0.0f);
                break;
            case 1:
                vd.a aVar = (vd.a) this.f333b;
                l lVar = (l) aVar.f36215c;
                lVar.f23471k0.f2979h.f23802b.removeListener(this);
                if (lVar.f23472l0 != null && !lVar.f23476p0 && !i0.l(lVar.n())) {
                    lVar.f23472l0.T(lVar.U(), new o7.c(17, this));
                    lVar.f23472l0 = null;
                    break;
                } else {
                    lVar.j0((kj.f) aVar.f36214b);
                    break;
                }
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f333b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f20558p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f20558p.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                gd.e eVar = (gd.e) this.f333b;
                ViewGroup viewGroupE = zc.m.e(eVar);
                ViewOverlay overlay = viewGroupE == null ? null : viewGroupE.getOverlay();
                if (overlay != null) {
                    ArrayList arrayList = eVar.f24659l;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        overlay.remove((nd.a) obj);
                    }
                    break;
                }
                break;
            case 4:
                ((o) this.f333b).m();
                animator.removeListener(this);
                break;
            case 5:
                k6.e eVar2 = (k6.e) this.f333b;
                ArrayList arrayList2 = new ArrayList(eVar2.f27979e);
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ColorStateList colorStateList = ((rc.a) arrayList2.get(i10)).f32902b.f32914o;
                    if (colorStateList != null) {
                        eVar2.setTintList(colorStateList);
                    }
                }
                break;
            case 6:
                kd.l lVar2 = (kd.l) this.f333b;
                lVar2.p();
                lVar2.f28172r.start();
                break;
            case 7:
                StarAnimView starAnimView = (StarAnimView) this.f333b;
                starAnimView.f21362c = 0;
                starAnimView.f21363d = 0;
                starAnimView.invalidate();
                break;
            case 8:
                ((HideBottomViewOnScrollBehavior) this.f333b).f20334k = null;
                break;
            case 9:
                ((HideViewOnScrollBehavior) this.f333b).f20343k = null;
                break;
            case 10:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f333b;
                bottomSheetBehavior.K(5);
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    break;
                }
                break;
            case 11:
                ((ExpandableTransformationBehavior) this.f333b).f20680b = null;
                break;
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f333b;
                actionBarOverlayLayout.f741w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 13:
                k.e(animator, "animation");
                qj.a aVar2 = (qj.a) this.f333b;
                Button button = (Button) aVar2.f32441c.f19295a;
                k.d(button, "clearBtn");
                button.setVisibility(8);
                TextView textView = (TextView) aVar2.f32441c.f19299e;
                k.d(textView, "statusText");
                textView.setVisibility(0);
                ((TextView) aVar2.f32441c.f19299e).setText(R.string.fa_string_cleaning);
                break;
            case 14:
                k.e(animator, "animation");
                Runnable runnable = (Runnable) this.f333b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                m mVar = (m) this.f333b;
                mVar.setEnabled(true);
                mVar.f37073a.setEnabled(true);
                break;
            default:
                yc.f fVar = (yc.f) this.f333b;
                fVar.f37561r = 0;
                fVar.f37556m = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f332a) {
            case 5:
                k6.e eVar = (k6.e) this.f333b;
                ArrayList arrayList = new ArrayList(eVar.f27979e);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    rc.c cVar = ((rc.a) arrayList.get(i4)).f32902b;
                    ColorStateList colorStateList = cVar.f32914o;
                    if (colorStateList != null) {
                        eVar.setTint(colorStateList.getColorForState(cVar.f32918s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 7:
                StarAnimView starAnimView = (StarAnimView) this.f333b;
                starAnimView.f21362c = 255;
                starAnimView.f21363d = 255;
                break;
            case 15:
                m mVar = (m) this.f333b;
                mVar.setEnabled(false);
                mVar.f37073a.setEnabled(false);
                break;
            case 16:
                yc.f fVar = (yc.f) this.f333b;
                fVar.f37562s.a(0, false);
                fVar.f37561r = 2;
                fVar.f37556m = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
