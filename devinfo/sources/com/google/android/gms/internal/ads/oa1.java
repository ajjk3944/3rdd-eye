package com.google.android.gms.internal.ads;

import android.graphics.Point;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oa1 implements a02 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14633a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14634b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14635c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14636d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14637e;

    public oa1(int i4) {
        this.f14633a = i4;
        switch (i4) {
            case 1:
                this.f14634b = null;
                this.f14635c = null;
                this.f14636d = null;
                this.f14637e = ja1.j;
                break;
            case 2:
                this.f14634b = new HashMap();
                this.f14635c = new HashMap();
                this.f14636d = new HashMap();
                this.f14637e = new HashMap();
                break;
            case 3:
                this.f14634b = null;
                this.f14635c = null;
                this.f14636d = null;
                this.f14637e = te1.f16801e;
                break;
            case 4:
                this.f14634b = null;
                this.f14635c = null;
                this.f14636d = null;
                this.f14637e = m91.f13823u;
                break;
            default:
                this.f14634b = null;
                this.f14635c = null;
                this.f14636d = null;
                this.f14637e = m91.f13811h;
                break;
        }
    }

    public void a(int i4) throws InvalidAlgorithmParameterException {
        switch (this.f14633a) {
            case 0:
                if (i4 != 16 && i4 != 24 && i4 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i4)));
                }
                this.f14634b = Integer.valueOf(i4);
                return;
            case 1:
                if (i4 != 16 && i4 != 24 && i4 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i4)));
                }
                this.f14634b = Integer.valueOf(i4);
                return;
            default:
                this.f14634b = Integer.valueOf(i4);
                return;
        }
    }

    public void b(wc1 wc1Var) throws GeneralSecurityException {
        he1 he1Var = new he1(wc1Var.f17981a, be1.class);
        HashMap map = (HashMap) this.f14634b;
        if (!map.containsKey(he1Var)) {
            map.put(he1Var, wc1Var);
            return;
        }
        wc1 wc1Var2 = (wc1) map.get(he1Var);
        if (!wc1Var2.equals(wc1Var) || !wc1Var.equals(wc1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(he1Var.toString()));
        }
    }

    public void c() {
        this.f14635c = 12;
    }

    public void d(int i4) throws GeneralSecurityException {
        switch (this.f14633a) {
            case 0:
                if (i4 != 12 && i4 != 16) {
                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i4)));
                }
                this.f14635c = Integer.valueOf(i4);
                return;
            default:
                this.f14635c = Integer.valueOf(i4);
                return;
        }
    }

    public void e(uc1 uc1Var) throws GeneralSecurityException {
        uc1Var.getClass();
        ge1 ge1Var = new ge1(be1.class, uc1Var.f17172a);
        HashMap map = (HashMap) this.f14635c;
        if (!map.containsKey(ge1Var)) {
            map.put(ge1Var, uc1Var);
            return;
        }
        uc1 uc1Var2 = (uc1) map.get(ge1Var);
        if (!uc1Var2.equals(uc1Var) || !uc1Var.equals(uc1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ge1Var.toString()));
        }
    }

    public void f() {
        switch (this.f14633a) {
            case 0:
                this.f14636d = 16;
                break;
            default:
                this.f14636d = 16;
                break;
        }
    }

    public void g(qd1 qd1Var) throws GeneralSecurityException {
        he1 he1Var = new he1(qd1Var.f15318a, ce1.class);
        HashMap map = (HashMap) this.f14636d;
        if (!map.containsKey(he1Var)) {
            map.put(he1Var, qd1Var);
            return;
        }
        qd1 qd1Var2 = (qd1) map.get(he1Var);
        if (!qd1Var2.equals(qd1Var) || !qd1Var.equals(qd1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(he1Var.toString()));
        }
    }

    public void h(od1 od1Var) throws GeneralSecurityException {
        od1Var.getClass();
        ge1 ge1Var = new ge1(ce1.class, od1Var.f14680a);
        HashMap map = (HashMap) this.f14637e;
        if (!map.containsKey(ge1Var)) {
            map.put(ge1Var, od1Var);
            return;
        }
        od1 od1Var2 = (od1) map.get(ge1Var);
        if (!od1Var2.equals(od1Var) || !od1Var.equals(od1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ge1Var.toString()));
        }
    }

    public pa1 i() throws GeneralSecurityException {
        Integer num = (Integer) this.f14634b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f14635c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f14636d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f14635c).intValue();
        ((Integer) this.f14636d).getClass();
        return new pa1(iIntValue, iIntValue2, (m91) this.f14637e);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @Override // com.google.android.gms.internal.ads.a02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.u51 j(int r17, com.google.android.gms.internal.ads.ii r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa1.j(int, com.google.android.gms.internal.ads.ii, int[]):com.google.android.gms.internal.ads.u51");
    }

    public sa1 k() throws GeneralSecurityException {
        Integer num = (Integer) this.f14634b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f14635c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f14636d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f14635c).getClass();
        ((Integer) this.f14636d).getClass();
        return new sa1(iIntValue, (ja1) this.f14637e);
    }

    public ue1 l() throws GeneralSecurityException {
        Integer num = (Integer) this.f14634b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f14635c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((se1) this.f14636d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f14634b));
        }
        Integer num2 = (Integer) this.f14635c;
        int iIntValue = num2.intValue();
        se1 se1Var = (se1) this.f14636d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (se1Var == se1.f15998b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (se1Var == se1.f15999c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (se1Var == se1.f16000d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (se1Var == se1.f16001e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (se1Var != se1.f16002f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new ue1(((Integer) this.f14634b).intValue(), ((Integer) this.f14635c).intValue(), (te1) this.f14637e, (se1) this.f14636d);
    }

    public lj1 m() throws GeneralSecurityException {
        ja1 ja1Var = ja1.f12705q;
        ka1 ka1Var = (ka1) this.f14634b;
        if (ka1Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        kj1 kj1Var = (kj1) this.f14635c;
        if (kj1Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        ja1 ja1Var2 = (ja1) this.f14636d;
        if (ja1Var2 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        m91 m91Var = (m91) this.f14637e;
        if (kj1Var == kj1.f13172c && ja1Var2 != ja1.f12703o) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (kj1Var == kj1.f13173d && ja1Var2 != ja1.f12704p && ja1Var2 != ja1Var) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (kj1Var != kj1.f13174e || ja1Var2 == ja1Var) {
            return new lj1(ka1Var, kj1Var, ja1Var2, m91Var);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public oa1(oz1 oz1Var, boolean[] zArr) {
        this.f14633a = 5;
        this.f14634b = oz1Var;
        this.f14635c = zArr;
        int i4 = oz1Var.f14820a;
        this.f14636d = new boolean[i4];
        this.f14637e = new boolean[i4];
    }

    public /* synthetic */ oa1(wz1 wz1Var, String str, int[] iArr, Point point) {
        this.f14633a = 6;
        this.f14634b = wz1Var;
        this.f14635c = str;
        this.f14636d = iArr;
        this.f14637e = point;
    }

    public oa1(ie1 ie1Var) {
        this.f14633a = 2;
        this.f14634b = new HashMap(ie1Var.f12316a);
        this.f14635c = new HashMap(ie1Var.f12317b);
        this.f14636d = new HashMap(ie1Var.f12318c);
        this.f14637e = new HashMap(ie1Var.f12319d);
    }
}
