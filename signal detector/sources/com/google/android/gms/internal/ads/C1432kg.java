package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432kg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f15177a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0827Yf f15178b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15179c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15180d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15181e;

    /* renamed from: f, reason: collision with root package name */
    public float f15182f = 1.0f;

    public C1432kg(Context context, AbstractC0827Yf abstractC0827Yf) {
        this.f15177a = (AudioManager) context.getSystemService("audio");
        this.f15178b = abstractC0827Yf;
    }

    public final void a() {
        boolean z6 = this.f15180d;
        AbstractC0827Yf abstractC0827Yf = this.f15178b;
        AudioManager audioManager = this.f15177a;
        if (!z6 || this.f15181e || this.f15182f <= 0.0f) {
            if (this.f15179c) {
                if (audioManager != null) {
                    this.f15179c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC0827Yf.l();
                return;
            }
            return;
        }
        if (this.f15179c) {
            return;
        }
        if (audioManager != null) {
            this.f15179c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC0827Yf.l();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f15179c = i > 0;
        this.f15178b.l();
    }
}
