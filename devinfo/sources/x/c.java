package x;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f36856a;

    /* renamed from: b, reason: collision with root package name */
    public int f36857b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f36859d;

    public c(e eVar) {
        this.f36859d = eVar;
        this.f36856a = eVar.f36920c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f36858c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f36857b;
        e eVar = this.f36859d;
        return nk.k.a(key, eVar.f(i4)) && nk.k.a(entry.getValue(), eVar.j(this.f36857b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f36858c) {
            return this.f36859d.f(this.f36857b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f36858c) {
            return this.f36859d.j(this.f36857b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36857b < this.f36856a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f36858c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f36857b;
        e eVar = this.f36859d;
        Object objF = eVar.f(i4);
        Object objJ = eVar.j(this.f36857b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36857b++;
        this.f36858c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f36858c) {
            throw new IllegalStateException();
        }
        this.f36859d.h(this.f36857b);
        this.f36857b--;
        this.f36856a--;
        this.f36858c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f36858c) {
            return this.f36859d.i(this.f36857b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
