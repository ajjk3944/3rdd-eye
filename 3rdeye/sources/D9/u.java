package D9;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class u implements InterfaceC0644f<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f1260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f1261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p9.q f1262d;

    public u(J j4, y yVar, p9.q qVar) {
        this.f1260b = j4;
        this.f1261c = yVar;
        this.f1262d = qVar;
    }

    @Override // D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super Object> interfaceC0645g, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        Object objA = E9.i.a(interfaceC0645g, interfaceC4347e, w.f1267g, new v(this.f1262d, null), new InterfaceC0644f[]{this.f1260b, this.f1261c});
        return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
    }
}
