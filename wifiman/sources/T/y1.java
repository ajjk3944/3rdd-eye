package T;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f21290a = new ArrayList();

    public final void a() {
        this.f21290a.clear();
    }

    public final int b() {
        return this.f21290a.size();
    }

    public final boolean c() {
        return this.f21290a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final Object e() {
        return this.f21290a.get(b() - 1);
    }

    public final Object f(int i10) {
        return this.f21290a.get(i10);
    }

    public final Object g() {
        return this.f21290a.remove(b() - 1);
    }

    public final boolean h(Object obj) {
        return this.f21290a.add(obj);
    }

    public final Object[] i() {
        int size = this.f21290a.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = this.f21290a.get(i10);
        }
        return objArr;
    }
}
