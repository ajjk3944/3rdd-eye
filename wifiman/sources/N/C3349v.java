package N;

import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import mh.InterfaceC6839p;
import r.C7517a;
import y.C8549d;
import y.C8550e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* renamed from: N.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3349v implements InterfaceC3318f {

    /* renamed from: a, reason: collision with root package name */
    private final float f14798a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14799b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14800c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14801d;

    /* renamed from: e, reason: collision with root package name */
    private final float f14802e;

    /* renamed from: N.v$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f14803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.k f14805c;

        /* renamed from: N.v$a$a, reason: collision with other inner class name */
        static final class C0561a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f14806a;

            C0561a(androidx.compose.runtime.snapshots.k kVar) {
                this.f14806a = kVar;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (interfaceC8555j instanceof C8552g) {
                    this.f14806a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8553h) {
                    this.f14806a.remove(((C8553h) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof C8549d) {
                    this.f14806a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8550e) {
                    this.f14806a.remove(((C8550e) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.b) {
                    this.f14806a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                    this.f14806a.remove(((InterfaceC8560o.c) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                    this.f14806a.remove(((InterfaceC8560o.a) interfaceC8555j).a());
                }
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC8556k interfaceC8556k, androidx.compose.runtime.snapshots.k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14804b = interfaceC8556k;
            this.f14805c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f14804b, this.f14805c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14803a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220gB = this.f14804b.b();
                C0561a c0561a = new C0561a(this.f14805c);
                this.f14803a = 1;
                if (interfaceC3220gB.b(c0561a, this) == objG) {
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
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: N.v$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f14807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f14808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14809c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14810d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3349v f14811e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC8555j f14812f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7517a c7517a, float f10, boolean z10, C3349v c3349v, InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14808b = c7517a;
            this.f14809c = f10;
            this.f14810d = z10;
            this.f14811e = c3349v;
            this.f14812f = interfaceC8555j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f14808b, this.f14809c, this.f14810d, this.f14811e, this.f14812f, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14807a;
            if (i10 == 0) {
                Yg.v.b(obj);
                if (!Y0.h.n(((Y0.h) this.f14808b.k()).s(), this.f14809c)) {
                    if (this.f14810d) {
                        float fS = ((Y0.h) this.f14808b.k()).s();
                        InterfaceC8555j c8549d = null;
                        if (Y0.h.n(fS, this.f14811e.f14799b)) {
                            c8549d = new InterfaceC8560o.b(C6531g.f52335b.c(), null);
                        } else if (Y0.h.n(fS, this.f14811e.f14801d)) {
                            c8549d = new C8552g();
                        } else if (Y0.h.n(fS, this.f14811e.f14802e)) {
                            c8549d = new C8549d();
                        }
                        C7517a c7517a = this.f14808b;
                        float f10 = this.f14809c;
                        InterfaceC8555j interfaceC8555j = this.f14812f;
                        this.f14807a = 2;
                        if (L.d(c7517a, f10, c8549d, interfaceC8555j, this) == objG) {
                            return objG;
                        }
                    } else {
                        C7517a c7517a2 = this.f14808b;
                        Y0.h hVarD = Y0.h.d(this.f14809c);
                        this.f14807a = 1;
                        if (c7517a2.t(hVarD, this) == objG) {
                            return objG;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
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

    public /* synthetic */ C3349v(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // N.InterfaceC3318f
    public z1 a(boolean z10, InterfaceC8556k interfaceC8556k, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1588756907);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:506)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = o1.f();
            interfaceC3540l.K(objF);
        }
        androidx.compose.runtime.snapshots.k kVar = (androidx.compose.runtime.snapshots.k) objF;
        boolean z11 = true;
        boolean z12 = (((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 48) == 32;
        Object objF2 = interfaceC3540l.f();
        if (z12 || objF2 == aVar.a()) {
            objF2 = new a(interfaceC8556k, kVar, null);
            interfaceC3540l.K(objF2);
        }
        T.O.f(interfaceC8556k, (InterfaceC6839p) objF2, interfaceC3540l, (i10 >> 3) & 14);
        InterfaceC8555j interfaceC8555j = (InterfaceC8555j) AbstractC3689v.D0(kVar);
        float f10 = !z10 ? this.f14800c : interfaceC8555j instanceof InterfaceC8560o.b ? this.f14799b : interfaceC8555j instanceof C8552g ? this.f14801d : interfaceC8555j instanceof C8549d ? this.f14802e : this.f14798a;
        Object objF3 = interfaceC3540l.f();
        if (objF3 == aVar.a()) {
            objF3 = new C7517a(Y0.h.d(f10), r.u0.b(Y0.h.f24523b), null, null, 12, null);
            interfaceC3540l.K(objF3);
        }
        C7517a c7517a = (C7517a) objF3;
        Y0.h hVarD = Y0.h.d(f10);
        boolean zL = interfaceC3540l.l(c7517a) | interfaceC3540l.g(f10) | ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.c(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !interfaceC3540l.T(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zL2 = zL | z11 | interfaceC3540l.l(interfaceC8555j);
        Object objF4 = interfaceC3540l.f();
        if (zL2 || objF4 == aVar.a()) {
            Object bVar = new b(c7517a, f10, z10, this, interfaceC8555j, null);
            interfaceC3540l.K(bVar);
            objF4 = bVar;
        }
        T.O.f(hVarD, (InterfaceC6839p) objF4, interfaceC3540l, 0);
        z1 z1VarG = c7517a.g();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarG;
    }

    private C3349v(float f10, float f11, float f12, float f13, float f14) {
        this.f14798a = f10;
        this.f14799b = f11;
        this.f14800c = f12;
        this.f14801d = f13;
        this.f14802e = f14;
    }
}
