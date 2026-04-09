package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tk1 implements u91 {
    public static final byte[] g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f16860h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final rt f16861i;
    public static final rt j;

    /* renamed from: k, reason: collision with root package name */
    public static final rt f16862k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f16863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16864b;

    /* renamed from: c, reason: collision with root package name */
    public final jl1 f16865c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16866d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16867e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f16868f;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ja1 ja1Var = ja1.f12703o;
        ol1 ol1Var = ol1.f14731a;
        map.put(ol1Var, ja1Var);
        map2.put(ja1Var, ol1Var);
        ja1 ja1Var2 = ja1.f12704p;
        ol1 ol1Var2 = ol1.f14732b;
        map.put(ol1Var2, ja1Var2);
        map2.put(ja1Var2, ol1Var2);
        ja1 ja1Var3 = ja1.f12705q;
        ol1 ol1Var3 = ol1.f14733c;
        map.put(ol1Var3, ja1Var3);
        map2.put(ja1Var3, ol1Var3);
        f16861i = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ka1 ka1Var = ka1.f13110r;
        jl1 jl1Var = jl1.f12781a;
        map3.put(jl1Var, ka1Var);
        map4.put(ka1Var, jl1Var);
        ka1 ka1Var2 = ka1.f13111s;
        jl1 jl1Var2 = jl1.f12782b;
        map3.put(jl1Var2, ka1Var2);
        map4.put(ka1Var2, jl1Var2);
        j = new rt(26, DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        kj1 kj1Var = kj1.f13172c;
        il1 il1Var = il1.f12372a;
        map5.put(il1Var, kj1Var);
        map6.put(kj1Var, il1Var);
        kj1 kj1Var2 = kj1.f13173d;
        il1 il1Var2 = il1.f12373b;
        map5.put(il1Var2, kj1Var2);
        map6.put(kj1Var2, il1Var2);
        kj1 kj1Var3 = kj1.f13174e;
        il1 il1Var3 = il1.f12374c;
        map5.put(il1Var3, kj1Var3);
        map6.put(kj1Var3, il1Var3);
        f16862k = new rt(26, DesugarCollections.unmodifiableMap(map5), DesugarCollections.unmodifiableMap(map6));
    }

    public tk1(ECPublicKey eCPublicKey, ol1 ol1Var, jl1 jl1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        al0.y(ol1Var);
        this.f16864b = ol1Var.toString().concat("withECDSA");
        this.f16863a = eCPublicKey;
        this.f16865c = jl1Var;
        this.f16866d = bArr;
        this.f16867e = bArr2;
        this.f16868f = provider;
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f16866d;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!je1.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r18, byte[] r19) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tk1.b(byte[], byte[]):void");
    }
}
