package gu;

import ar.k;
import br.l;
import iu.h;
import java.util.List;
import java.util.Map;
import ku.c1;
import lq.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9662a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f9663d;

    public /* synthetic */ c(d dVar, int i10) {
        this.f9662a = i10;
        this.f9663d = dVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        iu.a aVar = (iu.a) obj;
        switch (this.f9662a) {
            case 0:
                l.e(aVar, "$this$buildSerialDescriptor");
                iu.a.a(aVar, "type", c1.f14535b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                d dVar = this.f9663d;
                sb2.append(dVar.f9664a.p());
                sb2.append('>');
                c cVar = new c(dVar, 1);
                iu.a.a(aVar, "value", dr.a.b(sb2.toString(), h.f13009d, new iu.e[0], cVar));
                List list = dVar.f9665b;
                l.e(list, "<set-?>");
                aVar.f12983b = list;
                break;
            default:
                l.e(aVar, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f9663d.f9668e.entrySet()) {
                    iu.a.a(aVar, (String) entry.getKey(), ((a) entry.getValue()).getDescriptor());
                }
                break;
        }
        return b0.f15562a;
    }
}
