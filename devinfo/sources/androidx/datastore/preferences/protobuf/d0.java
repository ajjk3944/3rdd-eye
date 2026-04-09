package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 {
    public static x a(Object obj, long j) {
        x xVar = (x) k1.f1006c.h(obj, j);
        if (((b) xVar).f936a) {
            return xVar;
        }
        v0 v0Var = (v0) xVar;
        int i4 = v0Var.f1076c;
        v0 v0VarD = v0Var.d(i4 == 0 ? 10 : i4 * 2);
        k1.o(obj, j, v0VarD);
        return v0VarD;
    }
}
