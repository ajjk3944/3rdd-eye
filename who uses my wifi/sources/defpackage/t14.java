package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t14 extends p24 {
    public final q14 j;
    public final v34 k;
    public final v34 l;
    public final Integer m;

    public t14(q14 q14Var, v34 v34Var, v34 v34Var2, Integer num) {
        this.j = q14Var;
        this.k = v34Var;
        this.l = v34Var2;
        this.m = num;
    }

    public static t14 s0(p14 p14Var, v34 v34Var, Integer num) throws GeneralSecurityException {
        v34 v34VarA;
        String str = p14Var.a;
        byte[] bArr = v34Var.a;
        q14 q14Var = new q14(p14Var);
        p14 p14Var2 = p14.e;
        if (!p14Var.equals(p14Var2) && num == null) {
            throw new GeneralSecurityException(ex0.l(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (p14Var.equals(p14Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (p14Var == p14Var2) {
            v34VarA = sv3.a;
        } else if (p14Var == p14.c || p14Var == p14.d) {
            v34VarA = sv3.a(num.intValue());
        } else {
            if (p14Var != p14.b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            v34VarA = sv3.b(num.intValue());
        }
        return new t14(q14Var, v34Var, v34VarA, num);
    }

    @Override // defpackage.gi2
    public final /* synthetic */ mr3 D() {
        return this.j;
    }

    @Override // defpackage.p24
    public final v34 r0() {
        return this.l;
    }
}
