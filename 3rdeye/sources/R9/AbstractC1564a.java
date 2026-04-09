package R9;

import S9.C1579k;
import S9.C1586s;
import S9.N;
import S9.Q;
import S9.T;

/* compiled from: Json.kt */
/* renamed from: R9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1564a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0160a f11780d = new C0160a(new g(false, false, false, true, "    ", "type", true), T9.b.f12338a);

    /* renamed from: a, reason: collision with root package name */
    public final g f11781a;

    /* renamed from: b, reason: collision with root package name */
    public final T9.a f11782b;

    /* renamed from: c, reason: collision with root package name */
    public final C1586s f11783c = new C1586s();

    /* compiled from: Json.kt */
    /* renamed from: R9.a$a, reason: collision with other inner class name */
    public static final class C0160a extends AbstractC1564a {
    }

    public AbstractC1564a(g gVar, T9.a aVar) {
        this.f11781a = gVar;
        this.f11782b = aVar;
    }

    public final Object a(M9.b deserializer, String string) {
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        kotlin.jvm.internal.l.f(string, "string");
        Q q10 = new Q(string);
        Object objB = new N(this, T.OBJ, q10, deserializer.getDescriptor(), null).B(deserializer);
        q10.q();
        return objB;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [char[], java.io.Serializable] */
    public final String b(M9.b serializer, Object obj) {
        kotlin.jvm.internal.l.f(serializer, "serializer");
        S4.b bVar = new S4.b();
        C1579k c1579k = C1579k.f12090c;
        bVar.f11913c = c1579k.b(128);
        try {
            S9.C.a(this, bVar, serializer, obj);
            String string = bVar.toString();
            char[] array = (char[]) bVar.f11913c;
            c1579k.getClass();
            kotlin.jvm.internal.l.f(array, "array");
            c1579k.a(array);
            return string;
        } catch (Throwable th) {
            C1579k c1579k2 = C1579k.f12090c;
            char[] array2 = (char[]) bVar.f11913c;
            c1579k2.getClass();
            kotlin.jvm.internal.l.f(array2, "array");
            c1579k2.a(array2);
            throw th;
        }
    }
}
