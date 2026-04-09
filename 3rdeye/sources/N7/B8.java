package N7;

import G.h;
import R4.a;
import android.telephony.SubscriptionManager;
import android.util.Base64;
import android.util.JsonReader;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.EnumC1722z;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.U;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.google.android.gms.internal.play_billing.zzby;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C4775ll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class B8 implements l7.l, l7.g, a.InterfaceC0157a, FunctionWithThrowable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4914b;

    public /* synthetic */ B8(int i) {
        this.f4914b = i;
    }

    public static void c(i7.k kVar, j6.d dVar) {
        if (dVar == null || dVar == j6.d.f42990m8) {
            return;
        }
        kVar.getSubscriptions().add(dVar);
    }

    public static void d(i7.k kVar) throws Exception {
        Iterator<T> it = kVar.getSubscriptions().iterator();
        while (it.hasNext()) {
            ((j6.d) it.next()).close();
        }
        kVar.getSubscriptions().clear();
    }

    public static void f(androidx.camera.core.impl.A a10, h.b bVar) {
        int i;
        EnumC1722z enumC1722zD = a10.d();
        if (enumC1722zD == EnumC1722z.UNKNOWN) {
            return;
        }
        int i10 = h.a.f1819a[enumC1722zD.ordinal()];
        if (i10 == 1) {
            i = 0;
        } else if (i10 == 2) {
            i = 32;
        } else {
            if (i10 != 3) {
                C.S.g("ExifData", "Unknown flash state: " + enumC1722zD);
                return;
            }
            i = 1;
        }
        int i11 = i & 1;
        ArrayList arrayList = bVar.f1824a;
        if (i11 == 1) {
            bVar.c("LightSource", String.valueOf(4), arrayList);
        }
        bVar.c("Flash", String.valueOf(i), arrayList);
    }

    public static int g(float f10, int i, int i10) {
        return (Float.floatToIntBits(f10) + i) * i10;
    }

    public static int h(int i, int i10, int i11) {
        return zzby.zzw(i) + i10 + i11;
    }

    public static String i(String str, ComponentCallbacksC1759l componentCallbacksC1759l, String str2) {
        return str + componentCallbacksC1759l + str2;
    }

    public static String j(StringBuilder sb, String str, char c10) {
        sb.append(str);
        sb.append(c10);
        return sb.toString();
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void l(int i, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i10));
    }

    public static C1717u0 m(androidx.camera.core.impl.U u8, androidx.camera.core.impl.U u10) {
        if (u8 == null && u10 == null) {
            return C1717u0.f15117I;
        }
        C1710q0 c1710q0L = u10 != null ? C1710q0.L(u10) : C1710q0.K();
        if (u8 != null) {
            Iterator<U.a<?>> it = u8.l().iterator();
            while (it.hasNext()) {
                n(c1710q0L, u10, u8, it.next());
            }
        }
        return C1717u0.J(c1710q0L);
    }

    public static void n(C1710q0 c1710q0, androidx.camera.core.impl.U u8, androidx.camera.core.impl.U u10, U.a aVar) {
        if (!Objects.equals(aVar, InterfaceC1698k0.f15082t)) {
            c1710q0.M(aVar, u10.w(aVar), u10.b(aVar));
            return;
        }
        Q.b bVar = (Q.b) u10.o(aVar, null);
        Q.b bVar2 = (Q.b) u8.o(aVar, null);
        U.b bVarW = u10.w(aVar);
        if (bVar == null) {
            bVar = bVar2;
        } else if (bVar2 != null) {
            Q.a aVar2 = bVar.f10850a;
            if (aVar2 == null) {
                aVar2 = bVar2.f10850a;
            }
            Q.c cVar = bVar.f10851b;
            if (cVar == null) {
                cVar = bVar2.f10851b;
            }
            bVar2 = new Q.b(aVar2, cVar);
            bVar = bVar2;
        }
        c1710q0.M(aVar, bVarW, bVar);
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f4914b) {
            case 3:
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
        return C4775ll.a((SubscriptionManager) obj);
    }

    @Override // R4.a.InterfaceC0157a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        long jNextLong = 0;
        long jNextLong2 = 0;
        String str = null;
        String str2 = null;
        byte b10 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    str = strNextString;
                    break;
                case "size":
                    b10 = (byte) (b10 | 2);
                    jNextLong2 = jsonReader.nextLong();
                    break;
                case "uuid":
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), Q4.f0.f11202a);
                    break;
                case "baseAddress":
                    b10 = (byte) (b10 | 1);
                    jNextLong = jsonReader.nextLong();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b10 == 3 && str != null) {
            return new Q4.N(jNextLong, str, str2, jNextLong2);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb.append(" size");
        }
        if (str == null) {
            sb.append(" name");
        }
        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f4914b) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                }
                break;
            case 1:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                }
                break;
            case 2:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 3:
            case 8:
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 4:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                }
                break;
            case 5:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 6:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                if (dDoubleValue4 < 0.0d || dDoubleValue4 > 1.0d) {
                }
                break;
            case 7:
                if (((Long) obj).longValue() > 0) {
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
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 14:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 15:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 16:
                if (((Long) obj).longValue() > 0) {
                }
                break;
        }
        return false;
    }
}
