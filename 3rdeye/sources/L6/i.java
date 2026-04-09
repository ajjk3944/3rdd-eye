package L6;

import C6.o;
import E.u;
import H6.C0672i;
import H6.C0675l;
import H6.L;
import N7.C1322q5;
import N7.Z;
import O6.v;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c9.C2092m;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DivGalleryScrollListener.kt */
/* loaded from: classes.dex */
public final class i extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    public final C0672i f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4094b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.p f4095c;

    /* renamed from: d, reason: collision with root package name */
    public final C0675l f4096d;

    /* renamed from: e, reason: collision with root package name */
    public int f4097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4098f;

    /* JADX WARN: Multi-variable type inference failed */
    public i(C0672i c0672i, v recycler, e eVar, C1322q5 galleryDiv) {
        kotlin.jvm.internal.l.f(recycler, "recycler");
        kotlin.jvm.internal.l.f(galleryDiv, "galleryDiv");
        this.f4093a = c0672i;
        this.f4094b = recycler;
        this.f4095c = (RecyclerView.p) eVar;
        C0675l c0675l = c0672i.f2146a;
        this.f4096d = c0675l;
        c0675l.getConfig().getClass();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [L6.e, androidx.recyclerview.widget.RecyclerView$p] */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.f4098f = false;
        }
        if (i == 0) {
            this.f4096d.getDiv2Component$div_release().q();
            A7.d dVar = this.f4093a.f2147b;
            ?? r12 = this.f4095c;
            r12.j();
            r12.e();
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [L6.e, androidx.recyclerview.widget.RecyclerView$p] */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void b(RecyclerView recyclerView, int i, int i10) {
        List listG;
        int iL = this.f4095c.l() / 20;
        int iAbs = Math.abs(i10) + Math.abs(i) + this.f4097e;
        this.f4097e = iAbs;
        if (iAbs <= iL) {
            return;
        }
        this.f4097e = 0;
        boolean z10 = this.f4098f;
        C0675l c0675l = this.f4096d;
        if (!z10) {
            this.f4098f = true;
            c0675l.getDiv2Component$div_release().q();
        }
        L lB = c0675l.getDiv2Component$div_release().B();
        v vVar = this.f4094b;
        o oVar = new o(vVar, 1);
        if (oVar.hasNext()) {
            Object next = oVar.next();
            if (oVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (oVar.hasNext()) {
                    arrayList.add(oVar.next());
                }
                listG = arrayList;
            } else {
                listG = u.G(next);
            }
        } else {
            listG = C2099t.f18581b;
        }
        Iterator<Map.Entry<View, Z>> it = lB.f2070g.entrySet().iterator();
        while (it.hasNext()) {
            if (!listG.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (!lB.f2074l) {
            lB.f2074l = true;
            lB.f2066c.post(lB.f2075m);
        }
        int i11 = 0;
        while (true) {
            boolean z11 = i11 < vVar.getChildCount();
            C0672i c0672i = this.f4093a;
            if (!z11) {
                LinkedHashMap linkedHashMapB = lB.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    Object key = entry.getKey();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= vVar.getChildCount()) {
                            i12 = -1;
                            break;
                        }
                        int i14 = i13 + 1;
                        View childAt = vVar.getChildAt(i13);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        if (i12 < 0) {
                            C2092m.a0();
                            throw null;
                        }
                        if (kotlin.jvm.internal.l.b(key, childAt)) {
                            break;
                        }
                        i12++;
                        i13 = i14;
                    }
                    if (!(i12 >= 0)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    lB.f(c0672i, (View) entry2.getKey(), (Z) entry2.getValue());
                }
                return;
            }
            int i15 = i11 + 1;
            View childAt2 = vVar.getChildAt(i11);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition = vVar.getChildAdapterPosition(childAt2);
            if (childAdapterPosition != -1) {
                RecyclerView.h adapter = vVar.getAdapter();
                kotlin.jvm.internal.l.d(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
                lB.e(c0672i, childAt2, ((i7.b) ((a) adapter).f3271l.get(childAdapterPosition)).f38460a);
            }
            i11 = i15;
        }
    }
}
