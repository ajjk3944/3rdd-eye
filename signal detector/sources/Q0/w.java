package q0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u.AbstractC2939h;
import u.C2941j;

/* loaded from: classes.dex */
public final class w implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f23044a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f23046c;

    public w(x xVar) {
        this.f23046c = xVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23044a + 1 < this.f23046c.f23048k.g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23045b = true;
        C2941j c2941j = this.f23046c.f23048k;
        int i = this.f23044a + 1;
        this.f23044a = i;
        Object objH = c2941j.h(i);
        q5.i.d(objH, "nodes.valueAt(++index)");
        return (v) objH;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23045b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C2941j c2941j = this.f23046c.f23048k;
        ((v) c2941j.h(this.f23044a)).f23037b = null;
        int i = this.f23044a;
        Object[] objArr = c2941j.f23708c;
        Object obj = objArr[i];
        Object obj2 = AbstractC2939h.f23702b;
        if (obj != obj2) {
            objArr[i] = obj2;
            c2941j.f23706a = true;
        }
        this.f23044a = i - 1;
        this.f23045b = false;
    }
}
