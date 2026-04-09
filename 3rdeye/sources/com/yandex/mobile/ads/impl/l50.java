package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import b9.C1992A;
import c9.C2097r;
import com.yandex.mobile.ads.impl.ks0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;

/* loaded from: classes3.dex */
public final class l50 {

    /* renamed from: a, reason: collision with root package name */
    private final lw1 f29878a;

    /* renamed from: b, reason: collision with root package name */
    private final zw1 f29879b;

    /* renamed from: c, reason: collision with root package name */
    private final e10 f29880c;

    /* renamed from: d, reason: collision with root package name */
    private final ks0 f29881d;

    /* renamed from: e, reason: collision with root package name */
    private final dc f29882e;

    /* renamed from: f, reason: collision with root package name */
    private final m50 f29883f;

    /* renamed from: g, reason: collision with root package name */
    private final cc f29884g;

    /* renamed from: h, reason: collision with root package name */
    private final j50 f29885h;

    public static final class a extends kotlin.jvm.internal.m implements p9.p<String, String, C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri.Builder f29887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri.Builder builder) {
            super(2);
            this.f29887c = builder;
        }

        @Override // p9.p
        public final C1992A invoke(String str, String str2) {
            String key = str;
            String str3 = str2;
            kotlin.jvm.internal.l.f(key, "key");
            l50 l50Var = l50.this;
            Uri.Builder builder = this.f29887c;
            l50Var.getClass();
            if (str3 != null && str3.length() != 0) {
                builder.appendQueryParameter(key, str3);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.p<String, String, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn1 f29888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cn1 cn1Var) {
            super(2);
            this.f29888b = cn1Var;
        }

        @Override // p9.p
        public final C1992A invoke(String str, String str2) {
            String key = str;
            kotlin.jvm.internal.l.f(key, "key");
            this.f29888b.a(key, str2);
            return C1992A.f18074a;
        }
    }

    public /* synthetic */ l50(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, new lw1(), new zw1(), new e10(0), ks0.a.a(context), new dc(), new n50());
    }

    public final void a(Context context, Uri.Builder builder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(builder, "builder");
        a(context, new a(builder));
    }

    public final void a(Context context, cn1 queryParams) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(queryParams, "queryParams");
        a(context, new b(queryParams));
    }

    private final void a(Context context, p9.p<? super String, ? super String, C1992A> pVar) {
        Location locationC;
        kotlin.jvm.internal.l.f(context, "context");
        String packageName = context.getPackageName();
        kotlin.jvm.internal.l.e(packageName, "getPackageName(...)");
        pVar.invoke(CommonUrlParts.APP_ID, packageName);
        pVar.invoke("app_version_code", ke.a(context));
        pVar.invoke(CommonUrlParts.APP_VERSION, ke.b(context));
        pVar.invoke("sdk_version", this.f29878a.a());
        pVar.invoke("sdk_version_name", this.f29878a.b());
        pVar.invoke("sdk_vendor", "yandex");
        pVar.invoke(this.f29883f.f(), this.f29880c.b(context));
        pVar.invoke(CommonUrlParts.LOCALE, this.f29880c.c(context));
        pVar.invoke("content_language", this.f29880c.a(context));
        List<String> listD = this.f29880c.d(context);
        pVar.invoke("device_languages", listD != null ? C2097r.u0(listD, StringUtils.COMMA, null, null, null, 62) : null);
        String strB = this.f29883f.b();
        this.f29880c.getClass();
        pVar.invoke(strB, e10.a());
        String strC = this.f29883f.c();
        this.f29880c.getClass();
        pVar.invoke(strC, Build.MODEL);
        String strA = this.f29883f.a();
        this.f29880c.getClass();
        pVar.invoke(strA, ConstantDeviceInfo.APP_PLATFORM);
        String strD = this.f29883f.d();
        this.f29880c.getClass();
        pVar.invoke(strD, Build.VERSION.RELEASE);
        Boolean boolC = ch1.c(context);
        if (boolC != null) {
            pVar.invoke("vpn_enabled", boolC.booleanValue() ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        }
        zw1 zw1Var = this.f29879b;
        zw1Var.getClass();
        if (!zw1Var.b(context) && (locationC = this.f29881d.c()) != null) {
            pVar.invoke("location_timestamp", String.valueOf(locationC.getTime()));
            pVar.invoke("lat", String.valueOf(locationC.getLatitude()));
            pVar.invoke("lon", String.valueOf(locationC.getLongitude()));
            pVar.invoke("precision", String.valueOf(Math.round(locationC.getAccuracy())));
        }
        zw1 zw1Var2 = this.f29879b;
        zw1Var2.getClass();
        if (zw1Var2.b(context)) {
            return;
        }
        pVar.invoke(this.f29883f.e(), this.f29885h.b());
        ec ecVarA = this.f29884g.a();
        boolean z10 = false;
        if (ecVarA != null) {
            boolean zB = ecVarA.b();
            String strA2 = ecVarA.a();
            this.f29882e.getClass();
            boolean z11 = (strA2 == null || strA2.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(strA2)) ? false : true;
            if (!zB && z11) {
                pVar.invoke("google_aid", strA2);
            }
        }
        ec ecVarC = this.f29884g.c();
        if (ecVarC != null) {
            boolean zB2 = ecVarC.b();
            String strA3 = ecVarC.a();
            this.f29882e.getClass();
            if (strA3 != null && strA3.length() != 0 && !"00000000-0000-0000-0000-000000000000".equals(strA3)) {
                z10 = true;
            }
            if (zB2 || !z10) {
                return;
            }
            pVar.invoke("huawei_oaid", strA3);
        }
    }

    public l50(Context context, C4072a3 adConfiguration, lw1 sdkVersionFormatter, zw1 sensitiveModeChecker, e10 deviceInfoProvider, ks0 locationManager, dc advertisingIdValidator, m50 environmentParametersProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sdkVersionFormatter, "sdkVersionFormatter");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(deviceInfoProvider, "deviceInfoProvider");
        kotlin.jvm.internal.l.f(locationManager, "locationManager");
        kotlin.jvm.internal.l.f(advertisingIdValidator, "advertisingIdValidator");
        kotlin.jvm.internal.l.f(environmentParametersProvider, "environmentParametersProvider");
        this.f29878a = sdkVersionFormatter;
        this.f29879b = sensitiveModeChecker;
        this.f29880c = deviceInfoProvider;
        this.f29881d = locationManager;
        this.f29882e = advertisingIdValidator;
        this.f29883f = environmentParametersProvider;
        this.f29884g = adConfiguration.e();
        this.f29885h = adConfiguration.k();
    }
}
