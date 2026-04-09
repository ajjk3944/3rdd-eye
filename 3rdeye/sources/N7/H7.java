package N7;

import R4.a;
import android.app.ActivityManager;
import android.util.JsonReader;
import androidx.camera.core.impl.U;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzgya;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.vungle.ads.internal.util.f;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H7 implements l7.l, l7.g, a.InterfaceC0157a, I4.d, f.a, FunctionWithThrowable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5395b;

    public /* synthetic */ H7(int i) {
        this.f5395b = i;
    }

    public static boolean c(androidx.camera.core.impl.D0 d02, U.a aVar) {
        return d02.getConfig().f(aVar);
    }

    public static void d(androidx.camera.core.impl.D0 d02, B.i iVar) {
        d02.getConfig().g(iVar);
    }

    public static U.b f(androidx.camera.core.impl.D0 d02, U.a aVar) {
        return d02.getConfig().w(aVar);
    }

    public static Set h(androidx.camera.core.impl.D0 d02, U.a aVar) {
        return d02.getConfig().x(aVar);
    }

    public static Set i(androidx.camera.core.impl.D0 d02) {
        return d02.getConfig().l();
    }

    public static Object j(androidx.camera.core.impl.D0 d02, U.a aVar) {
        return d02.getConfig().b(aVar);
    }

    public static Object k(androidx.camera.core.impl.D0 d02, U.a aVar, Object obj) {
        return d02.getConfig().o(aVar, obj);
    }

    public static Object l(androidx.camera.core.impl.D0 d02, U.a aVar, U.b bVar) {
        return d02.getConfig().j(aVar, bVar);
    }

    public static int m(int i, int i10, int i11) {
        return zzgya.zzD(i) + i10 + i11;
    }

    public static String n(int i, int i10, String str, String str2) {
        return str + i + str2 + i10;
    }

    public static String o(Class cls, String str) {
        return str + cls;
    }

    public static String p(StringBuilder sb, int i, char c10) {
        sb.append(i);
        sb.append(c10);
        return sb.toString();
    }

    public static JSONArray q(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static void r(int i, String str, String str2) {
        zzea.zzf(str2, str + i);
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f5395b) {
            case 4:
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

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        return io.appmetrica.analytics.impl.G2.a((ActivityManager) obj);
    }

    @Override // R4.a.InterfaceC0157a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte b10 = 0;
        int iNextInt = 0;
        List listD = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = R4.a.d(jsonReader, new C1154e9(18));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                case "importance":
                    iNextInt = jsonReader.nextInt();
                    b10 = (byte) (b10 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b10 == 1 && strNextString != null && listD != null) {
            return new Q4.Q(iNextInt, strNextString, listD);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" name");
        }
        if ((b10 & 1) == 0) {
            sb.append(" importance");
        }
        if (listD == null) {
            sb.append(" frames");
        }
        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f5395b) {
            case 0:
                if (((Long) obj).longValue() >= 0) {
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
            case 7:
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 5:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                }
                break;
            case 6:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 8:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 10:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 11:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 12:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 13:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 14:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                if (dDoubleValue3 <= 0.0d || dDoubleValue3 > 1.0d) {
                }
                break;
            case 15:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                if (dDoubleValue4 < 0.0d || dDoubleValue4 > 1.0d) {
                }
                break;
            case 16:
                if (((Long) obj).longValue() > 0) {
                }
                break;
        }
        return false;
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        switch (this.f5395b) {
            case 19:
                return TransportRegistrar.lambda$getComponents$2(tVar);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(tVar);
        }
    }

    @Override // com.vungle.ads.internal.util.f.a
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return com.vungle.ads.internal.util.f.m112objectInputStreamProvider$lambda0(inputStream);
    }
}
