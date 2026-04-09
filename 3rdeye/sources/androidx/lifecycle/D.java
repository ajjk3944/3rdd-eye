package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import q.C5486b;
import v.C5665u;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class D<T> extends E<T> {

    /* renamed from: l, reason: collision with root package name */
    public final C5486b<C<?>, a<?>> f16039l = new C5486b<>();

    /* compiled from: MediatorLiveData.java */
    public static class a<V> implements F<V> {

        /* renamed from: a, reason: collision with root package name */
        public final E f16040a;

        /* renamed from: b, reason: collision with root package name */
        public final C5665u f16041b;

        /* renamed from: c, reason: collision with root package name */
        public int f16042c = -1;

        public a(E e4, C5665u c5665u) {
            this.f16040a = e4;
            this.f16041b = c5665u;
        }

        @Override // androidx.lifecycle.F
        public final void a(V v10) {
            int i = this.f16042c;
            int i10 = this.f16040a.f16029g;
            if (i != i10) {
                this.f16042c = i10;
                this.f16041b.a(v10);
            }
        }
    }

    @Override // androidx.lifecycle.C
    public final void g() {
        Iterator<Map.Entry<C<?>, a<?>>> it = this.f16039l.iterator();
        while (true) {
            C5486b.e eVar = (C5486b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f16040a.f(aVar);
        }
    }

    @Override // androidx.lifecycle.C
    public final void h() {
        Iterator<Map.Entry<C<?>, a<?>>> it = this.f16039l.iterator();
        while (true) {
            C5486b.e eVar = (C5486b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f16040a.i(aVar);
        }
    }
}
