package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.m;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z81 {

    /* renamed from: a, reason: collision with root package name */
    private final jr0 f36238a;

    /* renamed from: b, reason: collision with root package name */
    private final wg f36239b;

    /* renamed from: c, reason: collision with root package name */
    private final d82 f36240c;

    /* renamed from: d, reason: collision with root package name */
    private final ak0 f36241d;

    /* renamed from: e, reason: collision with root package name */
    private final b30 f36242e;

    /* renamed from: f, reason: collision with root package name */
    private final a10 f36243f;

    /* renamed from: g, reason: collision with root package name */
    private final s91 f36244g;

    /* renamed from: h, reason: collision with root package name */
    private final vx1 f36245h;
    private final qu0 i;

    /* renamed from: j, reason: collision with root package name */
    private final sa f36246j;

    public /* synthetic */ z81(Context context, mp1 mp1Var) {
        jr0 jr0Var = new jr0(mp1Var);
        this(context, mp1Var, jr0Var, new wg(context, mp1Var, jr0Var, 8), new d82(), new ak0(), new b30(mp1Var), new a10(), new s91(), new vx1(), new qu0(), new sa(mp1Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x00ec, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.p61 a(java.lang.String r51, com.yandex.mobile.ads.impl.qj r52) throws com.yandex.mobile.ads.impl.k61, org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.z81.a(java.lang.String, com.yandex.mobile.ads.impl.qj):com.yandex.mobile.ads.impl.p61");
    }

    public z81(Context context, mp1 reporter, jr0 linkJsonParser, wg assetsJsonParser, d82 urlJsonParser, ak0 impressionDataParser, b30 divKitDesignParser, a10 designJsonParser, s91 nativeResponseTypeParser, vx1 showNoticeTypeProvider, qu0 mediaAssetImageFallbackSizeParser, sa additionalInfoJsonParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(linkJsonParser, "linkJsonParser");
        kotlin.jvm.internal.l.f(assetsJsonParser, "assetsJsonParser");
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(impressionDataParser, "impressionDataParser");
        kotlin.jvm.internal.l.f(divKitDesignParser, "divKitDesignParser");
        kotlin.jvm.internal.l.f(designJsonParser, "designJsonParser");
        kotlin.jvm.internal.l.f(nativeResponseTypeParser, "nativeResponseTypeParser");
        kotlin.jvm.internal.l.f(showNoticeTypeProvider, "showNoticeTypeProvider");
        kotlin.jvm.internal.l.f(mediaAssetImageFallbackSizeParser, "mediaAssetImageFallbackSizeParser");
        kotlin.jvm.internal.l.f(additionalInfoJsonParser, "additionalInfoJsonParser");
        this.f36238a = linkJsonParser;
        this.f36239b = assetsJsonParser;
        this.f36240c = urlJsonParser;
        this.f36241d = impressionDataParser;
        this.f36242e = divKitDesignParser;
        this.f36243f = designJsonParser;
        this.f36244g = nativeResponseTypeParser;
        this.f36245h = showNoticeTypeProvider;
        this.i = mediaAssetImageFallbackSizeParser;
        this.f36246j = additionalInfoJsonParser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [b9.m$a] */
    public final tx1 a(JSONObject jsonShowNotice) throws k61, JSONException {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        ux1 ux1VarA;
        ux1 ux1Var;
        kotlin.jvm.internal.l.f(jsonShowNotice, "jsonShowNotice");
        if (a91.a(jsonShowNotice, "delay", ImagesContract.URL)) {
            try {
                objA = Long.valueOf(jsonShowNotice.getLong("delay"));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            Long l5 = (Long) objA;
            long jLongValue = l5 != null ? l5.longValue() : 0L;
            try {
                this.f36240c.getClass();
                objA2 = d82.a(ImagesContract.URL, jsonShowNotice);
            } catch (Throwable th2) {
                objA2 = b9.n.a(th2);
            }
            if (objA2 instanceof m.a) {
                objA2 = null;
            }
            String str = (String) objA2;
            try {
                objA3 = Double.valueOf(jsonShowNotice.optInt("visibilityPercent", 0));
            } catch (Throwable th3) {
                objA3 = b9.n.a(th3);
            }
            if (objA3 instanceof m.a) {
                objA3 = null;
            }
            Double d10 = (Double) objA3;
            double d11 = 0.0d;
            double dDoubleValue = d10 != null ? d10.doubleValue() : 0.0d;
            if (dDoubleValue >= 0.0d) {
                d11 = 100.0d;
                if (dDoubleValue <= 100.0d) {
                    d11 = dDoubleValue;
                }
            }
            int i = (int) d11;
            try {
                objA4 = jsonShowNotice.getString("type");
            } catch (Throwable th4) {
                objA4 = b9.n.a(th4);
            }
            if (objA4 instanceof m.a) {
                objA4 = null;
            }
            String str2 = (String) objA4;
            if (str2 != null) {
                try {
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
                    ux1VarA = ux1.valueOf(upperCase);
                } catch (Throwable th5) {
                    ux1VarA = b9.n.a(th5);
                }
                ux1Var = ux1VarA instanceof m.a ? null : ux1VarA;
            }
            if (ux1Var == null) {
                if (str != null) {
                    this.f36245h.getClass();
                    if (y9.q.b0(str, "/rtbcount/", false)) {
                        ux1Var = ux1.f34242c;
                    } else if (y9.q.b0(str, "/count/", false)) {
                        ux1Var = ux1.f34241b;
                    } else {
                        ux1Var = ux1.f34243d;
                    }
                    ux1Var = ux1Var;
                } else {
                    ux1Var = ux1.f34243d;
                }
            }
            return new tx1(i, jLongValue, ux1Var, str);
        }
        throw new k61("Native Ad json has not required attributes");
    }
}
