package nk;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements Iterator, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final v f18453a;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f18454d;

    /* renamed from: g, reason: collision with root package name */
    public int f18455g;

    public z(v vVar, Object[] objArr, int i10) {
        this.f18453a = vVar;
        this.f18454d = objArr;
        this.f18455g = i10;
    }

    public final Object clone() {
        return new z(this.f18453a, this.f18454d, this.f18455g);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18455g < this.f18454d.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f18455g;
        this.f18455g = i10 + 1;
        return this.f18454d[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
