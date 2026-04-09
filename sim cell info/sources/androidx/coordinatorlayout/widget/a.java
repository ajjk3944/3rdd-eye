package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import k.g;
import z.d;
import z.e;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d<ArrayList<T>> f1438a = new e(10);

    /* renamed from: b, reason: collision with root package name */
    private final g<T, ArrayList<T>> f1439b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f1440c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f1441d = new HashSet<>();

    private void e(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t2)) {
            return;
        }
        if (hashSet.contains(t2)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t2);
        ArrayList<T> arrayList2 = this.f1439b.get(t2);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t2);
        arrayList.add(t2);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f1438a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void i(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1438a.a(arrayList);
    }

    public void a(T t2, T t3) {
        if (!this.f1439b.containsKey(t2) || !this.f1439b.containsKey(t3)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f1439b.get(t2);
        if (arrayListF == null) {
            arrayListF = f();
            this.f1439b.put(t2, arrayListF);
        }
        arrayListF.add(t3);
    }

    public void b(T t2) {
        if (this.f1439b.containsKey(t2)) {
            return;
        }
        this.f1439b.put(t2, null);
    }

    public void c() {
        int size = this.f1439b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListL = this.f1439b.l(i2);
            if (arrayListL != null) {
                i(arrayListL);
            }
        }
        this.f1439b.clear();
    }

    public boolean d(T t2) {
        return this.f1439b.containsKey(t2);
    }

    public ArrayList<T> g() {
        this.f1440c.clear();
        this.f1441d.clear();
        int size = this.f1439b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.f1439b.i(i2), this.f1440c, this.f1441d);
        }
        return this.f1440c;
    }

    public boolean h(T t2) {
        int size = this.f1439b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListL = this.f1439b.l(i2);
            if (arrayListL != null && arrayListL.contains(t2)) {
                return true;
            }
        }
        return false;
    }
}
