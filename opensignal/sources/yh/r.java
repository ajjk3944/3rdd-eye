package yh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import io.sentry.t;
import pb.l0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f26362a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f26363b;

    /* renamed from: c, reason: collision with root package name */
    public final oh.p f26364c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26366e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26367f;

    /* renamed from: g, reason: collision with root package name */
    public long f26368g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f26369h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26370i = false;
    public final l0 j = new l0(11, this);

    public r(boolean z10, int i10, int i11, oh.p pVar, t tVar) {
        this.f26365d = z10;
        this.f26366e = i10;
        this.f26367f = i11;
        this.f26364c = pVar;
        HandlerThread handlerThreadL = tVar.l("TU_Mon");
        this.f26362a = handlerThreadL;
        handlerThreadL.start();
        this.f26363b = new Handler(handlerThreadL.getLooper());
    }

    public final void a() {
        Handler handler = this.f26363b;
        if (handler != null) {
            this.f26370i = true;
            this.f26369h = e.e(this.f26367f, this.f26365d, this.f26366e);
            this.f26368g = SystemClock.elapsedRealtime();
            handler.postDelayed(this.j, 50L);
        }
    }

    public final void b() {
        Handler handler = this.f26363b;
        if (handler == null || !this.f26362a.isAlive()) {
            return;
        }
        this.f26370i = false;
        handler.removeCallbacks(this.j);
        handler.getLooper().quitSafely();
    }
}
