package Q9;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes3.dex */
public final class L extends AbstractC1559w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11433b;

    /* renamed from: c, reason: collision with root package name */
    public final V f11434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M9.b eSerializer, int i) {
        super(eSerializer);
        this.f11433b = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.l.f(eSerializer, "eSerializer");
                super(eSerializer);
                O9.e elementDesc = eSerializer.getDescriptor();
                kotlin.jvm.internal.l.f(elementDesc, "elementDesc");
                this.f11434c = new K(elementDesc, 1);
                break;
            default:
                kotlin.jvm.internal.l.f(eSerializer, "eSerializer");
                O9.e elementDesc2 = eSerializer.getDescriptor();
                kotlin.jvm.internal.l.f(elementDesc2, "elementDesc");
                this.f11434c = new K(elementDesc2, 0);
                break;
        }
    }

    @Override // Q9.AbstractC1518a
    public final Object a() {
        switch (this.f11433b) {
            case 0:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // Q9.AbstractC1518a
    public final int b(Object obj) {
        switch (this.f11433b) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        switch (this.f11433b) {
            case 0:
                kotlin.jvm.internal.l.f(null, "<this>");
                return new HashSet((Collection) null);
            default:
                kotlin.jvm.internal.l.f(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        switch (this.f11433b) {
        }
        return (K) this.f11434c;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) {
        switch (this.f11433b) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // Q9.AbstractC1558v
    public final void i(int i, Object obj, Object obj2) {
        switch (this.f11433b) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
