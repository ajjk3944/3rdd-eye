package F7;

import H7.b;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements H7.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1679a;

    public /* synthetic */ f(g gVar) {
        this.f1679a = gVar;
    }

    @Override // H7.f
    public final void a(b.a aVar) {
        g this$0 = this.f1679a;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        new H7.k(new F6.c(aVar, 1)).a(a.ABORT_TRANSACTION, (H7.j[]) Arrays.copyOf(new H7.j[]{new H7.m()}, 1));
        g.c(aVar);
    }
}
