package dj;

import ak.v0;
import android.content.Context;
import br.l;
import cj.n;
import h9.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jj.a0;
import jj.d0;
import jj.h0;
import jj.i0;
import jj.k;
import jj.k0;
import jj.l0;
import jj.n0;
import jj.o;
import jj.o0;
import jj.p;
import jj.q0;
import jj.r0;
import jj.s;
import jj.s0;
import jj.t0;
import jj.u;
import jj.w;
import jj.y;
import org.json.JSONException;
import org.json.JSONObject;
import xi.m;
import xi.q;
import xi.r;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7402a;

    public /* synthetic */ h(ch.d dVar, byte b2) {
        this.f7402a = dVar;
    }

    public jj.c a(u uVar) {
        ch.d dVar = this.f7402a;
        if (dVar.B1 == null) {
            dVar.B1 = new m(dVar.a0());
        }
        m mVar = dVar.B1;
        if (mVar != null) {
            return new jj.c(uVar, mVar);
        }
        l.l("_locationSettingsUpdatedDataSource");
        throw null;
    }

    public jj.e b() {
        ch.d dVar = this.f7402a;
        if (dVar.Z0 == null) {
            dVar.Z0 = new jj.e(dVar.c());
        }
        jj.e eVar = dVar.Z0;
        if (eVar != null) {
            return eVar;
        }
        l.l("_appLifecycleTriggerDataSource");
        throw null;
    }

    public xi.g c() {
        ch.d dVar = this.f7402a;
        if (dVar.W0 == null) {
            dVar.W0 = new xi.g(dVar.k0(), dVar.g0(), 0);
        }
        xi.g gVar = dVar.W0;
        if (gVar != null) {
            return gVar;
        }
        l.l("_cellularConnectedStateTriggerDataSource");
        throw null;
    }

    public ik.a d(o0 o0Var) {
        xi.d rVar;
        int i10 = o0Var == null ? -1 : l0.f13743a[o0Var.ordinal()];
        int i11 = 0;
        ch.d dVar = this.f7402a;
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                throw new bf.n();
            case 1:
                return new jj.b(b(), 2);
            case 2:
                return new jj.c(o.CONNECTED, c());
            case 3:
                return new jj.c(o.DISCONNECTED, c());
            case 4:
                return new q0(r0.CONNECTED, f(), null);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                r0 r0Var = r0.CONNECTED_TO_SSID;
                xi.g gVarF = f();
                if (dVar.f3935y4 == null) {
                    dVar.f3935y4 = new et.d();
                }
                et.d dVar2 = dVar.f3935y4;
                if (dVar2 != null) {
                    return new q0(r0Var, gVarF, dVar2);
                }
                l.l("_wifiSsidMatcher");
                throw null;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new q0(r0.DISCONNECTED, f(), null);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new jj.c(s0.ON, g());
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new jj.c(s0.OFF, g());
            case 9:
                return new jj.c(i0.CONNECTED, dVar.r0());
            case 10:
                return new jj.c(i0.DISCONNECTED, dVar.r0());
            case 11:
                if (dVar.Y0 == null) {
                    dVar.Y0 = new xi.i(0);
                }
                xi.i iVar = dVar.Y0;
                if (iVar != null) {
                    return new p(iVar);
                }
                l.l("_deviceBootTriggerDataSource");
                throw null;
            case 12:
                if (dVar.f3777a1 == null) {
                    dVar.f3777a1 = new xi.i(1);
                }
                xi.i iVar2 = dVar.f3777a1;
                if (iVar2 != null) {
                    return new p(iVar2, (byte) 0);
                }
                l.l("_deviceShutdownTriggerDataSource");
                throw null;
            case 13:
                return new jj.c(k.LOW, dVar.h());
            case 14:
                return new jj.c(k.OK, dVar.h());
            case 15:
                return new jj.c(k0.SCREEN_ON, dVar.z0());
            case 16:
                return new jj.c(k0.SCREEN_OFF, dVar.z0());
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                jj.j.Companion.getClass();
                l.e(o0Var, "triggerType");
                jj.j[] jVarArrValues = jj.j.values();
                int length = jVarArrValues.length;
                while (i11 < length) {
                    jj.j jVar = jVarArrValues[i11];
                    if (jVar.getTriggerType() == o0Var) {
                        if (dVar.f3802e1 == null) {
                            dVar.f3802e1 = new xi.c(dVar.e(), dVar.F(), dVar.I());
                        }
                        xi.c cVar = dVar.f3802e1;
                        if (cVar != null) {
                            return new jj.c(jVar, cVar);
                        }
                        l.l("_audioStateTriggerDataSource");
                        throw null;
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 23:
                w wVar = w.LOCATION_HAS_IMPROVED;
                if (dVar.C1 == null) {
                    dVar.C1 = new xi.l(dVar.Z(), dVar.b0());
                }
                xi.l lVar = dVar.C1;
                if (lVar != null) {
                    return new jj.c(wVar, lVar);
                }
                l.l("_locationHasImprovedDataSource");
                throw null;
            case 24:
                w wVar2 = w.LOCATION_EXPIRED;
                if (dVar.D1 == null) {
                    dVar.D1 = new xi.k(dVar.Z(), dVar.b0());
                }
                xi.k kVar = dVar.D1;
                if (kVar != null) {
                    return new jj.c(wVar2, kVar);
                }
                l.l("_locationExpiredDataSource");
                throw null;
            case 25:
                return a(u.LOCATION_ENABLED_MANDATORY);
            case 26:
                return a(u.LOCATION_ENABLED_OPTIONAL);
            case 27:
                return a(u.LOCATION_DISABLED_MANDATORY);
            case 28:
                return a(u.LOCATION_DISABLED_OPTIONAL);
            case 29:
                return new jj.b(b(), 1);
            case 30:
                return new jj.b(b(), 0);
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                jj.g.Companion.getClass();
                l.e(o0Var, "triggerType");
                jj.g[] gVarArrValues = jj.g.values();
                int length2 = gVarArrValues.length;
                while (i11 < length2) {
                    jj.g gVar = gVarArrValues[i11];
                    if (gVar.getTriggerType() == o0Var) {
                        if (dVar.S0 == null) {
                            dVar.S0 = new jj.d(dVar.J0());
                        }
                        jj.d dVar3 = dVar.S0;
                        if (dVar3 != null) {
                            return new jj.c(dVar3, gVar);
                        }
                        l.l("_appBucketTriggerDataSource");
                        throw null;
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                h0.Companion.getClass();
                l.e(o0Var, "triggerType");
                h0[] h0VarArrValues = h0.values();
                int length3 = h0VarArrValues.length;
                while (i11 < length3) {
                    h0 h0Var = h0VarArrValues[i11];
                    if (h0Var.getTriggerType() == o0Var) {
                        return new jj.c(h0Var, dVar.j0());
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                jj.n.Companion.getClass();
                l.e(o0Var, "triggerType");
                jj.n[] nVarArrValues = jj.n.values();
                int length4 = nVarArrValues.length;
                while (i11 < length4) {
                    jj.n nVar = nVarArrValues[i11];
                    if (nVar.getTriggerType() == o0Var) {
                        if (dVar.f3808f1 == null) {
                            dVar.f3808f1 = new jj.d(dVar.S0().b());
                        }
                        jj.d dVar4 = dVar.f3808f1;
                        if (dVar4 != null) {
                            return new jj.c(nVar, dVar4);
                        }
                        l.l("_cellTriggerDataSource");
                        throw null;
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 54:
            case 55:
                d0.Companion.getClass();
                l.e(o0Var, "triggerType");
                d0[] d0VarArrValues = d0.values();
                int length5 = d0VarArrValues.length;
                while (i11 < length5) {
                    d0 d0Var = d0VarArrValues[i11];
                    if (d0Var.getTriggerType() == o0Var) {
                        if (dVar.a4 == null) {
                            if (dVar.F().b()) {
                                rVar = new q(dVar.k0(), dVar.g0(), dVar.e0());
                            } else {
                                al.b bVarK0 = dVar.k0();
                                bk.f fVarG0 = dVar.g0();
                                Context applicationContext = dVar.d().getApplicationContext();
                                l.d(applicationContext, "getApplicationContext(...)");
                                rVar = new r(bVarK0, fVarG0, applicationContext);
                            }
                            dVar.a4 = rVar;
                        }
                        xi.d dVar5 = dVar.a4;
                        if (dVar5 != null) {
                            return new jj.c(d0Var, dVar5);
                        }
                        l.l("_networkConnectedTriggerDataSource");
                        throw null;
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 56:
                s.Companion.getClass();
                l.e(o0Var, "triggerType");
                s[] sVarArrValues = s.values();
                int length6 = sVarArrValues.length;
                while (i11 < length6) {
                    s sVar = sVarArrValues[i11];
                    if (sVar.getTriggerType() == o0Var) {
                        if (dVar.f3785b4 == null) {
                            dVar.f3785b4 = new jj.q(dVar.o(), dVar.k0(), dVar.g0());
                        }
                        jj.q qVar = dVar.f3785b4;
                        if (qVar != null) {
                            return new p(sVar, qVar);
                        }
                        l.l("_connectionChangedTriggerDataSource");
                        throw null;
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 57:
                t0 t0Var = t0.WIFI_SCAN_AVAILABLE;
                if (dVar.f3892r4 == null) {
                    dVar.f3892r4 = new xi.i(2);
                }
                xi.i iVar3 = dVar.f3892r4;
                if (iVar3 != null) {
                    return new p(t0Var, iVar3);
                }
                l.l("_wifiScanTriggerDataSource");
                throw null;
            case 58:
            case 59:
                a0.Companion.getClass();
                l.e(o0Var, "triggerType");
                a0[] a0VarArrValues = a0.values();
                int length7 = a0VarArrValues.length;
                while (i11 < length7) {
                    a0 a0Var = a0VarArrValues[i11];
                    if (a0Var.getTriggerType() == o0Var) {
                        return new jj.c(a0Var, (y) dVar.f3859m5.getValue());
                    }
                    i11++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 60:
                return new jj.b((jj.a) dVar.f3899s5.getValue());
        }
    }

    public ArrayList e(List list) {
        l.e(list, "rawTriggerValues");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o0.Companion.getClass();
            ik.a aVarD = d(n0.a(str));
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        return arrayList;
    }

    public xi.g f() {
        ch.d dVar = this.f7402a;
        if (dVar.V0 == null) {
            dVar.V0 = new xi.g(dVar.k0(), dVar.g0(), 1);
        }
        xi.g gVar = dVar.V0;
        if (gVar != null) {
            return gVar;
        }
        l.l("_wifiConnectedStateTriggerDataSource");
        throw null;
    }

    public jj.d g() {
        ch.d dVar = this.f7402a;
        if (dVar.U0 == null) {
            dVar.U0 = new jj.d(dVar.k0(), dVar.g0());
        }
        jj.d dVar2 = dVar.U0;
        if (dVar2 != null) {
            return dVar2;
        }
        l.l("_wifiOnOffTriggerDataSource");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ak.v0 h(org.json.JSONObject r33, ak.c0 r34, hk.b r35) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.h.h(org.json.JSONObject, ak.c0, hk.b):ak.v0");
    }

    public JSONObject i(v0 v0Var) throws JSONException {
        JSONObject jSONObjectX;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", v0Var.f735a);
        jSONObject2.put("data_endpoint", v0Var.f736b);
        ch.d dVar = this.f7402a;
        if (dVar.f3796d2 == null) {
            dVar.f3796d2 = new yi.g(dVar.r(), 20);
        }
        if (dVar.f3796d2 == null) {
            l.l("_scheduleConfigJsonMapper");
            throw null;
        }
        ak.o0 o0Var = v0Var.f737c;
        l.e(o0Var, "input");
        try {
            jSONObjectX = new JSONObject();
            jSONObjectX.put("initial_delay_in_ms", o0Var.f624a);
            jSONObjectX.put("repeat_period_in_ms", o0Var.f625b);
            jSONObjectX.put("spacing_delay_in_ms", o0Var.f630g);
            jSONObjectX.put("repeat_count", o0Var.f626c);
            jSONObjectX.put("manual_execution", o0Var.f627d);
            jSONObjectX.put("consent_required", o0Var.f628e);
            jSONObjectX.put("schedule_type", o0Var.f629f);
        } catch (JSONException e4) {
            jSONObjectX = h0.b.x("ScheduleConfigMapper", e4, e4);
        }
        jSONObject2.put("schedule", jSONObjectX);
        jSONObject2.put("jobs", xu.d.h0(v0Var.f738d));
        jSONObject2.put("execution_triggers", xu.d.h0(v0Var.f739e));
        jSONObject2.put("interruption_triggers", xu.d.h0(v0Var.f740f));
        jSONObject2.put("is_network_intensive", v0Var.f741g);
        jSONObject2.put("use_cross_task_delay", v0Var.f742h);
        jSONObject2.put("reschedule_on_fail_from_this_task_onwards", v0Var.f743i);
        jSONObject2.put("reschedule_on_interrupt_from_this_task_onwards", v0Var.j);
        JSONObject jSONObjectA = zj.b.a(dVar.d0(), v0Var.k);
        if (jSONObjectA.length() > 0) {
            jSONObject2.put("config_overrides", jSONObjectA);
        }
        if (dVar.V3 == null) {
            dVar.V3 = new yh.c(19);
        }
        if (dVar.V3 == null) {
            l.l("_dataUsageLimitsMapper");
            throw null;
        }
        hk.b bVar = v0Var.f744l;
        l.e(bVar, "input");
        try {
            jSONObject = new JSONObject();
            jSONObject.put("kilobytes", bVar.f10798a);
            jSONObject.put("days", bVar.f10799b);
            jSONObject.put("app_status_mode", bVar.f10800c.getValue());
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            jSONObject2.put("data_usage_limits", jSONObject);
        }
        jSONObject2.put("excluded_from_sdk_data_usage_limits", v0Var.f745m);
        jSONObject2.put("cross_task_delay_groups", xu.d.h0(v0Var.f746n));
        jSONObject2.put("priority", v0Var.f747o);
        xu.d.Y(jSONObject2, "wifi_ssid_regex", v0Var.f748p);
        xu.d.Y(jSONObject2, "save_partial_jobs_results", Boolean.valueOf(v0Var.f749q));
        jSONObject2.put("should_log_events", v0Var.f750r);
        return jSONObject2;
    }

    @Override // cj.n
    public void run() throws Throwable {
        xi.u uVarZ = this.f7402a.Z();
        ch.n.b("SdkLocationRepository", "Clearing last location...");
        try {
            uVarZ.f25369x.d("key_last_location");
        } catch (Exception e4) {
            ch.n.e("SdkLocationRepository", e4);
        }
        hk.k kVarQ0 = this.f7402a.Q0();
        ch.n.b("TaskScheduler", "Stop all monitoring");
        kVarQ0.q(true);
        Iterator it = ((r2) kVarQ0.f10833d).d0().iterator();
        while (it.hasNext()) {
            hk.h hVar = (hk.h) it.next();
            ((of.b) kVarQ0.f10832c).v(hVar);
            ((of.b) kVarQ0.f10832c).y(hVar);
        }
        om.f fVar = (om.f) kVarQ0.f10834e;
        synchronized (((ArrayList) fVar.f19555g)) {
            ((ArrayList) fVar.f19555g).clear();
        }
        h9.p pVar = (h9.p) kVarQ0.f10835f;
        synchronized (pVar.f10444b) {
            pVar.f10444b.clear();
        }
        g gVar = (g) kVarQ0.f10837h;
        synchronized (gVar.c()) {
            gVar.e(gVar.c().b(), true);
        }
        cj.a aVarV0 = this.f7402a.v0();
        ch.n.b("ReceiverRegistry", "Unregistering common receivers");
        synchronized (((oh.p) aVarV0.f3977x)) {
            Iterator it2 = ((List) aVarV0.f3978y).iterator();
            while (it2.hasNext()) {
                aVarV0.J(((ck.a) it2.next()).f3994a);
            }
        }
        xi.j jVarO = this.f7402a.o();
        bk.c cVar = jVarO.f25340g;
        cVar.n(jVarO);
        cVar.r(jVarO);
        fj.n nVar = jVarO.Q;
        if (nVar != null) {
            synchronized (nVar.J) {
                nVar.J.remove(jVarO);
            }
        }
        fj.n nVar2 = jVarO.Q;
        if (nVar2 != null) {
            nVar2.e(jVarO);
        }
        jVarO.R = false;
        this.f7402a.U().d("registration_key");
        for (fj.n nVar3 : ((LinkedHashMap) this.f7402a.U0().f8952m).values()) {
            nVar3.G.G(new fj.m(true, nVar3));
        }
    }

    public h(ch.d dVar, int i10) {
        switch (i10) {
            case 1:
                l.e(dVar, "serviceLocator");
                this.f7402a = dVar;
                break;
            default:
                l.e(dVar, "serviceLocator");
                this.f7402a = dVar;
                break;
        }
    }
}
