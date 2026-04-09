package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r0 implements e4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1497a;

    public /* synthetic */ r0(RecyclerView recyclerView) {
        this.f1497a = recyclerView;
    }

    public void a(a aVar) {
        int i4 = aVar.f1289a;
        RecyclerView recyclerView = this.f1497a;
        if (i4 == 1) {
            recyclerView.f1243n.onItemsAdded(recyclerView, aVar.f1290b, aVar.f1292d);
            return;
        }
        if (i4 == 2) {
            recyclerView.f1243n.onItemsRemoved(recyclerView, aVar.f1290b, aVar.f1292d);
        } else if (i4 == 4) {
            recyclerView.f1243n.onItemsUpdated(recyclerView, aVar.f1290b, aVar.f1292d, aVar.f1291c);
        } else {
            if (i4 != 8) {
                return;
            }
            recyclerView.f1243n.onItemsMoved(recyclerView, aVar.f1290b, aVar.f1292d, 1);
        }
    }

    public x1 b(int i4) {
        RecyclerView recyclerView = this.f1497a;
        int iH = recyclerView.f1229f.h();
        int i10 = 0;
        x1 x1Var = null;
        while (true) {
            if (i10 >= iH) {
                break;
            }
            x1 x1VarP = RecyclerView.P(recyclerView.f1229f.g(i10));
            if (x1VarP != null && !x1VarP.isRemoved() && x1VarP.mPosition == i4) {
                if (!recyclerView.f1229f.f1330c.contains(x1VarP.itemView)) {
                    x1Var = x1VarP;
                    break;
                }
                x1Var = x1VarP;
            }
            i10++;
        }
        if (x1Var != null) {
            if (!recyclerView.f1229f.f1330c.contains(x1Var.itemView)) {
                return x1Var;
            }
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i4, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f1497a;
        int iH = recyclerView.f1229f.h();
        int i13 = i10 + i4;
        for (int i14 = 0; i14 < iH; i14++) {
            View viewG = recyclerView.f1229f.g(i14);
            x1 x1VarP = RecyclerView.P(viewG);
            if (x1VarP != null && !x1VarP.shouldIgnore() && (i12 = x1VarP.mPosition) >= i4 && i12 < i13) {
                x1VarP.addFlags(2);
                x1VarP.addChangePayload(obj);
                ((g1) viewG.getLayoutParams()).f1376c = true;
            }
        }
        m1 m1Var = recyclerView.f1223c;
        ArrayList arrayList = m1Var.f1457c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1 x1Var = (x1) arrayList.get(size);
            if (x1Var != null && (i11 = x1Var.mPosition) >= i4 && i11 < i13) {
                x1Var.addFlags(2);
                m1Var.h(size);
            }
        }
        recyclerView.f1240l0 = true;
    }

    public void d(int i4, int i10) {
        RecyclerView recyclerView = this.f1497a;
        int iH = recyclerView.f1229f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            x1 x1VarP = RecyclerView.P(recyclerView.f1229f.g(i11));
            if (x1VarP != null && !x1VarP.shouldIgnore() && x1VarP.mPosition >= i4) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + x1VarP + " now at position " + (x1VarP.mPosition + i10));
                }
                x1VarP.offsetPosition(i10, false);
                recyclerView.f1233h0.f1508f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1223c.f1457c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            x1 x1Var = (x1) arrayList.get(i12);
            if (x1Var != null && x1Var.mPosition >= i4) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + x1Var + " now at position " + (x1Var.mPosition + i10));
                }
                x1Var.offsetPosition(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1238k0 = true;
    }

    public void e(int i4, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f1497a;
        int iH = recyclerView.f1229f.h();
        if (i4 < i10) {
            i12 = i4;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i4;
            i12 = i10;
            i13 = 1;
        }
        boolean z3 = false;
        for (int i19 = 0; i19 < iH; i19++) {
            x1 x1VarP = RecyclerView.P(recyclerView.f1229f.g(i19));
            if (x1VarP != null && (i18 = x1VarP.mPosition) >= i12 && i18 <= i11) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + x1VarP);
                }
                if (x1VarP.mPosition == i4) {
                    x1VarP.offsetPosition(i10 - i4, false);
                } else {
                    x1VarP.offsetPosition(i13, false);
                }
                recyclerView.f1233h0.f1508f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1223c.f1457c;
        if (i4 < i10) {
            i15 = i4;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i4;
            i15 = i10;
            i16 = 1;
        }
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            x1 x1Var = (x1) arrayList.get(i20);
            if (x1Var != null && (i17 = x1Var.mPosition) >= i15 && i17 <= i14) {
                if (i17 == i4) {
                    x1Var.offsetPosition(i10 - i4, z3);
                } else {
                    x1Var.offsetPosition(i16, z3);
                }
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + x1Var);
                }
            }
            i20++;
            z3 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1238k0 = true;
    }

    public void f(x1 x1Var, z0 z0Var, z0 z0Var2) {
        boolean zG;
        int i4;
        int i10;
        x1Var.setIsRecyclable(false);
        RecyclerView recyclerView = this.f1497a;
        l lVar = (l) recyclerView.M;
        lVar.getClass();
        if (z0Var == null || ((i4 = z0Var.f1563a) == (i10 = z0Var2.f1563a) && z0Var.f1564b == z0Var2.f1564b)) {
            lVar.l(x1Var);
            x1Var.itemView.setAlpha(0.0f);
            lVar.f1437i.add(x1Var);
            zG = true;
        } else {
            zG = lVar.g(x1Var, i4, z0Var.f1564b, i10, z0Var2.f1564b);
        }
        if (zG) {
            recyclerView.a0();
        }
    }

    public void g(x1 x1Var, z0 z0Var, z0 z0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f1497a;
        recyclerView.f1223c.m(x1Var);
        recyclerView.h(x1Var);
        x1Var.setIsRecyclable(false);
        l lVar = (l) recyclerView.M;
        lVar.getClass();
        int i4 = z0Var.f1563a;
        int i10 = z0Var.f1564b;
        View view = x1Var.itemView;
        int left = z0Var2 == null ? view.getLeft() : z0Var2.f1563a;
        int top = z0Var2 == null ? view.getTop() : z0Var2.f1564b;
        if (x1Var.isRemoved() || (i4 == left && i10 == top)) {
            lVar.l(x1Var);
            lVar.f1436h.add(x1Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = lVar.g(x1Var, i4, i10, left, top);
        }
        if (zG) {
            recyclerView.a0();
        }
    }

    public void h(int i4) {
        RecyclerView recyclerView = this.f1497a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            x1 x1VarP = RecyclerView.P(childAt);
            t0 t0Var = recyclerView.f1241m;
            if (t0Var != null && x1VarP != null) {
                t0Var.onViewDetachedFromWindow(x1VarP);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }

    @Override // e4.j
    public boolean t(float f10) {
        int i4;
        int i10;
        RecyclerView recyclerView = this.f1497a;
        if (recyclerView.f1243n.canScrollVertically()) {
            i10 = (int) f10;
            i4 = 0;
        } else if (recyclerView.f1243n.canScrollHorizontally()) {
            i4 = (int) f10;
            i10 = 0;
        } else {
            i4 = 0;
            i10 = 0;
        }
        if (i4 == 0 && i10 == 0) {
            return false;
        }
        recyclerView.s0();
        return recyclerView.K(i4, i10, 0, Integer.MAX_VALUE);
    }

    @Override // e4.j
    public float x() {
        float f10;
        RecyclerView recyclerView = this.f1497a;
        if (recyclerView.f1243n.canScrollVertically()) {
            f10 = recyclerView.f1224c0;
        } else {
            if (!recyclerView.f1243n.canScrollHorizontally()) {
                return 0.0f;
            }
            f10 = recyclerView.f1222b0;
        }
        return -f10;
    }

    @Override // e4.j
    public void z() {
        this.f1497a.s0();
    }
}
