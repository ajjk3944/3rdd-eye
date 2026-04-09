package b1;

import C0.K;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C0;
import f.AbstractC5487d;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: b1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4055l extends AbstractC4052i {

    /* renamed from: f, reason: collision with root package name */
    private boolean f32750f;

    /* renamed from: g, reason: collision with root package name */
    private b f32751g;

    /* renamed from: h, reason: collision with root package name */
    private final int f32752h;

    /* renamed from: i, reason: collision with root package name */
    private int f32753i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f32754j;

    /* renamed from: b1.l$a */
    private static final class a extends C0 implements K {

        /* renamed from: b, reason: collision with root package name */
        private final C4049f f32755b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6835l f32756c;

        /* renamed from: b1.l$a$a, reason: collision with other inner class name */
        public static final class C1138a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4049f f32757a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f32758b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1138a(C4049f c4049f, InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f32757a = c4049f;
                this.f32758b = interfaceC6835l;
            }

            public final void a(B0 b02) {
                throw null;
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                AbstractC5487d.a(obj);
                a(null);
                return J.f24997a;
            }
        }

        public a(C4049f c4049f, InterfaceC6835l interfaceC6835l) {
            super(AbstractC3964z0.b() ? new C1138a(c4049f, interfaceC6835l) : AbstractC3964z0.a());
            this.f32755b = c4049f;
            this.f32756c = interfaceC6835l;
        }

        @Override // C0.K
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4054k M(Y0.d dVar, Object obj) {
            return new C4054k(this.f32755b, this.f32756c);
        }

        public boolean equals(Object obj) {
            InterfaceC6835l interfaceC6835l = this.f32756c;
            a aVar = obj instanceof a ? (a) obj : null;
            return interfaceC6835l == (aVar != null ? aVar.f32756c : null);
        }

        public int hashCode() {
            return this.f32756c.hashCode();
        }
    }

    /* renamed from: b1.l$b */
    public final class b {
        public b() {
        }

        public final C4049f a() {
            return C4055l.this.i();
        }

        public final C4049f b() {
            return C4055l.this.i();
        }

        public final C4049f c() {
            return C4055l.this.i();
        }

        public final C4049f d() {
            return C4055l.this.i();
        }

        public final C4049f e() {
            return C4055l.this.i();
        }

        public final C4049f f() {
            return C4055l.this.i();
        }

        public final C4049f g() {
            return C4055l.this.i();
        }
    }

    public C4055l() {
        super(null);
        this.f32753i = this.f32752h;
        this.f32754j = new ArrayList();
    }

    @Override // b1.AbstractC4052i
    public void f() {
        super.f();
        this.f32753i = this.f32752h;
    }

    public final androidx.compose.ui.e h(androidx.compose.ui.e eVar, C4049f c4049f, InterfaceC6835l interfaceC6835l) {
        if (this.f32750f) {
            interfaceC6835l.invoke(new C4048e(c4049f.a(), b(c4049f)));
        }
        return eVar.b0(new a(c4049f, interfaceC6835l));
    }

    public final C4049f i() {
        ArrayList arrayList = this.f32754j;
        int i10 = this.f32753i;
        this.f32753i = i10 + 1;
        C4049f c4049f = (C4049f) AbstractC3689v.t0(arrayList, i10);
        if (c4049f != null) {
            return c4049f;
        }
        C4049f c4049f2 = new C4049f(Integer.valueOf(this.f32753i));
        this.f32754j.add(c4049f2);
        return c4049f2;
    }

    public final b j() {
        b bVar = this.f32751g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f32751g = bVar2;
        return bVar2;
    }
}
