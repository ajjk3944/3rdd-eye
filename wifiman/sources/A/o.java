package A;

import B.K;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.D;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class o {

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z1 z1Var) {
            super(0);
            this.f103a = z1Var;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k((InterfaceC6835l) this.f103a.getValue());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1 z1Var, B b10, d dVar) {
            super(0);
            this.f104a = z1Var;
            this.f105b = b10;
            this.f106c = dVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            k kVar = (k) this.f104a.getValue();
            return new n(this.f105b, kVar, this.f106c, new K(this.f105b.y(), kVar));
        }
    }

    public static final InterfaceC6824a a(B b10, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        z1 z1VarN = o1.n(interfaceC6835l, interfaceC3540l, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(b10)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new D(o1.d(o1.m(), new c(o1.d(o1.m(), new b(z1VarN)), b10, new d()))) { // from class: A.o.a
                @Override // kotlin.jvm.internal.D, th.m
                public Object get() {
                    return ((z1) this.receiver).getValue();
                }
            };
            interfaceC3540l.K(objF);
        }
        th.m mVar = (th.m) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return mVar;
    }
}
