package U9;

import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: U9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3621h extends R9.a {

    /* renamed from: e, reason: collision with root package name */
    private final Li.y f22208e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3220g f22209f;

    /* renamed from: U9.h$a */
    public interface a {

        /* renamed from: U9.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC0821a extends a {

            /* renamed from: U9.h$a$a$a, reason: collision with other inner class name */
            public static final class C0822a implements InterfaceC0821a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0822a f22210a = new C0822a();

                private C0822a() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0822a);
                }

                public int hashCode() {
                    return -415000066;
                }

                public String toString() {
                    return "Collapse";
                }
            }

            /* renamed from: U9.h$a$a$b */
            public static final class b implements InterfaceC0821a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f22211a = new b();

                private b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return -1280002773;
                }

                public String toString() {
                    return "Expand";
                }
            }
        }
    }

    public C3621h() {
        Li.y yVarB = Li.F.b(0, 1, null, 5, null);
        this.f22208e = yVarB;
        this.f22209f = AbstractC3222i.a(yVarB);
    }

    public final InterfaceC3220g b() {
        return this.f22209f;
    }

    public final void e0(a action) {
        AbstractC6492s.i(action, "action");
        this.f22208e.j(action);
    }
}
