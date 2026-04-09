package a0;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.play_billing.m1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111a;

    public /* synthetic */ q0(int i4) {
        this.f111a = i4;
    }

    private final Object c(Object obj) throws Exception {
        int i4;
        int i10;
        Integer numValueOf;
        d6.a aVar = (d6.a) obj;
        nk.k.e(aVar, "_connection");
        d6.c cVarS = aVar.S("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
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
                int i11 = iM14;
                ArrayList arrayList2 = arrayList;
                t6.g0 g0VarU = m1.u((int) cVarS.getLong(iM2));
                String strD2 = cVarS.D(iM3);
                String strD3 = cVarS.D(iM4);
                byte[] blob = cVarS.getBlob(iM5);
                t6.h hVar = t6.h.f34355b;
                t6.h hVarH = jm.a.h(blob);
                t6.h hVarH2 = jm.a.h(cVarS.getBlob(iM6));
                long j = cVarS.getLong(iM7);
                long j8 = cVarS.getLong(iM8);
                long j9 = cVarS.getLong(iM9);
                int i12 = (int) cVarS.getLong(iM10);
                int i13 = iM2;
                int i14 = iM3;
                t6.a aVarR = m1.r((int) cVarS.getLong(iM11));
                long j10 = cVarS.getLong(iM12);
                long j11 = cVarS.getLong(iM13);
                long j12 = cVarS.getLong(i11);
                int i15 = iM15;
                long j13 = cVarS.getLong(i15);
                int i16 = iM;
                int i17 = iM16;
                boolean z3 = ((int) cVarS.getLong(i17)) != 0;
                int i18 = iM17;
                int i19 = iM4;
                t6.d0 d0VarT = m1.t((int) cVarS.getLong(i18));
                int i20 = iM18;
                int i21 = iM5;
                int i22 = (int) cVarS.getLong(i20);
                int i23 = iM19;
                int i24 = (int) cVarS.getLong(i23);
                int i25 = iM20;
                long j14 = cVarS.getLong(i25);
                int i26 = iM21;
                int i27 = (int) cVarS.getLong(i26);
                int i28 = iM22;
                int i29 = (int) cVarS.getLong(i28);
                int i30 = iM23;
                Boolean boolValueOf = null;
                String strD4 = cVarS.isNull(i30) ? null : cVarS.D(i30);
                int i31 = iM24;
                if (cVarS.isNull(i31)) {
                    i4 = i27;
                    i10 = i28;
                    numValueOf = null;
                } else {
                    i4 = i27;
                    i10 = i28;
                    numValueOf = Integer.valueOf((int) cVarS.getLong(i31));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i32 = iM25;
                Boolean bool = boolValueOf;
                t6.w wVarS = m1.s((int) cVarS.getLong(i32));
                int i33 = iM26;
                c7.h hVarE = m1.E(cVarS.getBlob(i33));
                iM25 = i32;
                iM26 = i33;
                int i34 = iM27;
                boolean z10 = ((int) cVarS.getLong(i34)) != 0;
                iM27 = i34;
                int i35 = iM28;
                boolean z11 = ((int) cVarS.getLong(i35)) != 0;
                int i36 = iM29;
                boolean z12 = ((int) cVarS.getLong(i36)) != 0;
                iM29 = i36;
                int i37 = iM30;
                int i38 = iM31;
                int i39 = iM32;
                int i40 = iM33;
                iM33 = i40;
                arrayList2.add(new b7.r(strD, g0VarU, strD2, strD3, hVarH, hVarH2, j, j8, j9, new t6.e(hVarE, wVarS, z10, z11, z12, ((int) cVarS.getLong(i37)) != 0, cVarS.getLong(i38), cVarS.getLong(i39), m1.f(cVarS.getBlob(i40))), i12, aVarR, j10, j11, j12, j13, z3, d0VarT, i22, i24, j14, i4, i29, strD4, bool));
                iM30 = i37;
                iM4 = i19;
                iM17 = i18;
                iM19 = i23;
                iM22 = i10;
                iM24 = i31;
                iM31 = i38;
                iM32 = i39;
                iM2 = i13;
                iM14 = i11;
                iM3 = i14;
                arrayList = arrayList2;
                iM = i16;
                iM15 = i15;
                iM16 = i17;
                iM20 = i25;
                iM21 = i26;
                iM23 = i30;
                iM28 = i35;
                iM5 = i21;
                iM18 = i20;
            }
            ArrayList arrayList3 = arrayList;
            cVarS.close();
            return arrayList3;
        } catch (Throwable th2) {
            cVarS.close();
            throw th2;
        }
    }

    private final Object d(Object obj) throws Exception {
        int i4;
        Integer numValueOf;
        d6.a aVar = (d6.a) obj;
        nk.k.e(aVar, "_connection");
        d6.c cVarS = aVar.S("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            cVarS.a(1, TTAdConstant.MATE_VALID);
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
                int i10 = iM13;
                int i11 = iM14;
                t6.g0 g0VarU = m1.u((int) cVarS.getLong(iM2));
                String strD2 = cVarS.D(iM3);
                String strD3 = cVarS.D(iM4);
                byte[] blob = cVarS.getBlob(iM5);
                t6.h hVar = t6.h.f34355b;
                t6.h hVarH = jm.a.h(blob);
                t6.h hVarH2 = jm.a.h(cVarS.getBlob(iM6));
                long j = cVarS.getLong(iM7);
                long j8 = cVarS.getLong(iM8);
                long j9 = cVarS.getLong(iM9);
                int i12 = (int) cVarS.getLong(iM10);
                int i13 = iM;
                int i14 = iM2;
                t6.a aVarR = m1.r((int) cVarS.getLong(iM11));
                long j10 = cVarS.getLong(iM12);
                long j11 = cVarS.getLong(i10);
                long j12 = cVarS.getLong(i11);
                int i15 = iM15;
                long j13 = cVarS.getLong(i15);
                iM15 = i15;
                int i16 = iM16;
                int i17 = iM3;
                boolean z3 = ((int) cVarS.getLong(i16)) != 0;
                int i18 = iM17;
                int i19 = iM4;
                t6.d0 d0VarT = m1.t((int) cVarS.getLong(i18));
                int i20 = iM18;
                int i21 = (int) cVarS.getLong(i20);
                int i22 = iM19;
                int i23 = (int) cVarS.getLong(i22);
                int i24 = iM20;
                long j14 = cVarS.getLong(i24);
                int i25 = iM21;
                int i26 = (int) cVarS.getLong(i25);
                iM21 = i25;
                int i27 = iM22;
                int i28 = (int) cVarS.getLong(i27);
                int i29 = iM23;
                Boolean boolValueOf = null;
                String strD4 = cVarS.isNull(i29) ? null : cVarS.D(i29);
                int i30 = iM24;
                if (cVarS.isNull(i30)) {
                    i4 = i29;
                    iM22 = i27;
                    numValueOf = null;
                } else {
                    i4 = i29;
                    iM22 = i27;
                    numValueOf = Integer.valueOf((int) cVarS.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
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
                arrayList.add(new b7.r(strD, g0VarU, strD2, strD3, hVarH, hVarH2, j, j8, j9, new t6.e(hVarE, wVarS, z10, z11, z12, ((int) cVarS.getLong(i36)) != 0, cVarS.getLong(i37), cVarS.getLong(i38), m1.f(cVarS.getBlob(i39))), i12, aVarR, j10, j11, j12, j13, z3, d0VarT, i21, i23, j14, i26, i28, strD4, bool));
                iM28 = i34;
                iM4 = i19;
                iM17 = i18;
                iM18 = i20;
                iM19 = i22;
                iM20 = i24;
                iM23 = i4;
                iM24 = i30;
                iM25 = i31;
                iM26 = i32;
                iM27 = i33;
                iM33 = i39;
                iM32 = i38;
                iM30 = i36;
                iM = i13;
                iM3 = i17;
                iM13 = i10;
                iM14 = i11;
                iM2 = i14;
                iM16 = i16;
            }
            cVarS.close();
            return arrayList;
        } catch (Throwable th2) {
            cVarS.close();
            throw th2;
        }
    }

    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        d6.c cVarS;
        int i4;
        int i10;
        Integer numValueOf;
        Boolean boolValueOf;
        int i11;
        Integer numValueOf2;
        Boolean boolValueOf2;
        boolean z3;
        switch (this.f111a) {
            case 0:
                return yj.u.f37649a;
            case 1:
                return new n(((Float) obj).floatValue());
            case 2:
                return new n(((Integer) obj).intValue());
            case 3:
                return Integer.valueOf((int) ((n) obj).f92a);
            case 4:
                return new n(((d3.f) obj).f21957a);
            case 5:
                return new d3.f(((n) obj).f92a);
            case 6:
                d3.g gVar = (d3.g) obj;
                return new o(Float.intBitsToFloat((int) (gVar.f21958a >> 32)), Float.intBitsToFloat((int) (gVar.f21958a & 4294967295L)));
            case 7:
                o oVar = (o) obj;
                return new d3.g((Float.floatToRawIntBits(oVar.f95a) << 32) | (Float.floatToRawIntBits(oVar.f96b) & 4294967295L));
            case 8:
                o1.e eVar = (o1.e) obj;
                return new o(Float.intBitsToFloat((int) (eVar.f30377a >> 32)), Float.intBitsToFloat((int) (eVar.f30377a & 4294967295L)));
            case 9:
                o oVar2 = (o) obj;
                return new o1.e((Float.floatToRawIntBits(oVar2.f95a) << 32) | (Float.floatToRawIntBits(oVar2.f96b) & 4294967295L));
            case 10:
                o1.b bVar = (o1.b) obj;
                return new o(Float.intBitsToFloat((int) (bVar.f30364a >> 32)), Float.intBitsToFloat((int) (bVar.f30364a & 4294967295L)));
            case 11:
                o oVar3 = (o) obj;
                return new o1.b((Float.floatToRawIntBits(oVar3.f95a) << 32) | (Float.floatToRawIntBits(oVar3.f96b) & 4294967295L));
            case 12:
                long j = ((d3.i) obj).f21959a;
                return new o((int) (j >> 32), (int) (j & 4294967295L));
            case 13:
                o oVar4 = (o) obj;
                return new d3.i((Math.round(oVar4.f95a) << 32) | (Math.round(oVar4.f96b) & 4294967295L));
            case 14:
                long j8 = ((d3.k) obj).f21965a;
                return new o((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 15:
                o oVar5 = (o) obj;
                int iRound = Math.round(oVar5.f95a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new d3.k((iRound << 32) | ((Math.round(oVar5.f96b) >= 0 ? r0 : 0) & 4294967295L));
            case 16:
                o1.c cVar = (o1.c) obj;
                return new q(cVar.f30366a, cVar.f30367b, cVar.f30368c, cVar.f30369d);
            case 17:
                q qVar = (q) obj;
                return new o1.c(qVar.f107a, qVar.f108b, qVar.f109c, qVar.f110d);
            case 18:
                return Float.valueOf(((n) obj).f92a);
            case 19:
                return 150L;
            case 20:
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                cVarS = aVar.S("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarS.P()) {
                        arrayList.add(cVarS.D(0));
                    }
                    return arrayList;
                } finally {
                }
            case 21:
                d6.a aVar2 = (d6.a) obj;
                nk.k.e(aVar2, "_connection");
                cVarS = aVar2.S("DELETE FROM WorkProgress");
                try {
                    cVarS.P();
                    cVarS.close();
                    return yj.u.f37649a;
                } finally {
                }
            case 22:
                d6.a aVar3 = (d6.a) obj;
                nk.k.e(aVar3, "_connection");
                cVarS = aVar3.S("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarS.P()) {
                        String strD = cVarS.D(iM);
                        int i12 = iM14;
                        int i13 = iM13;
                        t6.g0 g0VarU = m1.u((int) cVarS.getLong(iM2));
                        String strD2 = cVarS.D(iM3);
                        String strD3 = cVarS.D(iM4);
                        byte[] blob = cVarS.getBlob(iM5);
                        t6.h hVar = t6.h.f34355b;
                        t6.h hVarH = jm.a.h(blob);
                        t6.h hVarH2 = jm.a.h(cVarS.getBlob(iM6));
                        long j9 = cVarS.getLong(iM7);
                        long j10 = cVarS.getLong(iM8);
                        long j11 = cVarS.getLong(iM9);
                        int i14 = (int) cVarS.getLong(iM10);
                        int i15 = iM2;
                        int i16 = iM;
                        t6.a aVarR = m1.r((int) cVarS.getLong(iM11));
                        long j12 = cVarS.getLong(iM12);
                        long j13 = cVarS.getLong(i13);
                        long j14 = cVarS.getLong(i12);
                        int i17 = iM15;
                        long j15 = cVarS.getLong(i17);
                        iM15 = i17;
                        int i18 = iM16;
                        int i19 = iM3;
                        boolean z10 = ((int) cVarS.getLong(i18)) != 0;
                        int i20 = iM17;
                        t6.d0 d0VarT = m1.t((int) cVarS.getLong(i20));
                        iM17 = i20;
                        int i21 = iM18;
                        int i22 = (int) cVarS.getLong(i21);
                        iM18 = i21;
                        int i23 = iM19;
                        int i24 = (int) cVarS.getLong(i23);
                        int i25 = iM20;
                        long j16 = cVarS.getLong(i25);
                        int i26 = iM21;
                        int i27 = (int) cVarS.getLong(i26);
                        int i28 = iM22;
                        int i29 = (int) cVarS.getLong(i28);
                        int i30 = iM23;
                        String strD4 = cVarS.isNull(i30) ? null : cVarS.D(i30);
                        int i31 = iM24;
                        if (cVarS.isNull(i31)) {
                            i4 = i27;
                            i10 = i28;
                            numValueOf = null;
                        } else {
                            i4 = i27;
                            i10 = i28;
                            numValueOf = Integer.valueOf((int) cVarS.getLong(i31));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        iM24 = i31;
                        int i32 = iM25;
                        t6.w wVarS = m1.s((int) cVarS.getLong(i32));
                        int i33 = iM26;
                        c7.h hVarE = m1.E(cVarS.getBlob(i33));
                        iM25 = i32;
                        int i34 = iM27;
                        boolean z11 = ((int) cVarS.getLong(i34)) != 0;
                        iM27 = i34;
                        int i35 = iM28;
                        boolean z12 = ((int) cVarS.getLong(i35)) != 0;
                        iM28 = i35;
                        int i36 = iM29;
                        boolean z13 = ((int) cVarS.getLong(i36)) != 0;
                        iM29 = i36;
                        int i37 = iM30;
                        int i38 = iM31;
                        int i39 = iM32;
                        iM31 = i38;
                        int i40 = iM33;
                        iM33 = i40;
                        arrayList2.add(new b7.r(strD, g0VarU, strD2, strD3, hVarH, hVarH2, j9, j10, j11, new t6.e(hVarE, wVarS, z11, z12, z13, ((int) cVarS.getLong(i37)) != 0, cVarS.getLong(i38), cVarS.getLong(i39), m1.f(cVarS.getBlob(i40))), i14, aVarR, j12, j13, j14, j15, z10, d0VarT, i22, i24, j16, i4, i29, strD4, boolValueOf));
                        iM32 = i39;
                        iM30 = i37;
                        iM = i16;
                        iM3 = i19;
                        iM16 = i18;
                        iM19 = i23;
                        iM20 = i25;
                        iM21 = i26;
                        iM22 = i10;
                        iM23 = i30;
                        iM13 = i13;
                        iM2 = i15;
                        iM26 = i33;
                        iM14 = i12;
                    }
                    return arrayList2;
                } finally {
                }
            case 23:
                d6.a aVar4 = (d6.a) obj;
                nk.k.e(aVar4, "_connection");
                cVarS = aVar4.S("SELECT * FROM workspec WHERE state=1");
                try {
                    int iM34 = ii.a.m(cVarS, FacebookMediationAdapter.KEY_ID);
                    int iM35 = ii.a.m(cVarS, "state");
                    int iM36 = ii.a.m(cVarS, "worker_class_name");
                    int iM37 = ii.a.m(cVarS, "input_merger_class_name");
                    int iM38 = ii.a.m(cVarS, "input");
                    int iM39 = ii.a.m(cVarS, "output");
                    int iM40 = ii.a.m(cVarS, "initial_delay");
                    int iM41 = ii.a.m(cVarS, "interval_duration");
                    int iM42 = ii.a.m(cVarS, "flex_duration");
                    int iM43 = ii.a.m(cVarS, "run_attempt_count");
                    int iM44 = ii.a.m(cVarS, "backoff_policy");
                    int iM45 = ii.a.m(cVarS, "backoff_delay_duration");
                    int iM46 = ii.a.m(cVarS, "last_enqueue_time");
                    int iM47 = ii.a.m(cVarS, "minimum_retention_duration");
                    int iM48 = ii.a.m(cVarS, "schedule_requested_at");
                    int iM49 = ii.a.m(cVarS, "run_in_foreground");
                    int iM50 = ii.a.m(cVarS, "out_of_quota_policy");
                    int iM51 = ii.a.m(cVarS, "period_count");
                    int iM52 = ii.a.m(cVarS, "generation");
                    int iM53 = ii.a.m(cVarS, "next_schedule_time_override");
                    int iM54 = ii.a.m(cVarS, "next_schedule_time_override_generation");
                    int iM55 = ii.a.m(cVarS, "stop_reason");
                    int iM56 = ii.a.m(cVarS, "trace_tag");
                    int iM57 = ii.a.m(cVarS, "backoff_on_system_interruptions");
                    int iM58 = ii.a.m(cVarS, "required_network_type");
                    int iM59 = ii.a.m(cVarS, "required_network_request");
                    int iM60 = ii.a.m(cVarS, "requires_charging");
                    int iM61 = ii.a.m(cVarS, "requires_device_idle");
                    int iM62 = ii.a.m(cVarS, "requires_battery_not_low");
                    int iM63 = ii.a.m(cVarS, "requires_storage_not_low");
                    int iM64 = ii.a.m(cVarS, "trigger_content_update_delay");
                    int iM65 = ii.a.m(cVarS, "trigger_max_content_delay");
                    int iM66 = ii.a.m(cVarS, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarS.P()) {
                        String strD5 = cVarS.D(iM34);
                        int i41 = iM47;
                        int i42 = iM46;
                        t6.g0 g0VarU2 = m1.u((int) cVarS.getLong(iM35));
                        String strD6 = cVarS.D(iM36);
                        String strD7 = cVarS.D(iM37);
                        byte[] blob2 = cVarS.getBlob(iM38);
                        t6.h hVar2 = t6.h.f34355b;
                        t6.h hVarH3 = jm.a.h(blob2);
                        t6.h hVarH4 = jm.a.h(cVarS.getBlob(iM39));
                        long j17 = cVarS.getLong(iM40);
                        long j18 = cVarS.getLong(iM41);
                        long j19 = cVarS.getLong(iM42);
                        int i43 = (int) cVarS.getLong(iM43);
                        int i44 = iM35;
                        int i45 = iM34;
                        t6.a aVarR2 = m1.r((int) cVarS.getLong(iM44));
                        long j20 = cVarS.getLong(iM45);
                        long j21 = cVarS.getLong(i42);
                        long j22 = cVarS.getLong(i41);
                        int i46 = iM48;
                        long j23 = cVarS.getLong(i46);
                        int i47 = iM36;
                        int i48 = iM49;
                        boolean z14 = ((int) cVarS.getLong(i48)) != 0;
                        iM49 = i48;
                        int i49 = iM50;
                        t6.d0 d0VarT2 = m1.t((int) cVarS.getLong(i49));
                        iM50 = i49;
                        int i50 = iM51;
                        int i51 = (int) cVarS.getLong(i50);
                        iM51 = i50;
                        int i52 = iM52;
                        int i53 = (int) cVarS.getLong(i52);
                        long j24 = cVarS.getLong(iM53);
                        int i54 = iM54;
                        int i55 = (int) cVarS.getLong(i54);
                        iM52 = i52;
                        iM54 = i54;
                        int i56 = iM55;
                        int i57 = (int) cVarS.getLong(i56);
                        int i58 = iM56;
                        String strD8 = cVarS.isNull(i58) ? null : cVarS.D(i58);
                        int i59 = iM57;
                        if (cVarS.isNull(i59)) {
                            i11 = i57;
                            iM56 = i58;
                            numValueOf2 = null;
                        } else {
                            i11 = i57;
                            iM56 = i58;
                            numValueOf2 = Integer.valueOf((int) cVarS.getLong(i59));
                        }
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        iM57 = i59;
                        iM55 = i56;
                        int i60 = iM58;
                        t6.w wVarS2 = m1.s((int) cVarS.getLong(i60));
                        int i61 = iM59;
                        c7.h hVarE2 = m1.E(cVarS.getBlob(i61));
                        iM58 = i60;
                        int i62 = iM60;
                        boolean z15 = ((int) cVarS.getLong(i62)) != 0;
                        iM59 = i61;
                        iM60 = i62;
                        int i63 = iM61;
                        boolean z16 = ((int) cVarS.getLong(i63)) != 0;
                        iM61 = i63;
                        int i64 = iM62;
                        boolean z17 = ((int) cVarS.getLong(i64)) != 0;
                        int i65 = iM63;
                        int i66 = iM64;
                        int i67 = iM65;
                        iM62 = i64;
                        int i68 = iM66;
                        iM66 = i68;
                        arrayList3.add(new b7.r(strD5, g0VarU2, strD6, strD7, hVarH3, hVarH4, j17, j18, j19, new t6.e(hVarE2, wVarS2, z15, z16, z17, ((int) cVarS.getLong(i65)) != 0, cVarS.getLong(i66), cVarS.getLong(i67), m1.f(cVarS.getBlob(i68))), i43, aVarR2, j20, j21, j22, j23, z14, d0VarT2, i51, i53, j24, i55, i11, strD8, boolValueOf2));
                        iM63 = i65;
                        iM64 = i66;
                        iM65 = i67;
                        iM47 = i41;
                        iM34 = i45;
                        iM35 = i44;
                        iM36 = i47;
                        iM48 = i46;
                        iM46 = i42;
                    }
                    return arrayList3;
                } finally {
                }
            case 24:
                d6.a aVar5 = (d6.a) obj;
                nk.k.e(aVar5, "_connection");
                cVarS = aVar5.S("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarS.P()) {
                        arrayList4.add(cVarS.D(0));
                    }
                    return arrayList4;
                } finally {
                }
            case 25:
                return c(obj);
            case 26:
                d6.a aVar6 = (d6.a) obj;
                nk.k.e(aVar6, "_connection");
                cVarS = aVar6.S("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i69 = cVarS.P() ? (int) cVarS.getLong(0) : 0;
                    cVarS.close();
                    return Integer.valueOf(i69);
                } finally {
                }
            case 27:
                d6.a aVar7 = (d6.a) obj;
                nk.k.e(aVar7, "_connection");
                cVarS = aVar7.S("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (cVarS.P()) {
                        z3 = ((int) cVarS.getLong(0)) != 0;
                    } else {
                        z3 = false;
                    }
                    cVarS.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 28:
                return d(obj);
            default:
                d6.a aVar8 = (d6.a) obj;
                nk.k.e(aVar8, "_connection");
                cVarS = aVar8.S("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    cVarS.P();
                    int iQ = m1.q(aVar8);
                    cVarS.close();
                    return Integer.valueOf(iQ);
                } finally {
                }
        }
    }
}
