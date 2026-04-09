package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C4326d1;
import com.google.android.gms.internal.measurement.C4353g1;
import com.google.android.gms.internal.measurement.InterfaceC4299a1;
import com.google.android.gms.internal.measurement.InterfaceC4308b1;
import java.net.MalformedURLException;
import java.util.Map;
import o.C7010a;
import org.snmp4j.util.SnmpConfigurator;
import s3.AbstractC7901p;
import x3.InterfaceC8420a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.S0 {

    /* renamed from: a, reason: collision with root package name */
    C4976v3 f35784a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f35785b = new C7010a();

    class a implements InterfaceC4930p4 {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC4299a1 f35786a;

        a(InterfaceC4299a1 interfaceC4299a1) {
            this.f35786a = interfaceC4299a1;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC4930p4
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f35786a.P(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                C4976v3 c4976v3 = AppMeasurementDynamiteService.this.f35784a;
                if (c4976v3 != null) {
                    c4976v3.zzj().H().b("Event listener threw exception", e10);
                }
            }
        }
    }

    class b implements InterfaceC4906m4 {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC4299a1 f35788a;

        b(InterfaceC4299a1 interfaceC4299a1) {
            this.f35788a = interfaceC4299a1;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC4906m4
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f35788a.P(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                C4976v3 c4976v3 = AppMeasurementDynamiteService.this.f35784a;
                if (c4976v3 != null) {
                    c4976v3.zzj().H().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.V0 v02) {
        try {
            v02.Y();
        } catch (RemoteException e10) {
            ((C4976v3) AbstractC7901p.l(appMeasurementDynamiteService.f35784a)).zzj().H().b("Failed to call IDynamiteUploadBatchesCallback", e10);
        }
    }

    private final void c() {
        if (this.f35784a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void f(com.google.android.gms.internal.measurement.U0 u02, String str) {
        c();
        this.f35784a.K().O(u02, str);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        c();
        this.f35784a.v().w(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        c();
        this.f35784a.E().j0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        c();
        this.f35784a.E().c0(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        c();
        this.f35784a.v().A(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void generateEventId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        long jM0 = this.f35784a.K().M0();
        c();
        this.f35784a.K().M(u02, jM0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.zzl().z(new RunnableC4890k4(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        f(u02, this.f35784a.E().v0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.zzl().z(new RunnableC4916n6(this, u02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        f(u02, this.f35784a.E().w0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        f(u02, this.f35784a.E().x0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getGmpAppId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        f(u02, this.f35784a.E().y0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.E();
        C4945r4.B(str);
        c();
        this.f35784a.K().L(u02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getSessionId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.E().L(u02);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getTestFlag(com.google.android.gms.internal.measurement.U0 u02, int i10) throws RemoteException {
        c();
        if (i10 == 0) {
            this.f35784a.K().O(u02, this.f35784a.E().z0());
            return;
        }
        if (i10 == 1) {
            this.f35784a.K().M(u02, this.f35784a.E().u0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f35784a.K().L(u02, this.f35784a.E().t0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f35784a.K().Q(u02, this.f35784a.E().r0().booleanValue());
                return;
            }
        }
        x7 x7VarK = this.f35784a.K();
        double dDoubleValue = this.f35784a.E().s0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble(SnmpConfigurator.O_RETRIES, dDoubleValue);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            x7VarK.f36331a.zzj().H().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.zzl().z(new RunnableC4907m5(this, u02, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initForTests(Map map) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initialize(InterfaceC8420a interfaceC8420a, C4326d1 c4326d1, long j10) throws RemoteException {
        C4976v3 c4976v3 = this.f35784a;
        if (c4976v3 == null) {
            this.f35784a = C4976v3.a((Context) AbstractC7901p.l((Context) x3.b.f(interfaceC8420a)), c4326d1, Long.valueOf(j10));
        } else {
            c4976v3.zzj().H().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        c();
        this.f35784a.zzl().z(new M5(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        c();
        this.f35784a.E().l0(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j10) throws RemoteException {
        c();
        AbstractC7901p.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f35784a.zzl().z(new J3(this, u02, new L(str2, new K(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logHealthData(int i10, String str, InterfaceC8420a interfaceC8420a, InterfaceC8420a interfaceC8420a2, InterfaceC8420a interfaceC8420a3) throws RemoteException {
        c();
        this.f35784a.zzj().v(i10, true, false, str, interfaceC8420a == null ? null : x3.b.f(interfaceC8420a), interfaceC8420a2 == null ? null : x3.b.f(interfaceC8420a2), interfaceC8420a3 != null ? x3.b.f(interfaceC8420a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreated(InterfaceC8420a interfaceC8420a, Bundle bundle, long j10) throws RemoteException {
        c();
        onActivityCreatedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreatedByScionActivityInfo(C4353g1 c4353g1, Bundle bundle, long j10) {
        c();
        InterfaceC4875i5 interfaceC4875i5Q0 = this.f35784a.E().q0();
        if (interfaceC4875i5Q0 != null) {
            this.f35784a.E().E0();
            interfaceC4875i5Q0.d(c4353g1, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyed(InterfaceC8420a interfaceC8420a, long j10) throws RemoteException {
        c();
        onActivityDestroyedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyedByScionActivityInfo(C4353g1 c4353g1, long j10) throws RemoteException {
        c();
        InterfaceC4875i5 interfaceC4875i5Q0 = this.f35784a.E().q0();
        if (interfaceC4875i5Q0 != null) {
            this.f35784a.E().E0();
            interfaceC4875i5Q0.a(c4353g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPaused(InterfaceC8420a interfaceC8420a, long j10) throws RemoteException {
        c();
        onActivityPausedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPausedByScionActivityInfo(C4353g1 c4353g1, long j10) throws RemoteException {
        c();
        InterfaceC4875i5 interfaceC4875i5Q0 = this.f35784a.E().q0();
        if (interfaceC4875i5Q0 != null) {
            this.f35784a.E().E0();
            interfaceC4875i5Q0.c(c4353g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumed(InterfaceC8420a interfaceC8420a, long j10) throws RemoteException {
        c();
        onActivityResumedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumedByScionActivityInfo(C4353g1 c4353g1, long j10) throws RemoteException {
        c();
        InterfaceC4875i5 interfaceC4875i5Q0 = this.f35784a.E().q0();
        if (interfaceC4875i5Q0 != null) {
            this.f35784a.E().E0();
            interfaceC4875i5Q0.b(c4353g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceState(InterfaceC8420a interfaceC8420a, com.google.android.gms.internal.measurement.U0 u02, long j10) throws RemoteException {
        c();
        onActivitySaveInstanceStateByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), u02, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceStateByScionActivityInfo(C4353g1 c4353g1, com.google.android.gms.internal.measurement.U0 u02, long j10) throws RemoteException {
        c();
        InterfaceC4875i5 interfaceC4875i5Q0 = this.f35784a.E().q0();
        Bundle bundle = new Bundle();
        if (interfaceC4875i5Q0 != null) {
            this.f35784a.E().E0();
            interfaceC4875i5Q0.e(c4353g1, bundle);
        }
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f35784a.zzj().H().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStarted(InterfaceC8420a interfaceC8420a, long j10) throws RemoteException {
        c();
        onActivityStartedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStartedByScionActivityInfo(C4353g1 c4353g1, long j10) throws RemoteException {
        c();
        if (this.f35784a.E().q0() != null) {
            this.f35784a.E().E0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStopped(InterfaceC8420a interfaceC8420a, long j10) throws RemoteException {
        c();
        onActivityStoppedByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStoppedByScionActivityInfo(C4353g1 c4353g1, long j10) throws RemoteException {
        c();
        if (this.f35784a.E().q0() != null) {
            this.f35784a.E().E0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j10) throws RemoteException {
        c();
        u02.a(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void registerOnMeasurementEventListener(InterfaceC4299a1 interfaceC4299a1) throws RemoteException {
        InterfaceC4930p4 aVar;
        c();
        synchronized (this.f35785b) {
            try {
                aVar = (InterfaceC4930p4) this.f35785b.get(Integer.valueOf(interfaceC4299a1.zza()));
                if (aVar == null) {
                    aVar = new a(interfaceC4299a1);
                    this.f35785b.put(Integer.valueOf(interfaceC4299a1.zza()), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35784a.E().Q(aVar);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void resetAnalyticsData(long j10) throws RemoteException {
        c();
        this.f35784a.E().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.V0 v02) throws MalformedURLException {
        c();
        if (this.f35784a.w().F(null, N.f36044R0)) {
            this.f35784a.E().e0(new Runnable() { // from class: com.google.android.gms.measurement.internal.j3
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.f36554a, v02);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        c();
        if (bundle == null) {
            this.f35784a.zzj().C().a("Conditional user property must not be null");
        } else {
            this.f35784a.E().K(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        c();
        this.f35784a.E().P0(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        c();
        this.f35784a.E().Z0(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreen(InterfaceC8420a interfaceC8420a, String str, String str2, long j10) throws RemoteException {
        c();
        setCurrentScreenByScionActivityInfo(C4353g1.b((Activity) AbstractC7901p.l((Activity) x3.b.f(interfaceC8420a))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreenByScionActivityInfo(C4353g1 c4353g1, String str, String str2, long j10) throws RemoteException {
        c();
        this.f35784a.H().D(c4353g1, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        c();
        this.f35784a.E().d1(z10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        this.f35784a.E().O0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setEventInterceptor(InterfaceC4299a1 interfaceC4299a1) throws RemoteException {
        c();
        b bVar = new b(interfaceC4299a1);
        if (this.f35784a.zzl().G()) {
            this.f35784a.E().P(bVar);
        } else {
            this.f35784a.zzl().z(new M4(this, bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setInstanceIdProvider(InterfaceC4308b1 interfaceC4308b1) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        c();
        this.f35784a.E().c0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        c();
        this.f35784a.E().e1(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        c();
        this.f35784a.E().H(intent);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserId(String str, long j10) throws RemoteException {
        c();
        this.f35784a.E().f0(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserProperty(String str, String str2, InterfaceC8420a interfaceC8420a, boolean z10, long j10) throws SecurityException, RemoteException {
        c();
        this.f35784a.E().o0(str, str2, x3.b.f(interfaceC8420a), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void unregisterOnMeasurementEventListener(InterfaceC4299a1 interfaceC4299a1) throws RemoteException {
        InterfaceC4930p4 aVar;
        c();
        synchronized (this.f35785b) {
            aVar = (InterfaceC4930p4) this.f35785b.remove(Integer.valueOf(interfaceC4299a1.zza()));
        }
        if (aVar == null) {
            aVar = new a(interfaceC4299a1);
        }
        this.f35784a.E().Q0(aVar);
    }
}
