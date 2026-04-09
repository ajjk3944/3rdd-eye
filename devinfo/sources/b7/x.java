package b7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.play_billing.m1;
import java.util.ArrayList;
import t6.d0;
import t6.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2065b;

    public /* synthetic */ x(int i4, long j) {
        this.f2064a = i4;
        this.f2065b = j;
    }

    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        Integer numValueOf;
        Boolean boolValueOf;
        xk.h hVar;
        Object objH;
        int i4 = this.f2064a;
        long j = this.f2065b;
        switch (i4) {
            case 0:
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                d6.c cVarS = aVar.S("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    cVarS.a(1, j);
                    int iM = ii.a.m(cVarS, FacebookMediationAdapter.KEY_ID);
                    int iM2 = ii.a.m(cVarS, "state");
                    int iM3 = ii.a.m(cVarS, "worker_class_name");
                    int iM4 = ii.a.m(cVarS, "input_merger_class_name");
                    int iM5 = ii.a.m(cVarS, "input");
                    int iM6 = ii.a.m(cVarS, "output");
                    int iM7 = ii.a.m(cVarS, "initial_delay");
                    int iM8 = ii.a.m(cVarS, "interval_duration");
                    int iM9 = ii.a.m(cVarS, "flex_duration");
                    int iM10 = ii.a.m(cVarS, "run_attempt_count");
                    int iM11 = ii.a.m(cVarS, "backoff_policy");
                    int iM12 = ii.a.m(cVarS, "backoff_delay_duration");
                    int iM13 = ii.a.m(cVarS, "last_enqueue_time");
                    int iM14 = ii.a.m(cVarS, "minimum_retention_duration");
                    int iM15 = ii.a.m(cVarS, "schedule_requested_at");
                    int iM16 = ii.a.m(cVarS, "run_in_foreground");
                    int iM17 = ii.a.m(cVarS, "out_of_quota_policy");
                    int iM18 = ii.a.m(cVarS, "period_count");
                    int iM19 = ii.a.m(cVarS, "generation");
                    int iM20 = ii.a.m(cVarS, "next_schedule_time_override");
                    int iM21 = ii.a.m(cVarS, "next_schedule_time_override_generation");
                    int iM22 = ii.a.m(cVarS, "stop_reason");
                    int iM23 = ii.a.m(cVarS, "trace_tag");
                    int iM24 = ii.a.m(cVarS, "backoff_on_system_interruptions");
                    int iM25 = ii.a.m(cVarS, "required_network_type");
                    int iM26 = ii.a.m(cVarS, "required_network_request");
                    int iM27 = ii.a.m(cVarS, "requires_charging");
                    int iM28 = ii.a.m(cVarS, "requires_device_idle");
                    int iM29 = ii.a.m(cVarS, "requires_battery_not_low");
                    int iM30 = ii.a.m(cVarS, "requires_storage_not_low");
                    int iM31 = ii.a.m(cVarS, "trigger_content_update_delay");
                    int iM32 = ii.a.m(cVarS, "trigger_max_content_delay");
                    int iM33 = ii.a.m(cVarS, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarS.P()) {
                        String strD = cVarS.D(iM);
                        ArrayList arrayList2 = arrayList;
                        int i10 = iM14;
                        g0 g0VarU = m1.u((int) cVarS.getLong(iM2));
                        String strD2 = cVarS.D(iM3);
                        String strD3 = cVarS.D(iM4);
                        byte[] blob = cVarS.getBlob(iM5);
                        t6.h hVar2 = t6.h.f34355b;
                        t6.h hVarH = jm.a.h(blob);
                        t6.h hVarH2 = jm.a.h(cVarS.getBlob(iM6));
                        long j8 = cVarS.getLong(iM7);
                        long j9 = cVarS.getLong(iM8);
                        long j10 = cVarS.getLong(iM9);
                        int i11 = (int) cVarS.getLong(iM10);
                        t6.a aVarR = m1.r((int) cVarS.getLong(iM11));
                        long j11 = cVarS.getLong(iM12);
                        long j12 = cVarS.getLong(iM13);
                        long j13 = cVarS.getLong(i10);
                        int i12 = iM15;
                        long j14 = cVarS.getLong(i12);
                        int i13 = iM13;
                        int i14 = iM16;
                        boolean z3 = ((int) cVarS.getLong(i14)) != 0;
                        int i15 = iM17;
                        int i16 = iM;
                        d0 d0VarT = m1.t((int) cVarS.getLong(i15));
                        int i17 = iM18;
                        int i18 = (int) cVarS.getLong(i17);
                        int i19 = iM19;
                        int i20 = (int) cVarS.getLong(i19);
                        int i21 = iM20;
                        long j15 = cVarS.getLong(i21);
                        int i22 = iM21;
                        int i23 = (int) cVarS.getLong(i22);
                        iM21 = i22;
                        int i24 = iM22;
                        int i25 = (int) cVarS.getLong(i24);
                        int i26 = iM23;
                        String strD4 = cVarS.isNull(i26) ? null : cVarS.D(i26);
                        int i27 = iM24;
                        if (cVarS.isNull(i27)) {
                            iM23 = i26;
                            iM22 = i24;
                            numValueOf = null;
                        } else {
                            iM23 = i26;
                            iM22 = i24;
                            numValueOf = Integer.valueOf((int) cVarS.getLong(i27));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i28 = iM25;
                        t6.w wVarS = m1.s((int) cVarS.getLong(i28));
                        int i29 = iM26;
                        c7.h hVarE = m1.E(cVarS.getBlob(i29));
                        int i30 = iM27;
                        boolean z10 = ((int) cVarS.getLong(i30)) != 0;
                        int i31 = iM28;
                        boolean z11 = ((int) cVarS.getLong(i31)) != 0;
                        int i32 = iM29;
                        boolean z12 = ((int) cVarS.getLong(i32)) != 0;
                        iM29 = i32;
                        int i33 = iM30;
                        int i34 = iM31;
                        int i35 = iM32;
                        iM31 = i34;
                        int i36 = iM33;
                        r rVar = new r(strD, g0VarU, strD2, strD3, hVarH, hVarH2, j8, j9, j10, new t6.e(hVarE, wVarS, z10, z11, z12, ((int) cVarS.getLong(i33)) != 0, cVarS.getLong(i34), cVarS.getLong(i35), m1.f(cVarS.getBlob(i36))), i11, aVarR, j11, j12, j13, j14, z3, d0VarT, i18, i20, j15, i23, i25, strD4, boolValueOf);
                        iM33 = i36;
                        iM32 = i35;
                        arrayList = arrayList2;
                        arrayList.add(rVar);
                        iM28 = i31;
                        iM = i16;
                        iM17 = i15;
                        iM18 = i17;
                        iM19 = i19;
                        iM20 = i21;
                        iM24 = i27;
                        iM25 = i28;
                        iM26 = i29;
                        iM27 = i30;
                        iM30 = i33;
                        iM13 = i13;
                        iM15 = i12;
                        iM14 = i10;
                        iM16 = i14;
                    }
                    cVarS.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarS.close();
                    throw th2;
                }
            case 1:
                ((t4.b) obj).d(bf.i.f2179b, Long.valueOf(j));
                return null;
            default:
                u0.d dVar = (u0.d) obj;
                mk.c cVar = dVar.f34761b;
                if (cVar != null && (hVar = dVar.f34760a) != null) {
                    try {
                        objH = cVar.invoke(Long.valueOf(j));
                    } catch (Throwable th3) {
                        objH = ci.b.h(th3);
                    }
                    hVar.resumeWith(objH);
                }
                return yj.u.f37649a;
        }
    }
}
