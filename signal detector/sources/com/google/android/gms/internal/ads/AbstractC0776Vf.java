package com.google.android.gms.internal.ads;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* renamed from: com.google.android.gms.internal.ads.Vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0776Vf {
    public static /* synthetic */ NotificationChannel d(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest o(Object obj) {
        return (AudioFocusRequest) obj;
    }
}
