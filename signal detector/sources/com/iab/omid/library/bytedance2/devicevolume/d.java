package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18647a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f18648b;

    /* renamed from: c, reason: collision with root package name */
    private final a f18649c;

    /* renamed from: d, reason: collision with root package name */
    private final c f18650d;

    /* renamed from: e, reason: collision with root package name */
    private float f18651e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f18647a = context;
        this.f18648b = (AudioManager) context.getSystemService("audio");
        this.f18649c = aVar;
        this.f18650d = cVar;
    }

    private float a() {
        return this.f18649c.a(this.f18648b.getStreamVolume(3), this.f18648b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f18650d.a(this.f18651e);
    }

    public void c() {
        this.f18651e = a();
        b();
        this.f18647a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f18647a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z6) {
        super.onChange(z6);
        float fA = a();
        if (a(fA)) {
            this.f18651e = fA;
            b();
        }
    }

    private boolean a(float f2) {
        return f2 != this.f18651e;
    }
}
