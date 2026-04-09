package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class zl3 extends ul3 implements SortedMap {
    public SortedSet j;
    public final /* synthetic */ pn3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(pn3 pn3Var, SortedMap sortedMap) {
        super(pn3Var, sortedMap);
        Objects.requireNonNull(pn3Var);
        this.k = pn3Var;
    }

    public SortedSet b() {
        return new am3(this.k, d());
    }

    @Override // defpackage.ul3, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.j;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.j = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.h;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zl3(this.k, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zl3(this.k, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zl3(this.k, d().tailMap(obj));
    }
}
