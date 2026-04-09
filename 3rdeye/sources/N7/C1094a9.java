package N7;

import Q4.W;
import R4.a;
import android.util.JsonReader;
import androidx.camera.core.impl.InterfaceC1694i0;
import com.applovin.mediation.MaxAdListener;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.protobuf.AbstractC4029l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: N7.a9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1094a9 implements l7.l, l7.g, a.InterfaceC0157a, I4.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7899b;

    public /* synthetic */ C1094a9(int i) {
        this.f7899b = i;
    }

    public static C.C c(androidx.camera.core.impl.T0 t02) {
        C.C c10 = (C.C) t02.o(InterfaceC1694i0.f15058k, C.C.f615c);
        c10.getClass();
        return c10;
    }

    public static int d(int i, int i10, int i11, int i12) {
        return ((i * i10) / i11) + i12;
    }

    public static String f(StringBuilder sb, long j4, String str) {
        sb.append(j4);
        sb.append(str);
        return sb.toString();
    }

    public static String h(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ String i(CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append((CharSequence) StringUtils.COMMA);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static void j(zzfy zzfyVar, String str) {
        zzfyVar.zzay().zzj().zza(str);
    }

    public static void k(StringBuilder sb, int i, String str, int i10, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i10);
        sb.append(str2);
    }

    public static void l(StringBuilder sb, MaxAdListener maxAdListener, com.applovin.impl.sdk.o oVar, String str) {
        sb.append(maxAdListener);
        oVar.a(str, sb.toString());
    }

    public static int m(int i, int i10, int i11, int i12) {
        return zzjl.zzA(i) + i10 + i11 + i12;
    }

    public static int n(int i, int i10, int i11, int i12) {
        return AbstractC4029l.computeUInt32SizeNoTag(i) + i10 + i11 + i12;
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f7899b) {
            case 2:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 6:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 8:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 14:
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
        W.a aVar = new W.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null parameterKey");
                    }
                    aVar.f11131b = strNextString;
                    break;
                case "templateVersion":
                    aVar.f11133d = jsonReader.nextLong();
                    aVar.f11134e = (byte) (aVar.f11134e | 1);
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null variantId");
                            }
                        } else if (strNextName2.equals("rolloutId")) {
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null rolloutId");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString2 != null && strNextString3 != null) {
                        aVar.f11130a = new Q4.X(strNextString2, strNextString3);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (strNextString2 == null) {
                            sb.append(" rolloutId");
                        }
                        if (strNextString3 == null) {
                            sb.append(" variantId");
                        }
                        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
                    }
                case "parameterValue":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null parameterValue");
                    }
                    aVar.f11132c = strNextString4;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f7899b) {
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
            case 6:
            case 8:
            default:
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue <= 0 || jLongValue > 100) {
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
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 7:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 10:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
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
        }
        return false;
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        return TransportRegistrar.lambda$getComponents$1(tVar);
    }
}
