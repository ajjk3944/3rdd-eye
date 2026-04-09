package t7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.e f22518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f22519b;

    public s(t tVar, u.e eVar) {
        this.f22519b = tVar;
        this.f22518a = eVar;
    }

    @Override // t7.r, t7.o
    public final void c(q qVar) {
        ((ArrayList) this.f22518a.get(this.f22519b.f22521d)).remove(qVar);
        qVar.A(this);
    }
}
