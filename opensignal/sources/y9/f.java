package y9;

/* loaded from: classes.dex */
public final class f extends Exception {
    public f(e eVar) {
        String strValueOf = String.valueOf(eVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
        sb2.append("Unhandled format: ");
        sb2.append(strValueOf);
        super(sb2.toString());
    }
}
