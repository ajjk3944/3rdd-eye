package W;

import C.k0;
import I.m;
import N7.G8;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import o0.b;

/* compiled from: VideoEncoderSession.java */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13218a;

    /* renamed from: b, reason: collision with root package name */
    public final H.g f13219b;

    /* renamed from: c, reason: collision with root package name */
    public final G8 f13220c;

    /* renamed from: d, reason: collision with root package name */
    public d0.s f13221d = null;

    /* renamed from: e, reason: collision with root package name */
    public Surface f13222e = null;

    /* renamed from: f, reason: collision with root package name */
    public k0 f13223f = null;

    /* renamed from: g, reason: collision with root package name */
    public H.g f13224g = null;

    /* renamed from: h, reason: collision with root package name */
    public B.d f13225h = null;
    public a i = a.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    public A4.a<Void> f13226j = new m.a(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    public b.a<Void> f13227k = null;

    /* renamed from: l, reason: collision with root package name */
    public A4.a<d0.k> f13228l = new m.a(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    public b.a<d0.k> f13229m = null;

    /* compiled from: VideoEncoderSession.java */
    public enum a {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public Y(G8 g82, H.g gVar, Executor executor) {
        this.f13218a = executor;
        this.f13219b = gVar;
        this.f13220c = g82;
    }

    public final void a() {
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            b();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            C.S.a("VideoEncoderSession", "closeInternal in " + this.i + " state");
            this.i = a.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            C.S.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.i + " is not handled");
    }

    public final void b() {
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0) {
            this.i = a.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.i + " is not handled");
            }
            C.S.a("VideoEncoderSession", "terminateNow in " + this.i + ", No-op");
            return;
        }
        this.i = a.RELEASED;
        this.f13229m.b(this.f13221d);
        this.f13223f = null;
        if (this.f13221d == null) {
            C.S.g("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f13227k.b(null);
            return;
        }
        C.S.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f13221d);
        this.f13221d.f();
        this.f13221d.i.addListener(new B.b(this, 9), this.f13219b);
        this.f13221d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f13223f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
