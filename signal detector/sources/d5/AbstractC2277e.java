package d5;

import java.util.AbstractList;
import java.util.List;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2277e extends AbstractList implements List, r5.b {
    public abstract int a();

    public abstract Object b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
