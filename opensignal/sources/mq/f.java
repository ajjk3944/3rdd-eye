package mq;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AbstractList implements List, cr.b {
    public abstract int a();

    public abstract Object b(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return b(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
