package z0;

import java.util.NoSuchElementException;
import v1.e0;
import x.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f37800d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37801e;

    public a(e0 e0Var, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f37800d = e0Var;
        this.f37801e = obj2;
    }

    @Override // x.q, java.util.Map.Entry
    public final Object getValue() {
        return this.f37801e;
    }

    @Override // x.q, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f37801e;
        this.f37801e = obj;
        e eVar = (e) this.f37800d.f35664b;
        d dVar = eVar.f37814d;
        Object obj3 = this.f36932b;
        if (!dVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z3 = eVar.f37807c;
        if (!z3) {
            dVar.put(obj3, obj);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            k kVar = eVar.f37805a[eVar.f37806b];
            Object obj4 = kVar.f37826a[kVar.f37828c];
            dVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, dVar.f37810c, obj4, 0);
        }
        eVar.g = dVar.f37812e;
        return obj2;
    }
}
