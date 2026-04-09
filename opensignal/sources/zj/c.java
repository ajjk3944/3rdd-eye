package zj;

import ak.c0;
import ak.t0;
import ak.v0;
import ak.w0;
import br.l;
import ch.n;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem;
import dj.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rq.j;
import vc.e;
import zt.f;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27441a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27442d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27443g;

    public /* synthetic */ c(f fVar, j jVar, int i10) {
        this.f27441a = i10;
        this.f27442d = fVar;
        this.f27443g = jVar;
    }

    public boolean b(int i10, int i11) {
        MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem = (MicroSurveyPointTextAdapterItem) ((List) this.f27442d).get(i10);
        MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem2 = (MicroSurveyPointTextAdapterItem) ((List) this.f27443g).get(i11);
        return l.a(microSurveyPointTextAdapterItem.f6524d, microSurveyPointTextAdapterItem2.f6524d) && l.a(microSurveyPointTextAdapterItem.f6525g.f6527a, microSurveyPointTextAdapterItem2.f6525g.f6527a);
    }

    public boolean c(int i10, int i11) {
        return l.a(((MicroSurveyPointTextAdapterItem) ((List) this.f27442d).get(i10)).f6523a, ((MicroSurveyPointTextAdapterItem) ((List) this.f27443g).get(i11)).f6523a);
    }

    public w0 d(JSONObject jSONObject, w0 w0Var, c0 c0Var, hk.b bVar) throws JSONException {
        t0 t0Var;
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null) {
            return w0Var;
        }
        if (jSONObject.optJSONArray("tasks") == null) {
            String strValueOf = String.valueOf(jSONObject.toString(4));
            n.g("TaskSchedulerConfigMapper", "JSONObject is missing mandatory data: ");
            n.a();
            cj.a.F("JSONObject is missing mandatory data: ".concat(strValueOf));
        } else {
            n.b("TaskSchedulerConfigMapper", "Base scheduler config is valid");
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("tasks");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("task_config");
        z7.b bVar2 = (z7.b) this.f27443g;
        bVar2.getClass();
        if (jSONObjectOptJSONObject != null) {
            try {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("cross_task_delays");
            } catch (Exception e4) {
                n.e("TaskConfigMapper", e4);
                cj.a.G(e4);
                t0Var = new t0();
            }
        } else {
            jSONArrayOptJSONArray = null;
        }
        if (jSONArrayOptJSONArray == null) {
            t0Var = new t0();
        } else {
            hr.d dVarT = e.T(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = dVarT.iterator();
            while (((hr.c) it).f10868g) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(((hr.c) it).nextInt());
                z4.f fVar = (z4.f) bVar2.f26690a;
                l.b(jSONObject2);
                arrayList.add(fVar.e(jSONObject2));
            }
            t0Var = new t0(arrayList);
        }
        h hVar = (h) this.f27442d;
        List list = w0Var.f757b;
        hVar.getClass();
        l.e(list, "fallbackTasks");
        if (jSONArrayOptJSONArray2 != null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArrayOptJSONArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    l.d(jSONObject3, "getJSONObject(...)");
                    v0 v0VarH = hVar.h(jSONObject3, c0Var, bVar);
                    if (v0VarH != null) {
                        arrayList2.add(v0VarH);
                    }
                }
                list = arrayList2;
            } catch (JSONException e10) {
                n.e("TaskItemConfigMapper", e10);
                hVar.f7402a.r();
                cj.a.G(e10);
            }
        }
        return new w0(t0Var, list, jSONObject.optBoolean("use_telephony_call_state", w0Var.f758c));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(zt.g r7, pq.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.c.l(zt.g, pq.c):java.lang.Object");
    }

    public c(h hVar, z7.b bVar, cj.a aVar) {
        this.f27441a = 0;
        l.e(hVar, "taskItemConfigMapper");
        l.e(bVar, "taskConfigMapper");
        this.f27442d = hVar;
        this.f27443g = bVar;
    }

    public c(List list, List list2) {
        this.f27441a = 1;
        l.e(list, "oldList");
        l.e(list2, "newList");
        this.f27442d = list;
        this.f27443g = list2;
    }
}
