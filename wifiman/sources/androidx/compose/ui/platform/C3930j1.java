package androidx.compose.ui.platform;

import java.util.List;
import o.AbstractC7022m;
import o.AbstractC7025p;
import o.C7002A;

/* renamed from: androidx.compose.ui.platform.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3930j1 {

    /* renamed from: a, reason: collision with root package name */
    private final J0.j f29407a;

    /* renamed from: b, reason: collision with root package name */
    private final C7002A f29408b = AbstractC7025p.b();

    public C3930j1(J0.n nVar, AbstractC7022m abstractC7022m) {
        this.f29407a = nVar.w();
        List listT = nVar.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            J0.n nVar2 = (J0.n) listT.get(i10);
            if (abstractC7022m.a(nVar2.o())) {
                this.f29408b.f(nVar2.o());
            }
        }
    }

    public final C7002A a() {
        return this.f29408b;
    }

    public final J0.j b() {
        return this.f29407a;
    }
}
