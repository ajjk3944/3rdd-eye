package com.google.ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes3.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f38196a;

    /* renamed from: b, reason: collision with root package name */
    private Context f38197b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.ar.core.dependencies.h f38198c;

    /* renamed from: d, reason: collision with root package name */
    private final ServiceConnection f38199d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f38200e;

    /* renamed from: f, reason: collision with root package name */
    private Context f38201f;

    /* renamed from: g, reason: collision with root package name */
    private PackageInstaller f38202g;

    /* renamed from: h, reason: collision with root package name */
    private PackageInstaller.SessionCallback f38203h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f38204i;

    N() {
    }

    static /* synthetic */ Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(IBinder iBinder) {
        com.google.ar.core.dependencies.h hVarB = com.google.ar.core.dependencies.g.b(iBinder);
        Log.i("ARCore-InstallService", "Install service connected");
        this.f38198c = hVarB;
        this.f38204i = 3;
        Iterator it = this.f38196a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        Log.i("ARCore-InstallService", "Install service disconnected");
        this.f38204i = 1;
        this.f38198c = null;
    }

    private final synchronized void n(Runnable runnable) {
        int i10 = this.f38204i;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            throw new C5045h();
        }
        if (i11 == 1) {
            this.f38196a.offer(runnable);
        } else {
            if (i11 != 2) {
                return;
            }
            runnable.run();
        }
    }

    private static void o(Activity activity, L l10) {
        boolean z10;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            A a10 = A.a();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z10 = true;
                    break;
                }
            }
            a10.f38156d = !z10;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            l10.b(new FatalException("Failed to launch installer.", e10));
        }
    }

    private static void p(Activity activity, Bundle bundle, L l10) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent == null) {
            Log.e("ARCore-InstallService", "Did not get pending intent.");
            l10.b(new FatalException("Installation intent failed to unparcel."));
        } else {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                l10.b(new FatalException("Installation Intent failed", e10));
            }
        }
    }

    public final synchronized void a(Context context) {
        this.f38197b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f38199d, 1)) {
            this.f38204i = 2;
            return;
        }
        this.f38204i = 1;
        this.f38197b = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.f38199d);
    }

    public final synchronized void b() {
        try {
            int i10 = this.f38204i;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            if (i11 == 1 || i11 == 2) {
                this.f38197b.unbindService(this.f38199d);
                this.f38197b = null;
                this.f38204i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.f38200e;
            if (broadcastReceiver != null) {
                this.f38201f.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.f38203h;
            if (sessionCallback != null) {
                this.f38202g.unregisterSessionCallback(sessionCallback);
                this.f38203h = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(Context context, x xVar) {
        try {
            n(new RunnableC5039b(this, context, xVar));
        } catch (C5045h unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            xVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    final /* synthetic */ com.google.ar.core.dependencies.h f() {
        return this.f38198c;
    }

    final /* synthetic */ PackageInstaller g() {
        return this.f38202g;
    }

    public final void h(Activity activity, L l10) {
        if (this.f38203h == null) {
            try {
                this.f38202g = activity.getPackageManager().getPackageInstaller();
                C5040c c5040c = new C5040c(this, l10);
                this.f38203h = c5040c;
                this.f38202g.registerSessionCallback(c5040c);
            } catch (NullPointerException unused) {
                l10.b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (this.f38200e == null) {
            C5041d c5041d = new C5041d(l10);
            this.f38200e = c5041d;
            this.f38201f = activity;
            if (Build.VERSION.SDK_INT >= 33) {
                activity.registerReceiver(c5041d, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                activity.registerReceiver(c5041d, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            n(new RunnableC5044g(this, activity, l10));
        } catch (C5045h unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            o(activity, l10);
        }
    }

    final /* synthetic */ void i(Activity activity, L l10) {
        o(activity, l10);
    }

    final /* synthetic */ void j(Activity activity, Bundle bundle, L l10) throws IntentSender.SendIntentException {
        p(activity, bundle, l10);
    }

    N(byte[] bArr) {
        this();
        this.f38196a = new ArrayDeque();
        this.f38204i = 1;
        this.f38199d = new O(this);
    }
}
