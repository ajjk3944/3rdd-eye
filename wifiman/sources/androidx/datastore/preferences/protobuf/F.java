package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o0;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private final a f30781a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f30782b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f30783c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final o0.b f30784a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f30785b;

        /* renamed from: c, reason: collision with root package name */
        public final o0.b f30786c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f30787d;

        public a(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
            this.f30784a = bVar;
            this.f30785b = obj;
            this.f30786c = bVar2;
            this.f30787d = obj2;
        }
    }

    private F(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
        this.f30781a = new a(bVar, obj, bVar2, obj2);
        this.f30782b = obj;
        this.f30783c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return r.b(aVar.f30784a, 1, obj) + r.b(aVar.f30786c, 2, obj2);
    }

    public static F d(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
        return new F(bVar, obj, bVar2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        r.u(codedOutputStream, aVar.f30784a, 1, obj);
        r.u(codedOutputStream, aVar.f30786c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return CodedOutputStream.P(i10) + CodedOutputStream.y(b(this.f30781a, obj, obj2));
    }

    a c() {
        return this.f30781a;
    }
}
