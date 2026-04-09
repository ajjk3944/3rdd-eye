package I;

import java.util.List;
import o0.b;

/* compiled from: ListFuture.java */
/* loaded from: classes.dex */
public final class n implements b.c<List<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2368b;

    public n(q qVar) {
        this.f2368b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.b.c
    public final Object i(b.a<List<Object>> aVar) {
        q qVar = this.f2368b;
        A2.l.q("The result can only set once!", qVar.f2379g == null);
        qVar.f2379g = aVar;
        return "ListFuture[" + this + "]";
    }
}
