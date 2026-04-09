package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.y0;
import j6.l;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f14809a;

    /* renamed from: b, reason: collision with root package name */
    public static final M0 f14810b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f14811c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f14812d;

    static {
        M0 m02 = new M0();
        N0.b bVar = N0.b.YUV;
        N0.a aVar = N0.a.VGA;
        m02.a(N0.a(bVar, aVar));
        N0.b bVar2 = N0.b.PRIV;
        N0.a aVar2 = N0.a.PREVIEW;
        m02.a(N0.a(bVar2, aVar2));
        N0.a aVar3 = N0.a.MAXIMUM;
        m02.a(N0.a(bVar, aVar3));
        f14809a = m02;
        M0 m03 = new M0();
        l.f(bVar2, aVar2, m03, bVar2, aVar);
        m03.a(N0.a(bVar, aVar3));
        f14810b = m03;
        f14811c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f14812d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean d() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f14812d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
