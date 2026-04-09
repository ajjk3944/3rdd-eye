package pa;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import va.e3;
import va.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f31543a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31544b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final j f31545c;

    public q(x1 x1Var) {
        this.f31543a = x1Var;
        if (x1Var != null) {
            try {
                List<e3> listE = x1Var.e();
                if (listE != null) {
                    for (e3 e3Var : listE) {
                        j jVar = e3Var != null ? new j(e3Var) : null;
                        if (jVar != null) {
                            this.f31544b.add(jVar);
                        }
                    }
                }
            } catch (RemoteException e2) {
                za.i.f("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
            }
        }
        x1 x1Var2 = this.f31543a;
        if (x1Var2 == null) {
            return;
        }
        try {
            e3 e3VarZ1 = x1Var2.z1();
            if (e3VarZ1 != null) {
                this.f31545c = new j(e3VarZ1);
            }
        } catch (RemoteException e10) {
            za.i.f("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public final JSONObject a() throws JSONException {
        String strD;
        Bundle bundleC1;
        JSONObject jSONObject = new JSONObject();
        String strC = null;
        x1 x1Var = this.f31543a;
        if (x1Var != null) {
            try {
                strD = x1Var.d();
            } catch (RemoteException e2) {
                za.i.f("Could not forward getResponseId to ResponseInfo.", e2);
            }
        } else {
            strD = null;
        }
        if (strD == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strD);
        }
        if (x1Var != null) {
            try {
                strC = x1Var.c();
            } catch (RemoteException e10) {
                za.i.f("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            }
        }
        if (strC == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strC);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f31544b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            jSONArray.put(((j) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        j jVar = this.f31545c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.a());
        }
        if (x1Var != null) {
            try {
                bundleC1 = x1Var.C1();
            } catch (RemoteException e11) {
                za.i.f("Could not forward getResponseExtras to ResponseInfo.", e11);
            }
        } else {
            bundleC1 = new Bundle();
        }
        if (bundleC1 != null) {
            jSONObject.put("Response Extras", va.r.g.f36157a.k(bundleC1));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
