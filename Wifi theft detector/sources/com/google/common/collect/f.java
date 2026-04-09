package com.google.common.collect;

import com.google.common.collect.e0;
import com.google.common.collect.s0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: classes2.dex */
public abstract class f extends d implements r0 {

    /* renamed from: c, reason: collision with root package name */
    public transient r0 f12041c;

    @GwtTransient
    final Comparator<Object> comparator;

    public class a extends n {
        public a() {
        }

        @Override // com.google.common.collect.n
        public r0 A() {
            return f.this;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return f.this.descendingIterator();
        }

        @Override // com.google.common.collect.n
        public Iterator z() {
            return f.this.v();
        }
    }

    public f() {
        this(j0.d());
    }

    public r0 a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        com.google.common.base.g.m(boundType);
        com.google.common.base.g.m(boundType2);
        return t(obj, boundType).q(obj2, boundType2);
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public Iterator descendingIterator() {
        return Multisets.h(o());
    }

    public e0.a firstEntry() {
        Iterator itJ = j();
        if (itJ.hasNext()) {
            return (e0.a) itJ.next();
        }
        return null;
    }

    public e0.a lastEntry() {
        Iterator itV = v();
        if (itV.hasNext()) {
            return (e0.a) itV.next();
        }
        return null;
    }

    public r0 o() {
        r0 r0Var = this.f12041c;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0VarS = s();
        this.f12041c = r0VarS;
        return r0VarS;
    }

    public e0.a pollFirstEntry() {
        Iterator itJ = j();
        if (!itJ.hasNext()) {
            return null;
        }
        e0.a aVar = (e0.a) itJ.next();
        e0.a aVarG = Multisets.g(aVar.d(), aVar.getCount());
        itJ.remove();
        return aVarG;
    }

    public e0.a pollLastEntry() {
        Iterator itV = v();
        if (!itV.hasNext()) {
            return null;
        }
        e0.a aVar = (e0.a) itV.next();
        e0.a aVarG = Multisets.g(aVar.d(), aVar.getCount());
        itV.remove();
        return aVarG;
    }

    public r0 s() {
        return new a();
    }

    @Override // com.google.common.collect.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public NavigableSet d() {
        return new s0.b(this);
    }

    public abstract Iterator v();

    public f(Comparator comparator) {
        this.comparator = (Comparator) com.google.common.base.g.m(comparator);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public NavigableSet k() {
        return (NavigableSet) super.k();
    }
}
