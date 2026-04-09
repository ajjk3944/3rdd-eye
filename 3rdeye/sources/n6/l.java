package N6;

import N7.EnumC1195h5;
import b9.C1992A;
import y7.v;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements p9.l<EnumC1195h5, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f4736g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar) {
        super(1);
        this.f4736g = vVar;
    }

    @Override // p9.l
    public final C1992A invoke(EnumC1195h5 enumC1195h5) {
        EnumC1195h5 divFontWeight = enumC1195h5;
        kotlin.jvm.internal.l.f(divFontWeight, "divFontWeight");
        this.f4736g.setActiveTypefaceType(j.a(divFontWeight));
        return C1992A.f18074a;
    }
}
