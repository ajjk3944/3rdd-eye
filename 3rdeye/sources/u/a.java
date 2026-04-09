package U;

import B.d;
import C.C0616c;
import C.S;
import E.u;
import T.b;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import t4.C5606d;

/* compiled from: CaptureOutputSurfaceForCaptureProcessor.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final ImageWriter f12340b;

    /* renamed from: c, reason: collision with root package name */
    public final C0616c f12341c;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f12343e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12344f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12345g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12339a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f12342d = false;

    /* renamed from: h, reason: collision with root package name */
    public long f12346h = -1;

    public a(Surface surface, Size size, boolean z10) {
        this.f12345g = z10;
        boolean z11 = b.f12116a.e(CaptureOutputSurfaceOccupiedQuirk.class) != null || z10;
        this.f12344f = z11;
        if (Build.VERSION.SDK_INT < 29 || !z11) {
            this.f12343e = surface;
            this.f12341c = null;
            this.f12340b = null;
        } else {
            S.a("CaptureOutputSurface", "Enabling intermediate surface");
            C0616c c0616cQ = C5606d.q(size.getWidth(), size.getHeight(), 35, 2);
            this.f12341c = c0616cQ;
            this.f12343e = c0616cQ.a();
            this.f12340b = ImageWriter.newInstance(surface, 2, 35);
            c0616cQ.h(new d(this, 13), u.y());
        }
    }

    public final void a() {
        synchronized (this.f12339a) {
            try {
                this.f12342d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f12344f) {
                    this.f12341c.e();
                    this.f12341c.close();
                    this.f12340b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
