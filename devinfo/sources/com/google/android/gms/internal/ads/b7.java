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
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b7 implements s6 {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9603h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9604i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public Object f9605a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9606b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9607c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9608d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9609e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9610f;
    public Object g;

    public b7(Context context, qq qqVar, za.a aVar, Executor executor) {
        this.f9605a = new Object();
        this.f9610f = new AtomicBoolean(false);
        this.f9606b = context.getApplicationContext();
        this.f9609e = aVar;
        this.f9608d = qqVar;
        this.g = executor;
    }

    public static u6 c(hk0 hk0Var, int i4) {
        int iH;
        int iH2;
        int iH3;
        int iH4;
        int i10 = 8;
        int iH5 = hk0Var.h(8);
        hk0Var.f(8);
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrG = g();
        int[] iArrJ = j();
        int i12 = i4 - 2;
        while (i12 > 0) {
            int iH6 = hk0Var.h(i10);
            int iH7 = hk0Var.h(i10);
            int[] iArr2 = (iH7 & 128) != 0 ? iArr : (iH7 & 64) != 0 ? iArrG : iArrJ;
            if ((iH7 & 1) != 0) {
                iH3 = hk0Var.h(i10);
                iH4 = hk0Var.h(i10);
                iH = hk0Var.h(i10);
                iH2 = hk0Var.h(i10);
                i12 -= 6;
            } else {
                int iH8 = hk0Var.h(6) << 2;
                int iH9 = hk0Var.h(4) << 4;
                i12 -= 4;
                iH = hk0Var.h(4) << 4;
                iH2 = hk0Var.h(2) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
            }
            if (iH3 == 0) {
                iH = i11;
            }
            if (iH3 == 0) {
                iH4 = i11;
            }
            double d10 = iH3;
            String str = bq0.f9768a;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr2[iH6] = k((byte) (255 - (iH2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            i11 = 0;
            iH5 = iH5;
            iArrJ = iArrJ;
            i10 = 8;
        }
        return new u6(iH5, iArr, iArrG, iArrJ);
    }

    public static w6 e(hk0 hk0Var) {
        byte[] bArr;
        int iH = hk0Var.h(16);
        hk0Var.f(4);
        int iH2 = hk0Var.h(2);
        boolean zG = hk0Var.g();
        hk0Var.f(1);
        byte[] bArr2 = bq0.f9769b;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = hk0Var.h(16);
                int iH4 = hk0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    mq0.c0(hk0Var.f11895c == 0);
                    System.arraycopy(hk0Var.f11893a, hk0Var.f11894b, bArr2, 0, iH3);
                    hk0Var.f11894b += iH3;
                    hk0Var.m();
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    mq0.c0(hk0Var.f11895c == 0);
                    System.arraycopy(hk0Var.f11893a, hk0Var.f11894b, bArr, 0, iH4);
                    hk0Var.f11894b += iH4;
                    hk0Var.m();
                }
            }
            return new w6(iH, zG, bArr2, bArr);
        }
        hk0Var.f(hk0Var.h(8) * 16);
        bArr = bArr2;
        return new w6(iH, zG, bArr2, bArr);
    }

    public static JSONObject f(Context context, za.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) ul.f17246f.u()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f38129a);
            jSONObject.put("mf", ul.g.u());
            jSONObject.put("cl", "839961582");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", wb.d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            int i10 = i4 & 4;
            int i11 = i4 & 2;
            int i12 = i4 & 1;
            if (i4 < 8) {
                iArr[i4] = k(255, 1 != i12 ? 0 : 255, i11 != 0 ? 255 : 0, i10 != 0 ? 255 : 0);
            } else {
                iArr[i4] = k(255, 1 != i12 ? 0 : 127, i11 != 0 ? 127 : 0, i10 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (i4 < 8) {
                iArr[i4] = k(63, 1 != (i4 & 1) ? 0 : 255, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i4 & 136;
                if (i10 == 0) {
                    iArr[i4] = k(255, (1 != (i4 & 1) ? 0 : 85) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i4] = k(127, (1 != (i4 & 1) ? 0 : 85) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i4] = k(255, (1 != (i4 & 1) ? 0 : 43) + 127 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + 127 + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + 127 + ((i4 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i4] = k(255, (1 != (i4 & 1) ? 0 : 43) + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int k(int i4, int i10, int i11, int i12) {
        return (i4 << 24) | (i10 << 16) | (i11 << 8) | i12;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b7.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] m(int i4, int i10, hk0 hk0Var) {
        byte[] bArr = new byte[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            bArr[i11] = (byte) hk0Var.h(i10);
        }
        return bArr;
    }

    public vd.b a() {
        synchronized (this.f9605a) {
            try {
                if (((SharedPreferences) this.f9607c) == null) {
                    this.f9607c = ((Context) this.f9606b).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f9607c;
        long j8 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        ua.j.C.f35267k.getClass();
        if (System.currentTimeMillis() - j8 < ((Long) ul.f17247h.u()).longValue()) {
            return s81.f15906b;
        }
        return yo0.G(((qq) this.f9608d).a(f((Context) this.f9606b, (za.a) this.f9609e)), new hu(0, this), ((Boolean) ul.f17251m.u()).booleanValue() ? (Executor) this.g : fx.g);
    }

    public void b() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            va.c3 c3VarC = va.c3.c();
            va.o oVar = va.r.g.f36158b;
            Context context = (Context) this.f9606b;
            String str = (String) this.f9607c;
            yq yqVar = (yq) this.f9610f;
            oVar.getClass();
            va.l0 l0Var = (va.l0) new va.h(oVar, context, c3VarC, str, yqVar).d(context, false);
            this.f9605a = l0Var;
            if (l0Var != null) {
                va.d2 d2Var = (va.d2) this.f9608d;
                d2Var.f36063m = jCurrentTimeMillis;
                l0Var.t1(new nh((ab.b) this.f9609e, str));
                va.l0 l0Var2 = (va.l0) this.f9605a;
                ((va.b3) this.g).getClass();
                l0Var2.P(va.b3.a(context, d2Var));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.s6
    public void d(byte[] bArr, int i4, int i10, ca.c cVar) {
        boolean z3;
        n6 n6Var;
        char c9;
        char c10;
        char c11;
        int i11;
        int i12;
        int i13;
        a7 a7Var;
        y6 y6Var;
        SparseArray sparseArray;
        v6 v6Var;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int i17;
        y6 y6Var2;
        int iH;
        int iH2;
        int i18;
        int iH3;
        Canvas canvas = (Canvas) this.f9607c;
        a7 a7Var2 = (a7) this.f9610f;
        hk0 hk0Var = new hk0(bArr, i4 + i10);
        hk0Var.d(i4);
        while (true) {
            z3 = true;
            if (hk0Var.b() >= 48 && hk0Var.h(8) == 15) {
                int iH4 = hk0Var.h(8);
                int i19 = 16;
                int iH5 = hk0Var.h(16);
                int iH6 = hk0Var.h(16);
                int iC = hk0Var.c() + iH6;
                if (iH6 * 8 > hk0Var.b()) {
                    ls.t("DvbParser", "Data field length exceeds limit");
                    hk0Var.f(hk0Var.b());
                } else {
                    switch (iH4) {
                        case 16:
                            if (iH5 == a7Var2.f9229a) {
                                w4 w4Var = a7Var2.f9236i;
                                hk0Var.h(8);
                                int iH7 = hk0Var.h(4);
                                int iH8 = hk0Var.h(2);
                                hk0Var.f(2);
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i20 = iH6 - 2; i20 > 0; i20 -= 6) {
                                    int iH9 = hk0Var.h(8);
                                    hk0Var.f(8);
                                    sparseArray2.put(iH9, new x6(hk0Var.h(16), hk0Var.h(16)));
                                }
                                w4 w4Var2 = new w4();
                                w4Var2.f17860a = iH7;
                                w4Var2.f17861b = iH8;
                                w4Var2.f17862c = sparseArray2;
                                if (iH8 != 0) {
                                    a7Var2.f9236i = w4Var2;
                                    a7Var2.f9231c.clear();
                                    a7Var2.f9232d.clear();
                                    a7Var2.f9233e.clear();
                                    break;
                                } else if (w4Var != null && w4Var.f17860a != iH7) {
                                    a7Var2.f9236i = w4Var2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            w4 w4Var3 = a7Var2.f9236i;
                            SparseArray sparseArray3 = a7Var2.f9231c;
                            if (iH5 == a7Var2.f9229a && w4Var3 != null) {
                                int iH10 = hk0Var.h(8);
                                hk0Var.f(4);
                                boolean zG = hk0Var.g();
                                hk0Var.f(3);
                                int iH11 = hk0Var.h(16);
                                int iH12 = hk0Var.h(16);
                                hk0Var.h(3);
                                int iH13 = hk0Var.h(3);
                                hk0Var.f(2);
                                int iH14 = hk0Var.h(8);
                                int iH15 = hk0Var.h(8);
                                int iH16 = hk0Var.h(4);
                                int iH17 = hk0Var.h(2);
                                hk0Var.f(2);
                                int i21 = iH6 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i21 > 0) {
                                    int iH18 = hk0Var.h(i19);
                                    int iH19 = hk0Var.h(2);
                                    hk0Var.h(2);
                                    int iH20 = hk0Var.h(12);
                                    hk0Var.f(4);
                                    int iH21 = hk0Var.h(12);
                                    int i22 = i21 - 6;
                                    if (iH19 == 1 || iH19 == 2) {
                                        hk0Var.h(8);
                                        hk0Var.h(8);
                                        i21 -= 8;
                                    } else {
                                        i21 = i22;
                                    }
                                    sparseArray4.put(iH18, new z6(iH20, iH21));
                                    i19 = 16;
                                }
                                y6 y6Var3 = new y6(iH10, zG, iH11, iH12, iH13, iH14, iH15, iH16, iH17, sparseArray4);
                                if (w4Var3.f17861b == 0 && (y6Var2 = (y6) sparseArray3.get(iH10)) != null) {
                                    int i23 = 0;
                                    while (true) {
                                        SparseArray sparseArray5 = y6Var2.j;
                                        if (i23 < sparseArray5.size()) {
                                            y6Var3.j.put(sparseArray5.keyAt(i23), (z6) sparseArray5.valueAt(i23));
                                            i23++;
                                        }
                                    }
                                }
                                sparseArray3.put(y6Var3.f18651a, y6Var3);
                                break;
                            }
                            break;
                        case 18:
                            if (iH5 == a7Var2.f9229a) {
                                u6 u6VarC = c(hk0Var, iH6);
                                a7Var2.f9232d.put(u6VarC.f17099a, u6VarC);
                                break;
                            } else if (iH5 == a7Var2.f9230b) {
                                u6 u6VarC2 = c(hk0Var, iH6);
                                a7Var2.f9234f.put(u6VarC2.f17099a, u6VarC2);
                                break;
                            }
                            break;
                        case 19:
                            if (iH5 == a7Var2.f9229a) {
                                w6 w6VarE = e(hk0Var);
                                a7Var2.f9233e.put(w6VarE.f17917a, w6VarE);
                                break;
                            } else if (iH5 == a7Var2.f9230b) {
                                w6 w6VarE2 = e(hk0Var);
                                a7Var2.g.put(w6VarE2.f17917a, w6VarE2);
                                break;
                            }
                            break;
                        case 20:
                            if (iH5 == a7Var2.f9229a) {
                                hk0Var.f(4);
                                boolean zG2 = hk0Var.g();
                                hk0Var.f(3);
                                int iH22 = hk0Var.h(16);
                                int iH23 = hk0Var.h(16);
                                if (zG2) {
                                    int iH24 = hk0Var.h(16);
                                    iH = hk0Var.h(16);
                                    iH3 = hk0Var.h(16);
                                    iH2 = hk0Var.h(16);
                                    i18 = iH24;
                                } else {
                                    iH = iH22;
                                    iH2 = iH23;
                                    i18 = 0;
                                    iH3 = 0;
                                }
                                a7Var2.f9235h = new v6(iH22, iH23, i18, iH, iH3, iH2);
                                break;
                            }
                            break;
                    }
                    hk0Var.l(iC - hk0Var.c());
                }
            }
        }
        w4 w4Var4 = a7Var2.f9236i;
        if (w4Var4 == null) {
            v41 v41Var = x41.f18307b;
            n6Var = new n6(u51.f17096e, -9223372036854775807L, -9223372036854775807L);
        } else {
            v6 v6Var2 = a7Var2.f9235h;
            if (v6Var2 == null) {
                v6Var2 = (v6) this.f9608d;
            }
            v6 v6Var3 = v6Var2;
            Bitmap bitmap = (Bitmap) this.g;
            if (bitmap == null || v6Var3.f17532a + 1 != bitmap.getWidth() || v6Var3.f17533b + 1 != ((Bitmap) this.g).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(v6Var3.f17532a + 1, v6Var3.f17533b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray6 = (SparseArray) w4Var4.f17862c;
            int i24 = 0;
            while (i24 < sparseArray6.size()) {
                canvas.save();
                x6 x6Var = (x6) sparseArray6.valueAt(i24);
                y6 y6Var4 = (y6) a7Var2.f9231c.get(sparseArray6.keyAt(i24));
                int i25 = x6Var.f18312a + v6Var3.f17534c;
                int i26 = x6Var.f18313b + v6Var3.f17536e;
                int i27 = y6Var4.f18653c;
                int i28 = i25 + i27;
                int iMin = Math.min(i28, v6Var3.f17535d);
                boolean z10 = z3;
                int i29 = y6Var4.f18654d;
                int i30 = i26 + i29;
                canvas.clipRect(i25, i26, iMin, Math.min(i30, v6Var3.f17537f));
                int i31 = y6Var4.f18656f;
                u6 u6Var = (u6) a7Var2.f9232d.get(i31);
                if (u6Var == null && (u6Var = (u6) a7Var2.f9234f.get(i31)) == null) {
                    u6Var = (u6) this.f9609e;
                }
                SparseArray sparseArray7 = y6Var4.j;
                SparseArray sparseArray8 = sparseArray6;
                int i32 = i26;
                int i33 = 0;
                while (i33 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i33);
                    int i34 = i33;
                    z6 z6Var = (z6) sparseArray7.valueAt(i33);
                    int i35 = i25;
                    w6 w6Var = (w6) a7Var2.f9233e.get(iKeyAt);
                    if (w6Var == null) {
                        w6Var = (w6) a7Var2.g.get(iKeyAt);
                    }
                    w6 w6Var2 = w6Var;
                    if (w6Var2 != null) {
                        Paint paint = w6Var2.f17918b ? null : (Paint) this.f9605a;
                        a7Var = a7Var2;
                        int i36 = y6Var4.f18655e;
                        y6 y6Var5 = y6Var4;
                        int i37 = i35 + z6Var.f19025a;
                        int i38 = i32 + z6Var.f19026b;
                        int[] iArr = i36 == 3 ? u6Var.f17102d : i36 == 2 ? u6Var.f17101c : u6Var.f17100b;
                        y6Var = y6Var5;
                        v6Var = v6Var3;
                        i16 = i28;
                        sparseArray = sparseArray7;
                        Paint paint2 = paint;
                        i15 = i35;
                        arrayList = arrayList2;
                        i17 = i27;
                        i14 = i29;
                        int i39 = i32;
                        i12 = i24;
                        i13 = i39;
                        l(w6Var2.f17919c, iArr, i36, i37, i38, paint2, canvas);
                        l(w6Var2.f17920d, iArr, i36, i37, i38 + 1, paint2, canvas);
                    } else {
                        int i40 = i32;
                        i12 = i24;
                        i13 = i40;
                        a7Var = a7Var2;
                        y6Var = y6Var4;
                        sparseArray = sparseArray7;
                        v6Var = v6Var3;
                        i14 = i29;
                        i15 = i35;
                        i16 = i28;
                        arrayList = arrayList2;
                        i17 = i27;
                    }
                    int i41 = i12;
                    i32 = i13;
                    i24 = i41;
                    y6Var4 = y6Var;
                    i25 = i15;
                    i33 = i34 + 1;
                    i28 = i16;
                    i27 = i17;
                    arrayList2 = arrayList;
                    a7Var2 = a7Var;
                    v6Var3 = v6Var;
                    sparseArray7 = sparseArray;
                    i29 = i14;
                }
                int i42 = i32;
                int i43 = i24;
                a7 a7Var3 = a7Var2;
                y6 y6Var6 = y6Var4;
                int i44 = i25;
                v6 v6Var4 = v6Var3;
                int i45 = i29;
                ArrayList arrayList3 = arrayList2;
                int i46 = i27;
                int i47 = i28;
                float f10 = i42;
                float f11 = i44;
                if (y6Var6.f18652b) {
                    int i48 = y6Var6.f18655e;
                    c10 = 3;
                    if (i48 == 3) {
                        i11 = u6Var.f17102d[y6Var6.g];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        i11 = i48 == 2 ? u6Var.f17101c[y6Var6.f18657h] : u6Var.f17100b[y6Var6.f18658i];
                    }
                    Paint paint3 = (Paint) this.f9606b;
                    paint3.setColor(i11);
                    c9 = c11;
                    canvas.drawRect(f11, f10, i47, i30, paint3);
                } else {
                    c9 = 2;
                    c10 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.g, i44, i42, i46, i45);
                float f12 = v6Var4.f17532a;
                float f13 = f11 / f12;
                float f14 = v6Var4.f17533b;
                w40 w40Var = new w40(null, null, null, bitmapCreateBitmap2, f10 / f14, 0, 0, f13, 0, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, i46 / f12, i45 / f14, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0);
                arrayList2 = arrayList3;
                arrayList2.add(w40Var);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i24 = i43 + 1;
                v6Var3 = v6Var4;
                sparseArray6 = sparseArray8;
                a7Var2 = a7Var3;
                z3 = z10;
            }
            n6Var = new n6(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        cVar.mo160c(n6Var);
    }

    public ek1 h() throws GeneralSecurityException {
        ne0 ne0Var;
        ne0 ne0Var2;
        fk1 fk1Var = (fk1) this.f9605a;
        if (fk1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        ne0 ne0Var3 = (ne0) this.f9607c;
        if (ne0Var3 == null || (ne0Var = (ne0) this.f9608d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        ne0 ne0Var4 = (ne0) this.f9606b;
        if (ne0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        ne0 ne0Var5 = (ne0) this.f9609e;
        if (ne0Var5 == null || (ne0Var2 = (ne0) this.f9610f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        ne0 ne0Var6 = (ne0) this.g;
        if (ne0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = fk1Var.f11195c.f10151b;
        BigInteger bigInteger2 = fk1Var.f11196d;
        BigInteger bigInteger3 = (BigInteger) ne0Var3.f14280b;
        BigInteger bigInteger4 = (BigInteger) ne0Var.f14280b;
        BigInteger bigInteger5 = (BigInteger) ne0Var4.f14280b;
        BigInteger bigInteger6 = (BigInteger) ne0Var5.f14280b;
        BigInteger bigInteger7 = (BigInteger) ne0Var2.f14280b;
        BigInteger bigInteger8 = (BigInteger) ne0Var6.f14280b;
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
            return new ek1((fk1) this.f9605a, (ne0) this.f9607c, (ne0) this.f9608d, (ne0) this.f9606b, (ne0) this.f9609e, (ne0) this.f9610f, (ne0) this.g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public lk1 i() throws GeneralSecurityException {
        ne0 ne0Var;
        ne0 ne0Var2;
        mk1 mk1Var = (mk1) this.f9605a;
        if (mk1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        ne0 ne0Var3 = (ne0) this.f9607c;
        if (ne0Var3 == null || (ne0Var = (ne0) this.f9608d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        ne0 ne0Var4 = (ne0) this.f9606b;
        if (ne0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        ne0 ne0Var5 = (ne0) this.f9609e;
        if (ne0Var5 == null || (ne0Var2 = (ne0) this.f9610f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        ne0 ne0Var6 = (ne0) this.g;
        if (ne0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = mk1Var.f13926c.f13184b;
        BigInteger bigInteger2 = mk1Var.f13927d;
        BigInteger bigInteger3 = (BigInteger) ne0Var3.f14280b;
        BigInteger bigInteger4 = (BigInteger) ne0Var.f14280b;
        BigInteger bigInteger5 = (BigInteger) ne0Var4.f14280b;
        BigInteger bigInteger6 = (BigInteger) ne0Var5.f14280b;
        BigInteger bigInteger7 = (BigInteger) ne0Var2.f14280b;
        BigInteger bigInteger8 = (BigInteger) ne0Var6.f14280b;
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
            return new lk1((mk1) this.f9605a, (ne0) this.f9607c, (ne0) this.f9608d, (ne0) this.f9606b, (ne0) this.f9609e, (ne0) this.f9610f, (ne0) this.g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ b7(boolean z3) {
        this.f9605a = null;
        this.f9606b = null;
        this.f9607c = null;
        this.f9608d = null;
        this.f9609e = null;
        this.f9610f = null;
        this.g = null;
    }

    public b7() {
        this.f9610f = new x.n0(0);
        this.g = new x.n0(0);
    }

    public b7(Context context, String str, va.d2 d2Var, ab.b bVar) {
        this.f9610f = new yq();
        this.f9606b = context;
        this.f9607c = str;
        this.f9608d = d2Var;
        this.f9609e = bVar;
        this.g = va.b3.f36034a;
    }

    public b7(u70 u70Var, WebView webView, String str, String str2, ut0 ut0Var) {
        this.f9607c = new ArrayList();
        this.f9608d = new HashMap();
        this.f9605a = u70Var;
        this.f9606b = webView;
        this.g = ut0Var;
        this.f9610f = str;
        this.f9609e = str2;
    }
}
