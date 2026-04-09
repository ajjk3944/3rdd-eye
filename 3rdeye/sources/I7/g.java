package i7;

import H6.C0672i;
import K6.C0713c;
import N7.Ba;
import N7.Z;
import b9.q;
import c9.C2092m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes.dex */
public final class g extends m implements InterfaceC5480a<List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z.o f38474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f38475h;
    public final /* synthetic */ C5865d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z.o oVar, C0672i c0672i, C5865d c5865d) {
        super(0);
        this.f38474g = oVar;
        this.f38475h = c0672i;
        this.i = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>> invoke() {
        List<Ba.a> list = this.f38474g.f7827c.f4949q;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Z z10 = ((Ba.a) obj).f4959a;
            arrayList.add(new q(z10, this.f38475h, C0713c.U(z10.d(), i, this.i)));
            i = i10;
        }
        return arrayList;
    }
}
