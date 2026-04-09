package K6;

import N7.C1431y3;
import N7.C3;
import N7.S2;
import N7.T5;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3236g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3237h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3238j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C1431y3 c1431y3, A7.d dVar, O6.r rVar) {
        super(1);
        this.f3236g = 1;
        this.i = c1431y3;
        this.f3237h = dVar;
        this.f3238j = rVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f3236g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                C0713c.j((View) this.i, this.f3238j.j(), this.f3237h);
                break;
            case 1:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1431y3 c1431y3 = (C1431y3) this.i;
                A7.b<C3> bVar = c1431y3.f9865o;
                A7.d dVar = this.f3237h;
                ((O6.r) this.f3238j).setGravity(C0713c.G(bVar.a(dVar), c1431y3.f9866p.a(dVar)));
                break;
            default:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((O6.p) this.i).setHintTextColor(((T5) this.f3238j).f6322y.a(this.f3237h).intValue());
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(View view, S2 s22, A7.d dVar, int i) {
        super(1);
        this.f3236g = i;
        this.i = view;
        this.f3238j = s22;
        this.f3237h = dVar;
    }
}
