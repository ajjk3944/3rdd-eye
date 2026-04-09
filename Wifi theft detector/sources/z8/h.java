package z8;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class h extends AbstractSet implements Set, m9.a {
    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
