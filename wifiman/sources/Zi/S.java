package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class S extends H0 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25587m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(String name, M generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(generatedSerializer, "generatedSerializer");
        this.f25587m = true;
    }

    @Override // Zi.H0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            Xi.f fVar = (Xi.f) obj;
            if (AbstractC6492s.d(a(), fVar.a())) {
                S s10 = (S) obj;
                if (s10.isInline() && Arrays.equals(u(), s10.u()) && e() == fVar.e()) {
                    int iE = e();
                    for (int i10 = 0; i10 < iE; i10++) {
                        if (AbstractC6492s.d(i(i10).a(), fVar.i(i10).a()) && AbstractC6492s.d(i(i10).h(), fVar.i(i10).h())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Zi.H0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Xi.f
    public boolean isInline() {
        return this.f25587m;
    }
}
