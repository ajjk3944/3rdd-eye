package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class de3 implements o93, zc, np2 {
    public static final Object k = new Object();
    public boolean f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;

    public /* synthetic */ de3(nb nbVar, boolean z, ArrayList arrayList, hx1 hx1Var, mx1 mx1Var) {
        this.g = nbVar;
        this.f = z;
        this.h = arrayList;
        this.i = hx1Var;
        this.j = mx1Var;
    }

    public static de3 b(yb3 yb3Var, bc3 bc3Var, dc3 dc3Var, dc3 dc3Var2, boolean z) {
        if (dc3Var == dc3.i) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        yb3 yb3Var2 = yb3.g;
        dc3 dc3Var3 = dc3.g;
        if (yb3Var == yb3Var2 && dc3Var == dc3Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (bc3Var == bc3.g && dc3Var == dc3Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new de3(yb3Var, bc3Var, dc3Var, dc3Var2, z);
    }

    public static String n(bv1 bv1Var) {
        ev1 ev1VarH = fv1.H();
        String strA = bv1Var.A().A();
        ev1VarH.b();
        ((fv1) ev1VarH.g).J(strA);
        String strB = bv1Var.A().B();
        ev1VarH.b();
        ((fv1) ev1VarH.g).K(strB);
        long jD = bv1Var.A().D();
        ev1VarH.b();
        ((fv1) ev1VarH.g).M(jD);
        long jE = bv1Var.A().E();
        ev1VarH.b();
        ((fv1) ev1VarH.g).N(jE);
        long jC = bv1Var.A().C();
        ev1VarH.b();
        ((fv1) ev1VarH.g).L(jC);
        return uk2.c(((fv1) ev1VarH.d()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        bs1 bs1VarA = cs1.A();
        bs1VarA.b();
        ((cs1) bs1VarA.g).E(5);
        y44 y44VarN = a54.n(bArr, 0, bArr.length);
        bs1VarA.b();
        ((cs1) bs1VarA.g).B(y44VarN);
        return Base64.encodeToString(((cs1) bs1VarA.d()).b(), 11);
    }

    public synchronized String a(Context context) {
        byte[] bArrQ;
        try {
            HashMap mapD = ((ge3) this.i).d();
            mapD.put("f", "q");
            mapD.put("ctx", context);
            mapD.put("aid", null);
            bArrQ = q(mapD);
            if (this.f) {
                mapD.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(bArrQ);
    }

    @Override // defpackage.o93
    public Object c(Object obj) throws SQLException {
        long j;
        long j2;
        int i;
        gz2 gz2Var = (gz2) ((nb) this.g).g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((ra4) gz2Var.a).s()) {
            return null;
        }
        mx1 mx1Var = (mx1) this.j;
        hx1 hx1Var = (hx1) this.i;
        ArrayList arrayList = (ArrayList) this.h;
        boolean z = this.f;
        jx1 jx1VarQ = kx1.Q();
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).E(arrayList);
        Context context = gz2Var.c;
        int i2 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).H(i2);
        TelephonyManager telephonyManager = gz2Var.e;
        hg4 hg4Var = hg4.C;
        hg4Var.f.getClass();
        int i3 = (lf4.c(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).I(i3);
        ez2 ez2Var = gz2Var.f;
        synchronized (ez2Var.h) {
            j = ez2Var.c;
        }
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).C(j);
        synchronized (ez2Var) {
            synchronized (ez2Var.j) {
                j2 = ez2Var.e;
            }
        }
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).D(j2);
        synchronized (ez2Var.g) {
            i = ez2Var.b;
        }
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).J(i);
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).L(mx1Var);
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).F(hx1Var);
        int i4 = gz2Var.g;
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).K(i4);
        int i5 = z ? 2 : 1;
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).B(i5);
        long jA = ez2Var.a();
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).M(jA);
        hg4Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).A(jCurrentTimeMillis);
        int i6 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).G(i6);
        byte[] bArrB = ((kx1) jx1VarQ.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        wl2.R(sQLiteDatabase, gz2Var.f.a(), bArrB);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x00a9, B:33:0x00c9, B:34:0x00ce, B:36:0x00d0, B:38:0x00de, B:39:0x00e3, B:42:0x00e7, B:47:0x00f1, B:48:0x00f7, B:50:0x00f9, B:52:0x012f, B:53:0x0140, B:55:0x0146, B:56:0x014b, B:58:0x014d, B:60:0x0158, B:61:0x015f, B:63:0x0166, B:64:0x016d, B:66:0x0187, B:68:0x0193, B:69:0x0196, B:70:0x0199, B:71:0x019e, B:23:0x0086, B:25:0x008c, B:28:0x0097, B:29:0x00a7), top: B:77:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(defpackage.bv1 r17, defpackage.us0 r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.d(bv1, us0):boolean");
    }

    public synchronized String e(Context context, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapH = ((ge3) this.i).h();
            mapH.put("f", "v");
            mapH.put("ctx", context);
            mapH.put("aid", null);
            mapH.put("view", view);
            mapH.put("act", activity);
            bArrQ = q(mapH);
            if (this.f) {
                mapH.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(bArrQ);
    }

    @Override // defpackage.zc
    public /* synthetic */ Object f(yc ycVar) {
        hg3 hg3Var = (hg3) this.g;
        hg3Var.a.execute(new fg3(hg3Var, (String) this.i, ycVar, this.f, (String) this.h, (byte[]) this.j));
        return "";
    }

    public boolean g(bv1 bv1Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (k) {
            try {
                if (!uk2.P(new File(j(bv1Var.A().A()), "pcbc"), bv1Var.C().p())) {
                    p(4020, jCurrentTimeMillis);
                    return false;
                }
                String strN = n(bv1Var);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.h).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.i)), strN);
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

    public synchronized String h(Context context, String str, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapL = ((ge3) this.i).l();
            mapL.put("f", "c");
            mapL.put("ctx", context);
            mapL.put("cs", str);
            mapL.put("aid", null);
            mapL.put("view", view);
            mapL.put("act", activity);
            bArrQ = q(mapL);
            if (this.f) {
                mapL.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(bArrQ);
    }

    public synchronized void i(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapB = ((ge3) this.i).b();
            mapB.put("aid", null);
            mapB.put("evt", motionEvent);
            Object obj = this.g;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapB);
            ((gd3) this.j).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new ee3(2005, e);
        }
    }

    public File j(String str) {
        return new File(new File(((Context) this.g).getDir("pccache", 0), (String) this.i), str);
    }

    public synchronized boolean k() {
        Object obj;
        try {
            obj = this.g;
        } catch (Exception e) {
            throw new ee3(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void l() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.g;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((gd3) this.j).b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new ee3(2003, e);
        }
    }

    public synchronized int m() {
        Object obj;
        try {
            obj = this.g;
        } catch (Exception e) {
            throw new ee3(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public void p(int i, long j) {
        ((sd3) this.j).o(i, j);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.g;
        } catch (Exception e) {
            ((gd3) this.j).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public fv1 r(int i) {
        h54 h54VarA;
        String str = (String) this.i;
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrX = uk2.x(string);
                y44 y44VarN = a54.n(bArrX, 0, bArrX.length);
                if (this.f) {
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    h54VarA = h54.b;
                } else {
                    h54VarA = h54.a();
                }
                return fv1.G(y44VarN, h54VarA);
            } catch (a64 unused) {
            } catch (NullPointerException unused2) {
                p(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ de3(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.f = z;
    }

    public /* synthetic */ de3(hg3 hg3Var, String str, boolean z, String str2, byte[] bArr) {
        this.g = hg3Var;
        this.i = str;
        this.f = z;
        this.h = str2;
        this.j = bArr;
    }

    public de3(Context context, av1 av1Var, sd3 sd3Var, boolean z) {
        this.f = false;
        this.g = context;
        this.i = Integer.toString(av1Var.f);
        this.h = context.getSharedPreferences("pcvmspf", 0);
        this.j = sd3Var;
        this.f = z;
    }

    public de3(yb3 yb3Var, bc3 bc3Var, dc3 dc3Var, dc3 dc3Var2, boolean z) {
        this.i = yb3Var;
        this.j = bc3Var;
        this.g = dc3Var;
        this.h = dc3Var2;
        this.f = z;
    }

    public de3(Context context) {
        this.g = context;
        this.h = ae4.c;
    }

    @Override // defpackage.np2
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ void mo6c(Object obj) {
        ((rh4) obj).o(0, (kh4) ((wt2) this.g).g, (ch4) this.h, (hh4) this.i, (IOException) this.j, this.f);
    }
}
