package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.sw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1879sw implements TG, InterfaceC0801Wn, InterfaceC0664Om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16822a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16823b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16824c;

    public /* synthetic */ C1879sw(int i, boolean z6) {
        this.f16822a = i;
    }

    public synchronized Map a() {
        try {
            if (((Map) this.f16824c) == null) {
                this.f16824c = Collections.unmodifiableMap(new HashMap((HashMap) this.f16823b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f16824c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f16822a) {
            case 9:
                ((CO) obj).h((BO) this.f16823b, (C1587nQ) this.f16824c);
                break;
            default:
                ((InterfaceC1964uQ) obj).p(0, ((C2233zP) this.f16823b).f17874a, (C1587nQ) this.f16824c);
                break;
        }
    }

    public void c(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f16824c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f16824c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, EnumC2059wD.f17407a, new IP());
        this.f16824c = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f16823b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void d(C1309iG c1309iG) throws GeneralSecurityException {
        if (c1309iG == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C1415kG c1415kG = new C1415kG(c1309iG.f14689a, c1309iG.f14690b);
        HashMap map = (HashMap) this.f16823b;
        if (!map.containsKey(c1415kG)) {
            map.put(c1415kG, c1309iG);
            return;
        }
        C1309iG c1309iG2 = (C1309iG) map.get(c1415kG);
        if (!c1309iG2.equals(c1309iG) || !c1309iG.equals(c1309iG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c1415kG.toString()));
        }
    }

    public void e(InterfaceC1577nG interfaceC1577nG) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f16824c;
        Class clsA = interfaceC1577nG.a();
        if (!map.containsKey(clsA)) {
            map.put(clsA, interfaceC1577nG);
            return;
        }
        InterfaceC1577nG interfaceC1577nG2 = (InterfaceC1577nG) map.get(clsA);
        if (!interfaceC1577nG2.equals(interfaceC1577nG) || !interfaceC1577nG.equals(interfaceC1577nG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsA.toString()));
        }
    }

    public void f(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f16823b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f16824c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.TG
    public byte[] j(int i, byte[] bArr) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = (Provider) this.f16824c;
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f16823b;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }

    public C1879sw(C2041vw c2041vw) {
        this.f16822a = 0;
        this.f16824c = c2041vw;
    }

    public /* synthetic */ C1879sw(Object obj, int i, Object obj2) {
        this.f16822a = i;
        this.f16823b = obj;
        this.f16824c = obj2;
    }

    public /* synthetic */ C1879sw(MediaCodec.CryptoInfo cryptoInfo) {
        this.f16822a = 7;
        this.f16823b = cryptoInfo;
        this.f16824c = AbstractC2067wL.g();
    }

    public C1879sw(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f16822a = 5;
        if (Cr.m(1)) {
            this.f16823b = new SecretKeySpec(bArr, "AES");
            this.f16824c = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    public C1879sw(int i) {
        this.f16822a = i;
        switch (i) {
            case 4:
                this.f16823b = new HashMap();
                this.f16824c = new HashMap();
                break;
            case 6:
                this.f16823b = new HashMap();
                break;
            case 12:
                this.f16823b = new HashSet();
                break;
            default:
                C1879sw c1879sw = AbstractC0933bL.f13349B;
                this.f16823b = new C2041vw((C2041vw) c1879sw.f16823b);
                this.f16824c = Arrays.copyOf((long[]) c1879sw.f16824c, 10);
                break;
        }
    }

    public C1879sw(Context context) {
        this.f16822a = 11;
        this.f16823b = context == null ? null : context.getApplicationContext();
    }

    public /* synthetic */ C1879sw(C1469lG c1469lG) {
        this.f16822a = 4;
        this.f16823b = new HashMap(c1469lG.f15376a);
        this.f16824c = new HashMap(c1469lG.f15377b);
    }
}
