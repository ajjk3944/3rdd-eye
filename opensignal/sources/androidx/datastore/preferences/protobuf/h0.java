package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class h0 {
    public static b0 a(Object obj, long j) {
        b0 b0Var = (b0) q1.f1339c.h(obj, j);
        if (((b) b0Var).f1247a) {
            return b0Var;
        }
        b1 b1Var = (b1) b0Var;
        int i10 = b1Var.f1250g;
        b1 b1VarC = b1Var.c(i10 == 0 ? 10 : i10 * 2);
        q1.o(obj, j, b1VarC);
        return b1VarC;
    }
}
