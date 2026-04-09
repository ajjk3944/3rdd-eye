package androidx.recyclerview.widget;

import com.google.android.gms.internal.ads.be1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o1 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1474b;

    public o1(RecyclerView recyclerView) {
        this.f1474b = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f1474b;
        if (!recyclerView.f1257u || !recyclerView.f1255t) {
            recyclerView.B = true;
            recyclerView.requestLayout();
        } else {
            p0 p0Var = recyclerView.f1234i;
            WeakHashMap weakHashMap = e4.v0.f22405a;
            recyclerView.postOnAnimation(p0Var);
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onChanged() {
        RecyclerView recyclerView = this.f1474b;
        recyclerView.l(null);
        recyclerView.f1233h0.f1508f = true;
        recyclerView.c0(true);
        if (recyclerView.f1227e.w()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeChanged(int i4, int i10, Object obj) {
        RecyclerView recyclerView = this.f1474b;
        recyclerView.l(null);
        be1 be1Var = recyclerView.f1227e;
        ArrayList arrayList = (ArrayList) be1Var.f9659c;
        if (i10 < 1) {
            return;
        }
        arrayList.add(be1Var.y(obj, 4, i4, i10));
        be1Var.f9657a |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeInserted(int i4, int i10) {
        RecyclerView recyclerView = this.f1474b;
        recyclerView.l(null);
        be1 be1Var = recyclerView.f1227e;
        ArrayList arrayList = (ArrayList) be1Var.f9659c;
        if (i10 < 1) {
            return;
        }
        arrayList.add(be1Var.y(null, 1, i4, i10));
        be1Var.f9657a |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeMoved(int i4, int i10, int i11) {
        RecyclerView recyclerView = this.f1474b;
        recyclerView.l(null);
        be1 be1Var = recyclerView.f1227e;
        ArrayList arrayList = (ArrayList) be1Var.f9659c;
        if (i4 == i10) {
            return;
        }
        arrayList.add(be1Var.y(null, 8, i4, i10));
        be1Var.f9657a |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeRemoved(int i4, int i10) {
        RecyclerView recyclerView = this.f1474b;
        recyclerView.l(null);
        be1 be1Var = recyclerView.f1227e;
        ArrayList arrayList = (ArrayList) be1Var.f9659c;
        if (i10 < 1) {
            return;
        }
        arrayList.add(be1Var.y(null, 2, i4, i10));
        be1Var.f9657a |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onStateRestorationPolicyChanged() {
        t0 t0Var;
        RecyclerView recyclerView = this.f1474b;
        if (recyclerView.f1225d == null || (t0Var = recyclerView.f1241m) == null || !t0Var.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
