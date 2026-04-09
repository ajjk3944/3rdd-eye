package U5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Yg.v;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import w.o;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: U5.a$a, reason: collision with other inner class name */
    public static final class C0814a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0814a(boolean z10) {
            super(1);
            this.f22137a = z10;
        }

        public final void a(B0 b02) {
            AbstractC6492s.i(b02, "$this$null");
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f22139b;

        /* renamed from: U5.a$b$a, reason: collision with other inner class name */
        static final class C0815a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f22140a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f22141b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f22142c;

            /* renamed from: U5.a$b$a$a, reason: collision with other inner class name */
            static final class C0816a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f22143a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f22144b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f22145c;

                /* renamed from: U5.a$b$a$a$a, reason: collision with other inner class name */
                static final class C0817a extends AbstractC6494u implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6839p f22146a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0817a(InterfaceC6839p interfaceC6839p) {
                        super(2);
                        this.f22146a = interfaceC6839p;
                    }

                    public final void a(long j10, float f10) {
                        this.f22146a.invoke(C6531g.d(j10), Float.valueOf(f10));
                    }

                    @Override // mh.InterfaceC6839p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a(((C6531g) obj).v(), ((Number) obj2).floatValue());
                        return J.f24997a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0816a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f22145c = interfaceC6839p;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    C0816a c0816a = new C0816a(this.f22145c, interfaceC5380e);
                    c0816a.f22144b = obj;
                    return c0816a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f22143a;
                    if (i10 == 0) {
                        v.b(obj);
                        InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f22144b;
                        C0817a c0817a = new C0817a(this.f22145c);
                        this.f22143a = 1;
                        if (T5.b.a(interfaceC8567G, c0817a, this) == objG) {
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
                    return ((C0816a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0815a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f22142c = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0815a c0815a = new C0815a(this.f22142c, interfaceC5380e);
                c0815a.f22141b = obj;
                return c0815a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f22140a;
                if (i10 == 0) {
                    v.b(obj);
                    InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f22141b;
                    C0816a c0816a = new C0816a(this.f22142c, null);
                    this.f22140a = 1;
                    if (o.e(interfaceC8567G, c0816a, this) == objG) {
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
                return ((C0815a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC6839p interfaceC6839p) {
            super(3);
            this.f22138a = z10;
            this.f22139b = interfaceC6839p;
        }

        public final e a(e composed, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(composed, "$this$composed");
            interfaceC3540l.e(-880660319);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-880660319, i10, -1, "com.patrykandpatrick.vico.compose.gesture.zoomable.<anonymous> (Zoomable.kt:45)");
            }
            InterfaceC6839p interfaceC6839p = this.f22139b;
            interfaceC3540l.e(-492369756);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0815a(interfaceC6839p, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.P();
            e eVarD = this.f22138a ? AbstractC8576P.d(e.f28771b0, J.f24997a, (InterfaceC6839p) objF) : e.f28771b0;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.P();
            return eVarD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final e a(e eVar, InterfaceC6839p onZoom, boolean z10) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(onZoom, "onZoom");
        return c.b(eVar, AbstractC3964z0.b() ? new C0814a(z10) : AbstractC3964z0.a(), new b(z10, onZoom));
    }

    public static /* synthetic */ e b(e eVar, InterfaceC6839p interfaceC6839p, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(eVar, interfaceC6839p, z10);
    }
}
