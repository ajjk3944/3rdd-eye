package J;

import F.C2722l;
import F.Q;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class l {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.i f9575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f9576b;

        /* renamed from: J.l$a$a, reason: collision with other inner class name */
        public static final class C0386a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f9577a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9578b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0386a(v.i iVar, j jVar) {
                super(0);
                this.f9577a = iVar;
                this.f9578b = jVar;
            }

            public final void a() {
                this.f9578b.H();
                v.j.a(this.f9577a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f9579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9580b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v.i iVar, j jVar) {
                super(0);
                this.f9579a = iVar;
                this.f9580b = jVar;
            }

            public final void a() {
                this.f9580b.E(false);
                v.j.a(this.f9579a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f9581a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9582b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v.i iVar, j jVar) {
                super(0);
                this.f9581a = iVar;
                this.f9582b = jVar;
            }

            public final void a() {
                this.f9582b.o0();
                v.j.a(this.f9581a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f9583a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(v.i iVar, j jVar) {
                super(0);
                this.f9583a = iVar;
                this.f9584b = jVar;
            }

            public final void a() {
                this.f9584b.r0();
                v.j.a(this.f9583a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.i iVar, j jVar) {
            super(1);
            this.f9575a = iVar;
            this.f9576b = jVar;
        }

        public final void a(v.g gVar) {
            v.i iVar = this.f9575a;
            Q q10 = Q.Cut;
            v.g.d(gVar, new C2722l(q10), null, this.f9576b.A(), null, new C0386a(iVar, this.f9576b), 10, null);
            v.i iVar2 = this.f9575a;
            Q q11 = Q.Copy;
            v.g.d(gVar, new C2722l(q11), null, this.f9576b.z(), null, new b(iVar2, this.f9576b), 10, null);
            v.i iVar3 = this.f9575a;
            Q q12 = Q.Paste;
            v.g.d(gVar, new C2722l(q12), null, this.f9576b.B(), null, new c(iVar3, this.f9576b), 10, null);
            v.i iVar4 = this.f9575a;
            Q q13 = Q.SelectAll;
            v.g.d(gVar, new C2722l(q13), null, this.f9576b.C(), null, new d(iVar4, this.f9576b), 10, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v.g) obj);
            return J.f24997a;
        }
    }

    public static final InterfaceC6835l a(j jVar, v.i iVar) {
        return new a(iVar, jVar);
    }
}
