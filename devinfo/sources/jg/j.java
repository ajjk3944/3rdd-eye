package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StorageCleanActivity f27673b;

    public /* synthetic */ j(StorageCleanActivity storageCleanActivity, int i4) {
        this.f27672a = i4;
        this.f27673b = storageCleanActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27672a) {
            case 0:
                nk.k.e(animator, "animation");
                e80 e80Var = this.f27673b.E;
                if (e80Var == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) e80Var.f10737k;
                nk.k.d(constraintLayout, "scanResultLayout");
                constraintLayout.setVisibility(8);
                return;
            default:
                nk.k.e(animator, "animation");
                e80 e80Var2 = this.f27673b.E;
                if (e80Var2 != null) {
                    ((TextView) e80Var2.f10741o).setVisibility(8);
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
        }
    }
}
