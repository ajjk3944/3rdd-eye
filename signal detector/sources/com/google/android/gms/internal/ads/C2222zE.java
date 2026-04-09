package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222zE implements InterfaceC1048dR {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17837a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17838b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17839c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17840d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17841e;

    public C2222zE(int i) {
        this.f17837a = i;
        switch (i) {
            case 1:
                this.f17838b = null;
                this.f17839c = null;
                this.f17840d = null;
                this.f17841e = YD.f12611h;
                break;
            case 2:
                this.f17838b = new HashMap();
                this.f17839c = new HashMap();
                this.f17840d = new HashMap();
                this.f17841e = new HashMap();
                break;
            case 3:
                this.f17838b = null;
                this.f17839c = null;
                this.f17840d = null;
                this.f17841e = GG.f8346e;
                break;
            case 4:
                this.f17838b = null;
                this.f17839c = null;
                this.f17840d = null;
                this.f17841e = AE.f6966n;
                break;
            default:
                this.f17838b = null;
                this.f17839c = null;
                this.f17840d = null;
                this.f17841e = AE.f6958e;
                break;
        }
    }

    public void a(int i) throws InvalidAlgorithmParameterException {
        switch (this.f17837a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f17838b = Integer.valueOf(i);
                return;
            case 1:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f17838b = Integer.valueOf(i);
                return;
            default:
                this.f17838b = Integer.valueOf(i);
                return;
        }
    }

    public void b(JF jf) throws GeneralSecurityException {
        C1954uG c1954uG = new C1954uG(jf.f9269a, C1631oG.class);
        HashMap map = (HashMap) this.f17838b;
        if (!map.containsKey(c1954uG)) {
            map.put(c1954uG, jf);
            return;
        }
        JF jf2 = (JF) map.get(c1954uG);
        if (!jf2.equals(jf) || !jf.equals(jf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c1954uG.toString()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1048dR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.C1197gC c(int r17, com.google.android.gms.internal.ads.C2108x8 r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2222zE.c(int, com.google.android.gms.internal.ads.x8, int[]):com.google.android.gms.internal.ads.gC");
    }

    public void d() {
        this.f17839c = 12;
    }

    public void e(int i) throws GeneralSecurityException {
        switch (this.f17837a) {
            case 0:
                if (i != 12 && i != 16) {
                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
                }
                this.f17839c = Integer.valueOf(i);
                return;
            default:
                this.f17839c = Integer.valueOf(i);
                return;
        }
    }

    public void f(HF hf) throws GeneralSecurityException {
        hf.getClass();
        C1900tG c1900tG = new C1900tG(C1631oG.class, hf.f8880a);
        HashMap map = (HashMap) this.f17839c;
        if (!map.containsKey(c1900tG)) {
            map.put(c1900tG, hf);
            return;
        }
        HF hf2 = (HF) map.get(c1900tG);
        if (!hf2.equals(hf) || !hf.equals(hf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c1900tG.toString()));
        }
    }

    public void g() {
        switch (this.f17837a) {
            case 0:
                this.f17840d = 16;
                break;
            default:
                this.f17840d = 16;
                break;
        }
    }

    public void h(C1037dG c1037dG) throws GeneralSecurityException {
        C1954uG c1954uG = new C1954uG(c1037dG.f13748a, C1685pG.class);
        HashMap map = (HashMap) this.f17840d;
        if (!map.containsKey(c1954uG)) {
            map.put(c1954uG, c1037dG);
            return;
        }
        C1037dG c1037dG2 = (C1037dG) map.get(c1954uG);
        if (!c1037dG2.equals(c1037dG) || !c1037dG.equals(c1037dG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c1954uG.toString()));
        }
    }

    public void i(C0928bG c0928bG) throws GeneralSecurityException {
        c0928bG.getClass();
        C1900tG c1900tG = new C1900tG(C1685pG.class, c0928bG.f13337a);
        HashMap map = (HashMap) this.f17841e;
        if (!map.containsKey(c1900tG)) {
            map.put(c1900tG, c0928bG);
            return;
        }
        C0928bG c0928bG2 = (C0928bG) map.get(c1900tG);
        if (!c0928bG2.equals(c0928bG) || !c0928bG.equals(c0928bG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c1900tG.toString()));
        }
    }

    public BE j() throws GeneralSecurityException {
        Integer num = (Integer) this.f17838b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f17839c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f17840d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f17839c).intValue();
        ((Integer) this.f17840d).getClass();
        return new BE(iIntValue, iIntValue2, (AE) this.f17841e);
    }

    public EE k() throws GeneralSecurityException {
        Integer num = (Integer) this.f17838b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f17839c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f17840d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f17839c).getClass();
        ((Integer) this.f17840d).getClass();
        return new EE(iIntValue, (YD) this.f17841e);
    }

    public HG l() throws GeneralSecurityException {
        Integer num = (Integer) this.f17838b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f17839c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((FG) this.f17840d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f17838b));
        }
        Integer num2 = (Integer) this.f17839c;
        int iIntValue = num2.intValue();
        FG fg = (FG) this.f17840d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (fg == FG.f8075b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (fg == FG.f8076c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (fg == FG.f8077d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (fg == FG.f8078e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (fg != FG.f8079f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new HG(((Integer) this.f17838b).intValue(), ((Integer) this.f17839c).intValue(), (GG) this.f17841e, (FG) this.f17840d);
    }

    public XI m() throws GeneralSecurityException {
        C1952uE c1952uE = C1952uE.f17080C;
        C2006vE c2006vE = (C2006vE) this.f17838b;
        if (c2006vE == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        WI wi = (WI) this.f17839c;
        if (wi == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        C1952uE c1952uE2 = (C1952uE) this.f17840d;
        if (c1952uE2 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        AE ae = (AE) this.f17841e;
        if (wi == WI.f12196c && c1952uE2 != C1952uE.f17090m) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (wi == WI.f12197d && c1952uE2 != C1952uE.f17091n && c1952uE2 != c1952uE) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (wi != WI.f12198e || c1952uE2 == c1952uE) {
            return new XI(c2006vE, wi, c1952uE2, ae);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public C2222zE(SQ sq, boolean[] zArr) {
        this.f17837a = 6;
        this.f17838b = sq;
        this.f17839c = zArr;
        int i = sq.f11184a;
        this.f17840d = new boolean[i];
        this.f17841e = new boolean[i];
    }

    public /* synthetic */ C2222zE(C0884aR c0884aR, String str, int[] iArr, Point point) {
        this.f17837a = 7;
        this.f17838b = c0884aR;
        this.f17839c = str;
        this.f17840d = iArr;
        this.f17841e = point;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gP, java.lang.Object] */
    public /* synthetic */ C2222zE(AudioTrack audioTrack, C1448kw c1448kw) {
        this.f17837a = 5;
        this.f17838b = audioTrack;
        this.f17841e = c1448kw;
        Handler handlerN = Vt.n();
        this.f17839c = handlerN;
        ?? r02 = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.gP
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                C2222zE c2222zE = this.f14269a;
                if (((C1210gP) c2222zE.f17840d) == null) {
                    return;
                }
                AbstractC1114el.e().execute(new RunnableC0786Vp(c2222zE, 27, audioRouting));
            }
        };
        this.f17840d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting$OnRoutingChangedListener) r02, handlerN);
    }

    public C2222zE(C2008vG c2008vG) {
        this.f17837a = 2;
        this.f17838b = new HashMap(c2008vG.f17249a);
        this.f17839c = new HashMap(c2008vG.f17250b);
        this.f17840d = new HashMap(c2008vG.f17251c);
        this.f17841e = new HashMap(c2008vG.f17252d);
    }
}
