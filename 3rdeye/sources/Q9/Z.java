package Q9;

import O9.l;
import b9.C1992A;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import q9.InterfaceC5499a;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class Z<K, V> extends T<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    public final O9.f f11467c;

    /* compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final K f11468b;

        /* renamed from: c, reason: collision with root package name */
        public final V f11469c;

        public a(K k10, V v10) {
            this.f11468b = k10;
            this.f11469c = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f11468b, aVar.f11468b) && kotlin.jvm.internal.l.b(this.f11469c, aVar.f11469c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f11468b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f11469c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f11468b;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f11469c;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.f11468b + ", value=" + this.f11469c + ')';
        }
    }

    /* compiled from: Tuples.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<O9.a, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ M9.b<K> f11470g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ M9.b<V> f11471h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M9.b<K> bVar, M9.b<V> bVar2) {
            super(1);
            this.f11470g = bVar;
            this.f11471h = bVar2;
        }

        @Override // p9.l
        public final C1992A invoke(O9.a aVar) {
            O9.a buildSerialDescriptor = aVar;
            kotlin.jvm.internal.l.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
            O9.a.a(buildSerialDescriptor, "key", this.f11470g.getDescriptor());
            O9.a.a(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f11471h.getDescriptor());
            return C1992A.f18074a;
        }
    }

    public Z(M9.b<K> bVar, M9.b<V> bVar2) {
        super(bVar, bVar2);
        this.f11467c = O9.j.b("kotlin.collections.Map.Entry", l.c.f10525a, new O9.e[0], new b(bVar, bVar2));
    }

    @Override // Q9.T
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.l.f(entry, "<this>");
        return entry.getKey();
    }

    @Override // Q9.T
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.l.f(entry, "<this>");
        return entry.getValue();
    }

    @Override // Q9.T
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11467c;
    }
}
