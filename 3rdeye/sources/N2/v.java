package N2;

import D9.G;
import R2.q;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m0.C5308a;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public final class v implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final j f4638b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f4639c;

    /* renamed from: d, reason: collision with root package name */
    public int f4640d;

    /* renamed from: e, reason: collision with root package name */
    public int f4641e = -1;

    /* renamed from: f, reason: collision with root package name */
    public L2.f f4642f;

    /* renamed from: g, reason: collision with root package name */
    public List<R2.q<File, ?>> f4643g;

    /* renamed from: h, reason: collision with root package name */
    public int f4644h;
    public volatile q.a<?> i;

    /* renamed from: j, reason: collision with root package name */
    public File f4645j;

    /* renamed from: k, reason: collision with root package name */
    public w f4646k;

    public v(i iVar, j jVar) {
        this.f4639c = iVar;
        this.f4638b = jVar;
    }

    @Override // N2.h
    public final boolean b() {
        List list;
        ArrayList arrayListA = this.f4639c.a();
        boolean z10 = false;
        if (!arrayListA.isEmpty()) {
            i<?> iVar = this.f4639c;
            com.bumptech.glide.i iVarB = iVar.f4489c.b();
            Class<?> cls = iVar.f4490d.getClass();
            Class<?> cls2 = iVar.f4493g;
            Class<?> cls3 = iVar.f4496k;
            G g10 = iVarB.f22263h;
            h3.k kVar = (h3.k) ((AtomicReference) g10.f1156b).getAndSet(null);
            if (kVar == null) {
                kVar = new h3.k(cls, cls2, cls3);
            } else {
                kVar.f38214a = cls;
                kVar.f38215b = cls2;
                kVar.f38216c = cls3;
            }
            synchronized (((C5308a) g10.f1157c)) {
                list = (List) ((C5308a) g10.f1157c).get(kVar);
            }
            ((AtomicReference) g10.f1156b).set(kVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = iVarB.f22256a.a(cls).iterator();
                while (it.hasNext()) {
                    Iterator it2 = iVarB.f22258c.b((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!iVarB.f22261f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                iVarB.f22263h.h(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<R2.q<File, ?>> list3 = this.f4643g;
                    if (list3 != null && this.f4644h < list3.size()) {
                        this.i = null;
                        while (!z10 && this.f4644h < this.f4643g.size()) {
                            List<R2.q<File, ?>> list4 = this.f4643g;
                            int i = this.f4644h;
                            this.f4644h = i + 1;
                            R2.q<File, ?> qVar = list4.get(i);
                            File file = this.f4645j;
                            i<?> iVar2 = this.f4639c;
                            this.i = qVar.b(file, iVar2.f4491e, iVar2.f4492f, iVar2.i);
                            if (this.i != null && this.f4639c.c(this.i.f11688c.a()) != null) {
                                this.i.f11688c.e(this.f4639c.f4500o, this);
                                z10 = true;
                            }
                        }
                        return z10;
                    }
                    int i10 = this.f4641e + 1;
                    this.f4641e = i10;
                    if (i10 >= list2.size()) {
                        int i11 = this.f4640d + 1;
                        this.f4640d = i11;
                        if (i11 >= arrayListA.size()) {
                            break;
                        }
                        this.f4641e = 0;
                    }
                    L2.f fVar = (L2.f) arrayListA.get(this.f4640d);
                    Class cls5 = (Class) list2.get(this.f4641e);
                    L2.l<Z> lVarE = this.f4639c.e(cls5);
                    i<?> iVar3 = this.f4639c;
                    this.f4646k = new w(iVar3.f4489c.f22245a, fVar, iVar3.f4499n, iVar3.f4491e, iVar3.f4492f, lVarE, cls5, iVar3.i);
                    File fileH = iVar3.f4494h.a().h(this.f4646k);
                    this.f4645j = fileH;
                    if (fileH != null) {
                        this.f4642f = fVar;
                        this.f4643g = this.f4639c.f4489c.b().g(fileH);
                        this.f4644h = 0;
                    }
                }
            } else if (!File.class.equals(this.f4639c.f4496k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f4639c.f4490d.getClass() + " to " + this.f4639c.f4496k);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f4638b.a(this.f4646k, exc, this.i.f11688c, L2.a.RESOURCE_DISK_CACHE);
    }

    @Override // N2.h
    public final void cancel() {
        q.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.f11688c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f4638b.c(this.f4642f, obj, this.i.f11688c, L2.a.RESOURCE_DISK_CACHE, this.f4646k);
    }
}
