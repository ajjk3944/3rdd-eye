package z8;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class f extends AbstractList implements List, m9.b {
    public abstract int d();

    public abstract Object e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
