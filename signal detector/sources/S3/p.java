package S3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f3498n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3499a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.a f3500b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3505g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f3506h;

    /* renamed from: l, reason: collision with root package name */
    public o f3509l;

    /* renamed from: m, reason: collision with root package name */
    public h f3510m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3502d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3503e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f3504f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final l f3507j = new l(0, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3508k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f3501c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public p(Context context, B2.a aVar, Intent intent) {
        this.f3499a = context;
        this.f3500b = aVar;
        this.f3506h = intent;
    }

    public static void b(p pVar, k kVar) {
        h hVar = pVar.f3510m;
        B2.a aVar = pVar.f3500b;
        ArrayList arrayList = pVar.f3502d;
        int i = 0;
        if (hVar != null || pVar.f3505g) {
            if (!pVar.f3505g) {
                kVar.run();
                return;
            } else {
                aVar.f("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        aVar.f("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        o oVar = new o(0, pVar);
        pVar.f3509l = oVar;
        pVar.f3505g = true;
        if (pVar.f3499a.bindService(pVar.f3506h, oVar, 1)) {
            return;
        }
        aVar.f("Failed to bind to the service.", new Object[0]);
        pVar.f3505g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            J0.c cVar = new J0.c("Failed to bind to the service.");
            c3.f fVar = ((k) obj).f3489a;
            if (fVar != null) {
                fVar.a(cVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f3498n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f3501c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3501c, 10);
                    handlerThread.start();
                    map.put(this.f3501c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f3501c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(c3.f fVar) {
        synchronized (this.f3504f) {
            this.f3503e.remove(fVar);
        }
        a().post(new m(0, this));
    }

    public final void d() {
        HashSet hashSet = this.f3503e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c3.f) it.next()).a(new RemoteException(String.valueOf(this.f3501c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
