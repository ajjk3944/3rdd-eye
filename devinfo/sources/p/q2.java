package p;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2 f30824a;

    public q2(z2 z2Var) {
        this.f30824a = z2Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        z2 z2Var = this.f30824a;
        View.OnFocusChangeListener onFocusChangeListener = z2Var.M;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(z2Var, z3);
        }
    }
}
