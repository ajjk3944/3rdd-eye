package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1154e9;
import b9.C1992A;
import i6.C4458a;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f3610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f3611h;
    public final /* synthetic */ C5865d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(v1 v1Var, C0672i c0672i, C5865d c5865d) {
        super(0);
        this.f3610g = v1Var;
        this.f3611h = c0672i;
        this.i = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        v1 v1Var = this.f3610g;
        C0675l c0675l = this.f3611h.f2146a;
        C4458a dataTag = c0675l.getDataTag();
        Q6.c cVarA = v1Var.f3669n.a(c0675l.getDivData(), dataTag);
        String path = this.i.b();
        z7.d dVar = z7.e.f48479a;
        kotlin.jvm.internal.l.f(path, "path");
        cVarA.a(new z7.d(z7.f.MISSING_VALUE, C1154e9.i("Value for key 'id' at path '", path, "' is missing"), null, null, null, 28));
        return C1992A.f18074a;
    }
}
