package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cy implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f10253a;

    /* renamed from: b, reason: collision with root package name */
    public final px f10254b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10255c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10256d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10257e;

    /* renamed from: f, reason: collision with root package name */
    public float f10258f = 1.0f;

    public cy(Context context, px pxVar) {
        this.f10253a = (AudioManager) context.getSystemService("audio");
        this.f10254b = pxVar;
    }

    public final void a() {
        boolean z3 = this.f10256d;
        px pxVar = this.f10254b;
        AudioManager audioManager = this.f10253a;
        if (!z3 || this.f10257e || this.f10258f <= 0.0f) {
            if (this.f10255c) {
                if (audioManager != null) {
                    this.f10255c = audioManager.abandonAudioFocus(this) == 0;
                }
                pxVar.E1();
                return;
            }
            return;
        }
        if (this.f10255c) {
            return;
        }
        if (audioManager != null) {
            this.f10255c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        pxVar.E1();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        this.f10255c = i4 > 0;
        this.f10254b.E1();
    }
}
