package z7;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements f, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f38112a;

    /* renamed from: b, reason: collision with root package name */
    public final g f38113b;

    /* renamed from: c, reason: collision with root package name */
    public int f38114c;

    /* renamed from: d, reason: collision with root package name */
    public int f38115d = -1;

    /* renamed from: e, reason: collision with root package name */
    public x7.e f38116e;

    /* renamed from: f, reason: collision with root package name */
    public List f38117f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public volatile d8.u f38118h;

    /* renamed from: i, reason: collision with root package name */
    public File f38119i;
    public a0 j;

    public z(g gVar, h hVar) {
        this.f38113b = gVar;
        this.f38112a = hVar;
    }

    @Override // z7.f
    public final boolean a() {
        List list;
        boolean z3;
        List list2;
        boolean z10;
        ArrayList arrayListA = this.f38113b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        g gVar = this.f38113b;
        com.bumptech.glide.k kVarB = gVar.f38002c.b();
        Class<?> cls = gVar.f38003d.getClass();
        Class cls2 = gVar.g;
        Class cls3 = gVar.f38008k;
        km.n nVar = kVarB.f6509h;
        t8.k kVar = (t8.k) ((AtomicReference) nVar.f28442b).getAndSet(null);
        if (kVar == null) {
            kVar = new t8.k(cls, cls2, cls3);
        } else {
            kVar.f34516a = cls;
            kVar.f34517b = cls2;
            kVar.f34518c = cls3;
        }
        synchronized (((x.e) nVar.f28443c)) {
            list = (List) ((x.e) nVar.f28443c).get(kVar);
        }
        ((AtomicReference) nVar.f28442b).set(kVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListA2 = kVarB.f6503a.a(cls);
            int size = arrayListA2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListA2.get(i4);
                i4++;
                ArrayList arrayListF = kVarB.f6505c.f((Class) obj, cls2);
                int size2 = arrayListF.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayListF.get(i10);
                    i10++;
                    Class cls4 = (Class) obj2;
                    if (!kVarB.f6508f.c(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z3 = false;
            kVarB.f6509h.w(cls, cls2, cls3, DesugarCollections.unmodifiableList(arrayList));
            list2 = arrayList;
        } else {
            z3 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f38113b.f38008k)) {
                return z3;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f38113b.f38003d.getClass() + " to " + this.f38113b.f38008k);
        }
        while (true) {
            List list3 = this.f38117f;
            if (list3 != null && this.g < list3.size()) {
                this.f38118h = null;
                boolean z11 = z3;
                while (!z11 && this.g < this.f38117f.size()) {
                    List list4 = this.f38117f;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    d8.v vVar = (d8.v) list4.get(i11);
                    File file = this.f38119i;
                    g gVar2 = this.f38113b;
                    this.f38118h = vVar.a(file, gVar2.f38004e, gVar2.f38005f, gVar2.f38007i);
                    if (this.f38118h != null && this.f38113b.c(this.f38118h.f22049c.a()) != null) {
                        this.f38118h.f22049c.e(this.f38113b.f38012o, this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f38115d + 1;
            this.f38115d = i12;
            if (i12 >= list2.size()) {
                int i13 = this.f38114c + 1;
                this.f38114c = i13;
                if (i13 >= arrayListA.size()) {
                    return z3;
                }
                this.f38115d = z3 ? 1 : 0;
            }
            x7.e eVar = (x7.e) arrayListA.get(this.f38114c);
            Class cls5 = (Class) list2.get(this.f38115d);
            x7.l lVarE = this.f38113b.e(cls5);
            g gVar3 = this.f38113b;
            this.j = new a0(gVar3.f38002c.f6490a, eVar, gVar3.f38011n, gVar3.f38004e, gVar3.f38005f, lVarE, cls5, gVar3.f38007i);
            File fileF = gVar3.f38006h.a().f(this.j);
            this.f38119i = fileF;
            if (fileF != null) {
                this.f38116e = eVar;
                this.f38117f = this.f38113b.f38002c.b().g(fileF);
                z10 = false;
                this.g = 0;
            } else {
                z10 = false;
            }
            z3 = z10;
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f38112a.b(this.j, exc, this.f38118h.f22049c, 4);
    }

    @Override // z7.f
    public final void cancel() {
        d8.u uVar = this.f38118h;
        if (uVar != null) {
            uVar.f22049c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f38112a.c(this.f38116e, obj, this.f38118h.f22049c, 4, this.j);
    }
}
