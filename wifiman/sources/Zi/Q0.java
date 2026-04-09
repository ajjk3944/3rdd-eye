package Zi;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class Q0 implements Xi.f, InterfaceC3720n {

    /* renamed from: a, reason: collision with root package name */
    private final Xi.f f25584a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25585b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f25586c;

    public Q0(Xi.f original) {
        AbstractC6492s.i(original, "original");
        this.f25584a = original;
        this.f25585b = original.a() + '?';
        this.f25586c = B0.a(original);
    }

    @Override // Xi.f
    public String a() {
        return this.f25585b;
    }

    @Override // Zi.InterfaceC3720n
    public Set b() {
        return this.f25586c;
    }

    @Override // Xi.f
    public boolean c() {
        return true;
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        return this.f25584a.d(name);
    }

    @Override // Xi.f
    public int e() {
        return this.f25584a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q0) && AbstractC6492s.d(this.f25584a, ((Q0) obj).f25584a);
    }

    @Override // Xi.f
    public String f(int i10) {
        return this.f25584a.f(i10);
    }

    @Override // Xi.f
    public List g(int i10) {
        return this.f25584a.g(i10);
    }

    @Override // Xi.f
    public List getAnnotations() {
        return this.f25584a.getAnnotations();
    }

    @Override // Xi.f
    public Xi.m h() {
        return this.f25584a.h();
    }

    public int hashCode() {
        return this.f25584a.hashCode() * 31;
    }

    @Override // Xi.f
    public Xi.f i(int i10) {
        return this.f25584a.i(i10);
    }

    @Override // Xi.f
    public boolean isInline() {
        return this.f25584a.isInline();
    }

    @Override // Xi.f
    public boolean j(int i10) {
        return this.f25584a.j(i10);
    }

    public final Xi.f k() {
        return this.f25584a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25584a);
        sb2.append('?');
        return sb2.toString();
    }
}
