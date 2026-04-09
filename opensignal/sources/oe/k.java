package oe;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class k extends f implements SortedMap {

    /* renamed from: x, reason: collision with root package name */
    public SortedSet f19342x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q0 f19343y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q0 q0Var, SortedMap sortedMap) {
        super(q0Var, sortedMap);
        this.f19343y = q0Var;
    }

    public SortedSet b() {
        return new l(this.f19343y, d());
    }

    @Override // oe.f, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f19342x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f19342x = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f19325g;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new k(this.f19343y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new k(this.f19343y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new k(this.f19343y, d().tailMap(obj));
    }
}
