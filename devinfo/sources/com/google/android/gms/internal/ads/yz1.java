package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yz1 {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f18943a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18944b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18945c;

    /* renamed from: d, reason: collision with root package name */
    public final xz1 f18946d;

    public yz1(Context context, b bVar, Boolean bool) {
        AudioManager audioManagerD = context == null ? null : jz.d(context);
        if (audioManagerD == null || (bool != null && bool.booleanValue())) {
            this.f18943a = null;
            this.f18944b = false;
            this.f18945c = null;
            this.f18946d = null;
            return;
        }
        Spatializer spatializer = audioManagerD.getSpatializer();
        this.f18943a = spatializer;
        this.f18944b = spatializer.getImmersiveAudioLevel() != 0;
        xz1 xz1Var = new xz1(this, bVar);
        this.f18946d = xz1Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f18945c = handler;
        spatializer.addOnSpatializerStateChangedListener(new aa(handler, 2), xz1Var);
    }

    public final boolean a() {
        Spatializer spatializer = this.f18943a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean b() {
        Spatializer spatializer = this.f18943a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final boolean c(p50 p50Var, mx1 mx1Var) throws IllegalArgumentException {
        String str = mx1Var.f14052m;
        int i4 = mx1Var.E;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i4 == 16) {
                i4 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i4 == -1) {
                i4 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i4 == 18 || i4 == 21)) {
            i4 = 24;
        }
        int iB = bq0.b(i4);
        if (iB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iB);
        int i10 = mx1Var.F;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f18943a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(p50Var.a(), channelMask.build());
    }

    public final void d() {
        xz1 xz1Var;
        Handler handler;
        Spatializer spatializer = this.f18943a;
        if (spatializer == null || (xz1Var = this.f18946d) == null || (handler = this.f18945c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(xz1Var);
        handler.removeCallbacksAndMessages(null);
    }
}
