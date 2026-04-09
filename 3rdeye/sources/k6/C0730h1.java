package K6;

import b9.C1992A;
import w7.C5742b;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730h1 extends kotlin.jvm.internal.m implements p9.l<Long, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.y f3474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5742b.d f3475h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730h1(O6.y yVar, C5742b.d dVar) {
        super(1);
        this.f3474g = yVar;
        this.f3475h = dVar;
    }

    @Override // p9.l
    public final C1992A invoke(Long l5) {
        this.f3475h.f47539a = l5.longValue();
        O6.y yVar = this.f3474g;
        yVar.requestLayout();
        yVar.invalidate();
        return C1992A.f18074a;
    }
}
