package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4108a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4109b;

    /* renamed from: c, reason: collision with root package name */
    public e f4110c;

    /* renamed from: d, reason: collision with root package name */
    public int f4111d;

    /* renamed from: e, reason: collision with root package name */
    public float f4112e = 1.0f;

    public f(Context context, Handler handler, e eVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f4108a = audioManager;
        this.f4110c = eVar;
        this.f4109b = new d(this, handler, 0);
        this.f4111d = 0;
    }

    public final void a() {
        if (this.f4111d == 0) {
            return;
        }
        if (qb.v.f20828a < 26) {
            this.f4108a.abandonAudioFocus(this.f4109b);
        }
        b(0);
    }

    public final void b(int i10) {
        if (this.f4111d == i10) {
            return;
        }
        this.f4111d = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f4112e == f10) {
            return;
        }
        this.f4112e = f10;
        e eVar = this.f4110c;
        if (eVar != null) {
            eVar.setVolumeMultiplier(f10);
        }
    }

    public final int c(int i10, boolean z10) {
        a();
        return z10 ? 1 : -1;
    }
}
