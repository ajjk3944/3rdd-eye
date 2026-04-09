package jg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final Context f27650i;
    public final RecyclerView j;

    /* renamed from: k, reason: collision with root package name */
    public final o7.c f27651k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f27652l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public LayoutInflater f27653m;

    public c(Context context, RecyclerView recyclerView, o7.c cVar) {
        this.f27650i = context;
        this.j = recyclerView;
        this.f27651k = cVar;
    }

    public final void b(d dVar, int i4) {
        nk.k.e(dVar, "item");
        Iterator it = dVar.f27654b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).f27660a = dVar.f27660a;
        }
        boolean z3 = dVar.f27656d;
        RecyclerView recyclerView = this.j;
        if (z3) {
            recyclerView.post(new com.applovin.mediation.nativeAds.adPlacer.a(this, i4, dVar, 4));
        } else {
            recyclerView.post(new a(this, i4, 1));
        }
    }

    public final void c(d dVar, int i4) {
        nk.k.e(dVar, "item");
        List list = dVar.f27654b;
        int i10 = i4 + 1;
        boolean z3 = dVar.f27656d;
        ArrayList arrayList = this.f27652l;
        if (z3) {
            if (i10 >= arrayList.size() || ((f) arrayList.get(i10)).e() != dVar.e()) {
                arrayList.addAll(i10, list);
                notifyItemRangeInserted(i10, list.size());
            }
        } else if (i10 < arrayList.size() && ((f) arrayList.get(i10)).e() == dVar.e()) {
            arrayList.removeAll(list);
            notifyItemRangeRemoved(i10, list.size());
        }
        notifyItemChanged(i4, 1);
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return this.f27652l.size();
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemViewType(int i4) {
        return !(this.f27652l.get(i4) instanceof d) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        b bVar = (b) x1Var;
        nk.k.e(bVar, "holder");
        bVar.a(i4, null);
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        nk.k.e(viewGroup, "parent");
        if (this.f27653m == null) {
            this.f27653m = LayoutInflater.from(viewGroup.getContext());
        }
        int i10 = i4 == 0 ? R.layout.clean_result_group_item : R.layout.clean_result_child_item;
        LayoutInflater layoutInflater = this.f27653m;
        nk.k.b(layoutInflater);
        View viewInflate = layoutInflater.inflate(i10, viewGroup, false);
        nk.k.d(viewInflate, "inflate(...)");
        return new b(this, i4, viewInflate);
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4, List list) {
        b bVar = (b) x1Var;
        nk.k.e(bVar, "holder");
        nk.k.e(list, "payloads");
        bVar.a(i4, list);
    }
}
