package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class eo0 {
    public f23 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(wo0 wo0Var) {
        RecyclerView recyclerView;
        int i = wo0Var.j;
        if (wo0Var.f() || (i & 4) != 0 || (recyclerView = wo0Var.r) == null) {
            return;
        }
        recyclerView.F(wo0Var);
    }

    public abstract boolean a(wo0 wo0Var, wo0 wo0Var2, tg0 tg0Var, tg0 tg0Var2);

    public final void c(wo0 wo0Var) {
        f23 f23Var = this.a;
        if (f23Var != null) {
            RecyclerView recyclerView = (RecyclerView) f23Var.g;
            boolean z = true;
            wo0Var.n(true);
            View view = wo0Var.a;
            if (wo0Var.h != null && wo0Var.i == null) {
                wo0Var.h = null;
            }
            wo0Var.i = null;
            if ((wo0Var.j & 16) != 0) {
                return;
            }
            no0 no0Var = recyclerView.g;
            recyclerView.c0();
            t83 t83Var = recyclerView.j;
            ue ueVar = (ue) t83Var.h;
            z71 z71Var = (z71) t83Var.g;
            int iIndexOfChild = ((RecyclerView) z71Var.g).indexOfChild(view);
            if (iIndexOfChild == -1) {
                t83Var.Q(view);
            } else if (ueVar.q(iIndexOfChild)) {
                ueVar.C(iIndexOfChild);
                t83Var.Q(view);
                z71Var.i(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                wo0 wo0VarI = RecyclerView.I(view);
                no0Var.k(wo0VarI);
                no0Var.h(wo0VarI);
            }
            recyclerView.d0(!z);
            if (z || !wo0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(wo0 wo0Var);

    public abstract void e();

    public abstract boolean f();
}
