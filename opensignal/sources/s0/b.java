package s0;

import java.util.NoSuchElementException;
import m1.d0;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: r, reason: collision with root package name */
    public final d0 f21823r;

    /* renamed from: x, reason: collision with root package name */
    public Object f21824x;

    public b(d0 d0Var, Object obj, Object obj2) {
        super(obj, 0, obj2);
        this.f21823r = d0Var;
        this.f21824x = obj2;
    }

    @Override // s0.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f21824x;
    }

    @Override // s0.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f21824x;
        this.f21824x = obj;
        e eVar = (e) this.f21823r.f16168d;
        v0.g gVar = eVar.f21831r;
        Object obj3 = this.f21821d;
        if (!gVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = eVar.f21830g;
        if (!z10) {
            gVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = eVar.f21828a[eVar.f21829d];
            Object obj4 = lVar.f21845a[lVar.f21847g];
            gVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, gVar.f23743d, obj4, 0);
        }
        eVar.B = gVar.f23745r;
        return obj2;
    }
}
