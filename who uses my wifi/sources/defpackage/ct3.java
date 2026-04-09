package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ct3 extends sr3 {
    public final dt3 j;
    public final v34 k;
    public final Integer l;

    public ct3(dt3 dt3Var, v34 v34Var, Integer num) {
        this.j = dt3Var;
        this.k = v34Var;
        this.l = num;
    }

    public static ct3 s0(dt3 dt3Var, Integer num) throws GeneralSecurityException {
        v34 v34VarB;
        er3 er3Var = dt3Var.a;
        if (er3Var == er3.l) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            v34VarB = sv3.a;
        } else {
            if (er3Var != er3.k) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(er3Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            v34VarB = sv3.b(num.intValue());
        }
        return new ct3(dt3Var, v34VarB, num);
    }

    @Override // defpackage.gi2
    public final /* synthetic */ mr3 D() {
        return this.j;
    }

    @Override // defpackage.sr3
    public final v34 r0() {
        return this.k;
    }
}
