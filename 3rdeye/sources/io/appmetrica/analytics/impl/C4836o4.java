package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4836o4 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f41330a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f41331b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f41332c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f41333d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f41334e;

    /* renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f41335f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f41336g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f41337h;
    public final IdentifiersResult i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f41338j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f41339k;

    /* renamed from: l, reason: collision with root package name */
    public final long f41340l;

    /* renamed from: m, reason: collision with root package name */
    public final long f41341m;

    /* renamed from: n, reason: collision with root package name */
    public final C4842oa f41342n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f41343o;

    public C4836o4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j4, long j10, C4842oa c4842oa, Bundle bundle) {
        this.f41330a = identifiersResult;
        this.f41331b = identifiersResult2;
        this.f41332c = identifiersResult3;
        this.f41333d = identifiersResult4;
        this.f41334e = identifiersResult5;
        this.f41335f = identifiersResult6;
        this.f41336g = identifiersResult7;
        this.f41337h = identifiersResult8;
        this.i = identifiersResult9;
        this.f41338j = identifiersResult10;
        this.f41339k = identifiersResult11;
        this.f41340l = j4;
        this.f41341m = j10;
        this.f41342n = c4842oa;
        this.f41343o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f41330a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f41331b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f41332c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f41333d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f41334e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f41335f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f41336g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f41337h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f41338j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f41339k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f41340l);
        bundle.putLong("NextStartupTime", this.f41341m);
        C4842oa c4842oa = this.f41342n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, c4842oa);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", Ga.f39501F.o().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f41330a + ", mDeviceIdData=" + this.f41331b + ", mDeviceIdHashData=" + this.f41332c + ", mReportAdUrlData=" + this.f41333d + ", mGetAdUrlData=" + this.f41334e + ", mResponseClidsData=" + this.f41335f + ", mClientClidsForRequestData=" + this.f41336g + ", mGaidData=" + this.f41337h + ", mHoaidData=" + this.i + ", yandexAdvIdData=" + this.f41338j + ", customSdkHostsData=" + this.f41339k + ", mServerTimeOffset=" + this.f41340l + ", nextStartupTime=" + this.f41341m + ", features=" + this.f41342n + ", modulesConfig=" + this.f41343o + '}';
    }

    public static C4842oa a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C4842oa.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        C4842oa c4842oa = (C4842oa) parcelable;
        return c4842oa == null ? new C4842oa(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c4842oa;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static C4842oa a(Boolean bool) {
        boolean z10 = bool != null;
        return new C4842oa(bool, z10 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z10 ? null : "no identifier in startup state");
    }
}
