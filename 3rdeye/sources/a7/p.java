package a7;

import a7.g;
import java.util.ArrayList;

/* compiled from: LocalFunctionProvider.kt */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements p9.l<g, g.b> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ArrayList arrayList) {
        super(1);
        this.f14232g = arrayList;
    }

    @Override // p9.l
    public final g.b invoke(g gVar) {
        g findFunction = gVar;
        kotlin.jvm.internal.l.f(findFunction, "$this$findFunction");
        return findFunction.i(this.f14232g);
    }
}
