package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2934c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f23686a;

    /* renamed from: b, reason: collision with root package name */
    public int f23687b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2936e f23689d;

    public C2934c(C2936e c2936e) {
        this.f23689d = c2936e;
        this.f23686a = c2936e.f23705c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f23688c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f23687b;
        C2936e c2936e = this.f23689d;
        return q5.i.a(key, c2936e.f(i)) && q5.i.a(entry.getValue(), c2936e.j(this.f23687b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f23688c) {
            return this.f23689d.f(this.f23687b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f23688c) {
            return this.f23689d.j(this.f23687b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23687b < this.f23686a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f23688c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f23687b;
        C2936e c2936e = this.f23689d;
        Object objF = c2936e.f(i);
        Object objJ = c2936e.j(this.f23687b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23687b++;
        this.f23688c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23688c) {
            throw new IllegalStateException();
        }
        this.f23689d.h(this.f23687b);
        this.f23687b--;
        this.f23686a--;
        this.f23688c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f23688c) {
            return this.f23689d.i(this.f23687b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
