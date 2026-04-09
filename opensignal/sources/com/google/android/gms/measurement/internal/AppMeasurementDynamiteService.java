package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import cc.s;
import cj.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import jc.b;
import jc.d;
import kg.j;
import q3.a;
import qm.c;
import u.e;
import zc.a1;
import zc.b1;
import zc.c0;
import zc.c1;
import zc.d2;
import zc.h2;
import zc.j2;
import zc.l0;
import zc.l2;
import zc.o2;
import zc.q1;
import zc.r;
import zc.s3;
import zc.t3;
import zc.u1;
import zc.v1;
import zc.x1;
import zc.y1;
import zc.z1;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public c1 f5392d;

    /* renamed from: e, reason: collision with root package name */
    public final e f5393e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f5392d = null;
        this.f5393e = new e(0);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        e();
        r rVar = this.f5392d.J;
        c1.d(rVar);
        rVar.t1(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.G1(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.t1();
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new z1(d2Var, 1, (Object) null));
    }

    public final void e() {
        if (this.f5392d == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        e();
        r rVar = this.f5392d.J;
        c1.d(rVar);
        rVar.u1(j, str);
    }

    public final void f(String str, m0 m0Var) {
        e();
        s3 s3Var = this.f5392d.E;
        c1.e(s3Var);
        s3Var.a2(str, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void generateEventId(m0 m0Var) throws RemoteException {
        e();
        s3 s3Var = this.f5392d.E;
        c1.e(s3Var);
        long jO2 = s3Var.o2();
        e();
        s3 s3Var2 = this.f5392d.E;
        c1.e(s3Var2);
        s3Var2.b2(m0Var, jO2);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getAppInstanceId(m0 m0Var) throws RemoteException {
        e();
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        a1Var.B1(new b1(this, m0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCachedAppInstanceId(m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        f((String) d2Var.D.get(), m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getConditionalUserProperties(String str, String str2, m0 m0Var) throws RemoteException {
        e();
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        a1Var.B1(new o.e(this, m0Var, str, str2, 6));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenClass(m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        o2 o2Var = ((c1) d2Var.f1504d).H;
        c1.f(o2Var);
        l2 l2Var = o2Var.f27055r;
        f(l2Var != null ? l2Var.f26994b : null, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenName(m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        o2 o2Var = ((c1) d2Var.f1504d).H;
        c1.f(o2Var);
        l2 l2Var = o2Var.f27055r;
        f(l2Var != null ? l2Var.f26993a : null, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getGmpAppId(m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        f(d2Var.H1(), m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getMaxUserProperties(String str, m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        s.e(str);
        ((c1) d2Var.f1504d).getClass();
        e();
        s3 s3Var = this.f5392d.E;
        c1.e(s3Var);
        s3Var.c2(m0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getSessionId(m0 m0Var) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new z1(d2Var, m0Var));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getTestFlag(m0 m0Var, int i10) throws RemoteException {
        e();
        if (i10 == 0) {
            s3 s3Var = this.f5392d.E;
            c1.e(s3Var);
            d2 d2Var = this.f5392d.I;
            c1.f(d2Var);
            AtomicReference atomicReference = new AtomicReference();
            a1 a1Var = ((c1) d2Var.f1504d).B;
            c1.g(a1Var);
            s3Var.a2((String) a1Var.C1(atomicReference, 15000L, "String test flag value", new x1(d2Var, atomicReference, 1)), m0Var);
            return;
        }
        if (i10 == 1) {
            s3 s3Var2 = this.f5392d.E;
            c1.e(s3Var2);
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            a1 a1Var2 = ((c1) d2Var2.f1504d).B;
            c1.g(a1Var2);
            s3Var2.b2(m0Var, ((Long) a1Var2.C1(atomicReference2, 15000L, "long test flag value", new x1(d2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i10 == 2) {
            s3 s3Var3 = this.f5392d.E;
            c1.e(s3Var3);
            d2 d2Var3 = this.f5392d.I;
            c1.f(d2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            a1 a1Var3 = ((c1) d2Var3.f1504d).B;
            c1.g(a1Var3);
            double dDoubleValue = ((Double) a1Var3.C1(atomicReference3, 15000L, "double test flag value", new x1(d2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                m0Var.C(bundle);
                return;
            } catch (RemoteException e4) {
                zc.j0 j0Var = ((c1) s3Var3.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.F.c(e4, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            s3 s3Var4 = this.f5392d.E;
            c1.e(s3Var4);
            d2 d2Var4 = this.f5392d.I;
            c1.f(d2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            a1 a1Var4 = ((c1) d2Var4.f1504d).B;
            c1.g(a1Var4);
            s3Var4.c2(m0Var, ((Integer) a1Var4.C1(atomicReference4, 15000L, "int test flag value", new x1(d2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        s3 s3Var5 = this.f5392d.E;
        c1.e(s3Var5);
        d2 d2Var5 = this.f5392d.I;
        c1.f(d2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        a1 a1Var5 = ((c1) d2Var5.f1504d).B;
        c1.g(a1Var5);
        s3Var5.e2(m0Var, ((Boolean) a1Var5.C1(atomicReference5, 15000L, "boolean test flag value", new x1(d2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getUserProperties(String str, String str2, boolean z10, m0 m0Var) throws RemoteException {
        e();
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        a1Var.B1(new u1(this, m0Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initForTests(Map map) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initialize(b bVar, zzdd zzddVar, long j) throws RemoteException {
        c1 c1Var = this.f5392d;
        if (c1Var == null) {
            Context context = (Context) d.V(bVar);
            s.h(context);
            this.f5392d = c1.m(context, zzddVar, Long.valueOf(j));
        } else {
            zc.j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.F.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void isDataCollectionEnabled(m0 m0Var) throws RemoteException {
        e();
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        a1Var.B1(new b1(this, m0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.x1(str, str2, bundle, z10, z11, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEventAndBundle(String str, String str2, Bundle bundle, m0 m0Var, long j) throws RemoteException {
        e();
        s.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        a1Var.B1(new o.e(this, m0Var, zzbgVar, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3) throws RemoteException {
        e();
        Object objV = bVar == null ? null : d.V(bVar);
        Object objV2 = bVar2 == null ? null : d.V(bVar2);
        Object objV3 = bVar3 != null ? d.V(bVar3) : null;
        zc.j0 j0Var = this.f5392d.f26889y;
        c1.g(j0Var);
        j0Var.B1(i10, true, false, str, objV, objV2, objV3);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityCreated(b bVar, Bundle bundle, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityCreatedByScionActivityInfo(zzdf.d(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        j jVar = d2Var.f26906r;
        if (jVar != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
            jVar.j(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityDestroyed(b bVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        j jVar = d2Var.f26906r;
        if (jVar != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
            jVar.k(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityPaused(b bVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityPausedByScionActivityInfo(zzdf.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        j jVar = d2Var.f26906r;
        if (jVar != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
            jVar.l(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityResumed(b bVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityResumedByScionActivityInfo(zzdf.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        j jVar = d2Var.f26906r;
        if (jVar != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
            jVar.m(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivitySaveInstanceState(b bVar, m0 m0Var, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.d(activity), m0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, m0 m0Var, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        j jVar = d2Var.f26906r;
        Bundle bundle = new Bundle();
        if (jVar != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
            jVar.n(zzdfVar, bundle);
        }
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            zc.j0 j0Var = this.f5392d.f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStarted(b bVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityStartedByScionActivityInfo(zzdf.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        if (d2Var.f26906r != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStopped(b bVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        onActivityStoppedByScionActivityInfo(zzdf.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        if (d2Var.f26906r != null) {
            d2 d2Var2 = this.f5392d.I;
            c1.f(d2Var2);
            d2Var2.L1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void performAction(Bundle bundle, m0 m0Var, long j) throws RemoteException {
        e();
        m0Var.C(null);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void registerOnMeasurementEventListener(r0 r0Var) throws RemoteException {
        Object t3Var;
        e();
        e eVar = this.f5393e;
        synchronized (eVar) {
            try {
                t3Var = (q1) eVar.get(Integer.valueOf(r0Var.b()));
                if (t3Var == null) {
                    t3Var = new t3(this, r0Var);
                    eVar.put(Integer.valueOf(r0Var.b()), t3Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.t1();
        if (d2Var.f26908y.add(t3Var)) {
            return;
        }
        zc.j0 j0Var = ((c1) d2Var.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.F.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void resetAnalyticsData(long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.D.set(null);
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new v1(d2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void retrieveAndUploadBatches(o0 o0Var) throws MalformedURLException {
        j2 j2Var;
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.t1();
        c1 c1Var = (c1) d2Var.f1504d;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        if (a1Var.y1()) {
            zc.j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        if (Thread.currentThread() == a1Var2.f26855x) {
            zc.j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.b("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (zc.d.d()) {
            zc.j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.B.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        zc.j0 j0Var4 = c1Var.f26889y;
        c1.g(j0Var4);
        j0Var4.K.b("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            zc.j0 j0Var5 = c1Var.f26889y;
            c1.g(j0Var5);
            j0Var5.K.b("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            a1 a1Var3 = c1Var.B;
            c1.g(a1Var3);
            a1Var3.C1(atomicReference, 10000L, "[sgtm] Getting upload batches", new x1(d2Var, atomicReference, 6, false));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f5419a;
            if (list.isEmpty()) {
                break;
            }
            zc.j0 j0Var6 = c1Var.f26889y;
            c1.g(j0Var6);
            j0Var6.K.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.f5414g).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    c0 c0VarL = ((c1) d2Var.f1504d).l();
                    c0VarL.t1();
                    s.h(c0VarL.D);
                    String str = c0VarL.D;
                    c1 c1Var2 = (c1) d2Var.f1504d;
                    zc.j0 j0Var7 = c1Var2.f26889y;
                    c1.g(j0Var7);
                    su.b bVar = j0Var7.K;
                    Long lValueOf = Long.valueOf(zzomVar.f5412a);
                    bVar.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f5414g, Integer.valueOf(zzomVar.f5413d.length));
                    if (!TextUtils.isEmpty(zzomVar.B)) {
                        zc.j0 j0Var8 = c1Var2.f26889y;
                        c1.g(j0Var8);
                        j0Var8.K.d(lValueOf, zzomVar.B, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.f5415r;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    h2 h2Var = c1Var2.K;
                    c1.g(h2Var);
                    byte[] bArr = zzomVar.f5413d;
                    c cVar = new c(d2Var, atomicReference2, zzomVar, 27);
                    h2Var.u1();
                    s.h(url);
                    s.h(bArr);
                    a1 a1Var4 = ((c1) h2Var.f1504d).B;
                    c1.g(a1Var4);
                    a1Var4.E1(new l0(h2Var, str, url, bArr, map, cVar));
                    try {
                        s3 s3Var = c1Var2.E;
                        c1.e(s3Var);
                        c1 c1Var3 = (c1) s3Var.f1504d;
                        c1Var3.G.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    c1Var3.G.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        zc.j0 j0Var9 = ((c1) d2Var.f1504d).f26889y;
                        c1.g(j0Var9);
                        j0Var9.F.b("[sgtm] Interrupted waiting for uploading batch");
                    }
                    j2Var = atomicReference2.get() == null ? j2.UNKNOWN : (j2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e4) {
                    zc.j0 j0Var10 = ((c1) d2Var.f1504d).f26889y;
                    c1.g(j0Var10);
                    j0Var10.B.e("[sgtm] Bad upload url for row_id", zzomVar.f5414g, Long.valueOf(zzomVar.f5412a), e4);
                    j2Var = j2.FAILURE;
                }
                if (j2Var != j2.SUCCESS) {
                    if (j2Var == j2.BACKOFF) {
                        z10 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        zc.j0 j0Var11 = c1Var.f26889y;
        c1.g(j0Var11);
        j0Var11.K.d(Integer.valueOf(size), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            o0Var.a();
        } catch (RemoteException e10) {
            c1 c1Var4 = this.f5392d;
            s.h(c1Var4);
            zc.j0 j0Var12 = c1Var4.f26889y;
            c1.g(j0Var12);
            j0Var12.F.c(e10, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        e();
        if (bundle == null) {
            zc.j0 j0Var = this.f5392d.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Conditional user property must not be null");
        } else {
            d2 d2Var = this.f5392d.I;
            c1.f(d2Var);
            d2Var.F1(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.M1(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setCurrentScreen(b bVar, String str, String str2, long j) throws RemoteException {
        e();
        Activity activity = (Activity) d.V(bVar);
        s.h(activity);
        setCurrentScreenByScionActivityInfo(zzdf.d(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.t1();
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new f(d2Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDefaultEventParameters(Bundle bundle) {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new y1(d2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setEventInterceptor(r0 r0Var) throws RemoteException {
        e();
        a aVar = new a(28, this, r0Var, false);
        a1 a1Var = this.f5392d.B;
        c1.g(a1Var);
        if (!a1Var.y1()) {
            a1 a1Var2 = this.f5392d.B;
            c1.g(a1Var2);
            a1Var2.B1(new z1(this, 3, aVar));
            return;
        }
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.s1();
        d2Var.t1();
        a aVar2 = d2Var.f26907x;
        if (aVar != aVar2) {
            s.j("EventInterceptor already set.", aVar2 == null);
        }
        d2Var.f26907x = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setInstanceIdProvider(t0 t0Var) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMeasurementEnabled(boolean z10, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        Boolean boolValueOf = Boolean.valueOf(z10);
        d2Var.t1();
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new z1(d2Var, 1, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        a1 a1Var = ((c1) d2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new v1(d2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        c1 c1Var = (c1) d2Var.f1504d;
        Uri data = intent.getData();
        if (data == null) {
            zc.j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.I.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zc.j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.I.b("[sgtm] Preview Mode was not enabled.");
            c1Var.f26887r.f26921r = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        zc.j0 j0Var3 = c1Var.f26889y;
        c1.g(j0Var3);
        j0Var3.I.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c1Var.f26887r.f26921r = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserId(String str, long j) throws RemoteException {
        e();
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        c1 c1Var = (c1) d2Var.f1504d;
        if (str != null && TextUtils.isEmpty(str)) {
            zc.j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.F.b("User ID must be non-empty or null");
        } else {
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.B1(new z1(d2Var, 5, str));
            d2Var.C1(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserProperty(String str, String str2, b bVar, boolean z10, long j) throws SecurityException, RemoteException {
        e();
        Object objV = d.V(bVar);
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.C1(str, str2, objV, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void unregisterOnMeasurementEventListener(r0 r0Var) throws RemoteException {
        Object t3Var;
        e();
        e eVar = this.f5393e;
        synchronized (eVar) {
            t3Var = (q1) eVar.remove(Integer.valueOf(r0Var.b()));
        }
        if (t3Var == null) {
            t3Var = new t3(this, r0Var);
        }
        d2 d2Var = this.f5392d.I;
        c1.f(d2Var);
        d2Var.t1();
        if (d2Var.f26908y.remove(t3Var)) {
            return;
        }
        zc.j0 j0Var = ((c1) d2Var.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.F.b("OnEventListener had not been registered");
    }
}
