package oe;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class l extends g implements SortedSet {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f19346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q0 q0Var, SortedMap sortedMap) {
        super(q0Var, sortedMap);
        this.f19346g = q0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f19330a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new l(this.f19346g, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new l(this.f19346g, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new l(this.f19346g, a().tailMap(obj));
    }
}
