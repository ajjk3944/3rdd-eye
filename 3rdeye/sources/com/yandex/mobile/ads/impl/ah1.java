package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.zr0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ah1 extends BroadcastReceiver {

    /* renamed from: h, reason: collision with root package name */
    public static final a f24667h = new a(0);
    private static volatile ah1 i;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24668a;

    /* renamed from: b, reason: collision with root package name */
    private final ew1 f24669b;

    /* renamed from: c, reason: collision with root package name */
    private final zg1 f24670c;

    /* renamed from: d, reason: collision with root package name */
    private final yg1 f24671d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakHashMap<b, Object> f24672e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f24673f;

    /* renamed from: g, reason: collision with root package name */
    private xg1 f24674g;

    public static final class a {
        private a() {
        }

        public final ah1 a(Context context) {
            ah1 ah1Var;
            kotlin.jvm.internal.l.f(context, "context");
            ah1 ah1Var2 = ah1.i;
            if (ah1Var2 != null) {
                return ah1Var2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Executor executorC = zr0.a.a().c();
                ah1Var = ah1.i;
                if (ah1Var == null) {
                    kotlin.jvm.internal.l.c(applicationContext);
                    ah1Var = new ah1(applicationContext, executorC);
                    ah1.i = ah1Var;
                }
            }
            return ah1Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public interface b {
        void a(xg1 xg1Var);
    }

    public /* synthetic */ ah1(Context context, Executor executor) {
        this(context, executor, ew1.a.a(), new zg1(context), new yg1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ah1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        xg1 xg1VarA = this$0.f24670c.a();
        this$0.f24674g = xg1VarA;
        Objects.toString(xg1VarA);
        fp0.d(new Object[0]);
        try {
            this$0.f24671d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                this$0.f24668a.registerReceiver(this$0, intentFilter, 2);
            } else {
                this$0.f24668a.registerReceiver(this$0, intentFilter);
            }
        } catch (Exception unused) {
            int i10 = fp0.f27419b;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xg1 xg1Var;
        HashSet hashSet;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(intent, "intent");
        synchronized (this.f24673f) {
            try {
                xg1 xg1Var2 = this.f24674g;
                String action = intent.getAction();
                xg1 xg1Var3 = kotlin.jvm.internal.l.b(action, "android.intent.action.SCREEN_OFF") ? xg1.f35302c : kotlin.jvm.internal.l.b(action, "android.intent.action.USER_PRESENT") ? xg1.f35303d : (this.f24674g == xg1.f35303d || !kotlin.jvm.internal.l.b(action, "android.intent.action.SCREEN_ON")) ? this.f24674g : xg1.f35301b;
                this.f24674g = xg1Var3;
                if (xg1Var2 != xg1Var3) {
                    Objects.toString(xg1Var3);
                    fp0.d(new Object[0]);
                }
                xg1Var = this.f24674g;
                hashSet = new HashSet(this.f24672e.keySet());
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(xg1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x000e, B:8:0x0014, B:10:0x001a, B:15:0x0021), top: B:23:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.ew1 r0 = r4.f24669b
            android.content.Context r1 = r4.f24668a
            com.yandex.mobile.ads.impl.du1 r0 = r0.a(r1)
            java.lang.Object r1 = r4.f24673f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L21
            boolean r0 = r0.t0()     // Catch: java.lang.Throwable -> L1f
            if (r0 != r2) goto L21
            com.yandex.mobile.ads.impl.xg1 r0 = r4.f24674g     // Catch: java.lang.Throwable -> L1f
            com.yandex.mobile.ads.impl.xg1 r3 = com.yandex.mobile.ads.impl.xg1.f35301b     // Catch: java.lang.Throwable -> L1f
            if (r0 == r3) goto L29
            com.yandex.mobile.ads.impl.xg1 r3 = com.yandex.mobile.ads.impl.xg1.f35303d     // Catch: java.lang.Throwable -> L1f
            if (r0 != r3) goto L28
            goto L29
        L1f:
            r0 = move-exception
            goto L2b
        L21:
            com.yandex.mobile.ads.impl.xg1 r0 = r4.f24674g     // Catch: java.lang.Throwable -> L1f
            com.yandex.mobile.ads.impl.xg1 r3 = com.yandex.mobile.ads.impl.xg1.f35303d     // Catch: java.lang.Throwable -> L1f
            if (r0 != r3) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            monitor-exit(r1)
            return r2
        L2b:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ah1.b():boolean");
    }

    private ah1(Context context, Executor executor, ew1 ew1Var, zg1 zg1Var, yg1 yg1Var) {
        this.f24668a = context;
        this.f24669b = ew1Var;
        this.f24670c = zg1Var;
        this.f24671d = yg1Var;
        this.f24672e = new WeakHashMap<>();
        this.f24673f = new Object();
        this.f24674g = xg1.f35303d;
        executor.execute(new Z(this, 4));
    }

    public final void b(b callback) {
        kotlin.jvm.internal.l.f(callback, "callback");
        synchronized (this.f24673f) {
            this.f24672e.remove(callback);
        }
    }

    public final void a(b callback) {
        kotlin.jvm.internal.l.f(callback, "callback");
        synchronized (this.f24673f) {
            this.f24672e.put(callback, null);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
