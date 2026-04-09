package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class GJ implements InterfaceC1199gE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f8348g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f8349h = {0};
    public static final Vu i;

    /* renamed from: j, reason: collision with root package name */
    public static final Vu f8350j;

    /* renamed from: k, reason: collision with root package name */
    public static final Vu f8351k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f8352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8353b;

    /* renamed from: c, reason: collision with root package name */
    public final VJ f8354c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8355d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8356e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f8357f;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C1952uE c1952uE = C1952uE.f17090m;
        EnumC0932bK enumC0932bK = EnumC0932bK.f13344a;
        map.put(enumC0932bK, c1952uE);
        map2.put(c1952uE, enumC0932bK);
        C1952uE c1952uE2 = C1952uE.f17091n;
        EnumC0932bK enumC0932bK2 = EnumC0932bK.f13345b;
        map.put(enumC0932bK2, c1952uE2);
        map2.put(c1952uE2, enumC0932bK2);
        C1952uE c1952uE3 = C1952uE.f17080C;
        EnumC0932bK enumC0932bK3 = EnumC0932bK.f13346c;
        map.put(enumC0932bK3, c1952uE3);
        map2.put(c1952uE3, enumC0932bK3);
        i = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        C2006vE c2006vE = C2006vE.f17244k;
        VJ vj = VJ.f11979a;
        map3.put(vj, c2006vE);
        map4.put(c2006vE, vj);
        C2006vE c2006vE2 = C2006vE.f17245l;
        VJ vj2 = VJ.f11980b;
        map3.put(vj2, c2006vE2);
        map4.put(c2006vE2, vj2);
        f8350j = new Vu(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        WI wi = WI.f12196c;
        UJ uj = UJ.f11636a;
        map5.put(uj, wi);
        map6.put(wi, uj);
        WI wi2 = WI.f12197d;
        UJ uj2 = UJ.f11637b;
        map5.put(uj2, wi2);
        map6.put(wi2, uj2);
        WI wi3 = WI.f12198e;
        UJ uj3 = UJ.f11638c;
        map5.put(uj3, wi3);
        map6.put(wi3, uj3);
        f8351k = new Vu(Collections.unmodifiableMap(map5), Collections.unmodifiableMap(map6));
    }

    public GJ(ECPublicKey eCPublicKey, EnumC0932bK enumC0932bK, VJ vj, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        Cr.u(enumC0932bK);
        this.f8353b = enumC0932bK.toString().concat("withECDSA");
        this.f8352a = eCPublicKey;
        this.f8354c = vj;
        this.f8355d = bArr;
        this.f8356e = bArr2;
        this.f8357f = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8355d;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!AbstractC2062wG.c(bArr3, bArr)) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GJ.b(byte[], byte[]):void");
    }
}
