package cj;

import ak.v0;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.data.traceroute.Traceroute;
import h9.r2;
import i.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import jj.m0;
import jj.o0;
import mi.b0;
import mi.c0;
import mi.d0;
import mi.f0;
import mi.v;
import mi.x;
import mi.y;
import mi.z;
import mq.w;
import p.l2;

/* loaded from: classes.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f3990a;

    public /* synthetic */ q(ch.d dVar, boolean z10) {
        this.f3990a = dVar;
    }

    public static String c(String str) {
        String strP = c7.a.p("manual-sdk-job-", str);
        Locale locale = Locale.US;
        br.l.d(locale, "US");
        String lowerCase = strP.toLowerCase(locale);
        br.l.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public hk.h a(hk.h hVar) {
        ch.d dVar = this.f3990a;
        dVar.A();
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list = hVar.f10810g;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vj.b bVarG = dVar.P().g(((vj.b) it.next()).f(), hVar.f10805b);
            if (bVarG != null) {
                arrayList.add(bVarG);
            }
        }
        hk.h hVarB = hk.h.b(hVar, jCurrentTimeMillis, null, null, arrayList, null, false, null, -66);
        if (hVar.f10809f.f9615a != gk.f.EVENT_BASED) {
            return hVarB;
        }
        ch.n.b("TaskFactory", "Update reschedule for trigger for task " + hVar.c());
        return hk.h.b(hVarB, 0L, null, gk.c.a(hVar.f10809f, 0L, 0L, 0L, 0L, 0, false, 7167), null, null, false, null, -33);
    }

    public c0 b(mi.o oVar, List list, String str) throws Throwable {
        ch.d dVar = this.f3990a;
        bm.d dVarF0 = dVar.F0();
        a aVarR = dVar.r();
        df.c cVarA = dVar.A();
        io.sentry.hints.i iVarQ = dVar.Q();
        if (dVar.Q2 == null) {
            if (dVar.f3896s2 == null) {
                dVar.f3896s2 = new a2.g(dVar.F0());
            }
            a2.g gVar = dVar.f3896s2;
            if (gVar == null) {
                br.l.l("_endpoints");
                throw null;
            }
            ek.c cVarS = dVar.S();
            if (dVar.I == null) {
                dVar.I = new h9.p(dVar.A());
            }
            h9.p pVar = dVar.I;
            if (pVar == null) {
                br.l.l("_sentResultsRepository");
                throw null;
            }
            if (dVar.f3814g0 == null) {
                dVar.f3814g0 = new xj.j(3);
            }
            xj.j jVar = dVar.f3814g0;
            if (jVar == null) {
                br.l.l("_uploadJobDataMapper");
                throw null;
            }
            xj.h hVarG0 = dVar.G0();
            if (dVar.f3862n1 == null) {
                dVar.f3862n1 = new b9.c(8, dVar.r());
            }
            b9.c cVar = dVar.f3862n1;
            if (cVar == null) {
                br.l.l("_hmacHeader");
                throw null;
            }
            dVar.Q2 = new fk.a(gVar, cVarS, pVar, jVar, hVarG0, cVar, new io.sentry.k(28), dVar.h0());
        }
        fk.a aVar = dVar.Q2;
        if (aVar != null) {
            return new c0(dVarF0, dVar.s0(), aVar, aVarR, cVarA, dVar.t0(), dVar.S(), dVar.k0(), list, oVar, iVarQ, str);
        }
        br.l.l("_jobResultsUploader");
        throw null;
    }

    public bm.e d() {
        ch.d dVar = this.f3990a;
        if (dVar.f3837j3 == null) {
            dVar.f3837j3 = new bm.e(dVar.k0(), 16, dVar.S0());
        }
        bm.e eVar = dVar.f3837j3;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_connectionSwitcherFactory");
        throw null;
    }

    public fj.n e() {
        Object obj;
        ch.d dVar = this.f3990a;
        if (((ak.g) dVar.n().f20680g).f529f.f449a.f488s == 1) {
            return dVar.U0().e(dVar.V0().x());
        }
        Iterator it = ((LinkedHashMap) dVar.U0().f8952m).values().iterator();
        while (true) {
            obj = null;
            numValueOf = null;
            Integer numValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                TelephonyManager telephonyManager = ((fj.n) next).f8938g;
                if (telephonyManager != null) {
                    numValueOf = Integer.valueOf(telephonyManager.getDataState());
                }
            } catch (SecurityException unused) {
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                obj = next;
                break;
            }
        }
        return (fj.n) obj;
    }

    public bm.e f() {
        ch.d dVar = this.f3990a;
        if (dVar.U2 == null) {
            dVar.U2 = new bm.e(dVar.L(), 11, dVar.F());
        }
        bm.e eVar = dVar.U2;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_fiveGFieldDataCollectorFactory");
        throw null;
    }

    public vj.b g(String str, String str2) {
        br.l.e(str, "jobName");
        br.l.e(str2, "taskName");
        mi.o.Companion.getClass();
        mi.o oVarA = mi.n.a(str);
        if (oVarA == null) {
            return null;
        }
        return h(oVarA, str2);
    }

    public vj.b h(mi.o oVar, String str) throws Throwable {
        int i10;
        ch.f fVar;
        ch.i iVar;
        bm.e eVar;
        ch.f fVar2;
        ch.i iVar2;
        xi.u uVar;
        bm.d dVar;
        ch.f fVar3;
        ch.i iVar3;
        zi.a aVar;
        yi.d dVar2;
        int i11;
        b9.e eVar2;
        String str2;
        ki.a aVar2;
        ch.f fVar4;
        ch.l lVar;
        gj.b bVar;
        Context context;
        bm.d dVar3;
        Throwable th2;
        br.l.e(str, "taskName");
        int i12 = mi.m.f16812a[oVar.ordinal()];
        ch.d dVar4 = this.f3990a;
        switch (i12) {
            case 1:
                ch.l lVar2 = ch.l.f3962t5;
                if (lVar2.f3890r2 == null) {
                    bm.d dVarF0 = lVar2.F0();
                    al.b bVarF = lVar2.f();
                    if (lVar2.f3896s2 == null) {
                        lVar2.f3896s2 = new a2.g(lVar2.F0());
                    }
                    a2.g gVar = lVar2.f3896s2;
                    if (gVar == null) {
                        br.l.l("_endpoints");
                        throw null;
                    }
                    q3.a aVarN = lVar2.n();
                    ch.f fVarF = lVar2.F();
                    if (lVar2.f3914v1 == null) {
                        lVar2.f3914v1 = new b9.c(10, lVar2.F());
                    }
                    b9.c cVar = lVar2.f3914v1;
                    if (cVar == null) {
                        br.l.l("_deviceHardware");
                        throw null;
                    }
                    q3.a aVarN2 = lVar2.N();
                    ch.i iVarN0 = lVar2.n0();
                    if (lVar2.f3810f3 == null) {
                        lVar2.B();
                        lVar2.J();
                        new l2(8, lVar2.B());
                        lVar2.f3810f3 = new cg.e();
                    }
                    cg.e eVar3 = lVar2.f3810f3;
                    if (eVar3 == null) {
                        br.l.l("_dependencyVersion");
                        throw null;
                    }
                    lVar2.f3890r2 = new mj.d(dVarF0, bVarF, gVar, aVarN, fVarF, cVar, aVarN2, iVarN0, eVar3, lVar2.B(), lVar2.s0(), lVar2.S0(), lVar2.W(), lVar2.r(), new io.sentry.k(28), lVar2.U(), lVar2.Z(), new l2(22), lVar2.h0());
                }
                mj.d dVar5 = lVar2.f3890r2;
                if (dVar5 != null) {
                    return new mi.a(dVar5, dVar4.A(), dVar4.Q(), str);
                }
                br.l.l("_configUpdater");
                throw null;
            case 2:
                ch.f fVarF2 = dVar4.F();
                ch.i iVarN02 = dVar4.n0();
                xi.u uVarZ = dVar4.Z();
                al.b bVarK0 = dVar4.k0();
                bk.k kVarV0 = dVar4.V0();
                a aVarT0 = dVar4.T0();
                fj.o oVarU0 = dVar4.U0();
                dj.g gVarS0 = dVar4.S0();
                ag.b bVarO0 = dVar4.o0();
                if (dVar4.f3908u1 == null) {
                    ContentResolver contentResolver = dVar4.d().getContentResolver();
                    br.l.d(contentResolver, "getContentResolver(...)");
                    dVar4.f3908u1 = new io.sentry.internal.debugmeta.c(contentResolver, 10, dVar4.F());
                }
                io.sentry.internal.debugmeta.c cVar2 = dVar4.f3908u1;
                if (cVar2 == null) {
                    br.l.l("_deviceSettings");
                    throw null;
                }
                ii.c.Companion.getClass();
                int iA = ii.b.a();
                r2 r2VarJ0 = dVar4.J0();
                bm.e eVarF = f();
                r2 r2VarB1 = dVar4.b1();
                if (dVar4.W2 == null) {
                    i10 = iA;
                    fVar = fVarF2;
                    iVar = iVarN02;
                    dVar4.W2 = new bm.e(dVar4.a1(), 12, dVar4.o0());
                } else {
                    i10 = iA;
                    fVar = fVarF2;
                    iVar = iVarN02;
                }
                bm.e eVar4 = dVar4.W2;
                if (eVar4 == null) {
                    br.l.l("_dhcpStatus");
                    throw null;
                }
                ch.f fVar5 = fVar;
                df.c cVarA = dVar4.A();
                ch.i iVar4 = iVar;
                bm.d dVarJ = j();
                if (dVar4.f3779a3 == null) {
                    eVar = eVar4;
                    Context contextD = dVar4.d();
                    fVar2 = fVar5;
                    if (dVar4.f3885q4 == null) {
                        iVar2 = iVar4;
                        Object systemService = dVar4.d().getSystemService("batterymanager");
                        br.l.c(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                        dVar4.f3885q4 = (BatteryManager) systemService;
                    } else {
                        iVar2 = iVar4;
                    }
                    BatteryManager batteryManager = dVar4.f3885q4;
                    if (batteryManager == null) {
                        br.l.l("_batteryManager");
                        throw null;
                    }
                    ch.f fVarF3 = dVar4.F();
                    uVar = uVarZ;
                    bm.d dVar6 = new bm.d(13);
                    dVar6.f2826d = contextD;
                    dVar6.f2827g = batteryManager;
                    dVar6.f2828r = fVarF3;
                    dVar4.f3779a3 = dVar6;
                } else {
                    eVar = eVar4;
                    fVar2 = fVar5;
                    iVar2 = iVar4;
                    uVar = uVarZ;
                }
                bm.d dVar7 = dVar4.f3779a3;
                if (dVar7 == null) {
                    br.l.l("_batteryStatus");
                    throw null;
                }
                ch.f fVar6 = fVar2;
                qm.c cVarA0 = dVar4.a0();
                ch.i iVar5 = iVar2;
                io.sentry.internal.debugmeta.c cVarA02 = dVar4.A0();
                if (dVar4.f3791c3 == null && dVar4.F().d()) {
                    if (dVar4.N0 == null && dVar4.F().d()) {
                        dVar = dVar7;
                        dVar4.N0 = a1.h.m(dVar4.d().getApplicationContext().getSystemService("euicc"));
                    } else {
                        dVar = dVar7;
                    }
                    EuiccManager euiccManager = dVar4.N0;
                    ch.f fVarF4 = dVar4.F();
                    fVar3 = fVar6;
                    PackageManager packageManager = dVar4.d().getPackageManager();
                    iVar3 = iVar5;
                    br.l.d(packageManager, "getPackageManager(...)");
                    dVar4.f3791c3 = new zi.a(euiccManager, fVarF4, packageManager);
                } else {
                    dVar = dVar7;
                    fVar3 = fVar6;
                    iVar3 = iVar5;
                }
                zi.a aVar3 = dVar4.f3791c3;
                int i13 = i10;
                bm.e eVar5 = eVar;
                bm.d dVar8 = dVar;
                js.e eVarE = dVar4.E();
                if (dVar4.f3884q3 == null) {
                    aVar = aVar3;
                    dVar4.f3884q3 = new yi.d(dVar4.u(), new df.c(7));
                } else {
                    aVar = aVar3;
                }
                yi.d dVar9 = dVar4.f3884q3;
                if (dVar9 == null) {
                    br.l.l("_dataUsageCollector");
                    throw null;
                }
                ch.l lVar3 = ch.l.f3962t5;
                if (lVar3.f3875p1 == null) {
                    ch.f fVarF5 = lVar3.F();
                    dVar2 = dVar9;
                    i11 = i13;
                    r2 r2Var = new r2(new yj.a(fVarF5, 2), new yj.a(fVarF5, 1), new yj.a(fVarF5, 5), new yj.a(fVarF5, 4), new yj.a(fVarF5, 0), new yj.a(fVarF5, 3));
                    b9.e eVar6 = new b9.e(22, false);
                    eVar6.f2481d = r2Var;
                    lVar3.f3875p1 = eVar6;
                } else {
                    dVar2 = dVar9;
                    i11 = i13;
                }
                b9.e eVar7 = lVar3.f3875p1;
                if (eVar7 == null) {
                    br.l.l("_networkRegistrationInfoJson");
                    throw null;
                }
                xi.u uVar2 = uVar;
                zi.a aVar4 = aVar;
                AudioManager audioManagerE = lVar3.e();
                xi.j jVarO = dVar4.o();
                if (dVar4.f3798d4 == null) {
                    eVar2 = eVar7;
                    ch.f fVarF6 = dVar4.F();
                    str2 = "_memoryRounding";
                    if (dVar4.f3818g4 == null) {
                        dVar4.f3818g4 = new df.c();
                    }
                    df.c cVar3 = dVar4.f3818g4;
                    if (cVar3 == null) {
                        br.l.l(str2);
                        throw null;
                    }
                    dVar4.f3798d4 = new ki.a(fVarF6, cVar3);
                } else {
                    eVar2 = eVar7;
                    str2 = "_memoryRounding";
                }
                ki.a aVar5 = dVar4.f3798d4;
                if (aVar5 == null) {
                    br.l.l("_storageInfo");
                    throw null;
                }
                if (dVar4.c4 == null) {
                    ActivityManager activityManagerB = dVar4.b();
                    aVar2 = aVar5;
                    if (dVar4.f3818g4 == null) {
                        dVar4.f3818g4 = new df.c();
                    }
                    df.c cVar4 = dVar4.f3818g4;
                    if (cVar4 == null) {
                        br.l.l(str2);
                        throw null;
                    }
                    dVar4.c4 = new g0(activityManagerB, cVar4);
                } else {
                    aVar2 = aVar5;
                }
                g0 g0Var = dVar4.c4;
                if (g0Var == null) {
                    br.l.l("_ramInfo");
                    throw null;
                }
                ch.f fVar7 = fVar3;
                b9.e eVar8 = eVar2;
                ki.a aVar6 = aVar2;
                Context contextD2 = dVar4.d();
                if (lVar3.f3923w4 == null) {
                    fVar4 = fVar7;
                    Object systemService2 = lVar3.d().getSystemService("sensor");
                    br.l.c(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
                    lVar3.f3923w4 = (SensorManager) systemService2;
                } else {
                    fVar4 = fVar7;
                }
                SensorManager sensorManager = lVar3.f3923w4;
                if (sensorManager == null) {
                    br.l.l("_sensorManager");
                    throw null;
                }
                ek.d dVar10 = new ek.d(sensorManager, dVar4.A());
                if (dVar4.I4 == null) {
                    lVar = lVar3;
                    dVar4.I4 = new o2.g(28, dVar4.U());
                } else {
                    lVar = lVar3;
                }
                o2.g gVar2 = dVar4.I4;
                if (gVar2 == null) {
                    br.l.l("_deviceWifiRepository");
                    throw null;
                }
                return new mi.b(fVar4, iVar3, uVar2, bVarK0, kVarV0, aVarT0, oVarU0, gVarS0, bVarO0, cVar2, i11, r2VarJ0, eVarF, r2VarB1, eVar5, cVarA, dVarJ, dVar8, cVarA0, cVarA02, aVar4, eVarE, dVar2, eVar8, audioManagerE, jVarO, aVar6, g0Var, contextD2, dVar10, gVar2, lVar.u(), dVar4.Q(), str);
            case 3:
                return new ni.o(dVar4.k0(), dVar4.T0(), dVar4.U0(), f(), dVar4.A(), j(), dVar4.Q(), str);
            case 4:
                Context contextD3 = dVar4.d();
                gj.b bVarN = n();
                et.d dVarL = l();
                gi.a aVarI = i();
                r2 r2VarI0 = dVar4.I0();
                dj.g gVarS02 = dVar4.S0();
                al.b bVarK02 = dVar4.k0();
                bm.e eVarD = d();
                zh.e eVarK = k();
                df.c cVarA2 = dVar4.A();
                dVar4.G();
                return new mi.d(bVarK02, contextD3, eVarD, cVarA2, gVarS02, dVarL, new fh.f(0), aVarI, bVarN, r2VarI0, dVar4.Q(), str, dVar4.o(), dVar4.q(), eVarK);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                Context contextD4 = dVar4.d();
                gj.b bVarN2 = n();
                et.d dVarL2 = l();
                gi.a aVarI2 = i();
                r2 r2VarI02 = dVar4.I0();
                dj.g gVarS03 = dVar4.S0();
                al.b bVarK03 = dVar4.k0();
                df.c cVarA3 = dVar4.A();
                bm.e eVarD2 = d();
                zh.e eVarK2 = k();
                a aVarR = dVar4.r();
                xi.j jVarO2 = dVar4.o();
                zh.a aVarQ = dVar4.q();
                dVar4.G();
                return new mi.p(contextD4, bVarN2, dVarL2, aVarI2, r2VarI02, gVarS03, bVarK03, cVarA3, eVarD2, eVarK2, aVarR, new fh.f(0), aVarQ, jVarO2, dVar4.Q(), str);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Context contextD5 = dVar4.d();
                gj.b bVarN3 = n();
                al.b bVarK04 = dVar4.k0();
                dj.g gVarS04 = dVar4.S0();
                et.d dVarL3 = l();
                gi.a aVarI3 = i();
                r2 r2VarI03 = dVar4.I0();
                df.c cVarA4 = dVar4.A();
                bm.e eVarD3 = d();
                zh.e eVarK3 = k();
                dVar4.G();
                return new mi.p(bVarK04, contextD5, eVarD3, cVarA4, gVarS04, dVarL3, new fh.f(0), aVarI3, bVarN3, r2VarI03, dVar4.Q(), str, dVar4.o(), dVar4.q(), eVarK3);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(mi.o.SEND_RESULTS, w.f16945a, str);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return b(mi.o.SEND_DAILY_RESULTS, e5.H("daily"), str);
            case 9:
                return b(mi.o.SEND_RESULTS, e5.H(str), str);
            case 10:
                return new mi.q(oVar.name(), false, dVar4.Z(), dVar4.A(), dVar4.Q(), str);
            case 11:
                return new mi.a(dVar4.A(), dVar4.Z(), dVar4.E(), dVar4.Q(), str);
            case 12:
                return new mi.h(dVar4.A(), dVar4.Z(), dVar4.E(), dVar4.O(), dVar4.Q(), str);
            case 13:
                if (dVar4.B4 == null) {
                    r2 r2VarI04 = dVar4.I0();
                    if (dVar4.C4 == null) {
                        dVar4.C4 = new b9.e((oi.c) dVar4.G0(), 1, dVar4.r());
                    }
                    b9.e eVar9 = dVar4.C4;
                    if (eVar9 == null) {
                        br.l.l("_recipeEvaluator");
                        throw null;
                    }
                    dVar4.B4 = new bm.d(r2VarI04, eVar9, dVar4.n());
                }
                bm.d dVar11 = dVar4.B4;
                if (dVar11 == null) {
                    br.l.l("_assistant");
                    throw null;
                }
                io.sentry.hints.i iVarQ = dVar4.Q();
                df.c cVarA5 = dVar4.A();
                Context contextD6 = dVar4.d();
                if (dVar4.D4 == null) {
                    dVar4.D4 = new ai.g(0);
                }
                ai.g gVar3 = dVar4.D4;
                if (gVar3 != null) {
                    return new ai.d(dVar11, cVarA5, contextD6, gVar3, iVarQ, str);
                }
                br.l.l("_assistantJobToBroadcastMapper");
                throw null;
            case 14:
            case 15:
                return new mi.q(oVar.name(), true, dVar4.Z(), dVar4.A(), dVar4.Q(), str);
            case 16:
                Context contextD7 = dVar4.d();
                gj.b bVarN4 = n();
                df.c cVarA6 = dVar4.A();
                io.sentry.hints.i iVarQ2 = dVar4.Q();
                zh.e eVarK4 = k();
                r2 r2VarI05 = dVar4.I0();
                x xVar = (x) dVar4.f3866n5.getValue();
                jk.c cVar5 = (jk.c) dVar4.f3879p5.getValue();
                a aVarR2 = dVar4.r();
                dVar4.G();
                return new y(contextD7, bVarN4, cVarA6, aVarR2, r2VarI05, xVar, cVar5, eVarK4, new fh.f(0), dVar4.q(), dVar4.o(), iVarQ2, str);
            case 17:
                Context contextD8 = dVar4.d();
                gj.b bVarN5 = n();
                df.c cVarA7 = dVar4.A();
                io.sentry.hints.i iVarQ3 = dVar4.Q();
                zh.e eVarK5 = k();
                r2 r2VarI06 = dVar4.I0();
                jk.c cVar6 = (jk.c) dVar4.f3872o5.getValue();
                sm.f fVar8 = new sm.f(11);
                x xVar2 = (x) dVar4.f3866n5.getValue();
                a aVarR3 = dVar4.r();
                dVar4.G();
                return new z(contextD8, bVarN5, cVarA7, aVarR3, r2VarI06, cVar6, fVar8, xVar2, eVarK5, new fh.f(0), dVar4.q(), dVar4.o(), iVarQ3, str);
            case 18:
                Context contextD9 = dVar4.d();
                gj.b bVarN6 = n();
                df.c cVarA8 = dVar4.A();
                io.sentry.hints.i iVarQ4 = dVar4.Q();
                dVar4.G();
                return new mi.j(contextD9, bVarN6, cVarA8, iVarQ4, new fh.f(0), dVar4.q(), k(), dVar4.o(), str, 1);
            case 19:
                gj.b bVarN7 = n();
                if (dVar4.N2 == null) {
                    dVar4.N2 = new et.d();
                }
                et.d dVar12 = dVar4.N2;
                if (dVar12 == null) {
                    br.l.l("_videoMeasurementResultMapper");
                    throw null;
                }
                df.c cVarA9 = dVar4.A();
                r2 r2VarI07 = dVar4.I0();
                io.sentry.hints.i iVarQ5 = dVar4.Q();
                ch.f fVarF7 = dVar4.F();
                ch.l lVar4 = ch.l.f3962t5;
                a aVarI0 = lVar4.i0();
                r2 r2Var2 = new r2(e(), (com.opensignal.sdk.common.measurements.base.e) aVarI0.f3974d, (q3.a) aVarI0.f3978y, (ch.f) aVarI0.f3975g, (com.opensignal.sdk.common.measurements.base.f) aVarI0.f3976r, (com.opensignal.sdk.common.measurements.base.c) aVarI0.f3977x);
                oh.p pVarJ = dVar4.J();
                l2 l2Var = new l2(8, dVar4.B());
                if (dVar4.R3 == null) {
                    dVar4.R3 = new sm.m();
                }
                sm.m mVar = dVar4.R3;
                if (mVar == null) {
                    br.l.l("_remoteUrlResponseMapper");
                    throw null;
                }
                if (dVar4.S3 == null) {
                    q3.a aVar7 = new q3.a((io.sentry.internal.debugmeta.c) dVar4.h0().f19554d);
                    if (dVar4.T3 == null) {
                        bVar = bVarN7;
                        dVar4.T3 = new oh.p(16, dVar4.W0());
                    } else {
                        bVar = bVarN7;
                    }
                    oh.p pVar = dVar4.T3;
                    if (pVar == null) {
                        br.l.l("_connectionDetailsFetcher");
                        throw null;
                    }
                    dVar4.S3 = new om.f(aVar7, pVar);
                } else {
                    bVar = bVarN7;
                }
                om.f fVar9 = dVar4.S3;
                if (fVar9 == null) {
                    br.l.l("_liveVideoCheckerFactory");
                    throw null;
                }
                ak.b bVarW = dVar4.F0().w();
                b9.c cVarB = lVar4.B();
                q3.a aVarF0 = dVar4.f0();
                zh.e eVarK6 = k();
                dVar4.G();
                return new d0(bVar, dVar12, cVarA9, r2VarI07, fVarF7, r2Var2, pVarJ, l2Var, mVar, fVar9, bVarW, aVarF0, cVarB, iVarQ5, eVarK6, new fh.f(0), dVar4.q(), dVar4.o(), str);
            case 20:
                ch.i iVarN03 = dVar4.n0();
                ch.f fVarF8 = dVar4.F();
                df.c cVarA10 = dVar4.A();
                io.sentry.hints.i iVarQ6 = dVar4.Q();
                ii.c.Companion.getClass();
                return new mi.c(iVarN03, fVarF8, ii.b.a(), cVarA10, dVar4.S0(), dVar4.o0(), ch.l.f3962t5.B(), dVar4.J0(), dVar4.J(), dVar4.t(), dVar4.o(), new l2(8, dVar4.B()), dVar4.E(), iVarQ6, str);
            case 21:
                return new mi.s(dVar4.E(), dVar4.A(), dVar4.k0(), j(), dVar4.Q(), str);
            case 22:
                df.c cVarA11 = dVar4.A();
                Traceroute traceroute = new Traceroute();
                dVar4.G();
                return new v(cVarA11, traceroute, new fh.f(0), dVar4.q(), k(), dVar4.I0(), dVar4.r(), dVar4.o(), dVar4.Q(), str);
            case 23:
                return new mi.r(ch.l.f3962t5.S(), dVar4.A(), dVar4.Q(), str);
            case 24:
                return new mi.r(ch.l.f3962t5.u(), dVar4.A(), dVar4.Q(), str);
            case 25:
                return new mi.h(dVar4.Q(), dVar4.I0(), dVar4.A(), str);
            case 26:
                Context contextD10 = dVar4.d();
                gj.b bVarN8 = n();
                df.c cVarA12 = dVar4.A();
                io.sentry.hints.i iVarQ7 = dVar4.Q();
                dVar4.G();
                return new mi.j(contextD10, bVarN8, cVarA12, iVarQ7, new fh.f(0), dVar4.q(), k(), dVar4.o(), str, 2);
            case 27:
                Context contextD11 = dVar4.d();
                gj.b bVarN9 = n();
                df.c cVarA13 = dVar4.A();
                io.sentry.hints.i iVarQ8 = dVar4.Q();
                dVar4.G();
                return new mi.t(contextD11, bVarN9, cVarA13, (jk.c) dVar4.f3879p5.getValue(), iVarQ8, new fh.f(0), dVar4.q(), k(), dVar4.Z(), dVar4.o(), str);
            case 28:
                df.c cVarA14 = dVar4.A();
                xi.j jVarO3 = dVar4.o();
                io.sentry.hints.i iVarQ9 = dVar4.Q();
                ch.i iVarN04 = dVar4.n0();
                ch.f fVarF9 = dVar4.F();
                ii.c.Companion.getClass();
                return new mi.g(cVarA14, jVarO3, iVarQ9, iVarN04, fVarF9, ii.b.a(), str);
            case 29:
                Context contextD12 = dVar4.d();
                gj.b bVarN10 = n();
                df.c cVarA15 = dVar4.A();
                io.sentry.hints.i iVarQ10 = dVar4.Q();
                dVar4.G();
                return new mi.j(contextD12, bVarN10, cVarA15, iVarQ10, new fh.f(0), dVar4.q(), k(), dVar4.o(), str, 0);
            case 30:
                Context contextD13 = dVar4.d();
                gj.b bVarN11 = n();
                df.c cVarA16 = dVar4.A();
                io.sentry.hints.i iVarQ11 = dVar4.Q();
                dVar4.G();
                return new mi.k(contextD13, bVarN11, cVarA16, dVar4.I0(), (zh.c) dVar4.f3852l5.getValue(), iVarQ11, new fh.f(0), dVar4.q(), k(), dVar4.o(), str);
            case 31:
                Context contextD14 = dVar4.d();
                gj.b bVarN12 = n();
                df.c cVarA17 = dVar4.A();
                io.sentry.hints.i iVarQ12 = dVar4.Q();
                dVar4.G();
                return new mi.l(contextD14, bVarN12, cVarA17, dVar4.I0(), iVarQ12, new fh.f(0), dVar4.q(), k(), dVar4.o(), str);
            case 32:
                df.c cVarA18 = dVar4.A();
                io.sentry.hints.i iVarQ13 = dVar4.Q();
                xi.u uVarZ2 = dVar4.Z();
                ag.b bVarO02 = dVar4.o0();
                ch.f fVarF10 = dVar4.F();
                ch.i iVarN05 = dVar4.n0();
                ii.c.Companion.getClass();
                int iA2 = ii.b.a();
                xi.j jVarO4 = dVar4.o();
                if (dVar4.f3929x4 == null) {
                    dVar4.f3929x4 = new xi.v(dVar4.a1());
                }
                xi.v vVar = dVar4.f3929x4;
                if (vVar == null) {
                    br.l.l("_wifiScanInfoRepository");
                    throw null;
                }
                if (dVar4.L4 == null) {
                    dVar4.L4 = new df.c();
                }
                df.c cVar7 = dVar4.L4;
                if (cVar7 == null) {
                    br.l.l("_wifiInformationElementsExtractor");
                    throw null;
                }
                if (dVar4.M4 == null) {
                    dVar4.M4 = new ee.f(15);
                }
                ee.f fVar10 = dVar4.M4;
                if (fVar10 != null) {
                    return new mi.g0(cVarA18, uVarZ2, bVarO02, fVarF10, iVarN05, iA2, iVarQ13, jVarO4, vVar, cVar7, fVar10, str);
                }
                br.l.l("_wifiInformationElementsFormatter");
                throw null;
            case 33:
                ch.f fVarF11 = dVar4.F();
                df.c cVarA19 = dVar4.A();
                WifiManager wifiManagerA1 = dVar4.a1();
                if (dVar4.L4 == null) {
                    dVar4.L4 = new df.c();
                }
                df.c cVar8 = dVar4.L4;
                if (cVar8 == null) {
                    br.l.l("_wifiInformationElementsExtractor");
                    throw null;
                }
                if (dVar4.M4 == null) {
                    dVar4.M4 = new ee.f(15);
                }
                ee.f fVar11 = dVar4.M4;
                if (fVar11 != null) {
                    return new f0(fVarF11, cVarA19, wifiManagerA1, cVar8, fVar11, dVar4.Q(), str);
                }
                br.l.l("_wifiInformationElementsFormatter");
                throw null;
            case 34:
                Context contextD15 = dVar4.d();
                bm.d dVarF02 = dVar4.F0();
                a aVarR4 = dVar4.r();
                df.c cVarA20 = dVar4.A();
                io.sentry.hints.i iVarQ14 = dVar4.Q();
                l2 l2VarS0 = dVar4.s0();
                a8.f fVarT0 = dVar4.t0();
                al.b bVarK05 = dVar4.k0();
                ch.l lVar5 = ch.l.f3962t5;
                if (lVar5.R2 == null) {
                    Context contextD16 = lVar5.d();
                    q3.a aVarN3 = lVar5.n();
                    hk.k kVarC = lVar5.C();
                    io.sentry.internal.debugmeta.c cVarW0 = lVar5.W0();
                    th2 = null;
                    if (lVar5.R1 == null) {
                        context = contextD15;
                        dVar3 = dVarF02;
                        lVar5.R1 = new ic.b(lVar5.d(), false);
                    } else {
                        context = contextD15;
                        dVar3 = dVarF02;
                    }
                    ic.b bVar2 = lVar5.R1;
                    if (bVar2 == null) {
                        br.l.l("_mlvisFileCompressor");
                        throw null;
                    }
                    lVar5.r();
                    if (lVar5.S1 == null) {
                        lVar5.S1 = new zc.d(17);
                    }
                    zc.d dVar13 = lVar5.S1;
                    if (dVar13 == null) {
                        br.l.l("_mlvisUtils");
                        throw null;
                    }
                    br.l.e(bVar2, "mlvisFileCompressor");
                    br.l.e(dVar13, "mlvisUtils");
                    r2 r2Var3 = new r2();
                    r2Var3.f10470a = contextD16;
                    r2Var3.f10471d = aVarN3;
                    r2Var3.f10472g = kVarC;
                    r2Var3.f10473r = cVarW0;
                    r2Var3.f10474x = bVar2;
                    r2Var3.f10475y = dVar13;
                    lVar5.R2 = r2Var3;
                } else {
                    context = contextD15;
                    dVar3 = dVarF02;
                    th2 = null;
                }
                r2 r2Var4 = lVar5.R2;
                if (r2Var4 == null) {
                    br.l.l("_urlConnectionZipUploader");
                    throw th2;
                }
                if (lVar5.Q1 == null) {
                    lVar5.Q1 = new qm.c(lVar5.C(), lVar5.n(), lVar5.F(), lVar5.r());
                }
                qm.c cVar9 = lVar5.Q1;
                if (cVar9 == null) {
                    br.l.l("_mlvisFileGenerator");
                    throw th2;
                }
                return new b0(context, dVar3, l2VarS0, aVarR4, cVarA20, fVarT0, bVarK05, r2Var4, cVar9, iVarQ14, mi.o.SEND_MLVIS_LOGS, str);
            case 35:
                return new mi.i(n(), dVar4.A(), dVar4.Q(), str);
            case 36:
                return new mi.a(n(), dVar4.A(), dVar4.k0(), dVar4.Q(), str);
            case 37:
                throw new IllegalArgumentException("Type " + oVar + " cannot be instantiated by the JobFactory");
            default:
                throw new bf.n();
        }
    }

    public gi.a i() {
        ch.d dVar = this.f3990a;
        if (dVar.f3907u0 == null) {
            dVar.f3907u0 = new gi.a(3);
        }
        gi.a aVar = dVar.f3907u0;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_latencyResultItemMapper");
        throw null;
    }

    public bm.d j() {
        ch.d dVar = this.f3990a;
        if (dVar.Z2 == null) {
            dVar.Z2 = new bm.d(dVar.p(), dVar.o0(), dVar.F(), 21);
        }
        bm.d dVar2 = dVar.Z2;
        if (dVar2 != null) {
            return dVar2;
        }
        br.l.l("_networkCapability");
        throw null;
    }

    public zh.e k() {
        ch.d dVar = this.f3990a;
        if (dVar.G2 == null) {
            if (dVar.f3909u2 == null) {
                dVar.f3909u2 = new xr.a(dVar.n(), dVar.L());
            }
            xr.a aVar = dVar.f3909u2;
            if (aVar == null) {
                br.l.l("_internalServiceStateProvider");
                throw null;
            }
            dVar.G2 = new y9.u(10, aVar);
        }
        y9.u uVar = dVar.G2;
        if (uVar != null) {
            return new zh.e(e(), (xr.a) uVar.f25996d);
        }
        br.l.l("_serviceStateDetectorFactory");
        throw null;
    }

    public et.d l() {
        ch.d dVar = this.f3990a;
        if (dVar.C0 == null) {
            dVar.r();
            dVar.C0 = new et.d();
        }
        et.d dVar2 = dVar.C0;
        if (dVar2 != null) {
            return dVar2;
        }
        br.l.l("_speedTestConfigMapper");
        throw null;
    }

    public hk.h m(long j, String str, String str2, gk.c cVar) {
        hk.h hVarA;
        hk.h hVar;
        br.l.e(cVar, "schedule");
        ch.d dVar = this.f3990a;
        dVar.n().H0();
        Iterator it = ((ak.g) dVar.n().f20680g).f530g.f757b.iterator();
        while (true) {
            if (!it.hasNext()) {
                hVarA = null;
                break;
            }
            v0 v0Var = (v0) it.next();
            if (br.l.a(v0Var.f735a, str)) {
                hVarA = dVar.N0().a(v0Var);
                break;
            }
        }
        if (hVarA != null) {
            hVar = hVarA;
        } else {
            if (str2 == null || str2.length() == 0) {
                String str3 = "Trying to get a custom taskType with no job specified. taskType:" + str + " jobName:" + str2;
                ch.n.c("TaskFactory", str3);
                dVar.r();
                a.F(str3);
                return null;
            }
            String strC = c(str2);
            ik.a aVarD = dVar.Y0().d(o0.SCREEN_ON);
            List listE = w.f16945a;
            List listE2 = aVarD != null ? e5.e(aVarD) : listE;
            ik.a aVarD2 = dVar.Y0().d(o0.SCREEN_OFF);
            List listE3 = aVarD2 != null ? e5.e(aVarD2) : listE;
            String strC2 = c(str2);
            mi.o.Companion.getClass();
            mi.o oVarA = mi.n.a(str2);
            vj.b bVarH = oVarA != null ? dVar.P().h(oVarA, strC2) : null;
            if (bVarH != null) {
                listE = e5.e(bVarH);
            }
            ek.c cVarS = dVar.S();
            r2 r2VarI0 = dVar.I0();
            l2 l2VarS0 = dVar.s0();
            xi.u uVarZ = dVar.Z();
            r2 r2VarJ0 = dVar.J0();
            bj.c cVarO0 = dVar.O0();
            ek.c cVarR0 = dVar.R0();
            q3.a aVarN = dVar.n();
            xi.j jVarO = dVar.o();
            a aVarU0 = dVar.u0();
            dVar.G();
            hVar = new hk.h(j, strC, "", listE2, listE3, cVar, listE, cVarS, r2VarI0, l2VarS0, cVarO0, r2VarJ0, cVarR0, aVarN, uVarZ, true, false, false, "", "", 0L, 0L, null, false, null, 0, null, jVarO, aVarU0, new fh.f(0), dVar.A(), false, dVar.Q(), dVar.q(), 1036156928);
        }
        return hk.h.b(hVar, 0L, null, cVar, null, null, false, null, -33);
    }

    public gj.b n() throws Throwable {
        Throwable th2;
        ch.m mVar;
        ch.d dVar = this.f3990a;
        if (dVar.H2 == null) {
            Context contextD = dVar.d();
            ag.b bVarO0 = dVar.o0();
            if (dVar.I2 == null) {
                dVar.I2 = new r2(dVar.d(), dVar.S0().b().f8914c, dVar.o0(), dVar.F(), dVar.l(), dVar.n0());
            }
            r2 r2Var = dVar.I2;
            if (r2Var == null) {
                br.l.l("_uploadProviderFactory");
                throw null;
            }
            if (dVar.L2 == null) {
                q3.a aVarF0 = dVar.f0();
                if (dVar.M2 == null) {
                    dVar.M2 = new qm.c(dVar.W0());
                }
                qm.c cVar = dVar.M2;
                if (cVar == null) {
                    br.l.l("_networkResource");
                    throw null;
                }
                dVar.L2 = new io.sentry.k(aVarF0, cVar, dVar.l(), 20);
            }
            io.sentry.k kVar = dVar.L2;
            if (kVar == null) {
                br.l.l("_videoResourceGetterFactory");
                throw null;
            }
            al.b bVarK0 = dVar.k0();
            TelephonyManager telephonyManager = dVar.S0().b().f8914c;
            ch.f fVarF = dVar.F();
            if (dVar.f3940z4 == null) {
                dVar.f3940z4 = new yh.c(18);
            }
            yh.c cVar2 = dVar.f3940z4;
            if (cVar2 == null) {
                br.l.l("_systemClockCompat");
                throw null;
            }
            io.sentry.internal.debugmeta.c cVarW0 = dVar.W0();
            ch.i iVarN0 = dVar.n0();
            ThreadFactory threadFactoryD0 = dVar.D0();
            if (dVar.G4 == null) {
                th2 = null;
                dVar.G4 = new ch.m("TUT-", dVar.B0(), dVar.n());
            } else {
                th2 = null;
            }
            ch.m mVar2 = dVar.G4;
            if (mVar2 == null) {
                br.l.l("_tutLoggingThreadFactory");
                throw th2;
            }
            if (dVar.Y2 == null) {
                dVar.Y2 = new io.sentry.t(dVar.B0(), dVar.n());
            }
            io.sentry.t tVar = dVar.Y2;
            if (tVar == null) {
                br.l.l("_handlerThreadFactory");
                throw th2;
            }
            if (dVar.X4 == null) {
                mVar = mVar2;
                dVar.X4 = new io.sentry.hints.i(18, dVar.B());
            } else {
                mVar = mVar2;
            }
            io.sentry.hints.i iVar = dVar.X4;
            if (iVar == null) {
                br.l.l("_videoPlaybackLibrarySelector");
                throw th2;
            }
            ph.j jVar = new ph.j(dVar.J());
            sm.f fVar = new sm.f(dVar.J());
            io.sentry.hints.i iVar2 = new io.sentry.hints.i(21, dVar.J());
            dVar.J();
            dVar.H2 = new gj.b(contextD, bVarO0, r2Var, kVar, bVarK0, telephonyManager, fVarF, cVar2, cVarW0, iVarN0, threadFactoryD0, mVar, tVar, iVar, new ee.f(24), jVar, new df.c(), new cg.e(), new sm.m(), new sm.m(), fVar, iVar2);
        } else {
            th2 = null;
        }
        gj.b bVar = dVar.H2;
        if (bVar != null) {
            return bVar;
        }
        br.l.l("_testFactory");
        throw th2;
    }

    @Override // cj.n
    public void run() {
        this.f3990a.Q0().k(m0.RESCHEDULE_TASK_COMMAND_TRIGGER);
    }

    public q(ch.d dVar) {
        br.l.e(dVar, "serviceLocator");
        this.f3990a = dVar;
    }
}
