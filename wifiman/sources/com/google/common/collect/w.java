package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC6767f;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
public abstract class w {

    class a extends S {

        /* renamed from: a, reason: collision with root package name */
        boolean f38416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f38417b;

        a(Object obj) {
            this.f38417b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f38416a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f38416a) {
                throw new NoSuchElementException();
            }
            this.f38416a = true;
            return this.f38417b;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        AbstractC6769h.i(collection);
        AbstractC6769h.i(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC6767f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static S c(Object obj) {
        return new a(obj);
    }
}
