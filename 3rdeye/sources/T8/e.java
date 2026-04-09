package t8;

import com.zipoapps.premiumhelper.e;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;

/* compiled from: BaseTracker.kt */
/* loaded from: classes3.dex */
public class e {
    public static void a(InterfaceC5480a interfaceC5480a) {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<Boolean> PH_SEND_PERFORMANCE_EVENTS = i8.d.f38542V;
        l.e(PH_SEND_PERFORMANCE_EVENTS, "PH_SEND_PERFORMANCE_EVENTS");
        Object objH = eVarA.f37020j.h(PH_SEND_PERFORMANCE_EVENTS);
        l.e(objH, "get(...)");
        if (((Boolean) objH).booleanValue()) {
            interfaceC5480a.invoke();
        }
    }
}
