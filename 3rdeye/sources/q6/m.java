package Q6;

import Q6.l;
import Q6.q;
import b9.C1992A;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements p9.l<String, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l.b f11359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f11360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l.b bVar, n nVar) {
        super(1);
        this.f11359g = bVar;
        this.f11360h = nVar;
    }

    @Override // p9.l
    public final C1992A invoke(String str) {
        String newValue = str;
        kotlin.jvm.internal.l.f(newValue, "newValue");
        q.b bVar = this.f11359g.f11358m;
        n nVar = this.f11360h;
        bVar.invoke(nVar.f11361a, nVar.f11362b, newValue);
        return C1992A.f18074a;
    }
}
