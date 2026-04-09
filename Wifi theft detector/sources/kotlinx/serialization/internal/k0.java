package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k0 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlinx.serialization.b kSerializer, kotlinx.serialization.b vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.p.e(kSerializer, "kSerializer");
        kotlin.jvm.internal.p.e(vSerializer, "vSerializer");
        this.f22877c = new j0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.d1, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22877c;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        return map.size() * 2;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap map, int i10) {
        kotlin.jvm.internal.p.e(map, "<this>");
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
    public HashMap k(Map map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap map) {
        kotlin.jvm.internal.p.e(map, "<this>");
        return map;
    }
}
