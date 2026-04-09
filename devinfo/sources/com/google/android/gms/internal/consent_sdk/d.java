package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.bn0;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.bt1;
import com.google.android.gms.internal.ads.ce1;
import com.google.android.gms.internal.ads.d80;
import com.google.android.gms.internal.ads.d91;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.fj0;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.rj0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tg;
import com.google.android.gms.internal.ads.tk;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uf0;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.zc;
import com.google.android.gms.internal.ads.zh0;
import com.google.android.gms.internal.ads.zx0;
import com.liuzh.deviceinfo.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {
    public static d j;

    /* renamed from: a, reason: collision with root package name */
    public Object f19295a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19296b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19297c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19298d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19299e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19300f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19301h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19302i;

    public d(Application application) {
        this.f19295a = this;
        e6 e6Var = new e6(8, application);
        this.f19296b = e6Var;
        h7 h7VarB = h7.b(new f(e6Var, 1));
        this.f19297c = h7VarB;
        h7 h7VarB2 = h7.b(f0.f19345b);
        this.f19298d = h7VarB2;
        h7 h7VarB3 = h7.b(new e6(3, new c(this)));
        this.f19299e = h7VarB3;
        l4 l4Var = new l4(e6Var, h7VarB, 1);
        h7 h7VarB4 = h7.b(new q4(24));
        this.f19300f = h7VarB4;
        g gVar = new g(e6Var, h7VarB, h7.b(new l4(e6Var, h7.b(new f(e6Var, 0)), 0)));
        this.f19302i = gVar;
        h7 h7VarB5 = h7.b(new yb.e(h7VarB2, e6Var, h7.b(new f(e6Var, 2)), 8));
        this.g = h7VarB5;
        this.f19301h = h7.b(new a0.x0(h7VarB, new xz(e6Var, h7VarB2, h7VarB, h7VarB3, l4Var, new a0.x0(h7VarB4, gVar, h7VarB, h7VarB5, 5), h7VarB4, h7VarB5), h7VarB3, h7VarB5, 8));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fa_item_repeat_file, viewGroup, false);
        int i4 = R.id.checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) wb.e.s(R.id.checkbox, viewInflate);
        if (appCompatCheckBox != null) {
            i4 = R.id.icon;
            ImageView imageView = (ImageView) wb.e.s(R.id.icon, viewInflate);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i4 = R.id.name;
                TextView textView = (TextView) wb.e.s(R.id.name, viewInflate);
                if (textView != null) {
                    i4 = R.id.path;
                    TextView textView2 = (TextView) wb.e.s(R.id.path, viewInflate);
                    if (textView2 != null) {
                        i4 = R.id.size;
                        TextView textView3 = (TextView) wb.e.s(R.id.size, viewInflate);
                        if (textView3 != null) {
                            i4 = R.id.thumbnail_icon;
                            ImageView imageView2 = (ImageView) wb.e.s(R.id.thumbnail_icon, viewInflate);
                            if (imageView2 != null) {
                                i4 = R.id.time;
                                TextView textView4 = (TextView) wb.e.s(R.id.time, viewInflate);
                                if (textView4 != null) {
                                    i4 = R.id.warning;
                                    TextView textView5 = (TextView) wb.e.s(R.id.warning, viewInflate);
                                    if (textView5 != null) {
                                        return new d(constraintLayout, appCompatCheckBox, imageView, textView, textView2, textView3, imageView2, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public static void e(String str, JSONObject jSONObject) {
        StringBuilder sbZ = d.h.z(str);
        sbZ.append(jSONObject.toString());
        String string = sbZ.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public static d h(Context context) {
        d dVar;
        synchronized (d.class) {
            try {
                if (j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    j = new d(application);
                }
                dVar = j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public re.a a(int i4) {
        re.a aVar = null;
        try {
            if (!i3.e.a(2, i4)) {
                JSONObject jSONObjectV = ((km.i) this.f19299e).v();
                if (jSONObjectV != null) {
                    re.a aVarT = ((o.e) this.f19297c).t(jSONObjectV);
                    e("Loaded cached settings: ", jSONObjectV);
                    ((i7.b) this.f19298d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (i3.e.a(3, i4) || aVarT.f32926c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarT;
                        } catch (Exception e2) {
                            e = e2;
                            aVar = aVarT;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public re.a b() {
        return (re.a) ((AtomicReference) this.f19301h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0423 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(ea.i r46, int r47) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.d.d(ea.i, int):void");
    }

    public u10 f() {
        al0.E(Context.class, (Context) this.f19297c);
        al0.E(Map.class, (HashMap) this.g);
        al0.E(zc.class, (zc) this.f19301h);
        al0.E(zx0.class, (zx0) this.f19302i);
        return new u10((d80) this.f19295a, (aw) this.f19296b, (Context) this.f19297c, (View) this.f19298d, (Activity) this.f19299e, (String) this.f19300f, (HashMap) this.g, (zc) this.f19301h, (zx0) this.f19302i);
    }

    public synchronized d91 g(dq0 dq0Var) {
        try {
            if (!((AtomicBoolean) this.g).getAndSet(true)) {
                List list = (List) dq0Var.f10544b.f9451b;
                if (list.isEmpty()) {
                    ((d91) this.f19300f).f(new qj0(3, rj0.a(dq0Var)));
                } else {
                    this.f19302i = dq0Var;
                    nj0 nj0Var = (nj0) this.f19298d;
                    this.f19301h = new fj0(dq0Var, nj0Var, (d91) this.f19300f);
                    nj0Var.b(list);
                    wp0 wp0VarA = ((fj0) this.f19301h).a();
                    while (wp0VarA != null) {
                        j(wp0VarA);
                        wp0VarA = ((fj0) this.f19301h).a();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (d91) this.f19300f;
    }

    public LinkedHashMap i(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            tk tkVar = (tk) ((HashMap) this.f19297c).get(str);
            if (tkVar == null) {
                tkVar = tk.f16834b;
            }
            linkedHashMap2.put(str, tkVar.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void j(wp0 wp0Var) {
        vd.b bVarW;
        synchronized (this) {
            Iterator it = wp0Var.f18072a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVarW = yo0.w(new uf0(3));
                    break;
                }
                zh0 zh0VarA = ((q40) this.f19297c).a(wp0Var.f18074b, (String) it.next());
                if (zh0VarA != null && zh0VarA.a((dq0) this.f19302i, wp0Var)) {
                    bVarW = yo0.E(zh0VarA.b((dq0) this.f19302i, wp0Var), wp0Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f19296b);
                    break;
                }
            }
        }
        ((nj0) this.f19298d).d((dq0) this.f19302i, wp0Var, bVarW, (bt0) this.f19299e);
        bVarW.a(new q81(0, bVarW, new ce1(16, this, wp0Var)), (Executor) this.f19295a);
    }

    public void k(LinkedHashMap linkedHashMap, l90 l90Var) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f19298d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (l90Var != null) {
            String str = (String) l90Var.f13427c;
            String str2 = (String) l90Var.f13426b;
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&it=");
                sb2.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&blat=");
                sb2.append(str);
            }
            string = sb2.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!((AtomicBoolean) this.f19301h).get()) {
            ya.f0 f0Var = ua.j.C.f35261c;
            new ya.u((Context) this.f19299e, (String) this.f19300f, string, null).A();
            return;
        }
        File file = (File) this.f19302i;
        if (file == null) {
            za.i.h("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        za.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    za.i.i("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            za.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            za.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f19295a = obj;
        this.f19296b = obj2;
        this.f19297c = obj3;
        this.f19298d = obj4;
        this.f19299e = obj5;
        this.f19300f = obj6;
        this.g = obj7;
        this.f19301h = obj8;
        this.f19302i = obj9;
    }

    public d() {
        this.f19295a = new ArrayBlockingQueue(100);
        this.f19296b = new LinkedHashMap();
        this.f19297c = new HashMap();
        this.g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public d(it1 it1Var, bt1 bt1Var, com.google.android.gms.internal.ads.w5 w5Var, int i4, int i10, int i11, int i12) {
        this.f19295a = it1Var;
        this.f19297c = bt1Var;
        this.f19298d = new tg();
        this.f19299e = w5Var.A(it1Var.f12466t, new of0(1, this));
        this.f19300f = new hm0(this, i4);
        this.g = new sm0(this, i10);
        this.f19301h = new vm0(this, i11);
        this.f19302i = new bn0(this, i12);
        nl0 nl0Var = new nl0(this);
        this.f19296b = nl0Var;
        it1Var.f12460n.a(nl0Var);
    }
}
