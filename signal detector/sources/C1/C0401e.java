package c1;

import A1.r;
import A1.t;
import V0.m;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import h1.InterfaceC2361a;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401e extends AbstractC0400d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f5890j = m.h("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f5891g;

    /* renamed from: h, reason: collision with root package name */
    public final r f5892h;
    public final t i;

    public C0401e(Context context, InterfaceC2361a interfaceC2361a) {
        super(context, interfaceC2361a);
        this.f5891g = (ConnectivityManager) this.f5886b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5892h = new r(1, this);
        } else {
            this.i = new t(7, this);
        }
    }

    @Override // c1.AbstractC0400d
    public final Object a() {
        return f();
    }

    @Override // c1.AbstractC0400d
    public final void d() {
        int i = Build.VERSION.SDK_INT;
        String str = f5890j;
        if (i < 24) {
            m.f().a(str, "Registering broadcast receiver", new Throwable[0]);
            this.f5886b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            m.f().a(str, "Registering network callback", new Throwable[0]);
            this.f5891g.registerDefaultNetworkCallback(this.f5892h);
        } catch (IllegalArgumentException | SecurityException e6) {
            m.f().e(str, "Received exception while registering network callback", e6);
        }
    }

    @Override // c1.AbstractC0400d
    public final void e() {
        int i = Build.VERSION.SDK_INT;
        String str = f5890j;
        if (i < 24) {
            m.f().a(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.f5886b.unregisterReceiver(this.i);
            return;
        }
        try {
            m.f().a(str, "Unregistering network callback", new Throwable[0]);
            this.f5891g.unregisterNetworkCallback(this.f5892h);
        } catch (IllegalArgumentException | SecurityException e6) {
            m.f().e(str, "Received exception while unregistering network callback", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a1.C0262a f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.f5891g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r5 = r3
            goto L3b
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = r2
            goto L3b
        L2b:
            V0.m r6 = V0.m.f()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = c1.C0401e.f5890j
            java.lang.String r8 = "Unable to validate active network"
            r6.e(r5, r8, r7)
            goto L29
        L3b:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L48
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L48
            r2 = r3
        L48:
            a1.a r1 = new a1.a
            r1.<init>()
            r1.f4645a = r4
            r1.f4646b = r5
            r1.f4647c = r0
            r1.f4648d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0401e.f():a1.a");
    }
}
