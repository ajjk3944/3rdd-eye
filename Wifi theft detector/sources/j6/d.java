package j6;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21757a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21758b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f21759c;

    /* renamed from: d, reason: collision with root package name */
    public final j6.a f21760d;

    /* renamed from: e, reason: collision with root package name */
    public final c f21761e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f21762f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f21763g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f21764h;

    public class a implements Runnable {

        /* renamed from: j6.d$a$a, reason: collision with other inner class name */
        public class RunnableC0420a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f21766a;

            public RunnableC0420a(float f10) {
                this.f21766a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f21761e.a(this.f21766a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f21763g.set(false);
            if (((Float) d.this.f21762f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f21757a.post(new RunnableC0420a(fA));
            }
        }
    }

    public d(Handler handler, Context context, j6.a aVar, c cVar) {
        super(handler);
        this.f21762f = new AtomicReference(Float.valueOf(-1.0f));
        this.f21763g = new AtomicBoolean(false);
        this.f21764h = Executors.newSingleThreadExecutor();
        this.f21757a = handler;
        this.f21758b = context;
        this.f21759c = (AudioManager) context.getSystemService("audio");
        this.f21760d = aVar;
        this.f21761e = cVar;
    }

    public final float a() {
        return this.f21760d.a(this.f21759c.getStreamVolume(3), this.f21759c.getStreamMaxVolume(3));
    }

    public void d() {
        h();
        this.f21758b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void f() {
        this.f21758b.getContentResolver().unregisterContentObserver(this);
    }

    public final void h() {
        this.f21764h.submit(new a());
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f21763g.getAndSet(true)) {
            return;
        }
        h();
    }
}
