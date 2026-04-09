package pf;

import Ii.AbstractC3063k;
import Ii.N;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.content.res.Resources;
import b0.InterfaceC4038a;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import mh.s;
import pf.AbstractC7319b;
import pf.AbstractC7321d;
import s9.d;
import y9.EnumC8633f;

/* renamed from: pf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7321d {

    /* renamed from: pf.d$a */
    static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7319b f57890a;

        /* renamed from: pf.d$a$a, reason: collision with other inner class name */
        static final class C2038a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC7319b.a f57891a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f57892b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f57893c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC7319b f57894d;

            /* renamed from: pf.d$a$a$a, reason: collision with other inner class name */
            static final class C2039a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC7319b.a f57895a;

                C2039a(AbstractC7319b.a aVar) {
                    this.f57895a = aVar;
                }

                public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(context, "context");
                    interfaceC3540l.U(319842317);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(319842317, i10, -1, "com.ui.wifiman.ui.sso.account.accountPickerDialogs.<anonymous>.<anonymous>.<anonymous> (SSOAccountPickerDialogs.kt:27)");
                    }
                    String string = context.getString(AbstractC6780c.f53431X1);
                    AbstractC6492s.h(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{((AbstractC7319b.a.C2037a) this.f57895a).b()}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                    interfaceC3540l.J();
                    return str;
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                }
            }

            /* renamed from: pf.d$a$a$b */
            static final class b extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f57896a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC7319b f57897b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC7319b.a f57898c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f57899d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC7319b abstractC7319b, AbstractC7319b.a aVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f57897b = abstractC7319b;
                    this.f57898c = aVar;
                    this.f57899d = interfaceC6824a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f57897b, this.f57898c, this.f57899d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f57896a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    this.f57897b.n0((AbstractC7319b.a.C2037a) this.f57898c);
                    this.f57899d.invoke();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            C2038a(AbstractC7319b.a aVar, InterfaceC6824a interfaceC6824a, N n10, AbstractC7319b abstractC7319b) {
                this.f57891a = aVar;
                this.f57892b = interfaceC6824a;
                this.f57893c = n10;
                this.f57894d = abstractC7319b;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(N n10, AbstractC7319b abstractC7319b, AbstractC7319b.a aVar, InterfaceC6824a interfaceC6824a) {
                AbstractC3063k.d(n10, null, null, new b(abstractC7319b, aVar, interfaceC6824a, null), 3, null);
                return J.f24997a;
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1540432633, i10, -1, "com.ui.wifiman.ui.sso.account.accountPickerDialogs.<anonymous>.<anonymous> (SSOAccountPickerDialogs.kt:24)");
                }
                String strA = H0.f.a(AbstractC6780c.f53437Y1, interfaceC3540l, 0);
                d.a aVar = new d.a(((AbstractC7319b.a.C2037a) this.f57891a).b(), new C2039a(this.f57891a));
                String strA2 = H0.f.a(AbstractC6780c.f53425W1, interfaceC3540l, 0);
                String strA3 = H0.f.a(AbstractC6780c.f53418V1, interfaceC3540l, 0);
                InterfaceC6824a interfaceC6824a = this.f57892b;
                s sVarA = C7318a.f57881a.a();
                interfaceC3540l.U(-2079020376);
                boolean zL = interfaceC3540l.l(this.f57893c) | interfaceC3540l.T(this.f57894d) | interfaceC3540l.T(this.f57891a) | interfaceC3540l.T(this.f57892b);
                final N n10 = this.f57893c;
                final AbstractC7319b abstractC7319b = this.f57894d;
                final AbstractC7319b.a aVar2 = this.f57891a;
                final InterfaceC6824a interfaceC6824a2 = this.f57892b;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: pf.c
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC7321d.a.C2038a.c(n10, abstractC7319b, aVar2, interfaceC6824a2);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                y9.q.k(null, strA, 0, 0, 0L, null, null, aVar, null, null, interfaceC6824a, strA2, sVarA, (InterfaceC6824a) objF, strA3, null, this.f57892b, null, null, interfaceC3540l, 0, 384, 426877);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(AbstractC7319b abstractC7319b) {
            this.f57890a = abstractC7319b;
        }

        public final void a(AbstractC7319b.a event, InterfaceC6824a dismissalAction, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(event, "event");
            AbstractC6492s.i(dismissalAction, "dismissalAction");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(event) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.l(dismissalAction) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-683741652, i11, -1, "com.ui.wifiman.ui.sso.account.accountPickerDialogs.<anonymous> (SSOAccountPickerDialogs.kt:17)");
            }
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540l));
                interfaceC3540l.K(a10);
                objF = a10;
            }
            N nA = ((A) objF).a();
            if (!(event instanceof AbstractC7319b.a.C2037a)) {
                throw new NoWhenBranchMatchedException();
            }
            y9.s.b(EnumC8633f.BOTTOM, 0L, null, dismissalAction, b0.c.e(-1540432633, true, new C2038a(event, dismissalAction, nA, this.f57890a), interfaceC3540l, 54), interfaceC3540l, ((i11 << 6) & 7168) | 24582, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((AbstractC7319b.a) obj, (InterfaceC6824a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public static final r a(AbstractC7319b vm, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(vm, "vm");
        interfaceC3540l.U(634901337);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(634901337, i10, -1, "com.ui.wifiman.ui.sso.account.accountPickerDialogs (SSOAccountPickerDialogs.kt:16)");
        }
        InterfaceC4038a interfaceC4038aE = b0.c.e(-683741652, true, new a(vm), interfaceC3540l, 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return interfaceC4038aE;
    }
}
