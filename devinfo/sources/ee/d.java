package ee;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f23406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f23410f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j8, TimeUnit timeUnit, int i4) {
        this.f23405a = i4;
        this.f23406b = gVar;
        this.f23407c = runnable;
        this.f23408d = j;
        this.f23409e = j8;
        this.f23410f = timeUnit;
    }

    @Override // ee.h
    public final ScheduledFuture a(o7.c cVar) {
        switch (this.f23405a) {
            case 0:
                g gVar = this.f23406b;
                return gVar.f23420b.scheduleAtFixedRate(new e(gVar, this.f23407c, cVar, 0), this.f23408d, this.f23409e, this.f23410f);
            default:
                g gVar2 = this.f23406b;
                return gVar2.f23420b.scheduleWithFixedDelay(new e(gVar2, this.f23407c, cVar, 2), this.f23408d, this.f23409e, this.f23410f);
        }
    }
}
