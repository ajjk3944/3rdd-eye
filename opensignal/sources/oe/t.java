package oe;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f19375a;

    /* renamed from: d, reason: collision with root package name */
    public int f19376d;

    /* renamed from: g, reason: collision with root package name */
    public int f19377g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f19378r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f19379x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f19380y;

    public t(w wVar, int i10) {
        this.f19379x = i10;
        this.f19380y = wVar;
        this.f19378r = wVar;
        this.f19375a = wVar.f19394x;
        this.f19376d = wVar.isEmpty() ? -1 : 0;
        this.f19377g = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19376d >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object vVar;
        w wVar = this.f19378r;
        if (wVar.f19394x != this.f19375a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19376d;
        this.f19377g = i10;
        switch (this.f19379x) {
            case 0:
                vVar = this.f19380y.j()[i10];
                break;
            case 1:
                vVar = new v(this.f19380y, i10);
                break;
            default:
                vVar = this.f19380y.k()[i10];
                break;
        }
        int i11 = this.f19376d + 1;
        if (i11 >= wVar.f19395y) {
            i11 = -1;
        }
        this.f19376d = i11;
        return vVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        w wVar = this.f19378r;
        if (wVar.f19394x != this.f19375a) {
            throw new ConcurrentModificationException();
        }
        ba.m.n("no calls to next() since the last call to remove()", this.f19377g >= 0);
        this.f19375a += 32;
        wVar.remove(wVar.j()[this.f19377g]);
        this.f19376d--;
        this.f19377g = -1;
    }
}
