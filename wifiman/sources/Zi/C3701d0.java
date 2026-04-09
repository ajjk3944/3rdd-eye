package Zi;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3701d0 extends AbstractC3739x {

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25619b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701d0(Vi.b eSerializer) {
        super(eSerializer);
        AbstractC6492s.i(eSerializer, "eSerializer");
        this.f25619b = new C3699c0(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet q(Set set) {
        AbstractC6492s.i(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Set r(LinkedHashSet linkedHashSet) {
        AbstractC6492s.i(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // Zi.AbstractC3737w, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25619b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet g() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(LinkedHashSet linkedHashSet) {
        AbstractC6492s.i(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(LinkedHashSet linkedHashSet, int i10) {
        AbstractC6492s.i(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(LinkedHashSet linkedHashSet, int i10, Object obj) {
        AbstractC6492s.i(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }
}
