package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s24 implements or3 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final tb1 i;
    public static final tb1 j;
    public static final tb1 k;
    public final ECPublicKey a;
    public final String b;
    public final i34 c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ls3 ls3Var = ls3.f;
        p34 p34Var = p34.f;
        map.put(p34Var, ls3Var);
        map2.put(ls3Var, p34Var);
        ls3 ls3Var2 = ls3.g;
        p34 p34Var2 = p34.g;
        map.put(p34Var2, ls3Var2);
        map2.put(ls3Var2, p34Var2);
        ls3 ls3Var3 = ls3.h;
        p34 p34Var3 = p34.h;
        map.put(p34Var3, ls3Var3);
        map2.put(ls3Var3, p34Var3);
        i = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ps3 ps3Var = ps3.k;
        i34 i34Var = i34.f;
        map3.put(i34Var, ps3Var);
        map4.put(ps3Var, i34Var);
        ps3 ps3Var2 = ps3.l;
        i34 i34Var2 = i34.g;
        map3.put(i34Var2, ps3Var2);
        map4.put(ps3Var2, i34Var2);
        j = new tb1(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        j14 j14Var = j14.c;
        h34 h34Var = h34.f;
        map5.put(h34Var, j14Var);
        map6.put(j14Var, h34Var);
        j14 j14Var2 = j14.d;
        h34 h34Var2 = h34.g;
        map5.put(h34Var2, j14Var2);
        map6.put(j14Var2, h34Var2);
        j14 j14Var3 = j14.e;
        h34 h34Var3 = h34.h;
        map5.put(h34Var3, j14Var3);
        map6.put(j14Var3, h34Var3);
        k = new tb1(Collections.unmodifiableMap(map5), Collections.unmodifiableMap(map6));
    }

    public s24(ECPublicKey eCPublicKey, p34 p34Var, i34 i34Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!yb.x(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        bd2.L(p34Var);
        this.b = p34Var.toString().concat("withECDSA");
        this.a = eCPublicKey;
        this.c = i34Var;
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r18, byte[] r19) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s24.a(byte[], byte[]):void");
    }

    @Override // defpackage.or3
    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        if (length == 0) {
            a(bArr, bArr2);
        } else {
            if (!ow3.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
