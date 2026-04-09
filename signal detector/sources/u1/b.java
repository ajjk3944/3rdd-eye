package U1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.xq;
import com.bytedance.sdk.component.ypw.emc.ypw;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.AbstractC2022vd;
import com.google.android.gms.internal.ads.C0416Ac;
import com.google.android.gms.internal.ads.C0450Cc;
import com.google.android.gms.internal.ads.C0487Ef;
import com.google.android.gms.internal.ads.C0531Gp;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C1306iD;
import com.google.android.gms.internal.ads.C1952uE;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.I8;
import com.google.android.gms.internal.ads.InterfaceC1736qD;
import com.google.android.gms.internal.ads.InterfaceC2046w0;
import com.google.android.gms.internal.ads.InterfaceC2100x0;
import com.google.android.gms.internal.ads.L0;
import com.google.android.gms.internal.ads.R0;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.T0;
import com.google.android.gms.internal.ads.W9;
import com.google.android.gms.internal.ads.Yu;
import f1.i;
import f4.InterfaceFutureC2326a;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p2.j;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2909E;
import u2.C2951a;
import u2.k;

/* loaded from: classes.dex */
public final class b implements xq, InterfaceC2046w0, InterfaceC2100x0, Eu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3689a;

    /* renamed from: b, reason: collision with root package name */
    public long f3690b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3691c;

    public /* synthetic */ b(long j6, Object obj, int i) {
        this.f3689a = i;
        this.f3690b = j6;
        this.f3691c = obj;
    }

    public static final void E(C0784Vn c0784Vn, String str, long j6) {
        if (c0784Vn != null) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Sd)).booleanValue()) {
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "lat_init");
                c0697QlA.r(str, Long.toString(j6));
                c0697QlA.s();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void A(L0 l02) {
        ((InterfaceC2100x0) this.f3691c).A(new R0(this, l02, l02));
    }

    public void B() {
        this.f3690b = 0L;
        b bVar = (b) this.f3691c;
        if (bVar != null) {
            bVar.B();
        }
    }

    public void C(int i) {
        if (i < 64) {
            this.f3690b |= 1 << i;
        } else {
            j();
            ((b) this.f3691c).C(i - 64);
        }
    }

    public void D(Context context, C2951a c2951a, boolean z6, C0487Ef c0487Ef, String str, String str2, Runnable runnable, final Yu yu, final C0784Vn c0784Vn, final Long l2, boolean z7) throws JSONException {
        PackageInfo packageInfoH;
        j jVar = j.f22785C;
        Q2.a aVar = jVar.f22797k;
        Q2.a aVar2 = jVar.f22797k;
        aVar.getClass();
        if (SystemClock.elapsedRealtime() - this.f3690b < 5000) {
            k.h("Not retrying to fetch app settings");
            return;
        }
        aVar2.getClass();
        this.f3690b = SystemClock.elapsedRealtime();
        if (c0487Ef != null && !TextUtils.isEmpty(c0487Ef.f7976e)) {
            long j6 = c0487Ef.f7977f;
            aVar2.getClass();
            if (System.currentTimeMillis() - j6 <= ((Long) C2841s.f23267e.f23270c.a(H9.f8664R4)).longValue() && c0487Ef.f7979h) {
                return;
            }
        }
        if (context == null) {
            k.h("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            k.h("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3691c = applicationContext;
        int i = 4;
        final Su suY = AbstractC1135f5.y(context, 4);
        suY.a();
        C0416Ac c0416AcM = jVar.f22804r.m((Context) this.f3691c, c2951a, yu);
        W9 w9 = AbstractC0709Rg.f10928l;
        C0450Cc c0450CcA = c0416AcM.a("google.afma.config.fetchAppSettings", w9, w9);
        int i3 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z6);
            jSONObject.put("pn", context.getPackageName());
            E9 e9 = H9.f8707a;
            C2841s c2841s = C2841s.f23267e;
            jSONObject.put("experiment_ids", TextUtils.join(",", c2841s.f23268a.C()));
            jSONObject.put("js", c2951a.f23784a);
            if (((Boolean) c2841s.f23270c.a(H9.La)).booleanValue()) {
                jSONObject.put("inspector_enabled", z7);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f3691c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoH = R2.b.a(context).h(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoH.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC2907C.m("Error fetching PackageInfo.");
            }
            InterfaceFutureC2326a interfaceFutureC2326aA = c0450CcA.a(jSONObject);
            InterfaceC1736qD interfaceC1736qD = new InterfaceC1736qD() { // from class: p2.c
                @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
                public final InterfaceFutureC2326a b(Object obj) throws JSONException {
                    Long l6 = l2;
                    C0784Vn c0784Vn2 = c0784Vn;
                    Su su = suY;
                    Yu yu2 = yu;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i6 = 0;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        j jVar2 = j.f22785C;
                        C2909E c2909eI = jVar2.f22795h.i();
                        c2909eI.m();
                        synchronized (c2909eI.f23548a) {
                            try {
                                jVar2.f22797k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(c2909eI.f23560n.f7976e)) {
                                    c2909eI.f23560n.f7977f = jCurrentTimeMillis;
                                } else {
                                    c2909eI.f23560n = new C0487Ef(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = c2909eI.f23554g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        c2909eI.f23554g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        c2909eI.f23554g.apply();
                                    }
                                    c2909eI.n();
                                    ArrayList arrayList = c2909eI.f23550c;
                                    int size = arrayList.size();
                                    while (i6 < size) {
                                        Object obj2 = arrayList.get(i6);
                                        i6++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                            } finally {
                            }
                        }
                        if (l6 != null) {
                            j.f22785C.f22797k.getClass();
                            U1.b.E(c0784Vn2, "cld_s", SystemClock.elapsedRealtime() - l6.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        su.g(strOptString);
                    }
                    su.b(zOptBoolean);
                    yu2.b(su.n());
                    return ED.f7928b;
                }
            };
            C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
            C1306iD c1306iDF = AbstractC1984ut.F(interfaceFutureC2326aA, interfaceC1736qD, c0623Mf);
            if (runnable != null) {
                ((C0657Of) interfaceFutureC2326aA).f10212a.a(runnable, c0623Mf);
            }
            if (l2 != null) {
                ((C0657Of) interfaceFutureC2326aA).f10212a.a(new i(c0784Vn, i, l2), c0623Mf);
            }
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.C8)).booleanValue()) {
                c1306iDF.a(new CD(c1306iDF, i3, new C1952uE("ConfigLoader.maybeFetchNewAppSettings", 4)), c0623Mf);
            } else {
                AbstractC2022vd.g(c1306iDF, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e6) {
            k.f("Error requesting application settings", e6);
            suY.d(e6);
            suY.b(false);
            yu.b(suY.n());
        }
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C2909E) ((C0531Gp) this.f3691c).f662a).E()) {
            return null;
        }
        long j6 = this.f3690b;
        H8 h8Q = I8.Q();
        h8Q.b();
        ((I8) h8Q.f13551b).M(j6);
        byte[] bArrB = ((I8) h8Q.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        AbstractC0582Jp.V(sQLiteDatabase, j6, bArrB);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.IN
    public int d(int i, int i3, byte[] bArr) {
        return ((InterfaceC2046w0) this.f3691c).d(i, i3, bArr);
    }

    public void e(int i) {
        if (i < 64) {
            this.f3690b &= ~(1 << i);
            return;
        }
        b bVar = (b) this.f3691c;
        if (bVar != null) {
            bVar.e(i - 64);
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.xq
    public void emc(ypw ypwVar, IOException iOException) {
        c cVar = (c) this.f3691c;
        c.c(cVar, cVar.f3693b, 601, iOException.getMessage());
        a.a(cVar.f3693b);
    }

    public int g(int i) {
        b bVar = (b) this.f3691c;
        if (bVar == null) {
            return i >= 64 ? Long.bitCount(this.f3690b) : Long.bitCount(this.f3690b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f3690b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f3690b) + bVar.g(i - 64);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public void i() {
        ((InterfaceC2046w0) this.f3691c).i();
    }

    public void j() {
        if (((b) this.f3691c) == null) {
            this.f3691c = new b(1);
        }
    }

    public boolean k(int i) {
        if (i < 64) {
            return (this.f3690b & (1 << i)) != 0;
        }
        j();
        return ((b) this.f3691c).k(i - 64);
    }

    public void l(int i, boolean z6) {
        if (i >= 64) {
            j();
            ((b) this.f3691c).l(i - 64, z6);
            return;
        }
        long j6 = this.f3690b;
        boolean z7 = (Long.MIN_VALUE & j6) != 0;
        long j7 = (1 << i) - 1;
        this.f3690b = ((j6 & (~j7)) << 1) | (j6 & j7);
        if (z6) {
            C(i);
        } else {
            e(i);
        }
        if (z7 || ((b) this.f3691c) != null) {
            j();
            ((b) this.f3691c).l(0, z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public int m() {
        return ((InterfaceC2046w0) this.f3691c).m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public long n() {
        return ((InterfaceC2046w0) this.f3691c).n() - this.f3690b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public long o() {
        return ((InterfaceC2046w0) this.f3691c).o() - this.f3690b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public long p() {
        return ((InterfaceC2046w0) this.f3691c).p() - this.f3690b;
    }

    public boolean q(int i) {
        if (i >= 64) {
            j();
            return ((b) this.f3691c).q(i - 64);
        }
        long j6 = 1 << i;
        long j7 = this.f3690b;
        boolean z6 = (j7 & j6) != 0;
        long j8 = j7 & (~j6);
        this.f3690b = j8;
        long j9 = j6 - 1;
        this.f3690b = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        b bVar = (b) this.f3691c;
        if (bVar != null) {
            if (bVar.k(0)) {
                C(63);
            }
            ((b) this.f3691c).q(0);
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public void r(int i) {
        ((InterfaceC2046w0) this.f3691c).r(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public void s(int i, int i3, byte[] bArr) {
        ((InterfaceC2046w0) this.f3691c).s(i, i3, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public void t(int i) {
        ((InterfaceC2046w0) this.f3691c).t(i);
    }

    public String toString() {
        switch (this.f3689a) {
            case 1:
                if (((b) this.f3691c) == null) {
                    return Long.toBinaryString(this.f3690b);
                }
                return ((b) this.f3691c).toString() + "xx" + Long.toBinaryString(this.f3690b);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void u() {
        ((InterfaceC2100x0) this.f3691c).u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public void v(int i, int i3, byte[] bArr) {
        ((InterfaceC2046w0) this.f3691c).v(i, i3, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public boolean w(byte[] bArr, int i, int i3, boolean z6) {
        return ((InterfaceC2046w0) this.f3691c).w(bArr, 0, i3, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public T0 x(int i, int i3) {
        return ((InterfaceC2100x0) this.f3691c).x(i, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public boolean y(byte[] bArr, int i, int i3, boolean z6) {
        return ((InterfaceC2046w0) this.f3691c).y(bArr, 0, i3, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public int z(int i, int i3, byte[] bArr) {
        return ((InterfaceC2046w0) this.f3691c).z(i, i3, bArr);
    }

    public b(InterfaceC2046w0 interfaceC2046w0, long j6) {
        this.f3689a = 2;
        this.f3691c = interfaceC2046w0;
        AbstractC0582Jp.m(interfaceC2046w0.o() >= j6);
        this.f3690b = j6;
    }

    public /* synthetic */ b(Object obj, long j6, int i) {
        this.f3689a = i;
        this.f3691c = obj;
        this.f3690b = j6;
    }

    public b(int i) {
        this.f3689a = i;
        switch (i) {
            case 5:
                this.f3691c = new ArrayList();
                break;
            case 6:
            default:
                this.f3690b = 0L;
                break;
            case 7:
                this.f3691c = null;
                this.f3690b = -1L;
                break;
            case 8:
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r0 = (U1.c) r20.f3691c;
        r3 = r0.f3693b;
        r4 = r22.xq();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        monitor-enter(K1.a.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r0 = r0.f3697f;
        r8 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (r14 >= r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        r9 = r0.get(r14);
        r14 = r14 + 1;
        r9 = (K1.a) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r9 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        r9.ypw(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        monitor-exit(K1.a.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        U1.c.d((U1.c) r20.f3691c, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.ypw.emc.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.sdk.component.ypw.emc.ypw r21, com.bytedance.sdk.component.ypw.emc.qh r22) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.b.emc(com.bytedance.sdk.component.ypw.emc.ypw, com.bytedance.sdk.component.ypw.emc.qh):void");
    }
}
