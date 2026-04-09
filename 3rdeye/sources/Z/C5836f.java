package z;

import C.S;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ForceCloseDeferrableSurface.java */
/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5836f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48388a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48389b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48390c;

    public C5836f(C0 c02, C0 c03) {
        this.f48388a = c03.d(TextureViewIsClosedQuirk.class);
        this.f48389b = c02.d(PreviewOrientationIncorrectQuirk.class);
        this.f48390c = c02.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f48388a || this.f48389b || this.f48390c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((X) it.next()).a();
            }
            S.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
