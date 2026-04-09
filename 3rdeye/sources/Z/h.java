package Z;

import C.S;
import C.g0;
import W.F;
import Y.c;
import Z.j;
import android.content.Context;
import d0.k;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: AudioSource.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final H.g f13910a;

    /* renamed from: d, reason: collision with root package name */
    public final p f13913d;

    /* renamed from: e, reason: collision with root package name */
    public final q f13914e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13915f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public H.g f13918j;

    /* renamed from: k, reason: collision with root package name */
    public F.c f13919k;

    /* renamed from: l, reason: collision with root package name */
    public k.a f13920l;

    /* renamed from: m, reason: collision with root package name */
    public g f13921m;

    /* renamed from: n, reason: collision with root package name */
    public f f13922n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13923o;

    /* renamed from: p, reason: collision with root package name */
    public long f13924p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13925q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13926r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f13927s;

    /* renamed from: t, reason: collision with root package name */
    public double f13928t;

    /* renamed from: v, reason: collision with root package name */
    public final int f13930v;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Boolean> f13911b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f13912c = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public b f13916g = b.CONFIGURED;

    /* renamed from: h, reason: collision with root package name */
    public c.a f13917h = c.a.INACTIVE;

    /* renamed from: u, reason: collision with root package name */
    public long f13929u = 0;

    /* compiled from: AudioSource.java */
    public class a {
        public a() {
        }
    }

    /* compiled from: AudioSource.java */
    public enum b {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public h(Z.a aVar, H.g gVar, Context context) throws i {
        H.g gVar2 = new H.g(gVar);
        this.f13910a = gVar2;
        this.f13915f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            p pVar = new p(new k(aVar, context), aVar);
            this.f13913d = pVar;
            a aVar2 = new a();
            A2.l.q("AudioStream can not be started when setCallback.", !pVar.f13960a.get());
            pVar.a();
            pVar.f13963d.execute(new N.d(pVar, aVar2, gVar2, 2));
            this.f13914e = new q(aVar);
            this.f13930v = aVar.a();
        } catch (j.a | IllegalArgumentException e4) {
            throw new i("Unable to create AudioStream", e4);
        }
    }

    public final void a() {
        H.g gVar = this.f13918j;
        F.c cVar = this.f13919k;
        if (gVar == null || cVar == null) {
            return;
        }
        boolean z10 = this.f13926r || this.f13923o || this.f13925q;
        if (Objects.equals(this.f13911b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        gVar.execute(new d(cVar, z10, 0));
    }

    public final void b(k.a aVar) {
        k.a aVar2 = this.f13920l;
        c.a aVar3 = null;
        if (aVar2 != null) {
            f fVar = this.f13922n;
            Objects.requireNonNull(fVar);
            aVar2.a(fVar);
            this.f13920l = null;
            this.f13922n = null;
            this.f13921m = null;
            this.f13917h = c.a.INACTIVE;
            e();
        }
        if (aVar != null) {
            this.f13920l = aVar;
            this.f13922n = new f(this, aVar);
            this.f13921m = new g(this, aVar);
            try {
                A4.a<c.a> aVarD = aVar.d();
                if (aVarD.isDone()) {
                    aVar3 = aVarD.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (aVar3 != null) {
                this.f13917h = aVar3;
                e();
            }
            this.f13920l.e(this.f13910a, this.f13922n);
        }
    }

    public final void c(b bVar) {
        S.a("AudioSource", "Transitioning internal state: " + this.f13916g + " --> " + bVar);
        this.f13916g = bVar;
    }

    public final void d() {
        if (this.i) {
            this.i = false;
            S.a("AudioSource", "stopSendingAudio");
            p pVar = this.f13913d;
            pVar.a();
            if (pVar.f13960a.getAndSet(false)) {
                pVar.f13963d.execute(new n(pVar, 0));
            }
        }
    }

    public final void e() {
        if (this.f13916g != b.STARTED) {
            d();
            return;
        }
        boolean z10 = this.f13917h == c.a.ACTIVE;
        boolean z11 = !z10;
        H.g gVar = this.f13918j;
        F.c cVar = this.f13919k;
        if (gVar != null && cVar != null && this.f13912c.getAndSet(z11) != z11) {
            gVar.execute(new g0(cVar, z11));
        }
        if (!z10) {
            d();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            S.a("AudioSource", "startSendingAudio");
            this.f13913d.c();
            this.f13923o = false;
        } catch (j.a e4) {
            S.h("AudioSource", "Failed to start AudioStream", e4);
            this.f13923o = true;
            q qVar = this.f13914e;
            qVar.a();
            if (!qVar.f13975a.getAndSet(true)) {
                qVar.f13980f = System.nanoTime();
            }
            this.f13924p = System.nanoTime();
            a();
        }
        this.i = true;
        k.a aVar = this.f13920l;
        Objects.requireNonNull(aVar);
        b.d dVarC = aVar.c();
        g gVar2 = this.f13921m;
        Objects.requireNonNull(gVar2);
        I.j.a(dVarC, gVar2, this.f13910a);
    }
}
