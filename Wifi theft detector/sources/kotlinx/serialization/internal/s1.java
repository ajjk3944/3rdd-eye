package kotlinx.serialization.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.f;

/* loaded from: classes4.dex */
public final class s1 implements kotlinx.serialization.descriptors.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f22911a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.e f22912b;

    public s1(String serialName, kotlinx.serialization.descriptors.e kind) {
        kotlin.jvm.internal.p.e(serialName, "serialName");
        kotlin.jvm.internal.p.e(kind, "kind");
        this.f22911a = serialName;
        this.f22912b = kind;
    }

    public final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        kotlin.jvm.internal.p.e(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22911a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.descriptors.e getKind() {
        return this.f22912b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
