package aj;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: aj.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3870d implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3870d f26333a = new C3870d();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26334b = a.f26335b;

    /* renamed from: aj.d$a */
    private static final class a implements Xi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26335b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f26336c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Xi.f f26337a = Wi.a.h(r.f26374a).a();

        private a() {
        }

        @Override // Xi.f
        public String a() {
            return f26336c;
        }

        @Override // Xi.f
        public boolean c() {
            return this.f26337a.c();
        }

        @Override // Xi.f
        public int d(String name) {
            AbstractC6492s.i(name, "name");
            return this.f26337a.d(name);
        }

        @Override // Xi.f
        public int e() {
            return this.f26337a.e();
        }

        @Override // Xi.f
        public String f(int i10) {
            return this.f26337a.f(i10);
        }

        @Override // Xi.f
        public List g(int i10) {
            return this.f26337a.g(i10);
        }

        @Override // Xi.f
        public List getAnnotations() {
            return this.f26337a.getAnnotations();
        }

        @Override // Xi.f
        public Xi.m h() {
            return this.f26337a.h();
        }

        @Override // Xi.f
        public Xi.f i(int i10) {
            return this.f26337a.i(i10);
        }

        @Override // Xi.f
        public boolean isInline() {
            return this.f26337a.isInline();
        }

        @Override // Xi.f
        public boolean j(int i10) {
            return this.f26337a.j(i10);
        }
    }

    private C3870d() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26334b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3869c c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        s.g(decoder);
        return new C3869c((List) Wi.a.h(r.f26374a).c(decoder));
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, C3869c value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        Wi.a.h(r.f26374a).e(encoder, value);
    }
}
