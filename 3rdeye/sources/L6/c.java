package L6;

import H6.C0672i;
import K6.P;
import N7.C1333r3;
import O6.v;
import androidx.recyclerview.widget.p;
import b9.C1992A;
import i7.C4460a;
import java.util.ArrayList;

/* compiled from: DivGalleryBinder.kt */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f4081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1333r3 f4082h;
    public final /* synthetic */ C0672i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, C1333r3 c1333r3, C0672i c0672i) {
        super(1);
        this.f4081g = vVar;
        this.f4082h = c1333r3;
        this.i = c0672i;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) throws Exception {
        kotlin.jvm.internal.l.f(it, "it");
        a aVar = (a) this.f4081g.getAdapter();
        if (aVar != null) {
            ArrayList arrayListA = C4460a.a(this.f4082h, this.i.f2147b);
            P.a aVar2 = new P.a(aVar.f3269j, arrayListA);
            p.a(aVar2).a(new P.b(arrayListA));
            aVar.e();
        }
        return C1992A.f18074a;
    }
}
