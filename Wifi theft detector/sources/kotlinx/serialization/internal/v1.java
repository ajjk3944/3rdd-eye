package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class v1 implements kotlinx.serialization.descriptors.f, n {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22925b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22926c;

    public v1(kotlinx.serialization.descriptors.f original) {
        kotlin.jvm.internal.p.e(original, "original");
        this.f22924a = original;
        this.f22925b = original.h() + '?';
        this.f22926c = l1.a(original);
    }

    @Override // kotlinx.serialization.internal.n
    public Set a() {
        return this.f22926c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        kotlin.jvm.internal.p.e(name, "name");
        return this.f22924a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return this.f22924a.d();
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return this.f22924a.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && kotlin.jvm.internal.p.a(this.f22924a, ((v1) obj).f22924a);
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        return this.f22924a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i10) {
        return this.f22924a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return this.f22924a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.h getKind() {
        return this.f22924a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22925b;
    }

    public int hashCode() {
        return this.f22924a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        return this.f22924a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return this.f22924a.isInline();
    }

    public final kotlinx.serialization.descriptors.f j() {
        return this.f22924a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22924a);
        sb.append('?');
        return sb.toString();
    }
}
