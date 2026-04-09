package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class x extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.serialization.b element) {
        super(element, null);
        kotlin.jvm.internal.p.e(element, "element");
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        return collection.size();
    }
}
