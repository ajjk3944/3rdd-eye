package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ys3 extends sr3 {
    public final at3 j;
    public final v34 k;
    public final Integer l;

    public ys3(at3 at3Var, v34 v34Var, Integer num) {
        this.j = at3Var;
        this.k = v34Var;
        this.l = num;
    }

    public static ys3 s0(at3 at3Var, Integer num) throws GeneralSecurityException {
        v34 v34VarA;
        zs3 zs3Var = at3Var.b;
        if (zs3Var == zs3.c) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            v34VarA = v34.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zs3Var != zs3.d) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zs3Var.b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            v34VarA = v34.a(new byte[0]);
        }
        return new ys3(at3Var, v34VarA, num);
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
