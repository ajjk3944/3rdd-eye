package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.e0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.xbill.DNS.TTL;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractMapBasedMultiset<E> extends d implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient h0 f11656c;

    /* renamed from: d, reason: collision with root package name */
    public transient long f11657d;

    public class a extends c {
        public a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        public Object b(int i10) {
            return AbstractMapBasedMultiset.this.f11656c.f(i10);
        }
    }

    public class b extends c {
        public b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e0.a b(int i10) {
            return AbstractMapBasedMultiset.this.f11656c.d(i10);
        }
    }

    public abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f11660a;

        /* renamed from: b, reason: collision with root package name */
        public int f11661b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f11662c;

        public c() {
            this.f11660a = AbstractMapBasedMultiset.this.f11656c.b();
            this.f11662c = AbstractMapBasedMultiset.this.f11656c.f12048d;
        }

        public final void a() {
            if (AbstractMapBasedMultiset.this.f11656c.f12048d != this.f11662c) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object b(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f11660a >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = b(this.f11660a);
            int i10 = this.f11660a;
            this.f11661b = i10;
            this.f11660a = AbstractMapBasedMultiset.this.f11656c.p(i10);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.d(this.f11661b != -1);
            AbstractMapBasedMultiset.this.f11657d -= r0.f11656c.u(this.f11661b);
            this.f11660a = AbstractMapBasedMultiset.this.f11656c.q(this.f11660a, this.f11661b);
            this.f11661b = -1;
            this.f11662c = AbstractMapBasedMultiset.this.f11656c.f12048d;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = n0.h(objectInputStream);
        this.f11656c = u(3);
        n0.g(this, objectInputStream, iH);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.k(this, objectOutputStream);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f11656c.a();
        this.f11657d = 0L;
    }

    @Override // com.google.common.collect.d
    public final int h() {
        return this.f11656c.z();
    }

    @Override // com.google.common.collect.d
    public final Iterator i() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.d
    public final Iterator j() {
        return new b();
    }

    @Override // com.google.common.collect.e0
    public final int l(Object obj, int i10) {
        j.b(i10, "count");
        h0 h0Var = this.f11656c;
        int iS = i10 == 0 ? h0Var.s(obj) : h0Var.r(obj, i10);
        this.f11657d += i10 - iS;
        return iS;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public final int m(Object obj, int i10) {
        if (i10 == 0) {
            return r(obj);
        }
        com.google.common.base.g.f(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iJ = this.f11656c.j(obj);
        if (iJ == -1) {
            return 0;
        }
        int iH = this.f11656c.h(iJ);
        if (iH > i10) {
            this.f11656c.y(iJ, iH - i10);
        } else {
            this.f11656c.u(iJ);
            i10 = iH;
        }
        this.f11657d -= i10;
        return iH;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public final int n(Object obj, int i10) {
        if (i10 == 0) {
            return r(obj);
        }
        com.google.common.base.g.f(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iJ = this.f11656c.j(obj);
        if (iJ == -1) {
            this.f11656c.r(obj, i10);
            this.f11657d += i10;
            return 0;
        }
        int iH = this.f11656c.h(iJ);
        long j10 = i10;
        long j11 = iH + j10;
        com.google.common.base.g.h(j11 <= TTL.MAX_VALUE, "too many occurrences: %s", j11);
        this.f11656c.y(iJ, (int) j11);
        this.f11657d += j10;
        return iH;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public final boolean p(Object obj, int i10, int i11) {
        j.b(i10, "oldCount");
        j.b(i11, "newCount");
        int iJ = this.f11656c.j(obj);
        if (iJ == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                this.f11656c.r(obj, i11);
                this.f11657d += i11;
            }
            return true;
        }
        if (this.f11656c.h(iJ) != i10) {
            return false;
        }
        if (i11 == 0) {
            this.f11656c.u(iJ);
            this.f11657d -= i10;
        } else {
            this.f11656c.y(iJ, i11);
            this.f11657d += i11 - i10;
        }
        return true;
    }

    @Override // com.google.common.collect.e0
    public final int r(Object obj) {
        return this.f11656c.c(obj);
    }

    public void s(e0 e0Var) {
        com.google.common.base.g.m(e0Var);
        int iB = this.f11656c.b();
        while (iB >= 0) {
            e0Var.n(this.f11656c.f(iB), this.f11656c.h(iB));
            iB = this.f11656c.p(iB);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public final int size() {
        return com.google.common.primitives.c.d(this.f11657d);
    }

    public abstract h0 u(int i10);
}
