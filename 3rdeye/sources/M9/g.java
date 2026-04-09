package M9;

import Q9.AbstractC1520b;
import b9.C2001h;
import c9.C2099t;
import w9.InterfaceC5748c;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes3.dex */
public final class g<T> extends AbstractC1520b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f4349a;

    /* renamed from: b, reason: collision with root package name */
    public final C2099t f4350b = C2099t.f18581b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4351c = C2001h.a(b9.i.PUBLICATION, new f(this));

    public g(kotlin.jvm.internal.e eVar) {
        this.f4349a = eVar;
    }

    @Override // Q9.AbstractC1520b
    public final InterfaceC5748c<T> a() {
        return this.f4349a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    @Override // M9.b
    public final O9.e getDescriptor() {
        return (O9.e) this.f4351c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f4349a + ')';
    }
}
