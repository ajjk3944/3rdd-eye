package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f23049a;

    /* renamed from: d, reason: collision with root package name */
    public int f23050d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23051g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f23052r;

    public c(e eVar) {
        this.f23052r = eVar;
        this.f23049a = eVar.f23077g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f23051g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f23050d;
        e eVar = this.f23052r;
        return br.l.a(key, eVar.f(i10)) && br.l.a(entry.getValue(), eVar.i(this.f23050d));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f23051g) {
            return this.f23052r.f(this.f23050d);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f23051g) {
            return this.f23052r.i(this.f23050d);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23050d < this.f23049a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f23051g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f23050d;
        e eVar = this.f23052r;
        Object objF = eVar.f(i10);
        Object objI = eVar.i(this.f23050d);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23050d++;
        this.f23051g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23051g) {
            throw new IllegalStateException();
        }
        this.f23052r.g(this.f23050d);
        this.f23050d--;
        this.f23049a--;
        this.f23051g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f23051g) {
            return this.f23052r.h(this.f23050d, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
