package u4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import b9.C1998e;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f46585n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f46586a;

    /* renamed from: b, reason: collision with root package name */
    public final l f46587b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46592g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f46593h;

    /* renamed from: l, reason: collision with root package name */
    public t f46596l;

    /* renamed from: m, reason: collision with root package name */
    public h f46597m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46589d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f46590e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f46591f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final n f46594j = new n(this, 0);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f46595k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f46588c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public u(Context context, l lVar, Intent intent) {
        this.f46586a = context;
        this.f46587b = lVar;
        this.f46593h = intent;
    }

    public static void b(u uVar, t4.g gVar) {
        h hVar = uVar.f46597m;
        ArrayList arrayList = uVar.f46589d;
        l lVar = uVar.f46587b;
        if (hVar != null || uVar.f46592g) {
            if (!uVar.f46592g) {
                gVar.run();
                return;
            } else {
                lVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gVar);
                return;
            }
        }
        lVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(gVar);
        t tVar = new t(uVar, 0);
        uVar.f46596l = tVar;
        uVar.f46592g = true;
        if (uVar.f46586a.bindService(uVar.f46593h, tVar, 1)) {
            return;
        }
        lVar.a("Failed to bind to the service.", new Object[0]);
        uVar.f46592g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            C1998e c1998e = new C1998e("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = mVar.f46573b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(c1998e);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f46585n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46588c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46588c, 10);
                    handlerThread.start();
                    map.put(this.f46588c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46588c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46591f) {
            this.f46590e.remove(taskCompletionSource);
        }
        a().post(new p(this));
    }

    public final void d() {
        HashSet hashSet = this.f46590e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f46588c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
