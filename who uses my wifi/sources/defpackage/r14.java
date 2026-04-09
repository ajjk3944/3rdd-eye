package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r14 extends o24 {
    public final t14 j;
    public final yf3 k;

    public r14(t14 t14Var, yf3 yf3Var) {
        this.j = t14Var;
        this.k = yf3Var;
    }

    public static r14 r0(t14 t14Var, yf3 yf3Var) throws GeneralSecurityException {
        v34 v34Var = (v34) yf3Var.f;
        if (v34Var.a.length != 32) {
            int length = v34Var.a.length;
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (Arrays.equals(t14Var.k.b(), ou1.L(ou1.O(v34Var.b())))) {
            return new r14(t14Var, yf3Var);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // defpackage.gi2
    public final mr3 D() {
        return this.j.j;
    }
}
