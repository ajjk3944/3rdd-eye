package ft;

import java.util.Collection;

/* loaded from: classes.dex */
public final class e extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9077d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f9078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i10) {
        super(0);
        this.f9077d = i10;
        this.f9078g = gVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f9077d) {
            case 0:
                at.f fVar = at.f.f2280m;
                at.n.f2304a.getClass();
                return this.f9078g.i(fVar, at.k.f2297g, zr.d.WHEN_GET_ALL_DESCRIPTORS);
            default:
                g gVar = this.f9078g;
                jt.f fVar2 = gVar.f9081g;
                i iVar = gVar.j;
                fVar2.getClass();
                br.l.e(iVar, "classDescriptor");
                Collection collectionQ = ((ht.h) iVar.v()).q();
                br.l.d(collectionQ, "classDescriptor.typeConstructor.supertypes");
                return collectionQ;
        }
    }
}
