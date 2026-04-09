package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static int f21557a = -1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            x.f21557a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f21557a).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i4 = f21557a;
        if (i4 != -1) {
            return i4;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f21557a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f21557a = -1;
            }
        } else {
            f21557a = -2;
        }
        return f21557a;
    }

    public static int a() {
        int i4;
        int i10 = f21557a;
        if (i10 != -1) {
            return i10;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i4 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f21557a = i4;
        return i4;
    }
}
