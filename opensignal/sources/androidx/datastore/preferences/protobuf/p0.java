package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class p0 {
    public static o0 a(Object obj, Object obj2) {
        o0 o0VarB = (o0) obj;
        o0 o0Var = (o0) obj2;
        if (!o0Var.isEmpty()) {
            if (!o0VarB.f1331a) {
                o0VarB = o0VarB.b();
            }
            o0VarB.a();
            if (!o0Var.isEmpty()) {
                o0VarB.putAll(o0Var);
            }
        }
        return o0VarB;
    }
}
