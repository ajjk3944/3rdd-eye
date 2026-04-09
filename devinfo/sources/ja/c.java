package ja;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import b5.u0;
import b5.z;
import bh.w;
import ck.g;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.b00;
import com.google.android.gms.internal.ads.h0;
import com.google.android.gms.internal.ads.i00;
import com.google.android.gms.internal.ads.li;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.t80;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import le.d;
import lf.h;
import m8.f;
import org.json.JSONException;
import ua.j;
import va.s;
import x7.k;
import xa.e;
import ya.a0;
import ya.f0;
import z7.y;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c implements ga.b, SuccessContinuation, k, d, f, na.a, p4.c, r5.d, si.b, g, u8.c, wb.c {

    /* renamed from: a, reason: collision with root package name */
    public static c f27481a;

    public static void C(z zVar) {
        u0 u0VarO = zVar.o();
        nk.k.d(u0VarO, "getChildFragmentManager(...)");
        rg.c cVar = new rg.c();
        Bundle bundle = new Bundle();
        bundle.putString("key.msg", null);
        cVar.Z(bundle);
        cVar.f0(false);
        z zVarD = u0VarO.D("CommonLoadingDialog");
        if (zVarD != null) {
            b5.a aVar = new b5.a(u0VarO);
            aVar.j(zVarD);
            aVar.g();
        }
        cVar.i0(u0VarO, "CommonLoadingDialog");
    }

    public static CookieManager D() {
        j jVar = j.C;
        f0 f0Var = jVar.f35261c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th2) {
                i.f("Failed to obtain CookieManager.", th2);
                jVar.f35265h.g("ApiLevelUtil.getCookieManager", th2);
            }
        }
        return null;
    }

    public static final void E(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z3, qd0 qd0Var) {
        if (adOverlayInfoParcel.f9027k == 4 && adOverlayInfoParcel.f9021c == null) {
            va.a aVar = adOverlayInfoParcel.f9020b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            t80 t80Var = adOverlayInfoParcel.f9037u;
            if (t80Var != null) {
                t80Var.x();
            }
            Activity activityA1 = adOverlayInfoParcel.f9022d.A1();
            e eVar = adOverlayInfoParcel.f9019a;
            Context context2 = (eVar == null || !eVar.j || activityA1 == null) ? context : activityA1;
            c cVar = j.C.f35259a;
            H(context2, eVar, adOverlayInfoParcel.f9026i, eVar != null ? eVar.f37038i : null, qd0Var, adOverlayInfoParcel.f9033q);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f9029m.f38132d);
        intent.putExtra("shouldCallOnOverlayOpened", z3);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) s.f36163e.f36166c.a(sk.f16328se)).booleanValue()) {
            f0 f0Var = j.C.f35261c;
            f0.w(context, intent, qd0Var, adOverlayInfoParcel.f9033q);
        } else {
            f0 f0Var2 = j.C.f35261c;
            f0.u(context, intent);
        }
    }

    public static final boolean F(Context context, Intent intent, xa.c cVar, xa.a aVar, boolean z3, qd0 qd0Var, String str, Bundle bundle) {
        int iL;
        if (z3) {
            try {
                iL = j.C.f35261c.L(context, intent.getData(), bundle);
                if (cVar != null) {
                    cVar.B1();
                }
            } catch (ActivityNotFoundException e2) {
                i.h(e2.getMessage());
                iL = 6;
            }
            if (aVar != null) {
                aVar.L1(iL);
            }
            return iL == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            a0.m(sb2.toString());
            if (((Boolean) s.f36163e.f36166c.a(sk.f16328se)).booleanValue()) {
                f0 f0Var = j.C.f35261c;
                f0.w(context, intent, qd0Var, str);
            } else {
                f0 f0Var2 = j.C.f35261c;
                f0.u(context, intent);
            }
            if (cVar != null) {
                cVar.B1();
            }
            if (aVar != null) {
                aVar.S(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            i.h(e10.getMessage());
            if (aVar != null) {
                aVar.S(false);
            }
            return false;
        }
    }

    public static final boolean H(Context context, e eVar, xa.c cVar, xa.a aVar, qd0 qd0Var, String str) throws NumberFormatException {
        int i4 = 0;
        if (eVar == null) {
            i.h("No intent data for launcher overlay.");
            return false;
        }
        sk.a(context);
        Intent intent = eVar.f37037h;
        if (intent != null) {
            return F(context, intent, cVar, aVar, eVar.j, qd0Var, str, eVar.f37039k);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f37032b;
        if (TextUtils.isEmpty(str2)) {
            i.h("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f37033c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f37034d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f37035e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                i.h("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = eVar.f37036f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i4 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                i.h("Could not parse intent flags.");
            }
            intent2.addFlags(i4);
        }
        pk pkVar = sk.f16240n5;
        s sVar = s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) sVar.f36166c.a(sk.m5)).booleanValue()) {
                f0 f0Var = j.C.f35261c;
                f0.N(context, intent2);
            }
        }
        return F(context, intent2, cVar, aVar, eVar.j, qd0Var, str, eVar.f37039k);
    }

    public static float u(o9.f fVar, LineChart lineChart) {
        float yChartMax = lineChart.getYChartMax();
        float yChartMin = lineChart.getYChartMin();
        o9.e lineData = lineChart.getLineData();
        if (fVar.f30449k > 0.0f && fVar.f30450l < 0.0f) {
            return 0.0f;
        }
        if (lineData.f30433a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.f30434b < 0.0f) {
            yChartMin = 0.0f;
        }
        return fVar.f30450l >= 0.0f ? yChartMin : yChartMax;
    }

    public static long v(String str) {
        Long lValueOf;
        h hVar = kf.b.a().f28268h;
        lf.b bVar = hVar.f28772c;
        lf.c cVarC = bVar.c();
        Long lValueOf2 = null;
        if (cVarC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(cVarC.f28747b.getLong(str));
            } catch (JSONException unused) {
            }
        }
        if (lValueOf != null) {
            hVar.b(str, bVar.c());
            return lValueOf.longValue();
        }
        lf.c cVarC2 = hVar.f28773d.c();
        if (cVarC2 != null) {
            try {
                lValueOf2 = Long.valueOf(cVarC2.f28747b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        h.c(str, "Long");
        return 0L;
    }

    public static String x(String str) throws JSONException {
        String string;
        h hVar = kf.b.a().f28268h;
        lf.b bVar = hVar.f28772c;
        lf.c cVarC = bVar.c();
        String string2 = null;
        if (cVarC == null) {
            string = null;
        } else {
            try {
                string = cVarC.f28747b.getString(str);
            } catch (JSONException unused) {
            }
        }
        if (string != null) {
            hVar.b(str, bVar.c());
            return string;
        }
        lf.c cVarC2 = hVar.f28773d.c();
        if (cVarC2 != null) {
            try {
                string2 = cVarC2.f28747b.getString(str);
            } catch (JSONException unused2) {
            }
        }
        if (string2 != null) {
            return string2;
        }
        h.c(str, "String");
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(y4.c r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.c.y(y4.c, android.text.Editable, int, int, boolean):boolean");
    }

    public List A(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (de.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f22189a;
            if (str != null) {
                aVar = new de.a(str, aVar.f22190b, aVar.f22191c, aVar.f22192d, aVar.f22193e, new com.applovin.impl.sdk.ad.f(21, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public rg.c B(i.g gVar, String str) {
        nk.k.e(gVar, "activity");
        u0 u0VarS = gVar.s();
        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
        if ((2 & 4) != 0) {
            str = null;
        }
        rg.c cVar = new rg.c();
        Bundle bundle = new Bundle();
        bundle.putString("key.msg", str);
        cVar.Z(bundle);
        cVar.f0(false);
        z zVarD = u0VarS.D("CommonLoadingDialog");
        if (zVarD != null) {
            b5.a aVar = new b5.a(u0VarS);
            aVar.j(zVarD);
            aVar.g();
        }
        cVar.i0(u0VarS, "CommonLoadingDialog");
        return cVar;
    }

    public i00 G(b00 b00Var, li liVar, boolean z3, qh0 qh0Var) {
        return new i00(b00Var, liVar, z3, qh0Var);
    }

    public boolean I(Activity activity, Configuration configuration) {
        return false;
    }

    public int J(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean L(Context context) {
        return false;
    }

    public Intent M(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int O(AudioManager audioManager) {
        return 0;
    }

    public int P(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // le.d
    public String b() {
        return null;
    }

    @Override // si.b
    public void d(Context context, si.f fVar, int i4, si.e eVar) {
        nk.k.e(context, "context");
        eVar.c();
    }

    @Override // si.b
    public void e(Context context, si.i iVar) {
        nk.k.e(context, "context");
        iVar.f();
    }

    @Override // si.b
    public void f(Context context, Intent intent, yb.e eVar) {
        nk.k.e(context, "context");
        eVar.c();
    }

    @Override // x7.b
    public boolean g(Object obj, File file, x7.h hVar) throws Throwable {
        try {
            t8.b.d(((k8.f) ((k8.b) ((y) obj).get()).f28075a.f27975b).f28090a.f36523d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    @Override // xj.a
    public Object get() {
        i7.b bVar = new i7.b();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ba.c.f2090a, new ka.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ba.c.f2092c, new ka.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(ka.c.f28115b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ba.c.f2091b, new ka.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < ba.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new ka.a(bVar, map);
    }

    @Override // na.a
    public long i() {
        return SystemClock.elapsedRealtime();
    }

    @Override // wb.c
    public h0 j(Context context, String str, wb.b bVar) {
        h0 h0Var = new h0();
        int iE = bVar.e(context, str);
        h0Var.f11671a = iE;
        if (iE != 0) {
            h0Var.f11673c = -1;
            return h0Var;
        }
        int iA = bVar.a(context, str, true);
        h0Var.f11672b = iA;
        if (iA != 0) {
            h0Var.f11673c = 1;
        }
        return h0Var;
    }

    @Override // x7.k
    public int o(x7.h hVar) {
        return 1;
    }

    @Override // si.b
    public void p(Context context, String str, yb.e eVar) {
        nk.k.e(context, "context");
        eVar.q();
    }

    @Override // si.b
    public void q(Intent intent, o7.c cVar) {
        r5.c.t(false, ((w) cVar.f30419b).f2244b);
    }

    @Override // si.b
    public int r() {
        return 0;
    }

    @Override // si.b
    public void s(Context context, int i4, List list, si.h hVar) {
        nk.k.e(context, "context");
        nk.k.e(list, "skuIds");
        hVar.c();
    }

    @Override // si.b
    public void t(Context context, int i4, si.g gVar) {
        nk.k.e(context, "context");
        ((yb.i) gVar).c();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public Signature[] w(String str, PackageManager packageManager) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean z(CharSequence charSequence) {
        return charSequence instanceof c4.d;
    }

    @Override // le.d
    public void a() {
    }

    @Override // r5.d
    public void l() {
    }

    public void K(Context context) {
    }

    public void N(Activity activity) {
    }

    @Override // p4.c
    public Object c(p4.b bVar) throws p4.b {
        throw bVar;
    }

    @Override // m8.f
    public void h(i.g gVar) {
    }

    @Override // u8.c
    public void k(Object obj) {
    }

    @Override // r5.d
    public void m(int i4, Object obj) {
    }

    @Override // le.d
    public void n(long j, String str) {
    }
}
