package com.yandex.mobile.ads.impl;

import b9.m;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qu1 implements br1<du1> {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f32347a;

    /* renamed from: b, reason: collision with root package name */
    private final br1<String> f32348b;

    /* renamed from: c, reason: collision with root package name */
    private final n32 f32349c;

    /* renamed from: d, reason: collision with root package name */
    private final h50 f32350d;

    /* renamed from: e, reason: collision with root package name */
    private final al f32351e;

    /* renamed from: f, reason: collision with root package name */
    private final b60 f32352f;

    /* renamed from: g, reason: collision with root package name */
    private final pa f32353g;

    /* renamed from: h, reason: collision with root package name */
    private final g6 f32354h;

    public qu1(mp1 reporter, br1<String> stringResponseParser, n32 systemCurrentTimeProvider, h50 encryptionParametersParser, al biddingSettingsDataParser, b60 exclusionRulesJsonConverter, pa adaptiveValidationRulesConverter, g6 adQualityAdVerificationConfigurationJsonConverter) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(stringResponseParser, "stringResponseParser");
        kotlin.jvm.internal.l.f(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        kotlin.jvm.internal.l.f(encryptionParametersParser, "encryptionParametersParser");
        kotlin.jvm.internal.l.f(biddingSettingsDataParser, "biddingSettingsDataParser");
        kotlin.jvm.internal.l.f(exclusionRulesJsonConverter, "exclusionRulesJsonConverter");
        kotlin.jvm.internal.l.f(adaptiveValidationRulesConverter, "adaptiveValidationRulesConverter");
        kotlin.jvm.internal.l.f(adQualityAdVerificationConfigurationJsonConverter, "adQualityAdVerificationConfigurationJsonConverter");
        this.f32347a = reporter;
        this.f32348b = stringResponseParser;
        this.f32349c = systemCurrentTimeProvider;
        this.f32350d = encryptionParametersParser;
        this.f32351e = biddingSettingsDataParser;
        this.f32352f = exclusionRulesJsonConverter;
        this.f32353g = adaptiveValidationRulesConverter;
        this.f32354h = adQualityAdVerificationConfigurationJsonConverter;
    }

    private static Integer a(String str, JSONObject jSONObject) {
        Object objA;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            objA = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        return (Integer) (objA instanceof m.a ? null : objA);
    }

    private static Long a(JSONObject jsonObject) {
        Long l5;
        Object objOpt;
        Object objA;
        iq0 iq0Var = iq0.f28836a;
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        if (!jsonObject.has("ad_blocker_status_validity_duration") || (objOpt = jsonObject.opt("ad_blocker_status_validity_duration")) == null) {
            l5 = null;
        } else {
            iq0 iq0Var2 = iq0.f28836a;
            String strValueOf = String.valueOf(objOpt);
            iq0Var2.getClass();
            try {
                objA = Long.valueOf(Long.parseLong(strValueOf));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            l5 = (Long) objA;
        }
        if (l5 != null) {
            return Long.valueOf(l5.longValue() * 1000);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:73|6|(1:8)(1:11)|12|(1:14)(1:15)|16|(1:18)(1:20)|19|21|(1:23)(1:24)|25|(1:34)(23:29|(0)(1:32)|35|71|36|37|40|(1:42)|43|69|44|45|48|(1:50)(1:51)|52|(1:54)(1:55)|56|(1:58)(1:59)|60|(1:62)|63|64|75)|33|35|71|36|37|40|(0)|43|69|44|45|48|(0)(0)|52|(0)(0)|56|(0)(0)|60|(0)|63|64|75) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0276, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0277, code lost:
    
        r0 = b9.n.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0290, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0291, code lost:
    
        r0 = b9.n.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b0 A[Catch: JSONException -> 0x0069, TryCatch #2 {JSONException -> 0x0069, blocks: (B:6:0x001c, B:8:0x005f, B:12:0x006e, B:14:0x00b8, B:16:0x00c3, B:18:0x0108, B:21:0x0115, B:23:0x018c, B:25:0x0195, B:27:0x01a4, B:29:0x01ac, B:32:0x01c7, B:35:0x01d6, B:40:0x027c, B:43:0x0281, B:48:0x0296, B:52:0x029d, B:54:0x02b0, B:56:0x02c0, B:58:0x02d0, B:60:0x02e0, B:62:0x0344, B:63:0x0346, B:47:0x0291, B:39:0x0277, B:44:0x0283, B:36:0x026a), top: B:73:0x001c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0 A[Catch: JSONException -> 0x0069, TryCatch #2 {JSONException -> 0x0069, blocks: (B:6:0x001c, B:8:0x005f, B:12:0x006e, B:14:0x00b8, B:16:0x00c3, B:18:0x0108, B:21:0x0115, B:23:0x018c, B:25:0x0195, B:27:0x01a4, B:29:0x01ac, B:32:0x01c7, B:35:0x01d6, B:40:0x027c, B:43:0x0281, B:48:0x0296, B:52:0x029d, B:54:0x02b0, B:56:0x02c0, B:58:0x02d0, B:60:0x02e0, B:62:0x0344, B:63:0x0346, B:47:0x0291, B:39:0x0277, B:44:0x0283, B:36:0x026a), top: B:73:0x001c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0344 A[Catch: JSONException -> 0x0069, TryCatch #2 {JSONException -> 0x0069, blocks: (B:6:0x001c, B:8:0x005f, B:12:0x006e, B:14:0x00b8, B:16:0x00c3, B:18:0x0108, B:21:0x0115, B:23:0x018c, B:25:0x0195, B:27:0x01a4, B:29:0x01ac, B:32:0x01c7, B:35:0x01d6, B:40:0x027c, B:43:0x0281, B:48:0x0296, B:52:0x029d, B:54:0x02b0, B:56:0x02c0, B:58:0x02d0, B:60:0x02e0, B:62:0x0344, B:63:0x0346, B:47:0x0291, B:39:0x0277, B:44:0x0283, B:36:0x026a), top: B:73:0x001c, inners: #0, #1 }] */
    @Override // com.yandex.mobile.ads.impl.br1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.du1 a(com.yandex.mobile.ads.impl.qq1 r90) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qu1.a(com.yandex.mobile.ads.impl.qq1):java.lang.Object");
    }
}
