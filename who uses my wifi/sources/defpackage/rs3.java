package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rs3 extends sr3 {
    public final us3 j;
    public final yf3 k;
    public final v34 l;
    public final Integer m;

    public rs3(us3 us3Var, yf3 yf3Var, v34 v34Var, Integer num) {
        this.j = us3Var;
        this.k = yf3Var;
        this.l = v34Var;
        this.m = num;
    }

    public static rs3 s0(ts3 ts3Var, yf3 yf3Var, Integer num) throws GeneralSecurityException {
        v34 v34VarB;
        String str = ts3Var.g;
        v34 v34Var = (v34) yf3Var.f;
        ts3 ts3Var2 = ts3.j;
        if (ts3Var != ts3Var2 && num == null) {
            throw new GeneralSecurityException(ex0.l(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ts3Var == ts3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (v34Var.a.length != 32) {
            int length = v34Var.a.length;
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(length).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        us3 us3Var = new us3(ts3Var);
        if (ts3Var == ts3Var2) {
            v34VarB = sv3.a;
        } else if (ts3Var == ts3.i) {
            v34VarB = sv3.a(num.intValue());
        } else {
            if (ts3Var != ts3.h) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            v34VarB = sv3.b(num.intValue());
        }
        return new rs3(us3Var, yf3Var, v34VarB, num);
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
