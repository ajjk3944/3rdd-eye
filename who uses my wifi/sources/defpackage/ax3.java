package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ax3 {
    static {
        int i = j04.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        ex3 ex3Var = ex3.a;
        pv3 pv3Var = pv3.b;
        pv3Var.b(ex3.a);
        pv3Var.a(ex3.b);
        pv3Var.b(tw3.a);
        int i = ww3.f;
        if (!yb.x(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        tb1 tb1Var = hx3.a;
        rv3 rv3Var = rv3.b;
        rv3Var.c(hx3.c);
        rv3Var.d(hx3.d);
        rv3Var.a(hx3.e);
        rv3Var.b(hx3.f);
        pv3Var.a(ww3.a);
        pv3Var.a(ww3.b);
        ov3 ov3Var = ov3.b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", fx3.a);
        mc2 mc2Var = new mc2(25);
        mc2Var.i(32);
        mc2Var.o(16);
        yw3 yw3Var = yw3.e;
        mc2Var.j = yw3Var;
        xw3 xw3Var = xw3.d;
        mc2Var.i = xw3Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", mc2Var.A());
        mc2 mc2Var2 = new mc2(25);
        mc2Var2.i(32);
        mc2Var2.o(32);
        yw3 yw3Var2 = yw3.b;
        mc2Var2.j = yw3Var2;
        mc2Var2.i = xw3Var;
        map.put("HMAC_SHA256_256BITTAG", mc2Var2.A());
        mc2 mc2Var3 = new mc2(25);
        mc2Var3.i(32);
        mc2Var3.o(32);
        mc2Var3.j = yw3Var;
        mc2Var3.i = xw3Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", mc2Var3.A());
        mc2 mc2Var4 = new mc2(25);
        mc2Var4.i(64);
        mc2Var4.o(16);
        mc2Var4.j = yw3Var2;
        xw3 xw3Var2 = xw3.f;
        mc2Var4.i = xw3Var2;
        map.put("HMAC_SHA512_128BITTAG", mc2Var4.A());
        mc2 mc2Var5 = new mc2(25);
        mc2Var5.i(64);
        mc2Var5.o(16);
        mc2Var5.j = yw3Var;
        mc2Var5.i = xw3Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", mc2Var5.A());
        mc2 mc2Var6 = new mc2(25);
        mc2Var6.i(64);
        mc2Var6.o(32);
        mc2Var6.j = yw3Var2;
        mc2Var6.i = xw3Var2;
        map.put("HMAC_SHA512_256BITTAG", mc2Var6.A());
        mc2 mc2Var7 = new mc2(25);
        mc2Var7.i(64);
        mc2Var7.o(32);
        mc2Var7.j = yw3Var;
        mc2Var7.i = xw3Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", mc2Var7.A());
        map.put("HMAC_SHA512_512BITTAG", fx3.b);
        mc2 mc2Var8 = new mc2(25);
        mc2Var8.i(64);
        mc2Var8.o(64);
        mc2Var8.j = yw3Var;
        mc2Var8.i = xw3Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", mc2Var8.A());
        ov3Var.b(Collections.unmodifiableMap(map));
        jv3 jv3Var = jv3.b;
        jv3Var.a(ww3.e, zw3.class);
        lv3.b.a(ww3.d, zw3.class);
        vu3 vu3Var = vu3.d;
        vu3Var.c(ww3.c, i, true);
        if (mu3.a()) {
            return;
        }
        aw3 aw3Var = qw3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        rv3Var.c(gx3.a);
        rv3Var.d(gx3.b);
        rv3Var.a(gx3.c);
        rv3Var.b(gx3.d);
        jv3Var.a(yr3.l, rw3.class);
        pv3Var.a(qw3.a);
        pv3Var.a(qw3.b);
        HashMap map2 = new HashMap();
        rw3 rw3Var = fx3.c;
        map2.put("AES_CMAC", rw3Var);
        map2.put("AES256_CMAC", rw3Var);
        jr3 jr3Var = new jr3(3);
        jr3Var.b(32);
        jr3Var.g(16);
        jr3Var.i = gs3.n;
        map2.put("AES256_CMAC_RAW", jr3Var.l());
        ov3Var.b(Collections.unmodifiableMap(map2));
        vu3Var.a(qw3.c, true);
    }
}
