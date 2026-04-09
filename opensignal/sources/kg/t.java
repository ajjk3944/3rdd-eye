package kg;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import h7.h0;
import h7.r1;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14403a;

    /* renamed from: d, reason: collision with root package name */
    public final long f14404d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14405g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f14406r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f14407x;

    public t(FirebaseMessaging firebaseMessaging, long j) {
        this.f14403a = 0;
        this.f14407x = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hc.a("firebase-iid-executor"));
        this.f14406r = firebaseMessaging;
        this.f14404d = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f5823b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f14405g = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f14406r).f5823b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f14406r).a() == null) {
                e0.d("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e4) {
            String message = e4.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e4.getMessage() != null) {
                    throw e4;
                }
                e0.p("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            e0.p("FirebaseMessaging", "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            e0.p("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [mh.a, mi.f] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14403a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f14405g;
                r rVarH = r.h();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f14406r;
                if (rVarH.n(firebaseMessaging.f5823b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f5830i = true;
                        }
                        if (!firebaseMessaging.f5829h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f5830i = false;
                            }
                            if (!r.h().n(firebaseMessaging.f5823b)) {
                                return;
                            }
                        } else if (!r.h().l(firebaseMessaging.f5823b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f5830i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.f14404d);
                            }
                            if (!r.h().n(firebaseMessaging.f5823b)) {
                                return;
                            }
                        } else {
                            bc.s sVar = new bc.s();
                            sVar.f2646c = this;
                            sVar.a();
                            if (!r.h().n(firebaseMessaging.f5823b)) {
                                return;
                            }
                        }
                    } catch (IOException e4) {
                        e0.d("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e4.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f5830i = false;
                            if (!r.h().n(firebaseMessaging.f5823b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (r.h().n(firebaseMessaging.f5823b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            default:
                mh.l lVar = (mh.l) this.f14407x;
                mh.i iVar = new mh.i(lVar.f16754b, (DatagramChannel) this.f14405g, (byte[]) this.f14406r, new r1(21, lVar), lVar.f16763m, lVar.f16764n, lVar.f16753a);
                long j = this.f14404d;
                ch.n.b("UdpPingSenderScheduler", "start() called with: startTimeNanoSeconds = [" + j + "]");
                r1 r1Var = iVar.f16743e;
                if (r1Var != null) {
                    r1Var.getClass();
                    ch.n.b("PingSenderListener", "onPingStarted() called");
                    ((mh.l) r1Var.f10199d).f16768r.q("START_SENDING_THREAD", null);
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, iVar.f16749m);
                iVar.f16748l = scheduledExecutorServiceNewScheduledThreadPool.schedule(new mh.h(iVar, scheduledExecutorServiceNewScheduledThreadPool, iVar.f16741c.f16705g, new h0(iVar), j), 0L, TimeUnit.MILLISECONDS);
                return;
        }
    }

    public t(mh.l lVar, DatagramChannel datagramChannel, byte[] bArr, long j) {
        this.f14403a = 1;
        this.f14407x = lVar;
        this.f14405g = datagramChannel;
        this.f14406r = bArr;
        this.f14404d = j;
    }
}
