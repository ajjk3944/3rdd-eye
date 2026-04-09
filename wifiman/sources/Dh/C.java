package Dh;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    private final List f3326a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f3327b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3328c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f3329d;

    public C(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        AbstractC6492s.i(allDependencies, "allDependencies");
        AbstractC6492s.i(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        AbstractC6492s.i(directExpectedByDependencies, "directExpectedByDependencies");
        AbstractC6492s.i(allExpectedByDependencies, "allExpectedByDependencies");
        this.f3326a = allDependencies;
        this.f3327b = modulesWhoseInternalsAreVisible;
        this.f3328c = directExpectedByDependencies;
        this.f3329d = allExpectedByDependencies;
    }

    @Override // Dh.B
    public List a() {
        return this.f3326a;
    }

    @Override // Dh.B
    public Set b() {
        return this.f3327b;
    }

    @Override // Dh.B
    public List c() {
        return this.f3328c;
    }
}
