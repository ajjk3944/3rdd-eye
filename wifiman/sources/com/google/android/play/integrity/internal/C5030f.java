package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.integrity.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5030f {

    /* renamed from: o, reason: collision with root package name */
    private static final Map f38128o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f38129a;

    /* renamed from: b, reason: collision with root package name */
    private final F f38130b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38131c;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38135g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f38136h;

    /* renamed from: i, reason: collision with root package name */
    private final M f38137i;

    /* renamed from: m, reason: collision with root package name */
    private ServiceConnection f38141m;

    /* renamed from: n, reason: collision with root package name */
    private IInterface f38142n;

    /* renamed from: d, reason: collision with root package name */
    private final List f38132d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f38133e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f38134f = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f38139k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.H
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C5030f.k(this.f38115a);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f38140l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference f38138j = new WeakReference(null);

    public C5030f(Context context, F f10, String str, Intent intent, M m10, L l10) {
        this.f38129a = context;
        this.f38130b = f10;
        this.f38131c = str;
        this.f38136h = intent;
        this.f38137i = m10;
    }

    public static /* synthetic */ void k(C5030f c5030f) {
        c5030f.f38130b.d("reportBinderDeath", new Object[0]);
        AbstractC5487d.a(c5030f.f38138j.get());
        c5030f.f38130b.d("%s : Binder has died.", c5030f.f38131c);
        Iterator it = c5030f.f38132d.iterator();
        while (it.hasNext()) {
            ((G) it.next()).a(c5030f.w());
        }
        c5030f.f38132d.clear();
        synchronized (c5030f.f38134f) {
            c5030f.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final C5030f c5030f, final TaskCompletionSource taskCompletionSource) {
        c5030f.f38133e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.I
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f38116a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(C5030f c5030f, G g10) {
        if (c5030f.f38142n != null || c5030f.f38135g) {
            if (!c5030f.f38135g) {
                g10.run();
                return;
            } else {
                c5030f.f38130b.d("Waiting to bind to the service.", new Object[0]);
                c5030f.f38132d.add(g10);
                return;
            }
        }
        c5030f.f38130b.d("Initiate binding to the service.", new Object[0]);
        c5030f.f38132d.add(g10);
        ServiceConnectionC5029e serviceConnectionC5029e = new ServiceConnectionC5029e(c5030f, null);
        c5030f.f38141m = serviceConnectionC5029e;
        c5030f.f38135g = true;
        if (c5030f.f38129a.bindService(c5030f.f38136h, serviceConnectionC5029e, 1)) {
            return;
        }
        c5030f.f38130b.d("Failed to bind to the service.", new Object[0]);
        c5030f.f38135g = false;
        Iterator it = c5030f.f38132d.iterator();
        while (it.hasNext()) {
            ((G) it.next()).a(new af());
        }
        c5030f.f38132d.clear();
    }

    static /* bridge */ /* synthetic */ void r(C5030f c5030f) throws RemoteException {
        c5030f.f38130b.d("linkToDeath", new Object[0]);
        try {
            c5030f.f38142n.asBinder().linkToDeath(c5030f.f38139k, 0);
        } catch (RemoteException e10) {
            c5030f.f38130b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C5030f c5030f) {
        c5030f.f38130b.d("unlinkToDeath", new Object[0]);
        c5030f.f38142n.asBinder().unlinkToDeath(c5030f.f38139k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f38131c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f38133e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f38133e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f38128o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f38131c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f38131c, 10);
                    handlerThread.start();
                    map.put(this.f38131c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f38131c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f38142n;
    }

    public final void t(G g10, TaskCompletionSource taskCompletionSource) {
        c().post(new J(this, g10.c(), taskCompletionSource, g10));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f38134f) {
            this.f38133e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f38134f) {
            this.f38133e.remove(taskCompletionSource);
        }
        c().post(new K(this));
    }
}
