package O9;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: ContextAware.kt */
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f f10488a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.e f10489b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10490c;

    public b(f fVar, kotlin.jvm.internal.e kClass) {
        kotlin.jvm.internal.l.f(kClass, "kClass");
        this.f10488a = fVar;
        this.f10489b = kClass;
        this.f10490c = fVar.f10502a + '<' + kClass.d() + '>';
    }

    @Override // O9.e
    public final String a() {
        return this.f10490c;
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return this.f10488a.d(name);
    }

    @Override // O9.e
    public final k e() {
        return this.f10488a.f10503b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f10488a.equals(bVar.f10488a) && kotlin.jvm.internal.l.b(bVar.f10489b, this.f10489b);
    }

    @Override // O9.e
    public final int f() {
        return this.f10488a.f10504c;
    }

    @Override // O9.e
    public final String g(int i) {
        return this.f10488a.f10507f[i];
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return this.f10488a.f10505d;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        return this.f10488a.f10509h[i];
    }

    public final int hashCode() {
        return this.f10490c.hashCode() + (this.f10489b.hashCode() * 31);
    }

    @Override // O9.e
    public final e i(int i) {
        return this.f10488a.f10508g[i];
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        return this.f10488a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f10489b + ", original: " + this.f10488a + ')';
    }
}
