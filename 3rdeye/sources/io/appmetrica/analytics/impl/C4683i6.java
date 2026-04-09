package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4683i6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C4683i6> CREATOR = new C4657h6();

    /* renamed from: a, reason: collision with root package name */
    protected String f41044a;

    /* renamed from: b, reason: collision with root package name */
    protected String f41045b;

    /* renamed from: c, reason: collision with root package name */
    public String f41046c;

    /* renamed from: d, reason: collision with root package name */
    public int f41047d;

    /* renamed from: e, reason: collision with root package name */
    public int f41048e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f41049f;

    /* renamed from: g, reason: collision with root package name */
    public int f41050g;

    /* renamed from: h, reason: collision with root package name */
    public String f41051h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f41052j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC5046wa f41053k;

    /* renamed from: l, reason: collision with root package name */
    public E9 f41054l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f41055m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f41056n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f41057o;

    /* renamed from: p, reason: collision with root package name */
    public Map f41058p;

    public C4683i6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f41049f == null) {
            this.f41049f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f41049f;
    }

    public final void c(Bundle bundle) {
        this.f41055m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f41052j;
    }

    public final String f() {
        return this.f41046c;
    }

    public final EnumC5046wa g() {
        return this.f41053k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f41050g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f41048e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f41058p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f41044a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f41047d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f41045b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f41045b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f41057o;
    }

    public final Bundle i() {
        return this.f41055m;
    }

    public final String j() {
        return this.f41051h;
    }

    public final E9 k() {
        return this.f41054l;
    }

    public final boolean l() {
        return this.f41044a == null;
    }

    public final boolean m() {
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        return -1 == this.f41047d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.f41050g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.f41048e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f41058p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f41044a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.f41047d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f41045b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f41045b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f41044a;
        String str2 = EnumC4997ub.a(this.f41047d).f41759b;
        String strSubstring = this.f41045b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return B4.f.c(j6.l.d("[event: ", str, ", type: ", str2, ", value: "), strSubstring, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f41044a);
        bundle.putString("CounterReport.Value", this.f41045b);
        bundle.putInt("CounterReport.Type", this.f41047d);
        bundle.putInt("CounterReport.CustomType", this.f41048e);
        bundle.putInt("CounterReport.TRUNCATED", this.f41050g);
        bundle.putString("CounterReport.ProfileID", this.f41051h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f41053k.f41966a);
        Bundle bundle2 = this.f41055m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f41046c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f41049f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f41052j);
        E9 e92 = this.f41054l;
        if (e92 != null) {
            bundle.putInt("CounterReport.Source", e92.f39363a);
        }
        Boolean bool = this.f41056n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f41057o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f41058p));
        parcel.writeBundle(bundle);
    }

    public C4683i6(String str, int i) {
        this("", str, i);
    }

    public static C4683i6 e(C4683i6 c4683i6) {
        return a(c4683i6, EnumC4997ub.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f41046c = str;
    }

    public void c(String str) {
        this.f41051h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C4683i6(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    public final void a(long j4) {
        this.i = j4;
    }

    public final void b(long j4) {
        this.f41052j = j4;
    }

    public final Boolean c() {
        return this.f41056n;
    }

    public C4683i6(String str, String str2, int i, SystemTimeProvider systemTimeProvider) {
        this.f41053k = EnumC5046wa.UNKNOWN;
        this.f41058p = new HashMap();
        this.f41044a = str2;
        this.f41047d = i;
        this.f41045b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.f41052j = systemTimeProvider.currentTimeMillis();
    }

    public static C4683i6 b(Bundle bundle) {
        if (bundle != null) {
            try {
                C4683i6 c4683i6 = (C4683i6) bundle.getParcelable("CounterReport.Object");
                if (c4683i6 != null) {
                    return c4683i6;
                }
            } catch (Throwable unused) {
                return new C4683i6("", 0);
            }
        }
        return new C4683i6("", 0);
    }

    public static C4683i6 c(C4683i6 c4683i6) {
        return a(c4683i6, EnumC4997ub.EVENT_TYPE_INIT);
    }

    public static C4683i6 d(C4683i6 c4683i6) {
        C4683i6 c4683i62 = new C4683i6("", 0);
        c4683i62.f41052j = c4683i6.f41052j;
        c4683i62.i = c4683i6.i;
        c4683i62.f41049f = c4683i6.f41049f;
        c4683i62.f41046c = c4683i6.f41046c;
        c4683i62.f41055m = c4683i6.f41055m;
        c4683i62.f41058p = c4683i6.f41058p;
        c4683i62.f41051h = c4683i6.f41051h;
        return c4683i62;
    }

    public final void a(EnumC5046wa enumC5046wa) {
        this.f41053k = enumC5046wa;
    }

    public final void a(E9 e92) {
        this.f41054l = e92;
    }

    public final void a(Boolean bool) {
        this.f41056n = bool;
    }

    public final void a(Integer num) {
        this.f41057o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static C4683i6 b(C4683i6 c4683i6) {
        return a(c4683i6, EnumC4997ub.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C4683i6 a(C4683i6 c4683i6, EnumC4997ub enumC4997ub) {
        C4683i6 c4683i6D = d(c4683i6);
        c4683i6D.f41047d = enumC4997ub.f41758a;
        return c4683i6D;
    }

    public static C4683i6 a(C4683i6 c4683i6) {
        return a(c4683i6, EnumC4997ub.EVENT_TYPE_ALIVE);
    }

    public static C4683i6 a(C4683i6 c4683i6, C4609fa c4609fa) {
        C4683i6 c4683i6A = a(c4683i6, EnumC4997ub.EVENT_TYPE_START);
        c4683i6A.setValueBytes(MessageNano.toByteArray(new H9().fromModel(new G9((String) c4609fa.f40848b.a()))));
        c4683i6A.f41052j = c4683i6.f41052j;
        c4683i6A.i = c4683i6.i;
        return c4683i6A;
    }

    public static C4683i6 a(C4683i6 c4683i6, Collection<PermissionState> collection, J2 j22, C4679i2 c4679i2, List<String> list) {
        String string;
        String str;
        C4683i6 c4683i6D = d(c4683i6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put(AppMeasurementSdk.ConditionalUserProperty.NAME, permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (j22 != null) {
                jSONObject.put("background_restricted", j22.f39668b);
                I2 i22 = j22.f39667a;
                c4679i2.getClass();
                if (i22 != null) {
                    switch (i22) {
                        case EXEMPTED:
                            str = "EXEMPTED";
                            break;
                        case ACTIVE:
                            str = "ACTIVE";
                            break;
                        case WORKING_SET:
                            str = "WORKING_SET";
                            break;
                        case FREQUENT:
                            str = "FREQUENT";
                            break;
                        case RARE:
                            str = "RARE";
                            break;
                        case RESTRICTED:
                            str = "RESTRICTED";
                            break;
                        case UNKNOWN:
                            str = "UNKNOWN";
                            break;
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6D.f41047d = 12288;
        c4683i6D.setValue(string);
        return c4683i6D;
    }

    public static C4683i6 a(C4683i6 c4683i6, String str) {
        C4683i6 c4683i6D = d(c4683i6);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6D.f41047d = 12289;
        c4683i6D.setValue(str);
        return c4683i6D;
    }

    public static C4683i6 a() {
        C4683i6 c4683i6 = new C4683i6("", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 16384;
        return c4683i6;
    }

    public static C4683i6 a(Rf rf) {
        String currencyCode = "";
        int i = 0;
        C4683i6 c4683i6 = new C4683i6("", "", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 40976;
        ProductInfo productInfo = rf.f40063a;
        Wi wi = new Wi();
        wi.f40347a = productInfo.quantity;
        wi.f40352f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        wi.f40348b = currencyCode.getBytes();
        wi.f40349c = productInfo.sku.getBytes();
        Ri ri = new Ri();
        ri.f40068a = productInfo.purchaseOriginalJson.getBytes();
        ri.f40069b = productInfo.signature.getBytes();
        wi.f40351e = ri;
        wi.f40353g = true;
        wi.f40354h = 1;
        wi.i = Qf.f40016a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        Vi vi = new Vi();
        vi.f40294a = productInfo.purchaseToken.getBytes();
        vi.f40295b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        wi.f40355j = vi;
        if (productInfo.type == ProductType.SUBS) {
            Ui ui = new Ui();
            ui.f40245a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                Ti ti = new Ti();
                ti.f40190a = period.number;
                int i10 = Qf.f40017b[period.timeUnit.ordinal()];
                ti.f40191b = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 0 : 4 : 3 : 2 : 1;
                ui.f40246b = ti;
            }
            Si si = new Si();
            si.f40121a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                Ti ti2 = new Ti();
                ti2.f40190a = period2.number;
                int i11 = Qf.f40017b[period2.timeUnit.ordinal()];
                if (i11 == 1) {
                    i = 1;
                } else if (i11 == 2) {
                    i = 2;
                } else if (i11 == 3) {
                    i = 3;
                } else if (i11 == 4) {
                    i = 4;
                }
                ti2.f40191b = i;
                si.f40122b = ti2;
            }
            si.f40123c = productInfo.introductoryPriceCycles;
            ui.f40247c = si;
            wi.f40356k = ui;
        }
        c4683i6.setValueBytes(MessageNano.toByteArray(wi));
        return c4683i6;
    }

    public static C4683i6 a(String str) {
        C4683i6 c4683i6 = new C4683i6("", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 12320;
        c4683i6.f41045b = str;
        c4683i6.f41054l = E9.JS;
        return c4683i6;
    }
}
