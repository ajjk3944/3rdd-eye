package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class am3 extends vl3 implements SortedSet {
    public final /* synthetic */ pn3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(pn3 pn3Var, SortedMap sortedMap) {
        super(pn3Var, sortedMap);
        Objects.requireNonNull(pn3Var);
        this.h = pn3Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new am3(this.h, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new am3(this.h, a().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new am3(this.h, a().tailMap(obj));
    }
}
