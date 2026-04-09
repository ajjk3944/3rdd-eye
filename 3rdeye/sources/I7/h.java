package i7;

import H6.C0672i;
import N7.X9;
import N7.Z;
import b9.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes.dex */
public final class h extends m implements InterfaceC5480a<List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z.m f38476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f38477h;
    public final /* synthetic */ C5865d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Z.m mVar, C0672i c0672i, C5865d c5865d) {
        super(0);
        this.f38476g = mVar;
        this.f38477h = c0672i;
        this.i = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>> invoke() {
        q qVar;
        Z.m mVar = this.f38476g;
        List<X9.a> list = mVar.f7825c.f7743y;
        ArrayList arrayList = new ArrayList();
        for (X9.a aVar : list) {
            Z z10 = aVar.f7747c;
            if (z10 == null) {
                qVar = null;
            } else {
                X9 x92 = mVar.f7825c;
                kotlin.jvm.internal.l.f(x92, "<this>");
                String str = x92.f7730l;
                if (str == null && (str = x92.f7735q) == null) {
                    str = "";
                }
                qVar = new q(z10, this.f38477h, this.i.a(str, aVar.f7748d));
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }
}
