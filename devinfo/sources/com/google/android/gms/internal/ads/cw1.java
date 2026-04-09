package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cw1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final ne0 f10235b;

    /* renamed from: c, reason: collision with root package name */
    public yf0 f10236c;

    /* renamed from: d, reason: collision with root package name */
    public w5 f10237d;

    /* renamed from: e, reason: collision with root package name */
    public ev1 f10238e;

    /* renamed from: f, reason: collision with root package name */
    public xi0 f10239f;
    public Looper g;

    /* renamed from: h, reason: collision with root package name */
    public Context f10240h;

    /* renamed from: i, reason: collision with root package name */
    public final fw1 f10241i;

    public /* synthetic */ cw1(av0 av0Var) {
        Context context = (Context) av0Var.f9422b;
        this.f10234a = context;
        fw1 fw1Var = (fw1) av0Var.f9424d;
        fw1Var.getClass();
        this.f10241i = fw1Var;
        this.f10238e = (ev1) av0Var.f9423c;
        this.f10235b = context == null ? null : new ne0(29, this);
        this.f10237d = w5.f17894f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.nv1 a(com.google.android.gms.internal.ads.lv1 r7) {
        /*
            r6 = this;
            r6.d(r7)
            java.lang.Object r0 = r7.f13643a
            com.google.android.gms.internal.ads.mx1 r0 = (com.google.android.gms.internal.ads.mx1) r0
            java.lang.Object r7 = r7.f13644b
            com.google.android.gms.internal.ads.p50 r7 = (com.google.android.gms.internal.ads.p50) r7
            com.google.android.gms.internal.ads.fw1 r1 = r6.f10241i
            com.google.android.gms.internal.ads.hv1 r1 = r1.a(r7, r0)
            com.google.android.gms.internal.ads.mv1 r2 = new com.google.android.gms.internal.ads.mv1
            r2.<init>()
            java.lang.String r3 = r0.f14052m
            java.lang.String r4 = "audio/raw"
            boolean r3 = j$.util.Objects.equals(r3, r4)
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L47
            int r7 = r0.G
            boolean r0 = com.google.android.gms.internal.ads.bq0.a(r7)
            if (r0 != 0) goto L41
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 22
            r3.<init>(r0)
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.String r5 = "ATAudioOutputProvider"
            a0.g.z(r3, r0, r7, r5)
            goto L50
        L41:
            if (r7 == r5) goto L45
            r4 = 1
            goto L50
        L45:
            r4 = r5
            goto L50
        L47:
            com.google.android.gms.internal.ads.ev1 r3 = r6.f10238e
            android.util.Pair r7 = r3.c(r7, r0)
            if (r7 == 0) goto L50
            goto L45
        L50:
            r2.f14033d = r4
            boolean r7 = r1.f11990a
            r2.f14030a = r7
            boolean r7 = r1.f11991b
            r2.f14031b = r7
            boolean r7 = r1.f11992c
            r2.f14032c = r7
            com.google.android.gms.internal.ads.nv1 r7 = r2.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.a(com.google.android.gms.internal.ads.lv1):com.google.android.gms.internal.ads.nv1");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.pv1 b(com.google.android.gms.internal.ads.lv1 r22) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.b(com.google.android.gms.internal.ads.lv1):com.google.android.gms.internal.ads.pv1");
    }

    public final bw1 c(pv1 pv1Var) throws UnsupportedOperationException, ov1, IllegalArgumentException {
        Context context;
        try {
            int i4 = pv1Var.f15124f;
            int i10 = pv1Var.g;
            Context context2 = null;
            if (i10 != -1 && (context = this.f10234a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f10240h;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f10240h = context.createDeviceContext(i10);
                }
                context2 = this.f10240h;
                i4 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(pv1Var.f15123e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(pv1Var.f15120b).setChannelMask(pv1Var.f15121c).setEncoding(pv1Var.f15119a).build()).setTransferMode(1).setBufferSizeInBytes(pv1Var.f15122d).setSessionId(i4);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i11 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new bw1(audioTrackBuild, pv1Var, this.f10235b, this.f10237d);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new ov1();
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new ov1(e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new ov1(e);
        }
    }

    public final void d(lv1 lv1Var) {
        Context context;
        ev1 ev1VarB;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) lv1Var.f13645c;
        p50 p50Var = (p50) lv1Var.f13644b;
        e();
        xi0 xi0Var = this.f10239f;
        if (xi0Var == null && (context = this.f10234a) != null) {
            xi0 xi0Var2 = new xi0(context, new rg0(25, this), p50Var, audioDeviceInfo);
            this.f10239f = xi0Var2;
            if (xi0Var2.f18393b) {
                ev1VarB = (ev1) xi0Var2.f18398h;
                ev1VarB.getClass();
            } else {
                xi0Var2.f18393b = true;
                gv1 gv1Var = (gv1) xi0Var2.g;
                if (gv1Var != null) {
                    gv1Var.f11616a.registerContentObserver(gv1Var.f11617b, false, gv1Var);
                }
                Context context2 = (Context) xi0Var2.f18392a;
                fv1 fv1Var = (fv1) xi0Var2.f18396e;
                Handler handler = (Handler) xi0Var2.f18395d;
                jz.d(context2).registerAudioDeviceCallback(fv1Var, handler);
                ev1VarB = ev1.b(context2, context2.registerReceiver((kf) xi0Var2.f18397f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (p50) xi0Var2.j, (AudioDeviceInfo) xi0Var2.f18399i);
                xi0Var2.f18398h = ev1VarB;
            }
            this.f10238e = ev1VarB;
        } else if (xi0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) xi0Var.f18399i)) {
                xi0Var.f18399i = audioDeviceInfo;
                xi0Var.h(ev1.a((Context) xi0Var.f18392a, (p50) xi0Var.j, audioDeviceInfo));
            }
            xi0 xi0Var3 = this.f10239f;
            if (!Objects.equals(p50Var, (p50) xi0Var3.j)) {
                xi0Var3.j = p50Var;
                xi0Var3.h(ev1.a((Context) xi0Var3.f18392a, p50Var, (AudioDeviceInfo) xi0Var3.f18399i));
            }
        }
        this.f10238e.getClass();
    }

    public final void e() {
        if (this.f10234a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.g;
        boolean z3 = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z3) {
            throw new IllegalStateException(al0.H("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.g = looperMyLooper;
    }
}
