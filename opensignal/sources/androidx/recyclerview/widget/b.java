package androidx.recyclerview.widget;

import h7.m0;
import h7.o0;
import h7.q0;
import h7.s0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u3.i0;

/* loaded from: classes.dex */
public final class b extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2110a;

    public b(RecyclerView recyclerView) {
        this.f2110a = recyclerView;
    }

    @Override // h7.s0
    public final void a() {
        RecyclerView recyclerView = this.f2110a;
        recyclerView.k(null);
        recyclerView.D0.f10106f = true;
        recyclerView.a0(true);
        if (recyclerView.f2083x.j()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // h7.s0
    public final void b(int i10, int i11) {
        RecyclerView recyclerView = this.f2110a;
        recyclerView.k(null);
        h7.b bVar = recyclerView.f2083x;
        ArrayList arrayList = (ArrayList) bVar.f10001c;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.l(4, i10, i11));
        bVar.f9999a |= 4;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // h7.s0
    public final void c(int i10, int i11) {
        RecyclerView recyclerView = this.f2110a;
        recyclerView.k(null);
        h7.b bVar = recyclerView.f2083x;
        ArrayList arrayList = (ArrayList) bVar.f10001c;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.l(1, i10, i11));
        bVar.f9999a |= 1;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // h7.s0
    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f2110a;
        recyclerView.k(null);
        h7.b bVar = recyclerView.f2083x;
        ArrayList arrayList = (ArrayList) bVar.f10001c;
        if (i10 == i11) {
            return;
        }
        arrayList.add(bVar.l(8, i10, i11));
        bVar.f9999a |= 8;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // h7.s0
    public final void e(int i10, int i11) {
        RecyclerView recyclerView = this.f2110a;
        recyclerView.k(null);
        h7.b bVar = recyclerView.f2083x;
        ArrayList arrayList = (ArrayList) bVar.f10001c;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.l(2, i10, i11));
        bVar.f9999a |= 2;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // h7.s0
    public final void f() {
        q0 q0Var;
        int i10;
        RecyclerView recyclerView = this.f2110a;
        if (recyclerView.f2076r == null || (q0Var = recyclerView.I) == null || (i10 = o0.f10175a[q0Var.f10191c.ordinal()]) == 1) {
            return;
        }
        if (i10 == 2 && q0Var.b() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void g() {
        boolean z10 = RecyclerView.f2051b1;
        RecyclerView recyclerView = this.f2110a;
        if (!z10 || !recyclerView.P || !recyclerView.O) {
            recyclerView.W = true;
            recyclerView.requestLayout();
        } else {
            m0 m0Var = recyclerView.E;
            WeakHashMap weakHashMap = i0.f23177a;
            recyclerView.postOnAnimation(m0Var);
        }
    }
}
