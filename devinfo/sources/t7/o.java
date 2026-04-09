package t7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import b5.i0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.o0;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z1;
import com.google.android.gms.internal.play_billing.z3;
import com.liuzh.deviceinfo.DeviceInfoApp;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends a {
    public final DeviceInfoApp C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile qd.m F;
    public volatile ScheduledExecutorService G;

    public o(ja.c cVar, DeviceInfoApp deviceInfoApp, fe.b bVar) {
        super(cVar, deviceInfoApp, bVar);
        this.D = 0;
        this.C = deviceInfoApp;
    }

    public final r0 H(int i4) {
        if (!N()) {
            u.h("BillingClientTesting", "Billing Override Service is not ready.");
            I(94, 28, r.a(-1, "Billing Override Service connection is disconnected."));
            return new q0(0);
        }
        m mVar = new m(this, i4, 0);
        z3 z3Var = new z3();
        z3Var.f20276c = new c4();
        b4 b4Var = new b4(z3Var);
        z3Var.f20275b = b4Var;
        z3Var.f20274a = m.class;
        try {
            mVar.C(z3Var);
            z3Var.f20274a = "billingOverrideService.getBillingOverride";
            return b4Var;
        } catch (Exception e2) {
            z1 z1Var = new z1(e2);
            u6.t tVar = y3.f20266f;
            a4 a4Var = b4Var.f20092b;
            if (tVar.A(a4Var, null, z1Var)) {
                y3.d(a4Var);
            }
            return b4Var;
        }
    }

    public final void I(int i4, int i10, c cVar) {
        int i11 = p.f34476a;
        y2 y2VarB = p.b(i4, i10, cVar, null, e3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(y2VarB, "ApiFailure should not be null");
        this.f34415h.C(y2VarB);
    }

    public final void J(int i4, d4.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        r0 r0VarH = H(i4);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!r0VarH.isDone()) {
            t0 t0Var = new t0();
            t0Var.f20229h = r0VarH;
            s0 s0Var = new s0();
            s0Var.f20227a = t0Var;
            t0Var.f20230i = scheduledExecutorService.schedule(s0Var, 28500L, timeUnit);
            r0VarH.c(s0Var, o0.f20198a);
            r0VarH = t0Var;
        }
        l7.d dVar = new l7.d();
        dVar.f28603a = i4;
        dVar.f28604b = aVar;
        dVar.f28605c = runnable;
        dVar.f28606d = this;
        r0VarH.c(new p0(r0VarH, dVar), g());
    }

    public final synchronized boolean N() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // t7.a
    public final void a(km.i iVar, pf.u uVar) {
        J(3, new b4.h(4, uVar), new b4.o(this, iVar, uVar, false, 22));
    }

    @Override // t7.a
    public final void b(cl.u uVar, lf.e eVar) {
        J(4, new b4.h(uVar, eVar), new b4.o(this, uVar, eVar, false, 21));
    }

    @Override // t7.a
    public final c d(Activity activity, i0 i0Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) H(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e2) {
            I(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 28, r.f34492r);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e2);
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            I(95, 28, r.f34492r);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
        }
        if (iIntValue > 0) {
            c cVarA = r.a(iIntValue, "Billing override value was set by a license tester.");
            I(93, 2, cVarA);
            G(cVarA);
            return cVarA;
        }
        try {
            return super.d(activity, i0Var);
        } catch (Exception e11) {
            c cVar = r.f34483h;
            I(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 2, cVar);
            u.i("BillingClientTesting", "An internal error occurred.", e11);
            return cVar;
        }
    }

    @Override // t7.a
    public final void e(km.i iVar, ri.d dVar) {
        J(7, new b4.h(2, dVar), new b4.o(this, iVar, dVar, false, 20));
    }

    @Override // t7.a
    public final void f(km.i iVar) {
        synchronized (this) {
            if (N()) {
                u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i4 = p.f34476a;
                a3 a3VarC = p.c(26, e3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(a3VarC, "ApiSuccess should not be null");
                km.n nVar = this.f34415h;
                nVar.getClass();
                try {
                    nVar.K(a3VarC, (h3) nVar.f28442b);
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
            } else {
                int i10 = 1;
                if (this.D == 1) {
                    u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    I(38, 26, r.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = 1;
                    u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new qd.m(i10, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    DeviceInfoApp deviceInfoApp = this.C;
                    List<ResolveInfo> listQueryIntentServices = deviceInfoApp.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                u.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (deviceInfoApp.bindService(intent2, this.F, 1)) {
                                    u.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    u.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i10 = 39;
                        }
                    }
                    this.D = 0;
                    u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    I(i10, 26, r.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        o(iVar);
    }

    public o(ja.c cVar, DeviceInfoApp deviceInfoApp, h hVar, fe.b bVar) {
        super(cVar, deviceInfoApp, hVar, bVar);
        this.D = 0;
        this.C = deviceInfoApp;
    }
}
