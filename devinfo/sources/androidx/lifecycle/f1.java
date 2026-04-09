package androidx.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.f1;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.ol;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.yr0;
import com.google.android.gms.internal.play_billing.m1;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import nk.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f1 implements yj.f, com.google.ads.mediation.applovin.e, de.b, y8.b, p81, ga.b, rf.b, si.b, s2.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1133a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1134b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1135c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1136d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1137e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1138f;

    public /* synthetic */ f1(int i4, boolean z3) {
        this.f1133a = i4;
    }

    public static HashSet x() {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2;
        HashSet hashSet = new HashSet();
        for (e9.a aVar3 : e9.a.f22461e.values()) {
            if (aVar3 != null && (aVar2 = aVar3.f22465d) != null) {
                hashSet.add(m1.A(aVar2.f6567lh, aVar2.bly()).getAbsolutePath());
                hashSet.add(m1.G(aVar2.f6567lh, aVar2.bly()).getAbsolutePath());
            }
        }
        for (g9.b bVar : g9.a.f24614a.values()) {
            if (bVar != null && (aVar = bVar.f24616b) != null) {
                hashSet.add(m1.A(aVar.f6567lh, aVar.bly()).getAbsolutePath());
                hashSet.add(m1.G(aVar.f6567lh, aVar.bly()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public float A(int i4, boolean z3) {
        Layout layout = (Layout) this.f1134b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i4));
        if (i4 > lineEnd) {
            i4 = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i4) : layout.getSecondaryHorizontal(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float B(int r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f1.B(int, boolean, boolean):float");
    }

    public void C(String str, String str2) {
        nk.k.e(str2, "value");
        km.y yVar = (km.y) this.f1136d;
        yVar.getClass();
        com.bumptech.glide.d.r(str);
        com.bumptech.glide.d.s(str2, str);
        yVar.B(str);
        com.bumptech.glide.d.j(yVar, str, str2);
    }

    public boolean D() {
        Boolean bool;
        Boolean bool2;
        if (TextUtils.isEmpty((String) this.f1135c)) {
            return false;
        }
        return ((!TextUtils.isEmpty((String) this.f1135c) && (bool = (Boolean) this.f1136d) != null) ? bool.booleanValue() : false) && (bool2 = (Boolean) this.f1137e) != null && bool2.booleanValue();
    }

    public String E() {
        if (((String) this.f1138f) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) this.f1134b);
            this.f1138f = d.h.w(sb2, File.separator, "video_default");
            File file = new File((String) this.f1138f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f1138f;
    }

    public int F(int i4, int i10) {
        while (i4 > i10) {
            char cCharAt = ((Layout) this.f1134b).getText().charAt(i4 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((nk.k.f(cCharAt, Segment.SIZE) < 0 || nk.k.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i4;
            }
            i4--;
        }
        return i4;
    }

    public void G(String str, rl.x xVar) {
        nk.k.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (xVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(d.h.t("method ", str, " must have a request body.").toString());
            }
        } else if (!com.bumptech.glide.f.x(str)) {
            throw new IllegalArgumentException(d.h.t("method ", str, " must not have a request body.").toString());
        }
        this.f1135c = str;
        this.f1137e = xVar;
    }

    public String H() {
        if (((String) this.f1135c) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) this.f1134b);
            this.f1135c = d.h.w(sb2, File.separator, "video_reward_full");
            File file = new File((String) this.f1135c);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f1135c;
    }

    public void I(ba.a aVar, ba.f fVar) {
        ea.q qVar = (ea.q) this.f1138f;
        ea.i iVar = (ea.i) this.f1134b;
        String str = (String) this.f1135c;
        ba.d dVar = (ba.d) this.f1137e;
        if (dVar == null) {
            throw new NullPointerException("Null transformer");
        }
        ba.b bVar = (ba.b) this.f1136d;
        ja.b bVar2 = qVar.f22515c;
        ea.i iVarB = iVar.b(aVar.f2088b);
        com.google.android.gms.internal.consent_sdk.a0 a0Var = new com.google.android.gms.internal.consent_sdk.a0(1);
        a0Var.f19260h = new HashMap();
        a0Var.f19259f = Long.valueOf(qVar.f22513a.i());
        a0Var.g = Long.valueOf(qVar.f22514b.i());
        a0Var.f19255b = str;
        a0Var.f19258e = new ea.l(bVar, (byte[]) dVar.apply(aVar.f2087a));
        a0Var.f19257d = null;
        ja.a aVar2 = (ja.a) bVar2;
        aVar2.f27477b.execute(new ci.a(aVar2, iVarB, fVar, a0Var.c(), 19));
    }

    public void J(Object obj, String str) {
        cl.u uVar = bl.c.f2285b;
        nk.k.e(str, "key");
        ((LinkedHashMap) this.f1134b).put(str, obj);
        al.u0 u0Var = (al.u0) ((LinkedHashMap) this.f1136d).get(str);
        if (u0Var != null) {
            ((al.i1) u0Var).j(null, obj == null ? uVar : obj);
        }
        al.u0 u0Var2 = (al.u0) ((LinkedHashMap) this.f1137e).get(str);
        if (u0Var2 != null) {
            al.i1 i1Var = (al.i1) u0Var2;
            if (obj == null) {
                obj = uVar;
            }
            i1Var.j(null, obj);
        }
    }

    public Set K(Class cls) {
        return c(de.q.a(cls));
    }

    public void L(String str) {
        if (vk.p.w0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            nk.k.d(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (vk.p.w0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            nk.k.d(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        nk.k.e(str, "<this>");
        ed.a0 a0Var = new ed.a0(1);
        a0Var.e(null, str);
        this.f1134b = a0Var.b();
    }

    public String M() {
        if (((String) this.f1137e) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) this.f1134b);
            this.f1137e = d.h.w(sb2, File.separator, "video_splash");
            File file = new File((String) this.f1137e);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f1137e;
    }

    public synchronized void N() {
        try {
            if (pk.a.f32023b) {
                pk.a.x("Logger", "Exec clear video cache ");
            }
            String str = (String) this.f1134b;
            if (pk.a.f32023b) {
                pk.a.x("Logger", str);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new y8.a(new File(H()).listFiles(), u6.t.f35185b));
            arrayList.add(new y8.a(new File(M()).listFiles(), u6.t.f35184a));
            if (((String) this.f1136d) == null) {
                this.f1136d = ((String) this.f1134b) + File.separator + "video_brand";
                File file = new File((String) this.f1136d);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            arrayList.add(new y8.a(new File((String) this.f1136d).listFiles(), u6.t.f35186c));
            arrayList.add(new y8.a(new File(E()).listFiles(), u6.t.f35187d));
            int size = arrayList.size();
            HashSet hashSetX = null;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                y8.a aVar = (y8.a) obj;
                File[] fileArr = aVar.f37362a;
                if (fileArr != null && fileArr.length >= aVar.f37363b) {
                    if (hashSetX == null) {
                        hashSetX = x();
                    }
                    int i10 = aVar.f37363b - 2;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    File[] fileArr2 = aVar.f37362a;
                    if (i10 >= 0 && fileArr2 != null) {
                        try {
                            if (fileArr2.length > i10) {
                                List listAsList = Arrays.asList(fileArr2);
                                Collections.sort(listAsList, new androidx.recyclerview.widget.m(5));
                                while (i10 < listAsList.size()) {
                                    if (!hashSetX.contains(((File) listAsList.get(i10)).getAbsolutePath())) {
                                        ((File) listAsList.get(i10)).delete();
                                    }
                                    i10++;
                                }
                            }
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // de.b
    public Object a(Class cls) {
        if (!((Set) this.f1134b).contains(de.q.a(cls))) {
            throw new ac.m("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((de.b) this.f1138f).a(cls);
        if (!cls.equals(af.a.class)) {
            return objA;
        }
        return new de.r();
    }

    @Override // s2.o
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f1138f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((s2.n) arrayList.get(i4)).f33408a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // de.b
    public Set c(de.q qVar) {
        if (((Set) this.f1137e).contains(qVar)) {
            return ((de.b) this.f1138f).c(qVar);
        }
        throw new ac.m("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // si.b
    public void d(Context context, si.f fVar, int i4, final si.e eVar) {
        Handler handler = (Handler) this.f1135c;
        nk.k.e(context, "context");
        String str = fVar.f33809a;
        if (vk.i.H0(str)) {
            Log.e("GoogleIap", "pay for empty " + fVar);
            final int i10 = 0;
            handler.post(new Runnable() { // from class: ri.e
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            eVar.c();
                            break;
                        case 1:
                            eVar.c();
                            break;
                        default:
                            eVar.c();
                            break;
                    }
                }
            });
            return;
        }
        ri.f fVar2 = (ri.f) ((HashMap) this.f1136d).get(str);
        if (fVar2 == null) {
            Log.e("GoogleIap", "pay " + fVar + " no cached details.");
            final int i11 = 1;
            handler.post(new Runnable() { // from class: ri.e
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            eVar.c();
                            break;
                        case 1:
                            eVar.c();
                            break;
                        default:
                            eVar.c();
                            break;
                    }
                }
            });
            return;
        }
        if (!nk.k.a(fVar2.f32973a.f34453d, "subs")) {
            v(new ci.a(this, eVar, fVar2, fVar, 21));
            return;
        }
        Log.e("GoogleIap", "pay " + fVar + " is subs but no offerToken.");
        final int i12 = 2;
        handler.post(new Runnable() { // from class: ri.e
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        eVar.c();
                        break;
                    case 1:
                        eVar.c();
                        break;
                    default:
                        eVar.c();
                        break;
                }
            }
        });
    }

    @Override // si.b
    public void e(Context context, si.i iVar) {
        nk.k.e(context, "context");
        iVar.p();
    }

    @Override // si.b
    public void f(Context context, Intent intent, yb.e eVar) {
        nk.k.e(context, "context");
        throw new UnsupportedOperationException();
    }

    @Override // de.b
    public de.o g(de.q qVar) {
        if (((Set) this.f1136d).contains(qVar)) {
            return ((de.b) this.f1138f).g(qVar);
        }
        throw new ac.m("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // xj.a
    public Object get() {
        switch (this.f1133a) {
            case 13:
                return new ja.a((Executor) ((xj.a) this.f1134b).get(), (fa.d) ((xj.a) this.f1135c).get(), (i0.f) ((i0.f) this.f1136d).get(), (la.d) ((xj.a) this.f1137e).get(), (ma.c) ((xj.a) this.f1138f).get());
            case 18:
                return new pf.t0((wd.f) ((rf.c) this.f1134b).f32941a, (df.d) ((xj.a) this.f1135c).get(), (sf.j) ((xj.a) this.f1136d).get(), (pf.l) ((rf.d) this.f1137e).get(), (ck.h) ((xj.a) this.f1138f).get());
            default:
                return new sf.c((pf.g1) ((xj.a) this.f1134b).get(), (df.d) ((xj.a) this.f1135c).get(), (pf.b) ((xj.a) this.f1136d).get(), (sf.d) ((xj.a) this.f1137e).get(), (sf.n) ((rf.d) this.f1138f).get());
        }
    }

    @Override // yj.f
    public Object getValue() {
        e1 e1Var = (e1) this.f1138f;
        if (e1Var != null) {
            return e1Var;
        }
        j1 j1Var = (j1) ((mk.a) this.f1135c).invoke();
        h1 h1Var = (h1) ((mk.a) this.f1136d).invoke();
        h5.b bVar = (h5.b) ((mk.a) this.f1137e).invoke();
        nk.k.e(j1Var, "store");
        nk.k.e(h1Var, "factory");
        nk.k.e(bVar, "extras");
        a0.x0 x0Var = new a0.x0(j1Var, h1Var, bVar);
        nk.e eVar = (nk.e) this.f1134b;
        String strB = eVar.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        e1 e1VarD = x0Var.D(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.f1138f = e1VarD;
        return e1VarD;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        kw kwVar = (kw) this.f1136d;
        yr0 yr0Var = (yr0) this.f1137e;
        vd.b bVar = (vd.b) this.f1134b;
        fb.h hVar = (fb.h) this.f1138f;
        AtomicBoolean atomicBoolean = hVar.C;
        fb.o oVar = (fb.o) obj;
        bs0 bs0VarQ4 = fb.h.q4(bVar, (rw) this.f1135c);
        atomicBoolean.set(true);
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16385w8)).booleanValue()) {
            if (kwVar != null) {
                try {
                    kwVar.j("QueryInfo generation has been disabled.");
                } catch (RemoteException e2) {
                    za.i.e("QueryInfo generation has been disabled.".concat(e2.toString()));
                }
            }
            if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                return;
            }
            yr0Var.g("QueryInfo generation has been disabled.");
            yr0Var.c(false);
            bs0VarQ4.a(yr0Var);
            bs0VarQ4.h();
            return;
        }
        try {
            try {
                if (oVar == null) {
                    if (kwVar != null) {
                        kwVar.Q0(null, null, null);
                    }
                    yr0Var.c(true);
                    if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                        return;
                    }
                    bs0VarQ4.a(yr0Var);
                    bs0VarQ4.h();
                    return;
                }
                try {
                    String str = oVar.f23953a;
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(oVar.f23955c) ? new JSONObject(oVar.f23955c) : new JSONObject(oVar.f23954b)).optString("request_id", ""))) {
                        za.i.h("The request ID is empty in request JSON.");
                        if (kwVar != null) {
                            kwVar.j("Internal error: request ID is empty in request JSON.");
                        }
                        yr0Var.g("Request ID empty");
                        yr0Var.c(false);
                        if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                            return;
                        }
                        bs0VarQ4.a(yr0Var);
                        bs0VarQ4.h();
                        return;
                    }
                    Bundle bundle = oVar.f23958f;
                    boolean z3 = hVar.f23925q;
                    String str2 = hVar.f23926r;
                    String str3 = hVar.f23927s;
                    if (z3 && bundle != null && bundle.getInt(str3, -1) == -1) {
                        bundle.putInt(str3, hVar.f23928t.get());
                    }
                    if (hVar.f23924p && bundle != null && TextUtils.isEmpty(bundle.getString(str2))) {
                        if (TextUtils.isEmpty(hVar.f23930v)) {
                            hVar.f23930v = ua.j.C.f35261c.F(hVar.f23913c, hVar.f23929u.f38129a);
                        }
                        bundle.putString(str2, hVar.f23930v);
                    }
                    if (kwVar != null) {
                        if (TextUtils.isEmpty(oVar.f23955c)) {
                            kwVar.Q0(str, oVar.f23954b, bundle);
                        } else {
                            kwVar.Q0(str, oVar.f23955c, bundle);
                        }
                    }
                    yr0Var.c(true);
                    if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                        return;
                    }
                    bs0VarQ4.a(yr0Var);
                    bs0VarQ4.h();
                } catch (JSONException e10) {
                    za.i.h("Failed to create JSON object from the request string.");
                    if (kwVar != null) {
                        String string = e10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(string);
                        kwVar.j(sb2.toString());
                    }
                    yr0Var.h(e10);
                    yr0Var.c(false);
                    ua.j.C.f35265h.f("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                    if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                        return;
                    }
                    bs0VarQ4.a(yr0Var);
                    bs0VarQ4.h();
                }
            } catch (RemoteException e11) {
                yr0Var.h(e11);
                yr0Var.c(false);
                za.i.f("", e11);
                ua.j.C.f35265h.f("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                if (!((Boolean) ol.f14726e.u()).booleanValue() || bs0VarQ4 == null) {
                    return;
                }
                bs0VarQ4.a(yr0Var);
                bs0VarQ4.h();
            }
        } catch (Throwable th2) {
            if (((Boolean) ol.f14726e.u()).booleanValue() && bs0VarQ4 != null) {
                bs0VarQ4.a(yr0Var);
                bs0VarQ4.h();
            }
            throw th2;
        }
    }

    @Override // de.b
    public cf.b i(de.q qVar) {
        if (((Set) this.f1135c).contains(qVar)) {
            return ((de.b) this.f1138f).i(qVar);
        }
        throw new ac.m("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // de.b
    public cf.b j(Class cls) {
        return i(de.q.a(cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj.f] */
    @Override // s2.o
    public float k() {
        return ((Number) this.f1136d.getValue()).floatValue();
    }

    @Override // de.b
    public Object l(de.q qVar) {
        if (((Set) this.f1134b).contains(qVar)) {
            return ((de.b) this.f1138f).l(qVar);
        }
        throw new ac.m("Attempting to request an undeclared dependency " + qVar + ".");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj.f] */
    @Override // s2.o
    public float m() {
        return ((Number) this.f1137e.getValue()).floatValue();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.C8)).booleanValue()) {
            ua.j.C.f35265h.g("SignalGeneratorImpl.generateSignals", th2);
        } else {
            ua.j.C.f35265h.f("SignalGeneratorImpl.generateSignals", th2);
        }
        bs0 bs0VarQ4 = fb.h.q4((vd.b) this.f1134b, (rw) this.f1135c);
        if (((Boolean) ol.f14726e.u()).booleanValue() && bs0VarQ4 != null) {
            yr0 yr0Var = (yr0) this.f1137e;
            yr0Var.h(th2);
            yr0Var.c(false);
            bs0VarQ4.a(yr0Var);
            bs0VarQ4.h();
        }
        kw kwVar = (kw) this.f1136d;
        if (kwVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            kwVar.j(message);
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    public u0.f o(c1.c cVar, mk.a aVar) {
        int i4;
        int i10;
        nk.s sVar = new nk.s();
        sVar.f29984a = -1;
        synchronized (this.f1134b) {
            Throwable th2 = (Throwable) this.f1135c;
            if (th2 != null) {
                cVar.b(th2);
                return u0.e.f34767b;
            }
            c1.a aVar2 = (c1.a) this.f1136d;
            do {
                i4 = aVar2.get();
                i10 = i4 + 1;
            } while (!aVar2.compareAndSet(i4, i10));
            boolean z3 = true;
            if ((134217727 & i10) != 1) {
                z3 = false;
            }
            sVar.f29984a = (i10 >>> 27) & 15;
            ((x.a0) this.f1137e).a(cVar);
            if (z3 && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th3) {
                    w(th3);
                }
            }
            c1.b bVar = new c1.b(cVar, this, sVar, 0);
            km.o oVar = new km.o();
            oVar.f28445a = bVar;
            oVar.f28446b = new c1.a(0);
            return oVar;
        }
    }

    @Override // com.google.ads.mediation.applovin.e
    public void onInitializeSuccess() {
        com.google.ads.mediation.applovin.c cVar = (com.google.ads.mediation.applovin.c) this.f1138f;
        com.google.ads.mediation.applovin.f fVar = cVar.f8975d;
        Context context = (Context) this.f1134b;
        cVar.f8973b = fVar.b(context);
        cVar.f8974c = AppLovinUtils.retrieveZoneId((Bundle) this.f1135c);
        StringBuilder sb2 = new StringBuilder("Requesting banner of size ");
        AppLovinAdSize appLovinAdSize = (AppLovinAdSize) this.f1136d;
        sb2.append(appLovinAdSize);
        sb2.append(" for zone: ");
        sb2.append(cVar.f8974c);
        Log.d("c", sb2.toString());
        com.google.ads.mediation.applovin.a aVar = cVar.f8976e;
        AppLovinSdk appLovinSdk = cVar.f8973b;
        pa.h hVar = (pa.h) this.f1137e;
        aVar.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hVar.d(context), hVar.b(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        com.google.ads.mediation.applovin.b bVar = new com.google.ads.mediation.applovin.b(appLovinSdk, appLovinAdSize, frameLayout, context);
        cVar.f8972a = bVar;
        bVar.f8969a.setAdDisplayListener(cVar);
        cVar.f8972a.f8969a.setAdClickListener(cVar);
        cVar.f8972a.f8969a.setAdViewEventListener(cVar);
        if (TextUtils.isEmpty(cVar.f8974c)) {
            cVar.f8973b.getAdService().loadNextAd(appLovinAdSize, cVar);
        } else {
            cVar.f8973b.getAdService().loadNextAdForZoneId(cVar.f8974c, cVar);
        }
    }

    @Override // si.b
    public void p(Context context, String str, yb.e eVar) {
        nk.k.e(context, "context");
        v(new oi.f(str, this, eVar, 3));
    }

    @Override // si.b
    public void q(Intent intent, o7.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // si.b
    public int r() {
        return 2;
    }

    @Override // si.b
    public void s(Context context, int i4, List list, si.h hVar) {
        nk.k.e(context, "context");
        nk.k.e(list, "skuIds");
        if (list.isEmpty()) {
            ((Handler) this.f1135c).post(new ri.a(hVar, 1));
        } else {
            v(new com.applovin.impl.sdk.z(i4, list, this, hVar));
        }
    }

    @Override // si.b
    public void t(Context context, int i4, si.g gVar) {
        nk.k.e(context, "context");
        v(new com.applovin.mediation.nativeAds.adPlacer.a(i4, this, (yb.i) gVar));
    }

    public void u(wj.n nVar) {
        View view = (View) this.f1138f;
        TextView textView = (TextView) this.f1135c;
        if (nVar == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        ((ImageView) this.f1137e).setImageDrawable(nVar.f36808a);
        ((TextView) this.f1134b).setText(nVar.f36809b);
        ((TextView) this.f1136d).setText(nVar.f36810c);
        if (TextUtils.isEmpty(nVar.f36811d)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(nVar.f36811d);
        }
    }

    public void v(Runnable runnable) {
        t7.a aVar = (t7.a) this.f1134b;
        aVar.getClass();
        if (aVar.r() || ((t7.a) this.f1134b).c() == 2) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (((t7.a) this.f1134b).c() != 1) {
                try {
                    ((t7.a) this.f1134b).f(new km.i(17, this));
                    return;
                } catch (Exception unused) {
                    synchronized (((ArrayList) this.f1137e)) {
                        ((ArrayList) this.f1137e).clear();
                        return;
                    }
                }
            }
            if (runnable != null) {
                synchronized (((ArrayList) this.f1137e)) {
                    if (((t7.a) this.f1134b).c() == 1) {
                        ((ArrayList) this.f1137e).add(runnable);
                    }
                }
            }
        }
    }

    public void w(Throwable th2) {
        int i4;
        synchronized (this.f1134b) {
            try {
                if (((Throwable) this.f1135c) != null) {
                    return;
                }
                this.f1135c = th2;
                x.a0 a0Var = (x.a0) this.f1137e;
                Object[] objArr = a0Var.f36846a;
                int i10 = a0Var.f36847b;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((c1.c) objArr[i11]).b(th2);
                }
                ((x.a0) this.f1137e).d();
                c1.a aVar = (c1.a) this.f1136d;
                do {
                    i4 = aVar.get();
                } while (!aVar.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void y(mk.c cVar) {
        int i4;
        synchronized (this.f1134b) {
            try {
                x.a0 a0Var = (x.a0) this.f1137e;
                this.f1137e = (x.a0) this.f1138f;
                this.f1138f = a0Var;
                c1.a aVar = (c1.a) this.f1136d;
                do {
                    i4 = aVar.get();
                } while (!aVar.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
                int i10 = a0Var.f36847b;
                for (int i11 = 0; i11 < i10; i11++) {
                    cVar.invoke(a0Var.f(i11));
                }
                a0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public de.o z(Class cls) {
        return g(de.q.a(cls));
    }

    public /* synthetic */ f1(Object obj, Object obj2, Parcelable parcelable, Object obj3, Object obj4, int i4) {
        this.f1133a = i4;
        this.f1138f = obj;
        this.f1134b = obj2;
        this.f1135c = parcelable;
        this.f1136d = obj3;
        this.f1137e = obj4;
    }

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f1133a = i4;
        this.f1134b = obj;
        this.f1135c = obj2;
        this.f1136d = obj3;
        this.f1137e = obj4;
        this.f1138f = obj5;
    }

    public /* synthetic */ f1(boolean z3) {
        this.f1133a = 24;
    }

    public f1(View view) {
        this.f1133a = 28;
        this.f1138f = view;
        this.f1134b = (TextView) view.findViewById(R.id.text);
        this.f1135c = (TextView) view.findViewById(R.id.text_small);
        this.f1136d = (TextView) view.findViewById(R.id.right_text);
        this.f1137e = (ImageView) view.findViewById(R.id.icon);
    }

    public f1(Map map) {
        this.f1133a = 8;
        nk.k.e(map, "initialState");
        this.f1134b = zj.w.M(map);
        this.f1135c = new LinkedHashMap();
        this.f1136d = new LinkedHashMap();
        this.f1137e = new LinkedHashMap();
        this.f1138f = new b5.a0(3, this);
    }

    public f1(int i4) {
        this.f1133a = i4;
        switch (i4) {
            case 24:
                this.f1138f = sl.a.f33825e;
                this.f1135c = "GET";
                this.f1136d = new km.y(17);
                break;
            default:
                this.f1134b = new Object();
                this.f1136d = new c1.a(0);
                this.f1137e = new x.a0();
                this.f1138f = new x.a0();
                break;
        }
    }

    public f1(Drawable.Callback callback) {
        this.f1133a = 12;
        this.f1134b = new ge.d(1);
        this.f1135c = new HashMap();
        this.f1136d = new HashMap();
        this.f1138f = ".ttf";
        if (!(callback instanceof View)) {
            r7.d.b("LottieDrawable must be inside of a view for images to work.");
            this.f1137e = null;
        } else {
            this.f1137e = ((View) callback).getContext().getAssets();
        }
    }

    public f1(Layout layout) {
        this.f1133a = 27;
        this.f1134b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iE0 = vk.i.E0(((Layout) this.f1134b).getText(), '\n', length, 4);
            length = iE0 < 0 ? ((Layout) this.f1134b).getText().length() : iE0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f1134b).getText().length());
        this.f1135c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(null);
        }
        this.f1136d = arrayList2;
        this.f1137e = new boolean[((ArrayList) this.f1135c).size()];
        ((ArrayList) this.f1135c).size();
    }

    public f1(nk.e eVar, mk.a aVar, mk.a aVar2, mk.a aVar3) {
        this.f1133a = 0;
        this.f1134b = eVar;
        this.f1135c = aVar;
        this.f1136d = aVar2;
        this.f1137e = aVar3;
    }

    public f1(de.a aVar, de.b bVar) {
        this.f1133a = 3;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<de.i> set = aVar.f22191c;
        Set set2 = aVar.g;
        for (de.i iVar : set) {
            int i4 = iVar.f22212c;
            int i10 = iVar.f22211b;
            boolean z3 = i4 == 0;
            de.q qVar = iVar.f22210a;
            if (z3) {
                if (i10 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i4 == 2) {
                hashSet3.add(qVar);
            } else if (i10 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(de.q.a(af.a.class));
        }
        this.f1134b = DesugarCollections.unmodifiableSet(hashSet);
        this.f1135c = DesugarCollections.unmodifiableSet(hashSet2);
        this.f1136d = DesugarCollections.unmodifiableSet(hashSet3);
        this.f1137e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f1138f = bVar;
    }

    public f1(DeviceInfoApp deviceInfoApp) {
        Object aVar;
        this.f1133a = 23;
        this.f1135c = new Handler(Looper.getMainLooper());
        this.f1136d = new HashMap();
        this.f1137e = new ArrayList();
        this.f1138f = new CopyOnWriteArrayList();
        t7.h hVar = new t7.h() { // from class: ri.c
            @Override // t7.h
            public final void a(t7.c cVar, List list) {
                k.e(cVar, "result");
                f1 f1Var = this.f32966a;
                ((Handler) f1Var.f1135c).post(new oi.f(f1Var, cVar, list, 4));
            }
        };
        ja.c cVar = new ja.c();
        fe.b bVar = new fe.b(deviceInfoApp);
        bVar.f24017c = hVar;
        bVar.f24015a = cVar;
        if (((ri.c) bVar.f24017c) != null) {
            if (((ja.c) bVar.f24015a) != null) {
                ((ja.c) bVar.f24015a).getClass();
                if (((ri.c) bVar.f24017c) != null) {
                    ja.c cVar2 = (ja.c) bVar.f24015a;
                    ri.c cVar3 = (ri.c) bVar.f24017c;
                    if (bVar.a()) {
                        aVar = new t7.o(cVar2, deviceInfoApp, cVar3, bVar);
                    } else {
                        aVar = new t7.a(cVar2, deviceInfoApp, cVar3, bVar);
                    }
                } else {
                    ja.c cVar4 = (ja.c) bVar.f24015a;
                    if (bVar.a()) {
                        aVar = new t7.o(cVar4, deviceInfoApp, bVar);
                    } else {
                        aVar = new t7.a(cVar4, deviceInfoApp, bVar);
                    }
                }
                this.f1134b = aVar;
                v(null);
                return;
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    public f1(s2.e eVar, s2.h0 h0Var, List list, d3.c cVar, v2.d dVar) {
        int i4;
        String strSubstring;
        List list2;
        ArrayList arrayList;
        int i10;
        s2.e eVar2 = eVar;
        s2.h0 h0Var2 = h0Var;
        this.f1133a = 25;
        this.f1134b = eVar2;
        this.f1135c = list;
        final int i11 = 0;
        mk.a aVar = new mk.a(this) { // from class: s2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f33401b;

            {
                this.f33401b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f33401b.f1138f;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fK = ((n) obj3).f33408a.k();
                            int iR = cm.g.r(arrayList2);
                            int i12 = 1;
                            if (1 <= iR) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i12);
                                    float fK2 = ((n) obj4).f33408a.k();
                                    if (Float.compare(fK, fK2) < 0) {
                                        obj3 = obj4;
                                        fK = fK2;
                                    }
                                    if (i12 != iR) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.f33408a.k() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f33401b.f1138f;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((n) obj5).f33408a.f37848i.c();
                            int iR2 = cm.g.r(arrayList3);
                            int i13 = 1;
                            if (1 <= iR2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((n) obj6).f33408a.f37848i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iR2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.f33408a.f37848i.c() : 0.0f);
                }
            }
        };
        yj.g gVar = yj.g.f37636b;
        this.f1136d = a.a.t(gVar, aVar);
        final int i12 = 1;
        this.f1137e = a.a.t(gVar, new mk.a(this) { // from class: s2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f33401b;

            {
                this.f33401b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f33401b.f1138f;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fK = ((n) obj3).f33408a.k();
                            int iR = cm.g.r(arrayList2);
                            int i122 = 1;
                            if (1 <= iR) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i122);
                                    float fK2 = ((n) obj4).f33408a.k();
                                    if (Float.compare(fK, fK2) < 0) {
                                        obj3 = obj4;
                                        fK = fK2;
                                    }
                                    if (i122 != iR) {
                                        i122++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.f33408a.k() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f33401b.f1138f;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((n) obj5).f33408a.f37848i.c();
                            int iR2 = cm.g.r(arrayList3);
                            int i13 = 1;
                            if (1 <= iR2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((n) obj6).f33408a.f37848i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iR2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.f33408a.f37848i.c() : 0.0f);
                }
            }
        });
        s2.p pVar = h0Var2.f33392b;
        int i13 = s2.f.f33374a;
        ArrayList arrayList2 = eVar2.f33367d;
        String str = eVar2.f33365b;
        zj.s sVar = zj.s.f38317a;
        List listO0 = arrayList2 != null ? zj.n.o0(arrayList2, new s2.d(i12)) : sVar;
        ArrayList arrayList3 = new ArrayList();
        zj.l lVar = new zj.l();
        int size = listO0.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            s2.c cVar2 = (s2.c) listO0.get(i14);
            s2.p pVarA = pVar.a((s2.p) cVar2.f33350a);
            int i16 = cVar2.f33351b;
            int i17 = cVar2.f33352c;
            if (i16 > i17) {
                x2.a.a("Reversed range is not supported");
            }
            while (i15 < i16 && !lVar.isEmpty()) {
                s2.c cVar3 = (s2.c) lVar.last();
                List list3 = listO0;
                int i18 = cVar3.f33352c;
                zj.s sVar2 = sVar;
                Object obj = cVar3.f33350a;
                if (i16 < i18) {
                    arrayList3.add(new s2.c(obj, i15, i16));
                    i15 = i16;
                    listO0 = list3;
                    sVar = sVar2;
                } else {
                    int i19 = size;
                    arrayList3.add(new s2.c(obj, i15, i18));
                    i15 = cVar3.f33352c;
                    while (!lVar.isEmpty() && i15 == ((s2.c) lVar.last()).f33352c) {
                        lVar.removeLast();
                    }
                    listO0 = list3;
                    sVar = sVar2;
                    size = i19;
                }
            }
            List list4 = listO0;
            zj.s sVar3 = sVar;
            int i20 = size;
            if (i15 < i16) {
                arrayList3.add(new s2.c(pVar, i15, i16));
                i15 = i16;
            }
            s2.c cVar4 = (s2.c) lVar.i();
            if (cVar4 != null) {
                int i21 = cVar4.f33352c;
                Object obj2 = cVar4.f33350a;
                int i22 = cVar4.f33351b;
                if (i22 == i16 && i21 == i17) {
                    lVar.removeLast();
                    lVar.addLast(new s2.c(((s2.p) obj2).a(pVarA), i16, i17));
                } else if (i22 == i21) {
                    arrayList3.add(new s2.c(obj2, i22, i21));
                    lVar.removeLast();
                    lVar.addLast(new s2.c(pVarA, i16, i17));
                } else if (i21 >= i17) {
                    lVar.addLast(new s2.c(((s2.p) obj2).a(pVarA), i16, i17));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                lVar.addLast(new s2.c(pVarA, i16, i17));
            }
            i14++;
            listO0 = list4;
            sVar = sVar3;
            size = i20;
        }
        zj.s sVar4 = sVar;
        while (i15 <= str.length() && !lVar.isEmpty()) {
            s2.c cVar5 = (s2.c) lVar.last();
            Object obj3 = cVar5.f33350a;
            int i23 = cVar5.f33352c;
            arrayList3.add(new s2.c(obj3, i15, i23));
            while (!lVar.isEmpty() && i23 == ((s2.c) lVar.last()).f33352c) {
                lVar.removeLast();
            }
            i15 = i23;
        }
        if (i15 < str.length()) {
            arrayList3.add(new s2.c(pVar, i15, str.length()));
        }
        if (arrayList3.isEmpty()) {
            i4 = 0;
            arrayList3.add(new s2.c(pVar, 0, 0));
        } else {
            i4 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i24 = i4;
        while (i24 < size2) {
            s2.c cVar6 = (s2.c) arrayList3.get(i24);
            int i25 = cVar6.f33351b;
            int i26 = cVar6.f33352c;
            if (i25 != i26) {
                strSubstring = str.substring(i25, i26);
                nk.k.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            zj.s arrayList5 = 0;
            if (i25 == i26 || (list2 = eVar2.f33364a) == null) {
                arrayList = arrayList3;
            } else if (i25 == 0 && i26 >= str.length()) {
                arrayList5 = new ArrayList(list2.size());
                int size3 = list2.size();
                arrayList = arrayList3;
                int i27 = 0;
                while (i27 < size3) {
                    int i28 = size3;
                    Object obj4 = list2.get(i27);
                    int i29 = i27;
                    if (!(((s2.b) ((s2.c) obj4).f33350a) instanceof s2.p)) {
                        arrayList5.add(obj4);
                    }
                    i27 = i29 + 1;
                    size3 = i28;
                }
            } else {
                arrayList = arrayList3;
                arrayList5 = new ArrayList(list2.size());
                int size4 = list2.size();
                int i30 = 0;
                while (i30 < size4) {
                    int i31 = size4;
                    s2.c cVar7 = (s2.c) list2.get(i30);
                    List list5 = list2;
                    Object obj5 = cVar7.f33350a;
                    int i32 = cVar7.f33352c;
                    int i33 = i30;
                    int i34 = cVar7.f33351b;
                    String str2 = str;
                    if ((((s2.b) obj5) instanceof s2.p) || !s2.f.a(i25, i26, i34, i32)) {
                        i10 = size2;
                    } else {
                        i10 = size2;
                        arrayList5.add(new s2.c(cVar7.f33353d, ci.b.e(i34, i25, i26) - i25, ci.b.e(i32, i25, i26) - i25, (s2.b) cVar7.f33350a));
                    }
                    i30 = i33 + 1;
                    list2 = list5;
                    size4 = i31;
                    str = str2;
                    size2 = i10;
                }
            }
            String str3 = str;
            int i35 = size2;
            s2.e eVar3 = new s2.e(strSubstring, arrayList5 == 0 ? sVar4 : arrayList5);
            s2.p pVar2 = (s2.p) cVar6.f33350a;
            s2.h0 h0Var3 = new s2.h0(h0Var2.f33391a, pVar.a(pVar2.f33412b == 0 ? new s2.p(pVar2.f33411a, pVar.f33412b, pVar2.f33413c, pVar2.f33414d, pVar2.f33415e, pVar2.f33416f, pVar2.g, pVar2.f33417h, pVar2.f33418i) : pVar2));
            ?? r12 = eVar3.f33364a;
            zj.s sVar5 = r12 == 0 ? sVar4 : r12;
            List list6 = (List) this.f1135c;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i36 = 0;
            while (i36 < size5) {
                s2.c cVar8 = (s2.c) list6.get(i36);
                int i37 = cVar8.f33351b;
                List list7 = list6;
                int i38 = cVar8.f33352c;
                if (s2.f.a(i25, i26, i37, i38)) {
                    if (i25 > i37 || i38 > i26) {
                        x2.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList6.add(new s2.c(cVar8.f33350a, i37 - i25, i38 - i25));
                }
                i36++;
                list6 = list7;
            }
            arrayList4.add(new s2.n(new z2.c(strSubstring, h0Var3, sVar5, arrayList6, dVar, cVar), i25, i26));
            i24++;
            eVar2 = eVar;
            h0Var2 = h0Var;
            arrayList3 = arrayList;
            str = str3;
            size2 = i35;
        }
        this.f1138f = arrayList4;
    }

    public f1(Context context, View view) {
        this.f1133a = 16;
        this.f1134b = context;
        this.f1136d = view;
        o.m mVar = new o.m(context);
        this.f1135c = mVar;
        mVar.f30242e = new km.i(5, this);
        o.w wVar = new o.w(context, mVar, view, false, R.attr.popupMenuStyle, 0);
        this.f1137e = wVar;
        wVar.f30305f = 0;
        wVar.j = new o.v(1, this);
    }
}
