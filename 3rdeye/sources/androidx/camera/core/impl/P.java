package androidx.camera.core.impl;

import C.C0632t;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* compiled from: CameraValidator.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final C0632t f14932a;

    /* compiled from: CameraValidator.java */
    public static class a {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    /* compiled from: CameraValidator.java */
    public static class b extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f14933b;

        public b(int i, IllegalArgumentException illegalArgumentException, String str) {
            super(str, illegalArgumentException);
            this.f14933b = i;
        }
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C1702m0(2));
        f14932a = new C0632t(linkedHashSet);
    }

    public static void a(Context context, M m10, C0632t c0632t) throws b {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<J> linkedHashSetA = m10.a();
            if (linkedHashSetA.isEmpty()) {
                throw new b(0, null, "No cameras available");
            }
            C.S.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + linkedHashSetA.size() + " cameras. Skipping validation.");
            return;
        }
        if (c0632t != null) {
            try {
                numB = c0632t.b();
                if (numB == null) {
                    C.S.g("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e4) {
                C.S.c("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e4);
                return;
            }
        } else {
            numB = null;
        }
        C.S.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numB);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0632t == null || numB.intValue() == 1)) {
                C0632t.f769c.c(m10.a());
                i = 1;
            }
        } catch (IllegalArgumentException e10) {
            illegalArgumentException = e10;
            C.S.h("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0632t == null || numB.intValue() == 0)) {
                C0632t.f768b.c(m10.a());
                i++;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            C.S.h("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f14932a.c(m10.a());
            C.S.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        C.S.b("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + m10.a());
        throw new b(i, illegalArgumentException, "Expected camera missing from device.");
    }
}
