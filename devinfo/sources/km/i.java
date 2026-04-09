package km;

import android.content.Context;
import android.content.Intent;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.f1;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.github.mikephil.charting.charts.PieChart;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzho.lib.appinfo.ManifestActivity;
import e4.c2;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p.h2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements f, g, ga.b, o.k, o6.b, pc.c, qd.c, rf.b, q9.c, ki.l, p1.t, e4.s, f.b, wi.b, d6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28425a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28426b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f28425a = i4;
        this.f28426b = obj;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList u(km.i r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: km.i.u(km.i, java.lang.String):java.util.ArrayList");
    }

    public u6.h A(b7.l lVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28426b;
        Object hVar = linkedHashMap.get(lVar);
        if (hVar == null) {
            hVar = new u6.h(lVar);
            linkedHashMap.put(lVar, hVar);
        }
        return (u6.h) hVar;
    }

    @Override // q9.c
    public q9.b a(float f10, float f11) {
        s9.a aVar;
        PieChart pieChart = (PieChart) this.f28426b;
        if (pieChart.i(f10, f11) <= pieChart.getRadius()) {
            float fJ = pieChart.j(f10, f11);
            pieChart.getAnimator().getClass();
            float rotationAngle = (fJ / 1.0f) - pieChart.getRotationAngle();
            DisplayMetrics displayMetrics = w9.g.f36555a;
            while (rotationAngle < 0.0f) {
                rotationAngle += 360.0f;
            }
            float f12 = rotationAngle % 360.0f;
            int i4 = 0;
            int i10 = 0;
            while (true) {
                float[] fArr = pieChart.K;
                if (i10 >= fArr.length) {
                    i10 = -1;
                    break;
                }
                if (fArr[i10] > f12) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                ArrayList arrayList = pieChart.getData().f30440i;
                if (arrayList == null || arrayList.isEmpty()) {
                    aVar = null;
                } else {
                    aVar = (s9.a) arrayList.get(0);
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        s9.a aVar2 = (s9.a) obj;
                        if (((o9.c) aVar2).j.size() > ((o9.c) aVar).j.size()) {
                            aVar = aVar2;
                        }
                    }
                }
                if (i10 < ((o9.c) aVar).j.size()) {
                    o9.h hVarI = ((o9.g) pieChart.getData()).i();
                    return new q9.b(i10, hVarI.d(i10).f30453a, f10, f11, 0, hVarI.f30444d);
                }
            }
        }
        return null;
    }

    @Override // qd.c
    public Object b() {
        return ((d8.h) this.f28426b).f22020b;
    }

    @Override // ki.l
    public boolean d(boolean z3) {
        if (!z3 || zg.c.c()) {
            return false;
        }
        SettingsActivity settingsActivity = (SettingsActivity) this.f28426b;
        SettingsActivity.D(settingsActivity, settingsActivity.B);
        return true;
    }

    @Override // p1.t
    public long e() {
        return ((r0.e0) this.f28426b).f32518c;
    }

    @Override // o.k
    public boolean f(o.m mVar, MenuItem menuItem) {
        h2 h2Var = (h2) ((f1) this.f28426b).f1138f;
        if (h2Var == null) {
            return false;
        }
        h2Var.onMenuItemClick(menuItem);
        return true;
    }

    @Override // km.g
    public void g(d dVar, Throwable th2) {
        ((xk.h) this.f28426b).resumeWith(ci.b.h(th2));
    }

    @Override // xj.a
    public Object get() {
        switch (this.f28425a) {
            case 2:
                return new la.j((Context) ((xj.a) this.f28426b).get(), "com.google.android.datatransport.events", Integer.valueOf(la.j.f28648d).intValue());
            default:
                wd.f fVar = (wd.f) ((rf.c) this.f28426b).f32941a;
                nk.k.e(fVar, "firebaseApp");
                pf.p0 p0Var = pf.p0.f31881a;
                return pf.p0.a(fVar);
        }
    }

    @Override // d6.b
    public d6.a h(String str) {
        nk.k.e(str, "fileName");
        return new w5.a(((e6.c) this.f28426b).z());
    }

    public synchronized void i(rl.d0 d0Var) {
        nk.k.e(d0Var, "route");
        ((LinkedHashSet) this.f28426b).remove(d0Var);
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        v3.b bVarX = nh.a.x(c2Var);
        int iB = a4.a.b(24.0f);
        ((ViewGroup) this.f28426b).setPadding(0, iB, 0, bVarX.f35796d + iB);
        return e4.v0.j(view, c2Var);
    }

    @Override // f.b
    public void k(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f28426b;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f23582b;
        int i4 = aVar.f23581a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i4 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i4);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i4);
        }
        int i10 = com.google.android.gms.internal.play_billing.u.e(intent, "ProxyBillingActivityV2").f34435a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2998z;
        if (resultReceiver != null) {
            resultReceiver.send(i10, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    public d0.a1 l() {
        return ((i0.p) this.f28426b).f25476o;
    }

    @Override // wi.b
    public void m() {
        ManifestActivity manifestActivity = (ManifestActivity) this.f28426b;
        if (t6.i0.l(manifestActivity)) {
            return;
        }
        Toast.makeText(manifestActivity, R.string.appi_failed, 0).show();
    }

    public nm.f0 n(nm.b bVar) {
        long jE;
        i0.p pVar = (i0.p) this.f28426b;
        nk.k.e(bVar, "padding");
        float f10 = bVar.f30000a;
        float f11 = bVar.f30001b;
        int iOrdinal = l().ordinal();
        if (iOrdinal == 0) {
            jE = pVar.e() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new ac.m();
            }
            jE = pVar.e() >> 32;
        }
        return new nm.f0(f10, ((int) jE) - f11);
    }

    @Override // km.f
    public Type o() {
        return (Type) this.f28426b;
    }

    @Override // wi.b
    public void onSuccess() {
        ManifestActivity manifestActivity = (ManifestActivity) this.f28426b;
        if (t6.i0.l(manifestActivity)) {
            return;
        }
        i0.f fVar = manifestActivity.C;
        String str = manifestActivity.B;
        fVar.getClass();
        Toast.makeText(manifestActivity, R.string.appi_save_successful, 0).show();
    }

    @Override // km.g
    public void p(d dVar, v0 v0Var) {
        ((xk.h) this.f28426b).resumeWith(v0Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    public ArrayList q() {
        ?? r02 = ((i0.p) this.f28426b).f25472k;
        ArrayList arrayList = new ArrayList(zj.o.T(r02, 10));
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            arrayList.add(new nm.c0((i0.q) it.next(), l()));
        }
        return arrayList;
    }

    public void r() {
        f1 f1Var = (f1) this.f28426b;
        synchronized (((ArrayList) f1Var.f1137e)) {
            ((ArrayList) f1Var.f1137e).clear();
        }
    }

    public void t(t7.c cVar) {
        nk.k.e(cVar, "billingResult");
        if (cVar.f34435a != 0) {
            return;
        }
        f1 f1Var = (f1) this.f28426b;
        synchronized (((ArrayList) f1Var.f1137e)) {
            try {
                ArrayList arrayList = (ArrayList) f1Var.f1137e;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((Runnable) obj).run();
                }
                ((ArrayList) f1Var.f1137e).clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONObject v() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f28426b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(je.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        je.g.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    je.g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            je.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            je.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public List w(String str) {
        nk.k.e(str, "workSpecId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28426b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (nk.k.a(((b7.l) entry.getKey()).f2007a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((b7.l) it.next());
        }
        return zj.n.r0(linkedHashMap2.values());
    }

    public u6.h x(b7.l lVar) {
        nk.k.e(lVar, FacebookMediationAdapter.KEY_ID);
        return (u6.h) ((LinkedHashMap) this.f28426b).remove(lVar);
    }

    @Override // km.f
    public Object y(d0 d0Var) {
        j jVar = new j(d0Var);
        d0Var.c(new h(jVar, 0));
        return jVar;
    }

    public void z(String str) {
        t7.m mVar = new t7.m((i.g) this.f28426b);
        mVar.y(R.string.like_devinfo);
        i.b bVar = (i.b) mVar.f34474c;
        bVar.f25248u = null;
        bVar.f25247t = R.layout.rate_dialog;
        bVar.f25240m = false;
        i.e eVarF = mVar.f();
        eVarF.setOnShowListener(new rg.d(str));
        eVarF.show();
        View viewFindViewById = eVarF.findViewById(R.id.close);
        int i4 = 1;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ah.h(eVarF, i4));
        }
        View viewFindViewById2 = eVarF.findViewById(R.id.rate);
        if (viewFindViewById2 != null) {
            Drawable background = viewFindViewById2.getBackground();
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            viewFindViewById2.setBackground(wb.e.M(background, com.liuzh.deviceinfo.utilities.f.d()));
            viewFindViewById2.setOnClickListener(new hh.a(this, str, eVarF, i4));
        }
    }

    public /* synthetic */ i(int i4, boolean z3) {
        this.f28425a = i4;
    }

    public /* synthetic */ i(y yVar) {
        this.f28425a = 20;
        this.f28426b = (com.google.android.gms.internal.play_billing.q) yVar.f28522b;
    }

    public i(int i4) {
        this.f28425a = i4;
        switch (i4) {
            case 23:
                this.f28426b = new LinkedHashMap();
                break;
            case 26:
                this.f28426b = new LinkedHashSet();
                break;
            default:
                this.f28426b = new Region();
                break;
        }
    }

    public i(e6.c cVar) {
        this.f28425a = 27;
        nk.k.e(cVar, "openHelper");
        this.f28426b = cVar;
    }

    public i(pe.c cVar) {
        this.f28425a = 14;
        this.f28426b = new File((File) cVar.f31752d, "com.crashlytics.settings.json");
    }

    public i(EditText editText) {
        this.f28425a = 28;
        y4.a aVar = new y4.a();
        aVar.f37323a = editText;
        y4.j jVar = new y4.j(editText);
        aVar.f37324b = jVar;
        editText.addTextChangedListener(jVar);
        if (y4.b.f37326b == null) {
            synchronized (y4.b.f37325a) {
                try {
                    if (y4.b.f37326b == null) {
                        y4.b bVar = new y4.b();
                        try {
                            y4.b.f37327c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, y4.b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        y4.b.f37326b = bVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(y4.b.f37326b);
        this.f28426b = aVar;
    }

    @Override // ki.l
    public void c(boolean z3) {
    }

    @Override // o.k
    public void s(o.m mVar) {
    }
}
