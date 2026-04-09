package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1336f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C02133r A00;

    public C1336f6(C02133r c02133r) {
        this.A00 = c02133r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        new Handler(Looper.getMainLooper()).post(new C0448Dl(this, i4));
    }
}
