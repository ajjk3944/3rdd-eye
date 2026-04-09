package b7;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase;
import c0.b1;
import i2.g0;
import i2.z1;
import j2.a1;
import j2.h0;
import java.util.List;
import java.util.Map;
import s2.f0;
import u0.i1;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2063a;

    public /* synthetic */ w(int i4) {
        this.f2063a = i4;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        s2.a0 a0Var = null;
        a0Var = null;
        int i4 = 0;
        switch (this.f2063a) {
            case 0:
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                d6.c cVarS = aVar.S("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarS.q(1, null);
                    throw null;
                } catch (Throwable th2) {
                    cVarS.close();
                    throw th2;
                }
            case 1:
                ((g0) obj).b();
                return yj.u.f37649a;
            case 2:
                return yj.u.f37649a;
            case 3:
                int i10 = c0.l.f2459a;
                o2 o2Var = h0.f27170b;
                c1.l lVar = (c1.l) ((i1) obj);
                lVar.getClass();
                Context context = (Context) u0.q.s(lVar, o2Var);
                d3.c cVar = (d3.c) u0.q.s(lVar, a1.f27074h);
                c0.a1 a1Var = (c0.a1) u0.q.s(lVar, b1.f2373a);
                if (a1Var == null) {
                    return null;
                }
                return new c0.k(context, cVar, a1Var.f2364a, a1Var.f2365b);
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                nk.k.e(workDatabase, "db");
                a0.x xVar = r.A;
                y yVarW = workDatabase.w();
                yVarW.getClass();
                Object objApply = xVar.apply((List) com.bumptech.glide.f.r(yVarW.f2066a, true, true, new u(i4, yVarW)));
                nk.k.d(objApply, "apply(...)");
                return (List) objApply;
            case 5:
                Resources resources = (Resources) obj;
                nk.k.e(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 6:
                o2 o2Var2 = h0.f27170b;
                c1.l lVar2 = (c1.l) ((i1) obj);
                lVar2.getClass();
                if (((Context) u0.q.s(lVar2, o2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return d0.d.f21692b;
                }
                d0.c.f21679a.getClass();
                return d0.b.f21672c;
            case 7:
                ((Long) obj).getClass();
                return yj.u.f37649a;
            case 8:
                return Boolean.valueOf(!false);
            case 9:
                return new f1.e((Map) obj);
            case 10:
                synchronized (g1.m.f24260c) {
                    ?? r02 = g1.m.f24265i;
                    int size = r02.size();
                    while (i4 < size) {
                        ((mk.c) r02.get(i4)).invoke(obj);
                        i4++;
                    }
                }
                return yj.u.f37649a;
            case 11:
                w wVar = g1.m.f24258a;
                return yj.u.f37649a;
            case 12:
                List list = (List) obj;
                return new i0.u(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 13:
                return yj.u.f37649a;
            case 14:
                p4.b bVar = (p4.b) obj;
                nk.k.e(bVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", bVar);
                return sf.h.f33582b;
            case 15:
                p2.v.a((p2.x) obj, 0);
                return yj.u.f37649a;
            case 16:
                tk.c[] cVarArr = p2.v.f31140a;
                p2.w wVar2 = p2.t.f31123l;
                tk.c cVar2 = p2.v.f31140a[5];
                ((p2.x) obj).a(wVar2, Boolean.TRUE);
                return yj.u.f37649a;
            case 17:
                r6.c cVar3 = (r6.c) obj;
                nk.k.e(cVar3, "it");
                return cVar3;
            case 18:
                Context context2 = pk.a.f32022a;
                nk.k.b(context2);
                Toast.makeText(context2, (String) obj, 0).show();
                return yj.u.f37649a;
            case 19:
                return yj.u.f37649a;
            case 20:
                nk.k.c((z1) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case 21:
                nk.k.c((z1) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case 22:
                s2.m mVar = (s2.m) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(mVar.f33403b);
                sb2.append(", ");
                return d.h.u(sb2, mVar.f33404c, ')');
            case 23:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                mk.c cVar4 = (mk.c) s2.y.f33436h.f37517c;
                Boolean bool = Boolean.FALSE;
                s2.a0 a0Var2 = (nk.k.a(obj2, bool) || obj2 == null) ? null : (s2.a0) cVar4.invoke(obj2);
                Object obj3 = list2.get(1);
                s2.a0 a0Var3 = (nk.k.a(obj3, bool) || obj3 == null) ? null : (s2.a0) cVar4.invoke(obj3);
                Object obj4 = list2.get(2);
                s2.a0 a0Var4 = (nk.k.a(obj4, bool) || obj4 == null) ? null : (s2.a0) cVar4.invoke(obj4);
                Object obj5 = list2.get(3);
                if (!nk.k.a(obj5, bool) && obj5 != null) {
                    a0Var = (s2.a0) cVar4.invoke(obj5);
                }
                return new f0(a0Var2, a0Var3, a0Var4, a0Var);
            case 24:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                List list4 = (nk.k.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((mk.c) s2.y.f33430a.f37517c).invoke(obj6);
                Object obj7 = list3.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                nk.k.b(str);
                return new s2.e(list4, str);
            case 25:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.l(((Integer) obj).intValue());
            case 26:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list5 = (List) obj;
                return new c3.p(((Number) list5.get(0)).floatValue(), ((Number) list5.get(1)).floatValue());
            case 27:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj8 = list6.get(0);
                d3.o[] oVarArr = d3.n.f21970b;
                mk.c cVar5 = s2.y.f33449v.f33429b;
                Boolean bool2 = Boolean.FALSE;
                nk.k.a(obj8, bool2);
                d3.n nVar = obj8 != null ? (d3.n) cVar5.invoke(obj8) : null;
                nk.k.b(nVar);
                long j = nVar.f21972a;
                Object obj9 = list6.get(1);
                nk.k.a(obj9, bool2);
                d3.n nVar2 = obj9 != null ? (d3.n) cVar5.invoke(obj9) : null;
                nk.k.b(nVar2);
                return new c3.q(j, nVar2.f21972a);
            case 28:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new v2.k(((Integer) obj).intValue());
            default:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new c3.a(((Float) obj).floatValue());
        }
    }

    public /* synthetic */ w(int i4, i0.p pVar) {
        this.f2063a = 13;
    }
}
