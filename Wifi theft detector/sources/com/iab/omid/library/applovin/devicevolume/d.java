package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12213a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f12214b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12215c;

    /* renamed from: d, reason: collision with root package name */
    private final c f12216d;

    /* renamed from: e, reason: collision with root package name */
    private float f12217e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f12213a = context;
        this.f12214b = (AudioManager) context.getSystemService("audio");
        this.f12215c = aVar;
        this.f12216d = cVar;
    }

    private float a() {
        return this.f12215c.a(this.f12214b.getStreamVolume(3), this.f12214b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f12216d.a(this.f12217e);
    }

    public void c() {
        this.f12217e = a();
        b();
        this.f12213a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f12213a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f12217e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f12217e;
    }
}
