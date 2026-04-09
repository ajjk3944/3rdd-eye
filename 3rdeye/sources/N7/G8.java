package N7;

import R4.a;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Range;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.U0;
import androidx.datastore.preferences.protobuf.AbstractC1733k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.datatransport.TransportRegistrar;
import com.singular.sdk.internal.Constants;
import j1.C5166b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class G8 implements l7.g, l7.l, a.InterfaceC0157a, v3.g, I4.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5375b;

    public /* synthetic */ G8(int i) {
        this.f5375b = i;
    }

    public static androidx.lifecycle.b0 c(androidx.lifecycle.f0 f0Var, kotlin.jvm.internal.e eVar, C5166b c5166b) {
        return f0Var.c(E.u.C(eVar), c5166b);
    }

    public static U0.b d(androidx.camera.core.impl.T0 t02) {
        return (U0.b) t02.b(androidx.camera.core.impl.T0.f14968D);
    }

    public static androidx.camera.core.impl.H0 f(androidx.camera.core.impl.T0 t02) {
        return (androidx.camera.core.impl.H0) t02.b(androidx.camera.core.impl.T0.f14971v);
    }

    public static androidx.camera.core.impl.H0 h(androidx.camera.core.impl.T0 t02) {
        return (androidx.camera.core.impl.H0) t02.o(androidx.camera.core.impl.T0.f14971v, null);
    }

    public static int i(androidx.camera.core.impl.T0 t02) {
        return ((Integer) t02.o(androidx.camera.core.impl.T0.f14969E, 0)).intValue();
    }

    public static H0.e j(androidx.camera.core.impl.T0 t02) {
        return (H0.e) t02.o(androidx.camera.core.impl.T0.f14973x, null);
    }

    public static int k(androidx.camera.core.impl.T0 t02) {
        return ((Integer) t02.o(androidx.camera.core.impl.T0.f14975z, 0)).intValue();
    }

    public static Range l(androidx.camera.core.impl.T0 t02, Range range) {
        return (Range) t02.o(androidx.camera.core.impl.T0.f14965A, range);
    }

    public static int m(androidx.camera.core.impl.T0 t02) {
        return ((Integer) t02.o(androidx.camera.core.impl.T0.f14970F, 0)).intValue();
    }

    public static boolean n(androidx.camera.core.impl.T0 t02) {
        return ((Boolean) t02.o(androidx.camera.core.impl.T0.f14967C, Boolean.FALSE)).booleanValue();
    }

    public static boolean o(androidx.camera.core.impl.T0 t02) {
        return ((Boolean) t02.o(androidx.camera.core.impl.T0.f14966B, Boolean.FALSE)).booleanValue();
    }

    public static int p(int i, int i10, int i11) {
        return AbstractC1733k.j(i) + i10 + i11;
    }

    public static String q(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String r(String str, int i, String str2, int i10, String str3) {
        return str + i + str2 + i10 + str3;
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static String t(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static StringBuilder u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f5375b) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 2) {
                }
                break;
            case 5:
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

    @Override // v3.g
    public Object apply(Object obj) {
        U4.a.f12467b.getClass();
        return R4.a.f11730a.a((Q4.f0) obj).getBytes(Charset.forName(Constants.ENCODING));
    }

    @Override // R4.a.InterfaceC0157a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    throw new NullPointerException("Null contents");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && bArrDecode != null) {
            return new Q4.F(strNextString, bArrDecode);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" filename");
        }
        if (bArrDecode == null) {
            sb.append(" contents");
        }
        throw new IllegalStateException(t(sb, "Missing required properties:"));
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f5375b) {
            case 1:
                if (((Long) obj).longValue() >= 0) {
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
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 6:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 7:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
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
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        return TransportRegistrar.lambda$getComponents$0(tVar);
    }
}
