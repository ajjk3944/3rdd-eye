package mi;

/* loaded from: classes.dex */
public final class n {
    public static o a(String str) {
        br.l.e(str, "name");
        for (o oVar : o.values()) {
            if (br.l.a(oVar.name(), str)) {
                return oVar;
            }
        }
        return null;
    }
}
