package f2;

import Yg.J;
import f2.y;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    private boolean f46947b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46948c;

    /* renamed from: e, reason: collision with root package name */
    private String f46950e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46951f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46952g;

    /* renamed from: h, reason: collision with root package name */
    private th.d f46953h;

    /* renamed from: i, reason: collision with root package name */
    private Object f46954i;

    /* renamed from: a, reason: collision with root package name */
    private final y.a f46946a = new y.a();

    /* renamed from: d, reason: collision with root package name */
    private int f46949d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46955a = new a();

        a() {
            super(1);
        }

        public final void a(C5501G c5501g) {
            AbstractC6492s.i(c5501g, "$this$null");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5501G) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46956a = new b();

        b() {
            super(1);
        }

        public final void a(C5501G c5501g) {
            AbstractC6492s.i(c5501g, "$this$null");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5501G) obj);
            return J.f24997a;
        }
    }

    public static /* synthetic */ void e(z zVar, int i10, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC6835l = a.f46955a;
        }
        zVar.c(i10, interfaceC6835l);
    }

    public static /* synthetic */ void f(z zVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6835l = b.f46956a;
        }
        zVar.d(str, interfaceC6835l);
    }

    private final void i(String str) {
        if (str != null) {
            if (kotlin.text.t.m0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f46950e = str;
            this.f46951f = false;
        }
    }

    public final void a(InterfaceC6835l animBuilder) {
        AbstractC6492s.i(animBuilder, "animBuilder");
        C5503b c5503b = new C5503b();
        animBuilder.invoke(c5503b);
        this.f46946a.b(c5503b.a()).c(c5503b.b()).e(c5503b.c()).f(c5503b.d());
    }

    public final y b() {
        y.a aVar = this.f46946a;
        aVar.d(this.f46947b);
        aVar.l(this.f46948c);
        String str = this.f46950e;
        if (str != null) {
            aVar.i(str, this.f46951f, this.f46952g);
        } else {
            th.d dVar = this.f46953h;
            if (dVar != null) {
                AbstractC6492s.f(dVar);
                aVar.j(dVar, this.f46951f, this.f46952g);
            } else {
                Object obj = this.f46954i;
                if (obj != null) {
                    AbstractC6492s.f(obj);
                    aVar.h(obj, this.f46951f, this.f46952g);
                } else {
                    aVar.g(this.f46949d, this.f46951f, this.f46952g);
                }
            }
        }
        return aVar.a();
    }

    public final void c(int i10, InterfaceC6835l popUpToBuilder) {
        AbstractC6492s.i(popUpToBuilder, "popUpToBuilder");
        h(i10);
        i(null);
        C5501G c5501g = new C5501G();
        popUpToBuilder.invoke(c5501g);
        this.f46951f = c5501g.a();
        this.f46952g = c5501g.b();
    }

    public final void d(String route, InterfaceC6835l popUpToBuilder) {
        AbstractC6492s.i(route, "route");
        AbstractC6492s.i(popUpToBuilder, "popUpToBuilder");
        i(route);
        h(-1);
        C5501G c5501g = new C5501G();
        popUpToBuilder.invoke(c5501g);
        this.f46951f = c5501g.a();
        this.f46952g = c5501g.b();
    }

    public final void g(boolean z10) {
        this.f46947b = z10;
    }

    public final void h(int i10) {
        this.f46949d = i10;
        this.f46951f = false;
    }

    public final void j(boolean z10) {
        this.f46948c = z10;
    }
}
