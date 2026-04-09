package d0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import r.k;
import r0.f;
import r0.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f20596a = new g(10);

    /* renamed from: b, reason: collision with root package name */
    public final k f20597b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20598c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20599d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f20597b.containsKey(obj) || !this.f20597b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f20597b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f20597b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f20597b.containsKey(obj)) {
            return;
        }
        this.f20597b.put(obj, null);
    }

    public void c() {
        int size = this.f20597b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f20597b.l(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f20597b.clear();
    }

    public boolean d(Object obj) {
        return this.f20597b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f20597b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f20596a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        return (List) this.f20597b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f20597b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f20597b.l(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f20597b.h(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f20598c.clear();
        this.f20599d.clear();
        int size = this.f20597b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f20597b.h(i10), this.f20598c, this.f20599d);
        }
        return this.f20598c;
    }

    public boolean j(Object obj) {
        int size = this.f20597b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f20597b.l(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        arrayList.clear();
        this.f20596a.a(arrayList);
    }
}
