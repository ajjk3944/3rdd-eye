package N;

import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13746c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3310b f13747a;

    /* renamed from: b, reason: collision with root package name */
    private Y0.d f13748b;

    public static final class a {

        /* renamed from: N.H$a$a, reason: collision with other inner class name */
        static final class C0539a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final C0539a f13749a = new C0539a();

            C0539a() {
                super(2);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final I invoke(InterfaceC4184m interfaceC4184m, H h10) {
                return h10.d();
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f13750a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f13750a = interfaceC6835l;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final H invoke(I i10) {
                return new H(i10, this.f13750a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a(InterfaceC6835l interfaceC6835l) {
            return AbstractC4183l.a(C0539a.f13749a, new b(interfaceC6835l));
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(H.this.f().d1(G.f13679b));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(H.this.f().d1(G.f13680c));
        }
    }

    public H(I i10, InterfaceC6835l interfaceC6835l) {
        this.f13747a = new C3310b(i10, new b(), new c(), G.f13681d, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y0.d f() {
        Y0.d dVar = this.f13748b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(InterfaceC5380e interfaceC5380e) {
        Object objG = androidx.compose.material.a.g(this.f13747a, I.Closed, 0.0f, interfaceC5380e, 2, null);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    public final C3310b c() {
        return this.f13747a;
    }

    public final I d() {
        return (I) this.f13747a.s();
    }

    public final boolean e() {
        return d() == I.Open;
    }

    public final float g() {
        return this.f13747a.A();
    }

    public final void h(Y0.d dVar) {
        this.f13748b = dVar;
    }
}
