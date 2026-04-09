package k6;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6394a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1892a f51233a = C1892a.f51234a;

    /* renamed from: k6.a$a, reason: collision with other inner class name */
    public static final class C1892a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1892a f51234a = new C1892a();

        /* renamed from: k6.a$a$a, reason: collision with other inner class name */
        public static final class C1893a implements InterfaceC6394a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Float f51235b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Float f51236c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Float f51237d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Float f51238e;

            C1893a(Float f10, Float f11, Float f12, Float f13) {
                this.f51235b = f10;
                this.f51236c = f11;
                this.f51237d = f12;
                this.f51238e = f13;
            }

            @Override // k6.InterfaceC6394a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float a(x6.b model) {
                AbstractC6492s.i(model, "model");
                return this.f51236c;
            }

            @Override // k6.InterfaceC6394a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Float b(x6.b model) {
                AbstractC6492s.i(model, "model");
                return this.f51238e;
            }

            @Override // k6.InterfaceC6394a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Float c(x6.b model) {
                AbstractC6492s.i(model, "model");
                return this.f51235b;
            }

            @Override // k6.InterfaceC6394a
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Float d(x6.b model) {
                AbstractC6492s.i(model, "model");
                return this.f51237d;
            }
        }

        private C1892a() {
        }

        public final InterfaceC6394a a(Float f10, Float f11, Float f12, Float f13) {
            return new C1893a(f10, f11, f12, f13);
        }
    }

    Float a(Object obj);

    Float b(Object obj);

    Float c(Object obj);

    Float d(Object obj);
}
