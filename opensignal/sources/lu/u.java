package lu;

import com.google.android.gms.internal.measurement.i4;
import io.sentry.android.core.e0;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15959a;

    public /* synthetic */ u(int i10) {
        this.f15959a = i10;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ar.k
    public final Object a(Object obj) throws ba.l {
        boolean z10 = true;
        int i10 = 0;
        switch (this.f15959a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                br.l.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                mu.a0.a(str, sb2);
                sb2.append(':');
                sb2.append(lVar);
                String string = sb2.toString();
                br.l.d(string, "toString(...)");
                return string;
            case 1:
                st.j jVar = (st.j) obj;
                br.l.e(jVar, "it");
                return jVar.iterator();
            case 2:
                return obj;
            case 3:
                return Boolean.valueOf(obj == null);
            case 4:
                d4.b bVar = (d4.b) obj;
                br.l.e(bVar, "ex");
                e0.q("FirebaseSessions", "CorruptionException in session configs DataStore", bVar);
                return wg.i.f24510b;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new w.h(((Float) obj).floatValue());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Float.valueOf(((w.h) obj).f24126a);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new w.h(((t2.f) obj).f22387a);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new t2.f(((w.h) obj).f24126a);
            case 9:
                qv.a aVar = (qv.a) obj;
                br.l.e(aVar, "$this$module");
                il.a aVar2 = new il.a(28);
                mv.d dVarA = aVar.a();
                sv.a aVar3 = aVar.f21092a;
                mv.c cVar = mv.c.Single;
                br.y yVar = br.x.f2918a;
                mv.b bVar2 = new mv.b(aVar3, yVar.b(vl.a.class), null, aVar2, cVar, dVarA);
                HashSet hashSet = aVar.f21095d;
                i4.c(hashSet, bVar2);
                i4.c(hashSet, new mv.b(aVar.f21092a, yVar.b(hl.a.class), null, new il.a(29), cVar, aVar.a()));
                i4.c(hashSet, new mv.b(aVar.f21092a, yVar.b(ul.a.class), null, new wl.a(i10), cVar, aVar.a()));
                mv.b bVar3 = new mv.b(aVar.f21092a, yVar.b(zl.a.class), null, new wl.a(z10 ? 1 : 0), mv.c.Factory, aVar.a());
                i4.c(hashSet, bVar3);
                mv.e eVar = bVar3.f17066h;
                Boolean bool = Boolean.TRUE;
                eVar.getClass();
                eVar.f17069a.put("isViewModel", bool);
                return lq.b0.f15562a;
            case 10:
                pq.f fVar = (pq.f) obj;
                if (fVar instanceof wt.q) {
                    return (wt.q) fVar;
                }
                return null;
            case 11:
                synchronized (x0.l.f24717c) {
                    ?? r32 = x0.l.f24723i;
                    int size = r32.size();
                    while (i10 < size) {
                        ((ar.k) r32.get(i10)).a(obj);
                        i10++;
                    }
                }
                return lq.b0.f15562a;
            case 12:
                u uVar = x0.l.f24715a;
                return lq.b0.f15562a;
            case 13:
                return lq.b0.f15562a;
            default:
                qv.a aVar4 = (qv.a) obj;
                br.l.e(aVar4, "$this$module");
                wl.a aVar5 = new wl.a(5);
                mv.d dVarA2 = aVar4.a();
                sv.a aVar6 = aVar4.f21092a;
                mv.c cVar2 = mv.c.Single;
                br.y yVar2 = br.x.f2918a;
                mv.b bVar4 = new mv.b(aVar6, yVar2.b(wm.a.class), null, aVar5, cVar2, dVarA2);
                HashSet hashSet2 = aVar4.f21095d;
                i4.c(hashSet2, bVar4);
                i4.c(hashSet2, new mv.b(aVar4.f21092a, yVar2.b(bn.e.class), null, new wl.a(6), cVar2, aVar4.a()));
                i4.c(hashSet2, new mv.b(aVar4.f21092a, yVar2.b(an.a.class), null, new wl.a(7), cVar2, aVar4.a()));
                i4.c(hashSet2, new mv.b(aVar4.f21092a, yVar2.b(xm.a.class), null, new wl.a(8), mv.c.Factory, aVar4.a()));
                return lq.b0.f15562a;
        }
    }
}
