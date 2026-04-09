package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.we, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2077we implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1916tf f17456a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i) {
        C1916tf c1916tf = this.f17456a;
        c1916tf.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c1916tf.e(4);
                return;
            } else {
                c1916tf.f(0);
                c1916tf.e(3);
                return;
            }
        }
        if (i == -1) {
            c1916tf.f(-1);
            c1916tf.d();
            c1916tf.e(1);
        } else if (i != 1) {
            A.f.u(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
        } else {
            c1916tf.e(2);
            c1916tf.f(1);
        }
    }
}
