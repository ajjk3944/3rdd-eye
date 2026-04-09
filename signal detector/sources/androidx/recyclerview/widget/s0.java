package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f5596a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f5597b;

    public s0(r0 r0Var) {
        this.f5596a = r0Var;
        q0 q0Var = new q0();
        q0Var.f5589a = 0;
        this.f5597b = q0Var;
    }

    public final View a(int i, int i3, int i6, int i7) {
        r0 r0Var = this.f5596a;
        int iB = r0Var.b();
        int iC = r0Var.c();
        int i8 = i3 > i ? 1 : -1;
        View view = null;
        while (i != i3) {
            View viewD = r0Var.d(i);
            int iA = r0Var.a(viewD);
            int iE = r0Var.e(viewD);
            q0 q0Var = this.f5597b;
            q0Var.f5590b = iB;
            q0Var.f5591c = iC;
            q0Var.f5592d = iA;
            q0Var.f5593e = iE;
            if (i6 != 0) {
                q0Var.f5589a = i6;
                if (q0Var.a()) {
                    return viewD;
                }
            }
            if (i7 != 0) {
                q0Var.f5589a = i7;
                if (q0Var.a()) {
                    view = viewD;
                }
            }
            i += i8;
        }
        return view;
    }

    public final boolean b(View view) {
        r0 r0Var = this.f5596a;
        int iB = r0Var.b();
        int iC = r0Var.c();
        int iA = r0Var.a(view);
        int iE = r0Var.e(view);
        q0 q0Var = this.f5597b;
        q0Var.f5590b = iB;
        q0Var.f5591c = iC;
        q0Var.f5592d = iA;
        q0Var.f5593e = iE;
        q0Var.f5589a = 24579;
        return q0Var.a();
    }
}
