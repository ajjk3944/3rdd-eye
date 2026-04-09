package androidx.recyclerview.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import com.bytedance.sdk.component.vt.ouw.lh;
import com.google.android.gms.internal.ads.cs0;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.e81;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fh0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hl;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.lr0;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.m91;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.nn1;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qq;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.si;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.w71;
import com.google.android.gms.internal.ads.ww;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.yr0;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import ya.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.z1, lr0, OnFailureListener, lh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1322a;

    /* renamed from: b, reason: collision with root package name */
    public long f1323b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1324c;

    public /* synthetic */ d(long j, Object obj, int i4) {
        this.f1322a = i4;
        this.f1323b = j;
        this.f1324c = obj;
    }

    public static final void u(qd0 qd0Var, String str, long j) {
        if (qd0Var != null) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Ud)).booleanValue()) {
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "lat_init");
                rtVarA.u(str, Long.toString(j));
                rtVarA.v();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y1
    public void B1() {
        ((com.google.android.gms.internal.ads.y1) this.f1324c).B1();
    }

    @Override // com.google.android.gms.internal.ads.y1
    public long F1() {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).F1() - this.f1323b;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public long G1() {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).G1() - this.f1323b;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public long H1() {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).H1() - this.f1323b;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public void J1(int i4) {
        ((com.google.android.gms.internal.ads.y1) this.f1324c).J1(i4);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public void K1(int i4) {
        ((com.google.android.gms.internal.ads.y1) this.f1324c).K1(i4);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public void L1(int i4, int i10, byte[] bArr) {
        ((com.google.android.gms.internal.ads.y1) this.f1324c).L1(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public void M1(int i4, int i10, byte[] bArr) {
        ((com.google.android.gms.internal.ads.y1) this.f1324c).M1(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public boolean N1(byte[] bArr, int i4, int i10, boolean z3) {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).N1(bArr, 0, i10, z3);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public boolean O1(byte[] bArr, int i4, int i10, boolean z3) {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).O1(bArr, 0, i10, z3);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public int P1(int i4, int i10, byte[] bArr) {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).P1(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((ya.c0) ((fh0) this.f1324c).f1325a).E()) {
            return null;
        }
        long j = this.f1323b;
        si siVarQ = ti.Q();
        siVarQ.b();
        ((ti) siVarQ.f14755b).M(j);
        byte[] bArrB = ((ti) siVarQ.e()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        nn1.w(sQLiteDatabase, j, bArrB);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public int d(int i4, int i10, byte[] bArr) {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).d(i4, i10, bArr);
    }

    public long e(long j, long j8, float f10) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long jH = o1.b.h(this.f1323b, o1.b.g(j, j8));
        this.f1323b = jH;
        if ((((d0.a1) this.f1324c) == null ? o1.b.c(jH) : Math.abs(n(jH))) < f10) {
            return 9205357640488583168L;
        }
        if (((d0.a1) this.f1324c) == null) {
            long j9 = this.f1323b;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) / o1.b.c(j9);
            return o1.b.g(this.f1323b, o1.b.i((4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) / r6)) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f10));
        }
        float fN = n(this.f1323b) - (Math.signum(n(this.f1323b)) * f10);
        long j10 = this.f1323b;
        d0.a1 a1Var = (d0.a1) this.f1324c;
        d0.a1 a1Var2 = d0.a1.f21663b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a1Var == a1Var2 ? j10 & 4294967295L : j10 >> 32));
        if (((d0.a1) this.f1324c) == a1Var2) {
            jFloatToRawIntBits = Float.floatToRawIntBits(fN);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
            iFloatToRawIntBits = Float.floatToRawIntBits(fN);
        }
        return (4294967295L & iFloatToRawIntBits) | (jFloatToRawIntBits << 32);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public int f() {
        return ((com.google.android.gms.internal.ads.y1) this.f1324c).f();
    }

    public void g(int i4) {
        if (i4 < 64) {
            this.f1323b &= ~(1 << i4);
            return;
        }
        d dVar = (d) this.f1324c;
        if (dVar != null) {
            dVar.g(i4 - 64);
        }
    }

    public int h(int i4) {
        d dVar = (d) this.f1324c;
        if (dVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f1323b) : Long.bitCount(this.f1323b & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f1323b & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f1323b) + dVar.h(i4 - 64);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void i() {
        ((com.google.android.gms.internal.ads.z1) this.f1324c).i();
    }

    public void j() {
        if (((d) this.f1324c) == null) {
            this.f1324c = new d(0);
        }
    }

    public boolean k(int i4) {
        if (i4 < 64) {
            return (this.f1323b & (1 << i4)) != 0;
        }
        j();
        return ((d) this.f1324c).k(i4 - 64);
    }

    public void l(int i4, boolean z3) {
        if (i4 >= 64) {
            j();
            ((d) this.f1324c).l(i4 - 64, z3);
            return;
        }
        long j = this.f1323b;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j8 = (1 << i4) - 1;
        this.f1323b = ((j & (~j8)) << 1) | (j & j8);
        if (z3) {
            s(i4);
        } else {
            g(i4);
        }
        if (z10 || ((d) this.f1324c) != null) {
            j();
            ((d) this.f1324c).l(0, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public u2 m(int i4, int i10) {
        return ((com.google.android.gms.internal.ads.z1) this.f1324c).m(i4, i10);
    }

    public float n(long j) {
        return Float.intBitsToFloat((int) (((d0.a1) this.f1324c) == d0.a1.f21663b ? j >> 32 : j & 4294967295L));
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void o(m2 m2Var) {
        ((com.google.android.gms.internal.ads.z1) this.f1324c).o(new s2(this, m2Var, m2Var));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        yb.e eVar = (yb.e) this.f1324c;
        ((AtomicLong) eVar.f37511d).set(this.f1323b);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.lh
    public void ouw(IOException iOException) {
        g9.b bVar = (g9.b) this.f1324c;
        g9.b.b(bVar, bVar.f24616b, 601, iOException.getMessage());
        g9.a.a(bVar.f24616b);
    }

    public rl.m p() {
        km.y yVar = new km.y(17);
        while (true) {
            String utf8LineStrict = ((hm.g) this.f1324c).readUtf8LineStrict(this.f1323b);
            this.f1323b -= utf8LineStrict.length();
            if (utf8LineStrict.length() == 0) {
                return yVar.x();
            }
            int iE0 = vk.i.E0(utf8LineStrict, ':', 1, 4);
            if (iE0 != -1) {
                String strSubstring = utf8LineStrict.substring(0, iE0);
                nk.k.d(strSubstring, "substring(...)");
                String strSubstring2 = utf8LineStrict.substring(iE0 + 1);
                nk.k.d(strSubstring2, "substring(...)");
                yVar.v(strSubstring, strSubstring2);
            } else if (utf8LineStrict.charAt(0) == ':') {
                String strSubstring3 = utf8LineStrict.substring(1);
                nk.k.d(strSubstring3, "substring(...)");
                yVar.v("", strSubstring3);
            } else {
                yVar.v("", utf8LineStrict);
            }
        }
    }

    public boolean q(int i4) {
        if (i4 >= 64) {
            j();
            return ((d) this.f1324c).q(i4 - 64);
        }
        long j = 1 << i4;
        long j8 = this.f1323b;
        boolean z3 = (j8 & j) != 0;
        long j9 = j8 & (~j);
        this.f1323b = j9;
        long j10 = j - 1;
        this.f1323b = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        d dVar = (d) this.f1324c;
        if (dVar != null) {
            if (dVar.k(0)) {
                s(63);
            }
            ((d) this.f1324c).q(0);
        }
        return z3;
    }

    public void r() {
        this.f1323b = 0L;
        d dVar = (d) this.f1324c;
        if (dVar != null) {
            dVar.r();
        }
    }

    public void s(int i4) {
        if (i4 < 64) {
            this.f1323b |= 1 << i4;
        } else {
            j();
            ((d) this.f1324c).s(i4 - 64);
        }
    }

    public void t(Context context, za.a aVar, boolean z3, ww wwVar, String str, String str2, Runnable runnable, final cs0 cs0Var, final qd0 qd0Var, final Long l10, boolean z10) throws JSONException {
        PackageInfo packageInfoE;
        ua.j jVar = ua.j.C;
        tb.a aVar2 = jVar.f35267k;
        tb.a aVar3 = jVar.f35267k;
        aVar2.getClass();
        if (SystemClock.elapsedRealtime() - this.f1323b < 5000) {
            za.i.h("Not retrying to fetch app settings");
            return;
        }
        aVar3.getClass();
        this.f1323b = SystemClock.elapsedRealtime();
        if (wwVar != null && !TextUtils.isEmpty(wwVar.f18213e)) {
            long j = wwVar.f18214f;
            aVar3.getClass();
            if (System.currentTimeMillis() - j <= ((Long) va.s.f36163e.f36166c.a(sk.R4)).longValue() && wwVar.f18215h) {
                return;
            }
        }
        if (context == null) {
            za.i.h("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            za.i.h("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f1324c = applicationContext;
        final yr0 yr0VarC = d7.C(4, context);
        yr0VarC.b();
        oq oqVarM = jVar.f35274r.m((Context) this.f1324c, aVar, cs0Var);
        hl hlVar = jz.f12889l;
        qq qqVarA = oqVarM.a("google.afma.config.fetchAppSettings", hlVar, hlVar);
        int i4 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str2);
            }
            jSONObject.put("is_init", z3);
            jSONObject.put("pn", context.getPackageName());
            pk pkVar = sk.f16033a;
            va.s sVar = va.s.f36163e;
            jSONObject.put("experiment_ids", TextUtils.join(",", sVar.f36164a.A()));
            jSONObject.put("js", aVar.f38129a);
            if (((Boolean) sVar.f36166c.a(sk.Na)).booleanValue()) {
                jSONObject.put("inspector_enabled", z10);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f1324c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoE = ub.b.a(context).e(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoE.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                ya.a0.m("Error fetching PackageInfo.");
            }
            vd.b bVarA = qqVarA.a(jSONObject);
            e81 e81Var = new e81() { // from class: ua.c
                @Override // com.google.android.gms.internal.ads.e81
                public final vd.b c(Object obj) throws JSONException {
                    Long l11 = l10;
                    qd0 qd0Var2 = qd0Var;
                    yr0 yr0Var = yr0VarC;
                    cs0 cs0Var2 = cs0Var;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i10 = 0;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        j jVar2 = j.C;
                        c0 c0VarI = jVar2.f35265h.i();
                        c0VarI.m();
                        synchronized (c0VarI.f37402a) {
                            try {
                                jVar2.f35267k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(c0VarI.f37413n.f18213e)) {
                                    c0VarI.f37413n.f18214f = jCurrentTimeMillis;
                                } else {
                                    c0VarI.f37413n = new ww(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = c0VarI.g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        c0VarI.g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        c0VarI.g.apply();
                                    }
                                    c0VarI.n();
                                    ArrayList arrayList = c0VarI.f37404c;
                                    int size = arrayList.size();
                                    while (i10 < size) {
                                        Object obj2 = arrayList.get(i10);
                                        i10++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                            } finally {
                            }
                        }
                        if (l11 != null) {
                            j.C.f35267k.getClass();
                            androidx.recyclerview.widget.d.u(qd0Var2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        yr0Var.g(strOptString);
                    }
                    yr0Var.c(zOptBoolean);
                    cs0Var2.b(yr0Var.F1());
                    return s81.f15906b;
                }
            };
            ex exVar = fx.g;
            w71 w71VarF = yo0.F(bVarA, e81Var, exVar);
            if (runnable != null) {
                ((gx) bVarA).f11625a.a(runnable, exVar);
            }
            if (l10 != null) {
                ((gx) bVarA).f11625a.a(new fb.r(19, qd0Var, l10), exVar);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) va.s.f36163e.f36166c.a(sk.C8)).booleanValue()) {
                w71VarF.a(new q81(i4, w71VarF, new m91(str3, 6)), exVar);
            } else {
                nn1.e(w71VarF, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e2) {
            za.i.f("Error requesting application settings", e2);
            yr0VarC.h(e2);
            yr0VarC.c(false);
            cs0Var.b(yr0VarC.F1());
        }
    }

    public String toString() {
        switch (this.f1322a) {
            case 0:
                if (((d) this.f1324c) == null) {
                    return Long.toBinaryString(this.f1323b);
                }
                return ((d) this.f1324c).toString() + "xx" + Long.toBinaryString(this.f1323b);
            default:
                return super.toString();
        }
    }

    public d(com.google.android.gms.internal.ads.y1 y1Var, long j) {
        this.f1322a = 1;
        this.f1324c = y1Var;
        mq0.m(y1Var.G1() >= j);
        this.f1323b = j;
    }

    public /* synthetic */ d(Object obj, long j, int i4) {
        this.f1322a = i4;
        this.f1324c = obj;
        this.f1323b = j;
    }

    public d(tb.a aVar) {
        this.f1322a = 9;
        pb.y.h(aVar);
        this.f1324c = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(5:132|4|(3:152|6|7)(6:13|123|14|(1:23)(3:127|17|18)|(3:125|25|26)(13:30|144|31|150|32|33|34|140|35|136|36|37|(7:38|129|39|(2:41|(1:157)(3:59|(6:65|66|142|67|71|158)(2:64|159)|72))(1:156)|57|58|56))|22)|8|9)(7:103|130|104|105|106|8|9)|134|109|146|110|114|(1:116)|119|120|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bd, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
    
        r0 = (g9.b) r24.f1324c;
        r2 = r0.f24616b;
        r3 = r25.ouw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        monitor-enter(w8.a.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        r0 = r0.f24620f;
        r7 = r0.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
    
        if (r10 >= r7) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
    
        r12 = r0.get(r10);
        r10 = r10 + 1;
        r12 = (w8.a) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
    
        if (r12 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        r12.vt(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        monitor-exit(w8.a.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0141, code lost:
    
        g9.b.c(r4);
        g9.b.c(r14);
        g9.b.c(r11);
        g9.b.c(r25);
        r2 = ((g9.b) r24.f1324c).f24616b.pno();
        r3 = java.lang.Integer.valueOf(((g9.b) r24.f1324c).f24616b.lh());
        r4 = new java.lang.Object[r6];
        r4[0] = "Pre finally ";
        r4[1] = r2;
        r4[2] = " Preload size=";
        r4[3] = r3;
        pk.a.y("VideoPreload", r4);
        r0 = ((g9.b) r24.f1324c).f24616b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0181, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        if (((g9.b) r24.f1324c).f24616b.fkw() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d9, code lost:
    
        if (r15 != ((g9.b) r24.f1324c).f24618d.length()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01db, code lost:
    
        r0 = (g9.b) r24.f1324c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e7, code lost:
    
        if (r0.f24618d.renameTo(r0.f24619e) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020e, code lost:
    
        throw new java.io.IOException("Error renaming file " + r0.f24618d + " to " + r0.f24619e + " for completion!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021f, code lost:
    
        r0 = (g9.b) r24.f1324c;
        r0.a(r0.f24616b, r25.ouw());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022c, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c8 A[Catch: all -> 0x02cd, TryCatch #6 {all -> 0x02cd, blocks: (B:109:0x02aa, B:114:0x02c0, B:116:0x02c8, B:119:0x02cf, B:113:0x02bd, B:110:0x02b1), top: B:134:0x02aa, inners: #12 }] */
    @Override // com.bytedance.sdk.component.vt.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(com.bytedance.sdk.component.vt.ouw.jg r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
    }

    public d(hm.q qVar) {
        this.f1322a = 12;
        nk.k.e(qVar, "source");
        this.f1324c = qVar;
        this.f1323b = 262144L;
    }

    public d(int i4) {
        this.f1322a = i4;
        switch (i4) {
            case 4:
                this.f1324c = new ArrayList();
                break;
            case 6:
                this.f1324c = null;
                this.f1323b = -1L;
                break;
            case 11:
                break;
            default:
                this.f1323b = 0L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(d0.a1 a1Var) {
        this(a1Var, 0L, 7);
        this.f1322a = 7;
    }
}
