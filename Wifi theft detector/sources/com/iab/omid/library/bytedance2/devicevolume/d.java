package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12348a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f12349b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12350c;

    /* renamed from: d, reason: collision with root package name */
    private final c f12351d;

    /* renamed from: e, reason: collision with root package name */
    private float f12352e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f12348a = context;
        this.f12349b = (AudioManager) context.getSystemService("audio");
        this.f12350c = aVar;
        this.f12351d = cVar;
    }

    private float a() {
        return this.f12350c.a(this.f12349b.getStreamVolume(3), this.f12349b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f12351d.a(this.f12352e);
    }

    public void c() {
        this.f12352e = a();
        b();
        this.f12348a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f12348a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f12352e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f12352e;
    }
}
