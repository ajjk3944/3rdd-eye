package K6;

import N7.E5;
import b9.C1992A;

/* compiled from: DivGifImageBinder.kt */
/* renamed from: K6.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746n0 extends kotlin.jvm.internal.m implements p9.l<E5, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.j f3555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746n0(O6.j jVar) {
        super(1);
        this.f3555g = jVar;
    }

    @Override // p9.l
    public final C1992A invoke(E5 e52) {
        E5 scale = e52;
        kotlin.jvm.internal.l.f(scale, "scale");
        this.f3555g.setImageScale(C0713c.c0(scale));
        return C1992A.f18074a;
    }
}
