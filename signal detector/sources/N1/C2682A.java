package n1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l1.InterfaceC2639e;
import u.C2936e;

/* renamed from: n1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2682A implements g, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final i f22146a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22147b;

    /* renamed from: c, reason: collision with root package name */
    public int f22148c;

    /* renamed from: d, reason: collision with root package name */
    public int f22149d = -1;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2639e f22150e;

    /* renamed from: f, reason: collision with root package name */
    public List f22151f;

    /* renamed from: g, reason: collision with root package name */
    public int f22152g;

    /* renamed from: h, reason: collision with root package name */
    public volatile r1.q f22153h;
    public File i;

    /* renamed from: j, reason: collision with root package name */
    public B f22154j;

    public C2682A(h hVar, i iVar) {
        this.f22147b = hVar;
        this.f22146a = iVar;
    }

    @Override // n1.g
    public final boolean b() {
        List list;
        boolean z6;
        List list2;
        boolean z7;
        ArrayList arrayListA = this.f22147b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        h hVar = this.f22147b;
        com.bumptech.glide.j jVarB = hVar.f22187c.b();
        Class<?> cls = hVar.f22188d.getClass();
        Class cls2 = hVar.f22191g;
        Class cls3 = hVar.f22194k;
        V2.h hVar2 = jVarB.f6520h;
        H1.n nVar = (H1.n) ((AtomicReference) hVar2.f3875b).getAndSet(null);
        if (nVar == null) {
            nVar = new H1.n(cls, cls2, cls3);
        } else {
            nVar.f1775a = cls;
            nVar.f1776b = cls2;
            nVar.f1777c = cls3;
        }
        synchronized (((C2936e) hVar2.f3876c)) {
            list = (List) ((C2936e) hVar2.f3876c).get(nVar);
        }
        ((AtomicReference) hVar2.f3875b).set(nVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListA2 = jVarB.f6513a.a(cls);
            int size = arrayListA2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA2.get(i);
                i++;
                ArrayList arrayListG = jVarB.f6515c.G((Class) obj, cls2);
                int size2 = arrayListG.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListG.get(i3);
                    i3++;
                    Class cls4 = (Class) obj2;
                    if (!jVarB.f6518f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z6 = false;
            jVarB.f6520h.v(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        } else {
            z6 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f22147b.f22194k)) {
                return z6;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f22147b.f22188d.getClass() + " to " + this.f22147b.f22194k);
        }
        while (true) {
            List list3 = this.f22151f;
            if (list3 != null && this.f22152g < list3.size()) {
                this.f22153h = null;
                boolean z8 = z6;
                while (!z8 && this.f22152g < this.f22151f.size()) {
                    List list4 = this.f22151f;
                    int i6 = this.f22152g;
                    this.f22152g = i6 + 1;
                    r1.r rVar = (r1.r) list4.get(i6);
                    File file = this.i;
                    h hVar3 = this.f22147b;
                    this.f22153h = rVar.a(file, hVar3.f22189e, hVar3.f22190f, hVar3.i);
                    if (this.f22153h != null && this.f22147b.c(this.f22153h.f23370c.a()) != null) {
                        this.f22153h.f23370c.e(this.f22147b.f22198o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i7 = this.f22149d + 1;
            this.f22149d = i7;
            if (i7 >= list2.size()) {
                int i8 = this.f22148c + 1;
                this.f22148c = i8;
                if (i8 >= arrayListA.size()) {
                    return z6;
                }
                this.f22149d = z6 ? 1 : 0;
            }
            InterfaceC2639e interfaceC2639e = (InterfaceC2639e) arrayListA.get(this.f22148c);
            Class cls5 = (Class) list2.get(this.f22149d);
            l1.l lVarE = this.f22147b.e(cls5);
            h hVar4 = this.f22147b;
            this.f22154j = new B(hVar4.f22187c.f6498a, interfaceC2639e, hVar4.f22197n, hVar4.f22189e, hVar4.f22190f, lVarE, cls5, hVar4.i);
            File fileK = hVar4.f22192h.a().k(this.f22154j);
            this.i = fileK;
            if (fileK != null) {
                this.f22150e = interfaceC2639e;
                this.f22151f = this.f22147b.f22187c.b().g(fileK);
                z7 = false;
                this.f22152g = 0;
            } else {
                z7 = false;
            }
            z6 = z7;
        }
    }

    @Override // n1.g
    public final void cancel() {
        r1.q qVar = this.f22153h;
        if (qVar != null) {
            qVar.f23370c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        this.f22146a.a(this.f22154j, exc, this.f22153h.f23370c, 4);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f22146a.c(this.f22150e, obj, this.f22153h.f23370c, 4, this.f22154j);
    }
}
