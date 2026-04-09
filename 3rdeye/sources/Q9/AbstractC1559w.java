package Q9;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1559w<E, C extends Collection<? extends E>, B> extends AbstractC1558v<E, C, B> {
    @Override // Q9.AbstractC1518a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.l.f(collection, "<this>");
        return collection.iterator();
    }

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.l.f(collection, "<this>");
        return collection.size();
    }
}
