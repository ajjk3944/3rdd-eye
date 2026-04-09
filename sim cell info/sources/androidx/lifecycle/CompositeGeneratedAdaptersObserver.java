package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f1787a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f1787a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void g(g gVar, d.a aVar) {
        k kVar = new k();
        for (c cVar : this.f1787a) {
            cVar.a(gVar, aVar, false, kVar);
        }
        for (c cVar2 : this.f1787a) {
            cVar2.a(gVar, aVar, true, kVar);
        }
    }
}
