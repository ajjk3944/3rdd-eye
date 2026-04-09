package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21045a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f21046b;

    /* renamed from: c, reason: collision with root package name */
    private final a f21047c;

    /* renamed from: d, reason: collision with root package name */
    private final c f21048d;

    /* renamed from: e, reason: collision with root package name */
    private float f21049e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21045a = context;
        this.f21046b = (AudioManager) context.getSystemService("audio");
        this.f21047c = aVar;
        this.f21048d = cVar;
    }

    private float a() {
        return this.f21047c.a(this.f21046b.getStreamVolume(3), this.f21046b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f21048d.a(this.f21049e);
    }

    public final void c() {
        this.f21049e = a();
        b();
        this.f21045a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.f21045a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        super.onChange(z3);
        float fA = a();
        if (a(fA)) {
            this.f21049e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f21049e;
    }
}
