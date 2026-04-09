package K6;

import H6.C0675l;
import N7.AbstractC1378u6;
import N7.C1434y6;
import N7.E6;
import N7.T5;
import b9.C1992A;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import y9.C5826h;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class O0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T5 f3295h;
    public final /* synthetic */ C0759u0 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3296j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3297k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O6.p f3298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0675l f3299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(ArrayList arrayList, T5 t52, C0759u0 c0759u0, A7.d dVar, Q6.c cVar, O6.p pVar, C0675l c0675l) {
        super(1);
        this.f3294g = arrayList;
        this.f3295h = t52;
        this.i = c0759u0;
        this.f3296j = dVar;
        this.f3297k = cVar;
        this.f3298l = pVar;
        this.f3299m = c0675l;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        G6.d dVar;
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        ArrayList<G6.d> arrayList = this.f3294g;
        arrayList.clear();
        List<AbstractC1378u6> list = this.f3295h.f6292a0;
        if (list != null) {
            for (AbstractC1378u6 abstractC1378u6 : list) {
                this.i.getClass();
                boolean z10 = abstractC1378u6 instanceof AbstractC1378u6.b;
                A7.d dVar2 = this.f3296j;
                if (z10) {
                    E6 e62 = ((AbstractC1378u6.b) abstractC1378u6).f9425b;
                    try {
                        dVar = new G6.d(new G6.c(new C5826h(e62.f5143c.a(dVar2)), e62.f5141a.a(dVar2).booleanValue()), e62.f5144d, e62.f5142b.a(dVar2));
                    } catch (PatternSyntaxException e4) {
                        this.f3297k.a(new IllegalArgumentException("Invalid regex pattern '" + e4.getPattern() + '\'', e4));
                        dVar = null;
                    }
                } else {
                    if (!(abstractC1378u6 instanceof AbstractC1378u6.a)) {
                        throw new b9.j();
                    }
                    C1434y6 c1434y6 = ((AbstractC1378u6.a) abstractC1378u6).f9424b;
                    dVar = new G6.d(new G6.b(c1434y6.f9932a.a(dVar2).booleanValue(), new P0(0, c1434y6, dVar2)), c1434y6.f9935d, c1434y6.f9934c.a(dVar2));
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            for (G6.d dVar3 : arrayList) {
                O6.p pVar = this.f3298l;
                C0759u0.m(this.i, dVar3, String.valueOf(pVar.getText()), pVar, this.f3299m, this.f3296j);
            }
        }
        return C1992A.f18074a;
    }
}
