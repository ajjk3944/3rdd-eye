package q;

import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6835l;
import n0.AbstractC6858c;
import n0.C6862g;
import r.C7541p;
import r.s0;
import r.u0;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7389h {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f58276a = a.f58277a;

    /* renamed from: q.h$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58277a = new a();

        /* renamed from: q.h$a$a, reason: collision with other inner class name */
        static final class C2051a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C2051a f58278a = new C2051a();

            C2051a() {
                super(1);
            }

            public final C7541p a(long j10) {
                long jI = C6733v0.i(j10, C6862g.f54113a.t());
                return new C7541p(C6733v0.n(jI), C6733v0.r(jI), C6733v0.q(jI), C6733v0.o(jI));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C6733v0) obj).u());
            }
        }

        /* renamed from: q.h$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6858c f58279a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC6858c abstractC6858c) {
                super(1);
                this.f58279a = abstractC6858c;
            }

            public final long a(C7541p c7541p) {
                float fG = c7541p.g();
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
                if (fG > 1.0f) {
                    fG = 1.0f;
                }
                float fH = c7541p.h();
                if (fH < -0.5f) {
                    fH = -0.5f;
                }
                if (fH > 0.5f) {
                    fH = 0.5f;
                }
                float fI = c7541p.i();
                float f10 = fI >= -0.5f ? fI : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float f12 = c7541p.f();
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                return C6733v0.i(AbstractC6737x0.a(fG, fH, f11, f13 <= 1.0f ? f13 : 1.0f, C6862g.f54113a.t()), this.f58279a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C6733v0.g(a((C7541p) obj));
            }
        }

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s0 invoke(AbstractC6858c abstractC6858c) {
            return u0.a(C2051a.f58278a, new b(abstractC6858c));
        }
    }

    public static final InterfaceC6835l a(C6733v0.a aVar) {
        return f58276a;
    }
}
