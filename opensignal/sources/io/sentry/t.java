package io.sentry;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.telephony.TelephonyDisplayInfo;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class t implements u0, io.sentry.internal.debugmeta.a, j4.m, r5.p, o9.b, no.c, o0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f12736a;

    /* renamed from: d, reason: collision with root package name */
    public Object f12737d;

    public /* synthetic */ t(Object obj) {
        this.f12736a = obj;
    }

    public static t G(String... strArr) {
        try {
            cv.j[] jVarArr = new cv.j[strArr.length];
            cv.g gVar = new cv.g();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                nk.y.s0(gVar, strArr[i10]);
                gVar.readByte();
                jVarArr[i10] = gVar.k(gVar.f6706d);
            }
            return new t((String[]) strArr.clone(), ba.m.F(jVarArr));
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public void A(androidx.fragment.app.b bVar, View view, boolean z10) {
        br.l.e(bVar, "f");
        br.l.e(view, "v");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.A(bVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.VIEW_CREATED);
        }
    }

    public void B(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.B(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.VIEW_DESTROYED);
        }
    }

    public void C(String str, ar.k kVar) {
        LinkedHashMap linkedHashMap = ((i7.m) this.f12737d).f11274a;
        is.m mVar = new is.m(this, str);
        kVar.a(mVar);
        String str2 = (String) this.f12736a;
        ArrayList arrayList = mVar.f12971a;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((lq.l) it.next()).f15571a);
        }
        String strG = (String) mVar.f12972b.f15571a;
        br.l.e(strG, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        sb2.append(mq.o.x0(arrayList2, "", null, null, js.t.f13827d, 30));
        sb2.append(')');
        if (strG.length() > 1) {
            strG = h0.b.g(';', "L", strG);
        }
        sb2.append(strG);
        String string = sb2.toString();
        br.l.e(str2, "internalName");
        br.l.e(string, "jvmDescriptor");
        String str3 = str2 + '.' + string;
        is.p pVar = (is.p) mVar.f12972b.f15572d;
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((is.p) ((lq.l) it2.next()).f15572d);
        }
        linkedHashMap.put(str3, new is.k(pVar, arrayList3));
    }

    public byte[] D() {
        Callable callable;
        if (((byte[]) this.f12736a) == null && (callable = (Callable) this.f12737d) != null) {
            this.f12736a = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f12736a;
        return bArr != null ? bArr : new byte[0];
    }

    public synchronized Map E() {
        try {
            if (((Map) this.f12737d) == null) {
                this.f12737d = Collections.unmodifiableMap(new HashMap((HashMap) this.f12736a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f12737d;
    }

    public Properties F() throws IOException {
        String str = (String) this.f12736a;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (IOException e4) {
            ((j2) this.f12737d).f(b5.ERROR, e4, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public void H(String str, l7.d dVar) {
        br.l.e(dVar, "provider");
        n7.b bVar = (n7.b) this.f12736a;
        synchronized (bVar.f17390c) {
            if (bVar.f17391d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f17391d.put(str, dVar);
        }
    }

    public void I() throws NoSuchMethodException, SecurityException {
        if (!((n7.b) this.f12736a).f17395h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        i.h hVar = (i.h) this.f12737d;
        if (hVar == null) {
            hVar = new i.h(this);
        }
        this.f12737d = hVar;
        try {
            androidx.lifecycle.i.class.getDeclaredConstructor(null);
            i.h hVar2 = (i.h) this.f12737d;
            if (hVar2 != null) {
                ((LinkedHashSet) hVar2.f11053b).add(androidx.lifecycle.i.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public kg.r J(qs.g gVar, String str) {
        br.l.e(gVar, "name");
        String strB = gVar.b();
        br.l.d(strB, "name.asString()");
        return new kg.r(this, new js.s(strB.concat(str)));
    }

    @Override // j4.m
    public boolean a(CharSequence charSequence, int i10, int i11, j4.u uVar) {
        if ((uVar.f13247c & 4) > 0) {
            return true;
        }
        if (((j4.x) this.f12736a) == null) {
            this.f12736a = new j4.x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ee.f) this.f12737d).getClass();
        ((j4.x) this.f12736a).setSpan(new j4.v(uVar), i10, i11, 33);
        return true;
    }

    @Override // j4.m
    public Object b() {
        return (j4.x) this.f12736a;
    }

    @Override // o0.g0
    public List c(Integer num) {
        List listC = ((o0.g0) this.f12736a).c(null);
        n0.v1 v1Var = (n0.v1) this.f12737d;
        int i10 = v1Var.f17352v;
        return i10 < 0 ? listC : mq.o.E0(com.google.android.gms.internal.measurement.i4.i(v1Var, num, i10, Integer.valueOf(v1Var.C(v1Var.f17334b, i10))), listC);
    }

    @Override // io.sentry.internal.debugmeta.a
    public List d() throws IOException {
        u0 u0Var = (u0) this.f12737d;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f12736a).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            u0Var.m(b5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e4) {
            u0Var.g(b5.ERROR, "Error getting Proguard UUIDs.", e4);
            return null;
        } catch (RuntimeException e10) {
            u0Var.f(b5.ERROR, e10, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    @Override // no.c
    public boolean e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f12736a;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // io.sentry.u0
    public void f(b5 b5Var, Throwable th2, String str, Object... objArr) {
        u0 u0Var = (u0) this.f12737d;
        if (u0Var == null || !o(b5Var)) {
            return;
        }
        u0Var.f(b5Var, th2, str, objArr);
    }

    @Override // io.sentry.u0
    public void g(b5 b5Var, String str, Throwable th2) {
        u0 u0Var = (u0) this.f12737d;
        if (u0Var == null || !o(b5Var)) {
            return;
        }
        u0Var.g(b5Var, str, th2);
    }

    @Override // kq.a
    public Object get() {
        return new n9.e((Context) ((a2.a) this.f12736a).f28a, (k) ((i.g0) this.f12737d).get());
    }

    @Override // no.c
    public br.a0 h() {
        return (br.a0) this.f12737d;
    }

    public void i(String str, TelephonyDisplayInfo telephonyDisplayInfo) {
        fh.d[] dVarArr = {new fh.d(Integer.valueOf(telephonyDisplayInfo.getNetworkType()), "NETWORK_TYPE"), new fh.d(Integer.valueOf(telephonyDisplayInfo.getOverrideNetworkType()), "OVERRIDE_NETWORK_TYPE")};
        fh.f fVar = (fh.f) this.f12736a;
        long jM = ((mi.f) this.f12737d).m();
        fVar.getClass();
        fVar.h(new fh.e(str, dVarArr, jM, 0));
    }

    public void j(String str, zh.b bVar) {
        fh.d[] dVarArr = {new fh.d(Integer.valueOf(bVar.f27409a), "STATE"), new fh.d(null, "NR_STATUS"), new fh.d(bVar.f27410b, "NR_BEARER"), new fh.d(bVar.f27411c, "NR_STATE"), new fh.d(bVar.f27412d, "NR_FREQUENCY_RANGE")};
        fh.f fVar = (fh.f) this.f12736a;
        long jM = ((mi.f) this.f12737d).m();
        fVar.getClass();
        fVar.h(new fh.e(str, dVarArr, jM, 0));
    }

    public Bundle k(String str) {
        br.l.e(str, "key");
        n7.b bVar = (n7.b) this.f12736a;
        if (!bVar.f17394g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = bVar.f17393f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleF = bundle.containsKey(str) ? com.google.android.gms.internal.measurement.b4.F(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            bVar.f17393f = null;
        }
        return bundleF;
    }

    public HandlerThread l(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        if (((ak.g) ((q3.a) this.f12737d).f20680g).f529f.f449a.f486q == 2) {
            handlerThread.setUncaughtExceptionHandler((ch.j) this.f12736a);
        }
        return handlerThread;
    }

    @Override // io.sentry.u0
    public void m(b5 b5Var, String str, Object... objArr) {
        u0 u0Var = (u0) this.f12737d;
        if (u0Var == null || !o(b5Var)) {
            return;
        }
        u0Var.m(b5Var, str, objArr);
    }

    public void n(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.n(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = b0Var.f18779a;
        }
    }

    @Override // io.sentry.u0
    public boolean o(b5 b5Var) {
        x5 x5Var = (x5) this.f12736a;
        return b5Var != null && x5Var.isDebug() && b5Var.ordinal() >= x5Var.getDiagnosticLevel().ordinal();
    }

    public void p(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.f12736a;
        i.j jVar = dVar.f1456w.f18878r;
        androidx.fragment.app.b bVar2 = dVar.f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.p(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar2 = b0Var.f18779a;
            br.l.e(jVar, "context");
            dVar2.a(bVar, io.sentry.android.fragment.b.ATTACHED);
        }
    }

    @Override // r5.p
    public Object parse(Uri uri, InputStream inputStream) {
        n5.a aVar = (n5.a) ((r5.p) this.f12736a).parse(uri, inputStream);
        List list = (List) this.f12737d;
        return (list == null || list.isEmpty()) ? aVar : (n5.a) aVar.a(list);
    }

    public void q(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.q(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = b0Var.f18779a;
            b1 b1Var = dVar.f11820a;
            dVar.a(bVar, io.sentry.android.fragment.b.CREATED);
            if (bVar.w()) {
                if (b1Var.k().isEnableScreenTracking()) {
                    b1Var.r(new bf.a(dVar, 29, bVar));
                }
                WeakHashMap weakHashMap = dVar.f11823d;
                if (b1Var.k().isTracingEnabled() && dVar.f11822c && !weakHashMap.containsKey(bVar)) {
                    br.w wVar = new br.w();
                    b1Var.r(new io.sentry.android.fragment.c(wVar, 0));
                    String canonicalName = bVar.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = bVar.getClass().getSimpleName();
                    }
                    i1 i1Var = (i1) wVar.f2917a;
                    i1 i1VarZ = i1Var != null ? i1Var.z("ui.load", canonicalName) : null;
                    if (i1VarZ != null) {
                        weakHashMap.put(bVar, i1VarZ);
                        i1VarZ.t().E = "auto.ui.fragment";
                    }
                }
            }
        }
    }

    public void r(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.r(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = b0Var.f18779a;
            dVar.a(bVar, io.sentry.android.fragment.b.DESTROYED);
            dVar.b(bVar);
        }
    }

    public void s(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.s(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.DETACHED);
        }
    }

    public void t(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.t(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.PAUSED);
        }
    }

    public void u(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.f12736a;
        i.j jVar = dVar.f1456w.f18878r;
        androidx.fragment.app.b bVar2 = dVar.f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.u(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar2 = b0Var.f18779a;
        }
    }

    public void v(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.v(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = b0Var.f18779a;
        }
    }

    public void w(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.w(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.RESUMED);
        }
    }

    public void x(androidx.fragment.app.b bVar, Bundle bundle, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.x(bVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.SAVE_INSTANCE_STATE);
        }
    }

    public void y(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.y(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = b0Var.f18779a;
            dVar.a(bVar, io.sentry.android.fragment.b.STARTED);
            dVar.b(bVar);
        }
    }

    public void z(androidx.fragment.app.b bVar, boolean z10) {
        br.l.e(bVar, "f");
        androidx.fragment.app.b bVar2 = ((androidx.fragment.app.d) this.f12736a).f1458y;
        if (bVar2 != null) {
            bVar2.p().f1448o.z(bVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12737d).iterator();
        while (it.hasNext()) {
            o4.b0 b0Var = (o4.b0) it.next();
            if (z10) {
                b0Var.getClass();
            }
            b0Var.f18779a.a(bVar, io.sentry.android.fragment.b.STOPPED);
        }
    }

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f12736a = obj;
        this.f12737d = obj2;
    }

    public /* synthetic */ t(Object obj, Object obj2, boolean z10) {
        this.f12737d = obj;
        this.f12736a = obj2;
    }

    public t(jv.a aVar, uv.b bVar, ar.a aVar2) {
        this.f12736a = bVar;
        rv.a aVar3 = aVar2 == null ? null : (rv.a) aVar2.c();
        this.f12737d = aVar3 == null ? new rv.a() : aVar3;
    }

    public t(Context context) {
        Object systemService = context.getSystemService("connectivity");
        this.f12736a = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f12737d = new br.a0(2, false);
        context.registerReceiver(new a5.s(7, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public t(int i10) {
        switch (i10) {
            case 10:
                this.f12736a = new df.c();
                this.f12737d = new h7.w1(16);
                break;
            case 27:
                this.f12736a = new HashMap();
                break;
            default:
                this.f12736a = new LinkedHashMap();
                this.f12737d = new LinkedHashMap();
                break;
        }
    }

    public t(i7.m mVar, String str) {
        br.l.e(str, "className");
        this.f12737d = mVar;
        this.f12736a = str;
    }

    public t(Callable callable) {
        this.f12737d = callable;
    }
}
