package Zi;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class Q extends AbstractC3739x {

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Vi.b eSerializer) {
        super(eSerializer);
        AbstractC6492s.i(eSerializer, "eSerializer");
        this.f25583b = new P(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public HashSet q(Set set) {
        AbstractC6492s.i(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set r(HashSet hashSet) {
        AbstractC6492s.i(hashSet, "<this>");
        return hashSet;
    }

    @Override // Zi.AbstractC3737w, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25583b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashSet g() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(HashSet hashSet) {
        AbstractC6492s.i(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(HashSet hashSet, int i10) {
        AbstractC6492s.i(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(HashSet hashSet, int i10, Object obj) {
        AbstractC6492s.i(hashSet, "<this>");
        hashSet.add(obj);
    }
}
