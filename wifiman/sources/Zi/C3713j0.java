package Zi;

import Xi.n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: Zi.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3713j0 extends Z {

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25647c;

    /* renamed from: Zi.j0$a */
    private static final class a implements Map.Entry, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f25648a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f25649b;

        public a(Object obj, Object obj2) {
            this.f25648a = obj;
            this.f25649b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f25648a, aVar.f25648a) && AbstractC6492s.d(this.f25649b, aVar.f25649b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f25648a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f25649b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f25648a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f25649b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f25648a + ", value=" + this.f25649b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713j0(final Vi.b keySerializer, final Vi.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC6492s.i(keySerializer, "keySerializer");
        AbstractC6492s.i(valueSerializer, "valueSerializer");
        this.f25647c = Xi.l.d("kotlin.collections.Map.Entry", n.c.f24472a, new Xi.f[0], new InterfaceC6835l() { // from class: Zi.i0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3713j0.m(keySerializer, valueSerializer, (Xi.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(Vi.b bVar, Vi.b bVar2, Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Xi.a.b(buildSerialDescriptor, "key", bVar.a(), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "value", bVar2.a(), null, false, 12, null);
        return Yg.J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25647c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object g(Map.Entry entry) {
        AbstractC6492s.i(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object i(Map.Entry entry) {
        AbstractC6492s.i(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry k(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
