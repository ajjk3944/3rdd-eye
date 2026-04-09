package Zi;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3739x extends AbstractC3737w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3739x(Vi.b element) {
        super(element, null);
        AbstractC6492s.i(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterator j(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int k(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        return collection.size();
    }
}
