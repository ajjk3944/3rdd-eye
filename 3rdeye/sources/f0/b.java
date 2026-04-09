package f0;

import W.C1635x;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: QualityValidatedEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC1678a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f37796e;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1678a0 f37797b;

    /* renamed from: c, reason: collision with root package name */
    public final I f37798c;

    /* renamed from: d, reason: collision with root package name */
    public final C0 f37799d;

    static {
        HashMap map = new HashMap();
        f37796e = map;
        map.put(1, C1635x.f13312f);
        map.put(8, C1635x.f13310d);
        map.put(6, C1635x.f13309c);
        map.put(5, C1635x.f13308b);
        map.put(4, C1635x.f13307a);
        map.put(0, C1635x.f13311e);
    }

    public b(I i, InterfaceC1678a0 interfaceC1678a0, C0 c02) {
        this.f37797b = interfaceC1678a0;
        this.f37798c = i;
        this.f37799d = c02;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final boolean b(int i) {
        if (!this.f37797b.b(i)) {
            return false;
        }
        C1635x c1635x = (C1635x) f37796e.get(Integer.valueOf(i));
        if (c1635x == null) {
            return true;
        }
        Iterator it = this.f37799d.f(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.b(this.f37798c, c1635x) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).a())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final InterfaceC1680b0 f(int i) {
        if (b(i)) {
            return this.f37797b.f(i);
        }
        return null;
    }
}
