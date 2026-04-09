package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vx implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f17752a;

    /* renamed from: b, reason: collision with root package name */
    public final nu f17753b;

    public vx(nu nuVar, Handler handler) {
        this.f17753b = nuVar;
        Looper looper = handler.getLooper();
        String str = bq0.f9768a;
        this.f17752a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) throws InterruptedException {
        b4.a aVar = new b4.a(this, i4, 4);
        String str = bq0.f9768a;
        Handler handler = this.f17752a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                aVar.run();
            } else {
                handler.post(aVar);
            }
        }
    }
}
