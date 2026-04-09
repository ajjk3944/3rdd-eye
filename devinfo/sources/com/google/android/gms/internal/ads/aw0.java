package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class aw0 implements lr0, h3.i, jb0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f9455f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9456a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9457b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9458c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9459d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9460e;

    public /* synthetic */ aw0(a4.d dVar, boolean z3, ArrayList arrayList, qi qiVar, vi viVar) {
        this.f9457b = dVar;
        this.f9456a = z3;
        this.f9458c = arrayList;
        this.f9459d = qiVar;
        this.f9460e = viVar;
    }

    public static aw0 a(wt0 wt0Var, yt0 yt0Var, au0 au0Var, au0 au0Var2, boolean z3) {
        if (au0Var == au0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        wt0 wt0Var2 = wt0.DEFINED_BY_JAVASCRIPT;
        au0 au0Var3 = au0.NATIVE;
        if (wt0Var == wt0Var2 && au0Var == au0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (yt0Var == yt0.DEFINED_BY_JAVASCRIPT && au0Var == au0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new aw0(wt0Var, yt0Var, au0Var, au0Var2, z3);
    }

    public static String n(gg ggVar) {
        jg jgVarH = kg.H();
        String strA = ggVar.A().A();
        jgVarH.b();
        ((kg) jgVarH.f14755b).J(strA);
        String strB = ggVar.A().B();
        jgVarH.b();
        ((kg) jgVarH.f14755b).K(strB);
        long jD = ggVar.A().D();
        jgVarH.b();
        ((kg) jgVarH.f14755b).M(jD);
        long jE = ggVar.A().E();
        jgVarH.b();
        ((kg) jgVarH.f14755b).N(jE);
        long jC = ggVar.A().C();
        jgVarH.b();
        ((kg) jgVarH.f14755b).L(jC);
        return tb.b.b(((kg) jgVarH.e()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        vd vdVarA = wd.A();
        vdVarA.b();
        ((wd) vdVarA.f14755b).E(5);
        zm1 zm1VarV = bn1.v(0, bArr.length, bArr);
        vdVarA.b();
        ((wd) vdVarA.f14755b).B(zm1VarV);
        return Base64.encodeToString(((wd) vdVarA.e()).b(), 11);
    }

    public synchronized String b(Context context) {
        byte[] bArrQ;
        try {
            HashMap mapA = ((ew0) this.f9459d).a();
            mapA.put("f", "q");
            mapA.put("ctx", context);
            mapA.put("aid", null);
            bArrQ = q(mapA);
            if (this.f9456a) {
                mapA.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) throws SQLException {
        long j;
        gh0 gh0Var = (gh0) ((a4.d) this.f9457b).f189b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((ya.c0) gh0Var.f1325a).E()) {
            return null;
        }
        vi viVar = (vi) this.f9460e;
        qi qiVar = (qi) this.f9459d;
        ArrayList arrayList = (ArrayList) this.f9458c;
        boolean z3 = this.f9456a;
        si siVarQ = ti.Q();
        siVarQ.b();
        ((ti) siVarQ.f14755b).E(arrayList);
        Context context = gh0Var.f11521c;
        int i4 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        siVarQ.b();
        ((ti) siVarQ.f14755b).H(i4);
        TelephonyManager telephonyManager = gh0Var.f11523e;
        ua.j jVar = ua.j.C;
        int iJ = jVar.f35264f.J(context, telephonyManager);
        siVarQ.b();
        ((ti) siVarQ.f14755b).I(iJ);
        eh0 eh0Var = gh0Var.f11524f;
        synchronized (eh0Var.f10791h) {
            j = eh0Var.f10787c;
        }
        siVarQ.b();
        ((ti) siVarQ.f14755b).C(j);
        long jF = eh0Var.f();
        siVarQ.b();
        ((ti) siVarQ.f14755b).D(jF);
        int iD = eh0Var.d();
        siVarQ.b();
        ((ti) siVarQ.f14755b).J(iD);
        siVarQ.b();
        ((ti) siVarQ.f14755b).L(viVar);
        siVarQ.b();
        ((ti) siVarQ.f14755b).F(qiVar);
        int i10 = gh0Var.g;
        siVarQ.b();
        ((ti) siVarQ.f14755b).K(i10);
        int i11 = z3 ? 2 : 1;
        siVarQ.b();
        ((ti) siVarQ.f14755b).B(i11);
        long jB = eh0Var.b();
        siVarQ.b();
        ((ti) siVarQ.f14755b).M(jB);
        jVar.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        siVarQ.b();
        ((ti) siVarQ.f14755b).A(jCurrentTimeMillis);
        int i12 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        siVarQ.b();
        ((ti) siVarQ.f14755b).G(i12);
        byte[] bArrB = ((ti) siVarQ.e()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z3) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        nn1.w(sQLiteDatabase, gh0Var.f11524f.b(), bArrB);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.google.android.gms.internal.ads.gg r17, com.google.android.gms.internal.ads.w5 r18) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aw0.d(com.google.android.gms.internal.ads.gg, com.google.android.gms.internal.ads.w5):boolean");
    }

    public synchronized String e(Context context, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapZzc = ((ew0) this.f9459d).zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrQ = q(mapZzc);
            if (this.f9456a) {
                mapZzc.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    public boolean f(gg ggVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f9455f) {
            try {
                if (!mq0.A(new File(j(ggVar.A().A()), "pcbc"), ggVar.C().y())) {
                    p(4020, jCurrentTimeMillis);
                    return false;
                }
                String strN = n(ggVar);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f9458c).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f9459d)), strN);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    p(5015, jCurrentTimeMillis);
                } else {
                    p(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized String g(Context context, String str, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapF = ((ew0) this.f9459d).f();
            mapF.put("f", "c");
            mapF.put("ctx", context);
            mapF.put("cs", str);
            mapF.put("aid", null);
            mapF.put("view", view);
            mapF.put("act", activity);
            bArrQ = q(mapF);
            if (this.f9456a) {
                mapF.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    public synchronized void h(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapC = ((ew0) this.f9459d).c();
            mapC.put("aid", null);
            mapC.put("evt", motionEvent);
            Object obj = this.f9457b;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapC);
            ((gv0) this.f9460e).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new bw0(2005, e2);
        }
    }

    @Override // h3.i
    public /* synthetic */ Object i(h3.h hVar) {
        cy0 cy0Var = (cy0) this.f9457b;
        cy0Var.f10259a.execute(new ay0(cy0Var, (String) this.f9459d, hVar, this.f9456a, (String) this.f9458c, (byte[]) this.f9460e));
        return "";
    }

    public File j(String str) {
        return new File(new File(((Context) this.f9457b).getDir("pccache", 0), (String) this.f9459d), str);
    }

    public synchronized boolean k() {
        Object obj;
        try {
            obj = this.f9457b;
        } catch (Exception e2) {
            throw new bw0(AdError.INTERNAL_ERROR_CODE, e2);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void l() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.f9457b;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((gv0) this.f9460e).b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new bw0(AdError.INTERNAL_ERROR_2003, e2);
        }
    }

    public synchronized int m() {
        Object obj;
        try {
            obj = this.f9457b;
        } catch (Exception e2) {
            throw new bw0(AdError.INTERNAL_ERROR_2006, e2);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public void p(int i4, long j) {
        ((qv0) this.f9460e).k(i4, j);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f9457b;
        } catch (Exception e2) {
            ((gv0) this.f9460e).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public kg r(int i4) {
        jn1 jn1VarA;
        String str = (String) this.f9459d;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f9458c;
        String string = i4 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrL = tb.b.l(string);
                zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
                if (this.f9456a) {
                    jn1 jn1Var = jn1.f12801a;
                    int i10 = um1.f17262a;
                    jn1VarA = jn1.f12802b;
                } else {
                    jn1VarA = jn1.a();
                }
                return kg.G(zm1VarV, jn1VarA);
            } catch (ao1 unused) {
            } catch (NullPointerException unused2) {
                p(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ aw0(cy0 cy0Var, String str, boolean z3, String str2, byte[] bArr) {
        this.f9457b = cy0Var;
        this.f9459d = str;
        this.f9456a = z3;
        this.f9458c = str2;
        this.f9460e = bArr;
    }

    public /* synthetic */ aw0(Object obj, Object obj2, Object obj3, Object obj4, boolean z3) {
        this.f9457b = obj;
        this.f9458c = obj2;
        this.f9459d = obj3;
        this.f9460e = obj4;
        this.f9456a = z3;
    }

    public aw0(Context context, fg fgVar, qv0 qv0Var, boolean z3) {
        this.f9456a = false;
        this.f9457b = context;
        this.f9459d = Integer.toString(fgVar.f11160a);
        this.f9458c = context.getSharedPreferences("pcvmspf", 0);
        this.f9460e = qv0Var;
        this.f9456a = z3;
    }

    public aw0(wt0 wt0Var, yt0 yt0Var, au0 au0Var, au0 au0Var2, boolean z3) {
        this.f9459d = wt0Var;
        this.f9460e = yt0Var;
        this.f9457b = au0Var;
        this.f9458c = au0Var2;
        this.f9456a = z3;
    }

    @Override // com.google.android.gms.internal.ads.jb0, com.google.android.gms.internal.ads.rd0
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ void mo160c(Object obj) {
        ((oy1) obj).i(0, (jy1) ((l90) this.f9457b).f13426b, (cy1) this.f9458c, (a0.c0) this.f9459d, (IOException) this.f9460e, this.f9456a);
    }
}
