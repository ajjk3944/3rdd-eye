package com.google.ar.core;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class A extends ArCoreApk {

    /* renamed from: m, reason: collision with root package name */
    private static final A f38152m = new A();

    /* renamed from: b, reason: collision with root package name */
    Exception f38154b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38155c;

    /* renamed from: e, reason: collision with root package name */
    private int f38157e;

    /* renamed from: f, reason: collision with root package name */
    private long f38158f;

    /* renamed from: g, reason: collision with root package name */
    private ArCoreApk.Availability f38159g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38160h;

    /* renamed from: i, reason: collision with root package name */
    private N f38161i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38162j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38163k;

    /* renamed from: l, reason: collision with root package name */
    private int f38164l;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f38153a = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    boolean f38156d = true;

    A() {
    }

    public static A a() {
        return f38152m;
    }

    private final void h(Context context, x xVar) {
        ArCoreApk.Availability availability;
        if (!j()) {
            xVar.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
            return;
        }
        try {
            if (d(context)) {
                c();
                try {
                    availability = AbstractC5048k.a(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                xVar.a(availability);
                return;
            }
            if (k(context) != -1) {
                xVar.a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
            } else if (i(context)) {
                xVar.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
            } else {
                b(context).c(context, xVar);
            }
        } catch (FatalException e10) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e10);
            xVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    private final boolean i(Context context) {
        l(context);
        return this.f38163k;
    }

    private static boolean j() {
        return true;
    }

    private static int k(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i10 = packageInfo.versionCode;
            if (i10 != 0) {
                return i10;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                if (serviceInfoArr.length != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void l(Context context) {
        if (this.f38162j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (!bundle.containsKey("com.google.ar.core")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            }
            String string = bundle.getString("com.google.ar.core");
            Objects.requireNonNull(string);
            this.f38163k = string.equals("required");
            if (!bundle.containsKey("com.google.ar.core.min_apk_version")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            this.f38164l = bundle.getInt("com.google.ar.core.min_apk_version");
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                String canonicalName = InstallActivity.class.getCanonicalName();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (canonicalName.equals(activityInfo.name)) {
                        this.f38162j = true;
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43);
                sb2.append("Application manifest must contain activity ");
                sb2.append(canonicalName);
                throw new FatalException(sb2.toString());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new FatalException("Could not load application package info", e10);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            throw new FatalException("Could not load application package metadata", e11);
        }
    }

    private static final ArCoreApk.InstallStatus m(Activity activity) throws IntentSender.SendIntentException, UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        PendingIntent pendingIntentA = AbstractC5048k.a(activity);
        if (pendingIntentA != null) {
            try {
                Log.i("ARCore-ArCoreApk", "Starting setup activity");
                activity.startIntentSender(pendingIntentA.getIntentSender(), null, 0, 0, 0, Build.VERSION.SDK_INT > 33 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                return ArCoreApk.InstallStatus.INSTALLED;
            } catch (RuntimeException e11) {
                e = e11;
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                return ArCoreApk.InstallStatus.INSTALLED;
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    final synchronized N b(Context context) {
        try {
            if (this.f38161i == null) {
                N n10 = new N(null);
                n10.a(context.getApplicationContext());
                this.f38161i = n10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38161i;
    }

    final synchronized void c() {
        try {
            if (this.f38154b == null) {
                this.f38157e = 0;
            }
            this.f38155c = false;
            N n10 = this.f38161i;
            if (n10 != null) {
                n10.b();
                this.f38161i = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        synchronized (this) {
            try {
                ArCoreApk.Availability availability = this.f38159g;
                if (availability == null || availability.isUnknown()) {
                    if (!this.f38160h) {
                        this.f38160h = true;
                        h(context, new y(this));
                    }
                }
                ArCoreApk.Availability availability2 = this.f38159g;
                if (availability2 != null) {
                    if (!availability2.isUnsupported()) {
                        this.f38159g = null;
                    }
                    return availability2;
                }
                if (this.f38160h) {
                    return ArCoreApk.Availability.UNKNOWN_CHECKING;
                }
                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                return ArCoreApk.Availability.UNKNOWN_ERROR;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer consumer) {
        h(context, new z(this, consumer));
    }

    final boolean d(Context context) {
        l(context);
        return k(context) == 0 || k(context) >= this.f38164l;
    }

    final /* synthetic */ Handler e() {
        return this.f38153a;
    }

    final /* synthetic */ void f(ArCoreApk.Availability availability) {
        this.f38159g = availability;
    }

    final /* synthetic */ void g() {
        this.f38160h = false;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10) {
        return requestInstall(activity, z10, i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, i(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        if (j()) {
            if (d(activity)) {
                c();
                return m(activity);
            }
            if (!this.f38155c) {
                Exception exc = this.f38154b;
                if (exc != null) {
                    if (z10) {
                        Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                        this.f38154b = null;
                    } else {
                        if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
                            if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                                if (exc instanceof RuntimeException) {
                                    Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                                    throw ((RuntimeException) exc);
                                }
                                throw new RuntimeException("Unexpected exception type", exc);
                            }
                            Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
                            throw ((UnavailableUserDeclinedInstallationException) exc);
                        }
                        Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
                        throw ((UnavailableDeviceNotCompatibleException) exc);
                    }
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - this.f38158f > 5000) {
                    this.f38157e = 0;
                }
                int i10 = this.f38157e + 1;
                this.f38157e = i10;
                this.f38158f = jUptimeMillis;
                if (i10 <= 2) {
                    try {
                        activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                        this.f38155c = true;
                        return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                    } catch (ActivityNotFoundException e10) {
                        throw new FatalException("Failed to launch InstallActivity.", e10);
                    }
                }
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        }
        throw new UnavailableDeviceNotCompatibleException();
    }
}
