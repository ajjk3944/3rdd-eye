package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Ul implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C4975te f40255a;

    /* renamed from: b, reason: collision with root package name */
    public final Cd f40256b;

    /* renamed from: c, reason: collision with root package name */
    public final C4482ac f40257c = new C4482ac();

    public Ul(C4975te c4975te, Cd cd) {
        this.f40255a = c4975te;
        this.f40256b = cd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, Yl yl) {
        C5102yg c5102yg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.DEVICE_ID), yl.getDeviceId());
        a(builder, Ga.f39501F.g(), this.f40257c);
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.APP_SET_ID), yl.getAppSetId());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.APP_SET_ID_SCOPE), yl.getAppSetIdScope());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.APP_PLATFORM), yl.getAppPlatform());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.PROTOCOL_VERSION), yl.getProtocolVersion());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), yl.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.MODEL), yl.getModel());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.MANUFACTURER), yl.getManufacturer());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.OS_VERSION), yl.getOsVersion());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(yl.getScreenWidth()));
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(yl.getScreenHeight()));
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(yl.getScreenDpi()));
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(yl.getScaleFactor()));
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.LOCALE), yl.getLocale());
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.DEVICE_TYPE), yl.getDeviceType());
        builder.appendQueryParameter(this.f40255a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("query_hosts"), String.valueOf(2));
        String strA = this.f40255a.a("features");
        List<String> listH = ((C5031vk) this.f40256b).h();
        String[] strArr = {this.f40255a.a("permissions_collecting"), this.f40255a.a("features_collecting"), this.f40255a.a("google_aid"), this.f40255a.a("huawei_oaid"), this.f40255a.a("sim_info"), this.f40255a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.APP_ID), yl.getPackageName());
        builder.appendQueryParameter(this.f40255a.a("app_debuggable"), ((C4631g6) yl).f40928a);
        if (yl.f40442l) {
            String str = yl.f40443m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f40255a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f40255a.a("detect_locale"), String.valueOf(1));
        }
        N3 n32 = yl.i;
        if (!AbstractC4623fo.a(n32.f39888a)) {
            builder.appendQueryParameter(this.f40255a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f40255a.a("clids_set"), Dm.a(n32.f39888a));
            int iOrdinal = n32.f39889b.ordinal();
            builder.appendQueryParameter(this.f40255a.a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = yl.f40437f;
            String str3 = yl.f40438g;
            if (TextUtils.isEmpty(str2) && (c5102yg = yl.f40445o.f41972b) != null) {
                str2 = c5102yg.f42142a;
                str3 = c5102yg.f42145d.f42081a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f40255a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f40255a.a("install_referrer_source"), str3);
            }
        }
        String uuid = yl.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f40255a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("app_system_flag"), ((C4631g6) yl).f40929b);
        builder.appendQueryParameter(this.f40255a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f40255a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((C5031vk) this.f40256b).d();
        for (String str4 : mapD.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapD.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C4482ac c4482ac) {
        c4482ac.getClass();
        AdvertisingIdsHolder identifiers = Ga.f39501F.b().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForReporter()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f40255a.a("oaid"), "");
            } else {
                builder.appendQueryParameter(this.f40255a.a("oaid"), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f40255a.a("oaid"), "");
        builder.appendQueryParameter(this.f40255a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
