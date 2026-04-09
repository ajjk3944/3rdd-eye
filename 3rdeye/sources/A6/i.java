package A6;

import b9.C1992A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import p9.InterfaceC5480a;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class i extends m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f68g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f69h;
    public final /* synthetic */ v i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f70j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f71k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j4, e eVar, v vVar, long j10, j jVar) {
        super(0);
        this.f68g = j4;
        this.f69h = eVar;
        this.i = vVar;
        this.f70j = j10;
        this.f71k = jVar;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        e eVar = this.f69h;
        long jD = this.f68g - eVar.d();
        eVar.c();
        v vVar = this.i;
        vVar.f43659b--;
        j jVar = this.f71k;
        if (1 <= jD && jD < this.f70j) {
            eVar.b();
            this.f69h.i(jD, jD, new h(jVar, 0));
        } else if (jD <= 0) {
            jVar.invoke();
        }
        return C1992A.f18074a;
    }
}
