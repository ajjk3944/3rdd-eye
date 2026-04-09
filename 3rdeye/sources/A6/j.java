package A6;

import A6.e;
import b9.C1992A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import p9.InterfaceC5480a;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class j extends m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f72g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f73h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, e eVar, long j4) {
        super(0);
        this.f72g = vVar;
        this.f73h = eVar;
        this.i = j4;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        long j4 = this.f72g.f43659b;
        long j10 = this.i;
        e eVar = this.f73h;
        if (j4 > 0) {
            eVar.f51e.invoke(Long.valueOf(j10));
        }
        eVar.f50d.invoke(Long.valueOf(j10));
        eVar.b();
        eVar.f();
        eVar.f56k = e.a.STOPPED;
        return C1992A.f18074a;
    }
}
