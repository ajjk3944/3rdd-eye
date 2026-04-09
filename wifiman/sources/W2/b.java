package W2;

import o.C7010a;
import o.V;

/* loaded from: classes.dex */
public final class b extends C7010a {

    /* renamed from: g, reason: collision with root package name */
    private int f23578g;

    @Override // o.V, java.util.Map
    public void clear() {
        this.f23578g = 0;
        super.clear();
    }

    @Override // o.V, java.util.Map
    public int hashCode() {
        if (this.f23578g == 0) {
            this.f23578g = super.hashCode();
        }
        return this.f23578g;
    }

    @Override // o.V
    public void i(V v10) {
        this.f23578g = 0;
        super.i(v10);
    }

    @Override // o.V
    public Object j(int i10) {
        this.f23578g = 0;
        return super.j(i10);
    }

    @Override // o.V
    public Object k(int i10, Object obj) {
        this.f23578g = 0;
        return super.k(i10, obj);
    }

    @Override // o.V, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f23578g = 0;
        return super.put(obj, obj2);
    }
}
