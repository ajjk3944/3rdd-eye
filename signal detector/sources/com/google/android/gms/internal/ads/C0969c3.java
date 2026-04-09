package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import f4.InterfaceFutureC2326a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2820h;
import q2.C2834o;
import u.C2940i;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969c3 implements S2 {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f13518h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13519j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public Object f13520a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13521b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13522c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13523d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13524e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13525f;

    /* renamed from: g, reason: collision with root package name */
    public Object f13526g;

    public C0969c3(Context context, C0450Cc c0450Cc, C2951a c2951a, Executor executor) {
        this.f13520a = new Object();
        this.f13525f = new AtomicBoolean(false);
        this.f13521b = context.getApplicationContext();
        this.f13524e = c2951a;
        this.f13523d = c0450Cc;
        this.f13526g = executor;
    }

    public static V2 c(C1443kr c1443kr, int i3) {
        int iH;
        int iH2;
        int iH3;
        int iH4;
        int i6 = 8;
        int iH5 = c1443kr.h(8);
        c1443kr.f(8);
        int i7 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrF = f();
        int[] iArrJ = j();
        int i8 = i3 - 2;
        while (i8 > 0) {
            int iH6 = c1443kr.h(i6);
            int iH7 = c1443kr.h(i6);
            int[] iArr2 = (iH7 & 128) != 0 ? iArr : (iH7 & 64) != 0 ? iArrF : iArrJ;
            if ((iH7 & 1) != 0) {
                iH3 = c1443kr.h(i6);
                iH4 = c1443kr.h(i6);
                iH = c1443kr.h(i6);
                iH2 = c1443kr.h(i6);
                i8 -= 6;
            } else {
                int iH8 = c1443kr.h(6) << 2;
                int iH9 = c1443kr.h(4) << 4;
                i8 -= 4;
                iH = c1443kr.h(4) << 4;
                iH2 = c1443kr.h(2) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
            }
            if (iH3 == 0) {
                iH = i7;
            }
            if (iH3 == 0) {
                iH4 = i7;
            }
            double d6 = iH3;
            String str = Vt.f12096a;
            double d7 = iH4 - 128;
            double d8 = iH - 128;
            iArr2[iH6] = k((byte) (255 - (iH2 & 255)), Math.max(0, Math.min((int) ((1.402d * d7) + d6), 255)), Math.max(0, Math.min((int) ((d6 - (0.34414d * d8)) - (d7 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d8 * 1.772d) + d6), 255)));
            i7 = 0;
            iH5 = iH5;
            iArrJ = iArrJ;
            i6 = 8;
        }
        return new V2(iH5, iArr, iArrF, iArrJ);
    }

    public static X2 d(C1443kr c1443kr) {
        byte[] bArr;
        int iH = c1443kr.h(16);
        c1443kr.f(4);
        int iH2 = c1443kr.h(2);
        boolean zG = c1443kr.g();
        c1443kr.f(1);
        byte[] bArr2 = Vt.f12097b;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c1443kr.h(16);
                int iH4 = c1443kr.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    AbstractC0582Jp.h0(c1443kr.f15296c == 0);
                    System.arraycopy(c1443kr.f15294a, c1443kr.f15295b, bArr2, 0, iH3);
                    c1443kr.f15295b += iH3;
                    c1443kr.m();
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    AbstractC0582Jp.h0(c1443kr.f15296c == 0);
                    System.arraycopy(c1443kr.f15294a, c1443kr.f15295b, bArr, 0, iH4);
                    c1443kr.f15295b += iH4;
                    c1443kr.m();
                }
            }
            return new X2(iH, zG, bArr2, bArr);
        }
        c1443kr.f(c1443kr.h(8) * 16);
        bArr = bArr2;
        return new X2(iH, zG, bArr2, bArr);
    }

    public static JSONObject e(Context context, C2951a c2951a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC1372ja.f14955f.v()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", c2951a.f23784a);
            jSONObject.put("mf", AbstractC1372ja.f14956g.v());
            jSONObject.put("cl", "839961582");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", T2.e.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i3 = 1; i3 < 16; i3++) {
            int i6 = i3 & 4;
            int i7 = i3 & 2;
            int i8 = i3 & 1;
            if (i3 < 8) {
                iArr[i3] = k(255, 1 != i8 ? 0 : 255, i7 != 0 ? 255 : 0, i6 != 0 ? 255 : 0);
            } else {
                iArr[i3] = k(255, 1 != i8 ? 0 : 127, i7 != 0 ? 127 : 0, i6 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = k(63, 1 != (i3 & 1) ? 0 : 255, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i6 = i3 & 136;
                if (i6 == 0) {
                    iArr[i3] = k(255, (1 != (i3 & 1) ? 0 : 85) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i3] = k(127, (1 != (i3 & 1) ? 0 : 85) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i3] = k(255, (1 != (i3 & 1) ? 0 : 43) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i3] = k(255, (1 != (i3 & 1) ? 0 : 43) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int k(int i3, int i6, int i7, int i8) {
        return (i3 << 24) | (i6 << 16) | (i7 << 8) | i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0969c3.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] m(int i3, int i6, C1443kr c1443kr) {
        byte[] bArr = new byte[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            bArr[i7] = (byte) c1443kr.h(i6);
        }
        return bArr;
    }

    public InterfaceFutureC2326a a() {
        synchronized (this.f13520a) {
            try {
                if (((SharedPreferences) this.f13522c) == null) {
                    this.f13522c = ((Context) this.f13521b).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13522c;
        long j6 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        p2.j.f22785C.f22797k.getClass();
        if (System.currentTimeMillis() - j6 < ((Long) AbstractC1372ja.f14957h.v()).longValue()) {
            return ED.f7928b;
        }
        return AbstractC1984ut.G(((C0450Cc) this.f13523d).a(e((Context) this.f13521b, (C2951a) this.f13524e)), new C1754qe(0, this), ((Boolean) AbstractC1372ja.f14961m.v()).booleanValue() ? (Executor) this.f13526g : AbstractC0640Nf.f10011g);
    }

    public void b() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            q2.d1 d1VarB = q2.d1.b();
            C2834o c2834o = q2.r.f23260g.f23262b;
            Context context = (Context) this.f13521b;
            String str = (String) this.f13522c;
            BinderC0569Jc binderC0569Jc = (BinderC0569Jc) this.f13525f;
            c2834o.getClass();
            q2.L l2 = (q2.L) new C2820h(c2834o, context, d1VarB, str, binderC0569Jc).d(context, false);
            this.f13520a = l2;
            if (l2 != null) {
                q2.E0 e02 = (q2.E0) this.f13523d;
                e02.f23101m = jCurrentTimeMillis;
                l2.w1(new BinderC0974c8((E2.b) this.f13524e, str));
                q2.L l6 = (q2.L) this.f13520a;
                ((q2.c1) this.f13526g).getClass();
                l6.f0(q2.c1.a(context, e02));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public C1795rJ g() throws GeneralSecurityException {
        Wu wu;
        Wu wu2;
        C1849sJ c1849sJ = (C1849sJ) this.f13520a;
        if (c1849sJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        Wu wu3 = (Wu) this.f13522c;
        if (wu3 == null || (wu = (Wu) this.f13523d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        Wu wu4 = (Wu) this.f13521b;
        if (wu4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        Wu wu5 = (Wu) this.f13524e;
        if (wu5 == null || (wu2 = (Wu) this.f13525f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        Wu wu6 = (Wu) this.f13526g;
        if (wu6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c1849sJ.f16702c.f16158b;
        BigInteger bigInteger2 = c1849sJ.f16703d;
        BigInteger bigInteger3 = (BigInteger) wu3.f12337b;
        BigInteger bigInteger4 = (BigInteger) wu.f12337b;
        BigInteger bigInteger5 = (BigInteger) wu4.f12337b;
        BigInteger bigInteger6 = (BigInteger) wu5.f12337b;
        BigInteger bigInteger7 = (BigInteger) wu2.f12337b;
        BigInteger bigInteger8 = (BigInteger) wu6.f12337b;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new C1795rJ((C1849sJ) this.f13520a, (Wu) this.f13522c, (Wu) this.f13523d, (Wu) this.f13521b, (Wu) this.f13524e, (Wu) this.f13525f, (Wu) this.f13526g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    @Override // com.google.android.gms.internal.ads.S2
    public void h(byte[] bArr, int i3, int i6, T2 t22) {
        boolean z6;
        N2 n22;
        char c6;
        char c7;
        char c8;
        int i7;
        int i8;
        int i9;
        C0915b3 c0915b3;
        Z2 z22;
        SparseArray sparseArray;
        W2 w22;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        Z2 z23;
        int iH;
        int iH2;
        int i14;
        int iH3;
        Canvas canvas = (Canvas) this.f13522c;
        C0915b3 c0915b32 = (C0915b3) this.f13525f;
        C1443kr c1443kr = new C1443kr(bArr, i3 + i6);
        c1443kr.d(i3);
        while (true) {
            z6 = true;
            if (c1443kr.b() >= 48 && c1443kr.h(8) == 15) {
                int iH4 = c1443kr.h(8);
                int i15 = 16;
                int iH5 = c1443kr.h(16);
                int iH6 = c1443kr.h(16);
                int iC = c1443kr.c() + iH6;
                if (iH6 * 8 > c1443kr.b()) {
                    AbstractC2022vd.v("DvbParser", "Data field length exceeds limit");
                    c1443kr.f(c1443kr.b());
                } else {
                    switch (iH4) {
                        case 16:
                            if (iH5 == c0915b32.f13296a) {
                                W1 w12 = c0915b32.i;
                                c1443kr.h(8);
                                int iH7 = c1443kr.h(4);
                                int iH8 = c1443kr.h(2);
                                c1443kr.f(2);
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i16 = iH6 - 2; i16 > 0; i16 -= 6) {
                                    int iH9 = c1443kr.h(8);
                                    c1443kr.f(8);
                                    sparseArray2.put(iH9, new Y2(c1443kr.h(16), c1443kr.h(16)));
                                }
                                W1 w13 = new W1();
                                w13.f12141a = iH7;
                                w13.f12142b = iH8;
                                w13.f12143c = sparseArray2;
                                if (iH8 != 0) {
                                    c0915b32.i = w13;
                                    c0915b32.f13298c.clear();
                                    c0915b32.f13299d.clear();
                                    c0915b32.f13300e.clear();
                                    break;
                                } else if (w12 != null && w12.f12141a != iH7) {
                                    c0915b32.i = w13;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            W1 w14 = c0915b32.i;
                            SparseArray sparseArray3 = c0915b32.f13298c;
                            if (iH5 == c0915b32.f13296a && w14 != null) {
                                int iH10 = c1443kr.h(8);
                                c1443kr.f(4);
                                boolean zG = c1443kr.g();
                                c1443kr.f(3);
                                int iH11 = c1443kr.h(16);
                                int iH12 = c1443kr.h(16);
                                c1443kr.h(3);
                                int iH13 = c1443kr.h(3);
                                c1443kr.f(2);
                                int iH14 = c1443kr.h(8);
                                int iH15 = c1443kr.h(8);
                                int iH16 = c1443kr.h(4);
                                int iH17 = c1443kr.h(2);
                                c1443kr.f(2);
                                int i17 = iH6 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i17 > 0) {
                                    int iH18 = c1443kr.h(i15);
                                    int iH19 = c1443kr.h(2);
                                    c1443kr.h(2);
                                    int iH20 = c1443kr.h(12);
                                    c1443kr.f(4);
                                    int iH21 = c1443kr.h(12);
                                    int i18 = i17 - 6;
                                    if (iH19 == 1 || iH19 == 2) {
                                        c1443kr.h(8);
                                        c1443kr.h(8);
                                        i17 -= 8;
                                    } else {
                                        i17 = i18;
                                    }
                                    sparseArray4.put(iH18, new C0860a3(iH20, iH21));
                                    i15 = 16;
                                }
                                Z2 z24 = new Z2(iH10, zG, iH11, iH12, iH13, iH14, iH15, iH16, iH17, sparseArray4);
                                if (w14.f12142b == 0 && (z23 = (Z2) sparseArray3.get(iH10)) != null) {
                                    int i19 = 0;
                                    while (true) {
                                        SparseArray sparseArray5 = z23.f12783j;
                                        if (i19 < sparseArray5.size()) {
                                            z24.f12783j.put(sparseArray5.keyAt(i19), (C0860a3) sparseArray5.valueAt(i19));
                                            i19++;
                                        }
                                    }
                                }
                                sparseArray3.put(z24.f12775a, z24);
                                break;
                            }
                            break;
                        case 18:
                            if (iH5 == c0915b32.f13296a) {
                                V2 v2C = c(c1443kr, iH6);
                                c0915b32.f13299d.put(v2C.f11927a, v2C);
                                break;
                            } else if (iH5 == c0915b32.f13297b) {
                                V2 v2C2 = c(c1443kr, iH6);
                                c0915b32.f13301f.put(v2C2.f11927a, v2C2);
                                break;
                            }
                            break;
                        case 19:
                            if (iH5 == c0915b32.f13296a) {
                                X2 x2D = d(c1443kr);
                                c0915b32.f13300e.put(x2D.f12361a, x2D);
                                break;
                            } else if (iH5 == c0915b32.f13297b) {
                                X2 x2D2 = d(c1443kr);
                                c0915b32.f13302g.put(x2D2.f12361a, x2D2);
                                break;
                            }
                            break;
                        case 20:
                            if (iH5 == c0915b32.f13296a) {
                                c1443kr.f(4);
                                boolean zG2 = c1443kr.g();
                                c1443kr.f(3);
                                int iH22 = c1443kr.h(16);
                                int iH23 = c1443kr.h(16);
                                if (zG2) {
                                    int iH24 = c1443kr.h(16);
                                    iH = c1443kr.h(16);
                                    iH3 = c1443kr.h(16);
                                    iH2 = c1443kr.h(16);
                                    i14 = iH24;
                                } else {
                                    iH = iH22;
                                    iH2 = iH23;
                                    i14 = 0;
                                    iH3 = 0;
                                }
                                c0915b32.f13303h = new W2(iH22, iH23, i14, iH, iH3, iH2);
                                break;
                            }
                            break;
                    }
                    c1443kr.l(iC - c1443kr.c());
                }
            }
        }
        W1 w15 = c0915b32.i;
        if (w15 == null) {
            JB jb = LB.f9635b;
            n22 = new N2(C1197gC.f14227e, -9223372036854775807L, -9223372036854775807L);
        } else {
            W2 w23 = c0915b32.f13303h;
            if (w23 == null) {
                w23 = (W2) this.f13523d;
            }
            W2 w24 = w23;
            Bitmap bitmap = (Bitmap) this.f13526g;
            if (bitmap == null || w24.f12144a + 1 != bitmap.getWidth() || w24.f12145b + 1 != ((Bitmap) this.f13526g).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w24.f12144a + 1, w24.f12145b + 1, Bitmap.Config.ARGB_8888);
                this.f13526g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray6 = (SparseArray) w15.f12143c;
            int i20 = 0;
            while (i20 < sparseArray6.size()) {
                canvas.save();
                Y2 y22 = (Y2) sparseArray6.valueAt(i20);
                Z2 z25 = (Z2) c0915b32.f13298c.get(sparseArray6.keyAt(i20));
                int i21 = y22.f12576a + w24.f12146c;
                int i22 = y22.f12577b + w24.f12148e;
                int i23 = z25.f12777c;
                int i24 = i21 + i23;
                int iMin = Math.min(i24, w24.f12147d);
                boolean z7 = z6;
                int i25 = z25.f12778d;
                int i26 = i22 + i25;
                canvas.clipRect(i21, i22, iMin, Math.min(i26, w24.f12149f));
                int i27 = z25.f12780f;
                V2 v22 = (V2) c0915b32.f13299d.get(i27);
                if (v22 == null && (v22 = (V2) c0915b32.f13301f.get(i27)) == null) {
                    v22 = (V2) this.f13524e;
                }
                SparseArray sparseArray7 = z25.f12783j;
                SparseArray sparseArray8 = sparseArray6;
                int i28 = i22;
                int i29 = 0;
                while (i29 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i29);
                    int i30 = i29;
                    C0860a3 c0860a3 = (C0860a3) sparseArray7.valueAt(i29);
                    int i31 = i21;
                    X2 x22 = (X2) c0915b32.f13300e.get(iKeyAt);
                    if (x22 == null) {
                        x22 = (X2) c0915b32.f13302g.get(iKeyAt);
                    }
                    X2 x23 = x22;
                    if (x23 != null) {
                        Paint paint = x23.f12362b ? null : (Paint) this.f13520a;
                        c0915b3 = c0915b32;
                        int i32 = z25.f12779e;
                        Z2 z26 = z25;
                        int i33 = i31 + c0860a3.f13021a;
                        int i34 = i28 + c0860a3.f13022b;
                        int[] iArr = i32 == 3 ? v22.f11930d : i32 == 2 ? v22.f11929c : v22.f11928b;
                        z22 = z26;
                        w22 = w24;
                        i12 = i24;
                        sparseArray = sparseArray7;
                        Paint paint2 = paint;
                        i11 = i31;
                        arrayList = arrayList2;
                        i13 = i23;
                        i10 = i25;
                        int i35 = i28;
                        i8 = i20;
                        i9 = i35;
                        l(x23.f12363c, iArr, i32, i33, i34, paint2, canvas);
                        l(x23.f12364d, iArr, i32, i33, i34 + 1, paint2, canvas);
                    } else {
                        int i36 = i28;
                        i8 = i20;
                        i9 = i36;
                        c0915b3 = c0915b32;
                        z22 = z25;
                        sparseArray = sparseArray7;
                        w22 = w24;
                        i10 = i25;
                        i11 = i31;
                        i12 = i24;
                        arrayList = arrayList2;
                        i13 = i23;
                    }
                    int i37 = i8;
                    i28 = i9;
                    i20 = i37;
                    z25 = z22;
                    i21 = i11;
                    i29 = i30 + 1;
                    i24 = i12;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c0915b32 = c0915b3;
                    w24 = w22;
                    sparseArray7 = sparseArray;
                    i25 = i10;
                }
                int i38 = i28;
                int i39 = i20;
                C0915b3 c0915b33 = c0915b32;
                Z2 z27 = z25;
                int i40 = i21;
                W2 w25 = w24;
                int i41 = i25;
                ArrayList arrayList3 = arrayList2;
                int i42 = i23;
                int i43 = i24;
                float f2 = i38;
                float f5 = i40;
                if (z27.f12776b) {
                    int i44 = z27.f12779e;
                    c7 = 3;
                    if (i44 == 3) {
                        i7 = v22.f11930d[z27.f12781g];
                        c8 = 2;
                    } else {
                        c8 = 2;
                        i7 = i44 == 2 ? v22.f11929c[z27.f12782h] : v22.f11928b[z27.i];
                    }
                    Paint paint3 = (Paint) this.f13521b;
                    paint3.setColor(i7);
                    c6 = c8;
                    canvas.drawRect(f5, f2, i43, i26, paint3);
                } else {
                    c6 = 2;
                    c7 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.f13526g, i40, i38, i42, i41);
                float f6 = w25.f12144a;
                float f7 = f5 / f6;
                float f8 = w25.f12145b;
                C2244zj c2244zj = new C2244zj(null, null, null, bitmapCreateBitmap2, f2 / f8, 0, 0, f7, 0, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, i42 / f6, i41 / f8, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0);
                arrayList2 = arrayList3;
                arrayList2.add(c2244zj);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i20 = i39 + 1;
                w24 = w25;
                sparseArray6 = sparseArray8;
                c0915b32 = c0915b33;
                z6 = z7;
            }
            n22 = new N2(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        t22.mo4b(n22);
    }

    public C2173yJ i() throws GeneralSecurityException {
        Wu wu;
        Wu wu2;
        C2227zJ c2227zJ = (C2227zJ) this.f13520a;
        if (c2227zJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        Wu wu3 = (Wu) this.f13522c;
        if (wu3 == null || (wu = (Wu) this.f13523d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        Wu wu4 = (Wu) this.f13521b;
        if (wu4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        Wu wu5 = (Wu) this.f13524e;
        if (wu5 == null || (wu2 = (Wu) this.f13525f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        Wu wu6 = (Wu) this.f13526g;
        if (wu6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c2227zJ.f17853c.f17571b;
        BigInteger bigInteger2 = c2227zJ.f17854d;
        BigInteger bigInteger3 = (BigInteger) wu3.f12337b;
        BigInteger bigInteger4 = (BigInteger) wu.f12337b;
        BigInteger bigInteger5 = (BigInteger) wu4.f12337b;
        BigInteger bigInteger6 = (BigInteger) wu5.f12337b;
        BigInteger bigInteger7 = (BigInteger) wu2.f12337b;
        BigInteger bigInteger8 = (BigInteger) wu6.f12337b;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new C2173yJ((C2227zJ) this.f13520a, (Wu) this.f13522c, (Wu) this.f13523d, (Wu) this.f13521b, (Wu) this.f13524e, (Wu) this.f13525f, (Wu) this.f13526g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ C0969c3(boolean z6) {
        this.f13520a = null;
        this.f13521b = null;
        this.f13522c = null;
        this.f13523d = null;
        this.f13524e = null;
        this.f13525f = null;
        this.f13526g = null;
    }

    public C0969c3() {
        this.f13525f = new C2940i(0);
        this.f13526g = new C2940i(0);
    }

    public C0969c3(Context context, String str, q2.E0 e02, E2.b bVar) {
        this.f13525f = new BinderC0569Jc();
        this.f13521b = context;
        this.f13522c = str;
        this.f13523d = e02;
        this.f13524e = bVar;
        this.f13526g = q2.c1.f23184a;
    }

    public C0969c3(K9 k9, WebView webView, String str, String str2, Qv qv) {
        this.f13522c = new ArrayList();
        this.f13523d = new HashMap();
        this.f13520a = k9;
        this.f13521b = webView;
        this.f13526g = qv;
        this.f13525f = str;
        this.f13524e = str2;
    }
}
