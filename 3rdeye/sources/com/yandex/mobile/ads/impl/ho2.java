package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class ho2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28317a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f28318b;

    /* renamed from: c, reason: collision with root package name */
    private final qn2 f28319c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f28320d;

    /* renamed from: e, reason: collision with root package name */
    private float f28321e;

    public ho2(Handler handler, Context context, qn2 qn2Var, do2 do2Var) {
        super(handler);
        this.f28317a = context;
        this.f28318b = (AudioManager) context.getSystemService("audio");
        this.f28319c = qn2Var;
        this.f28320d = do2Var;
    }

    private float c() {
        int streamVolume = this.f28318b.getStreamVolume(3);
        int streamMaxVolume = this.f28318b.getStreamMaxVolume(3);
        this.f28319c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void a() {
        float fC = c();
        this.f28321e = fC;
        ((po2) this.f28320d).a(fC);
        this.f28317a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f28317a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (fC != this.f28321e) {
            this.f28321e = fC;
            ((po2) this.f28320d).a(fC);
        }
    }
}
