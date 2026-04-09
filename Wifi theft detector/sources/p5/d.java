package p5;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23888a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f23889b;

    /* renamed from: c, reason: collision with root package name */
    public final a f23890c;

    /* renamed from: d, reason: collision with root package name */
    public final c f23891d;

    /* renamed from: e, reason: collision with root package name */
    public float f23892e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23888a = context;
        this.f23889b = (AudioManager) context.getSystemService("audio");
        this.f23890c = aVar;
        this.f23891d = cVar;
    }

    public final float a() {
        return this.f23890c.a(this.f23889b.getStreamVolume(3), this.f23889b.getStreamMaxVolume(3));
    }

    public final boolean b(float f10) {
        return f10 != this.f23892e;
    }

    public final void c() {
        this.f23891d.a(this.f23892e);
    }

    public void d() {
        this.f23892e = a();
        c();
        this.f23888a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f23888a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (b(fA)) {
            this.f23892e = fA;
            c();
        }
    }
}
