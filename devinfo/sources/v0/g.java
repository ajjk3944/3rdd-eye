package v0;

import java.util.List;
import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f35575c = new g(0, 2, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        int i4 = ((c1.i) kVar.j(0)).f2562a;
        List list = (List) kVar.j(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i4 + i10;
            cVar.c(i11, obj);
            cVar.l(i11, obj);
        }
    }
}
