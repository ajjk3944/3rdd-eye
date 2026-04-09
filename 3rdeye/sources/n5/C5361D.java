package n5;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* renamed from: n5.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5361D {

    /* renamed from: a, reason: collision with root package name */
    public static final long f44304a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f44305b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static WakeLock f44306c;

    public static void a(Intent intent) {
        synchronized (f44305b) {
            try {
                if (f44306c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f44306c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static void b(Context context, ServiceConnectionC5363F serviceConnectionC5363F, Intent intent) {
        synchronized (f44305b) {
            try {
                if (f44306c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f44306c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f44306c.acquire(f44304a);
                }
                serviceConnectionC5363F.b(intent).addOnCompleteListener(new M8.a(intent, 14));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f44305b) {
            try {
                if (f44306c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f44306c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f44306c.acquire(f44304a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
