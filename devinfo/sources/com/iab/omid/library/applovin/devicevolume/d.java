package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20919a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f20920b;

    /* renamed from: c, reason: collision with root package name */
    private final a f20921c;

    /* renamed from: d, reason: collision with root package name */
    private final c f20922d;

    /* renamed from: e, reason: collision with root package name */
    private float f20923e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f20919a = context;
        this.f20920b = (AudioManager) context.getSystemService("audio");
        this.f20921c = aVar;
        this.f20922d = cVar;
    }

    private float a() {
        return this.f20921c.a(this.f20920b.getStreamVolume(3), this.f20920b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f20922d.a(this.f20923e);
    }

    public void c() {
        this.f20923e = a();
        b();
        this.f20919a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f20919a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        super.onChange(z3);
        float fA = a();
        if (a(fA)) {
            this.f20923e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f20923e;
    }
}
