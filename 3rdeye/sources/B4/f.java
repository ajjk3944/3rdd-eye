package B4;

import I4.t;
import K1.i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.camera.core.impl.C0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import b9.C1992A;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import q5.e;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements e.a, OnFailureListener, I4.d, i.e, l7.l, l7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f499b;

    public /* synthetic */ f(int i) {
        this.f499b = i;
    }

    public static String c(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static boolean h(C0 c02) {
        Iterator it = c02.f(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f499b) {
            case 12:
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

    @Override // K1.i.e
    public void b(i.d dVar, K1.i iVar) {
        dVar.d(iVar);
    }

    @Override // q5.e.a
    public String d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f499b) {
            case 8:
                return ((Long) obj).longValue() >= 0;
            case 9:
                return ((Long) obj).longValue() >= 0;
            case 10:
                return ((Long) obj).longValue() >= 0;
            case 11:
                return ((Long) obj).longValue() >= 0;
            case 12:
            case 16:
            default:
                return ((Double) obj).doubleValue() > 0.0d;
            case 13:
                double dDoubleValue = ((Double) obj).doubleValue();
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 14:
                return ((Long) obj).longValue() >= 0;
            case 15:
                return ((Long) obj).longValue() >= 0;
            case 17:
                return Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", (String) obj);
            case 18:
                return ((Long) obj).longValue() >= 0;
            case 19:
                return ((Long) obj).longValue() >= 0;
            case 20:
                return ((Long) obj).longValue() >= 0;
            case 21:
                return ((Long) obj).longValue() >= 0;
            case 22:
                return ((Long) obj).longValue() >= 0;
            case 23:
                return ((Long) obj).longValue() >= 0;
            case 24:
                return ((Long) obj).longValue() > 0;
            case 25:
                long jLongValue = ((Long) obj).longValue();
                return jLongValue >= 0 && jLongValue <= 360;
            case 26:
                return ((Long) obj).longValue() >= 0;
            case 27:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 28:
                return ((Long) obj).longValue() >= 0;
        }
    }

    public void f(Bundle bundle) {
        if (bundle.getInt("RESULT") == 13627834) {
            int i = PHSettingsActivity.f37122d;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // I4.d
    public Object g(t tVar) {
        return ExecutorsRegistrar.f23246b.get();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        kotlin.jvm.internal.l.f(it, "it");
        a.b bVar = va.a.f47104a;
        bVar.o("PremiumHelper");
        bVar.d(it);
    }
}
