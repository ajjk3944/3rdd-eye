package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ix3 extends gi2 {
    public final jx3 j;
    public final yf3 k;

    public ix3(jx3 jx3Var, yf3 yf3Var) {
        this.j = jx3Var;
        this.k = yf3Var;
    }

    public static ix3 r0(jx3 jx3Var, yf3 yf3Var) throws GeneralSecurityException {
        if (jx3Var.a == ((v34) yf3Var.f).a.length) {
            return new ix3(jx3Var, yf3Var);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // defpackage.gi2
    public final /* synthetic */ mr3 D() {
        return this.j;
    }
}
