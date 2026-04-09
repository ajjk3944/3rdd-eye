package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109eg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f13921a;

    /* renamed from: b, reason: collision with root package name */
    public final C2077we f13922b;

    public C1109eg(C2077we c2077we, Handler handler) {
        this.f13922b = c2077we;
        Looper looper = handler.getLooper();
        String str = Vt.f12096a;
        this.f13921a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) throws InterruptedException {
        A3.h hVar = new A3.h(i, 7, this);
        String str = Vt.f12096a;
        Handler handler = this.f13921a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                hVar.run();
            } else {
                handler.post(hVar);
            }
        }
    }
}
