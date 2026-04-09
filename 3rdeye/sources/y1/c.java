package Y1;

import C9.s;
import C9.u;
import X1.b;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import p9.p;

/* compiled from: ContraintControllers.kt */
@h9.e(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends h9.i implements p<u<? super X1.b>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13703l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d<Object> f13705n;

    /* compiled from: ContraintControllers.kt */
    public static final class a extends m implements InterfaceC5480a<C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d<Object> f13706g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f13707h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, b bVar) {
            super(0);
            this.f13706g = dVar;
            this.f13707h = bVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            Z1.h<Object> hVar = this.f13706g.f13710a;
            b bVar = this.f13707h;
            hVar.getClass();
            synchronized (hVar.f13997c) {
                if (hVar.f13998d.remove(bVar) && hVar.f13998d.isEmpty()) {
                    hVar.d();
                }
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: ContraintControllers.kt */
    public static final class b implements X1.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<Object> f13708a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u<X1.b> f13709b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(d<Object> dVar, u<? super X1.b> uVar) {
            this.f13708a = dVar;
            this.f13709b = uVar;
        }

        @Override // X1.a
        public final void a(Object obj) {
            d<Object> dVar = this.f13708a;
            this.f13709b.B().i(dVar.c(obj) ? new b.C0195b(dVar.a()) : b.a.f13538a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, InterfaceC4347e<? super c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13705n = dVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        c cVar = new c(this.f13705n, interfaceC4347e);
        cVar.f13704m = obj;
        return cVar;
    }

    @Override // p9.p
    public final Object invoke(u<? super X1.b> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((c) create(uVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13703l;
        if (i == 0) {
            n.b(obj);
            u uVar = (u) this.f13704m;
            d<Object> dVar = this.f13705n;
            b bVar = new b(dVar, uVar);
            Z1.h<Object> hVar = dVar.f13710a;
            hVar.getClass();
            synchronized (hVar.f13997c) {
                try {
                    if (hVar.f13998d.add(bVar)) {
                        if (hVar.f13998d.size() == 1) {
                            hVar.f13999e = hVar.a();
                            androidx.work.m.e().a(Z1.i.f14000a, hVar.getClass().getSimpleName() + ": initial state = " + hVar.f13999e);
                            hVar.c();
                        }
                        bVar.a(hVar.f13999e);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar2 = new a(this.f13705n, bVar);
            this.f13703l = 1;
            if (s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        return C1992A.f18074a;
    }
}
