package Xi;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f24434a;

    /* renamed from: b, reason: collision with root package name */
    public final th.d f24435b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24436c;

    public c(f original, th.d kClass) {
        AbstractC6492s.i(original, "original");
        AbstractC6492s.i(kClass, "kClass");
        this.f24434a = original;
        this.f24435b = kClass;
        this.f24436c = original.a() + '<' + kClass.v() + '>';
    }

    @Override // Xi.f
    public String a() {
        return this.f24436c;
    }

    @Override // Xi.f
    public boolean c() {
        return this.f24434a.c();
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        return this.f24434a.d(name);
    }

    @Override // Xi.f
    public int e() {
        return this.f24434a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && AbstractC6492s.d(this.f24434a, cVar.f24434a) && AbstractC6492s.d(cVar.f24435b, this.f24435b);
    }

    @Override // Xi.f
    public String f(int i10) {
        return this.f24434a.f(i10);
    }

    @Override // Xi.f
    public List g(int i10) {
        return this.f24434a.g(i10);
    }

    @Override // Xi.f
    public List getAnnotations() {
        return this.f24434a.getAnnotations();
    }

    @Override // Xi.f
    public m h() {
        return this.f24434a.h();
    }

    public int hashCode() {
        return (this.f24435b.hashCode() * 31) + a().hashCode();
    }

    @Override // Xi.f
    public f i(int i10) {
        return this.f24434a.i(i10);
    }

    @Override // Xi.f
    public boolean isInline() {
        return this.f24434a.isInline();
    }

    @Override // Xi.f
    public boolean j(int i10) {
        return this.f24434a.j(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f24435b + ", original: " + this.f24434a + ')';
    }
}
