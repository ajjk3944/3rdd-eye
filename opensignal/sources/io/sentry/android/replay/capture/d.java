package io.sentry.android.replay.capture;

import io.sentry.protocol.t;
import java.util.Date;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ c B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11875a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11876d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Date f11877g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f11878r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.replay.t f11879x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ br.n f11880y;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(g gVar, long j, Date date, t tVar, io.sentry.android.replay.t tVar2, ar.k kVar) {
        this.B = gVar;
        this.f11876d = j;
        this.f11877g = date;
        this.f11878r = tVar;
        this.f11879x = tVar2;
        this.f11880y = (br.n) kVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ar.k, br.n] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ar.k, br.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11875a) {
            case 0:
                g gVar = (g) this.B;
                int i10 = gVar.i();
                io.sentry.android.replay.t tVar = this.f11879x;
                this.f11880y.a(c.g(gVar, this.f11876d, this.f11877g, this.f11878r, i10, tVar.f11986b, tVar.f11985a, tVar.f11989e, tVar.f11990f));
                break;
            default:
                p pVar = (p) this.B;
                int i11 = pVar.i();
                io.sentry.android.replay.t tVar2 = this.f11879x;
                this.f11880y.a(c.g(pVar, this.f11876d, this.f11877g, this.f11878r, i11, tVar2.f11986b, tVar2.f11985a, tVar2.f11989e, tVar2.f11990f));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(p pVar, long j, Date date, t tVar, io.sentry.android.replay.t tVar2, ar.k kVar) {
        this.B = pVar;
        this.f11876d = j;
        this.f11877g = date;
        this.f11878r = tVar;
        this.f11879x = tVar2;
        this.f11880y = (br.n) kVar;
    }
}
