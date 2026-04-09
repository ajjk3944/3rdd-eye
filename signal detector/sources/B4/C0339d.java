package b4;

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

/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339d {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f5736n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5737a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f5738b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5743g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f5744h;

    /* renamed from: l, reason: collision with root package name */
    public S3.o f5747l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0348m f5748m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5740d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5741e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f5742f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final S3.l f5745j = new S3.l(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f5746k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f5739c = "SplitInstallService";
    public final WeakReference i = new WeakReference(null);

    public C0339d(Context context, X3.e eVar, Intent intent) {
        this.f5737a = context;
        this.f5738b = eVar;
        this.f5744h = intent;
    }

    public static void b(C0339d c0339d, a4.i iVar) {
        InterfaceC0348m interfaceC0348m = c0339d.f5748m;
        X3.e eVar = c0339d.f5738b;
        ArrayList arrayList = c0339d.f5740d;
        int i = 0;
        if (interfaceC0348m != null || c0339d.f5743g) {
            if (!c0339d.f5743g) {
                iVar.run();
                return;
            } else {
                eVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(iVar);
                return;
            }
        }
        eVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(iVar);
        S3.o oVar = new S3.o(2, c0339d);
        c0339d.f5747l = oVar;
        c0339d.f5743g = true;
        if (c0339d.f5737a.bindService(c0339d.f5744h, oVar, 1)) {
            return;
        }
        eVar.c("Failed to bind to the service.", new Object[0]);
        c0339d.f5743g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            J0.c cVar = new J0.c("Failed to bind to the service.");
            c3.f fVar = ((AbstractRunnableC0359x) obj).f5778a;
            if (fVar != null) {
                fVar.a(cVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f5736n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f5739c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f5739c, 10);
                    handlerThread.start();
                    map.put(this.f5739c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f5739c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(c3.f fVar) {
        synchronized (this.f5742f) {
            this.f5741e.remove(fVar);
        }
        a().post(new C0338c(1, this));
    }

    public final void d() {
        HashSet hashSet = this.f5741e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c3.f) it.next()).a(new RemoteException(String.valueOf(this.f5739c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
