package M9;

import O9.c;
import p9.InterfaceC5480a;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<O9.e> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g<Object> f4348g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object> gVar) {
        super(0);
        this.f4348g = gVar;
    }

    @Override // p9.InterfaceC5480a
    public final O9.e invoke() {
        g<Object> gVar = this.f4348g;
        O9.f fVarB = O9.j.b("kotlinx.serialization.Polymorphic", c.a.f10491a, new O9.e[0], new e(gVar));
        kotlin.jvm.internal.e context = gVar.f4349a;
        kotlin.jvm.internal.l.f(context, "context");
        return new O9.b(fVarB, context);
    }
}
