package k4;

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
import com.google.android.play.core.review.internal.zzu;
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

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: n, reason: collision with root package name */
    private static final Map f51214n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f51215a;

    /* renamed from: b, reason: collision with root package name */
    private final i f51216b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f51221g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f51222h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f51226l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f51227m;

    /* renamed from: d, reason: collision with root package name */
    private final List f51218d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f51219e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f51220f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f51224j = new IBinder.DeathRecipient() { // from class: k4.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f51203a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f51225k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f51217c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f51223i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, j4.h hVar, o oVar) {
        this.f51215a = context;
        this.f51216b = iVar;
        this.f51222h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f51216b.c("reportBinderDeath", new Object[0]);
        AbstractC5487d.a(tVar.f51223i.get());
        tVar.f51216b.c("%s : Binder has died.", tVar.f51217c);
        Iterator it = tVar.f51218d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(tVar.v());
        }
        tVar.f51218d.clear();
        synchronized (tVar.f51220f) {
            tVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final t tVar, final TaskCompletionSource taskCompletionSource) {
        tVar.f51219e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: k4.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f51204a.t(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f51227m != null || tVar.f51221g) {
            if (!tVar.f51221g) {
                jVar.run();
                return;
            } else {
                tVar.f51216b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f51218d.add(jVar);
                return;
            }
        }
        tVar.f51216b.c("Initiate binding to the service.", new Object[0]);
        tVar.f51218d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f51226l = rVar;
        tVar.f51221g = true;
        if (tVar.f51215a.bindService(tVar.f51222h, rVar, 1)) {
            return;
        }
        tVar.f51216b.c("Failed to bind to the service.", new Object[0]);
        tVar.f51221g = false;
        Iterator it = tVar.f51218d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new zzu());
        }
        tVar.f51218d.clear();
    }

    static /* bridge */ /* synthetic */ void q(t tVar) throws RemoteException {
        tVar.f51216b.c("linkToDeath", new Object[0]);
        try {
            tVar.f51227m.asBinder().linkToDeath(tVar.f51224j, 0);
        } catch (RemoteException e10) {
            tVar.f51216b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f51216b.c("unlinkToDeath", new Object[0]);
        tVar.f51227m.asBinder().unlinkToDeath(tVar.f51224j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f51217c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f51219e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(v());
        }
        this.f51219e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f51214n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f51217c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f51217c, 10);
                    handlerThread.start();
                    map.put(this.f51217c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f51217c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f51227m;
    }

    public final void s(j jVar, TaskCompletionSource taskCompletionSource) {
        c().post(new m(this, jVar.b(), taskCompletionSource, jVar));
    }

    final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f51220f) {
            this.f51219e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f51220f) {
            this.f51219e.remove(taskCompletionSource);
        }
        c().post(new n(this));
    }
}
