package com.google.common.collect;

import com.google.common.collect.AbstractC5070p;
import com.google.common.collect.AbstractC5071q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5072s extends AbstractC5071q implements A {

    /* renamed from: c, reason: collision with root package name */
    private final transient r f38413c;

    /* renamed from: com.google.common.collect.s$a */
    public static final class a extends AbstractC5071q.a {
        public C5072s a() {
            Collection collectionEntrySet = this.f38409a.entrySet();
            Comparator comparator = this.f38410b;
            if (comparator != null) {
                collectionEntrySet = G.a(comparator).g().c(collectionEntrySet);
            }
            return C5072s.h(collectionEntrySet, this.f38411c);
        }
    }

    C5072s(AbstractC5070p abstractC5070p, int i10, Comparator comparator) {
        super(abstractC5070p, i10);
        this.f38413c = g(comparator);
    }

    private static r g(Comparator comparator) {
        return comparator == null ? r.b0() : AbstractC5073t.Z0(comparator);
    }

    static C5072s h(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return j();
        }
        AbstractC5070p.a aVar = new AbstractC5070p.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r rVarL = l(comparator, (Collection) entry.getValue());
            if (!rVarL.isEmpty()) {
                aVar.f(key, rVarL);
                size += rVarL.size();
            }
        }
        return new C5072s(aVar.c(), size, comparator);
    }

    public static C5072s j() {
        return C5066l.f38384d;
    }

    private static r l(Comparator comparator, Collection collection) {
        return comparator == null ? r.F(collection) : AbstractC5073t.W0(comparator, collection);
    }
}
