package b7;

import d7.InterfaceC5304a;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import java.io.IOException;
import java.lang.reflect.Type;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4073a {

    /* renamed from: a, reason: collision with root package name */
    final b7.b f32960a;

    /* renamed from: b7.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private b7.b f32961a = new b7.b();

        public b a(Type type, InterfaceC5304a interfaceC5304a) {
            this.f32961a.f32964c.a(type, interfaceC5304a);
            return this;
        }

        public C4073a b() {
            return new C4073a(this.f32961a);
        }
    }

    public Object a(InterfaceC5483g interfaceC5483g, Class cls) throws IOException {
        f fVarD0 = f.d0(interfaceC5483g);
        fVarD0.a();
        fVarD0.S();
        Object objB = this.f32960a.a(cls).b(fVarD0, this.f32960a);
        fVarD0.h();
        return objB;
    }

    public void b(InterfaceC5482f interfaceC5482f, Object obj) throws IOException {
        h hVarA = h.a(interfaceC5482f);
        InterfaceC5304a interfaceC5304aA = this.f32960a.a(obj.getClass());
        if (this.f32960a.b()) {
            hVarA.j();
        }
        interfaceC5304aA.a(hVarA, this.f32960a, obj, null);
    }

    private C4073a(b7.b bVar) {
        this.f32960a = bVar;
    }
}
