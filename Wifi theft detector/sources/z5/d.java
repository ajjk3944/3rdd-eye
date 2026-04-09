package z5;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25361a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f25362b;

    /* renamed from: c, reason: collision with root package name */
    public final a f25363c;

    /* renamed from: d, reason: collision with root package name */
    public final c f25364d;

    /* renamed from: e, reason: collision with root package name */
    public float f25365e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f25361a = context;
        this.f25362b = (AudioManager) context.getSystemService("audio");
        this.f25363c = aVar;
        this.f25364d = cVar;
    }

    public final float a() {
        return this.f25363c.a(this.f25362b.getStreamVolume(3), this.f25362b.getStreamMaxVolume(3));
    }

    public final boolean b(float f10) {
        return f10 != this.f25365e;
    }

    public final void c() {
        this.f25364d.a(this.f25365e);
    }

    public void d() {
        this.f25365e = a();
        c();
        this.f25361a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f25361a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (b(fA)) {
            this.f25365e = fA;
            c();
        }
    }
}
