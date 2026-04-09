package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@UsedByNative("arcoreapk.cc")
/* loaded from: classes3.dex */
final class ArCoreApkJniAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f38165a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38166b = 0;

    static {
        HashMap map = new HashMap();
        f38165a = map;
        map.put(IllegalArgumentException.class, Integer.valueOf(EnumC5046i.ERROR_INVALID_ARGUMENT.f38282G));
        map.put(ResourceExhaustedException.class, Integer.valueOf(EnumC5046i.ERROR_RESOURCE_EXHAUSTED.f38282G));
        map.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(EnumC5046i.UNAVAILABLE_ARCORE_NOT_INSTALLED.f38282G));
        map.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(EnumC5046i.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f38282G));
        map.put(UnavailableApkTooOldException.class, Integer.valueOf(EnumC5046i.UNAVAILABLE_APK_TOO_OLD.f38282G));
        map.put(UnavailableSdkTooOldException.class, Integer.valueOf(EnumC5046i.UNAVAILABLE_SDK_TOO_OLD.f38282G));
        map.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(EnumC5046i.UNAVAILABLE_USER_DECLINED_INSTALLATION.f38282G));
    }

    private ArCoreApkJniAdapter() {
    }

    private static int b(Throwable th2) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th2);
        Map map = f38165a;
        Class<?> cls = th2.getClass();
        return map.containsKey(cls) ? ((Integer) map.get(cls)).intValue() : EnumC5046i.ERROR_FATAL.f38282G;
    }

    @UsedByNative("arcoreapk.cc")
    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th2) {
            b(th2);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    static void checkAvailabilityAsync(Context context, final long j10, final long j11) {
        final Consumer<ArCoreApk.Availability> consumer = new Consumer() { // from class: com.google.ar.core.C
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj) {
                ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(j10, j11, ((ArCoreApk.Availability) obj).nativeCode);
            }
        };
        try {
            ArCoreApk.getInstance().checkAvailabilityAsync(context, consumer);
        } catch (Throwable th2) {
            b(th2);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.B
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = ArCoreApkJniAdapter.f38166b;
                    consumer.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInvokeAvailabilityCallback(long j10, long j11, int i10);

    @UsedByNative("arcoreapk.cc")
    static int requestInstall(Activity activity, boolean z10, int[] iArr) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10).nativeCode;
            return EnumC5046i.SUCCESS.f38282G;
        } catch (Throwable th2) {
            return b(th2);
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstallCustom(Activity activity, boolean z10, int i10, int i11, int[] iArr) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10, ArCoreApk.InstallBehavior.forNumber(i10), ArCoreApk.UserMessageType.forNumber(i11)).nativeCode;
            return EnumC5046i.SUCCESS.f38282G;
        } catch (Throwable th2) {
            return b(th2);
        }
    }
}
