package cf;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3717a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3718d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Runnable f3719g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f3720r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f3721x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3722y;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j7, TimeUnit timeUnit, int i10) {
        this.f3717a = i10;
        this.f3718d = gVar;
        this.f3719g = runnable;
        this.f3720r = j;
        this.f3721x = j7;
        this.f3722y = timeUnit;
    }

    @Override // cf.h
    public final ScheduledFuture a(a2.g gVar) {
        switch (this.f3717a) {
            case 0:
                g gVar2 = this.f3718d;
                return gVar2.f3732d.scheduleAtFixedRate(new e(gVar2, this.f3719g, gVar, 0), this.f3720r, this.f3721x, this.f3722y);
            default:
                g gVar3 = this.f3718d;
                return gVar3.f3732d.scheduleWithFixedDelay(new e(gVar3, this.f3719g, gVar, 2), this.f3720r, this.f3721x, this.f3722y);
        }
    }
}
