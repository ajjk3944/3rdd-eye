package T5;

import Yg.J;
import Yg.v;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import w.AbstractC8235B;
import w.j;
import w.r;
import w.y;
import y.InterfaceC8558m;
import y0.AbstractC8576P;
import y0.C8604y;
import y0.InterfaceC8567G;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: T5.a$a, reason: collision with other inner class name */
    static final class C0777a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21408a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21409b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f21410c;

        /* renamed from: T5.a$a$a, reason: collision with other inner class name */
        static final class C0778a extends l implements q {

            /* renamed from: a, reason: collision with root package name */
            int f21411a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f21412b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ long f21413c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f21414d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0778a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
                this.f21414d = interfaceC6835l;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f21411a;
                if (i10 == 0) {
                    v.b(obj);
                    r rVar = (r) this.f21412b;
                    this.f21414d.invoke(D6.a.a(a.c(this.f21413c)));
                    this.f21411a = 1;
                    if (rVar.F1(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                this.f21414d.invoke(null);
                return J.f24997a;
            }

            public final Object n(r rVar, long j10, InterfaceC5380e interfaceC5380e) {
                C0778a c0778a = new C0778a(this.f21414d, interfaceC5380e);
                c0778a.f21412b = rVar;
                c0778a.f21413c = j10;
                return c0778a.invokeSuspend(J.f24997a);
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return n((r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0777a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21410c = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C0777a c0777a = new C0777a(this.f21410c, interfaceC5380e);
            c0777a.f21409b = obj;
            return c0777a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21408a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f21409b;
                C0778a c0778a = new C0778a(this.f21410c, null);
                this.f21408a = 1;
                if (AbstractC8235B.k(interfaceC8567G, null, null, c0778a, null, this, 11, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((C0777a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21415a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21416b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f21417c;

        /* renamed from: T5.a$b$a, reason: collision with other inner class name */
        static final class C0779a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f21418a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0779a(InterfaceC6835l interfaceC6835l) {
                super(0);
                this.f21418a = interfaceC6835l;
            }

            public final void a() {
                this.f21418a.invoke(null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* renamed from: T5.a$b$b, reason: collision with other inner class name */
        static final class C0780b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f21419a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0780b(InterfaceC6835l interfaceC6835l) {
                super(0);
                this.f21419a = interfaceC6835l;
            }

            public final void a() {
                this.f21419a.invoke(null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f21420a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC6835l interfaceC6835l) {
                super(2);
                this.f21420a = interfaceC6835l;
            }

            public final void a(C8604y change, long j10) {
                AbstractC6492s.i(change, "change");
                this.f21420a.invoke(D6.a.a(a.c(change.h())));
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C8604y) obj, ((C6531g) obj2).v());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21417c = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f21417c, interfaceC5380e);
            bVar.f21416b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21415a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f21416b;
                C0779a c0779a = new C0779a(this.f21417c);
                C0780b c0780b = new C0780b(this.f21417c);
                c cVar = new c(this.f21417c);
                this.f21415a = 1;
                if (j.g(interfaceC8567G, null, c0779a, c0780b, cVar, this, 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final e b(e eVar, InterfaceC6835l interfaceC6835l, y yVar, InterfaceC6839p interfaceC6839p, InterfaceC8558m interactionSource) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(interactionSource, "interactionSource");
        if (interfaceC6835l != null) {
            J j10 = J.f24997a;
            eVar = AbstractC8576P.c(eVar, j10, j10, new C0777a(interfaceC6835l, null));
        }
        if (interfaceC6839p != null) {
            eVar = U5.a.b(eVar, interfaceC6839p, false, 2, null);
        }
        e eVar2 = eVar;
        if (yVar != null) {
            return d.i(eVar2, yVar, w.q.Horizontal, false, true, null, interactionSource, 20, null);
        }
        if (interfaceC6835l == null) {
            return eVar2;
        }
        J j11 = J.f24997a;
        return AbstractC8576P.c(eVar2, j11, j11, new b(interfaceC6835l, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j10) {
        return D6.b.a(C6531g.m(j10), C6531g.n(j10));
    }
}
