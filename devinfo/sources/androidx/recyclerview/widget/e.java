package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f1328a;

    /* renamed from: e, reason: collision with root package name */
    public View f1332e;

    /* renamed from: d, reason: collision with root package name */
    public int f1331d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final d f1329b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1330c = new ArrayList();

    public e(r0 r0Var) {
        this.f1328a = r0Var;
    }

    public final void a(View view, int i4, boolean z3) {
        RecyclerView recyclerView = this.f1328a.f1497a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : f(i4);
        this.f1329b.l(childCount, z3);
        if (z3) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        x1 x1VarP = RecyclerView.P(view);
        t0 t0Var = recyclerView.f1241m;
        if (t0Var == null || x1VarP == null) {
            return;
        }
        t0Var.onViewAttachedToWindow(x1VarP);
    }

    public final void b(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = this.f1328a.f1497a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : f(i4);
        this.f1329b.l(childCount, z3);
        if (z3) {
            i(view);
        }
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP != null) {
            if (!x1VarP.isTmpDetached() && !x1VarP.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(x1VarP);
                throw new IllegalArgumentException(a0.g.k(recyclerView, sb2));
            }
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "reAttach " + x1VarP);
            }
            x1VarP.clearTmpDetachFlag();
        } else if (RecyclerView.C0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(a0.g.k(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i4) {
        int iF = f(i4);
        this.f1329b.q(iF);
        RecyclerView recyclerView = this.f1328a.f1497a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            x1 x1VarP = RecyclerView.P(childAt);
            if (x1VarP != null) {
                if (x1VarP.isTmpDetached() && !x1VarP.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(x1VarP);
                    throw new IllegalArgumentException(a0.g.k(recyclerView, sb2));
                }
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "tmpDetach " + x1VarP);
                }
                x1VarP.addFlags(256);
            }
        } else if (RecyclerView.C0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iF);
            throw new IllegalArgumentException(a0.g.k(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i4) {
        return this.f1328a.f1497a.getChildAt(f(i4));
    }

    public final int e() {
        return this.f1328a.f1497a.getChildCount() - this.f1330c.size();
    }

    public final int f(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int childCount = this.f1328a.f1497a.getChildCount();
        int i10 = i4;
        while (i10 < childCount) {
            d dVar = this.f1329b;
            int iH = i4 - (i10 - dVar.h(i10));
            if (iH == 0) {
                while (dVar.k(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iH;
        }
        return -1;
    }

    public final View g(int i4) {
        return this.f1328a.f1497a.getChildAt(i4);
    }

    public final int h() {
        return this.f1328a.f1497a.getChildCount();
    }

    public final void i(View view) {
        this.f1330c.add(view);
        x1 x1VarP = RecyclerView.P(view);
        if (x1VarP != null) {
            x1VarP.onEnteredHiddenState(this.f1328a.f1497a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f1328a.f1497a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            d dVar = this.f1329b;
            if (!dVar.k(iIndexOfChild)) {
                return iIndexOfChild - dVar.h(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i4) {
        r0 r0Var = this.f1328a;
        int i10 = this.f1331d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iF = f(i4);
            View childAt = r0Var.f1497a.getChildAt(iF);
            if (childAt != null) {
                this.f1331d = 1;
                this.f1332e = childAt;
                if (this.f1329b.q(iF)) {
                    l(childAt);
                }
                r0Var.h(iF);
            }
            this.f1331d = 0;
            this.f1332e = null;
        } catch (Throwable th2) {
            this.f1331d = 0;
            this.f1332e = null;
            throw th2;
        }
    }

    public final void l(View view) {
        x1 x1VarP;
        if (!this.f1330c.remove(view) || (x1VarP = RecyclerView.P(view)) == null) {
            return;
        }
        x1VarP.onLeftHiddenState(this.f1328a.f1497a);
    }

    public final String toString() {
        return this.f1329b.toString() + ", hidden list:" + this.f1330c.size();
    }
}
