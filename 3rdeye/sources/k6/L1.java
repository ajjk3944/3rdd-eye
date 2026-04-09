package K6;

import N7.B8;
import N7.EnumC1356sc;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.F;
import b9.C1992A;
import c9.AbstractC2082c;
import c9.C2097r;
import c9.C2102w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: VisibilityAwareAdapter.kt */
/* loaded from: classes.dex */
public abstract class L1<VH extends RecyclerView.F> extends RecyclerView.h<VH> implements i7.k {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3269j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3270k;

    /* renamed from: l, reason: collision with root package name */
    public final b f3271l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f3272m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3273n;

    /* compiled from: VisibilityAwareAdapter.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<EnumC1356sc, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ L1<VH> f3274g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C2102w<i7.b> f3275h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1<VH> l12, C2102w<i7.b> c2102w) {
            super(1);
            this.f3274g = l12;
            this.f3275h = c2102w;
        }

        @Override // p9.l
        public final C1992A invoke(EnumC1356sc enumC1356sc) {
            EnumC1356sc it = enumC1356sc;
            kotlin.jvm.internal.l.f(it, "it");
            this.f3274g.f(this.f3275h.f18584a, it);
            return C1992A.f18074a;
        }
    }

    /* compiled from: VisibilityAwareAdapter.kt */
    public static final class b extends AbstractC2082c<i7.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ P f3276b;

        public b(P p10) {
            this.f3276b = p10;
        }

        @Override // c9.AbstractC2080a
        public final int c() {
            return this.f3276b.f3270k.size();
        }

        @Override // c9.AbstractC2080a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof i7.b) {
                return super.contains((i7.b) obj);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public final Object get(int i) {
            return (i7.b) ((C2102w) this.f3276b.f3270k.get(i)).f18585b;
        }

        @Override // c9.AbstractC2082c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof i7.b) {
                return super.indexOf((i7.b) obj);
            }
            return -1;
        }

        @Override // c9.AbstractC2082c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof i7.b) {
                return super.lastIndexOf((i7.b) obj);
            }
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L1(List<i7.b> list) throws Exception {
        ArrayList arrayListI0 = C2097r.I0(list);
        this.f3269j = arrayListI0;
        this.f3270k = new ArrayList();
        this.f3271l = new b((P) this);
        this.f3272m = new LinkedHashMap();
        this.f3273n = new ArrayList();
        O9.g gVar = new O9.g(arrayListI0.iterator());
        while (((Iterator) gVar.f10517d).hasNext()) {
            C2102w c2102w = (C2102w) gVar.next();
            T t10 = c2102w.f18585b;
            i7.b bVar = (i7.b) t10;
            boolean z10 = bVar.f38460a.d().getVisibility().a(bVar.f38461b) != EnumC1356sc.GONE;
            this.f3272m.put(t10, Boolean.valueOf(z10));
            if (z10) {
                this.f3270k.add(c2102w);
            }
        }
        e();
    }

    @Override // i7.k
    public final /* synthetic */ void b(j6.d dVar) {
        B8.c(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() throws Exception {
        B8.d(this);
        ArrayList arrayList = this.f3269j;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        O9.g gVar = new O9.g(arrayList.iterator());
        while (((Iterator) gVar.f10517d).hasNext()) {
            C2102w c2102w = (C2102w) gVar.next();
            B8.c(this, ((i7.b) c2102w.f18585b).f38460a.d().getVisibility().d(((i7.b) c2102w.f18585b).f38461b, new a(this, c2102w)));
        }
    }

    public final void f(int i, EnumC1356sc newVisibility) {
        kotlin.jvm.internal.l.f(newVisibility, "newVisibility");
        i7.b bVar = (i7.b) this.f3269j.get(i);
        LinkedHashMap linkedHashMap = this.f3272m;
        Boolean bool = (Boolean) linkedHashMap.get(bVar);
        int i10 = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z10 = newVisibility != EnumC1356sc.GONE;
        ArrayList arrayList = this.f3270k;
        int i11 = -1;
        if (!zBooleanValue && z10) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (((C2102w) it.next()).f18584a > i) {
                    break;
                } else {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (i10 == -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : arrayList.size();
            arrayList.add(iIntValue, new C2102w(i, bVar));
            c(iIntValue);
        } else if (zBooleanValue && !z10) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.l.b(((C2102w) it2.next()).f18585b, bVar)) {
                    i11 = i10;
                    break;
                }
                i10++;
            }
            arrayList.remove(i11);
            d(i11);
        }
        linkedHashMap.put(bVar, Boolean.valueOf(z10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f3271l.c();
    }

    @Override // i7.k
    public final List<j6.d> getSubscriptions() {
        return this.f3273n;
    }

    @Override // i7.k
    public final /* synthetic */ void h() throws Exception {
        B8.d(this);
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
    }
}
