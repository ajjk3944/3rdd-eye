package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes4.dex */
public final class i2 extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public final p f22504e;

    public i2(p pVar) {
        this.f22504e = pVar;
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.e0
    public void y(Throwable th) {
        Object objI0 = z().i0();
        if (objI0 instanceof c0) {
            p pVar = this.f22504e;
            Result.Companion companion = Result.INSTANCE;
            pVar.resumeWith(Result.b(kotlin.c.a(((c0) objI0).f22236a)));
        } else {
            p pVar2 = this.f22504e;
            Result.Companion companion2 = Result.INSTANCE;
            pVar2.resumeWith(Result.b(z1.h(objI0)));
        }
    }
}
