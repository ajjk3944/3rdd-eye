package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;
import p.AbstractC7176d;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7017h implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private int f54969a;

    /* renamed from: b, reason: collision with root package name */
    private int f54970b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54971c;

    public AbstractC7017h(int i10) {
        this.f54969a = i10;
    }

    protected abstract Object d(int i10);

    protected abstract void e(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54970b < this.f54969a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = d(this.f54970b);
        this.f54970b++;
        this.f54971c = true;
        return objD;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f54971c) {
            AbstractC7176d.b("Call next() before removing an element.");
        }
        int i10 = this.f54970b - 1;
        this.f54970b = i10;
        e(i10);
        this.f54969a--;
        this.f54971c = false;
    }
}
