package bk;

import a5.o;
import ak.a0;
import ak.b0;
import ak.u;
import android.location.Location;
import android.os.Looper;
import cc.s;
import ch.n;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import h9.r2;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import lf.t1;
import sm.m;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Object f2803a = new ee.k();

    /* renamed from: b, reason: collision with root package name */
    public Object f2804b = new ee.k();

    /* renamed from: c, reason: collision with root package name */
    public Object f2805c = new ee.k();

    /* renamed from: d, reason: collision with root package name */
    public Object f2806d = new ee.k();

    /* renamed from: e, reason: collision with root package name */
    public Object f2807e = new ee.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public Object f2808f = new ee.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f2809g = new ee.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public Object f2810h = new ee.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public Object f2811i;
    public Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2812l;

    public f() {
        int i10 = 0;
        this.f2811i = new ee.f(i10);
        this.j = new ee.f(i10);
        this.k = new ee.f(i10);
        this.f2812l = new ee.f(i10);
    }

    public static final void a(f fVar, LocationResult locationResult) {
        List list;
        int size;
        n.b("FusedLocationDataSource", "[handleLocationResult] called with " + locationResult);
        Location location = null;
        if (locationResult != null && (size = (list = locationResult.f5314a).size()) != 0) {
            location = (Location) list.get(size - 1);
        }
        if (location != null) {
            ((Executor) fVar.f2810h).execute(new io.sentry.cache.e(fVar, 8, (u) ((xj.i) fVar.f2809g).a(location)));
            return;
        }
        xi.u uVar = (xi.u) fVar.f2812l;
        if (uVar != null) {
            uVar.b("Location is null. Returning");
        }
    }

    public ee.l b() {
        ee.l lVar = new ee.l();
        lVar.f8124a = (t1) this.f2803a;
        lVar.f8125b = (t1) this.f2804b;
        lVar.f8126c = (t1) this.f2805c;
        lVar.f8127d = (t1) this.f2806d;
        lVar.f8128e = (ee.d) this.f2807e;
        lVar.f8129f = (ee.d) this.f2808f;
        lVar.f8130g = (ee.d) this.f2809g;
        lVar.f8131h = (ee.d) this.f2810h;
        lVar.f8132i = (ee.f) this.f2811i;
        lVar.j = (ee.f) this.j;
        lVar.k = (ee.f) this.k;
        lVar.f8133l = (ee.f) this.f2812l;
        return lVar;
    }

    public LocationRequest c(int i10) {
        a0 a0Var = ((ak.g) ((q3.a) this.f2807e).f20680g).f529f.f450b;
        n.b("FusedLocationDataSource", "createLocationRequest() called with: requestPriority: " + i10 + ", locationConfig = " + a0Var);
        long j = a0Var.f418f;
        long j7 = a0Var.f420h;
        long j10 = a0Var.f417e;
        int i11 = a0Var.f419g;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.g(j);
        locationRequest.e(j7);
        tc.e.a(i10);
        locationRequest.f5307a = i10;
        if (j10 > 0) {
            s.a("durationMillis must be greater than 0", j10 > 0);
            locationRequest.f5311x = j10;
        }
        if (i11 <= 0) {
            return locationRequest;
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(c7.a.l(i11, "invalid numUpdates: ", new StringBuilder(String.valueOf(i11).length() + 20)));
        }
        locationRequest.f5312y = i11;
        return locationRequest;
    }

    public void d(d dVar) {
        br.l.e(dVar, "event");
        n.b("NetworkEventStabiliser", "Event received - " + dVar);
        switch (e.f2802a[dVar.ordinal()]) {
            case 1:
                this.f2809g = g(dVar, (Future) this.f2809g);
                break;
            case 2:
                this.f2810h = g(dVar, (Future) this.f2810h);
                break;
            case 3:
                this.f2811i = g(dVar, (Future) this.f2811i);
                break;
            case 4:
                this.j = g(dVar, (Future) this.j);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.k = g(dVar, (Future) this.k);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f2812l = g(dVar, (Future) this.f2812l);
                break;
        }
    }

    public void e() {
        pc.a aVar = (pc.a) this.f2803a;
        qm.c cVar = (qm.c) this.f2808f;
        ag.b bVar = (ag.b) this.f2806d;
        n.b("FusedLocationDataSource", "[requestNewLocation]");
        Boolean boolM0 = ((r2) this.f2804b).m0();
        if (!(boolM0 == null ? true : boolM0.booleanValue()) && !bVar.i("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            n.b("FusedLocationDataSource", "Cannot request a new location as we don't have background permission and app is in background.");
            xi.u uVar = (xi.u) this.f2812l;
            if (uVar != null) {
                uVar.b("Cannot request a new location as we don't have background permission and app is in background.");
                return;
            }
            return;
        }
        if (!bVar.g()) {
            n.b("FusedLocationDataSource", "Cannot request a new location as we don't have permission.");
            xi.u uVar2 = (xi.u) this.f2812l;
            if (uVar2 != null) {
                uVar2.b("Cannot request a new location as we don't have permission.");
                return;
            }
            return;
        }
        if (!((b0) cVar.f20919g).f435a) {
            n.g("FusedLocationDataSource", "Location is not enabled");
            xi.u uVar3 = (xi.u) this.f2812l;
            if (uVar3 != null) {
                uVar3.b("Location is not enabled");
                return;
            }
            return;
        }
        LocationRequest locationRequestC = (bVar.i("android.permission.ACCESS_FINE_LOCATION") && ((b0) cVar.f20919g).f436b) ? c(100) : c(102);
        n.b("FusedLocationDataSource", "Requesting Location Updates for request: " + locationRequestC);
        ji.a aVar2 = (ji.a) this.k;
        Looper mainLooper = Looper.getMainLooper();
        br.l.d(mainLooper, "getMainLooper(...)");
        m.z(aVar, locationRequestC, aVar2, mainLooper);
        a0 a0Var = ((ak.g) ((q3.a) this.f2807e).f20680g).f529f.f450b;
        if (!a0Var.f421i) {
            n.b("FusedLocationDataSource", "startPassiveLocationRequest: Passive location NOT Enabled, returning.");
            return;
        }
        n.b("FusedLocationDataSource", "startPassiveLocationRequest: Requesting updates with config: " + a0Var + '.');
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.e(a0Var.j);
        float f10 = (float) a0Var.k;
        if (f10 < 0.0f) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 22);
            sb2.append("invalid displacement: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }
        locationRequest.B = f10;
        tc.e.a(105);
        locationRequest.f5307a = 105;
        ji.a aVar3 = (ji.a) this.j;
        Looper mainLooper2 = Looper.getMainLooper();
        br.l.d(mainLooper2, "getMainLooper(...)");
        m.z(aVar, locationRequest, aVar3, mainLooper2);
    }

    public void f() {
        n.b("FusedLocationDataSource", "[stopRequestingLocation]");
        m mVar = (m) this.f2811i;
        pc.a aVar = (pc.a) this.f2803a;
        ji.a aVar2 = (ji.a) this.k;
        mVar.getClass();
        br.l.e(aVar, "fusedLocationProviderClient");
        br.l.e(aVar2, "locationCallback");
        aVar.d(aVar2);
    }

    public Future g(d dVar, Future future) {
        if (future != null) {
            n.b("NetworkEventStabiliser", "Cancelling event for " + dVar);
            future.cancel(true);
        }
        Future<?> futureSubmit = ((ThreadPoolExecutor) this.f2803a).submit(new o(dVar, 5, this));
        br.l.d(futureSubmit, "submit(...)");
        return futureSubmit;
    }
}
