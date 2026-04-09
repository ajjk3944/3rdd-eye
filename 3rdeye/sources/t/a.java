package T;

import C.S;
import K4.e;
import android.os.Build;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.z0;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12115a;

    public /* synthetic */ a(int i) {
        this.f12115a = i;
    }

    @Override // K0.b
    public final void accept(Object obj) {
        switch (this.f12115a) {
            case 0:
                z0 z0Var = (z0) obj;
                ArrayList arrayList = new ArrayList();
                String str = Build.BRAND;
                if (z0Var.a(ExtensionDisabledQuirk.class, ("google".equalsIgnoreCase(str) && "redfin".equalsIgnoreCase(Build.DEVICE)) || "motorola".equalsIgnoreCase(str) || "realme".equalsIgnoreCase(str))) {
                    arrayList.add(new ExtensionDisabledQuirk());
                }
                if (z0Var.a(CrashWhenOnDisableTooSoon.class, str.equalsIgnoreCase("SAMSUNG"))) {
                    arrayList.add(new CrashWhenOnDisableTooSoon());
                }
                if (z0Var.a(GetAvailableKeysNeedsOnInit.class, str.equalsIgnoreCase("SAMSUNG"))) {
                    arrayList.add(new GetAvailableKeysNeedsOnInit());
                }
                if (z0Var.a(CaptureOutputSurfaceOccupiedQuirk.class, str.equalsIgnoreCase("Xiaomi"))) {
                    arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
                }
                b.f12116a = new C0((List) arrayList);
                S.a("DeviceQuirks", "extensions DeviceQuirks = " + C0.g(b.f12116a));
                break;
            default:
                Throwable scheduleException = (Throwable) obj;
                l.f(scheduleException, "scheduleException");
                e.a().b(scheduleException);
                va.a.f47104a.b(scheduleException);
                break;
        }
    }
}
