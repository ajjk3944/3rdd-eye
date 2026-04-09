package aj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;

/* renamed from: aj.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3865F implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3865F f26321a = new C3865F();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26322b = a.f26323b;

    /* renamed from: aj.F$a */
    private static final class a implements Xi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26323b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f26324c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Xi.f f26325a = Wi.a.k(Wi.a.K(U.f51694a), r.f26374a).a();

        private a() {
        }

        @Override // Xi.f
        public String a() {
            return f26324c;
        }

        @Override // Xi.f
        public boolean c() {
            return this.f26325a.c();
        }

        @Override // Xi.f
        public int d(String name) {
            AbstractC6492s.i(name, "name");
            return this.f26325a.d(name);
        }

        @Override // Xi.f
        public int e() {
            return this.f26325a.e();
        }

        @Override // Xi.f
        public String f(int i10) {
            return this.f26325a.f(i10);
        }

        @Override // Xi.f
        public List g(int i10) {
            return this.f26325a.g(i10);
        }

        @Override // Xi.f
        public List getAnnotations() {
            return this.f26325a.getAnnotations();
        }

        @Override // Xi.f
        public Xi.m h() {
            return this.f26325a.h();
        }

        @Override // Xi.f
        public Xi.f i(int i10) {
            return this.f26325a.i(i10);
        }

        @Override // Xi.f
        public boolean isInline() {
            return this.f26325a.isInline();
        }

        @Override // Xi.f
        public boolean j(int i10) {
            return this.f26325a.j(i10);
        }
    }

    private C3865F() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26322b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3864E c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        s.g(decoder);
        return new C3864E((Map) Wi.a.k(Wi.a.K(U.f51694a), r.f26374a).c(decoder));
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, C3864E value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        Wi.a.k(Wi.a.K(U.f51694a), r.f26374a).e(encoder, value);
    }
}
