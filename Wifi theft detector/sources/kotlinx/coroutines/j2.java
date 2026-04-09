package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes4.dex */
public final class j2 extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public final c9.c f22570e;

    public j2(c9.c cVar) {
        this.f22570e = cVar;
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.e0
    public void y(Throwable th) {
        c9.c cVar = this.f22570e;
        Result.Companion companion = Result.INSTANCE;
        cVar.resumeWith(Result.b(y8.s.f25199a));
    }
}
