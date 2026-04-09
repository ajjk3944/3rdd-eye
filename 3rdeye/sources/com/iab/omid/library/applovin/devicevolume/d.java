package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23539a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f23540b;

    /* renamed from: c, reason: collision with root package name */
    private final a f23541c;

    /* renamed from: d, reason: collision with root package name */
    private final c f23542d;

    /* renamed from: e, reason: collision with root package name */
    private float f23543e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23539a = context;
        this.f23540b = (AudioManager) context.getSystemService("audio");
        this.f23541c = aVar;
        this.f23542d = cVar;
    }

    private float a() {
        return this.f23541c.a(this.f23540b.getStreamVolume(3), this.f23540b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f23542d.a(this.f23543e);
    }

    public void c() {
        this.f23543e = a();
        b();
        this.f23539a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f23539a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f23543e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f23543e;
    }
}
