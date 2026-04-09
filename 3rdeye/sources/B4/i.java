package B4;

import I0.b;
import I4.t;
import K1.i;
import android.content.Context;
import android.view.ViewGroup;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import java.util.List;
import k8.F;
import org.json.JSONObject;
import q5.e;
import y7.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements e.a, b.c, InterfaceC4391a.InterfaceC0459a, I4.d, i.e, y7.k, l7.l, l7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f502b;

    public /* synthetic */ i(int i) {
        this.f502b = i;
    }

    public static String i(D7.f fVar, String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
        kotlin.jvm.internal.l.f(fVar, str);
        kotlin.jvm.internal.l.f(jSONObject, str2);
        Object objJ = F.j("type", jSONObject2);
        if (objJ == null) {
            throw z7.e.g("type", jSONObject2);
        }
        try {
            return (String) objJ;
        } catch (ClassCastException unused) {
            throw z7.e.l(jSONObject2, "type", objJ);
        } catch (Exception e4) {
            throw z7.e.f(jSONObject2, "type", objJ, e4);
        }
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f502b) {
            case 13:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 18:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 22:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 27:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 2) {
                }
                break;
        }
        return true;
    }

    @Override // K1.i.e
    public void b(i.d dVar, K1.i iVar) {
        dVar.g(iVar);
    }

    @Override // y7.k
    public x.a c(ViewGroup viewGroup, B.f fVar, B.f fVar2) {
        return new y7.j(viewGroup, fVar, fVar2);
    }

    @Override // q5.e.a
    public String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f502b) {
            case 7:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 8:
            case 13:
            case 18:
            case 22:
            default:
                if (((Double) obj).doubleValue() >= 0.0d) {
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
            case 14:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 15:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 16:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 17:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 19:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                }
                break;
            case 20:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                }
                break;
            case 21:
                if (((Double) obj).doubleValue() > 0.0d) {
                }
                break;
            case 23:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 24:
                if (((Double) obj).doubleValue() > 0.0d) {
                }
                break;
            case 25:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                }
                break;
            case 26:
                if (((Double) obj).doubleValue() >= 0.0d) {
                }
                break;
        }
        return false;
    }

    @Override // I0.b.c
    public boolean f() {
        return true;
    }

    @Override // I4.d
    public Object g(t tVar) {
        return ExecutorsRegistrar.f23245a.get();
    }

    @Override // g5.InterfaceC4391a.InterfaceC0459a
    public void h(InterfaceC4392b interfaceC4392b) {
    }
}
