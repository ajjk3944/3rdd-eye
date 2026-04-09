package T9;

import I9.g;
import c9.C2100u;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import w9.InterfaceC5748c;

/* compiled from: SerializersModule.kt */
/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final C2100u f12333b;

    /* renamed from: c, reason: collision with root package name */
    public final C2100u f12334c;

    /* renamed from: d, reason: collision with root package name */
    public final C2100u f12335d;

    /* renamed from: e, reason: collision with root package name */
    public final C2100u f12336e;

    /* renamed from: f, reason: collision with root package name */
    public final C2100u f12337f;

    public a() {
        C2100u c2100u = C2100u.f18582b;
        this.f12333b = c2100u;
        this.f12334c = c2100u;
        this.f12335d = c2100u;
        this.f12336e = c2100u;
        this.f12337f = c2100u;
    }

    @Override // I9.g
    public final <T> M9.b<T> Q(InterfaceC5748c<T> kClass, List<? extends M9.b<?>> typeArgumentsSerializers) {
        l.f(kClass, "kClass");
        l.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f12333b.getClass();
        return null;
    }

    @Override // I9.g
    public final M9.b T(String str, InterfaceC5748c baseClass) {
        l.f(baseClass, "baseClass");
        this.f12336e.getClass();
        this.f12337f.getClass();
        z.c(1, null);
        return null;
    }

    @Override // I9.g
    public final <T> M9.b U(InterfaceC5748c<? super T> baseClass, T value) {
        l.f(baseClass, "baseClass");
        l.f(value, "value");
        if (!baseClass.g(value)) {
            return null;
        }
        this.f12334c.getClass();
        this.f12335d.getClass();
        z.c(1, null);
        return null;
    }
}
