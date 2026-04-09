package ku;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final gu.a f14584a;

    public n(gu.a aVar) {
        this.f14584a = aVar;
    }

    @Override // ku.a
    public void f(ju.a aVar, int i10, Object obj) {
        i(obj, i10, aVar.m(getDescriptor(), i10, this.f14584a, null));
    }

    public abstract void i(Object obj, int i10, Object obj2);

    @Override // gu.a
    public void serialize(ju.d dVar, Object obj) {
        int iD = d(obj);
        iu.e descriptor = getDescriptor();
        br.l.e(descriptor, "descriptor");
        ju.b bVarB = ((mu.y) dVar).b(descriptor);
        Iterator itC = c(obj);
        for (int i10 = 0; i10 < iD; i10++) {
            ((mu.y) bVarB).w(getDescriptor(), i10, this.f14584a, itC.next());
        }
        bVarB.c(descriptor);
    }
}
