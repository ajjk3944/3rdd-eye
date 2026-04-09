package d8;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.o;
import ar.n;
import br.l;
import com.staircase3.opensignal.activities.MainActivity;
import com.survicate.surveys.entities.models.Respondent;
import com.survicate.surveys.infrastructure.network.VisitorData;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import l8.s;
import l8.t;
import lf.t1;
import lq.b0;
import mq.p;
import rq.j;

/* loaded from: classes.dex */
public final class e extends j implements n {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7164x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7165y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, pq.c cVar, int i10) {
        super(2, cVar);
        this.f7164x = i10;
        this.f7165y = obj;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f7164x) {
            case 0:
                return new e((f) this.f7165y, cVar, 0);
            case 1:
                return new e((t) this.f7165y, cVar, 1);
            case 2:
                return new e((on.e) this.f7165y, cVar, 2);
            case 3:
                return new e((qm.g) this.f7165y, cVar, 3);
            default:
                return new e((wg.h) this.f7165y, cVar, 4);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        String string;
        Long lValueOf = null;
        switch (this.f7164x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                f fVar = (f) this.f7165y;
                synchronized (fVar) {
                    if (!fVar.H || fVar.I) {
                        return b0.f15562a;
                    }
                    try {
                        fVar.V();
                    } catch (IOException unused) {
                        fVar.J = true;
                    }
                    try {
                        if (fVar.E >= 2000) {
                            fVar.Z();
                        }
                    } catch (IOException unused2) {
                        fVar.K = true;
                        fVar.F = a.a.d(new cv.e());
                    }
                    return b0.f15562a;
                }
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                t tVar = (t) this.f7165y;
                s sVar = tVar.f14980r;
                if (sVar != null) {
                    o oVar = sVar.f14975r;
                    sVar.f14976x.h(null);
                    n8.a aVar3 = sVar.f14974g;
                    if (aVar3 != null) {
                        oVar.m1(aVar3);
                    }
                    oVar.m1(sVar);
                }
                tVar.f14980r = null;
                return b0.f15562a;
            case 2:
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                on.e eVar = (on.e) this.f7165y;
                qm.c cVar = eVar.f19603a.f19637a;
                cVar.getClass();
                no.b bVar = (no.b) cVar.f20920r;
                SharedPreferences sharedPreferences = (SharedPreferences) cVar.f20918d;
                try {
                    string = sharedPreferences.getString("visitorUuid", null);
                } catch (Exception unused3) {
                    ((sm.f) bVar).getClass();
                    string = null;
                }
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    l.d(string, "toString(...)");
                    sharedPreferences.edit().putString("visitorUuid", string).apply();
                }
                try {
                    long j = sharedPreferences.getLong("respondentVerificationTimeKey", -1L);
                    if (j != -1) {
                        lValueOf = Long.valueOf(j);
                    }
                } catch (Exception unused4) {
                    ((sm.f) bVar).getClass();
                }
                String uuid = new Respondent(string, lValueOf).getUuid();
                List<hq.c> listA = eVar.f19603a.a();
                l.e(listA, "userTraits");
                int iP = mq.b0.P(p.a0(listA, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (hq.c cVar2 : listA) {
                    linkedHashMap.put(cVar2.key, cVar2.value);
                }
                return new VisitorData(uuid, linkedHashMap);
            case 3:
                qq.a aVar5 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                Context context = ((qm.g) this.f7165y).f20925a;
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.setAction("shortcuts.action.show_coverage_map");
                intent.setFlags(536870912);
                i3.d dVar = new i3.d();
                dVar.f11185a = context;
                dVar.f11186b = "id_coverage";
                dVar.f11188d = context.getString(qk.l.coverage);
                dVar.f11189e = context.getResources().getString(qk.l.shortcut_coverage);
                int i10 = qk.f.ic_map_shortcut;
                PorterDuff.Mode mode = IconCompat.k;
                dVar.f11190f = IconCompat.b(context.getResources(), context.getPackageName(), i10);
                dVar.f11187c = new Intent[]{intent};
                if (TextUtils.isEmpty(dVar.f11188d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = dVar.f11187c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                i3.g.B(context, dVar);
                Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
                intent2.setAction("shortcuts.action.run_video_test");
                intent2.setFlags(536870912);
                i3.d dVar2 = new i3.d();
                dVar2.f11185a = context;
                dVar2.f11186b = "id_video";
                dVar2.f11188d = context.getString(qk.l.video_test_tool_bar);
                dVar2.f11189e = context.getResources().getString(qk.l.shortcut_videotest);
                dVar2.f11190f = IconCompat.b(context.getResources(), context.getPackageName(), qk.f.ic_video_shortcut);
                dVar2.f11187c = new Intent[]{intent2};
                if (TextUtils.isEmpty(dVar2.f11188d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr2 = dVar2.f11187c;
                if (intentArr2 == null || intentArr2.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                i3.g.B(context, dVar2);
                Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
                intent3.setAction("shortcuts.action.run_speed_test");
                intent3.setFlags(536870912);
                i3.d dVar3 = new i3.d();
                dVar3.f11185a = context;
                dVar3.f11186b = "id_speedtest";
                dVar3.f11188d = context.getString(qk.l.speed);
                dVar3.f11189e = context.getResources().getString(qk.l.shortcut_speedtest);
                dVar3.f11190f = IconCompat.b(context.getResources(), context.getPackageName(), qk.f.ic_speedtest_shortcut);
                dVar3.f11187c = new Intent[]{intent3};
                if (TextUtils.isEmpty(dVar3.f11188d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr3 = dVar3.f11187c;
                if (intentArr3 == null || intentArr3.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                i3.g.B(context, dVar3);
                return b0.f15562a;
            default:
                qq.a aVar6 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return (wg.h) this.f7165y;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f7164x) {
            case 0:
                return ((e) o((wt.t) obj, (pq.c) obj2)).q(b0.f15562a);
            case 1:
                e eVar = (e) o((wt.t) obj, (pq.c) obj2);
                b0 b0Var = b0.f15562a;
                eVar.q(b0Var);
                return b0Var;
            case 2:
                return ((e) o((wt.t) obj, (pq.c) obj2)).q(b0.f15562a);
            case 3:
                e eVar2 = (e) o((wt.t) obj, (pq.c) obj2);
                b0 b0Var2 = b0.f15562a;
                eVar2.q(b0Var2);
                return b0Var2;
            default:
                return ((e) o((wg.h) obj, (pq.c) obj2)).q(b0.f15562a);
        }
    }
}
