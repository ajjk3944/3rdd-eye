package zh;

import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import fj.n;
import fj.r;
import fj.s;
import io.sentry.t;

/* loaded from: classes.dex */
public final class e implements s, r {

    /* renamed from: a, reason: collision with root package name */
    public b f27413a;

    /* renamed from: d, reason: collision with root package name */
    public TelephonyDisplayInfo f27414d;

    /* renamed from: g, reason: collision with root package name */
    public t f27415g;

    /* renamed from: r, reason: collision with root package name */
    public final n f27416r;

    /* renamed from: x, reason: collision with root package name */
    public final xr.a f27417x;

    /* renamed from: y, reason: collision with root package name */
    public final xr.a f27418y;

    public e(n nVar, xr.a aVar) {
        this.f27416r = nVar;
        this.f27417x = aVar;
        this.f27418y = aVar;
    }

    public final void a(b bVar) {
        if (this.f27413a == null) {
            this.f27413a = bVar;
            if (this.f27415g != null) {
                ch.n.b("ServiceStateDetector", "notifyServiceStateDetected() called with: internalServiceState = [" + bVar + "]");
                t tVar = this.f27415g;
                tVar.getClass();
                ch.n.b("ServiceStateDetectorLis", "onServiceStateDetected() called with: internalServiceState = [" + bVar + "]");
                tVar.j("SERVICE_STATE_DETECTED", bVar);
            }
        }
        if (this.f27413a.equals(bVar)) {
            return;
        }
        this.f27413a = bVar;
        if (this.f27415g != null) {
            ch.n.b("ServiceStateDetector", "notifyServiceStateChanged() called with: internalServiceState = [" + bVar + "]");
            t tVar2 = this.f27415g;
            tVar2.getClass();
            ch.n.b("ServiceStateDetectorLis", "onServiceStateChanged() called with: internalServiceState = [" + bVar + "]");
            tVar2.j("SERVICE_STATE_CHANGED", bVar);
        }
    }

    public final void b(TelephonyDisplayInfo telephonyDisplayInfo) {
        if (telephonyDisplayInfo == null && this.f27414d == null) {
            return;
        }
        if (this.f27414d == null) {
            this.f27414d = telephonyDisplayInfo;
            if (this.f27415g != null) {
                ch.n.b("ServiceStateDetector", "notifyTelephonyDisplayInfoDetected() called with: telephonyDisplayInfo = [" + telephonyDisplayInfo + "]");
                t tVar = this.f27415g;
                tVar.getClass();
                ch.n.b("ServiceStateDetectorLis", "onDisplayInfoDetected() called with: telephonyDisplayInfo = [" + telephonyDisplayInfo + "]");
                tVar.i("DISPLAY_INFO_DETECTED", telephonyDisplayInfo);
            }
        }
        if (this.f27414d.equals(telephonyDisplayInfo)) {
            return;
        }
        this.f27414d = telephonyDisplayInfo;
        if (this.f27415g != null) {
            ch.n.b("ServiceStateDetector", "notifyTelephonyDisplayInfoChanged() called with: telephonyDisplayInfo = [" + telephonyDisplayInfo + "]");
            t tVar2 = this.f27415g;
            tVar2.getClass();
            ch.n.b("ServiceStateDetectorLis", "onDisplayInfoChanged() called with: telephonyDisplayInfo = [" + telephonyDisplayInfo + "]");
            tVar2.i("DISPLAY_INFO_CHANGED", telephonyDisplayInfo);
        }
    }

    public final void c() {
        ch.n.b("ServiceStateDetector", "stop() called");
        n nVar = this.f27416r;
        if (nVar != null) {
            nVar.e(this);
            n nVar2 = this.f27416r;
            nVar2.getClass();
            synchronized (nVar2.M) {
                nVar2.M.remove(this);
            }
        }
    }

    @Override // fj.r
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        ch.n.b("ServiceStateProvider5g", "onDisplayInfoChanged() called");
        telephonyDisplayInfo.toString();
        ch.n.a();
        b(telephonyDisplayInfo);
    }

    @Override // fj.s
    public final void onServiceStateChanged(ServiceState serviceState) {
        ch.n.b("ServiceStateProvider5g", "onServiceStateChanged() called");
        serviceState.toString();
        ch.n.a();
        a(this.f27418y.c(serviceState));
    }
}
