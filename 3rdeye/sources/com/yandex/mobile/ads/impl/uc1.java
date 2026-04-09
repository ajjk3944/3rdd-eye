package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class uc1 {

    /* renamed from: e, reason: collision with root package name */
    private static uc1 f34028e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f34029a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f34030b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f34031c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f34032d = 0;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.uc1$a$a, reason: collision with other inner class name */
        public static final class C0422a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final uc1 f34033a;

            public C0422a(uc1 uc1Var) {
                this.f34033a = uc1Var;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f34033a.a(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, uc1 uc1Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C0422a c0422a = new C0422a(uc1Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c0422a);
                telephonyManager.unregisterTelephonyCallback(c0422a);
            } catch (RuntimeException unused) {
                uc1Var.a(5);
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public final class c extends BroadcastReceiver {
        public /* synthetic */ c(uc1 uc1Var, int i) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int iB = uc1.b(context);
            if (s82.f32899a < 31 || iB != 5) {
                uc1.this.a(iB);
            } else {
                a.a(context, uc1.this);
            }
        }

        private c() {
        }
    }

    private uc1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(this, 0), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return s82.f32899a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final int a() {
        int i;
        synchronized (this.f34031c) {
            i = this.f34032d;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.f34031c) {
            try {
                if (this.f34032d == i) {
                    return;
                }
                this.f34032d = i;
                Iterator<WeakReference<b>> it = this.f34030b.iterator();
                while (it.hasNext()) {
                    WeakReference<b> next = it.next();
                    b bVar = next.get();
                    if (bVar != null) {
                        bVar.a(i);
                    } else {
                        this.f34030b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(b bVar) {
        Iterator<WeakReference<b>> it = this.f34030b.iterator();
        while (it.hasNext()) {
            WeakReference<b> next = it.next();
            if (next.get() == null) {
                this.f34030b.remove(next);
            }
        }
        this.f34030b.add(new WeakReference<>(bVar));
        this.f34029a.post(new V1(16, this, bVar));
    }

    public static synchronized uc1 a(Context context) {
        try {
            if (f34028e == null) {
                f34028e = new uc1(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f34028e;
    }
}
