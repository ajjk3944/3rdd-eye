package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.N0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Locale;
import z.C5838h;

/* compiled from: DisplayInfoManager.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f46681e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f46682f = new Size(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 240);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f46683g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f46684h = new Object();
    public static volatile c0 i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f46685a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Size f46686b = null;

    /* renamed from: c, reason: collision with root package name */
    public final C5838h f46687c = new C5838h();

    /* renamed from: d, reason: collision with root package name */
    public final A3.c f46688d = new A3.c(10);

    public c0(Context context) {
        this.f46685a = (DisplayManager) context.getSystemService("display");
    }

    public static c0 b(Context context) {
        if (i == null) {
            synchronized (f46684h) {
                try {
                    if (i == null) {
                        i = new c0(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x * point.y;
                if (i11 > i10) {
                    display = display2;
                    i10 = i11;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeD;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = M.c.f4110a;
        if (size.getHeight() * size.getWidth() < M.c.a(f46682f)) {
            size = ((SmallDisplaySizeQuirk) this.f46688d.f36c) != null ? (Size) SmallDisplaySizeQuirk.f14829a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f46683g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f46681e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.f46687c.f48391a != null && (sizeD = ExtraCroppingQuirk.d(N0.b.PRIV)) != null) {
            if (sizeD.getHeight() * sizeD.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeD;
            }
        }
        return size;
    }

    public final Display c(boolean z10) {
        Display[] displays = this.f46685a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z10);
        if (displayD == null && z10) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f46686b != null) {
            return this.f46686b;
        }
        this.f46686b = a();
        return this.f46686b;
    }
}
