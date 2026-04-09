package j8;

import cc.s;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.internal.measurement.e0;
import h7.w1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import oh.p;
import zc.c1;
import zc.j0;
import zc.l;
import zc.p3;
import zc.w0;

/* loaded from: classes.dex */
public final class d extends w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13419h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13420i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w0 w0Var) {
        super(20);
        this.f13420i = w0Var;
    }

    @Override // h7.w1
    public Object c(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        switch (this.f13419h) {
            case 1:
                String str = (String) obj;
                s.e(str);
                w0 w0Var = (w0) this.f13420i;
                w0Var.t1();
                s.e(str);
                l lVar = w0Var.f26981g.f27099g;
                p3.Q(lVar);
                qm.c cVarY2 = lVar.y2(str);
                if (cVarY2 == null) {
                    return null;
                }
                j0 j0Var = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.K.c(str, "Populate EES config from database on cache miss. appId");
                w0Var.A1(str, w0Var.B1(str, (byte[]) cVarY2.f20918d));
                d dVar = w0Var.G;
                synchronized (((cg.e) dVar.f10234g)) {
                    Set setEntrySet = ((LinkedHashMap) ((p) dVar.f10233f).f19481d).entrySet();
                    br.l.d(setEntrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((LinkedHashMap) ((p) dVar.f10233f).f19481d).entrySet();
                    br.l.d(setEntrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (e0) linkedHashMap.get(str);
            default:
                return super.c(obj);
        }
    }

    @Override // h7.w1
    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.f13419h) {
            case 0:
                c cVar = (c) obj2;
                ((ag.b) ((i4.b) this.f13420i).f11196a).s((MemoryCache$Key) obj, cVar.f13416a, cVar.f13417b, cVar.f13418c);
                break;
            default:
                super.d(obj, obj2, obj3);
                break;
        }
    }

    @Override // h7.w1
    public int o(Object obj, Object obj2) {
        switch (this.f13419h) {
            case 0:
                return ((c) obj2).f13418c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, i4.b bVar) {
        super(i10);
        this.f13420i = bVar;
    }
}
