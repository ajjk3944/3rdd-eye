package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jw f14437a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i4) {
        jw jwVar = this.f14437a;
        jwVar.getClass();
        if (i4 == -3 || i4 == -2) {
            if (i4 != -2) {
                jwVar.e(4);
                return;
            } else {
                jwVar.f(0);
                jwVar.e(3);
                return;
            }
        }
        if (i4 == -1) {
            jwVar.f(-1);
            jwVar.d();
            jwVar.e(1);
        } else if (i4 != 1) {
            a0.g.z(new StringBuilder(String.valueOf(i4).length() + 27), "Unknown focus change type: ", i4, "AudioFocusManager");
        } else {
            jwVar.e(2);
            jwVar.f(1);
        }
    }
}
