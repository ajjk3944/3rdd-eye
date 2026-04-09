package X3;

import S3.l;
import S3.o;
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
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f4178n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4179a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4180b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4185g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f4186h;

    /* renamed from: l, reason: collision with root package name */
    public o f4189l;

    /* renamed from: m, reason: collision with root package name */
    public d f4190m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4182d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f4183e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f4184f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final l f4187j = new l(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f4188k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f4181c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public h(Context context, e eVar, Intent intent) {
        this.f4179a = context;
        this.f4180b = eVar;
        this.f4186h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f4178n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f4181c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f4181c, 10);
                    handlerThread.start();
                    map.put(this.f4181c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f4181c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f4184f) {
            try {
                Iterator it = this.f4183e.iterator();
                while (it.hasNext()) {
                    ((c3.f) it.next()).a(new RemoteException(String.valueOf(this.f4181c).concat(" : Binder has died.")));
                }
                this.f4183e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
