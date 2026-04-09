package qd;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import cl.u;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f32256n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f32257a;

    /* renamed from: b, reason: collision with root package name */
    public final u f32258b;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f32263h;

    /* renamed from: l, reason: collision with root package name */
    public m f32266l;

    /* renamed from: m, reason: collision with root package name */
    public g f32267m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f32260d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f32261e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f32262f = new Object();
    public final j j = new IBinder.DeathRecipient() { // from class: qd.j
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            n nVar = this.f32249a;
            int i4 = 0;
            nVar.f32258b.d("reportBinderDeath", new Object[0]);
            if (nVar.f32264i.get() != null) {
                throw new ClassCastException();
            }
            nVar.f32258b.d("%s : Binder has died.", nVar.f32259c);
            ArrayList arrayList = nVar.f32260d;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                RemoteException remoteException = new RemoteException(String.valueOf(nVar.f32259c).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = ((i) obj).f32248a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            nVar.f32260d.clear();
            synchronized (nVar.f32262f) {
                nVar.d();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f32265k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f32259c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f32264i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [qd.j] */
    public n(Context context, u uVar, Intent intent) {
        this.f32257a = context;
        this.f32258b = uVar;
        this.f32263h = intent;
    }

    public static void b(n nVar, pd.g gVar) {
        g gVar2 = nVar.f32267m;
        u uVar = nVar.f32258b;
        ArrayList arrayList = nVar.f32260d;
        int i4 = 0;
        if (gVar2 != null || nVar.g) {
            if (!nVar.g) {
                gVar.run();
                return;
            } else {
                uVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gVar);
                return;
            }
        }
        uVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(gVar);
        m mVar = new m(0, nVar);
        nVar.f32266l = mVar;
        nVar.g = true;
        if (nVar.f32257a.bindService(nVar.f32263h, mVar, 1)) {
            return;
        }
        uVar.d("Failed to bind to the service.", new Object[0]);
        nVar.g = false;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ac.m mVar2 = new ac.m("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((i) obj).f32248a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(mVar2);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f32256n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f32259c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f32259c, 10);
                    handlerThread.start();
                    map.put(this.f32259c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f32259c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f32262f) {
            this.f32261e.remove(taskCompletionSource);
        }
        a().post(new k(0, this));
    }

    public final void d() {
        HashSet hashSet = this.f32261e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f32259c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
