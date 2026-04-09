package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1714f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C05913r A00;

    public C1714f6(C05913r c05913r) {
        this.A00 = c05913r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C0826Dl(this, i10));
    }
}
