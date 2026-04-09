package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pt3 extends sr3 {
    public final rt3 j;
    public final yf3 k;
    public final v34 l;
    public final Integer m;

    public pt3(rt3 rt3Var, yf3 yf3Var, v34 v34Var, Integer num) {
        this.j = rt3Var;
        this.k = yf3Var;
        this.l = v34Var;
        this.m = num;
    }

    public static pt3 s0(cs3 cs3Var, yf3 yf3Var, Integer num) throws GeneralSecurityException {
        v34 v34VarB;
        String str = cs3Var.g;
        v34 v34Var = (v34) yf3Var.f;
        cs3 cs3Var2 = cs3.m;
        if (cs3Var != cs3Var2 && num == null) {
            throw new GeneralSecurityException(ex0.l(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (cs3Var == cs3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (v34Var.a.length != 32) {
            int length = v34Var.a.length;
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(length).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        rt3 rt3Var = new rt3(cs3Var);
        if (cs3Var == cs3Var2) {
            v34VarB = sv3.a;
        } else if (cs3Var == cs3.l) {
            v34VarB = sv3.a(num.intValue());
        } else {
            if (cs3Var != cs3.k) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            v34VarB = sv3.b(num.intValue());
        }
        return new pt3(rt3Var, yf3Var, v34VarB, num);
    }

    @Override // defpackage.gi2
    public final /* synthetic */ mr3 D() {
        return this.j;
    }

    @Override // defpackage.sr3
    public final v34 r0() {
        return this.l;
    }
}
