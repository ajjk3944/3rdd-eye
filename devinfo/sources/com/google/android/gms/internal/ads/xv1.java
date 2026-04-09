package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xv1 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f18520a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f18521b;

    /* renamed from: c, reason: collision with root package name */
    public wv1 f18522c;

    /* renamed from: d, reason: collision with root package name */
    public final ne0 f18523d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, com.google.android.gms.internal.ads.wv1] */
    public /* synthetic */ xv1(AudioTrack audioTrack, ne0 ne0Var) {
        this.f18520a = audioTrack;
        this.f18523d = ne0Var;
        Handler handlerN = bq0.n();
        this.f18521b = handlerN;
        ?? r02 = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.wv1
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                xv1 xv1Var = this.f18208a;
                if (xv1Var.f18522c == null) {
                    return;
                }
                a80.e().execute(new uh0(26, xv1Var, audioRouting));
            }
        };
        this.f18522c = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting$OnRoutingChangedListener) r02, handlerN);
    }

    public final /* synthetic */ void a(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.f18521b.post(new uh0(27, this, routedDevice));
        }
    }

    public final /* synthetic */ void b() {
        wv1 wv1Var = this.f18522c;
        wv1Var.getClass();
        this.f18520a.removeOnRoutingChangedListener(wv1Var);
        this.f18522c = null;
    }
}
