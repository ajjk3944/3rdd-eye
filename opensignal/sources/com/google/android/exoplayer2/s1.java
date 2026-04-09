package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4444a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4445b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4446c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f4447d;

    /* renamed from: e, reason: collision with root package name */
    public int f4448e;

    /* renamed from: f, reason: collision with root package name */
    public int f4449f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4450g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4451h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver f4452i;

    public s1(Context context, Handler handler, r1 r1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f4445b = applicationContext;
        this.f4446c = handler;
        this.f4451h = r1Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        qb.b.k(audioManager);
        this.f4447d = audioManager;
        this.f4448e = 3;
        this.f4449f = a(audioManager, 3);
        int i10 = this.f4448e;
        this.f4450g = qb.v.f20828a >= 23 ? audioManager.isStreamMute(i10) : a(audioManager, i10) == 0;
        a5.s sVar = new a5.s(1, this);
        try {
            applicationContext.registerReceiver(sVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4452i = sVar;
        } catch (RuntimeException e4) {
            qb.b.J("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }

    public static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e4) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            qb.b.J("StreamVolumeManager", sb2.toString(), e4);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e4) {
            a5.a.C("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e4);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public void c(int i10) {
        if (this.f4448e == i10) {
            return;
        }
        this.f4448e = i10;
        d();
        d5.z zVar = ((d5.w) this.f4451h).f7095a;
        s1 s1Var = zVar.Y;
        s1Var.getClass();
        AudioManager audioManager = s1Var.f4447d;
        androidx.media3.common.m mVar = new androidx.media3.common.m(0, a5.d0.f105a >= 28 ? audioManager.getStreamMinVolume(s1Var.f4448e) : 0, audioManager.getStreamMaxVolume(s1Var.f4448e));
        if (mVar.equals(zVar.M0)) {
            return;
        }
        zVar.M0 = mVar;
        zVar.I.f(29, new bf.a(10, mVar));
    }

    public final void d() {
        switch (this.f4444a) {
            case 0:
                int i10 = this.f4448e;
                AudioManager audioManager = this.f4447d;
                int iA = a(audioManager, i10);
                int i11 = this.f4448e;
                boolean zIsStreamMute = qb.v.f20828a >= 23 ? audioManager.isStreamMute(i11) : a(audioManager, i11) == 0;
                if (this.f4449f != iA || this.f4450g != zIsStreamMute) {
                    this.f4449f = iA;
                    this.f4450g = zIsStreamMute;
                    ((r1) this.f4451h).onStreamVolumeChanged(iA, zIsStreamMute);
                    break;
                }
                break;
            default:
                int i12 = this.f4448e;
                AudioManager audioManager2 = this.f4447d;
                final int iB = b(audioManager2, i12);
                int i13 = this.f4448e;
                final boolean zIsStreamMute2 = a5.d0.f105a >= 23 ? audioManager2.isStreamMute(i13) : b(audioManager2, i13) == 0;
                if (this.f4449f != iB || this.f4450g != zIsStreamMute2) {
                    this.f4449f = iB;
                    this.f4450g = zIsStreamMute2;
                    ((d5.w) this.f4451h).f7095a.I.f(30, new a5.j() { // from class: d5.u
                        @Override // a5.j
                        public final void a(Object obj) {
                            ((androidx.media3.common.q0) obj).onDeviceVolumeChanged(iB, zIsStreamMute2);
                        }
                    });
                    break;
                }
                break;
        }
    }

    public s1(Context context, Handler handler, d5.w wVar) {
        boolean zIsStreamMute;
        Context applicationContext = context.getApplicationContext();
        this.f4445b = applicationContext;
        this.f4446c = handler;
        this.f4451h = wVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        a5.a.j(audioManager);
        this.f4447d = audioManager;
        this.f4448e = 3;
        this.f4449f = b(audioManager, 3);
        int i10 = this.f4448e;
        if (a5.d0.f105a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i10);
        } else {
            zIsStreamMute = b(audioManager, i10) == 0;
        }
        this.f4450g = zIsStreamMute;
        a5.s sVar = new a5.s(3, this);
        try {
            applicationContext.registerReceiver(sVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4452i = sVar;
        } catch (RuntimeException e4) {
            a5.a.C("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }
}
