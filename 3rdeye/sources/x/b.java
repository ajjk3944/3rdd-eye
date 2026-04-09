package x;

import C.C;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import w.C5698l;

/* compiled from: DynamicRangesCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f47599a;

    /* compiled from: DynamicRangesCompat.java */
    public interface a {
        Set<C> a();

        DynamicRangeProfiles b();

        Set<C> c(C c10);
    }

    public b(a aVar) {
        this.f47599a = aVar;
    }

    public static b a(C5698l c5698l) {
        DynamicRangeProfiles dynamicRangeProfilesA;
        int i = Build.VERSION.SDK_INT;
        b bVar = null;
        if (i >= 33 && (dynamicRangeProfilesA = com.applovin.adview.a.a(c5698l.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            A2.l.q("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            bVar = new b(new c(dynamicRangeProfilesA));
        }
        return bVar == null ? d.f47601a : bVar;
    }
}
