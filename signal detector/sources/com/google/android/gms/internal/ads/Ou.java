package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import j$.util.Objects;
import java.util.WeakHashMap;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Ou implements InterfaceC0162b, InterfaceC0163c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10270b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10271c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10272d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10273e;

    public Ou() {
        this.f10269a = false;
        this.f10272d = new WeakHashMap();
        this.f10271c = new A1.t(15, this);
    }

    public synchronized void a(Context context) {
        try {
            if (this.f10269a) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f10273e = applicationContext;
            if (applicationContext == null) {
                this.f10273e = context;
            }
            H9.a((Context) this.f10273e);
            E9 e9 = H9.f8870z4;
            C2841s c2841s = C2841s.f23267e;
            this.f10270b = ((Boolean) c2841s.f23270c.a(e9)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) c2841s.f23270c.a(H9.kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f10273e).registerReceiver((A1.t) this.f10271c, intentFilter);
            } else {
                ((Context) this.f10273e).registerReceiver((A1.t) this.f10271c, intentFilter, 4);
            }
            this.f10269a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(boolean z6) {
        if (this.f10270b == z6) {
            return;
        }
        this.f10270b = z6;
        if (this.f10269a) {
            e(true, z6);
        }
    }

    public void c() {
        synchronized (this.f10273e) {
            try {
                Pw pw = (Pw) this.f10271c;
                if (pw.i() || pw.d()) {
                    pw.h();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, A1.t tVar) {
        if (this.f10270b) {
            ((WeakHashMap) this.f10272d).remove(tVar);
        } else {
            context.unregisterReceiver(tVar);
        }
    }

    public void e(final boolean z6, final boolean z7) {
        C1231gt c1231gt = (C1231gt) this.f10272d;
        if (z6 && z7) {
            c1231gt.e(new A2.K(this, z6, z7, 1));
            return;
        }
        C0697Ql c0697Ql = (C0697Ql) this.f10271c;
        Objects.requireNonNull(c0697Ql);
        final RunnableC0558Ii runnableC0558Ii = new RunnableC0558Ii(28, c0697Ql);
        ((C1231gt) this.f10273e).f14397a.postDelayed(runnableC0558Ii, 1000L);
        c1231gt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Cu
            @Override // java.lang.Runnable
            public final void run() {
                Ou ou = this.f7685a;
                ((C1231gt) ou.f10273e).f14397a.removeCallbacks(runnableC0558Ii);
                ((C0697Ql) ou.f10271c).q(z6, z7);
            }
        });
    }

    @Override // M2.InterfaceC0162b
    public void h0() {
        synchronized (this.f10273e) {
            try {
                if (this.f10270b) {
                    return;
                }
                this.f10270b = true;
                try {
                    Sw sw = (Sw) ((Pw) this.f10271c).t();
                    Ow ow = new Ow(1, ((Lw) this.f10272d).b());
                    Parcel parcelH0 = sw.h0();
                    C7.c(parcelH0, ow);
                    sw.I0(parcelH0, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Ou(Context context, Looper looper, C1994v2 c1994v2) {
        this.f10271c = new C0697Ql(context.getApplicationContext());
        this.f10272d = c1994v2.B(looper, null);
        this.f10273e = c1994v2.B(Looper.getMainLooper(), null);
    }

    public Ou(Context context, Looper looper, Lw lw) {
        this.f10273e = new Object();
        this.f10269a = false;
        this.f10270b = false;
        this.f10272d = lw;
        this.f10271c = new Pw(context, looper, this, this, 12800000);
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) {
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) {
    }
}
