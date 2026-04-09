package xj;

import ak.i1;
import ak.j0;
import ak.k0;
import ak.l0;
import ak.o0;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mq.o;
import mq.p;
import mq.w;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25393a;

    public /* synthetic */ j(int i10) {
        this.f25393a = i10;
    }

    @Override // xj.h
    public final Object a(Object obj) {
        double d6;
        Object next;
        switch (this.f25393a) {
            case 0:
                rj.d dVar = (rj.d) obj;
                br.l.e(dVar, "input");
                String str = dVar.f21558b;
                long j = dVar.f21559c;
                int i10 = dVar.f21560d;
                double d10 = dVar.f21561e;
                int i11 = dVar.f21562f;
                double d11 = dVar.f21563g;
                int i12 = dVar.f21564h;
                double d12 = dVar.f21565i;
                int i13 = dVar.j;
                double d13 = dVar.k;
                double d14 = dVar.f21566l;
                double d15 = dVar.f21567m;
                int i14 = dVar.f21568n;
                int i15 = dVar.f21569o;
                double d16 = dVar.f21570p;
                double d17 = dVar.f21571q;
                k0 k0Var = l0.Companion;
                int i16 = dVar.f21572r;
                k0Var.getClass();
                Iterator<E> it = l0.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        d6 = d17;
                        if (((l0) next).getValue() != i16) {
                            d17 = d6;
                        }
                    } else {
                        d6 = d17;
                        next = null;
                    }
                }
                l0 l0Var = (l0) next;
                if (l0Var == null) {
                    l0Var = l0.SERVER_RESPONSE;
                }
                return new j0(str, j, i10, d10, i11, d11, i12, d12, i13, d13, d14, d15, i14, i15, d16, d6, l0Var, dVar.f21573s, dVar.f21574t, dVar.f21575u, dVar.f21576v, dVar.f21577w);
            case 1:
                o0 o0Var = (o0) obj;
                br.l.e(o0Var, "input");
                gk.e eVar = gk.f.Companion;
                String str2 = o0Var.f629f;
                eVar.getClass();
                return new gk.c(gk.e.a(str2), o0Var.f624a, o0Var.f625b, o0Var.f626c, 0L, 0L, o0Var.f630g, 0, o0Var.f627d, o0Var.f628e, 1762);
            case 2:
                return b((List) obj);
            default:
                List<vj.c> list = (List) obj;
                br.l.e(list, "input");
                HashMap map = new HashMap();
                for (vj.c cVar : list) {
                    String strA = cVar.a();
                    if (strA.length() > 0) {
                        ArrayList arrayListE = (ArrayList) map.get(strA);
                        if (arrayListE != null) {
                            arrayListE.add(cVar);
                        } else {
                            arrayListE = e5.e(cVar);
                        }
                        map.put(strA, arrayListE);
                    } else {
                        n.b("UploadJobDataMapper", "No valid endpoint for " + cVar.e());
                    }
                }
                Set setKeySet = map.keySet();
                br.l.d(setKeySet, "<get-keys>(...)");
                Set<String> set = setKeySet;
                ArrayList arrayList = new ArrayList(p.a0(set, 10));
                for (String str3 : set) {
                    List list2 = (List) map.get(str3);
                    List listM0 = list2 == null ? w.f16945a : o.M0(list2, new sm.i(8));
                    br.l.b(str3);
                    arrayList.add(new i1(str3, listM0));
                }
                return arrayList;
        }
    }

    public String b(List list) {
        br.l.e(list, "input");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList.toString();
    }
}
