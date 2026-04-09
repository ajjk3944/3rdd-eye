package ah;

import android.content.Context;
import bh.i;
import bh.j;
import ch.l;
import ch.n;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {
    public static final void a(b bVar, JSONObject jSONObject, long j, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assistant_results");
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null) {
            hr.d dVarT = vc.e.T(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = dVarT.iterator();
            while (true) {
                hr.c cVar = (hr.c) it;
                if (!cVar.f10868g) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(cVar.nextInt());
                bh.a aVarP = jSONObjectOptJSONObject != null ? i4.p(jSONObjectOptJSONObject) : null;
                if (aVarP != null) {
                    arrayList2.add(aVarP);
                }
            }
            arrayList = arrayList2;
        }
        l.f3962t5.c0().G(new d(bVar, 0, (arrayList == null || arrayList.isEmpty()) ? new j(j, str) : new i(j, str, arrayList)));
    }

    public static ai.c b() {
        l lVar = l.f3962t5;
        if (lVar.R4 == null) {
            lVar.R4 = new ai.c(lVar.F(), lVar.I());
        }
        ai.c cVar = lVar.R4;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_assistantBroadcastReceiver");
        throw null;
    }

    public static final void c(Context context, b bVar) {
        br.l.e(bVar, "listener");
        l lVar = l.f3962t5;
        if (lVar.F().f3943c) {
            Context applicationContext = context.getApplicationContext();
            br.l.c(applicationContext, "null cannot be cast to non-null type android.content.Context");
            Context applicationContext2 = context.getApplicationContext();
            br.l.d(applicationContext2, "getApplicationContext(...)");
            if (lVar.f3775a == null) {
                lVar.f3775a = applicationContext2;
            }
            ai.c cVarB = b();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVarB.f383d;
            if (copyOnWriteArrayList.contains(bVar)) {
                n.g("AssistantBroadcastReceiver", "addListener() AssistantListener already added = " + bVar);
            } else {
                n.b("AssistantBroadcastReceiver", "addListener() adding " + bVar);
                copyOnWriteArrayList.add(bVar);
                cVarB.a(applicationContext);
            }
            b().a(applicationContext);
        }
    }

    public static final void d(Context context, b bVar) {
        br.l.e(bVar, "listener");
        l lVar = l.f3962t5;
        if (lVar.F().f3943c) {
            Context applicationContext = context.getApplicationContext();
            br.l.c(applicationContext, "null cannot be cast to non-null type android.content.Context");
            if (lVar.f3775a == null) {
                lVar.f3775a = applicationContext;
            }
            ai.c cVarB = b();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVarB.f383d;
            n.b("AssistantBroadcastReceiver", "removeListener() with " + bVar + " returned: " + copyOnWriteArrayList.remove(bVar));
            if (((CopyOnWriteArrayList) cVarB.f384e).isEmpty() && copyOnWriteArrayList.isEmpty()) {
                cVarB.c(applicationContext);
            }
            b().c(applicationContext);
        }
    }
}
