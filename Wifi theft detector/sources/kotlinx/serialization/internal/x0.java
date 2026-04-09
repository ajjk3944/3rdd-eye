package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class x0 extends x {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlinx.serialization.b eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.p.e(eSerializer, "eSerializer");
        this.f22928b = new w0(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22928b;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.p.e(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet linkedHashSet, int i10) {
        kotlin.jvm.internal.p.e(linkedHashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        kotlin.jvm.internal.p.e(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet k(Set set) {
        kotlin.jvm.internal.p.e(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.p.e(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
