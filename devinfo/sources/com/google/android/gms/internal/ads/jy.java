package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jy {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f12871a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f12872b;

    /* renamed from: c, reason: collision with root package name */
    public final p50 f12873c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12874d;

    public jy(nu nuVar, Handler handler, p50 p50Var) {
        this.f12872b = handler;
        this.f12873c = p50Var;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            this.f12871a = new vx(nuVar, handler);
        } else {
            this.f12871a = nuVar;
        }
        this.f12874d = i4 >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes(p50Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(nuVar, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return Objects.equals(this.f12871a, jyVar.f12871a) && Objects.equals(this.f12872b, jyVar.f12872b) && Objects.equals(this.f12873c, jyVar.f12873c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f12871a, this.f12872b, this.f12873c, Boolean.FALSE);
    }
}
