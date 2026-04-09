package bc;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status L = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status M = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object N = new Object();
    public static d O;
    public final bm.e B;
    public final AtomicInteger D;
    public final AtomicInteger E;
    public final ConcurrentHashMap F;
    public k G;
    public final u.f H;
    public final u.f I;
    public final yh.a J;
    public volatile boolean K;

    /* renamed from: a, reason: collision with root package name */
    public long f2588a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2589d;

    /* renamed from: g, reason: collision with root package name */
    public TelemetryData f2590g;

    /* renamed from: r, reason: collision with root package name */
    public ec.d f2591r;

    /* renamed from: x, reason: collision with root package name */
    public final Context f2592x;

    /* renamed from: y, reason: collision with root package name */
    public final zb.c f2593y;

    public d(Context context, Looper looper) {
        zb.c cVar = zb.c.f26814e;
        this.f2588a = 10000L;
        this.f2589d = false;
        this.D = new AtomicInteger(1);
        this.E = new AtomicInteger(0);
        this.F = new ConcurrentHashMap(5, 0.75f, 1);
        this.G = null;
        this.H = new u.f(0);
        this.I = new u.f(0);
        this.K = true;
        this.f2592x = context;
        yh.a aVar = new yh.a(looper, this, 4);
        Looper.getMainLooper();
        this.J = aVar;
        this.f2593y = cVar;
        this.B = new bm.e(10);
        PackageManager packageManager = context.getPackageManager();
        if (gc.b.f9485f == null) {
            gc.b.f9485f = Boolean.valueOf(gc.b.e() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (gc.b.f9485f.booleanValue()) {
            this.K = false;
        }
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    public static Status c(a aVar, ConnectionResult connectionResult) {
        String str = (String) aVar.f2572b.f2831g;
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(strValueOf);
        return new Status(17, sb2.toString(), connectionResult.f4808g, connectionResult);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (N) {
            if (O == null) {
                synchronized (cc.e0.f3637g) {
                    try {
                        handlerThread = cc.e0.f3639i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            cc.e0.f3639i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = cc.e0.f3639i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = zb.c.f26813d;
                O = new d(applicationContext, looper);
            }
            dVar = O;
        }
        return dVar;
    }

    public final n a(ac.f fVar) {
        a aVar = fVar.f331f;
        ConcurrentHashMap concurrentHashMap = this.F;
        n nVar = (n) concurrentHashMap.get(aVar);
        if (nVar == null) {
            nVar = new n(this, fVar);
            concurrentHashMap.put(aVar, nVar);
        }
        if (nVar.f2624e.b()) {
            this.I.add(aVar);
        }
        nVar.q();
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(dd.h r9, int r10, ac.f r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            bc.a r3 = r11.f331f
            boolean r11 = r8.f()
            if (r11 != 0) goto Lb
            goto L48
        Lb:
            cc.h r11 = cc.h.b()
            java.lang.Object r11 = r11.f3652a
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r11
            r0 = 1
            if (r11 == 0) goto L4b
            boolean r1 = r11.f4844d
            if (r1 == 0) goto L48
            boolean r11 = r11.f4845g
            java.util.concurrent.ConcurrentHashMap r1 = r8.F
            java.lang.Object r1 = r1.get(r3)
            bc.n r1 = (bc.n) r1
            if (r1 == 0) goto L46
            ac.c r2 = r1.f2624e
            boolean r4 = r2 instanceof cc.e
            if (r4 == 0) goto L48
            cc.e r2 = (cc.e) r2
            com.google.android.gms.common.internal.zzj r4 = r2.f3635w
            if (r4 == 0) goto L46
            boolean r4 = r2.r()
            if (r4 != 0) goto L46
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = bc.t.a(r1, r2, r10)
            if (r11 == 0) goto L48
            int r2 = r1.f2632o
            int r2 = r2 + r0
            r1.f2632o = r2
            boolean r0 = r11.f4827g
            goto L4b
        L46:
            r0 = r11
            goto L4b
        L48:
            r10 = 0
            r1 = r8
            goto L65
        L4b:
            bc.t r11 = new bc.t
            r1 = 0
            if (r0 == 0) goto L56
            long r4 = java.lang.System.currentTimeMillis()
            goto L57
        L56:
            r4 = r1
        L57:
            if (r0 == 0) goto L5d
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5d:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L65:
            if (r10 == 0) goto L79
            dd.r r9 = r9.f7294a
            yh.a r11 = r1.J
            java.util.Objects.requireNonNull(r11)
            bc.q r0 = new bc.q
            r2 = 0
            r0.<init>(r11, r2)
            r9.b(r0, r10)
            return
        L78:
            r1 = r8
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.d.b(dd.h, int, ac.f):void");
    }

    public final void e(k kVar) {
        synchronized (N) {
            try {
                if (this.G != kVar) {
                    this.G = kVar;
                    this.H.clear();
                }
                this.H.addAll(kVar.f2618y);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        int i10;
        if (this.f2589d) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) cc.h.b().f3652a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f4844d) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.B.f2830d;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(203400000, -1);
        }
        return i10 == -1 || i10 == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i10) throws Resources.NotFoundException {
        zb.c cVar = this.f2593y;
        cVar.getClass();
        Context context = this.f2592x;
        if (!ic.a.x(context)) {
            int i11 = connectionResult.f4807d;
            PendingIntent activity = connectionResult.f4808g;
            if (!((i11 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = cVar.a(i11, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f4815d;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                cVar.f(context, i11, PendingIntent.getActivity(context, 0, intent, mc.d.f16676a | 134217728));
                cVar.g(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i10) {
        if (g(connectionResult, i10)) {
            return;
        }
        yh.a aVar = this.J;
        aVar.sendMessage(aVar.obtainMessage(5, i10, 0, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0335  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.d.handleMessage(android.os.Message):boolean");
    }
}
