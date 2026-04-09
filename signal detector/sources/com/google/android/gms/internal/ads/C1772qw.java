package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.qw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772qw extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16425a;

    public /* synthetic */ C1772qw(int i) {
        this.f16425a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f16425a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        C1476lN.f15381c = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            C1476lN.f15381c = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (u2.h.f23803b) {
                    u2.h.f23804c = false;
                    u2.h.f23805d = false;
                    u2.k.h("Ad debug logging enablement is out of date.");
                }
                com.bumptech.glide.c.R(context);
                return;
        }
    }
}
