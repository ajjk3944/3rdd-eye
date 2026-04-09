package com.google.android.exoplayer2;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4086a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4088c;

    public /* synthetic */ d(Object obj, Handler handler, int i10) {
        this.f4086a = i10;
        this.f4088c = obj;
        this.f4087b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        switch (this.f4086a) {
            case 0:
                this.f4087b.post(new c(i10, 0, this));
                break;
            default:
                this.f4087b.post(new c(i10, 1, this));
                break;
        }
    }
}
