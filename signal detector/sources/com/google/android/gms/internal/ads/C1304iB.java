package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1304iB implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14676a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f14677b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14679d;

    public C1304iB(C1356jB c1356jB) {
        Objects.requireNonNull(c1356jB);
        this.f14679d = c1356jB;
        this.f14677b = c1356jB.f14914c.entrySet().iterator();
    }

    public void a() {
        C1787rB c1787rB = (C1787rB) this.f14679d;
        c1787rB.a();
        if (c1787rB.f16480b != ((Collection) this.f14678c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14676a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f14677b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14676a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f14677b.next();
                this.f14678c = (Collection) entry.getValue();
                return ((C1356jB) this.f14679d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f14677b.next();
                this.f14678c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f14677b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14676a) {
            case 0:
                AbstractC0582Jp.i0("no calls to next() since the last call to remove()", ((Collection) this.f14678c) != null);
                this.f14677b.remove();
                ((C1356jB) this.f14679d).f14915d.f13541e -= ((Collection) this.f14678c).size();
                ((Collection) this.f14678c).clear();
                this.f14678c = null;
                break;
            case 1:
                AbstractC0582Jp.i0("no calls to next() since the last call to remove()", ((Map.Entry) this.f14678c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f14678c).getValue();
                this.f14677b.remove();
                ((C1410kB) this.f14679d).f15070b.f13541e -= collection.size();
                collection.clear();
                this.f14678c = null;
                break;
            default:
                this.f14677b.remove();
                C1787rB c1787rB = (C1787rB) this.f14679d;
                C0978cC c0978cC = c1787rB.f16483e;
                c0978cC.f13541e--;
                c1787rB.b();
                break;
        }
    }

    public C1304iB(C1410kB c1410kB, Iterator it) {
        this.f14677b = it;
        this.f14679d = c1410kB;
    }

    public C1304iB(C1787rB c1787rB) {
        Iterator it;
        this.f14679d = c1787rB;
        Collection collection = c1787rB.f16480b;
        this.f14678c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f14677b = it;
    }

    public C1304iB(C1787rB c1787rB, ListIterator listIterator) {
        this.f14679d = c1787rB;
        this.f14678c = c1787rB.f16480b;
        this.f14677b = listIterator;
    }
}
