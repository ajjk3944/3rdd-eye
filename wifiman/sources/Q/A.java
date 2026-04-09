package Q;

import T.C0;
import T.InterfaceC3543m0;
import Zg.AbstractC3689v;
import c0.AbstractC4172a;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final c f18716d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC4182k f18717e = AbstractC4172a.a(a.f18721a, b.f18722a);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3543m0 f18718a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3543m0 f18719b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3543m0 f18720c;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18721a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(InterfaceC4184m interfaceC4184m, A a10) {
            return AbstractC3689v.o(Float.valueOf(a10.e()), Float.valueOf(a10.d()), Float.valueOf(a10.c()));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18722a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(List list) {
            return new A(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return A.f18717e;
        }

        private c() {
        }
    }

    public A(float f10, float f11, float f12) {
        this.f18718a = C0.a(f10);
        this.f18719b = C0.a(f12);
        this.f18720c = C0.a(f11);
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    public final float c() {
        return this.f18719b.c();
    }

    public final float d() {
        return this.f18720c.c();
    }

    public final float e() {
        return this.f18718a.c();
    }

    public final void f(float f10) {
        this.f18719b.k(f10);
    }

    public final void g(float f10) {
        this.f18720c.k(AbstractC7978m.j(f10, e(), 0.0f));
    }

    public final void h(float f10) {
        this.f18718a.k(f10);
    }
}
