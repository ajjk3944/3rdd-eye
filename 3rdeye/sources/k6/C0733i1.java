package K6;

import b9.C1992A;
import w7.C5742b;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733i1 extends kotlin.jvm.internal.m implements p9.l<Long, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.y f3485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5742b.d f3486h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0733i1(O6.y yVar, C5742b.d dVar) {
        super(1);
        this.f3485g = yVar;
        this.f3486h = dVar;
    }

    @Override // p9.l
    public final C1992A invoke(Long l5) {
        this.f3486h.f47540b = l5.longValue();
        O6.y yVar = this.f3485g;
        yVar.requestLayout();
        yVar.invalidate();
        return C1992A.f18074a;
    }
}
