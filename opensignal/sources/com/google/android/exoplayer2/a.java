package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.internal.measurement.h4;

/* loaded from: classes.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4042a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4043d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4044g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4045r;

    public /* synthetic */ a(Object obj, Handler handler, Object obj2, int i10) {
        this.f4042a = i10;
        this.f4045r = obj;
        this.f4043d = handler;
        this.f4044g = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4042a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f4043d.post(this);
                    break;
                }
                break;
            default:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f4043d.post(this);
                    break;
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4042a) {
            case 0:
                if (((h4) this.f4045r).f5055a) {
                    ((b) this.f4044g).onAudioBecomingNoisy();
                    break;
                }
                break;
            default:
                if (((h4) this.f4045r).f5055a) {
                    ((d5.w) this.f4044g).f7095a.O1(-1, false, 3);
                    break;
                }
                break;
        }
    }
}
