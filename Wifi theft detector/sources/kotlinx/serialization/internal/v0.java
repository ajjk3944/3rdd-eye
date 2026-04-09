package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class v0 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlinx.serialization.b kSerializer, kotlinx.serialization.b vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.p.e(kSerializer, "kSerializer");
        kotlin.jvm.internal.p.e(vSerializer, "vSerializer");
        this.f22923c = new u0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.d1, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22923c;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap a() {
        return new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.p.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap linkedHashMap, int i10) {
        kotlin.jvm.internal.p.e(linkedHashMap, "<this>");
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap k(Map map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.p.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
