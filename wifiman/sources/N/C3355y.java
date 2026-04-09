package N;

import Ii.AbstractC3063k;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import y.C8549d;
import y.C8550e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* renamed from: N.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3355y implements V {

    /* renamed from: a, reason: collision with root package name */
    private final float f14847a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14848b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14849c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14850d;

    /* renamed from: N.y$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f14851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f14852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3355y f14853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W w10, C3355y c3355y, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14852b = w10;
            this.f14853c = c3355y;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f14852b, this.f14853c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14851a;
            if (i10 == 0) {
                Yg.v.b(obj);
                W w10 = this.f14852b;
                float f10 = this.f14853c.f14847a;
                float f11 = this.f14853c.f14848b;
                float f12 = this.f14853c.f14849c;
                float f13 = this.f14853c.f14850d;
                this.f14851a = 1;
                if (w10.f(f10, f11, f12, f13, this) == objG) {
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

    /* renamed from: N.y$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f14854a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14856c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ W f14857d;

        /* renamed from: N.y$b$a */
        static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f14858a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f14859b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ W f14860c;

            /* renamed from: N.y$b$a$a, reason: collision with other inner class name */
            static final class C0562a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f14861a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W f14862b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC8555j f14863c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0562a(W w10, InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f14862b = w10;
                    this.f14863c = interfaceC8555j;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0562a(this.f14862b, this.f14863c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f14861a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        W w10 = this.f14862b;
                        InterfaceC8555j interfaceC8555j = this.f14863c;
                        this.f14861a = 1;
                        if (w10.b(interfaceC8555j, this) == objG) {
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
                    return ((C0562a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            a(List list, Ii.N n10, W w10) {
                this.f14858a = list;
                this.f14859b = n10;
                this.f14860c = w10;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (interfaceC8555j instanceof C8552g) {
                    this.f14858a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8553h) {
                    this.f14858a.remove(((C8553h) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof C8549d) {
                    this.f14858a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8550e) {
                    this.f14858a.remove(((C8550e) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.b) {
                    this.f14858a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                    this.f14858a.remove(((InterfaceC8560o.c) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                    this.f14858a.remove(((InterfaceC8560o.a) interfaceC8555j).a());
                }
                AbstractC3063k.d(this.f14859b, null, null, new C0562a(this.f14860c, (InterfaceC8555j) AbstractC3689v.D0(this.f14858a), null), 3, null);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8556k interfaceC8556k, W w10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14856c = interfaceC8556k;
            this.f14857d = w10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f14856c, this.f14857d, interfaceC5380e);
            bVar.f14855b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14854a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f14855b;
                ArrayList arrayList = new ArrayList();
                InterfaceC3220g interfaceC3220gB = this.f14856c.b();
                a aVar = new a(arrayList, n10, this.f14857d);
                this.f14854a = 1;
                if (interfaceC3220gB.b(aVar, this) == objG) {
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

    public /* synthetic */ C3355y(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // N.V
    public z1 a(InterfaceC8556k interfaceC8556k, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-478475335);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-478475335, i10, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:271)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new W(this.f14847a, this.f14848b, this.f14849c, this.f14850d, null);
            interfaceC3540l.K(objF);
        }
        W w10 = (W) objF;
        boolean zL = interfaceC3540l.l(w10) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(this)) || (i10 & 48) == 32);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new a(w10, this, null);
            interfaceC3540l.K(objF2);
        }
        T.O.f(this, (InterfaceC6839p) objF2, interfaceC3540l, (i10 >> 3) & 14);
        boolean zL2 = interfaceC3540l.l(w10) | ((i12 > 4 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 6) == 4);
        Object objF3 = interfaceC3540l.f();
        if (zL2 || objF3 == InterfaceC3540l.f21100a.a()) {
            objF3 = new b(interfaceC8556k, w10, null);
            interfaceC3540l.K(objF3);
        }
        T.O.f(interfaceC8556k, (InterfaceC6839p) objF3, interfaceC3540l, i11);
        z1 z1VarC = w10.c();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3355y)) {
            return false;
        }
        C3355y c3355y = (C3355y) obj;
        if (Y0.h.n(this.f14847a, c3355y.f14847a) && Y0.h.n(this.f14848b, c3355y.f14848b) && Y0.h.n(this.f14849c, c3355y.f14849c)) {
            return Y0.h.n(this.f14850d, c3355y.f14850d);
        }
        return false;
    }

    public int hashCode() {
        return (((((Y0.h.p(this.f14847a) * 31) + Y0.h.p(this.f14848b)) * 31) + Y0.h.p(this.f14849c)) * 31) + Y0.h.p(this.f14850d);
    }

    private C3355y(float f10, float f11, float f12, float f13) {
        this.f14847a = f10;
        this.f14848b = f11;
        this.f14849c = f12;
        this.f14850d = f13;
    }
}
