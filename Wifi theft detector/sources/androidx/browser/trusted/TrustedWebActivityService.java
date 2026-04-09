package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.a;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;
import o.h;
import o.i;
import o.j;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public NotificationManager f1452a;

    /* renamed from: b, reason: collision with root package name */
    public int f1453b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final ITrustedWebActivityService.Stub f1454c = new a();

    public class a extends ITrustedWebActivityService.Stub {
        public a() {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
            f();
            return new a.e(TrustedWebActivityService.this.d(a.c.a(bundle).f1459a)).a();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
            f();
            a.b bVarA = a.b.a(bundle);
            TrustedWebActivityService.this.e(bVarA.f1457a, bVarA.f1458b);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            f();
            return TrustedWebActivityService.this.f(str, bundle, j.a(iBinder));
        }

        public final void f() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i10 = trustedWebActivityService.f1453b;
            if (i10 != -1) {
                if (i10 != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.c();
                throw null;
            }
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
            f();
            return new a.C0009a(TrustedWebActivityService.this.g()).a();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
            f();
            return TrustedWebActivityService.this.h();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            f();
            return TrustedWebActivityService.this.i();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            f();
            a.d dVarA = a.d.a(bundle);
            return new a.e(TrustedWebActivityService.this.j(dVarA.f1460a, dVarA.f1461b, dVarA.f1462c, dVarA.f1463d)).a();
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.f1452a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract i c();

    public boolean d(String str) {
        b();
        if (!NotificationManagerCompat.b(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return h.b(this.f1452a, a(str));
    }

    public void e(String str, int i10) {
        b();
        this.f1452a.cancel(str, i10);
    }

    public Bundle f(String str, Bundle bundle, j jVar) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return o.a.a(this.f1452a);
    }

    public Bundle h() {
        int i10 = i();
        Bundle bundle = new Bundle();
        if (i10 == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i10));
        return bundle;
    }

    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean j(String str, int i10, Notification notification, String str2) {
        b();
        if (!NotificationManagerCompat.b(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strA = a(str2);
            notification = h.a(this, this.f1452a, notification, strA, str2);
            if (!h.b(this.f1452a, strA)) {
                return false;
            }
        }
        this.f1452a.notify(str, i10, notification);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1454c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f1452a = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f1453b = -1;
        return super.onUnbind(intent);
    }
}
