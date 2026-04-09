package Zi;

import Xi.n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3727q0 implements Xi.f {

    /* renamed from: a, reason: collision with root package name */
    public static final C3727q0 f25679a = new C3727q0();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.m f25680b = n.d.f24473a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f25681c = "kotlin.Nothing";

    private C3727q0() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // Xi.f
    public String a() {
        return f25681c;
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
        return this == obj;
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

    @Override // Xi.f
    public Xi.m h() {
        return f25680b;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
