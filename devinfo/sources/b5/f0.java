package b5;

import android.view.View;
import android.view.ViewGroup;
import u0.s1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1792a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1794c;

    public f0(g0 g0Var, b1 b1Var) {
        this.f1794c = g0Var;
        this.f1793b = b1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1792a) {
            case 0:
                b1 b1Var = (b1) this.f1793b;
                z zVar = b1Var.f1747c;
                b1Var.k();
                n.i((ViewGroup) zVar.H.getParent(), ((g0) this.f1794c).f1798a).h();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1792a) {
            case 0:
                break;
            default:
                ((View) this.f1793b).removeOnAttachStateChangeListener(this);
                ((s1) this.f1794c).C();
                break;
        }
    }

    public f0(View view, s1 s1Var) {
        this.f1793b = view;
        this.f1794c = s1Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
