package Q9;

import Li.AbstractC3222i;
import Li.D;
import Li.F;
import Li.y;
import Q9.j;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    private final y f19241a;

    /* renamed from: b, reason: collision with root package name */
    private final D f19242b;

    public a() {
        y yVarB = F.b(0, 1, null, 5, null);
        this.f19241a = yVarB;
        this.f19242b = AbstractC3222i.a(yVarB);
    }

    @Override // Q9.j
    public D a() {
        return this.f19242b;
    }

    @Override // Q9.j
    public void b(j.a navTarget) {
        AbstractC6492s.i(navTarget, "navTarget");
        this.f19241a.j(navTarget);
    }
}
