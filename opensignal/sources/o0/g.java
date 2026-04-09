package o0;

import java.util.List;
import n0.v1;

/* loaded from: classes.dex */
public final class g extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final g f18704d = new g(0, 2, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        int i10 = ((v0.e) lVar.g(0)).f23741a;
        List list = (List) lVar.g(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            cVar.d(i12, obj);
            cVar.p(i12, obj);
        }
    }
}
