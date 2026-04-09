package bt;

import androidx.lifecycle.o;
import br.l;
import ht.x;
import qs.g;
import rr.f;
import rr.m;

/* loaded from: classes.dex */
public final class a extends o implements d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2946g = 1;

    /* renamed from: r, reason: collision with root package name */
    public final g f2947r;

    /* renamed from: x, reason: collision with root package name */
    public final m f2948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(rr.b bVar, x xVar, g gVar) {
        super(xVar);
        l.e(xVar, "receiverType");
        this.f2948x = (ur.o) bVar;
        this.f2947r = gVar;
    }

    public final g t1() {
        switch (this.f2946g) {
        }
        return this.f2947r;
    }

    @Override // androidx.lifecycle.o
    public final String toString() {
        switch (this.f2946g) {
            case 0:
                return getType() + ": Ctx { " + ((f) this.f2948x) + " }";
            default:
                return "Cxt { " + ((ur.o) this.f2948x) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, x xVar, g gVar) {
        super(xVar);
        l.e(xVar, "receiverType");
        this.f2948x = fVar;
        this.f2947r = gVar;
    }
}
