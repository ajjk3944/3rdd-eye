package H;

import L0.S;

/* loaded from: classes.dex */
public abstract class i {
    public static final CharSequence a(h hVar) {
        return hVar.subSequence(S.l(hVar.f()), S.k(hVar.f()));
    }

    public static final CharSequence b(h hVar, int i10) {
        return hVar.subSequence(S.k(hVar.f()), Math.min(S.k(hVar.f()) + i10, hVar.length()));
    }

    public static final CharSequence c(h hVar, int i10) {
        return hVar.subSequence(Math.max(0, S.l(hVar.f()) - i10), S.l(hVar.f()));
    }
}
