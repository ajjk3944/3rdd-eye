package b7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.play_billing.m1;
import j0.k0;
import java.util.ArrayList;
import t6.d0;
import t6.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2053a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2054b;

    public /* synthetic */ s(int i4) {
        this.f2054b = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        int i4;
        int i10;
        Integer numValueOf;
        Boolean boolValueOf;
        switch (this.f2053a) {
            case 0:
                int i11 = this.f2054b;
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                d6.c cVarS = aVar.S("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    cVarS.a(1, i11);
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
                        int i12 = iM14;
                        g0 g0VarU = m1.u((int) cVarS.getLong(iM2));
                        String strD2 = cVarS.D(iM3);
                        String strD3 = cVarS.D(iM4);
                        byte[] blob = cVarS.getBlob(iM5);
                        t6.h hVar = t6.h.f34355b;
                        t6.h hVarH = jm.a.h(blob);
                        t6.h hVarH2 = jm.a.h(cVarS.getBlob(iM6));
                        long j = cVarS.getLong(iM7);
                        long j8 = cVarS.getLong(iM8);
                        long j9 = cVarS.getLong(iM9);
                        int i13 = (int) cVarS.getLong(iM10);
                        t6.a aVarR = m1.r((int) cVarS.getLong(iM11));
                        long j10 = cVarS.getLong(iM12);
                        long j11 = cVarS.getLong(iM13);
                        long j12 = cVarS.getLong(i12);
                        int i14 = iM15;
                        long j13 = cVarS.getLong(i14);
                        int i15 = iM13;
                        int i16 = iM16;
                        boolean z3 = ((int) cVarS.getLong(i16)) != 0;
                        int i17 = iM2;
                        int i18 = iM17;
                        int i19 = iM;
                        d0 d0VarT = m1.t((int) cVarS.getLong(i18));
                        int i20 = iM18;
                        int i21 = (int) cVarS.getLong(i20);
                        int i22 = iM19;
                        int i23 = (int) cVarS.getLong(i22);
                        int i24 = iM20;
                        long j14 = cVarS.getLong(i24);
                        int i25 = iM21;
                        int i26 = (int) cVarS.getLong(i25);
                        int i27 = iM22;
                        int i28 = (int) cVarS.getLong(i27);
                        int i29 = iM23;
                        String strD4 = cVarS.isNull(i29) ? null : cVarS.D(i29);
                        int i30 = iM24;
                        if (cVarS.isNull(i30)) {
                            i4 = i27;
                            i10 = i25;
                            numValueOf = null;
                        } else {
                            i4 = i27;
                            i10 = i25;
                            numValueOf = Integer.valueOf((int) cVarS.getLong(i30));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i31 = iM25;
                        t6.w wVarS = m1.s((int) cVarS.getLong(i31));
                        int i32 = iM26;
                        c7.h hVarE = m1.E(cVarS.getBlob(i32));
                        int i33 = iM27;
                        boolean z10 = ((int) cVarS.getLong(i33)) != 0;
                        int i34 = iM28;
                        boolean z11 = ((int) cVarS.getLong(i34)) != 0;
                        int i35 = iM29;
                        boolean z12 = ((int) cVarS.getLong(i35)) != 0;
                        iM29 = i35;
                        int i36 = iM30;
                        int i37 = iM31;
                        int i38 = iM32;
                        iM31 = i37;
                        int i39 = iM33;
                        r rVar = new r(strD, g0VarU, strD2, strD3, hVarH, hVarH2, j, j8, j9, new t6.e(hVarE, wVarS, z10, z11, z12, ((int) cVarS.getLong(i36)) != 0, cVarS.getLong(i37), cVarS.getLong(i38), m1.f(cVarS.getBlob(i39))), i13, aVarR, j10, j11, j12, j13, z3, d0VarT, i21, i23, j14, i26, i28, strD4, boolValueOf);
                        iM33 = i39;
                        iM32 = i38;
                        arrayList = arrayList2;
                        arrayList.add(rVar);
                        iM30 = i36;
                        iM13 = i15;
                        iM15 = i14;
                        iM = i19;
                        iM17 = i18;
                        iM18 = i20;
                        iM19 = i22;
                        iM20 = i24;
                        iM21 = i10;
                        iM22 = i4;
                        iM24 = i30;
                        iM25 = i31;
                        iM23 = i29;
                        iM27 = i33;
                        iM16 = i16;
                        iM26 = i32;
                        iM28 = i34;
                        iM14 = i12;
                        iM2 = i17;
                    }
                    cVarS.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarS.close();
                    throw th2;
                }
            default:
                k0 k0Var = (k0) obj;
                g1.g gVarF = g1.r.f();
                g1.r.o(gVarF, g1.r.k(gVarF), gVarF != null ? gVarF.e() : null);
                k0Var.getClass();
                return yj.u.f37649a;
        }
    }

    public /* synthetic */ s(i0.u uVar, int i4) {
        this.f2054b = i4;
    }
}
