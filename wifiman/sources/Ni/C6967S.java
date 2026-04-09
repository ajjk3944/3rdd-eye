package ni;

import Bh.InterfaceC2503m;
import Bh.g0;
import Bh.j0;
import Dh.AbstractC2596b;
import Uh.s;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import li.AbstractC6609L;
import li.C6612O;
import li.C6620X;
import li.C6638p;

/* renamed from: ni.S, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6967S extends AbstractC2596b {

    /* renamed from: k, reason: collision with root package name */
    private final C6638p f54732k;

    /* renamed from: l, reason: collision with root package name */
    private final Uh.s f54733l;

    /* renamed from: m, reason: collision with root package name */
    private final C6969a f54734m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6967S(C6638p c10, Uh.s proto, int i10) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(proto, "proto");
        oi.n nVarH = c10.h();
        InterfaceC2503m interfaceC2503mE = c10.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        Zh.f fVarB = AbstractC6609L.b(c10.g(), proto.X0());
        C6612O c6612o = C6612O.f52662a;
        s.c cVarD1 = proto.d1();
        AbstractC6492s.h(cVarD1, "getVariance(...)");
        super(nVarH, interfaceC2503mE, hVarB, fVarB, c6612o.d(cVarD1), proto.Y0(), i10, g0.f1784a, j0.a.f1787a);
        this.f54732k = c10;
        this.f54733l = proto;
        this.f54734m = new C6969a(c10.h(), new C6966Q(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(C6967S c6967s) {
        return AbstractC3689v.i1(c6967s.f54732k.c().d().i(c6967s.f54733l, c6967s.f54732k.g()));
    }

    @Override // Dh.AbstractC2602h
    protected List L0() {
        List listS = Wh.f.s(this.f54733l, this.f54732k.j());
        if (listS.isEmpty()) {
            return AbstractC3689v.e(AbstractC5833e.m(this).y());
        }
        List list = listS;
        C6620X c6620xI = this.f54732k.i();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c6620xI.u((Uh.q) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C6969a getAnnotations() {
        return this.f54734m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.AbstractC2602h
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(pi.S type) {
        AbstractC6492s.i(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
