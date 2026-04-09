package androidx.compose.runtime.snapshots;

import d0.AbstractC5276h;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
final class m implements ListIterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final k f28705a;

    /* renamed from: b, reason: collision with root package name */
    private int f28706b;

    /* renamed from: c, reason: collision with root package name */
    private int f28707c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f28708d;

    public m(k kVar, int i10) {
        this.f28705a = kVar;
        this.f28706b = i10 - 1;
        this.f28708d = kVar.f();
    }

    private final void d() {
        if (this.f28705a.f() != this.f28708d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        d();
        this.f28705a.add(this.f28706b + 1, obj);
        this.f28707c = -1;
        this.f28706b++;
        this.f28708d = this.f28705a.f();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f28706b < this.f28705a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f28706b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        d();
        int i10 = this.f28706b + 1;
        this.f28707c = i10;
        AbstractC5276h.g(i10, this.f28705a.size());
        Object obj = this.f28705a.get(i10);
        this.f28706b = i10;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f28706b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        AbstractC5276h.g(this.f28706b, this.f28705a.size());
        int i10 = this.f28706b;
        this.f28707c = i10;
        this.f28706b--;
        return this.f28705a.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f28706b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        d();
        this.f28705a.remove(this.f28706b);
        this.f28706b--;
        this.f28707c = -1;
        this.f28708d = this.f28705a.f();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        d();
        int i10 = this.f28707c;
        if (i10 < 0) {
            AbstractC5276h.e();
            throw new KotlinNothingValueException();
        }
        this.f28705a.set(i10, obj);
        this.f28708d = this.f28705a.f();
    }
}
