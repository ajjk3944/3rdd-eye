package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.dK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041dK implements InterfaceC1035dE {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13752e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final TG f13753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13754b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13755c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13756d;

    public C1041dK(C2116xG c2116xG) {
        this.f13753a = C1476lN.s(RG.W(SG.b(c2116xG.f17565c.f17850a), c2116xG.f17566d));
        C2224zG c2224zG = c2116xG.f17565c;
        this.f13754b = c2224zG.f17851b;
        this.f13755c = c2116xG.f17567e.b();
        if (c2224zG.f17852c.equals(YD.f12604E)) {
            this.f13756d = Arrays.copyOf(f13752e, 1);
        } else {
            this.f13756d = new byte[0];
        }
    }

    public C1041dK(DG dg) {
        String strValueOf = String.valueOf(dg.f7741c.f8885d);
        this.f13753a = new C1728q5("HMAC".concat(strValueOf), new SecretKeySpec(((C1313iK) dg.f7742d.f15314b).b(), "HMAC"));
        HG hg = dg.f7741c;
        this.f13754b = hg.f8883b;
        this.f13755c = dg.f7743e.b();
        if (hg.f8884c.equals(GG.f8345d)) {
            this.f13756d = Arrays.copyOf(f13752e, 1);
        } else {
            this.f13756d = new byte[0];
        }
    }

    public C1041dK(C1728q5 c1728q5, int i) throws IllegalStateException, InvalidAlgorithmParameterException {
        this.f13753a = c1728q5;
        this.f13754b = i;
        this.f13755c = new byte[0];
        this.f13756d = new byte[0];
        c1728q5.j(i, new byte[0]);
    }
}
