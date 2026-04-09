package nq;

import br.l;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f18502a;

    /* renamed from: d, reason: collision with root package name */
    public final int f18503d;

    /* renamed from: g, reason: collision with root package name */
    public final int f18504g;

    public e(f fVar, int i10) {
        l.e(fVar, "map");
        this.f18502a = fVar;
        this.f18503d = i10;
        this.f18504g = fVar.D;
    }

    public final void a() {
        if (this.f18502a.D != this.f18504g) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f18502a.f18505a[this.f18503d];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f18502a.f18506d;
        l.b(objArr);
        return objArr[this.f18503d];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f18502a;
        fVar.c();
        Object[] objArr = fVar.f18506d;
        if (objArr == null) {
            int length = fVar.f18505a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f18506d = objArr;
        }
        int i10 = this.f18503d;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
