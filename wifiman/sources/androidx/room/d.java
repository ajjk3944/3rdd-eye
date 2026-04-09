package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f32307a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c f32308b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f32309c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f32310d;

    /* renamed from: e, reason: collision with root package name */
    private int f32311e;

    /* renamed from: f, reason: collision with root package name */
    public c.AbstractC1124c f32312f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.room.b f32313g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.room.a f32314h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f32315i;

    /* renamed from: j, reason: collision with root package name */
    private final ServiceConnection f32316j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f32317k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f32318l;

    public static final class a extends c.AbstractC1124c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC1124c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC1124c
        public void c(Set tables) {
            AbstractC6492s.i(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b bVarH = d.this.h();
                if (bVarH != null) {
                    bVarH.f0(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends a.AbstractBinderC1121a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(d this$0, String[] tables) {
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void r(final String[] tables) {
            AbstractC6492s.i(tables, "tables");
            Executor executorD = d.this.d();
            final d dVar = d.this;
            executorD.execute(new Runnable() { // from class: m2.o
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.f(dVar, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(service, "service");
            d.this.m(b.a.b(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC6492s.i(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(serviceIntent, "serviceIntent");
        AbstractC6492s.i(invalidationTracker, "invalidationTracker");
        AbstractC6492s.i(executor, "executor");
        this.f32307a = name;
        this.f32308b = invalidationTracker;
        this.f32309c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f32310d = applicationContext;
        this.f32314h = new b();
        this.f32315i = new AtomicBoolean(false);
        c cVar = new c();
        this.f32316j = cVar;
        this.f32317k = new Runnable() { // from class: m2.m
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.n(this.f53035a);
            }
        };
        this.f32318l = new Runnable() { // from class: m2.n
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.k(this.f53036a);
            }
        };
        l(new a((String[]) invalidationTracker.i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.f32308b.n(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d this$0) {
        AbstractC6492s.i(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f32313g;
            if (bVar != null) {
                this$0.f32311e = bVar.y(this$0.f32314h, this$0.f32307a);
                this$0.f32308b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f32311e;
    }

    public final Executor d() {
        return this.f32309c;
    }

    public final androidx.room.c e() {
        return this.f32308b;
    }

    public final c.AbstractC1124c f() {
        c.AbstractC1124c abstractC1124c = this.f32312f;
        if (abstractC1124c != null) {
            return abstractC1124c;
        }
        AbstractC6492s.v("observer");
        return null;
    }

    public final Runnable g() {
        return this.f32318l;
    }

    public final androidx.room.b h() {
        return this.f32313g;
    }

    public final Runnable i() {
        return this.f32317k;
    }

    public final AtomicBoolean j() {
        return this.f32315i;
    }

    public final void l(c.AbstractC1124c abstractC1124c) {
        AbstractC6492s.i(abstractC1124c, "<set-?>");
        this.f32312f = abstractC1124c;
    }

    public final void m(androidx.room.b bVar) {
        this.f32313g = bVar;
    }
}
