package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m0 extends x {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlinx.serialization.b eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.p.e(eSerializer, "eSerializer");
        this.f22885b = new l0(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22885b;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet a() {
        return new HashSet();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet hashSet) {
        kotlin.jvm.internal.p.e(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet hashSet, int i10) {
        kotlin.jvm.internal.p.e(hashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet hashSet, int i10, Object obj) {
        kotlin.jvm.internal.p.e(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet k(Set set) {
        kotlin.jvm.internal.p.e(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(HashSet hashSet) {
        kotlin.jvm.internal.p.e(hashSet, "<this>");
        return hashSet;
    }
}
