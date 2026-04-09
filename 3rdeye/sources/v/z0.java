package v;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.d;
import io.appmetrica.analytics.impl.Oo;
import w.C5698l;
import y.C5787a;

/* compiled from: ZslControlImpl.java */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final C5698l f46999a;

    /* renamed from: b, reason: collision with root package name */
    public final M.d f47000b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47001c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47002d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47003e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47004f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.core.e f47005g;

    /* renamed from: h, reason: collision with root package name */
    public d.a f47006h;
    public C.i0 i;

    /* renamed from: j, reason: collision with root package name */
    public ImageWriter f47007j;

    public z0(C5698l c5698l) {
        boolean z10;
        this.f47003e = false;
        this.f47004f = false;
        this.f46999a = c5698l;
        int[] iArr = (int[]) c5698l.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        this.f47003e = z10;
        this.f47004f = C5787a.f47852a.e(ZslDisablerQuirk.class) != null;
        this.f47000b = new M.d(3, new Oo(11));
    }
}
