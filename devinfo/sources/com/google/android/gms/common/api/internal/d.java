package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import pb.k0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f9078o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f9079p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f9080q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static d f9081r;

    /* renamed from: a, reason: collision with root package name */
    public long f9082a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9083b;

    /* renamed from: c, reason: collision with root package name */
    public pb.m f9084c;

    /* renamed from: d, reason: collision with root package name */
    public rb.b f9085d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9086e;

    /* renamed from: f, reason: collision with root package name */
    public final nb.e f9087f;
    public final km.n g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f9088h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f9089i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final x.f f9090k;

    /* renamed from: l, reason: collision with root package name */
    public final x.f f9091l;

    /* renamed from: m, reason: collision with root package name */
    public final ac.k f9092m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f9093n;

    public d(Context context, Looper looper) {
        nb.e eVar = nb.e.f29897d;
        this.f9082a = 10000L;
        this.f9083b = false;
        this.f9088h = new AtomicInteger(1);
        this.f9089i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f9090k = new x.f(0);
        this.f9091l = new x.f(0);
        this.f9093n = true;
        this.f9086e = context;
        ac.k kVar = new ac.k(looper, this, 3);
        Looper.getMainLooper();
        this.f9092m = kVar;
        this.f9087f = eVar;
        this.g = new km.n((byte) 0, 8);
        PackageManager packageManager = context.getPackageManager();
        if (tb.b.g == null) {
            tb.b.g = Boolean.valueOf(tb.b.g() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (tb.b.g.booleanValue()) {
            this.f9093n = false;
        }
        kVar.sendMessage(kVar.obtainMessage(6));
    }

    public static Status c(a aVar, nb.b bVar) {
        return new Status(17, je.u.u("API: ", (String) aVar.f9065b.f28443c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f29886c, bVar);
    }

    public static d e(Context context) {
        d dVar;
        synchronized (f9080q) {
            try {
                if (f9081r == null) {
                    Looper looper = k0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = nb.e.f29896c;
                    f9081r = new d(applicationContext, looper);
                }
                dVar = f9081r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public final boolean a() {
        if (this.f9083b) {
            return false;
        }
        pb.l lVar = (pb.l) pb.k.b().f31634a;
        if (lVar != null && !lVar.f31644b) {
            return false;
        }
        int i4 = ((SparseIntArray) this.g.f28442b).get(203400000, -1);
        return i4 == -1 || i4 == 0;
    }

    public final boolean b(nb.b bVar, int i4) {
        nb.e eVar = this.f9087f;
        eVar.getClass();
        Context context = this.f9086e;
        if (!ub.a.j(context)) {
            int i10 = bVar.f29885b;
            PendingIntent activity = bVar.f29886c;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = eVar.b(context, i10, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f9056b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i4);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, zb.d.f38168a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final n d(ob.f fVar) {
        a aVar = fVar.f30489e;
        ConcurrentHashMap concurrentHashMap = this.j;
        n nVar = (n) concurrentHashMap.get(aVar);
        if (nVar == null) {
            nVar = new n(this, fVar);
            concurrentHashMap.put(aVar, nVar);
        }
        if (nVar.f9102b.m()) {
            this.f9091l.add(aVar);
        }
        nVar.j();
        return nVar;
    }

    public final void f(nb.b bVar, int i4) {
        if (b(bVar, i4)) {
            return;
        }
        ac.k kVar = this.f9092m;
        kVar.sendMessage(kVar.obtainMessage(5, i4, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.d.handleMessage(android.os.Message):boolean");
    }
}
