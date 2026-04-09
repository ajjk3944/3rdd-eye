package androidx.recyclerview.widget;

import R.C0187n;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public E f5292a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f5293b;

    /* renamed from: c, reason: collision with root package name */
    public long f5294c;

    /* renamed from: d, reason: collision with root package name */
    public long f5295d;

    /* renamed from: e, reason: collision with root package name */
    public long f5296e;

    /* renamed from: f, reason: collision with root package name */
    public long f5297f;

    public static void b(g0 g0Var) {
        int i = g0Var.mFlags;
        if (!g0Var.isInvalid() && (i & 4) == 0) {
            g0Var.getOldPosition();
            g0Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(g0 g0Var, g0 g0Var2, C0187n c0187n, C0187n c0187n2);

    public final void c(g0 g0Var) {
        E e6 = this.f5292a;
        if (e6 != null) {
            RecyclerView recyclerView = e6.f5281a;
            boolean z6 = true;
            g0Var.setIsRecyclable(true);
            if (g0Var.mShadowedHolder != null && g0Var.mShadowingHolder == null) {
                g0Var.mShadowedHolder = null;
            }
            g0Var.mShadowingHolder = null;
            if (g0Var.shouldBeKeptAsChild()) {
                return;
            }
            View view = g0Var.itemView;
            X x6 = recyclerView.f5342b;
            recyclerView.f0();
            C0306c c0306c = recyclerView.f5347e;
            U1.b bVar = c0306c.f5437b;
            E e7 = c0306c.f5436a;
            int iIndexOfChild = e7.f5281a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0306c.l(view);
            } else if (bVar.k(iIndexOfChild)) {
                bVar.q(iIndexOfChild);
                c0306c.l(view);
                e7.h(iIndexOfChild);
            } else {
                z6 = false;
            }
            if (z6) {
                g0 g0VarJ = RecyclerView.J(view);
                x6.k(g0VarJ);
                x6.h(g0VarJ);
            }
            recyclerView.g0(!z6);
            if (z6 || !g0Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(g0Var.itemView, false);
        }
    }

    public abstract void d(g0 g0Var);

    public abstract void e();

    public abstract boolean f();
}
