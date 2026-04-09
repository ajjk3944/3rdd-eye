package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hq0 {
    public final tx2 a;
    public final ArrayList b = new ArrayList();
    public final h3 c;

    public hq0(tx2 tx2Var) {
        this.a = tx2Var;
        if (tx2Var != null) {
            try {
                List<qh4> listE = tx2Var.e();
                if (listE != null) {
                    for (qh4 qh4Var : listE) {
                        h3 h3Var = qh4Var != null ? new h3(qh4Var) : null;
                        if (h3Var != null) {
                            this.b.add(h3Var);
                        }
                    }
                }
            } catch (RemoteException e) {
                gi2.c0("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        tx2 tx2Var2 = this.a;
        if (tx2Var2 == null) {
            return;
        }
        try {
            qh4 qh4VarF = tx2Var2.f();
            if (qh4VarF != null) {
                this.c = new h3(qh4VarF);
            }
        } catch (RemoteException e2) {
            gi2.c0("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public final JSONObject a() throws JSONException {
        String strC;
        Bundle bundleJ;
        JSONObject jSONObject = new JSONObject();
        String strB = null;
        tx2 tx2Var = this.a;
        if (tx2Var != null) {
            try {
                strC = tx2Var.c();
            } catch (RemoteException e) {
                gi2.c0("Could not forward getResponseId to ResponseInfo.", e);
            }
        } else {
            strC = null;
        }
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        if (tx2Var != null) {
            try {
                strB = tx2Var.b();
            } catch (RemoteException e2) {
                gi2.c0("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            }
        }
        if (strB == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strB);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((h3) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        h3 h3Var = this.c;
        if (h3Var != null) {
            jSONObject.put("Loaded Adapter Response", h3Var.a());
        }
        if (tx2Var != null) {
            try {
                bundleJ = tx2Var.j();
            } catch (RemoteException e3) {
                gi2.c0("Could not forward getResponseExtras to ResponseInfo.", e3);
            }
        } else {
            bundleJ = new Bundle();
        }
        if (bundleJ != null) {
            jSONObject.put("Response Extras", sv1.f.a.j(bundleJ));
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
