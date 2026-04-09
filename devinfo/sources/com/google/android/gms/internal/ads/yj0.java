package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yj0 {

    /* renamed from: f, reason: collision with root package name */
    public static yj0 f18776f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f18777a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f18778b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18779c;

    /* renamed from: d, reason: collision with root package name */
    public int f18780d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18781e;

    public yj0(Context context) {
        Executor executorE = a80.e();
        this.f18777a = executorE;
        this.f18778b = new CopyOnWriteArrayList();
        this.f18779c = new Object();
        this.f18780d = 0;
        executorE.execute(new uh0(2, this, context));
    }

    public static synchronized yj0 a(Context context) {
        try {
            if (f18776f == null) {
                f18776f = new yj0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18776f;
    }

    public final int b() {
        int i4;
        synchronized (this.f18779c) {
            i4 = this.f18780d;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 5
            if (r0 != 0) goto Ld
            goto L4e
        Ld:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            r3 = 1
            if (r0 == 0) goto L1a
            boolean r4 = r0.isConnected()
            if (r4 != 0) goto L1c
        L1a:
            r1 = r3
            goto L4e
        L1c:
            int r4 = r0.getType()
            r5 = 2
            r6 = 9
            r7 = 6
            r8 = 4
            if (r4 == 0) goto L3a
            if (r4 == r3) goto L38
            if (r4 == r8) goto L3a
            if (r4 == r2) goto L3a
            if (r4 == r7) goto L36
            if (r4 == r6) goto L34
            r1 = 8
            goto L4e
        L34:
            r1 = 7
            goto L4e
        L36:
            r1 = r2
            goto L4e
        L38:
            r1 = r5
            goto L4e
        L3a:
            int r0 = r0.getSubtype()
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L36;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L41;
                case 17: goto L4b;
                case 18: goto L38;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r1 = r7
            goto L4e
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L4e
            r1 = r6
            goto L4e
        L4b:
            r1 = r8
            goto L4e
        L4d:
            r1 = 3
        L4e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L74
            if (r1 != r2) goto L74
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L70
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L70
            if (r10 == 0) goto L6e
            com.google.android.gms.internal.ads.hh0 r0 = new com.google.android.gms.internal.ads.hh0     // Catch: java.lang.RuntimeException -> L70
            r0.<init>(r9)     // Catch: java.lang.RuntimeException -> L70
            java.util.concurrent.Executor r1 = r9.f18777a     // Catch: java.lang.RuntimeException -> L70
            r10.registerTelephonyCallback(r1, r0)     // Catch: java.lang.RuntimeException -> L70
            r10.unregisterTelephonyCallback(r0)     // Catch: java.lang.RuntimeException -> L70
            return
        L6e:
            r10 = 0
            throw r10     // Catch: java.lang.RuntimeException -> L70
        L70:
            r9.d(r2)
            return
        L74:
            r9.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yj0.c(android.content.Context):void");
    }

    public final void d(int i4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18778b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            oi0 oi0Var = (oi0) it.next();
            if (oi0Var.f14704a.get() == null) {
                copyOnWriteArrayList.remove(oi0Var);
            }
        }
        synchronized (this.f18779c) {
            try {
                if (this.f18781e && this.f18780d == i4) {
                    return;
                }
                this.f18781e = true;
                this.f18780d = i4;
                Iterator it2 = this.f18778b.iterator();
                while (it2.hasNext()) {
                    oi0 oi0Var2 = (oi0) it2.next();
                    oi0Var2.getClass();
                    oi0Var2.f14705b.execute(new s30(17, oi0Var2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
