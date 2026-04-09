package Q9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes3.dex */
public final class J<K, V> extends AbstractC1521b0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public final I f11427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M9.b<K> kSerializer, M9.b<V> vSerializer) {
        super(kSerializer, vSerializer);
        kotlin.jvm.internal.l.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.l.f(vSerializer, "vSerializer");
        O9.e keyDesc = kSerializer.getDescriptor();
        O9.e valueDesc = vSerializer.getDescriptor();
        kotlin.jvm.internal.l.f(keyDesc, "keyDesc");
        kotlin.jvm.internal.l.f(valueDesc, "valueDesc");
        this.f11427c = new I("kotlin.collections.HashMap", keyDesc, valueDesc);
    }

    @Override // Q9.AbstractC1518a
    public final Object a() {
        return new HashMap();
    }

    @Override // Q9.AbstractC1518a
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        kotlin.jvm.internal.l.f(map, "<this>");
        return map.size() * 2;
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
        return new HashMap((Map) null);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11427c;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        kotlin.jvm.internal.l.f(map, "<this>");
        return map;
    }
}
