package yb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import ba.l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f26228a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f26229b;

    /* renamed from: c, reason: collision with root package name */
    public q3.a f26230c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f26231d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f26232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f26233f;

    public i(k kVar) {
        this.f26233f = kVar;
        yh.a aVar = new yh.a(Looper.getMainLooper(), new ge.k(1, this), 5);
        Looper.getMainLooper();
        this.f26229b = new Messenger(aVar);
        this.f26231d = new ArrayDeque();
        this.f26232e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i10 = this.f26228a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f26228a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f26228a = 4;
            fc.a.b().c((Context) this.f26233f.f26241b, this);
            l lVar = new l(str, securityException);
            Iterator it = this.f26231d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b(lVar);
            }
            this.f26231d.clear();
            for (int i11 = 0; i11 < this.f26232e.size(); i11++) {
                ((j) this.f26232e.valueAt(i11)).b(lVar);
            }
            this.f26232e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        if (this.f26228a == 2 && this.f26231d.isEmpty() && this.f26232e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f26228a = 3;
            fc.a.b().c((Context) this.f26233f.f26241b, this);
        }
    }

    public final synchronized boolean d(j jVar) {
        int i10 = this.f26228a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f26231d.add(jVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f26231d.add(jVar);
            ((ScheduledExecutorService) this.f26233f.f26242c).execute(new h(this, 0));
            return true;
        }
        this.f26231d.add(jVar);
        if (this.f26228a != 0) {
            throw new IllegalStateException();
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.f26228a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (fc.a.b().a((Context) this.f26233f.f26241b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f26233f.f26242c).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e4) {
            b("Unable to bind to service", e4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f26233f.f26242c).execute(new re.a(this, 24, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f26233f.f26242c).execute(new h(this, 2));
    }
}
