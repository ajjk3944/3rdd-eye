package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fv1 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi0 f11267a;

    public /* synthetic */ fv1(xi0 xi0Var) {
        this.f11267a = xi0Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        xi0 xi0Var = this.f11267a;
        xi0Var.h(ev1.a((Context) xi0Var.f18392a, (p50) xi0Var.j, (AudioDeviceInfo) xi0Var.f18399i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        xi0 xi0Var;
        String str = bq0.f9768a;
        int length = audioDeviceInfoArr.length;
        int i4 = 0;
        while (true) {
            xi0Var = this.f11267a;
            if (i4 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i4], (AudioDeviceInfo) xi0Var.f18399i)) {
                xi0Var.f18399i = null;
                break;
            }
            i4++;
        }
        xi0Var.h(ev1.a((Context) xi0Var.f18392a, (p50) xi0Var.j, (AudioDeviceInfo) xi0Var.f18399i));
    }
}
