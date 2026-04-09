package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class PO extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0447Bq f10357a;

    public /* synthetic */ PO(C0447Bq c0447Bq) {
        this.f10357a = c0447Bq;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0447Bq c0447Bq = this.f10357a;
        c0447Bq.a(OO.a((Context) c0447Bq.f7446b, (C0729Sj) c0447Bq.f7453j, (AudioDeviceInfo) c0447Bq.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0447Bq c0447Bq;
        String str = Vt.f12096a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            c0447Bq = this.f10357a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) c0447Bq.i)) {
                c0447Bq.i = null;
                break;
            }
            i++;
        }
        c0447Bq.a(OO.a((Context) c0447Bq.f7446b, (C0729Sj) c0447Bq.f7453j, (AudioDeviceInfo) c0447Bq.i));
    }
}
