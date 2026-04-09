package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes3.dex */
public final class mq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30480a;

    /* renamed from: b, reason: collision with root package name */
    private final b f30481b;

    /* renamed from: c, reason: collision with root package name */
    private final lq1 f30482c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f30483d;

    /* renamed from: e, reason: collision with root package name */
    private int f30484e;

    /* renamed from: f, reason: collision with root package name */
    private c f30485f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f30486g;

    public class a extends BroadcastReceiver {
        public /* synthetic */ a(mq1 mq1Var, int i) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            mq1.this.a();
        }

        private a() {
        }
    }

    public interface b {
        void a(mq1 mq1Var, int i);
    }

    public final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30488a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30489b;

        public /* synthetic */ c(mq1 mq1Var, int i) {
            this();
        }

        private void c() {
            mq1.this.f30483d.post(new J2(this, 0));
        }

        private void d() {
            mq1.this.f30483d.post(new N(this, 1));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f30488a && this.f30489b == zHasCapability) {
                if (zHasCapability) {
                    d();
                }
            } else {
                this.f30488a = true;
                this.f30489b = zHasCapability;
                c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            mq1 mq1Var = mq1.this;
            if (mq1Var.f30485f != null) {
                mq1Var.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            mq1 mq1Var = mq1.this;
            if (mq1Var.f30485f == null || (mq1Var.f30484e & 3) == 0) {
                return;
            }
            mq1Var.a();
        }
    }

    public mq1(Context context, b bVar) {
        lq1 lq1Var = t30.f33396h;
        this.f30480a = context.getApplicationContext();
        this.f30481b = bVar;
        this.f30482c = lq1Var;
        this.f30483d = s82.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f30486g = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f30486g.post(new Z(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        int iA = this.f30482c.a(this.f30480a);
        if (this.f30484e != iA) {
            this.f30484e = iA;
            this.f30483d.post(new com.applovin.impl.K(iA, 2, this));
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        int i = 0;
        if (this.f30482c.e()) {
            if (s82.f32899a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f30480a.getSystemService("connectivity");
                connectivityManager.getClass();
                c cVar = new c(this, i);
                this.f30485f = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f30482c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f30482c.d()) {
            if (s82.f32899a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f30482c.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f30480a.registerReceiver(new a(this, i), intentFilter, null, this.f30483d);
        return this.f30484e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        this.f30481b.a(this, i);
    }
}
