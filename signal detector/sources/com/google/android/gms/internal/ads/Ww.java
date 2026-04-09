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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import t2.C2909E;

/* loaded from: classes.dex */
public final class Ww implements Eu, w.i, InterfaceC0664Om {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f12343f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12344a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12345b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12346c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12347d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12348e;

    public /* synthetic */ Ww(P.g gVar, boolean z6, ArrayList arrayList, F8 f8, K8 k8) {
        this.f12345b = gVar;
        this.f12344a = z6;
        this.f12346c = arrayList;
        this.f12347d = f8;
        this.f12348e = k8;
    }

    public static Ww a(Sv sv, Uv uv, Wv wv, Wv wv2, boolean z6) {
        if (wv == Wv.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Sv sv2 = Sv.DEFINED_BY_JAVASCRIPT;
        Wv wv3 = Wv.NATIVE;
        if (sv == sv2 && wv == wv3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (uv == Uv.DEFINED_BY_JAVASCRIPT && wv == wv3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new Ww(sv, uv, wv, wv2, z6);
    }

    public static String m(C1999v7 c1999v7) {
        C2161y7 c2161y7H = C2215z7.H();
        String strA = c1999v7.A().A();
        c2161y7H.b();
        ((C2215z7) c2161y7H.f13551b).J(strA);
        String strB = c1999v7.A().B();
        c2161y7H.b();
        ((C2215z7) c2161y7H.f13551b).K(strB);
        long jD = c1999v7.A().D();
        c2161y7H.b();
        ((C2215z7) c2161y7H.f13551b).M(jD);
        long jE = c1999v7.A().E();
        c2161y7H.b();
        ((C2215z7) c2161y7H.f13551b).N(jE);
        long jC = c1999v7.A().C();
        c2161y7H.b();
        ((C2215z7) c2161y7H.f13551b).L(jC);
        return Q2.b.b(((C2215z7) c2161y7H.d()).b());
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1621o6 c1621o6A = C1675p6.A();
        c1621o6A.b();
        ((C1675p6) c1621o6A.f13551b).E(5);
        OK okR = QK.r(0, bArr.length, bArr);
        c1621o6A.b();
        ((C1675p6) c1621o6A.f13551b).B(okR);
        return Base64.encodeToString(((C1675p6) c1621o6A.d()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) throws SQLException {
        long j6;
        C0548Hp c0548Hp = (C0548Hp) ((P.g) this.f12345b).f3118b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C2909E) c0548Hp.f662a).E()) {
            return null;
        }
        K8 k8 = (K8) this.f12348e;
        F8 f8 = (F8) this.f12347d;
        ArrayList arrayList = (ArrayList) this.f12346c;
        boolean z6 = this.f12344a;
        H8 h8Q = I8.Q();
        h8Q.b();
        ((I8) h8Q.f13551b).E(arrayList);
        Context context = c0548Hp.f9002c;
        int i = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        h8Q.b();
        ((I8) h8Q.f13551b).H(i);
        TelephonyManager telephonyManager = c0548Hp.f9004e;
        p2.j jVar = p2.j.f22785C;
        int iP = jVar.f22793f.p(context, telephonyManager);
        h8Q.b();
        ((I8) h8Q.f13551b).I(iP);
        C0514Fp c0514Fp = c0548Hp.f9005f;
        synchronized (c0514Fp.f8197h) {
            j6 = c0514Fp.f8192c;
        }
        h8Q.b();
        ((I8) h8Q.f13551b).C(j6);
        long jF = c0514Fp.f();
        h8Q.b();
        ((I8) h8Q.f13551b).D(jF);
        int iD = c0514Fp.d();
        h8Q.b();
        ((I8) h8Q.f13551b).J(iD);
        h8Q.b();
        ((I8) h8Q.f13551b).L(k8);
        h8Q.b();
        ((I8) h8Q.f13551b).F(f8);
        int i3 = c0548Hp.f9006g;
        h8Q.b();
        ((I8) h8Q.f13551b).K(i3);
        int i6 = z6 ? 2 : 1;
        h8Q.b();
        ((I8) h8Q.f13551b).B(i6);
        long jB = c0514Fp.b();
        h8Q.b();
        ((I8) h8Q.f13551b).M(jB);
        jVar.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        h8Q.b();
        ((I8) h8Q.f13551b).A(jCurrentTimeMillis);
        int i7 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        h8Q.b();
        ((I8) h8Q.f13551b).G(i7);
        byte[] bArrB = ((I8) h8Q.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z6) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        AbstractC0582Jp.V(sQLiteDatabase, c0548Hp.f9005f.b(), bArrB);
        return null;
    }

    public synchronized String c(Context context) {
        byte[] bArrQ;
        try {
            HashMap mapC = ((InterfaceC0908ax) this.f12347d).c();
            mapC.put("f", "q");
            mapC.put("ctx", context);
            mapC.put("aid", null);
            bArrQ = q(mapC);
            if (this.f12344a) {
                mapC.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(bArrQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.google.android.gms.internal.ads.C1999v7 r17, com.google.android.gms.internal.ads.C1994v2 r18) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ww.d(com.google.android.gms.internal.ads.v7, com.google.android.gms.internal.ads.v2):boolean");
    }

    public synchronized String e(Context context, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapF = ((InterfaceC0908ax) this.f12347d).f();
            mapF.put("f", "v");
            mapF.put("ctx", context);
            mapF.put("aid", null);
            mapF.put("view", view);
            mapF.put("act", activity);
            bArrQ = q(mapF);
            if (this.f12344a) {
                mapF.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(bArrQ);
    }

    public boolean f(C1999v7 c1999v7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f12343f) {
            try {
                if (!AbstractC0582Jp.A(new File(i(c1999v7.A().A()), "pcbc"), c1999v7.C().u())) {
                    p(4020, jCurrentTimeMillis);
                    return false;
                }
                String strM = m(c1999v7);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f12346c).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f12347d)), strM);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    p(5015, jCurrentTimeMillis);
                } else {
                    p(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String g(Context context, String str, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapM = ((InterfaceC0908ax) this.f12347d).m();
            mapM.put("f", "c");
            mapM.put("ctx", context);
            mapM.put("cs", str);
            mapM.put("aid", null);
            mapM.put("view", view);
            mapM.put("act", activity);
            bArrQ = q(mapM);
            if (this.f12344a) {
                mapM.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(bArrQ);
    }

    public synchronized void h(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapB = ((InterfaceC0908ax) this.f12347d).b();
            mapB.put("aid", null);
            mapB.put("evt", motionEvent);
            Object obj = this.f12345b;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapB);
            ((Cw) this.f12348e).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e6) {
            throw new Xw(e6, 2005);
        }
    }

    public File i(String str) {
        return new File(new File(((Context) this.f12345b).getDir("pccache", 0), (String) this.f12347d), str);
    }

    public synchronized boolean j() {
        Object obj;
        try {
            obj = this.f12345b;
        } catch (Exception e6) {
            throw new Xw(e6, 2001);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void k() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.f12345b;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((Cw) this.f12348e).b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e6) {
            throw new Xw(e6, 2003);
        }
    }

    public synchronized int l() {
        Object obj;
        try {
            obj = this.f12345b;
        } catch (Exception e6) {
            throw new Xw(e6, 2006);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    @Override // w.i
    public /* synthetic */ Object o(w.h hVar) {
        C1612ny c1612ny = (C1612ny) this.f12345b;
        c1612ny.f15849a.execute(new RunnableC1504ly(c1612ny, (String) this.f12347d, hVar, this.f12344a, (String) this.f12346c, (byte[]) this.f12348e));
        return "";
    }

    public void p(int i, long j6) {
        ((Mw) this.f12348e).k(i, j6);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f12345b;
        } catch (Exception e6) {
            ((Cw) this.f12348e).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e6);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public C2215z7 r(int i) {
        XK xkA;
        String str = (String) this.f12347d;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f12346c;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrI = Q2.b.i(string);
                OK okR = QK.r(0, bArrI.length, bArrI);
                if (this.f12344a) {
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    xkA = XK.f12413b;
                } else {
                    xkA = XK.a();
                }
                return C2215z7.G(okR, xkA);
            } catch (C1636oL unused) {
            } catch (NullPointerException unused2) {
                p(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ Ww(C1612ny c1612ny, String str, boolean z6, String str2, byte[] bArr) {
        this.f12345b = c1612ny;
        this.f12347d = str;
        this.f12344a = z6;
        this.f12346c = str2;
        this.f12348e = bArr;
    }

    public /* synthetic */ Ww(Object obj, Object obj2, Object obj3, Object obj4, boolean z6) {
        this.f12345b = obj;
        this.f12346c = obj2;
        this.f12347d = obj3;
        this.f12348e = obj4;
        this.f12344a = z6;
    }

    public Ww(Context context, EnumC1945u7 enumC1945u7, Mw mw, boolean z6) {
        this.f12344a = false;
        this.f12345b = context;
        this.f12347d = Integer.toString(enumC1945u7.f17066a);
        this.f12346c = context.getSharedPreferences("pcvmspf", 0);
        this.f12348e = mw;
        this.f12344a = z6;
    }

    public Ww(Sv sv, Uv uv, Wv wv, Wv wv2, boolean z6) {
        this.f12347d = sv;
        this.f12348e = uv;
        this.f12345b = wv;
        this.f12346c = wv2;
        this.f12344a = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0664Om, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC1964uQ) obj).n(0, ((C2233zP) this.f12345b).f17874a, (C1319iQ) this.f12346c, (C1587nQ) this.f12347d, (IOException) this.f12348e, this.f12344a);
    }
}
