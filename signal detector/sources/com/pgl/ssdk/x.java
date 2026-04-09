package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static int f19687a = -1;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            x.f19687a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f19687a).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i = f19687a;
        if (i != -1) {
            return i;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f19687a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f19687a = -1;
            }
        } else {
            f19687a = -2;
        }
        return f19687a;
    }

    public static int a() {
        int i;
        int i3 = f19687a;
        if (i3 != -1) {
            return i3;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f19687a = i;
        return i;
    }
}
