package lr;

/* loaded from: classes.dex */
public enum b0 {
    DECLARED,
    INHERITED;

    public final boolean accept(rr.d dVar) {
        br.l.e(dVar, "member");
        return dVar.f().isReal() == (this == DECLARED);
    }
}
