package org.kodein.di;

import Yg.m;
import Yg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.f;
import org.kodein.type.q;
import org.kodein.type.s;
import rj.AbstractC7726l2;
import rj.InterfaceC7810x2;
import th.l;

/* loaded from: classes4.dex */
public final class g implements InterfaceC7810x2 {

    /* renamed from: a, reason: collision with root package name */
    private final f f56935a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f56936b;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f56937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f56938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f56939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, g gVar, l lVar) {
            super(0);
            this.f56937a = obj;
            this.f56938b = gVar;
            this.f56939c = lVar;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            f fVarC;
            if (this.f56937a == null || this.f56938b.c() != d.e()) {
                fVarC = this.f56938b.c();
            } else {
                f.a aVar = f.f56931a;
                q qVarC = s.c(this.f56937a);
                AbstractC6492s.g(qVarC, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
                fVarC = aVar.a(qVarC, this.f56937a);
            }
            return this.f56938b.f56936b.invoke(fVarC, this.f56939c.getName());
        }
    }

    public g(AbstractC7726l2 abstractC7726l2, f originalContext, InterfaceC6839p get) {
        AbstractC6492s.i(originalContext, "originalContext");
        AbstractC6492s.i(get, "get");
        this.f56935a = originalContext;
        this.f56936b = get;
    }

    @Override // rj.InterfaceC7810x2
    public m a(Object obj, l prop) {
        AbstractC6492s.i(prop, "prop");
        return n.b(new a(obj, this, prop));
    }

    public final f c() {
        return this.f56935a;
    }
}
