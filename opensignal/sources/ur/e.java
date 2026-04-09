package ur;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements ht.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft.u f23632a;

    public e(ft.u uVar) {
        this.f23632a = uVar;
    }

    @Override // ht.m0
    public final or.h n() {
        return xs.d.e(this.f23632a);
    }

    @Override // ht.m0
    public final List o() {
        List list = this.f23632a.M;
        if (list != null) {
            return list;
        }
        br.l.l("typeConstructorParameters");
        throw null;
    }

    @Override // ht.m0
    public final rr.i p() {
        return this.f23632a;
    }

    @Override // ht.m0
    public final Collection q() {
        Collection collectionQ = this.f23632a.x1().Z().q();
        br.l.d(collectionQ, "declarationDescriptor.un…pe.constructor.supertypes");
        return collectionQ;
    }

    @Override // ht.m0
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f23632a.getName().b() + ']';
    }
}
