package il;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import ar.n;
import br.l;
import br.x;
import br.y;
import com.squareup.picasso.f0;
import com.squareup.picasso.q;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.o;
import com.staircase3.opensignal.utils.r;
import g4.j;
import kn.d;
import p.l2;
import pq.h;
import pq.i;
import qm.f;
import qm.g;
import tm.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11435a;

    public /* synthetic */ a(int i10) {
        this.f11435a = i10;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws ClassNotFoundException {
        pq.b bVar;
        switch (this.f11435a) {
            case 0:
                uv.b bVar2 = (uv.b) obj;
                l.e(bVar2, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar = x.f2918a;
                return new e((Context) bVar2.a(null, yVar.b(Context.class), null), (f) bVar2.a(null, yVar.b(f.class), null), (o) bVar2.a(null, yVar.b(o.class), null), (k) bVar2.a(null, yVar.b(k.class), null));
            case 1:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new ch.f();
            case 2:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new bl.a();
            case 3:
                uv.b bVar3 = (uv.b) obj;
                l.e(bVar3, "$this$single");
                l.e((rv.a) obj2, "it");
                return new el.b((Context) bVar3.a(null, x.f2918a.b(Context.class), null));
            case 4:
                uv.b bVar4 = (uv.b) obj;
                l.e(bVar4, "$this$single");
                l.e((rv.a) obj2, "it");
                return new el.c((SharedPreferences) bVar4.a(null, x.f2918a.b(SharedPreferences.class), new sv.a("PREFERENCE_MANAGER_DEFAULT")));
            case j.STRING_FIELD_NUMBER /* 5 */:
                uv.b bVar5 = (uv.b) obj;
                l.e(bVar5, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar2 = x.f2918a;
                return new com.staircase3.opensignal.utils.a((xm.a) bVar5.a(null, yVar2.b(xm.a.class), null), (jn.b) bVar5.a(null, yVar2.b(jn.b.class), null));
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new f();
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                uv.b bVar6 = (uv.b) obj;
                l.e(bVar6, "$this$single");
                l.e((rv.a) obj2, "it");
                return new r((f) bVar6.a(null, x.f2918a.b(f.class), null));
            case j.BYTES_FIELD_NUMBER /* 8 */:
                uv.b bVar7 = (uv.b) obj;
                l.e(bVar7, "$this$single");
                l.e((rv.a) obj2, "it");
                SharedPreferences sharedPreferences = kc.f.h(bVar7).getSharedPreferences("opensignal_preferences", 0);
                l.d(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
            case 9:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new gl.a();
            case 10:
                uv.b bVar8 = (uv.b) obj;
                l.e(bVar8, "$this$single");
                l.e((rv.a) obj2, "it");
                SharedPreferences sharedPreferences2 = kc.f.h(bVar8).getSharedPreferences("default", 0);
                l.d(sharedPreferences2, "getSharedPreferences(...)");
                return sharedPreferences2;
            case 11:
                uv.b bVar9 = (uv.b) obj;
                l.e(bVar9, "$this$single");
                l.e((rv.a) obj2, "it");
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(kc.f.h(bVar9));
                l.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                return defaultSharedPreferences;
            case 12:
                uv.b bVar10 = (uv.b) obj;
                l.e(bVar10, "$this$single");
                l.e((rv.a) obj2, "it");
                Object systemService = kc.f.i(bVar10).getSystemService("activity");
                l.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                return (ActivityManager) systemService;
            case 13:
                uv.b bVar11 = (uv.b) obj;
                l.e(bVar11, "$this$single");
                l.e((rv.a) obj2, "it");
                Object systemService2 = kc.f.i(bVar11).getSystemService("sensor");
                l.c(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
                return (SensorManager) systemService2;
            case 14:
                uv.b bVar12 = (uv.b) obj;
                l.e(bVar12, "$this$single");
                l.e((rv.a) obj2, "it");
                l2 l2Var = new l2((Context) bVar12.a(null, x.f2918a.b(Context.class), null));
                cj.a aVar = new cj.a(kc.f.h(bVar12));
                if (((q) aVar.f3975g) != null) {
                    throw new IllegalStateException("Downloader already set.");
                }
                aVar.f3975g = l2Var;
                f0 f0VarP = aVar.p();
                synchronized (f0.class) {
                    try {
                        if (f0.k != null) {
                            throw new IllegalStateException("Singleton instance already exists.");
                        }
                        f0.k = f0VarP;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return f0VarP;
            case 15:
                uv.b bVar13 = (uv.b) obj;
                l.e(bVar13, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar3 = x.f2918a;
                return new o((f) bVar13.a(null, yVar3.b(f.class), null), (r) bVar13.a(null, yVar3.b(r.class), null));
            case 16:
                uv.b bVar14 = (uv.b) obj;
                l.e(bVar14, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar4 = x.f2918a;
                return new qm.e((cm.a) bVar14.a(null, yVar4.b(cm.a.class), null), (f) bVar14.a(null, yVar4.b(f.class), null), (r) bVar14.a(null, yVar4.b(r.class), null), (o) bVar14.a(null, yVar4.b(o.class), null));
            case 17:
                uv.b bVar15 = (uv.b) obj;
                l.e(bVar15, "$this$single");
                l.e((rv.a) obj2, "it");
                return new g(kc.f.i(bVar15));
            case 18:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new k();
            case 19:
                uv.b bVar16 = (uv.b) obj;
                l.e(bVar16, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar5 = x.f2918a;
                return new fl.c((Context) bVar16.a(null, yVar5.b(Context.class), null), (f) bVar16.a(null, yVar5.b(f.class), null), (r) bVar16.a(null, yVar5.b(r.class), null), (o) bVar16.a(null, yVar5.b(o.class), null), (ch.f) bVar16.a(null, yVar5.b(ch.f.class), null), (el.b) bVar16.a(null, yVar5.b(el.b.class), null), (k) bVar16.a(null, yVar5.b(k.class), null));
            case 20:
                uv.b bVar17 = (uv.b) obj;
                l.e(bVar17, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar6 = x.f2918a;
                return new d((Context) bVar17.a(null, yVar6.b(Context.class), null), (jn.b) bVar17.a(null, yVar6.b(jn.b.class), null), (f) bVar17.a(null, yVar6.b(f.class), null), (r) bVar17.a(null, yVar6.b(r.class), null), (an.a) bVar17.a(null, yVar6.b(an.a.class), null), (fl.c) bVar17.a(null, yVar6.b(fl.c.class), null));
            case 21:
                uv.b bVar18 = (uv.b) obj;
                l.e(bVar18, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar7 = x.f2918a;
                return new ll.a((Context) bVar18.a(null, yVar7.b(Context.class), null), (r) bVar18.a(null, yVar7.b(r.class), null), (e) bVar18.a(null, yVar7.b(e.class), null));
            case 22:
                uv.b bVar19 = (uv.b) obj;
                l.e(bVar19, "$this$single");
                l.e((rv.a) obj2, "it");
                return new cm.a((SharedPreferences) bVar19.a(null, x.f2918a.b(SharedPreferences.class), new sv.a("DEFAULT_PREFERENCES")));
            case 23:
                l.e((uv.b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return new jn.c();
            case 24:
                uv.b bVar20 = (uv.b) obj;
                l.e(bVar20, "$this$single");
                l.e((rv.a) obj2, "it");
                return new jn.b(kc.f.h(bVar20), (cm.a) bVar20.a(null, x.f2918a.b(cm.a.class), null));
            case 25:
                uv.b bVar21 = (uv.b) obj;
                l.e(bVar21, "$this$single");
                l.e((rv.a) obj2, "it");
                return new nl.a((SharedPreferences) bVar21.a(null, x.f2918a.b(SharedPreferences.class), new sv.a("OPENSIGNAL_PREFERENCES")));
            case 26:
                String str = (String) obj;
                pq.f fVar = (pq.f) obj2;
                l.e(str, "acc");
                l.e(fVar, "element");
                if (str.length() == 0) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            case 27:
                h hVar = (h) obj;
                pq.f fVar2 = (pq.f) obj2;
                l.e(hVar, "acc");
                l.e(fVar2, "element");
                h hVarQ = hVar.q(fVar2.getKey());
                i iVar = i.f20621a;
                if (hVarQ == iVar) {
                    return fVar2;
                }
                pq.d dVar = pq.d.f20620a;
                pq.e eVar = (pq.e) hVarQ.Y(dVar);
                if (eVar == null) {
                    bVar = new pq.b(fVar2, hVarQ);
                } else {
                    h hVarQ2 = hVarQ.q(dVar);
                    if (hVarQ2 == iVar) {
                        return new pq.b(eVar, fVar2);
                    }
                    bVar = new pq.b(eVar, new pq.b(fVar2, hVarQ2));
                }
                return bVar;
            case 28:
                uv.b bVar22 = (uv.b) obj;
                l.e(bVar22, "$this$single");
                l.e((rv.a) obj2, "it");
                return new vl.a((SharedPreferences) bVar22.a(null, x.f2918a.b(SharedPreferences.class), new sv.a("DEFAULT_PREFERENCES")));
            default:
                uv.b bVar23 = (uv.b) obj;
                l.e(bVar23, "$this$single");
                l.e((rv.a) obj2, "it");
                y yVar8 = x.f2918a;
                return new hl.a((Context) bVar23.a(null, yVar8.b(Context.class), null), (f) bVar23.a(null, yVar8.b(f.class), null));
        }
    }
}
