package ei;

import d8.u;
import d8.v;
import nk.k;
import s8.d;
import x7.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23486a;

    public /* synthetic */ b(int i4) {
        this.f23486a = i4;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, h hVar) {
        switch (this.f23486a) {
            case 0:
                c cVar = (c) obj;
                k.e(cVar, "model");
                k.e(hVar, "options");
                return new u(new d(cVar.f23487a), new a(cVar, i4, i10));
            default:
                kg.d dVar = (kg.d) obj;
                k.e(dVar, "model");
                k.e(hVar, "options");
                return new u(new d(dVar), new d8.d(dVar));
        }
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        switch (this.f23486a) {
            case 0:
                k.e((c) obj, "model");
                break;
            default:
                k.e((kg.d) obj, "model");
                break;
        }
        return true;
    }
}
