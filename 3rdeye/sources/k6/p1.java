package K6;

import H6.C0675l;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class p1 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0675l f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A7.d f3579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f3580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N7.Z f3581f;

    public p1(v1 v1Var, C0675l c0675l, A7.d dVar, View view, N7.Z z10) {
        this.f3577b = v1Var;
        this.f3578c = c0675l;
        this.f3579d = dVar;
        this.f3580e = view;
        this.f3581f = z10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        v1 v1Var = this.f3577b;
        H6.L.j(v1Var.f3668m, this.f3578c, this.f3579d, this.f3580e, this.f3581f);
    }
}
