package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            j.d(false);
        }
    }

    public class a extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f11848a;

        public a(Iterator it) {
            this.f11848a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11848a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f11848a.next();
        }
    }

    public class b extends AbstractIterator {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f11849c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.h f11850d;

        public b(Iterator it, com.google.common.base.h hVar) {
            this.f11849c = it;
            this.f11850d = hVar;
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object a() {
            while (this.f11849c.hasNext()) {
                Object next = this.f11849c.next();
                if (this.f11850d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    public class c extends u0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.c f11851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Iterator it, com.google.common.base.c cVar) {
            super(it);
            this.f11851b = cVar;
        }

        @Override // com.google.common.collect.u0
        public Object a(Object obj) {
            return this.f11851b.apply(obj);
        }
    }

    public class d extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11852a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f11853b;

        public d(Object obj) {
            this.f11853b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f11852a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f11852a) {
                throw new NoSuchElementException();
            }
            this.f11852a = true;
            return this.f11853b;
        }
    }

    public static final class e extends com.google.common.collect.a {

        /* renamed from: e, reason: collision with root package name */
        public static final w0 f11854e = new e(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f11855c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11856d;

        public e(Object[] objArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f11855c = objArr;
            this.f11856d = i10;
        }

        @Override // com.google.common.collect.a
        public Object a(int i10) {
            return this.f11855c[this.f11856d + i10];
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        com.google.common.base.g.m(collection);
        com.google.common.base.g.m(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int b(Iterator it, int i10) {
        com.google.common.base.g.m(it);
        int i11 = 0;
        com.google.common.base.g.e(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static void c(Iterator it) {
        com.google.common.base.g.m(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static v0 e() {
        return f();
    }

    public static w0 f() {
        return e.f11854e;
    }

    public static Iterator g() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static v0 h(Iterator it, com.google.common.base.h hVar) {
        com.google.common.base.g.m(it);
        com.google.common.base.g.m(hVar);
        return new b(it, hVar);
    }

    public static Object i(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object j(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean k(Iterator it, Collection collection) {
        com.google.common.base.g.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean l(Iterator it, Collection collection) {
        com.google.common.base.g.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static v0 m(Object obj) {
        return new d(obj);
    }

    public static String n(Iterator it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(it.next());
            z10 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static Iterator o(Iterator it, com.google.common.base.c cVar) {
        com.google.common.base.g.m(cVar);
        return new c(it, cVar);
    }

    public static v0 p(Iterator it) {
        com.google.common.base.g.m(it);
        return it instanceof v0 ? (v0) it : new a(it);
    }
}
