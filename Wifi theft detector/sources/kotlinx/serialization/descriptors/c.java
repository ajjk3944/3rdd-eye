package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f22764a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.c f22765b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22766c;

    public c(f original, r9.c kClass) {
        p.e(original, "original");
        p.e(kClass, "kClass");
        this.f22764a = original;
        this.f22765b = kClass;
        this.f22766c = original.h() + '<' + kClass.i() + '>';
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return this.f22764a.b();
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        p.e(name, "name");
        return this.f22764a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return this.f22764a.d();
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return this.f22764a.e(i10);
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && p.a(this.f22764a, cVar.f22764a) && p.a(cVar.f22765b, this.f22765b);
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        return this.f22764a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public f g(int i10) {
        return this.f22764a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return this.f22764a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    public h getKind() {
        return this.f22764a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22766c;
    }

    public int hashCode() {
        return (this.f22765b.hashCode() * 31) + h().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        return this.f22764a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return this.f22764a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f22765b + ", original: " + this.f22764a + ')';
    }
}
