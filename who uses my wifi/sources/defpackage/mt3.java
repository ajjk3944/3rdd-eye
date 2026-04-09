package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mt3 extends sr3 {
    public final ot3 j;
    public final yf3 k;
    public final v34 l;
    public final Integer m;

    public mt3(ot3 ot3Var, yf3 yf3Var, v34 v34Var, Integer num) {
        this.j = ot3Var;
        this.k = yf3Var;
        this.l = v34Var;
        this.m = num;
    }

    public static mt3 s0(ot3 ot3Var, yf3 yf3Var, Integer num) throws GeneralSecurityException {
        v34 v34VarB;
        v34 v34Var = (v34) yf3Var.f;
        bs3 bs3Var = ot3Var.a;
        String str = bs3Var.g;
        bs3 bs3Var2 = bs3.n;
        if (bs3Var != bs3Var2 && num == null) {
            throw new GeneralSecurityException(ex0.l(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (bs3Var == bs3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (v34Var.a.length != 32) {
            int length = v34Var.a.length;
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(length).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", length));
        }
        if (bs3Var == bs3Var2) {
            v34VarB = sv3.a;
        } else {
            if (bs3Var != bs3.m) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            v34VarB = sv3.b(num.intValue());
        }
        return new mt3(ot3Var, yf3Var, v34VarB, num);
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
