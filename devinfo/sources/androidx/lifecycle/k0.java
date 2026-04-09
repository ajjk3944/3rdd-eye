package androidx.lifecycle;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k0 extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public final r.f f1158l = new r.f();

    @Override // androidx.lifecycle.l0
    public void f() {
        r.b bVar = (r.b) this.f1158l.iterator();
        if (bVar.hasNext()) {
            ((Map.Entry) bVar.next()).getValue().getClass();
            throw new ClassCastException();
        }
    }

    @Override // androidx.lifecycle.l0
    public void g() {
        r.b bVar = (r.b) this.f1158l.iterator();
        if (bVar.hasNext()) {
            ((Map.Entry) bVar.next()).getValue().getClass();
            throw new ClassCastException();
        }
    }
}
