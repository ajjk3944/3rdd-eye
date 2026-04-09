package E0;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class C0 extends TreeSet {
    public C0(Comparator comparator) {
        super(comparator);
    }

    public /* bridge */ int m() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m();
    }
}
