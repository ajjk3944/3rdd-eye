package is;

import androidx.lifecycle.p0;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mq.a0;
import mq.b0;
import mq.z;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12971a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public lq.l f12972b = new lq.l("V", null);

    public m(t tVar, String str) {
    }

    public final void a(String str, d... dVarArr) {
        p pVar;
        br.l.e(str, "type");
        if (dVarArr.length == 0) {
            pVar = null;
        } else {
            iu.g gVar = new iu.g(2, new p0(11, dVarArr));
            int iP = b0.P(mq.p.a0(gVar, 10));
            if (iP < 16) {
                iP = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
            Iterator it = gVar.iterator();
            while (true) {
                a0 a0Var = (a0) it;
                if (!a0Var.f16922d.hasNext()) {
                    break;
                }
                z zVar = (z) a0Var.next();
                linkedHashMap.put(Integer.valueOf(zVar.f16948a), (d) zVar.f16949b);
            }
            pVar = new p(linkedHashMap);
        }
        this.f12971a.add(new lq.l(str, pVar));
    }

    public final void b(String str, d... dVarArr) {
        br.l.e(str, "type");
        iu.g gVar = new iu.g(2, new p0(11, dVarArr));
        int iP = b0.P(mq.p.a0(gVar, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = gVar.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f16922d.hasNext()) {
                this.f12972b = new lq.l(str, new p(linkedHashMap));
                return;
            } else {
                z zVar = (z) a0Var.next();
                linkedHashMap.put(Integer.valueOf(zVar.f16948a), (d) zVar.f16949b);
            }
        }
    }

    public final void c(ys.c cVar) {
        br.l.e(cVar, "type");
        String desc = cVar.getDesc();
        br.l.d(desc, "type.desc");
        this.f12972b = new lq.l(desc, null);
    }
}
