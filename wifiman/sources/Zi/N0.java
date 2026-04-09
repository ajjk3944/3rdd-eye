package Zi;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class N0 implements Xi.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f25577a;

    /* renamed from: b, reason: collision with root package name */
    private final Xi.e f25578b;

    public N0(String serialName, Xi.e kind) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(kind, "kind");
        this.f25577a = serialName;
        this.f25578b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor " + a() + " does not have elements");
    }

    @Override // Xi.f
    public String a() {
        return this.f25577a;
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        b();
        throw new KotlinNothingValueException();
    }

    @Override // Xi.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return AbstractC6492s.d(a(), n02.a()) && AbstractC6492s.d(h(), n02.h());
    }

    @Override // Xi.f
    public String f(int i10) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // Xi.f
    public List g(int i10) {
        b();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return a().hashCode() + (h().hashCode() * 31);
    }

    @Override // Xi.f
    public Xi.f i(int i10) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // Xi.f
    public boolean j(int i10) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // Xi.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Xi.e h() {
        return this.f25578b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
