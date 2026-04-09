package ab;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import ec.d3;
import ec.g0;
import ec.j3;
import ec.n4;
import ec.o1;
import ec.q2;
import ec.s0;
import ec.u;
import ec.u1;
import ec.z3;
import fb.h;
import fb.k;
import fb.t;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f301e;

    public /* synthetic */ c(u1 u1Var, Bundle bundle, String str, n4 n4Var) {
        this.f297a = 4;
        this.f298b = u1Var;
        this.f300d = bundle;
        this.f299c = str;
        this.f301e = n4Var;
    }

    private final void a() {
        g0 g0Var;
        j3 j3Var = (j3) this.f298b;
        AtomicReference atomicReference = (AtomicReference) this.f299c;
        n4 n4Var = (n4) this.f300d;
        z3 z3Var = (z3) this.f301e;
        synchronized (atomicReference) {
            try {
                g0Var = j3Var.f22819e;
            } catch (RemoteException e2) {
                s0 s0Var = ((o1) j3Var.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.e(e2, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (g0Var != null) {
                g0Var.e3(n4Var, z3Var, new d3(j3Var, atomicReference));
                j3Var.O();
            } else {
                s0 s0Var2 = ((o1) j3Var.f218b).f22954f;
                o1.m(s0Var2);
                s0Var2.g.d("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    private final void b() {
        boolean zContains;
        k kVar = (k) this.f298b;
        String str = (String) this.f299c;
        h hVar = (h) this.f300d;
        rw rwVar = (rw) this.f301e;
        t tVar = kVar.f23941b;
        tVar.h();
        synchronized (tVar.f23977d) {
            zContains = tVar.f23974a.contains(str);
        }
        if (zContains || kVar.a()) {
            return;
        }
        hVar.v3(new vb.b(kVar.f23940a), rwVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0472  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.c.run():void");
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f297a = i4;
        this.f298b = obj;
        this.f299c = obj2;
        this.f300d = obj3;
        this.f301e = obj4;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i4, boolean z3) {
        this.f297a = i4;
        this.f298b = obj2;
        this.f299c = obj3;
        this.f300d = obj4;
        this.f301e = obj;
    }

    public c(AppMeasurementDynamiteService appMeasurementDynamiteService, l0 l0Var, u uVar, String str) {
        this.f297a = 3;
        this.f298b = l0Var;
        this.f300d = uVar;
        this.f299c = str;
        this.f301e = appMeasurementDynamiteService;
    }

    public c(q2 q2Var, AtomicReference atomicReference, String str, String str2) {
        this.f297a = 5;
        this.f298b = atomicReference;
        this.f299c = str;
        this.f300d = str2;
        Objects.requireNonNull(q2Var);
        this.f301e = q2Var;
    }

    public c(d dVar, String str, String str2, Bundle bundle) {
        this.f297a = 10;
        this.f299c = str;
        this.f298b = str2;
        this.f300d = bundle;
        this.f301e = dVar;
    }
}
