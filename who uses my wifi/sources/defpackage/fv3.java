package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fv3 extends gi2 {
    public final fw3 j;

    public fv3(fw3 fw3Var) {
        int i = dv3.b[ex0.s(fw3Var.f)];
        this.j = fw3Var;
    }

    @Override // defpackage.gi2
    public final mr3 D() {
        fw3 fw3Var = this.j;
        return new ev3((String) fw3Var.g, (i04) fw3Var.j);
    }

    public final v34 r0() throws GeneralSecurityException {
        fw3 fw3Var = this.j;
        i04 i04Var = (i04) fw3Var.j;
        Integer num = (Integer) fw3Var.k;
        i04 i04Var2 = (i04) fw3Var.j;
        if (i04Var.equals(i04.RAW)) {
            return v34.a(new byte[0]);
        }
        if (i04Var2.equals(i04.TINK)) {
            return sv3.b(num.intValue());
        }
        if (i04Var2.equals(i04.LEGACY) || i04Var2.equals(i04.CRUNCHY)) {
            return sv3.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
