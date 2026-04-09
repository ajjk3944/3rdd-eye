package S5;

import S5.o;
import p9.InterfaceC5480a;
import x2.AbstractActivityC5757a;

/* compiled from: Balloon.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.m implements InterfaceC5480a<o> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f11982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(0);
        this.f11982g = fVar;
    }

    @Override // p9.InterfaceC5480a
    public final o invoke() {
        o oVar;
        o.a aVar = o.f11986a;
        AbstractActivityC5757a context = this.f11982g.f11917b;
        kotlin.jvm.internal.l.f(context, "context");
        o oVar2 = o.f11987b;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (aVar) {
            oVar = o.f11987b;
            if (oVar == null) {
                oVar = new o();
                o.f11987b = oVar;
                kotlin.jvm.internal.l.e(context.getSharedPreferences("com.skydoves.balloon", 0), "getSharedPreferences(...)");
            }
        }
        return oVar;
    }
}
