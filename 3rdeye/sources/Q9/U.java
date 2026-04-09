package Q9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes3.dex */
public final class U<K, V> extends AbstractC1521b0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public final I f11460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(M9.b<K> kSerializer, M9.b<V> vSerializer) {
        super(kSerializer, vSerializer);
        kotlin.jvm.internal.l.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.l.f(vSerializer, "vSerializer");
        O9.e keyDesc = kSerializer.getDescriptor();
        O9.e valueDesc = vSerializer.getDescriptor();
        kotlin.jvm.internal.l.f(keyDesc, "keyDesc");
        kotlin.jvm.internal.l.f(valueDesc, "valueDesc");
        this.f11460c = new I("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // Q9.AbstractC1518a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // Q9.AbstractC1518a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.l.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // Q9.AbstractC1518a
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.l.f(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.l.f(map, "<this>");
        return map.size();
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        kotlin.jvm.internal.l.f(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11460c;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.l.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
