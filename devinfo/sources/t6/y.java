package t6;

import java.util.LinkedHashSet;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends hb.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i4, Class cls) {
        super(cls);
        this.f34408d = i4;
    }

    @Override // hb.a
    public final j0 b() {
        switch (this.f34408d) {
            case 0:
                return new z((UUID) this.f25039a, (b7.r) this.f25040b, (LinkedHashSet) this.f25041c);
            default:
                b7.r rVar = (b7.r) this.f25040b;
                if (rVar.f2044q) {
                    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
                }
                return new e0((UUID) this.f25039a, rVar, (LinkedHashSet) this.f25041c);
        }
    }
}
