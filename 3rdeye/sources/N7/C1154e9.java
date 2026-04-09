package N7;

import R4.a;
import android.os.Bundle;
import android.os.Parcel;
import android.util.JsonReader;
import androidx.datastore.preferences.protobuf.AbstractC1733k;
import com.android.billingclient.api.BillingResult;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.zipoapps.premiumhelper.e;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* renamed from: N7.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1154e9 implements l7.l, l7.g, a.InterfaceC0157a, MaxAdRevenueListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8166b;

    public /* synthetic */ C1154e9(int i) {
        this.f8166b = i;
    }

    public static int c(int i, int i10, int i11, int i12) {
        return AbstractC1733k.l(i) + i10 + i11 + i12;
    }

    public static BillingResult d(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static com.applovin.impl.l4 f(TimeUnit timeUnit, long j4, String str) {
        return com.applovin.impl.l4.a(str, Long.valueOf(timeUnit.toMillis(j4)));
    }

    public static IObjectWrapper g(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static Object h(zzbl zzblVar, int i, List list, int i10) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i10);
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String k(StringBuilder sb, boolean z10, char c10) {
        sb.append(z10);
        sb.append(c10);
        return sb.toString();
    }

    public static void l(Bundle bundle, String str) {
        bundle.putLong(str, zzv.zzD().currentTimeMillis());
    }

    public static void m(String str, String str2, com.applovin.impl.sdk.o oVar, String str3) {
        oVar.a(str3, str + str2);
    }

    public static void n(String str, String str2, String str3) {
        zzea.zzf(str3, str2.concat(String.valueOf(str)));
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f8166b) {
            case 7:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
        }
        return true;
    }

    @Override // R4.a.InterfaceC0157a
    public Object b(JsonReader jsonReader) throws IOException {
        switch (this.f8166b) {
            case 17:
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && strNextString2 != null && strNextString3 != null) {
                    return new Q4.C(strNextString, strNextString2, strNextString3);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" arch");
                }
                if (strNextString2 == null) {
                    sb.append(" libraryName");
                }
                if (strNextString3 == null) {
                    sb.append(" buildId");
                }
                throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
            default:
                return R4.a.a(jsonReader);
        }
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f8166b) {
            case 0:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                }
                break;
            case 2:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 3:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 4:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 5:
                if (((Double) obj).doubleValue() >= 0.0d) {
                }
                break;
            case 6:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                }
                break;
            case 7:
            case 10:
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 8:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 9:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 11:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 12:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 13:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 14:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        Bundle bundleQ = A9.I.q(ad);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        e.a.a().f37021k.l(bundleQ);
    }
}
