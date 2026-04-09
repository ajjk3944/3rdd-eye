package androidx.recyclerview.widget;

import R.C0187n;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5281a;

    public /* synthetic */ E(RecyclerView recyclerView) {
        this.f5281a = recyclerView;
    }

    public void a(C0304a c0304a) {
        int i = c0304a.f5419a;
        RecyclerView recyclerView = this.f5281a;
        if (i == 1) {
            recyclerView.f5362m.onItemsAdded(recyclerView, c0304a.f5420b, c0304a.f5422d);
            return;
        }
        if (i == 2) {
            recyclerView.f5362m.onItemsRemoved(recyclerView, c0304a.f5420b, c0304a.f5422d);
        } else if (i == 4) {
            recyclerView.f5362m.onItemsUpdated(recyclerView, c0304a.f5420b, c0304a.f5422d, c0304a.f5421c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f5362m.onItemsMoved(recyclerView, c0304a.f5420b, c0304a.f5422d, 1);
        }
    }

    public g0 b(int i) {
        RecyclerView recyclerView = this.f5281a;
        int iH = recyclerView.f5347e.h();
        int i3 = 0;
        g0 g0Var = null;
        while (true) {
            if (i3 >= iH) {
                break;
            }
            g0 g0VarJ = RecyclerView.J(recyclerView.f5347e.g(i3));
            if (g0VarJ != null && !g0VarJ.isRemoved() && g0VarJ.mPosition == i) {
                if (!recyclerView.f5347e.f5438c.contains(g0VarJ.itemView)) {
                    g0Var = g0VarJ;
                    break;
                }
                g0Var = g0VarJ;
            }
            i3++;
        }
        if (g0Var != null) {
            if (!recyclerView.f5347e.f5438c.contains(g0Var.itemView)) {
                return g0Var;
            }
        }
        return null;
    }

    public void c(int i, int i3, Object obj) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f5281a;
        int iH = recyclerView.f5347e.h();
        int i8 = i3 + i;
        for (int i9 = 0; i9 < iH; i9++) {
            View viewG = recyclerView.f5347e.g(i9);
            g0 g0VarJ = RecyclerView.J(viewG);
            if (g0VarJ != null && !g0VarJ.shouldIgnore() && (i7 = g0VarJ.mPosition) >= i && i7 < i8) {
                g0VarJ.addFlags(2);
                g0VarJ.addChangePayload(obj);
                ((S) viewG.getLayoutParams()).f5379c = true;
            }
        }
        X x6 = recyclerView.f5342b;
        ArrayList arrayList = x6.f5412c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) arrayList.get(size);
            if (g0Var != null && (i6 = g0Var.mPosition) >= i && i6 < i8) {
                g0Var.addFlags(2);
                x6.f(size);
            }
        }
        recyclerView.f5375y0 = true;
    }

    public void d(int i, int i3) {
        RecyclerView recyclerView = this.f5281a;
        int iH = recyclerView.f5347e.h();
        for (int i6 = 0; i6 < iH; i6++) {
            g0 g0VarJ = RecyclerView.J(recyclerView.f5347e.g(i6));
            if (g0VarJ != null && !g0VarJ.shouldIgnore() && g0VarJ.mPosition >= i) {
                g0VarJ.offsetPosition(i3, false);
                recyclerView.f5372u0.f5447f = true;
            }
        }
        ArrayList arrayList = recyclerView.f5342b.f5412c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            g0 g0Var = (g0) arrayList.get(i7);
            if (g0Var != null && g0Var.mPosition >= i) {
                g0Var.offsetPosition(i3, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5374x0 = true;
    }

    public void e(int i, int i3) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f5281a;
        int iH = recyclerView.f5347e.h();
        int i13 = -1;
        if (i < i3) {
            i7 = i;
            i6 = i3;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i3;
            i8 = 1;
        }
        for (int i14 = 0; i14 < iH; i14++) {
            g0 g0VarJ = RecyclerView.J(recyclerView.f5347e.g(i14));
            if (g0VarJ != null && (i12 = g0VarJ.mPosition) >= i7 && i12 <= i6) {
                if (i12 == i) {
                    g0VarJ.offsetPosition(i3 - i, false);
                } else {
                    g0VarJ.offsetPosition(i8, false);
                }
                recyclerView.f5372u0.f5447f = true;
            }
        }
        ArrayList arrayList = recyclerView.f5342b.f5412c;
        if (i < i3) {
            i10 = i;
            i9 = i3;
        } else {
            i9 = i;
            i10 = i3;
            i13 = 1;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            g0 g0Var = (g0) arrayList.get(i15);
            if (g0Var != null && (i11 = g0Var.mPosition) >= i10 && i11 <= i9) {
                if (i11 == i) {
                    g0Var.offsetPosition(i3 - i, false);
                } else {
                    g0Var.offsetPosition(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5374x0 = true;
    }

    public void f(g0 g0Var, C0187n c0187n, C0187n c0187n2) {
        boolean zG;
        int i;
        int i3;
        g0Var.setIsRecyclable(false);
        RecyclerView recyclerView = this.f5281a;
        C0313j c0313j = (C0313j) recyclerView.f5344c0;
        c0313j.getClass();
        if (c0187n == null || ((i = c0187n.f3349a) == (i3 = c0187n2.f3349a) && c0187n.f3350b == c0187n2.f3350b)) {
            c0313j.l(g0Var);
            g0Var.itemView.setAlpha(0.0f);
            c0313j.i.add(g0Var);
            zG = true;
        } else {
            zG = c0313j.g(g0Var, i, c0187n.f3350b, i3, c0187n2.f3350b);
        }
        if (zG) {
            recyclerView.U();
        }
    }

    public void g(g0 g0Var, C0187n c0187n, C0187n c0187n2) {
        boolean zG;
        RecyclerView recyclerView = this.f5281a;
        recyclerView.f5342b.k(g0Var);
        recyclerView.f(g0Var);
        g0Var.setIsRecyclable(false);
        C0313j c0313j = (C0313j) recyclerView.f5344c0;
        c0313j.getClass();
        int i = c0187n.f3349a;
        int i3 = c0187n.f3350b;
        View view = g0Var.itemView;
        int left = c0187n2 == null ? view.getLeft() : c0187n2.f3349a;
        int top = c0187n2 == null ? view.getTop() : c0187n2.f3350b;
        if (g0Var.isRemoved() || (i == left && i3 == top)) {
            c0313j.l(g0Var);
            c0313j.f5497h.add(g0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0313j.g(g0Var, i, i3, left, top);
        }
        if (zG) {
            recyclerView.U();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f5281a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
