package mi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.provider.Settings;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccInfo;
import android.telephony.euicc.EuiccManager;
import h9.r2;
import java.io.IOException;
import java.util.List;
import ni.i0;
import ni.k0;
import ni.l0;
import ni.q0;
import ni.r0;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class b extends vj.b {
    public final ch.f F;
    public final ch.i G;
    public final xi.u H;
    public final al.b I;
    public final bk.k J;
    public final cj.a K;
    public final fj.o L;
    public final dj.g M;
    public final ag.b N;
    public final io.sentry.internal.debugmeta.c O;
    public final String P;
    public final int Q;
    public final r2 R;
    public final bm.e S;
    public final r2 T;
    public final bm.e U;
    public final df.c V;
    public final bm.d W;
    public final bm.d X;
    public final qm.c Y;
    public final io.sentry.internal.debugmeta.c Z;

    /* renamed from: a0, reason: collision with root package name */
    public final zi.a f16779a0;

    /* renamed from: b0, reason: collision with root package name */
    public final js.e f16780b0;

    /* renamed from: c0, reason: collision with root package name */
    public final yi.d f16781c0;

    /* renamed from: d0, reason: collision with root package name */
    public final b9.e f16782d0;

    /* renamed from: e0, reason: collision with root package name */
    public final AudioManager f16783e0;

    /* renamed from: f0, reason: collision with root package name */
    public final xi.j f16784f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ki.a f16785g0;

    /* renamed from: h0, reason: collision with root package name */
    public final i.g0 f16786h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Context f16787i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ek.d f16788j0;

    /* renamed from: k0, reason: collision with root package name */
    public final o2.g f16789k0;

    /* renamed from: l0, reason: collision with root package name */
    public final yi.e f16790l0;

    /* renamed from: m0, reason: collision with root package name */
    public ni.f f16791m0;

    /* renamed from: n0, reason: collision with root package name */
    public final String f16792n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ch.f fVar, ch.i iVar, xi.u uVar, al.b bVar, bk.k kVar, cj.a aVar, fj.o oVar, dj.g gVar, ag.b bVar2, io.sentry.internal.debugmeta.c cVar, int i10, r2 r2Var, bm.e eVar, r2 r2Var2, bm.e eVar2, df.c cVar2, bm.d dVar, bm.d dVar2, qm.c cVar3, io.sentry.internal.debugmeta.c cVar4, zi.a aVar2, js.e eVar3, yi.d dVar3, b9.e eVar4, AudioManager audioManager, xi.j jVar, ki.a aVar3, i.g0 g0Var, Context context, ek.d dVar4, o2.g gVar2, yi.e eVar5, io.sentry.hints.i iVar2, String str) {
        super(iVar2, str);
        br.l.e(cVar, "deviceSettings");
        br.l.e(eVar2, "dhcpStatus");
        br.l.e(dVar2, "batteryStatus");
        br.l.e(dVar3, "dataUsageCollector");
        br.l.e(eVar4, "networkRegistrationInfoJson");
        br.l.e(gVar2, "deviceWifiRepository");
        br.l.e(str, "taskName");
        this.F = fVar;
        this.G = iVar;
        this.H = uVar;
        this.I = bVar;
        this.J = kVar;
        this.K = aVar;
        this.L = oVar;
        this.M = gVar;
        this.N = bVar2;
        this.O = cVar;
        this.P = "92.0.0";
        this.Q = i10;
        this.R = r2Var;
        this.S = eVar;
        this.T = r2Var2;
        this.U = eVar2;
        this.V = cVar2;
        this.W = dVar;
        this.X = dVar2;
        this.Y = cVar3;
        this.Z = cVar4;
        this.f16779a0 = aVar2;
        this.f16780b0 = eVar3;
        this.f16781c0 = dVar3;
        this.f16782d0 = eVar4;
        this.f16783e0 = audioManager;
        this.f16784f0 = jVar;
        this.f16785g0 = aVar3;
        this.f16786h0 = g0Var;
        this.f16787i0 = context;
        this.f16788j0 = dVar4;
        this.f16789k0 = gVar2;
        this.f16790l0 = eVar5;
        this.f16792n0 = "CORE";
    }

    public static k0 B(SignalStrength signalStrength, Long l10) {
        return new k0(signalStrength != null ? Integer.valueOf(signalStrength.getGsmBitErrorRate()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getGsmSignalStrength()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getCdmaDbm()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getCdmaEcio()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getEvdoDbm()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getEvdoEcio()) : null, signalStrength != null ? Integer.valueOf(signalStrength.getEvdoSnr()) : null, signalStrength != null ? signalStrength.toString() : null, l10);
    }

    public static l0 C(fj.g gVar) {
        String str;
        String str2;
        TelephonyManager telephonyManager = gVar.f8914c;
        ch.f fVar = gVar.f8912a;
        String groupIdLevel1 = null;
        Integer numValueOf = (!fVar.d() || telephonyManager == null) ? null : Integer.valueOf(telephonyManager.getSimCarrierId());
        if (fVar.d()) {
            str = (String) (telephonyManager != null ? telephonyManager.getSimCarrierIdName() : null);
        } else {
            str = null;
        }
        Integer numValueOf2 = (!fVar.e() || telephonyManager == null) ? null : Integer.valueOf(telephonyManager.getSimSpecificCarrierId());
        if (fVar.e()) {
            str2 = (String) (telephonyManager != null ? telephonyManager.getSimSpecificCarrierIdName() : null);
        } else {
            str2 = null;
        }
        Integer numValueOf3 = Integer.valueOf(telephonyManager != null ? telephonyManager.getSimState() : 0);
        if (gVar.f8915d.i("android.permission.READ_PHONE_STATE")) {
            if ((telephonyManager != null ? telephonyManager.getSimState() : 0) == 5 && telephonyManager != null) {
                groupIdLevel1 = telephonyManager.getGroupIdLevel1();
            }
        }
        return new l0(numValueOf, str, numValueOf2, str2, numValueOf3, groupIdLevel1, gVar.m());
    }

    public static q0 D(fj.n nVar) {
        TelephonyDisplayInfo telephonyDisplayInfo;
        TelephonyDisplayInfo telephonyDisplayInfo2;
        return new q0((nVar == null || (telephonyDisplayInfo2 = nVar.R) == null) ? null : Integer.valueOf(telephonyDisplayInfo2.getNetworkType()), (nVar == null || (telephonyDisplayInfo = nVar.R) == null) ? null : Integer.valueOf(telephonyDisplayInfo.getOverrideNetworkType()), nVar != null ? nVar.S : null);
    }

    public static r0 E(fj.n nVar) {
        return new r0(nVar != null ? nVar.T : null, nVar != null ? nVar.U : null);
    }

    public static ni.b n(fj.g gVar) {
        CellIdentityCdma cellIdentityCdmaA = fj.g.a(gVar.i());
        Integer numValueOf = cellIdentityCdmaA != null ? Integer.valueOf(cellIdentityCdmaA.getBasestationId()) : null;
        CellIdentityCdma cellIdentityCdmaA2 = fj.g.a(gVar.i());
        Integer numValueOf2 = cellIdentityCdmaA2 != null ? Integer.valueOf(cellIdentityCdmaA2.getSystemId()) : null;
        CellIdentityCdma cellIdentityCdmaA3 = fj.g.a(gVar.i());
        Integer numValueOf3 = cellIdentityCdmaA3 != null ? Integer.valueOf(cellIdentityCdmaA3.getNetworkId()) : null;
        CellIdentityCdma cellIdentityCdmaA4 = fj.g.a(gVar.i());
        Integer numValueOf4 = cellIdentityCdmaA4 != null ? Integer.valueOf(cellIdentityCdmaA4.getLatitude()) : null;
        CellIdentityCdma cellIdentityCdmaA5 = fj.g.a(gVar.i());
        Integer numValueOf5 = cellIdentityCdmaA5 != null ? Integer.valueOf(cellIdentityCdmaA5.getLongitude()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE = fj.g.e(gVar.i());
        Integer numValueOf6 = cellSignalStrengthCdmaE != null ? Integer.valueOf(cellSignalStrengthCdmaE.getAsuLevel()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE2 = fj.g.e(gVar.i());
        Integer numValueOf7 = cellSignalStrengthCdmaE2 != null ? Integer.valueOf(cellSignalStrengthCdmaE2.getCdmaDbm()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE3 = fj.g.e(gVar.i());
        Integer numValueOf8 = cellSignalStrengthCdmaE3 != null ? Integer.valueOf(cellSignalStrengthCdmaE3.getCdmaEcio()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE4 = fj.g.e(gVar.i());
        Integer numValueOf9 = cellSignalStrengthCdmaE4 != null ? Integer.valueOf(cellSignalStrengthCdmaE4.getCdmaLevel()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE5 = fj.g.e(gVar.i());
        Integer numValueOf10 = cellSignalStrengthCdmaE5 != null ? Integer.valueOf(cellSignalStrengthCdmaE5.getEvdoDbm()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE6 = fj.g.e(gVar.i());
        Integer numValueOf11 = cellSignalStrengthCdmaE6 != null ? Integer.valueOf(cellSignalStrengthCdmaE6.getEvdoEcio()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE7 = fj.g.e(gVar.i());
        Integer numValueOf12 = cellSignalStrengthCdmaE7 != null ? Integer.valueOf(cellSignalStrengthCdmaE7.getEvdoLevel()) : null;
        CellSignalStrengthCdma cellSignalStrengthCdmaE8 = fj.g.e(gVar.i());
        return new ni.b(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, cellSignalStrengthCdmaE8 != null ? Integer.valueOf(cellSignalStrengthCdmaE8.getEvdoSnr()) : null);
    }

    public static ni.c o(fj.g gVar) {
        CellIdentityGsm cellIdentityGsmB;
        CellIdentityGsm cellIdentityGsmB2;
        List listI = gVar.i();
        ch.f fVar = gVar.f8912a;
        CellIdentityGsm cellIdentityGsmB3 = fj.g.b(listI);
        Integer numValueOf = cellIdentityGsmB3 != null ? Integer.valueOf(cellIdentityGsmB3.getCid()) : null;
        CellIdentityGsm cellIdentityGsmB4 = fj.g.b(gVar.i());
        Integer numValueOf2 = cellIdentityGsmB4 != null ? Integer.valueOf(cellIdentityGsmB4.getLac()) : null;
        CellIdentityGsm cellIdentityGsmB5 = fj.g.b(gVar.i());
        Integer numValueOf3 = cellIdentityGsmB5 != null ? Integer.valueOf(cellIdentityGsmB5.getMcc()) : null;
        CellIdentityGsm cellIdentityGsmB6 = fj.g.b(gVar.i());
        Integer numValueOf4 = cellIdentityGsmB6 != null ? Integer.valueOf(cellIdentityGsmB6.getMnc()) : null;
        Integer numValueOf5 = (!fVar.b() || (cellIdentityGsmB2 = fj.g.b(gVar.i())) == null) ? null : Integer.valueOf(cellIdentityGsmB2.getArfcn());
        Integer numValueOf6 = (!fVar.b() || (cellIdentityGsmB = fj.g.b(gVar.i())) == null) ? null : Integer.valueOf(cellIdentityGsmB.getBsic());
        CellSignalStrengthGsm cellSignalStrengthGsmF = fj.g.f(gVar.i());
        Integer numValueOf7 = cellSignalStrengthGsmF != null ? Integer.valueOf(cellSignalStrengthGsmF.getAsuLevel()) : null;
        CellSignalStrengthGsm cellSignalStrengthGsmF2 = fj.g.f(gVar.i());
        Integer numValueOf8 = cellSignalStrengthGsmF2 != null ? Integer.valueOf(cellSignalStrengthGsmF2.getDbm()) : null;
        CellSignalStrengthGsm cellSignalStrengthGsmF3 = fj.g.f(gVar.i());
        return new ni.c(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, cellSignalStrengthGsmF3 != null ? Integer.valueOf(cellSignalStrengthGsmF3.getLevel()) : null);
    }

    public static ni.d p(fj.g gVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer numValueOf;
        CellSignalStrengthLte cellSignalStrengthLteG;
        CellSignalStrengthLte cellSignalStrengthLteG2;
        CellIdentityLte cellIdentityLteC;
        List listI = gVar.i();
        ch.f fVar = gVar.f8912a;
        CellIdentityLte cellIdentityLteC2 = fj.g.c(listI);
        Integer numValueOf2 = cellIdentityLteC2 != null ? Integer.valueOf(cellIdentityLteC2.getCi()) : null;
        CellIdentityLte cellIdentityLteC3 = fj.g.c(gVar.i());
        Integer numValueOf3 = cellIdentityLteC3 != null ? Integer.valueOf(cellIdentityLteC3.getPci()) : null;
        CellIdentityLte cellIdentityLteC4 = fj.g.c(gVar.i());
        Integer numValueOf4 = cellIdentityLteC4 != null ? Integer.valueOf(cellIdentityLteC4.getTac()) : null;
        CellIdentityLte cellIdentityLteC5 = fj.g.c(gVar.i());
        Integer numValueOf5 = cellIdentityLteC5 != null ? Integer.valueOf(cellIdentityLteC5.getMnc()) : null;
        CellIdentityLte cellIdentityLteC6 = fj.g.c(gVar.i());
        Integer numValueOf6 = cellIdentityLteC6 != null ? Integer.valueOf(cellIdentityLteC6.getMcc()) : null;
        Integer numValueOf7 = (!fVar.b() || (cellIdentityLteC = fj.g.c(gVar.i())) == null) ? null : Integer.valueOf(cellIdentityLteC.getEarfcn());
        CellSignalStrengthLte cellSignalStrengthLteG3 = fj.g.g(gVar.i());
        Integer numValueOf8 = cellSignalStrengthLteG3 != null ? Integer.valueOf(cellSignalStrengthLteG3.getAsuLevel()) : null;
        CellSignalStrengthLte cellSignalStrengthLteG4 = fj.g.g(gVar.i());
        Integer numValueOf9 = cellSignalStrengthLteG4 != null ? Integer.valueOf(cellSignalStrengthLteG4.getDbm()) : null;
        CellSignalStrengthLte cellSignalStrengthLteG5 = fj.g.g(gVar.i());
        Integer numValueOf10 = cellSignalStrengthLteG5 != null ? Integer.valueOf(cellSignalStrengthLteG5.getLevel()) : null;
        Integer numValueOf11 = (!fVar.c() || (cellSignalStrengthLteG2 = fj.g.g(gVar.i())) == null) ? null : Integer.valueOf(cellSignalStrengthLteG2.getRsrq());
        Integer numValueOf12 = (!fVar.c() || (cellSignalStrengthLteG = fj.g.g(gVar.i())) == null) ? null : Integer.valueOf(cellSignalStrengthLteG.getRssnr());
        CellSignalStrengthLte cellSignalStrengthLteG6 = fj.g.g(gVar.i());
        Integer numValueOf13 = cellSignalStrengthLteG6 != null ? Integer.valueOf(cellSignalStrengthLteG6.getTimingAdvance()) : null;
        if (fVar.d() && fVar.d()) {
            for (CellInfo cellInfo : gVar.i()) {
                if ((cellInfo instanceof CellInfoLte) && cellInfo.isRegistered()) {
                    Integer num12 = numValueOf11;
                    numValueOf = Integer.valueOf(((CellInfoLte) cellInfo).getCellConnectionStatus());
                    num3 = numValueOf5;
                    num6 = numValueOf8;
                    num9 = num12;
                    num = numValueOf3;
                    num2 = numValueOf4;
                    num4 = numValueOf6;
                    num5 = numValueOf7;
                    num7 = numValueOf9;
                    num8 = numValueOf10;
                    num10 = numValueOf12;
                    num11 = numValueOf13;
                    break;
                }
            }
            num = numValueOf3;
            num2 = numValueOf4;
            num3 = numValueOf5;
            num4 = numValueOf6;
            num5 = numValueOf7;
            num6 = numValueOf8;
            num7 = numValueOf9;
            num8 = numValueOf10;
            num9 = numValueOf11;
            num10 = numValueOf12;
            num11 = numValueOf13;
            numValueOf = null;
        } else {
            num = numValueOf3;
            num2 = numValueOf4;
            num3 = numValueOf5;
            num4 = numValueOf6;
            num5 = numValueOf7;
            num6 = numValueOf8;
            num7 = numValueOf9;
            num8 = numValueOf10;
            num9 = numValueOf11;
            num10 = numValueOf12;
            num11 = numValueOf13;
            numValueOf = null;
        }
        return new ni.d(numValueOf2, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, numValueOf);
    }

    public static ni.e q(fj.g gVar) {
        CellIdentityWcdma cellIdentityWcdmaD;
        CellIdentityWcdma cellIdentityWcdmaD2 = fj.g.d(gVar.i());
        Integer numValueOf = cellIdentityWcdmaD2 != null ? Integer.valueOf(cellIdentityWcdmaD2.getCid()) : null;
        CellIdentityWcdma cellIdentityWcdmaD3 = fj.g.d(gVar.i());
        Integer numValueOf2 = cellIdentityWcdmaD3 != null ? Integer.valueOf(cellIdentityWcdmaD3.getLac()) : null;
        CellIdentityWcdma cellIdentityWcdmaD4 = fj.g.d(gVar.i());
        Integer numValueOf3 = cellIdentityWcdmaD4 != null ? Integer.valueOf(cellIdentityWcdmaD4.getMcc()) : null;
        CellIdentityWcdma cellIdentityWcdmaD5 = fj.g.d(gVar.i());
        Integer numValueOf4 = cellIdentityWcdmaD5 != null ? Integer.valueOf(cellIdentityWcdmaD5.getMnc()) : null;
        CellIdentityWcdma cellIdentityWcdmaD6 = fj.g.d(gVar.i());
        Integer numValueOf5 = cellIdentityWcdmaD6 != null ? Integer.valueOf(cellIdentityWcdmaD6.getPsc()) : null;
        Integer numValueOf6 = (!gVar.f8912a.b() || (cellIdentityWcdmaD = fj.g.d(gVar.i())) == null) ? null : Integer.valueOf(cellIdentityWcdmaD.getUarfcn());
        CellSignalStrengthWcdma cellSignalStrengthWcdmaH = fj.g.h(gVar.i());
        Integer numValueOf7 = cellSignalStrengthWcdmaH != null ? Integer.valueOf(cellSignalStrengthWcdmaH.getAsuLevel()) : null;
        CellSignalStrengthWcdma cellSignalStrengthWcdmaH2 = fj.g.h(gVar.i());
        Integer numValueOf8 = cellSignalStrengthWcdmaH2 != null ? Integer.valueOf(cellSignalStrengthWcdmaH2.getDbm()) : null;
        CellSignalStrengthWcdma cellSignalStrengthWcdmaH3 = fj.g.h(gVar.i());
        return new ni.e(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, cellSignalStrengthWcdmaH3 != null ? Integer.valueOf(cellSignalStrengthWcdmaH3.getLevel()) : null);
    }

    public static ni.y x(boolean z10, js.e eVar) {
        if (z10) {
            om.f fVar = (om.f) eVar.f13800x;
            om.f fVar2 = (om.f) eVar.f13800x;
            String strN = fVar.n("last_public_ip", null);
            if (strN != null && !tt.l.D0(strN)) {
                Long lM = fVar2.m("last_public_ip_time", 0L);
                br.l.d(lM, "getLong(...)");
                return new ni.y(strN, fVar2.n("last_public_ips", null), Long.valueOf(lM.longValue()));
            }
        }
        return null;
    }

    public final i0 A() {
        io.sentry.internal.debugmeta.c cVar = this.Z;
        return new i0(cVar.t(), cVar.s());
    }

    public final boolean F() {
        return h().f529f.f449a.f473b;
    }

    @Override // vj.b
    public final String f() {
        return this.f16792n0;
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) throws JSONException, Settings.SettingNotFoundException, IOException {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
        String str2 = this.f23922d;
        w.g.q(sbK, str2, ", dataEndpoint = ", str, ", isManualExecution = ");
        sbK.append(z10);
        ch.n.b("CoreJob", sbK.toString());
        ek.d dVar = this.f16788j0;
        SensorManager sensorManager = dVar.f8195a;
        ch.n.b("LightSensorRepository", "start() called");
        if (dVar.f8200f == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            dVar.f8200f = defaultSensor;
            sensorManager.registerListener(dVar, defaultSensor, 3);
        }
        this.V.getClass();
        ni.f fVarS = s(this.f23922d, j, System.currentTimeMillis());
        this.f16791m0 = fVarS;
        hk.h hVar = this.E;
        String str3 = this.f16792n0;
        if (hVar != null) {
            hVar.f(str3, fVarS);
        }
        super.j(j);
        ch.n.b("CoreJob", "onFinish() called with: taskId = " + j + ", taskName = " + str2);
        ch.n.b("LightSensorRepository", "stop() called");
        dVar.f8195a.unregisterListener(dVar, dVar.f8200f);
        dVar.f8200f = null;
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            ni.f fVar = this.f16791m0;
            if (fVar != null) {
                hVar2.d(str3, fVar);
            } else {
                br.l.l("coreResult");
                throw null;
            }
        }
    }

    public final ni.a m() {
        Intent intentX;
        bm.d dVar = this.X;
        Intent intentX2 = dVar.x();
        BatteryManager batteryManager = (BatteryManager) dVar.f2827g;
        Integer numValueOf = null;
        Integer numValueOf2 = intentX2 != null ? Integer.valueOf(intentX2.getIntExtra("level", -1)) : null;
        Intent intentX3 = dVar.x();
        Integer numValueOf3 = intentX3 != null ? Integer.valueOf(intentX3.getIntExtra("scale", -1)) : null;
        Intent intentX4 = dVar.x();
        Integer numValueOf4 = intentX4 != null ? Integer.valueOf(intentX4.getIntExtra("health", -1)) : null;
        Intent intentX5 = dVar.x();
        Integer numValueOf5 = intentX5 != null ? Integer.valueOf(intentX5.getIntExtra("plugged", -1)) : null;
        Intent intentX6 = dVar.x();
        Integer numValueOf6 = intentX6 != null ? Integer.valueOf(intentX6.getIntExtra("status", -1)) : null;
        Intent intentX7 = dVar.x();
        String stringExtra = intentX7 != null ? intentX7.getStringExtra("technology") : null;
        Intent intentX8 = dVar.x();
        Integer numValueOf7 = intentX8 != null ? Integer.valueOf(intentX8.getIntExtra("temperature", -1)) : null;
        Intent intentX9 = dVar.x();
        Integer numValueOf8 = intentX9 != null ? Integer.valueOf(intentX9.getIntExtra("voltage", -1)) : null;
        Intent intentX10 = dVar.x();
        Boolean boolValueOf = intentX10 != null ? Boolean.valueOf(intentX10.getBooleanExtra("present", true)) : null;
        Long lValueOf = batteryManager != null ? Long.valueOf(batteryManager.getLongProperty(3)) : null;
        Long lValueOf2 = batteryManager != null ? Long.valueOf(batteryManager.getLongProperty(2)) : null;
        Long lValueOf3 = batteryManager != null ? Long.valueOf(batteryManager.getLongProperty(1)) : null;
        Long lValueOf4 = batteryManager != null ? Long.valueOf(batteryManager.getLongProperty(5)) : null;
        if (((ch.f) dVar.f2828r).i() && (intentX = dVar.x()) != null) {
            numValueOf = Integer.valueOf(intentX.getIntExtra("android.os.extra.CYCLE_COUNT", -1));
        }
        return new ni.a(numValueOf2, numValueOf3, numValueOf5, numValueOf6, stringExtra, numValueOf7, numValueOf4, numValueOf8, boolValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, numValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r(fj.g r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b.r(fj.g):java.lang.String");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final ni.f s(java.lang.String r104, long r105, long r107) throws org.json.JSONException, android.provider.Settings.SettingNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 3992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b.s(java.lang.String, long, long):ni.f");
    }

    public final ni.i t() {
        ak.d dVar = h().f529f.f449a;
        yi.d dVar2 = this.f16781c0;
        dVar2.getClass();
        yi.e eVar = dVar2.f26371a;
        try {
            try {
                try {
                    dVar2.c();
                    Thread.sleep(dVar.f476e);
                } catch (IllegalArgumentException e4) {
                    ch.n.e("DataUsageCollector", e4);
                }
            } catch (InterruptedException e10) {
                ch.n.e("DataUsageCollector", e10);
            }
            Long lA = yi.d.a(dVar2.f26376f, dVar2.f26372b);
            Long lA2 = yi.d.a(dVar2.f26377g, dVar2.f26373c);
            Long lA3 = yi.d.a(dVar2.f26378h, dVar2.f26374d);
            Long lA4 = yi.d.a(dVar2.f26379i, dVar2.f26375e);
            Long lA5 = yi.d.a(dVar2.k, dVar2.j);
            Long lA6 = yi.d.a(dVar2.f26380l, dVar2.f26388t);
            Long lA7 = yi.d.a(dVar2.f26381m, dVar2.f26389u);
            Long lA8 = yi.d.a(dVar2.f26382n, dVar2.f26390v);
            Long lA9 = yi.d.a(dVar2.f26383o, dVar2.f26391w);
            Long lA10 = yi.d.a(dVar2.f26384p, dVar2.f26392x);
            Long lA11 = yi.d.a(dVar2.f26385q, dVar2.f26393y);
            Long lA12 = yi.d.a(dVar2.f26386r, dVar2.f26394z);
            Long lA13 = yi.d.a(dVar2.f26387s, dVar2.A);
            yi.b bVar = yi.b.WIFI;
            yi.a aVar = yi.a.TX;
            yi.c cVar = yi.c.DROPPED;
            Long lB = eVar.b(bVar, aVar, cVar);
            yi.c cVar2 = yi.c.PACKETS;
            Long lB2 = eVar.b(bVar, aVar, cVar2);
            yi.b bVar2 = yi.b.CELL;
            Long lB3 = eVar.b(bVar2, aVar, cVar);
            Long lB4 = eVar.b(bVar2, aVar, cVar2);
            yi.a aVar2 = yi.a.RX;
            Long lB5 = eVar.b(bVar, aVar2, cVar);
            Long lB6 = eVar.b(bVar, aVar2, cVar2);
            Long lB7 = eVar.b(bVar2, aVar2, cVar);
            Long lB8 = eVar.b(bVar2, aVar2, cVar2);
            yi.c cVar3 = yi.c.BYTES;
            return new ni.i(lA, lA2, lA3, lA4, lA5, lA6, lA7, lA8, lA9, lA10, lA11, lA12, lA13, lB, lB2, lB3, lB4, lB5, lB6, lB7, lB8, eVar.b(bVar2, aVar2, cVar3), eVar.b(bVar, aVar2, cVar3), eVar.b(bVar2, aVar, cVar3), eVar.b(bVar, aVar, cVar3));
        } finally {
            dVar2.b();
        }
    }

    public final ni.j u(ak.s sVar) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long lValueOf4 = null;
        String str = sVar != null ? sVar.f656a : null;
        Long l16 = sVar != null ? sVar.f659d : null;
        yi.e eVar = this.f16790l0;
        Long lValueOf5 = (sVar == null || (l15 = sVar.f667n) == null) ? null : Long.valueOf(eVar.d() - l15.longValue());
        if (sVar == null || (l14 = sVar.f668o) == null) {
            lValueOf = null;
        } else {
            long jLongValue = l14.longValue();
            Long lB = eVar.b(yi.b.WIFI, yi.a.TX, yi.c.BYTES);
            lValueOf = lB != null ? Long.valueOf(lB.longValue() - jLongValue) : null;
        }
        if (sVar == null || (l13 = sVar.f669p) == null) {
            lValueOf2 = null;
        } else {
            long jLongValue2 = l13.longValue();
            Long lB2 = eVar.b(yi.b.CELL, yi.a.TX, yi.c.BYTES);
            lValueOf2 = lB2 != null ? Long.valueOf(lB2.longValue() - jLongValue2) : null;
        }
        Long lValueOf6 = (sVar == null || (l12 = sVar.f670q) == null) ? null : Long.valueOf(eVar.c() - l12.longValue());
        if (sVar == null || (l11 = sVar.f671r) == null) {
            lValueOf3 = null;
        } else {
            long jLongValue3 = l11.longValue();
            Long lB3 = eVar.b(yi.b.WIFI, yi.a.RX, yi.c.BYTES);
            lValueOf3 = lB3 != null ? Long.valueOf(lB3.longValue() - jLongValue3) : null;
        }
        if (sVar != null && (l10 = sVar.f672s) != null) {
            long jLongValue4 = l10.longValue();
            Long lB4 = eVar.b(yi.b.CELL, yi.a.RX, yi.c.BYTES);
            if (lB4 != null) {
                lValueOf4 = Long.valueOf(lB4.longValue() - jLongValue4);
            }
        }
        return new ni.j(str, l16, lValueOf5, lValueOf, lValueOf2, lValueOf6, lValueOf3, lValueOf4);
    }

    public final ni.k v() {
        ki.a aVar = this.f16785g0;
        aVar.getClass();
        Long lA = ki.a.a(new bq.g(1, aVar, ki.a.class, "getFreeStorageBytesForPath", "getFreeStorageBytesForPath(Ljava/lang/String;)J", 0, 2));
        Long lValueOf = null;
        if (lA != null) {
            long jLongValue = lA.longValue();
            Long lA2 = ki.a.a(new bq.g(1, aVar, ki.a.class, "getTotalStorageBytesForPath", "getTotalStorageBytesForPath(Ljava/lang/String;)J", 0, 3));
            if (lA2 != null) {
                lValueOf = Long.valueOf(lA2.longValue() - jLongValue);
            }
        }
        Long lA3 = ki.a.a(new bq.g(1, aVar, ki.a.class, "getFreeStorageBytesForPath", "getFreeStorageBytesForPath(Ljava/lang/String;)J", 0, 2));
        i.g0 g0Var = this.f16786h0;
        return new ni.k(lA3, lValueOf, Long.valueOf(g0Var.x().availMem), Long.valueOf(g0Var.x().totalMem - g0Var.x().availMem));
    }

    public final ni.r w(TelephonyManager telephonyManager) {
        EuiccManager euiccManager;
        EuiccInfo euiccInfo;
        EuiccManager euiccManager2;
        Integer numValueOf = null;
        zi.a aVar = this.f16779a0;
        com.opensignal.sdk.common.measurements.base.a aVar2 = aVar != null ? new com.opensignal.sdk.common.measurements.base.a((EuiccManager) aVar.f27421a, telephonyManager, (ch.f) aVar.f27422b, (PackageManager) aVar.f27423c) : null;
        Boolean boolValueOf = (aVar2 == null || (euiccManager2 = aVar2.f5850a) == null) ? null : Boolean.valueOf(euiccManager2.isEnabled());
        String osVersion = (aVar2 == null || (euiccManager = aVar2.f5850a) == null || (euiccInfo = euiccManager.getEuiccInfo()) == null) ? null : euiccInfo.getOsVersion();
        if (aVar2 != null) {
            TelephonyManager telephonyManager2 = aVar2.f5851b;
            if (aVar2.f5852c.e() && aVar2.f5853d.hasSystemFeature("android.hardware.telephony.euicc")) {
                numValueOf = Integer.valueOf(telephonyManager2.getCardIdForDefaultEuicc());
            }
        }
        return new ni.r(boolValueOf, osVersion, numValueOf);
    }

    public final ni.b0 y() {
        ek.d dVar = this.f16788j0;
        df.c cVar = dVar.f8196b;
        return new ni.b0(System.currentTimeMillis() - dVar.f8199e <= 5000 ? dVar.f8197c : null, System.currentTimeMillis() - dVar.f8199e <= 5000 ? dVar.f8198d : null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final ni.e0 z() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b.z():ni.e0");
    }
}
