package K6;

import K6.C0759u0;
import N7.T5;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class C0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T5 f3191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3192h;
    public final /* synthetic */ O6.p i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0759u0 f3193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(T5 t52, A7.d dVar, O6.p pVar, C0759u0 c0759u0) {
        super(1);
        this.f3191g = t52;
        this.f3192h = dVar;
        this.i = pVar;
        this.f3193j = c0759u0;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        int i;
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        T5 t52 = this.f3191g;
        A7.b<T5.c> bVar = t52.f6267C;
        A7.d dVar = this.f3192h;
        T5.c cVarA = bVar.a(dVar);
        this.f3193j.getClass();
        switch (C0759u0.a.f3648b[cVarA.ordinal()]) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 131073;
                break;
            case 3:
                i = 33;
                break;
            case 4:
                i = 17;
                break;
            case 5:
                i = 12290;
                break;
            case 6:
                i = 3;
                break;
            case 7:
                i = 129;
                break;
            default:
                throw new b9.j();
        }
        int i10 = C0759u0.a.f3650d[t52.f6301f.a(dVar).ordinal()];
        int i11 = (i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 4096 : 8192 : 16384) | i;
        O6.p pVar = this.i;
        pVar.setInputType(i11);
        pVar.setHorizontallyScrolling(cVarA != T5.c.MULTI_LINE_TEXT);
        return C1992A.f18074a;
    }
}
