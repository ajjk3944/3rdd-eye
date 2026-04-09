package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6491q;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
abstract /* synthetic */ class x {

    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g[] f12049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.r f12050b;

        /* renamed from: Li.x$a$a, reason: collision with other inner class name */
        public static final class C0476a extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f12051a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f12052b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f12053c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mh.r f12054d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0476a(InterfaceC5380e interfaceC5380e, mh.r rVar) {
                super(3, interfaceC5380e);
                this.f12054d = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3221h interfaceC3221h;
                Object objG = AbstractC5467b.g();
                int i10 = this.f12051a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    interfaceC3221h = (InterfaceC3221h) this.f12052b;
                    Object[] objArr = (Object[]) this.f12053c;
                    mh.r rVar = this.f12054d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f12052b = interfaceC3221h;
                    this.f12051a = 1;
                    AbstractC6491q.a(6);
                    obj = rVar.y(obj2, obj3, obj4, this);
                    AbstractC6491q.a(7);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        return Yg.J.f24997a;
                    }
                    interfaceC3221h = (InterfaceC3221h) this.f12052b;
                    Yg.v.b(obj);
                }
                this.f12052b = null;
                this.f12051a = 2;
                if (interfaceC3221h.a(obj, this) == objG) {
                    return objG;
                }
                return Yg.J.f24997a;
            }

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3221h interfaceC3221h, Object[] objArr, InterfaceC5380e interfaceC5380e) {
                C0476a c0476a = new C0476a(interfaceC5380e, this.f12054d);
                c0476a.f12052b = interfaceC3221h;
                c0476a.f12053c = objArr;
                return c0476a.invokeSuspend(Yg.J.f24997a);
            }
        }

        public a(InterfaceC3220g[] interfaceC3220gArr, mh.r rVar) {
            this.f12049a = interfaceC3220gArr;
            this.f12050b = rVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objA = Mi.j.a(interfaceC3221h, this.f12049a, x.d(), new C0476a(null, this.f12050b), interfaceC5380e);
            return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
        }
    }

    public static final class b implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g[] f12055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.s f12056b;

        public static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f12057a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f12058b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f12059c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mh.s f12060d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5380e interfaceC5380e, mh.s sVar) {
                super(3, interfaceC5380e);
                this.f12060d = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3221h interfaceC3221h;
                Object objG = AbstractC5467b.g();
                int i10 = this.f12057a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    interfaceC3221h = (InterfaceC3221h) this.f12058b;
                    Object[] objArr = (Object[]) this.f12059c;
                    mh.s sVar = this.f12060d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f12058b = interfaceC3221h;
                    this.f12057a = 1;
                    AbstractC6491q.a(6);
                    obj = sVar.K(obj2, obj3, obj4, obj5, this);
                    AbstractC6491q.a(7);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        return Yg.J.f24997a;
                    }
                    interfaceC3221h = (InterfaceC3221h) this.f12058b;
                    Yg.v.b(obj);
                }
                this.f12058b = null;
                this.f12057a = 2;
                if (interfaceC3221h.a(obj, this) == objG) {
                    return objG;
                }
                return Yg.J.f24997a;
            }

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3221h interfaceC3221h, Object[] objArr, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(interfaceC5380e, this.f12060d);
                aVar.f12058b = interfaceC3221h;
                aVar.f12059c = objArr;
                return aVar.invokeSuspend(Yg.J.f24997a);
            }
        }

        public b(InterfaceC3220g[] interfaceC3220gArr, mh.s sVar) {
            this.f12055a = interfaceC3220gArr;
            this.f12056b = sVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objA = Mi.j.a(interfaceC3221h, this.f12055a, x.d(), new a(null, this.f12056b), interfaceC5380e);
            return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
        }
    }

    static final class c implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12061a = new c();

        c() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC3220g b(InterfaceC3220g interfaceC3220g, InterfaceC3220g interfaceC3220g2, InterfaceC3220g interfaceC3220g3, InterfaceC3220g interfaceC3220g4, mh.s sVar) {
        return new b(new InterfaceC3220g[]{interfaceC3220g, interfaceC3220g2, interfaceC3220g3, interfaceC3220g4}, sVar);
    }

    public static final InterfaceC3220g c(InterfaceC3220g interfaceC3220g, InterfaceC3220g interfaceC3220g2, InterfaceC3220g interfaceC3220g3, mh.r rVar) {
        return new a(new InterfaceC3220g[]{interfaceC3220g, interfaceC3220g2, interfaceC3220g3}, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6824a d() {
        return c.f12061a;
    }
}
