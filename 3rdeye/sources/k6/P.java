package K6;

import H6.C0672i;
import H6.C0675l;
import K6.Q;
import N7.EnumC1356sc;
import N7.S2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import c9.C2097r;
import i6.C4458a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m6.C5330c;
import o6.C5425b;

/* compiled from: DivCollectionAdapter.kt */
/* loaded from: classes.dex */
public abstract class P<VH extends Q> extends L1<VH> {

    /* compiled from: DivCollectionAdapter.kt */
    public static final class a extends p.b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3300a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f3301b;

        public a(ArrayList oldItems, ArrayList arrayList) {
            kotlin.jvm.internal.l.f(oldItems, "oldItems");
            this.f3300a = oldItems;
            this.f3301b = arrayList;
        }

        public static boolean f(i7.b bVar, i7.b bVar2) {
            if (bVar == null || bVar2 == null) {
                return kotlin.jvm.internal.l.b(bVar, bVar2);
            }
            g(bVar, true);
            g(bVar2, true);
            boolean zA = bVar.f38460a.a(bVar2.f38460a, bVar.f38461b, bVar2.f38461b);
            g(bVar, false);
            g(bVar2, false);
            return zA;
        }

        public static void g(i7.b bVar, boolean z10) {
            A7.d dVar = bVar.f38461b;
            C5425b c5425b = dVar instanceof C5425b ? (C5425b) dVar : null;
            if (c5425b == null) {
                return;
            }
            c5425b.f44856k = z10;
        }

        @Override // androidx.recyclerview.widget.p.b
        public final boolean a(int i, int i10) {
            return f((i7.b) C2097r.r0(i, this.f3300a), (i7.b) C2097r.r0(i10, this.f3301b));
        }

        @Override // androidx.recyclerview.widget.p.b
        public final boolean b(int i, int i10) {
            N7.Z z10;
            S2 s2D;
            A7.b<String> bVarQ;
            N7.Z z11;
            S2 s2D2;
            A7.b<String> bVarQ2;
            i7.b bVar = (i7.b) C2097r.r0(i, this.f3300a);
            i7.b bVar2 = (i7.b) C2097r.r0(i10, this.f3301b);
            String strA = null;
            String strA2 = (bVar == null || (z11 = bVar.f38460a) == null || (s2D2 = z11.d()) == null || (bVarQ2 = s2D2.q()) == null) ? null : bVarQ2.a(bVar.f38461b);
            if (bVar2 != null && (z10 = bVar2.f38460a) != null && (s2D = z10.d()) != null && (bVarQ = s2D.q()) != null) {
                strA = bVarQ.a(bVar2.f38461b);
            }
            return (strA2 == null && strA == null) ? f(bVar, bVar2) : kotlin.jvm.internal.l.b(strA2, strA);
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int d() {
            return this.f3301b.size();
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int e() {
            return this.f3300a.size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(B7.b divPatchCache, C0672i c0672i) {
        kotlin.jvm.internal.l.f(divPatchCache, "divPatchCache");
        C0675l c0675l = c0672i.f2146a;
        C4458a tag = c0675l.getDataTag();
        kotlin.jvm.internal.l.f(tag, "tag");
        if (((C5330c) divPatchCache.f578b.get(tag)) == null) {
            return;
        }
        new LinkedHashSet();
        new LinkedHashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3269j;
            if (i >= arrayList.size()) {
                throw null;
            }
            String id = ((i7.b) arrayList.get(i)).f38460a.d().getId();
            if (id != null) {
                divPatchCache.a(c0675l.getDataTag(), id);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        i7.b bVar = (i7.b) C2097r.r0(i, this.f3271l);
        if (bVar == null) {
            return 0;
        }
        A7.b<String> bVarQ = bVar.f38460a.d().q();
        String strA = bVarQ != null ? bVarQ.a(bVar.f38461b) : null;
        if (strA != null) {
            return strA.hashCode();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(RecyclerView.F f10) {
        C0672i c0672iK;
        Q holder = (Q) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        super.onViewAttachedToWindow(holder);
        View child = holder.f3306l.getChild();
        if (child == null || (c0672iK = C0713c.K(child)) == null) {
            return;
        }
        C0713c.w(child, c0672iK, holder.f3308n);
    }

    /* compiled from: DivCollectionAdapter.kt */
    public final class b implements androidx.recyclerview.widget.w {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3302a;

        public b(ArrayList arrayList) {
            this.f3302a = arrayList;
        }

        @Override // androidx.recyclerview.widget.w
        public final void a(int i, int i10) {
            c(i, 1);
            b(i10, 1);
        }

        @Override // androidx.recyclerview.widget.w
        public final void b(int i, int i10) {
            int i11 = i + i10;
            ArrayList arrayList = this.f3302a;
            int size = i11 > arrayList.size() ? arrayList.size() - i10 : i;
            for (int i12 = 0; i12 < i10; i12++) {
                P<VH> p10 = P.this;
                ArrayList arrayList2 = p10.f3269j;
                int i13 = i + i12;
                arrayList2.add(i13, arrayList.get(size + i12));
                i7.b bVar = (i7.b) arrayList2.get(i13);
                p10.f(i13, bVar.f38460a.d().getVisibility().a(bVar.f38461b));
            }
        }

        @Override // androidx.recyclerview.widget.w
        public final void c(int i, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                EnumC1356sc enumC1356sc = EnumC1356sc.GONE;
                P<VH> p10 = P.this;
                p10.f(i, enumC1356sc);
                p10.f3269j.remove(i);
            }
        }

        @Override // androidx.recyclerview.widget.w
        public final void d(int i, int i10, Object obj) {
        }
    }
}
