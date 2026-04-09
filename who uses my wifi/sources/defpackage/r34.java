package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r34 implements lr3 {
    public static final byte[] e = {0};
    public final kx3 a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public r34(pw3 pw3Var) {
        this.a = pu1.x(ix3.r0(jx3.b(pw3Var.j.a), pw3Var.k));
        rw3 rw3Var = pw3Var.j;
        this.b = rw3Var.b;
        this.c = pw3Var.l.b();
        if (rw3Var.c.equals(gs3.m)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public r34(uw3 uw3Var) {
        String strValueOf = String.valueOf(uw3Var.j.d);
        this.a = new r2("HMAC".concat(strValueOf), new SecretKeySpec(((v34) uw3Var.k.f).b(), "HMAC"));
        zw3 zw3Var = uw3Var.j;
        this.b = zw3Var.b;
        this.c = uw3Var.l.b();
        if (zw3Var.c.equals(yw3.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public r34(r2 r2Var, int i) throws IllegalStateException, InvalidAlgorithmParameterException {
        this.a = r2Var;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        r2Var.b(i, new byte[0]);
    }
}
