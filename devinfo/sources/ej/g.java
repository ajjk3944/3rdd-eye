package ej;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f23502b;

    public /* synthetic */ g(i iVar, int i4) {
        this.f23501a = i4;
        this.f23502b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23501a) {
            case 0:
                nk.k.e(animator, "animation");
                i iVar = this.f23502b;
                if (!i0.l(iVar.n()) && iVar.y() && !iVar.C) {
                    iVar.U().invalidateOptionsMenu();
                    break;
                }
                break;
            default:
                nk.k.e(animator, "animation");
                i iVar2 = this.f23502b;
                if (!i0.l(iVar2.n()) && iVar2.y() && !iVar2.C) {
                    ((FrameLayout) iVar2.d0().f36150f).removeAllViews();
                    iVar2.U().invalidateOptionsMenu();
                    break;
                }
                break;
        }
    }
}
