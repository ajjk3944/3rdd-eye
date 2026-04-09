package jj;

/* loaded from: classes.dex */
public final class n0 {
    public static o0 a(String str) throws CloneNotSupportedException {
        br.l.e(str, "name");
        for (o0 o0Var : o0.values()) {
            if (br.l.a(o0Var.name(), str)) {
                return o0Var;
            }
        }
        return null;
    }
}
