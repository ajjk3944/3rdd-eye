package jj;

import android.content.ContextWrapper;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nk.k;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends c {

    /* renamed from: e, reason: collision with root package name */
    public final i5.a f27695e;

    /* renamed from: f, reason: collision with root package name */
    public final ContextWrapper f27696f = (ContextWrapper) jm.a.f27720a.f1134b;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f27697h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f27698i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public List f27699k;

    /* renamed from: l, reason: collision with root package name */
    public int f27700l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f27701m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f27702n;

    /* renamed from: o, reason: collision with root package name */
    public final wi.e f27703o;

    /* renamed from: p, reason: collision with root package name */
    public final wi.e f27704p;

    /* renamed from: q, reason: collision with root package name */
    public final wi.e f27705q;

    /* renamed from: r, reason: collision with root package name */
    public final wi.e f27706r;

    /* renamed from: s, reason: collision with root package name */
    public int f27707s;

    public f(i5.a aVar) {
        this.f27695e = aVar;
        l0 l0Var = new l0(Boolean.FALSE);
        this.g = l0Var;
        this.f27697h = l0Var;
        l0 l0Var2 = new l0();
        this.f27698i = l0Var2;
        this.j = l0Var2;
        l0 l0Var3 = new l0(0);
        this.f27701m = l0Var3;
        this.f27702n = l0Var3;
        wi.e eVar = new wi.e();
        this.f27703o = eVar;
        this.f27704p = eVar;
        wi.e eVar2 = new wi.e();
        this.f27705q = eVar2;
        this.f27706r = eVar2;
        this.f27707s = 1;
    }

    public final void b(rj.d dVar) {
        String string;
        List list = this.f27699k;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f27700l = 0;
        for (rj.c cVar : this.f27699k) {
            dVar.reset();
            if (cVar instanceof rj.b) {
                rj.b bVar = (rj.b) cVar;
                ArrayList arrayList = bVar.f32990b;
                int size = arrayList.size();
                int i4 = -1;
                for (int i10 = 0; i10 < size; i10++) {
                    if (dVar.a((rj.a) arrayList.get(i10))) {
                        i4 = i10;
                    }
                }
                if (i4 == -1) {
                    bVar.c(false);
                } else {
                    bVar.c(true);
                    bVar.d(i4, false);
                    this.f27700l = (arrayList.size() - 1) + this.f27700l;
                }
            }
        }
        this.f27701m.h(Integer.valueOf(this.f27700l));
        int i11 = this.f27700l;
        ContextWrapper contextWrapper = this.f27696f;
        if (i11 > 0) {
            String string2 = contextWrapper.getString(R.string.fa_select_smart_toast_tip);
            k.d(string2, "getString(...)");
            string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(this.f27700l)}, 1));
        } else {
            string = contextWrapper.getString(R.string.fa_select_smart_no_item_taost_tip);
            k.b(string);
        }
        this.f27692c.h(string);
        this.f27703o.h(u.f37649a);
    }

    public final void c(rj.i iVar, int i4, boolean z3) {
        List list = this.f27699k;
        if (list == null || list.isEmpty() || i4 < 0) {
            return;
        }
        List list2 = this.f27699k;
        k.b(list2);
        if (i4 >= list2.size()) {
            return;
        }
        List list3 = this.f27699k;
        k.b(list3);
        rj.c cVar = (rj.c) list3.get(i4);
        if (cVar instanceof rj.b) {
            rj.b bVar = (rj.b) cVar;
            ArrayList arrayList = bVar.f32990b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                boolean z10 = ((rj.a) arrayList.get(i10)).f32988e;
                if (z3 && !z10) {
                    this.f27700l++;
                } else if (!z3 && z10) {
                    this.f27700l--;
                }
                bVar.d(i10, z3);
            }
            if (bVar.f32991c) {
                iVar.notifyItemRangeChanged(i4 + 1, arrayList.size());
            }
        } else if (cVar instanceof rj.a) {
            this.f27700l += z3 ? 1 : -1;
            rj.a aVar = (rj.a) cVar;
            aVar.f32985b.d(aVar.f32987d, z3);
            iVar.notifyItemChanged((i4 - 1) - aVar.f32987d);
        }
        this.f27701m.h(Integer.valueOf(this.f27700l));
    }
}
