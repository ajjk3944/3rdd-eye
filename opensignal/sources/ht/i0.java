package ht;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends ot.d {

    /* renamed from: d, reason: collision with root package name */
    public static final bm.e f10910d = new bm.e(27);

    /* renamed from: g, reason: collision with root package name */
    public static final i0 f10911g = new i0(mq.w.f16945a);

    public i0(List list) {
        this.f19796a = ot.k.f19810a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            iVar.getClass();
            int iZ = f10910d.z(br.x.f2918a.b(i.class));
            int iA = this.f19796a.a();
            if (iA != 0) {
                if (iA == 1) {
                    ot.a aVar = this.f19796a;
                    br.l.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    ot.p pVar = (ot.p) aVar;
                    int i10 = pVar.f19821d;
                    if (i10 == iZ) {
                        this.f19796a = new ot.p(iZ, iVar);
                    } else {
                        ot.c cVar = new ot.c();
                        cVar.f19794a = new Object[20];
                        cVar.f19795d = 0;
                        this.f19796a = cVar;
                        cVar.b(i10, pVar.f19820a);
                    }
                }
                this.f19796a.b(iZ, iVar);
            } else {
                this.f19796a = new ot.p(iZ, iVar);
            }
        }
    }
}
