package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ue implements pl0, mf1, nf1, o93 {
    public final /* synthetic */ int f;
    public long g;
    public Object h;

    public /* synthetic */ ue(long j, Object obj, int i) {
        this.f = i;
        this.g = j;
        this.h = obj;
    }

    public static final void G(mv2 mv2Var, String str, long j) {
        if (mv2Var != null) {
            if (((Boolean) tw1.e.c.a(mz1.vd)).booleanValue()) {
                lv2 lv2VarA = mv2Var.a();
                lv2VarA.k("action", "lat_init");
                lv2VarA.k(str, Long.toString(j));
                lv2VarA.m();
            }
        }
    }

    @Override // defpackage.mf1
    public void A(int i) {
        ((mf1) this.h).A(i);
    }

    @Override // defpackage.mf1
    public boolean B(byte[] bArr, int i, int i2, boolean z) {
        return ((mf1) this.h).B(bArr, 0, i2, z);
    }

    public boolean C(int i) {
        if (i >= 64) {
            m();
            return ((ue) this.h).C(i - 64);
        }
        long j = 1 << i;
        long j2 = this.g;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.g = j3;
        long j4 = j - 1;
        this.g = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        ue ueVar = (ue) this.h;
        if (ueVar != null) {
            if (ueVar.q(0)) {
                E(63);
            }
            ((ue) this.h).C(0);
        }
        return z;
    }

    public void D() {
        this.g = 0L;
        ue ueVar = (ue) this.h;
        if (ueVar != null) {
            ueVar.D();
        }
    }

    public void E(int i) {
        if (i < 64) {
            this.g |= 1 << i;
        } else {
            m();
            ((ue) this.h).E(i - 64);
        }
    }

    public void F(Context context, e51 e51Var, boolean z, ed2 ed2Var, String str, String str2, Runnable runnable, ea3 ea3Var, mv2 mv2Var, Long l, boolean z2) throws JSONException {
        aa3 aa3Var;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoB;
        ea3 ea3Var2 = ea3Var;
        hg4 hg4Var = hg4.C;
        ym ymVar = hg4Var.k;
        ym ymVar2 = hg4Var.k;
        ymVar.getClass();
        if (SystemClock.elapsedRealtime() - this.g < 5000) {
            gi2.i0("Not retrying to fetch app settings");
            return;
        }
        ymVar2.getClass();
        this.g = SystemClock.elapsedRealtime();
        if (ed2Var != null && !TextUtils.isEmpty(ed2Var.e)) {
            long j = ed2Var.f;
            ymVar2.getClass();
            if (System.currentTimeMillis() - j <= ((Long) tw1.e.c.a(mz1.A4)).longValue() && ed2Var.h) {
                return;
            }
        }
        if (context == null) {
            gi2.i0("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            gi2.i0("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.h = applicationContext;
        aa3 aa3VarL = aa3.l(context, 4);
        aa3VarL.a();
        i62 i62VarC = hg4Var.r.C((Context) this.h, e51Var, ea3Var2);
        us0 us0Var = h62.b;
        k62 k62VarA = i62VarC.a("google.afma.config.fetchAppSettings", us0Var, us0Var);
        int i = 0;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
            aa3Var = aa3VarL;
            exc = e;
            gi2.c0("Error requesting application settings", exc);
            aa3Var.j(exc);
            aa3Var.b(false);
            ea3Var2.b(aa3Var.n());
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            iz1 iz1Var = mz1.a;
            tw1 tw1Var = tw1.e;
            jSONObject.put("experiment_ids", TextUtils.join(",", tw1Var.a.H()));
            jSONObject.put("js", e51Var.f);
            if (((Boolean) tw1Var.c.a(mz1.oa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.h).getApplicationInfo();
                if (applicationInfo != null && (packageInfoB = za1.a(context).b(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoB.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                gi2.G("Error fetching PackageInfo.");
            }
            n70 n70VarA = k62VarA.a(jSONObject);
            try {
                k62 k62Var = new k62(l, mv2Var, aa3VarL, ea3Var2, 2);
                aa3Var = aa3VarL;
                try {
                    ld2 ld2Var = md2.g;
                    qp3 qp3VarO = pu1.O(n70VarA, k62Var, ld2Var);
                    if (runnable != null) {
                        ((pd2) n70VarA).f.c(runnable, ld2Var);
                    }
                    if (l != null) {
                        ((pd2) n70VarA).f.c(new n62(mv2Var, l, 27), ld2Var);
                    }
                    String str3 = "ConfigLoader.maybeFetchNewAppSettings";
                    if (((Boolean) tw1.e.c.a(mz1.h8)).booleanValue()) {
                        qp3VarO.c(new jq3(qp3VarO, new bs3(str3, 2), i), ld2Var);
                    } else {
                        um.F(qp3VarO, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    gi2.c0("Error requesting application settings", exc);
                    aa3Var.j(exc);
                    aa3Var.b(false);
                    ea3Var2.b(aa3Var.n());
                }
            } catch (Exception e3) {
                e = e3;
                aa3Var = aa3VarL;
                ea3Var2 = ea3Var2;
            }
        } catch (Exception e4) {
            exc = e4;
            aa3Var = aa3VarL;
            gi2.c0("Error requesting application settings", exc);
            aa3Var.j(exc);
            aa3Var.b(false);
            ea3Var2.b(aa3Var.n());
        }
    }

    @Override // defpackage.o93
    public Object c(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((ra4) ((fz2) this.h).a).s()) {
            return null;
        }
        long j = this.g;
        jx1 jx1VarQ = kx1.Q();
        jx1VarQ.b();
        ((kx1) jx1VarQ.g).M(j);
        byte[] bArrB = ((kx1) jx1VarQ.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        wl2.R(sQLiteDatabase, j, bArrB);
        return null;
    }

    @Override // defpackage.ua4
    public int d(byte[] bArr, int i, int i2) {
        return ((mf1) this.h).d(bArr, i, i2);
    }

    public void e(int i) {
        if (i < 64) {
            this.g &= ~(1 << i);
            return;
        }
        ue ueVar = (ue) this.h;
        if (ueVar != null) {
            ueVar.e(i - 64);
        }
    }

    public int f(int i) {
        ue ueVar = (ue) this.h;
        if (ueVar == null) {
            return i >= 64 ? Long.bitCount(this.g) : Long.bitCount(this.g & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.g & ((1 << i) - 1));
        }
        return Long.bitCount(this.g) + ueVar.f(i - 64);
    }

    @Override // defpackage.mf1
    public void i() {
        ((mf1) this.h).i();
    }

    @Override // defpackage.pl0
    public void j(ArrayList arrayList) {
        i30.m(arrayList, "openPorts");
        PortActivity portActivity = (PortActivity) this.h;
        portActivity.runOnUiThread(new ll0(portActivity, 4));
        int size = arrayList.size();
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.g) / 1000.0f;
        if (portActivity.isFinishing()) {
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        ol0 ol0Var = new ol0();
        ol0Var.a = R.drawable.ic_chevron_right;
        String str = "Open Ports: " + size + "\nTime taken: " + decimalFormat.format(Float.valueOf(fCurrentTimeMillis)) + "s";
        i30.m(str, "<set-?>");
        ol0Var.b = str;
        ol0Var.d = -1;
        ArrayList arrayList2 = portActivity.G;
        if (arrayList2 == null) {
            i30.S("dataList");
            throw null;
        }
        arrayList2.add(ol0Var);
        try {
            c10 c10Var = portActivity.F;
            if (c10Var == null) {
                i30.S("portAdapter");
                throw null;
            }
            ArrayList arrayList3 = portActivity.G;
            if (arrayList3 == null) {
                i30.S("dataList");
                throw null;
            }
            c10Var.f.d(zf.i0(arrayList3), 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.pl0
    public void k(int i, boolean z) throws InterruptedException {
        Object obj;
        if (z) {
            PortActivity portActivity = (PortActivity) this.h;
            int i2 = PortActivity.K;
            if (!portActivity.isFinishing()) {
                ol0 ol0Var = new ol0();
                ArrayList arrayList = portActivity.C;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i3);
                    i3++;
                    if (((nl0) obj).a == i) {
                        break;
                    }
                }
                nl0 nl0Var = (nl0) obj;
                if (nl0Var != null) {
                    ol0Var.b = nl0Var.b;
                    ol0Var.c = nl0Var.c;
                } else {
                    String string = portActivity.getString(R.string.txt_info_unknown);
                    i30.l(string, "getString(...)");
                    ol0Var.b = string;
                    ol0Var.c = "";
                }
                ol0Var.d = i;
                ArrayList arrayList2 = portActivity.G;
                if (arrayList2 == null) {
                    i30.S("dataList");
                    throw null;
                }
                arrayList2.add(ol0Var);
                try {
                    c10 c10Var = portActivity.F;
                    if (c10Var == null) {
                        i30.S("portAdapter");
                        throw null;
                    }
                    ArrayList arrayList3 = portActivity.G;
                    if (arrayList3 == null) {
                        i30.S("dataList");
                        throw null;
                    }
                    c10Var.f.d(zf.i0(arrayList3), 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Thread.sleep(20L);
        }
    }

    @Override // defpackage.mf1
    public int l() {
        return ((mf1) this.h).l();
    }

    public void m() {
        if (((ue) this.h) == null) {
            this.h = new ue(0);
        }
    }

    @Override // defpackage.mf1
    public long n() {
        return ((mf1) this.h).n() - this.g;
    }

    @Override // defpackage.mf1
    public long o() {
        return ((mf1) this.h).o() - this.g;
    }

    @Override // defpackage.mf1
    public long p() {
        return ((mf1) this.h).p() - this.g;
    }

    public boolean q(int i) {
        if (i < 64) {
            return (this.g & (1 << i)) != 0;
        }
        m();
        return ((ue) this.h).q(i - 64);
    }

    public void r(int i, boolean z) {
        if (i >= 64) {
            m();
            ((ue) this.h).r(i - 64, z);
            return;
        }
        long j = this.g;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.g = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            E(i);
        } else {
            e(i);
        }
        if (z2 || ((ue) this.h) != null) {
            m();
            ((ue) this.h).r(0, z2);
        }
    }

    @Override // defpackage.nf1
    public void s() {
        ((nf1) this.h).s();
    }

    @Override // defpackage.mf1
    public void t(int i) {
        ((mf1) this.h).t(i);
    }

    public String toString() {
        switch (this.f) {
            case 0:
                if (((ue) this.h) == null) {
                    return Long.toBinaryString(this.g);
                }
                return ((ue) this.h).toString() + "xx" + Long.toBinaryString(this.g);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mf1
    public void u(byte[] bArr, int i, int i2) {
        ((mf1) this.h).u(bArr, i, i2);
    }

    @Override // defpackage.nf1
    public void v(cg1 cg1Var) {
        ((nf1) this.h).v(new hg1(this, cg1Var, cg1Var));
    }

    @Override // defpackage.mf1
    public boolean w(byte[] bArr, int i, int i2, boolean z) {
        return ((mf1) this.h).w(bArr, 0, i2, z);
    }

    @Override // defpackage.mf1
    public void x(byte[] bArr, int i, int i2) {
        ((mf1) this.h).x(bArr, i, i2);
    }

    @Override // defpackage.mf1
    public int y(byte[] bArr, int i, int i2) {
        return ((mf1) this.h).y(bArr, i, i2);
    }

    @Override // defpackage.nf1
    public jg1 z(int i, int i2) {
        return ((nf1) this.h).z(i, i2);
    }

    public /* synthetic */ ue(Object obj, long j, int i) {
        this.f = i;
        this.h = obj;
        this.g = j;
    }

    public ue(mf1 mf1Var, long j) {
        this.f = 2;
        this.h = mf1Var;
        zt0.D(mf1Var.o() >= j);
        this.g = j;
    }

    public ue(int i) {
        this.f = i;
        switch (i) {
            case 5:
                this.h = new ArrayList();
                break;
            case 6:
            default:
                this.g = 0L;
                break;
            case 7:
                break;
            case 8:
                this.h = null;
                this.g = -1L;
                break;
        }
    }
}
