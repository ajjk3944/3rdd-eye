package androidx.compose.ui.platform;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import T.InterfaceC3548p;
import android.view.View;
import androidx.compose.ui.platform.r;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import dh.InterfaceC5380e;
import e0.AbstractC5411d;
import eh.AbstractC5467b;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
final class K1 implements InterfaceC3548p, InterfaceC4015m {

    /* renamed from: a, reason: collision with root package name */
    private final r f29230a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3548p f29231b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29232c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC4013k f29233d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6839p f29234e = C3926i0.f29391a.a();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29236b;

        /* renamed from: androidx.compose.ui.platform.K1$a$a, reason: collision with other inner class name */
        static final class C1071a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K1 f29237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f29238b;

            /* renamed from: androidx.compose.ui.platform.K1$a$a$a, reason: collision with other inner class name */
            static final class C1072a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f29239a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ K1 f29240b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1072a(K1 k12, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f29240b = k12;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1072a(this.f29240b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f29239a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        r rVarC = this.f29240b.C();
                        this.f29239a = 1;
                        if (rVarC.e0(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1072a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: androidx.compose.ui.platform.K1$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f29241a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ K1 f29242b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(K1 k12, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f29242b = k12;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f29242b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f29241a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        r rVarC = this.f29242b.C();
                        this.f29241a = 1;
                        if (rVarC.f0(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: androidx.compose.ui.platform.K1$a$a$c */
            static final class c extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ K1 f29243a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f29244b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(K1 k12, InterfaceC6839p interfaceC6839p) {
                    super(2);
                    this.f29243a = k12;
                    this.f29244b = interfaceC6839p;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f29243a.C(), this.f29244b, interfaceC3540l, 0);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1071a(K1 k12, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f29237a = k12;
                this.f29238b = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                }
                r rVarC = this.f29237a.C();
                int i11 = f0.h.f46610K;
                Object tag = rVarC.getTag(i11);
                Set set = kotlin.jvm.internal.V.o(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f29237a.C().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = kotlin.jvm.internal.V.o(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC3540l.k());
                    interfaceC3540l.a();
                }
                r rVarC2 = this.f29237a.C();
                boolean zL = interfaceC3540l.l(this.f29237a);
                K1 k12 = this.f29237a;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1072a(k12, null);
                    interfaceC3540l.K(objF);
                }
                T.O.f(rVarC2, (InterfaceC6839p) objF, interfaceC3540l, 0);
                r rVarC3 = this.f29237a.C();
                boolean zL2 = interfaceC3540l.l(this.f29237a);
                K1 k13 = this.f29237a;
                Object objF2 = interfaceC3540l.f();
                if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new b(k13, null);
                    interfaceC3540l.K(objF2);
                }
                T.O.f(rVarC3, (InterfaceC6839p) objF2, interfaceC3540l, 0);
                AbstractC3561w.a(AbstractC5411d.a().d(set), b0.c.e(-1193460702, true, new c(this.f29237a, this.f29238b), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p) {
            super(1);
            this.f29236b = interfaceC6839p;
        }

        public final void a(r.b bVar) {
            if (K1.this.f29232c) {
                return;
            }
            AbstractC4013k abstractC4013kO = bVar.a().O();
            K1.this.f29234e = this.f29236b;
            if (K1.this.f29233d == null) {
                K1.this.f29233d = abstractC4013kO;
                abstractC4013kO.a(K1.this);
            } else if (abstractC4013kO.b().isAtLeast(AbstractC4013k.b.CREATED)) {
                K1.this.B().e(b0.c.c(-2000640158, true, new C1071a(K1.this, this.f29236b)));
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r.b) obj);
            return Yg.J.f24997a;
        }
    }

    public K1(r rVar, InterfaceC3548p interfaceC3548p) {
        this.f29230a = rVar;
        this.f29231b = interfaceC3548p;
    }

    public final InterfaceC3548p B() {
        return this.f29231b;
    }

    public final r C() {
        return this.f29230a;
    }

    @Override // T.InterfaceC3548p
    public void dispose() {
        if (!this.f29232c) {
            this.f29232c = true;
            this.f29230a.getView().setTag(f0.h.f46611L, null);
            AbstractC4013k abstractC4013k = this.f29233d;
            if (abstractC4013k != null) {
                abstractC4013k.c(this);
            }
        }
        this.f29231b.dispose();
    }

    @Override // T.InterfaceC3548p
    public void e(InterfaceC6839p interfaceC6839p) {
        this.f29230a.setOnViewTreeOwnersAvailable(new a(interfaceC6839p));
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
        if (aVar == AbstractC4013k.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != AbstractC4013k.a.ON_CREATE || this.f29232c) {
                return;
            }
            e(this.f29234e);
        }
    }
}
