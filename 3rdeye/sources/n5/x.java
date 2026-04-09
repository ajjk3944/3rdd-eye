package n5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f44385b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f44386c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f44387d;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public final ThreadPoolExecutor f44388e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public x f44389a;

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f44389a.f44387d.f23260c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            x xVar = this.f44389a;
            if (xVar != null && xVar.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                x xVar2 = this.f44389a;
                xVar2.f44387d.getClass();
                FirebaseMessaging.b(xVar2, 0L);
                this.f44389a.f44387d.f23260c.unregisterReceiver(this);
                this.f44389a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public x(FirebaseMessaging firebaseMessaging, long j4) {
        this.f44387d = firebaseMessaging;
        this.f44385b = j4;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f23260c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f44386c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f44387d.f23260c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f44387d.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e4) {
            String message = e4.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e4.getMessage() != null) {
                    throw e4;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        v vVarA = v.a();
        FirebaseMessaging firebaseMessaging = this.f44387d;
        boolean zC = vVarA.c(firebaseMessaging.f23260c);
        PowerManager.WakeLock wakeLock = this.f44386c;
        if (zC) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f23266j = true;
                }
                if (!firebaseMessaging.i.e()) {
                    firebaseMessaging.e(false);
                    if (v.a().c(firebaseMessaging.f23260c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!v.a().b(firebaseMessaging.f23260c) || a()) {
                    if (b()) {
                        firebaseMessaging.e(false);
                    } else {
                        firebaseMessaging.h(this.f44385b);
                    }
                    if (v.a().c(firebaseMessaging.f23260c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                aVar.f44389a = this;
                aVar.a();
                if (v.a().c(firebaseMessaging.f23260c)) {
                    wakeLock.release();
                }
            } catch (IOException e4) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e4.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.e(false);
                if (v.a().c(firebaseMessaging.f23260c)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (v.a().c(firebaseMessaging.f23260c)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
