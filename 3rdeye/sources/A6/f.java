package A6;

import A6.e;
import b9.C1992A;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class f extends m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f62g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f63h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, long j4) {
        super(0);
        this.f62g = eVar;
        this.f63h = j4;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        e eVar = this.f62g;
        eVar.b();
        eVar.f50d.invoke(Long.valueOf(this.f63h));
        eVar.f56k = e.a.STOPPED;
        eVar.f();
        return C1992A.f18074a;
    }
}
