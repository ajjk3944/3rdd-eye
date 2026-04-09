package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306c {

    /* renamed from: a, reason: collision with root package name */
    public final E f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final U1.b f5437b = new U1.b(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5438c = new ArrayList();

    public C0306c(E e6) {
        this.f5436a = e6;
    }

    public final void a(View view, int i, boolean z6) {
        RecyclerView recyclerView = this.f5436a.f5281a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f5437b.l(childCount, z6);
        if (z6) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        g0 g0VarJ = RecyclerView.J(view);
        G g2 = recyclerView.f5360l;
        if (g2 != null && g0VarJ != null) {
            g2.onViewAttachedToWindow(g0VarJ);
        }
        ArrayList arrayList = recyclerView.f5332P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((S0.g) recyclerView.f5332P.get(size)).getClass();
                S s5 = (S) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) s5).width != -1 || ((ViewGroup.MarginLayoutParams) s5).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = this.f5436a.f5281a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f5437b.l(childCount, z6);
        if (z6) {
            i(view);
        }
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ != null) {
            if (!g0VarJ.isTmpDetached() && !g0VarJ.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(g0VarJ);
                throw new IllegalArgumentException(A.f.j(recyclerView, sb));
            }
            g0VarJ.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        g0 g0VarJ;
        int iF = f(i);
        this.f5437b.q(iF);
        RecyclerView recyclerView = this.f5436a.f5281a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (g0VarJ = RecyclerView.J(childAt)) != null) {
            if (g0VarJ.isTmpDetached() && !g0VarJ.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(g0VarJ);
                throw new IllegalArgumentException(A.f.j(recyclerView, sb));
            }
            g0VarJ.addFlags(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.f5436a.f5281a.getChildAt(f(i));
    }

    public final int e() {
        return this.f5436a.f5281a.getChildCount() - this.f5438c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f5436a.f5281a.getChildCount();
        int i3 = i;
        while (i3 < childCount) {
            U1.b bVar = this.f5437b;
            int iG = i - (i3 - bVar.g(i3));
            if (iG == 0) {
                while (bVar.k(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iG;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f5436a.f5281a.getChildAt(i);
    }

    public final int h() {
        return this.f5436a.f5281a.getChildCount();
    }

    public final void i(View view) {
        this.f5438c.add(view);
        g0 g0VarJ = RecyclerView.J(view);
        if (g0VarJ != null) {
            g0VarJ.onEnteredHiddenState(this.f5436a.f5281a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f5436a.f5281a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            U1.b bVar = this.f5437b;
            if (!bVar.k(iIndexOfChild)) {
                return iIndexOfChild - bVar.g(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        int iF = f(i);
        E e6 = this.f5436a;
        View childAt = e6.f5281a.getChildAt(iF);
        if (childAt == null) {
            return;
        }
        if (this.f5437b.q(iF)) {
            l(childAt);
        }
        e6.h(iF);
    }

    public final void l(View view) {
        g0 g0VarJ;
        if (!this.f5438c.remove(view) || (g0VarJ = RecyclerView.J(view)) == null) {
            return;
        }
        g0VarJ.onLeftHiddenState(this.f5436a.f5281a);
    }

    public final String toString() {
        return this.f5437b.toString() + ", hidden list:" + this.f5438c.size();
    }
}
