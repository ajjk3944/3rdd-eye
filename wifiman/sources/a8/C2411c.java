package A8;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Yg.J;
import dh.InterfaceC5380e;
import e7.f;
import e7.g;
import eh.AbstractC5467b;
import h7.C5954a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* renamed from: A8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2411c implements Ue.g {

    /* renamed from: a, reason: collision with root package name */
    private final z f364a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f365b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f366c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f367d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f368e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6824a f369f;

    /* renamed from: A8.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f370a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f372c = i10;
            this.f373d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C2411c.this.new a(this.f372c, this.f373d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return C2411c.this.d().M(this.f372c, this.f373d);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public C2411c(z controller) {
        AbstractC6492s.i(controller, "controller");
        this.f364a = controller;
        Fg.a aVarK2 = Fg.a.k2(f.b.f46230a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f365b = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(g.a.f46232a);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f366c = aVarK22;
        gg.i iVarI2 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f367d = iVarI2;
        gg.i iVarI22 = aVarK22.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f368e = iVarI22;
        this.f369f = new InterfaceC6824a() { // from class: A8.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C2411c.l();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l() {
        return J.f24997a;
    }

    @Override // Ue.g
    public void b(e7.g state) {
        AbstractC6492s.i(state, "state");
        this.f366c.h(state);
    }

    @Override // Ue.g
    public Object c(int i10, int i11, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new a(i10, i11, null), interfaceC5380e);
    }

    @Override // Ue.g
    public void e(InterfaceC6824a interfaceC6824a) {
        AbstractC6492s.i(interfaceC6824a, "<set-?>");
        this.f369f = interfaceC6824a;
    }

    @Override // Ue.g
    public void f(e7.f state) {
        AbstractC6492s.i(state, "state");
        this.f365b.h(state);
    }

    public final gg.i h() {
        return this.f367d;
    }

    public final gg.i i() {
        return this.f368e;
    }

    @Override // Ue.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z a() {
        return this.f364a;
    }

    @Override // Ue.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5954a d() {
        return a().E();
    }
}
