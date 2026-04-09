package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class u31 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17052a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f17053b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17055d;

    public u31(v31 v31Var) {
        Objects.requireNonNull(v31Var);
        this.f17055d = v31Var;
        this.f17053b = v31Var.f17452c.entrySet().iterator();
    }

    public void a() {
        d41 d41Var = (d41) this.f17055d;
        d41Var.a();
        if (d41Var.f10320b != ((Collection) this.f17054c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17052a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f17053b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17052a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f17053b.next();
                this.f17054c = (Collection) entry.getValue();
                return ((v31) this.f17055d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f17053b.next();
                this.f17054c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f17053b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17052a) {
            case 0:
                mq0.d0("no calls to next() since the last call to remove()", ((Collection) this.f17054c) != null);
                this.f17053b.remove();
                ((v31) this.f17055d).f17453d.f14902e -= ((Collection) this.f17054c).size();
                ((Collection) this.f17054c).clear();
                this.f17054c = null;
                break;
            case 1:
                mq0.d0("no calls to next() since the last call to remove()", ((Map.Entry) this.f17054c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f17054c).getValue();
                this.f17053b.remove();
                ((w31) this.f17055d).f17856b.f14902e -= collection.size();
                collection.clear();
                this.f17054c = null;
                break;
            default:
                this.f17053b.remove();
                d41 d41Var = (d41) this.f17055d;
                p51 p51Var = d41Var.f10323e;
                p51Var.f14902e--;
                d41Var.c();
                break;
        }
    }

    public u31(w31 w31Var, Iterator it) {
        this.f17053b = it;
        this.f17055d = w31Var;
    }

    public u31(d41 d41Var) {
        Iterator it;
        this.f17055d = d41Var;
        Collection collection = d41Var.f10320b;
        this.f17054c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f17053b = it;
    }

    public u31(d41 d41Var, ListIterator listIterator) {
        this.f17055d = d41Var;
        this.f17054c = d41Var.f10320b;
        this.f17053b = listIterator;
    }
}
