package a5;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f150e;

    /* renamed from: f, reason: collision with root package name */
    public static HandlerThread f151f;

    /* renamed from: g, reason: collision with root package name */
    public static Handler f152g;

    /* renamed from: b, reason: collision with root package name */
    public Object f154b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public Object f155c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Object f156d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int f153a = 0;

    public t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new s(0, this), intentFilter);
    }

    public static void a(t tVar, int i10) {
        synchronized (tVar.f156d) {
            try {
                if (tVar.f153a == i10) {
                    return;
                }
                tVar.f153a = i10;
                Iterator it = ((CopyOnWriteArrayList) tVar.f155c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    r5.f fVar = (r5.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) tVar.f155c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i10 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
            }
        }
    }

    public static synchronized t c(Context context) {
        try {
            if (f150e == null) {
                f150e = new t(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f150e;
    }

    public int d() {
        int i10;
        synchronized (this.f156d) {
            i10 = this.f153a;
        }
        return i10;
    }
}
