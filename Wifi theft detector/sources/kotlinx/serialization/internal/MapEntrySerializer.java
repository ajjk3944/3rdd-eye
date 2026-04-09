package kotlinx.serialization.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public final class MapEntrySerializer extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22795c;

    public static final class a implements Map.Entry, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f22796a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22797b;

        public a(Object obj, Object obj2) {
            this.f22796a = obj;
            this.f22797b = obj2;
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
            return kotlin.jvm.internal.p.a(getKey(), aVar.getKey()) && kotlin.jvm.internal.p.a(getValue(), aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f22796a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f22797b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(final kotlinx.serialization.b keySerializer, final kotlinx.serialization.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.p.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.p.e(valueSerializer, "valueSerializer");
        this.f22795c = SerialDescriptorsKt.c("kotlin.collections.Map.Entry", i.c.f22788a, new kotlinx.serialization.descriptors.f[0], new l9.l() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                kotlin.jvm.internal.p.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "key", keySerializer.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, valueSerializer.getDescriptor(), null, false, 12, null);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlinx.serialization.descriptors.a) obj);
                return y8.s.f25199a;
            }
        });
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        kotlin.jvm.internal.p.e(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(Map.Entry entry) {
        kotlin.jvm.internal.p.e(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map.Entry c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22795c;
    }
}
