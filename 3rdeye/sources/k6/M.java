package K6;

import C9.k;
import N7.C1431y3;
import N7.C3;
import N7.T5;
import X0.o;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3278h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C1431y3 c1431y3, A7.d dVar, O6.E e4) {
        super(1);
        this.f3277g = 1;
        this.i = c1431y3;
        this.f3278h = dVar;
        this.f3279j = e4;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object it) {
        C1992A c1992a;
        switch (this.f3277g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                C0713c.p((View) this.i, this.f3279j.d(), (A7.d) this.f3278h);
                break;
            case 1:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1431y3 c1431y3 = (C1431y3) this.i;
                A7.b<C3> bVar = c1431y3.f9865o;
                A7.d dVar = (A7.d) this.f3278h;
                ((O6.E) this.f3279j).setGravity(C0713c.G(bVar.a(dVar), c1431y3.f9866p.a(dVar)));
                break;
            case 2:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((O6.p) this.i).setTextColor(((T5) this.f3279j).f6283S.a((A7.d) this.f3278h).intValue());
                break;
            default:
                Throwable th = (Throwable) it;
                ((o.c) this.i).invoke(th);
                X0.n nVar = (X0.n) this.f3279j;
                ((C9.b) nVar.f13450c).k(false, th);
                do {
                    Object objD = ((C9.b) nVar.f13450c).d();
                    c1992a = null;
                    if (objD instanceof k.b) {
                        objD = null;
                    }
                    if (objD != null) {
                        ((o.d) this.f3278h).invoke(objD, th);
                        c1992a = C1992A.f18074a;
                    }
                } while (c1992a != null);
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f3277g = i;
        this.i = obj;
        this.f3279j = obj2;
        this.f3278h = obj3;
    }
}
