package jj;

import android.content.ContextWrapper;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import nk.k;
import yj.u;
import zj.n;
import zj.o;
import zj.s;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i extends c {

    /* renamed from: e, reason: collision with root package name */
    public final i5.a f27712e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f27713f = new LinkedHashSet();
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f27714h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f27715i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f27716k;

    /* renamed from: l, reason: collision with root package name */
    public final wi.e f27717l;

    /* renamed from: m, reason: collision with root package name */
    public final wi.e f27718m;

    /* renamed from: n, reason: collision with root package name */
    public final p6.i f27719n;

    public i(i5.a aVar) {
        this.f27712e = aVar;
        l0 l0Var = new l0(s.f38317a);
        this.f27714h = l0Var;
        this.f27715i = l0Var;
        l0 l0Var2 = new l0(Boolean.FALSE);
        this.j = l0Var2;
        this.f27716k = l0Var2;
        wi.e eVar = new wi.e();
        this.f27717l = eVar;
        this.f27718m = eVar;
        this.f27719n = new p6.i(this);
    }

    public final void b(ArrayList arrayList) {
        this.f27713f.clear();
        this.g = arrayList;
        this.f27714h.h(arrayList);
        this.f27717l.h(u.f37649a);
        this.j.h(Boolean.valueOf(!r0.isEmpty()));
    }

    public final void c(List list, List list2) {
        k.e(list, "sucFiles");
        k.e(list2, "faiFiles");
        if (list.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(w.H(o.T(list, 12)));
        n.p0(list, hashSet);
        final int i4 = 0;
        final g gVar = new g(hashSet, 0);
        Predicate predicate = new Predicate() { // from class: jj.h
            public /* synthetic */ Predicate and(Predicate predicate2) {
                int i10 = i4;
                return Predicate$CC.$default$and(this, predicate2);
            }

            public /* synthetic */ Predicate negate() {
                switch (i4) {
                }
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                int i10 = i4;
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i4) {
                }
                return ((Boolean) ((g) gVar).invoke(obj)).booleanValue();
            }
        };
        Collection.EL.removeIf(this.f27713f, predicate);
        ArrayList arrayList = this.g;
        final int i10 = 1;
        if (arrayList != null) {
            final g gVar2 = new g(hashSet, 1);
            Collection.EL.removeIf(arrayList, new Predicate() { // from class: jj.h
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    int i102 = i10;
                    return Predicate$CC.$default$and(this, predicate2);
                }

                public /* synthetic */ Predicate negate() {
                    switch (i10) {
                    }
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate2) {
                    int i102 = i10;
                    return Predicate$CC.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i10) {
                    }
                    return ((Boolean) ((g) gVar2).invoke(obj)).booleanValue();
                }
            });
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        this.f27714h.h(arrayList2);
        this.j.h(Boolean.valueOf(!r1.isEmpty()));
        this.f27717l.h(u.f37649a);
        String string = ((ContextWrapper) jm.a.f27720a.f1134b).getString(R.string.fa_delete_complete_msg, Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
        k.d(string, "getString(...)");
        this.f27692c.h(string);
    }

    public final void d(aj.b bVar, boolean z3) {
        k.e(bVar, "node");
        LinkedHashSet linkedHashSet = this.f27713f;
        if (z3) {
            linkedHashSet.add(bVar);
        } else {
            linkedHashSet.remove(bVar);
        }
        this.j.h(Boolean.valueOf(!linkedHashSet.isEmpty()));
    }
}
