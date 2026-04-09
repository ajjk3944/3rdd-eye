package oh;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import h9.r2;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e implements Serializable {
    public static e B;

    /* renamed from: a, reason: collision with root package name */
    public r2 f19455a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f19456d = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f19457g = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final Object f19458r = new Object();

    /* renamed from: x, reason: collision with root package name */
    public int f19459x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ch.f f19460y;

    public e(Context context, ch.f fVar) {
        this.f19460y = fVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (fVar.h()) {
            context.registerReceiver(new a5.s(8, this), intentFilter, 4);
        } else {
            context.registerReceiver(new a5.s(8, this), intentFilter);
        }
    }

    public static void a(e eVar, int i10) {
        synchronized (eVar.f19458r) {
            try {
                if (eVar.f19459x == i10) {
                    return;
                }
                eVar.f19459x = i10;
                ch.n.b("CustomNetworkTypeObserver", "networkType updated to: " + i10);
                Iterator it = eVar.f19457g.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    ph.k kVar = (ph.k) weakReference.get();
                    if (kVar != null) {
                        kVar.a(i10);
                    } else {
                        eVar.f19457g.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized e b(Context context, ch.f fVar) {
        try {
            if (B == null) {
                B = new e(context, fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return B;
    }

    public final void c(ph.k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19457g;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(kVar));
        this.f19456d.post(new io.sentry.cache.e(this, 17, kVar));
    }
}
