package y4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import u4.t;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f48117n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f48118a;

    /* renamed from: b, reason: collision with root package name */
    public final g f48119b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48124g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f48125h;

    /* renamed from: l, reason: collision with root package name */
    public t f48128l;

    /* renamed from: m, reason: collision with root package name */
    public e f48129m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f48121d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f48122e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f48123f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final u4.n f48126j = new u4.n(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f48127k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f48120c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public n(Context context, g gVar, Intent intent) {
        this.f48118a = context;
        this.f48119b = gVar;
        this.f48125h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f48117n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f48120c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f48120c, 10);
                    handlerThread.start();
                    map.put(this.f48120c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f48120c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f48123f) {
            try {
                Iterator it = this.f48122e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f48120c).concat(" : Binder has died.")));
                }
                this.f48122e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
