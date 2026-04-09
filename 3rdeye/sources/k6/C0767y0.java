package K6;

import H6.C0672i;
import H6.C0675l;
import N7.U5;
import b9.C1992A;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/* compiled from: DivInputBinder.kt */
/* renamed from: K6.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767y0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<U5> f3715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K f3716h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0759u0 f3717j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0672i f3718k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767y0(List list, K k10, A7.d dVar, C0759u0 c0759u0, C0672i c0672i) {
        super(1);
        this.f3715g = list;
        this.f3716h = k10;
        this.i = dVar;
        this.f3717j = c0759u0;
        this.f3718k = c0672i;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        Object dVar;
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        List<U5> list = this.f3715g;
        ArrayList arrayList = new ArrayList();
        for (U5 u52 : list) {
            boolean z10 = u52 instanceof U5.b;
            A7.d dVar2 = this.i;
            if (z10) {
                try {
                    dVar = new D6.d(((U5.b) u52).f6389b.f8069a.a(dVar2));
                } catch (PatternSyntaxException e4) {
                    Q6.d dVar3 = this.f3717j.f3646h;
                    C0675l c0675l = this.f3718k.f2146a;
                    dVar3.a(c0675l.getDivData(), c0675l.getDataTag()).a(new IllegalArgumentException("Invalid regex pattern '" + e4.getPattern() + "'.", e4));
                    dVar = null;
                }
            } else {
                if (!(u52 instanceof U5.a)) {
                    throw new b9.j();
                }
                dVar = new D6.b(((U5.a) u52).f6388b.f7571a, dVar2);
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f3716h.invoke(new D6.c(arrayList));
        return C1992A.f18074a;
    }
}
