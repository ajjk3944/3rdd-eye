package com.google.android.gms.measurement.internal;

import ab.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b7.h;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import ec.a4;
import ec.b3;
import ec.c2;
import ec.g2;
import ec.h2;
import ec.j2;
import ec.k2;
import ec.l1;
import ec.l4;
import ec.m1;
import ec.m2;
import ec.m4;
import ec.o1;
import ec.q2;
import ec.s0;
import ec.t;
import ec.u;
import ec.u2;
import ec.w;
import ec.w2;
import ec.y2;
import ec.y3;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import pb.y;
import vb.b;
import vd.a;
import x.e;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public o1 f20283a;

    /* renamed from: b, reason: collision with root package name */
    public final e f20284b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f20283a = null;
        this.f20284b = new e(0);
    }

    public final void S() {
        if (this.f20283a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void T(String str, l0 l0Var) {
        S();
        l4 l4Var = this.f20283a.f22956i;
        o1.k(l4Var);
        l4Var.k0(str, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        S();
        w wVar = this.f20283a.f22960n;
        o1.j(wVar);
        wVar.C(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.P(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.C();
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new a(q2Var, false, null, 17));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        S();
        w wVar = this.f20283a.f22960n;
        o1.j(wVar);
        wVar.D(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void generateEventId(l0 l0Var) throws RemoteException {
        S();
        l4 l4Var = this.f20283a.f22956i;
        o1.k(l4Var);
        long jY0 = l4Var.y0();
        S();
        l4 l4Var2 = this.f20283a.f22956i;
        o1.k(l4Var2);
        l4Var2.l0(l0Var, jY0);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getAppInstanceId(l0 l0Var) throws RemoteException {
        S();
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        l1Var.K(new m1(this, l0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCachedAppInstanceId(l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        T((String) q2Var.f23012h.get(), l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getConditionalUserProperties(String str, String str2, l0 l0Var) throws RemoteException {
        S();
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        l1Var.K(new c(this, l0Var, str, str2, 6, false));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCurrentScreenClass(l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        b3 b3Var = ((o1) q2Var.f218b).f22958l;
        o1.l(b3Var);
        y2 y2Var = b3Var.f22587d;
        T(y2Var != null ? y2Var.f23205b : null, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCurrentScreenName(l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        b3 b3Var = ((o1) q2Var.f218b).f22958l;
        o1.l(b3Var);
        y2 y2Var = b3Var.f22587d;
        T(y2Var != null ? y2Var.f23204a : null, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getGmpAppId(l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        T(q2Var.Q(), l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getMaxUserProperties(String str, l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        y.e(str);
        ((o1) q2Var.f218b).getClass();
        S();
        l4 l4Var = this.f20283a.f22956i;
        o1.k(l4Var);
        l4Var.m0(l0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getSessionId(l0 l0Var) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new a(q2Var, l0Var));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getTestFlag(l0 l0Var, int i4) throws RemoteException {
        S();
        if (i4 == 0) {
            l4 l4Var = this.f20283a.f22956i;
            o1.k(l4Var);
            q2 q2Var = this.f20283a.f22959m;
            o1.l(q2Var);
            AtomicReference atomicReference = new AtomicReference();
            l1 l1Var = ((o1) q2Var.f218b).g;
            o1.m(l1Var);
            l4Var.k0((String) l1Var.L(atomicReference, 15000L, "String test flag value", new j2(q2Var, atomicReference, 1)), l0Var);
            return;
        }
        if (i4 == 1) {
            l4 l4Var2 = this.f20283a.f22956i;
            o1.k(l4Var2);
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            l1 l1Var2 = ((o1) q2Var2.f218b).g;
            o1.m(l1Var2);
            l4Var2.l0(l0Var, ((Long) l1Var2.L(atomicReference2, 15000L, "long test flag value", new j2(q2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i4 == 2) {
            l4 l4Var3 = this.f20283a.f22956i;
            o1.k(l4Var3);
            q2 q2Var3 = this.f20283a.f22959m;
            o1.l(q2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            l1 l1Var3 = ((o1) q2Var3.f218b).g;
            o1.m(l1Var3);
            double dDoubleValue = ((Double) l1Var3.L(atomicReference3, 15000L, "double test flag value", new j2(q2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                l0Var.X2(bundle);
                return;
            } catch (RemoteException e2) {
                s0 s0Var = ((o1) l4Var3.f218b).f22954f;
                o1.m(s0Var);
                s0Var.j.e(e2, "Error returning double value to wrapper");
                return;
            }
        }
        if (i4 == 3) {
            l4 l4Var4 = this.f20283a.f22956i;
            o1.k(l4Var4);
            q2 q2Var4 = this.f20283a.f22959m;
            o1.l(q2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            l1 l1Var4 = ((o1) q2Var4.f218b).g;
            o1.m(l1Var4);
            l4Var4.m0(l0Var, ((Integer) l1Var4.L(atomicReference4, 15000L, "int test flag value", new j2(q2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i4 != 4) {
            return;
        }
        l4 l4Var5 = this.f20283a.f22956i;
        o1.k(l4Var5);
        q2 q2Var5 = this.f20283a.f22959m;
        o1.l(q2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        l1 l1Var5 = ((o1) q2Var5.f218b).g;
        o1.m(l1Var5);
        l4Var5.o0(l0Var, ((Boolean) l1Var5.L(atomicReference5, 15000L, "boolean test flag value", new j2(q2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getUserProperties(String str, String str2, boolean z3, l0 l0Var) throws RemoteException {
        S();
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        l1Var.K(new g2(this, l0Var, str, str2, z3));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void initForTests(Map map) throws RemoteException {
        S();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void initialize(vb.a aVar, t0 t0Var, long j) throws RemoteException {
        o1 o1Var = this.f20283a;
        if (o1Var == null) {
            Context context = (Context) b.U0(aVar);
            y.h(context);
            this.f20283a = o1.s(context, t0Var, Long.valueOf(j));
        } else {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.j.d("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void isDataCollectionEnabled(l0 l0Var) throws RemoteException {
        S();
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        l1Var.K(new m1(this, l0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z10, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.G(str, str2, bundle, z3, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j) throws RemoteException {
        S();
        y.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        u uVar = new u(str2, new t(bundle), "app", j);
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        l1Var.K(new c(this, l0Var, uVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logHealthData(int i4, String str, vb.a aVar, vb.a aVar2, vb.a aVar3) throws RemoteException {
        S();
        Object objU0 = aVar == null ? null : b.U0(aVar);
        Object objU02 = aVar2 == null ? null : b.U0(aVar2);
        Object objU03 = aVar3 != null ? b.U0(aVar3) : null;
        s0 s0Var = this.f20283a.f22954f;
        o1.m(s0Var);
        s0Var.K(i4, true, false, str, objU0, objU02, objU03);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityCreated(vb.a aVar, Bundle bundle, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityCreatedByScionActivityInfo(v0.a(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j) {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        m2 m2Var = q2Var.f23009d;
        if (m2Var != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
            m2Var.a(v0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityDestroyed(vb.a aVar, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityDestroyedByScionActivityInfo(v0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        m2 m2Var = q2Var.f23009d;
        if (m2Var != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
            m2Var.b(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityPaused(vb.a aVar, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityPausedByScionActivityInfo(v0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityPausedByScionActivityInfo(v0 v0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        m2 m2Var = q2Var.f23009d;
        if (m2Var != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
            m2Var.c(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityResumed(vb.a aVar, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityResumedByScionActivityInfo(v0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityResumedByScionActivityInfo(v0 v0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        m2 m2Var = q2Var.f23009d;
        if (m2Var != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
            m2Var.d(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivitySaveInstanceState(vb.a aVar, l0 l0Var, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(v0.a(activity), l0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        m2 m2Var = q2Var.f23009d;
        Bundle bundle = new Bundle();
        if (m2Var != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
            m2Var.e(v0Var, bundle);
        }
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = this.f20283a.f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStarted(vb.a aVar, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityStartedByScionActivityInfo(v0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStartedByScionActivityInfo(v0 v0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        if (q2Var.f23009d != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStopped(vb.a aVar, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        onActivityStoppedByScionActivityInfo(v0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStoppedByScionActivityInfo(v0 v0Var, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        if (q2Var.f23009d != null) {
            q2 q2Var2 = this.f20283a.f22959m;
            o1.l(q2Var2);
            q2Var2.U();
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void performAction(Bundle bundle, l0 l0Var, long j) throws RemoteException {
        S();
        l0Var.X2(null);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void registerOnMeasurementEventListener(q0 q0Var) throws RemoteException {
        Object m4Var;
        S();
        e eVar = this.f20284b;
        synchronized (eVar) {
            try {
                m4Var = (c2) eVar.get(Integer.valueOf(q0Var.d()));
                if (m4Var == null) {
                    m4Var = new m4(this, q0Var);
                    eVar.put(Integer.valueOf(q0Var.d()), m4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.C();
        if (q2Var.f23011f.add(m4Var)) {
            return;
        }
        s0 s0Var = ((o1) q2Var.f218b).f22954f;
        o1.m(s0Var);
        s0Var.j.d("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void resetAnalyticsData(long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.f23012h.set(null);
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new h2(q2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void retrieveAndUploadBatches(n0 n0Var) throws MalformedURLException {
        w2 w2Var;
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.C();
        o1 o1Var = (o1) q2Var.f218b;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        if (l1Var.H()) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        if (Thread.currentThread() == l1Var2.f22860e) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.d("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (h.e()) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.g.d("Cannot retrieve and upload batches from main thread");
            return;
        }
        s0 s0Var4 = o1Var.f22954f;
        o1.m(s0Var4);
        s0Var4.f23060o.d("[sgtm] Started client-side batch upload work.");
        boolean z3 = false;
        int size = 0;
        int i4 = 0;
        while (!z3) {
            s0 s0Var5 = o1Var.f22954f;
            o1.m(s0Var5);
            s0Var5.f23060o.d("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            l1 l1Var3 = o1Var.g;
            o1.m(l1Var3);
            l1Var3.L(atomicReference, 10000L, "[sgtm] Getting upload batches", new j2(q2Var, atomicReference, 6, false));
            a4 a4Var = (a4) atomicReference.get();
            if (a4Var == null) {
                break;
            }
            List list = a4Var.f22546a;
            if (list.isEmpty()) {
                break;
            }
            s0 s0Var6 = o1Var.f22954f;
            o1.m(s0Var6);
            s0Var6.f23060o.e(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                y3 y3Var = (y3) it.next();
                try {
                    URL url = new URI(y3Var.f23212c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    ec.l0 l0VarR = ((o1) q2Var.f218b).r();
                    l0VarR.C();
                    y.h(l0VarR.f22848h);
                    String str = l0VarR.f22848h;
                    o1 o1Var2 = (o1) q2Var.f218b;
                    s0 s0Var7 = o1Var2.f22954f;
                    o1.m(s0Var7);
                    or orVar = s0Var7.f23060o;
                    Long lValueOf = Long.valueOf(y3Var.f23210a);
                    orVar.g("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, y3Var.f23212c, Integer.valueOf(y3Var.f23211b.length));
                    if (!TextUtils.isEmpty(y3Var.g)) {
                        s0 s0Var8 = o1Var2.f22954f;
                        o1.m(s0Var8);
                        s0Var8.f23060o.f(lValueOf, y3Var.g, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = y3Var.f23213d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    u2 u2Var = o1Var2.f22961o;
                    o1.m(u2Var);
                    byte[] bArr = y3Var.f23211b;
                    yb.e eVar = new yb.e(q2Var, atomicReference2, y3Var, 17);
                    u2Var.D();
                    y.h(url);
                    y.h(bArr);
                    l1 l1Var4 = ((o1) u2Var.f218b).g;
                    o1.m(l1Var4);
                    l1Var4.N(new ec.v0(u2Var, str, url, bArr, map, eVar));
                    try {
                        l4 l4Var = o1Var2.f22956i;
                        o1.k(l4Var);
                        o1 o1Var3 = (o1) l4Var.f218b;
                        o1Var3.f22957k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    o1Var3.f22957k.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        s0 s0Var9 = ((o1) q2Var.f218b).f22954f;
                        o1.m(s0Var9);
                        s0Var9.j.d("[sgtm] Interrupted waiting for uploading batch");
                    }
                    w2Var = atomicReference2.get() == null ? w2.UNKNOWN : (w2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e2) {
                    s0 s0Var10 = ((o1) q2Var.f218b).f22954f;
                    o1.m(s0Var10);
                    s0Var10.g.g("[sgtm] Bad upload url for row_id", y3Var.f23212c, Long.valueOf(y3Var.f23210a), e2);
                    w2Var = w2.FAILURE;
                }
                if (w2Var != w2.SUCCESS) {
                    if (w2Var == w2.BACKOFF) {
                        z3 = true;
                        break;
                    }
                } else {
                    i4++;
                }
            }
        }
        s0 s0Var11 = o1Var.f22954f;
        o1.m(s0Var11);
        s0Var11.f23060o.f(Integer.valueOf(size), Integer.valueOf(i4), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            n0Var.c();
        } catch (RemoteException e10) {
            o1 o1Var4 = this.f20283a;
            y.h(o1Var4);
            s0 s0Var12 = o1Var4.f22954f;
            o1.m(s0Var12);
            s0Var12.j.e(e10, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        S();
        if (bundle == null) {
            s0 s0Var = this.f20283a.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Conditional user property must not be null");
        } else {
            q2 q2Var = this.f20283a.f22959m;
            o1.l(q2Var);
            q2Var.O(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.V(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setCurrentScreen(vb.a aVar, String str, String str2, long j) throws RemoteException {
        S();
        Activity activity = (Activity) b.U0(aVar);
        y.h(activity);
        setCurrentScreenByScionActivityInfo(v0.a(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.v0 r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.v0, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setDataCollectionEnabled(boolean z3) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.C();
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new bi.a(q2Var, z3));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setDefaultEventParameters(Bundle bundle) {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new k2(q2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setEventInterceptor(q0 q0Var) throws RemoteException {
        S();
        i iVar = new i(15, this, q0Var);
        l1 l1Var = this.f20283a.g;
        o1.m(l1Var);
        if (!l1Var.H()) {
            l1 l1Var2 = this.f20283a.g;
            o1.m(l1Var2);
            l1Var2.K(new a(this, false, iVar, 19));
            return;
        }
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.B();
        q2Var.C();
        i iVar2 = q2Var.f23010e;
        if (iVar != iVar2) {
            y.j("EventInterceptor already set.", iVar2 == null);
        }
        q2Var.f23010e = iVar;
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.s0 s0Var) throws RemoteException {
        S();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setMeasurementEnabled(boolean z3, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        Boolean boolValueOf = Boolean.valueOf(z3);
        q2Var.C();
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new a(q2Var, false, boolValueOf, 17));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        S();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        l1 l1Var = ((o1) q2Var.f218b).g;
        o1.m(l1Var);
        l1Var.K(new h2(q2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        o1 o1Var = (o1) q2Var.f218b;
        Uri data = intent.getData();
        if (data == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23058m.d("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23058m.d("[sgtm] Preview Mode was not enabled.");
            o1Var.f22952d.f22717d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        s0 s0Var3 = o1Var.f22954f;
        o1.m(s0Var3);
        s0Var3.f23058m.e(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        o1Var.f22952d.f22717d = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setUserId(String str, long j) throws RemoteException {
        S();
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        o1 o1Var = (o1) q2Var.f218b;
        if (str != null && TextUtils.isEmpty(str)) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.j.d("User ID must be non-empty or null");
        } else {
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.K(new a(20, q2Var, str));
            q2Var.L(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setUserProperty(String str, String str2, vb.a aVar, boolean z3, long j) throws SecurityException, RemoteException {
        S();
        Object objU0 = b.U0(aVar);
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.L(str, str2, objU0, z3, j);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void unregisterOnMeasurementEventListener(q0 q0Var) throws RemoteException {
        Object m4Var;
        S();
        e eVar = this.f20284b;
        synchronized (eVar) {
            m4Var = (c2) eVar.remove(Integer.valueOf(q0Var.d()));
        }
        if (m4Var == null) {
            m4Var = new m4(this, q0Var);
        }
        q2 q2Var = this.f20283a.f22959m;
        o1.l(q2Var);
        q2Var.C();
        if (q2Var.f23011f.remove(m4Var)) {
            return;
        }
        s0 s0Var = ((o1) q2Var.f218b).f22954f;
        o1.m(s0Var);
        s0Var.j.d("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }
}
