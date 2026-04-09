package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4745kh implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f41143a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f41144b;

    /* renamed from: c, reason: collision with root package name */
    public E7 f41145c;

    /* renamed from: d, reason: collision with root package name */
    public final C4482ac f41146d;

    /* renamed from: e, reason: collision with root package name */
    public long f41147e;

    public C4745kh(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new C4482ac());
    }

    public final void a(E7 e72) {
        this.f41145c = e72;
    }

    public C4745kh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, C4482ac c4482ac) {
        this.f41143a = advIdWithLimitedAppender;
        this.f41144b = networkTaskForSendingDataParamsAppender;
        this.f41146d = c4482ac;
    }

    public final void a(long j4) {
        this.f41147e = j4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C5028vh c5028vh) {
        builder.path("report");
        this.f41144b.appendEncryptedData(builder);
        E7 e72 = this.f41145c;
        if (e72 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(e72.f39338a, c5028vh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f41145c.f39339b, c5028vh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f41145c.f39340c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f41145c.f39343f, c5028vh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f41145c.f39345h, c5028vh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f41145c.i, c5028vh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f41145c.f39346j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f41145c.f39341d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f41145c.f39342e);
            a(builder, "app_debuggable", this.f41145c.f39344g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f41145c.f39347k, c5028vh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f41145c.f39348l, c5028vh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f41145c.f39349m, c5028vh.getAppFramework()));
            a(builder, "attribution_id", this.f41145c.f39350n);
        }
        builder.appendQueryParameter("api_key_128", c5028vh.f41869m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c5028vh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c5028vh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c5028vh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c5028vh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c5028vh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c5028vh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c5028vh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c5028vh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c5028vh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c5028vh.f41872p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c5028vh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c5028vh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f41143a;
        this.f41146d.getClass();
        advIdWithLimitedAppender.appendParams(builder, Ga.f39501F.b().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f41147e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
