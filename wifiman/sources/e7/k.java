package e7;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.google.ar.core.Session;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class k implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f46253a;

    /* renamed from: b, reason: collision with root package name */
    private int f46254b;

    /* renamed from: c, reason: collision with root package name */
    private int f46255c;

    /* renamed from: d, reason: collision with root package name */
    private final Display f46256d;

    /* renamed from: e, reason: collision with root package name */
    private final DisplayManager f46257e;

    /* renamed from: f, reason: collision with root package name */
    private final CameraManager f46258f;

    public k(Context context) {
        AbstractC6492s.i(context, "context");
        Object systemService = context.getSystemService("display");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.f46257e = (DisplayManager) systemService;
        Object systemService2 = context.getSystemService("camera");
        AbstractC6492s.g(systemService2, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.f46258f = (CameraManager) systemService2;
        Object systemService3 = context.getSystemService("window");
        AbstractC6492s.g(systemService3, "null cannot be cast to non-null type android.view.WindowManager");
        Display display = Build.VERSION.SDK_INT >= 30 ? context.getDisplay() : ((WindowManager) systemService3).getDefaultDisplay();
        if (display == null) {
            throw new IllegalStateException("No Display info available");
        }
        this.f46256d = display;
    }

    private final int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new RuntimeException("Unknown rotation " + i10);
    }

    public final int a(String cameraId) throws CameraAccessException {
        AbstractC6492s.i(cameraId, "cameraId");
        try {
            Object obj = this.f46258f.getCameraCharacteristics(cameraId).get(CameraCharacteristics.SENSOR_ORIENTATION);
            AbstractC6492s.f(obj);
            return ((((Number) obj).intValue() - e(this.f46256d.getRotation())) + 360) % 360;
        } catch (CameraAccessException e10) {
            throw new RuntimeException("Unable to determine display orientation", e10);
        }
    }

    public final void b() {
        this.f46257e.unregisterDisplayListener(this);
    }

    public final void c() {
        this.f46257e.registerDisplayListener(this, null);
    }

    public final void d(int i10, int i11) {
        this.f46254b = i10;
        this.f46255c = i11;
        this.f46253a = true;
    }

    public final void f(Session session) {
        AbstractC6492s.i(session, "session");
        if (this.f46253a) {
            session.setDisplayGeometry(this.f46256d.getRotation(), this.f46254b, this.f46255c);
            this.f46253a = false;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i10) {
        this.f46253a = true;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i10) {
    }
}
