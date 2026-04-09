package i;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11105a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f11106d;

    public /* synthetic */ p(a0 a0Var, int i10) {
        this.f11105a = i10;
        this.f11106d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f11105a) {
            case 0:
                a0 a0Var = this.f11106d;
                if ((a0Var.f10985v0 & 1) != 0) {
                    a0Var.t(0);
                }
                if ((a0Var.f10985v0 & 4096) != 0) {
                    a0Var.t(108);
                }
                a0Var.f10984u0 = false;
                a0Var.f10985v0 = 0;
                break;
            default:
                a0 a0Var2 = this.f11106d;
                a0Var2.S.showAtLocation(a0Var2.R, 55, 0, 0);
                u3.l0 l0Var = a0Var2.U;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (!a0Var2.V || (viewGroup = a0Var2.W) == null || !viewGroup.isLaidOut()) {
                    a0Var2.R.setAlpha(1.0f);
                    a0Var2.R.setVisibility(0);
                    break;
                } else {
                    a0Var2.R.setAlpha(0.0f);
                    u3.l0 l0VarA = u3.i0.a(a0Var2.R);
                    l0VarA.a(1.0f);
                    a0Var2.U = l0VarA;
                    l0VarA.d(new r(0, this));
                    break;
                }
                break;
        }
    }
}
