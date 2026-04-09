package A8;

import T1.B;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import l8.b;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f131d;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f129b = i;
        this.f130c = obj;
        this.f131d = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        Enum enumValueOf;
        Object obj = this.f131d;
        int i = 0;
        Object obj2 = this.f130c;
        switch (this.f129b) {
            case 0:
                k kVar = (k) obj2;
                kVar.getClass();
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                ActivityC1762o activityC1762o = (ActivityC1762o) obj;
                e.a.a().f37025o.g(activityC1762o, B.j(activityC1762o), new i(i, kVar, activityC1762o));
                break;
            case 1:
                ((C4461a) obj2).t((String) obj, "user_status");
                break;
            case 2:
                ((StartupPerformanceTracker) obj2).f37059a = null;
                Bundle bundle = ((StartupPerformanceTracker.StartupData) obj).toBundle();
                a.b bVar = va.a.f47104a;
                bVar.o("PerformanceTracker");
                bVar.a(bundle.toString(), new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                C4461a c4461a = e.a.a().f37021k;
                c4461a.getClass();
                c4461a.r(c4461a.c("Performance_initialization", false, bundle));
                break;
            default:
                w8.i iVar = (w8.i) obj2;
                iVar.f47584d.c();
                l8.d<String> PH_HAPPY_MOMENT_CAPPING_TYPE = i8.d.f38580v;
                kotlin.jvm.internal.l.e(PH_HAPPY_MOMENT_CAPPING_TYPE, "PH_HAPPY_MOMENT_CAPPING_TYPE");
                l8.a aVar = iVar.f47582b;
                String str = PH_HAPPY_MOMENT_CAPPING_TYPE.f43924a;
                String str2 = PH_HAPPY_MOMENT_CAPPING_TYPE.f43925b;
                String str3 = (String) aVar.a(aVar, str, str2);
                try {
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
                    enumValueOf = Enum.valueOf(b.EnumC0492b.class, upperCase);
                    kotlin.jvm.internal.l.c(enumValueOf);
                } catch (IllegalArgumentException unused) {
                    va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
                    String upperCase2 = str2.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(upperCase2, "toUpperCase(...)");
                    enumValueOf = Enum.valueOf(b.EnumC0492b.class, upperCase2);
                }
                if (enumValueOf == b.EnumC0492b.GLOBAL) {
                    iVar.f47583c.n(Long.valueOf(System.currentTimeMillis()), "happy_moment_capping_timestamp");
                }
                ((InterfaceC5480a) obj).invoke();
                break;
        }
        return C1992A.f18074a;
    }
}
