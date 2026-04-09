package L2;

import M2.G;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import h0.C2351a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import u.C2937f;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public static final Status f2502C = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: D, reason: collision with root package name */
    public static final Status f2503D = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: E, reason: collision with root package name */
    public static final Object f2504E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static c f2505F;

    /* renamed from: a, reason: collision with root package name */
    public long f2506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2507b;

    /* renamed from: c, reason: collision with root package name */
    public M2.m f2508c;

    /* renamed from: d, reason: collision with root package name */
    public O2.c f2509d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2510e;

    /* renamed from: f, reason: collision with root package name */
    public final J2.e f2511f;

    /* renamed from: g, reason: collision with root package name */
    public final C2351a f2512g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f2513h;
    public final AtomicInteger i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f2514j;

    /* renamed from: k, reason: collision with root package name */
    public final C2937f f2515k;

    /* renamed from: l, reason: collision with root package name */
    public final C2937f f2516l;

    /* renamed from: m, reason: collision with root package name */
    public final W2.e f2517m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f2518n;

    public c(Context context, Looper looper) {
        J2.e eVar = J2.e.f2057d;
        this.f2506a = 10000L;
        this.f2507b = false;
        this.f2513h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.f2514j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2515k = new C2937f(0);
        this.f2516l = new C2937f(0);
        this.f2518n = true;
        this.f2510e = context;
        W2.e eVar2 = new W2.e(looper, this, 0);
        this.f2517m = eVar2;
        this.f2511f = eVar;
        this.f2512g = new C2351a(8);
        PackageManager packageManager = context.getPackageManager();
        if (Q2.b.f3175f == null) {
            Q2.b.f3175f = Boolean.valueOf(Q2.b.e() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (Q2.b.f3175f.booleanValue()) {
            this.f2518n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(a aVar, J2.b bVar) {
        String str = (String) aVar.f2494b.f20442c;
        String strValueOf = String.valueOf(bVar);
        return new Status(17, AbstractC1135f5.o(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), bVar.f2046c, bVar);
    }

    public static c e(Context context) {
        c cVar;
        synchronized (f2504E) {
            try {
                if (f2505F == null) {
                    Looper looper = G.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = J2.e.f2056c;
                    f2505F = new c(applicationContext, looper);
                }
                cVar = f2505F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final boolean a() {
        if (this.f2507b) {
            return false;
        }
        M2.l lVar = (M2.l) M2.k.b().f2787a;
        if (lVar != null && !lVar.f2789b) {
            return false;
        }
        int i = ((SparseIntArray) this.f2512g.f20441b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(J2.b bVar, int i) throws Resources.NotFoundException {
        J2.e eVar = this.f2511f;
        eVar.getClass();
        Context context = this.f2510e;
        if (!R2.a.v(context)) {
            int i3 = bVar.f2045b;
            PendingIntent activity = bVar.f2046c;
            if (!((i3 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = eVar.b(context, i3, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i6 = GoogleApiActivity.f6900b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i3, PendingIntent.getActivity(context, 0, intent, W2.d.f4021a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final k d(K2.f fVar) {
        a aVar = fVar.f2154e;
        ConcurrentHashMap concurrentHashMap = this.f2514j;
        k kVar = (k) concurrentHashMap.get(aVar);
        if (kVar == null) {
            kVar = new k(this, fVar);
            concurrentHashMap.put(aVar, kVar);
        }
        if (kVar.f2523b.m()) {
            this.f2516l.add(aVar);
        }
        kVar.j();
        return kVar;
    }

    public final void f(J2.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        W2.e eVar = this.f2517m;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03ae  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.c.handleMessage(android.os.Message):boolean");
    }
}
