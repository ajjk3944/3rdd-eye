package androidx.coordinatorlayout.widget;

import E1.e;
import E1.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.V;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f30660a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final V f30661b = new V();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f30662c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f30663d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f30661b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f30660a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void j(ArrayList arrayList) {
        arrayList.clear();
        this.f30660a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f30661b.containsKey(obj) || !this.f30661b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f30661b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f30661b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f30661b.containsKey(obj)) {
            return;
        }
        this.f30661b.put(obj, null);
    }

    public void c() {
        int size = this.f30661b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f30661b.l(i10);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f30661b.clear();
    }

    public boolean d(Object obj) {
        return this.f30661b.containsKey(obj);
    }

    public List g(Object obj) {
        int size = this.f30661b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f30661b.l(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f30661b.h(i10));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f30662c.clear();
        this.f30663d.clear();
        int size = this.f30661b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f30661b.h(i10), this.f30662c, this.f30663d);
        }
        return this.f30662c;
    }

    public boolean i(Object obj) {
        int size = this.f30661b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f30661b.l(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
