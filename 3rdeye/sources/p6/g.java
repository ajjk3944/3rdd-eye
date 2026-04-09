package p6;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import o6.C5425b;
import o6.C5426c;
import p9.InterfaceC5480a;
import s6.k;

/* compiled from: RuntimeStore.kt */
/* loaded from: classes.dex */
public final class g extends m implements InterfaceC5480a<C5425b.a> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f45220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f45220g = hVar;
    }

    @Override // p9.InterfaceC5480a
    public final C5425b.a invoke() {
        final h hVar = this.f45220g;
        return new C5425b.a() { // from class: p6.f
            @Override // o6.C5425b.a
            public final void a(C5425b resolver, k kVar, H7.e functionProvider) {
                h this$0 = hVar;
                l.f(this$0, "this$0");
                l.f(resolver, "resolver");
                l.f(functionProvider, "functionProvider");
                this$0.d(new C5426c(resolver, kVar, null, functionProvider, this$0));
            }
        };
    }
}
