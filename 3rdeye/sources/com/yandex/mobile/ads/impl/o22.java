package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.m60;

/* loaded from: classes3.dex */
final class o22 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31142a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f31143b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31144c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f31145d;

    /* renamed from: e, reason: collision with root package name */
    private b f31146e;

    /* renamed from: f, reason: collision with root package name */
    private int f31147f;

    /* renamed from: g, reason: collision with root package name */
    private int f31148g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31149h;

    public interface a {
    }

    public final class b extends BroadcastReceiver {
        public /* synthetic */ b(o22 o22Var, int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void a(o22 o22Var) {
            int iB = o22.b(o22Var.f31145d, o22Var.f31147f);
            boolean zA = o22.a(o22Var.f31145d, o22Var.f31147f);
            if (o22Var.f31148g == iB && o22Var.f31149h == zA) {
                return;
            }
            o22Var.f31148g = iB;
            o22Var.f31149h = zA;
            ((m60.b) o22Var.f31144c).a(zA, iB);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o22 o22Var = o22.this;
            o22Var.f31143b.post(new J2(o22Var, 1));
        }

        private b() {
        }
    }

    public o22(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f31142a = applicationContext;
        this.f31143b = handler;
        this.f31144c = aVar;
        AudioManager audioManager = (AudioManager) zf.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f31145d = audioManager;
        this.f31147f = 3;
        this.f31148g = b(audioManager, 3);
        this.f31149h = a(audioManager, this.f31147f);
        b bVar = new b(this, 0);
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f31146e = bVar;
        } catch (RuntimeException e4) {
            rs0.b("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e4) {
            rs0.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e4);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final int a() {
        return this.f31145d.getStreamMaxVolume(this.f31147f);
    }

    public final void c() {
        b bVar = this.f31146e;
        if (bVar != null) {
            try {
                this.f31142a.unregisterReceiver(bVar);
            } catch (RuntimeException e4) {
                rs0.b("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            this.f31146e = null;
        }
    }

    public final void a(int i) {
        if (this.f31147f == i) {
            return;
        }
        this.f31147f = i;
        int iB = b(this.f31145d, i);
        boolean zA = a(this.f31145d, this.f31147f);
        if (this.f31148g != iB || this.f31149h != zA) {
            this.f31148g = iB;
            this.f31149h = zA;
            ((m60.b) this.f31144c).a(zA, iB);
        }
        ((m60.b) this.f31144c).d();
    }

    public final int b() {
        if (s82.f32899a >= 28) {
            return this.f31145d.getStreamMinVolume(this.f31147f);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(AudioManager audioManager, int i) {
        if (s82.f32899a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return b(audioManager, i) == 0;
    }
}
