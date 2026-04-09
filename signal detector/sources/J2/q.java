package j2;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.InterfaceC2854y0;
import q2.f1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2854y0 f21354a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21355b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C2554j f21356c;

    public q(InterfaceC2854y0 interfaceC2854y0) {
        this.f21354a = interfaceC2854y0;
        if (interfaceC2854y0 != null) {
            try {
                List<f1> listE = interfaceC2854y0.e();
                if (listE != null) {
                    for (f1 f1Var : listE) {
                        C2554j c2554j = f1Var != null ? new C2554j(f1Var) : null;
                        if (c2554j != null) {
                            this.f21355b.add(c2554j);
                        }
                    }
                }
            } catch (RemoteException e6) {
                u2.k.f("Could not forward getAdapterResponseInfo to ResponseInfo.", e6);
            }
        }
        InterfaceC2854y0 interfaceC2854y02 = this.f21354a;
        if (interfaceC2854y02 == null) {
            return;
        }
        try {
            f1 f1VarG = interfaceC2854y02.g();
            if (f1VarG != null) {
                this.f21356c = new C2554j(f1VarG);
            }
        } catch (RemoteException e7) {
            u2.k.f("Could not forward getLoadedAdapterResponse to ResponseInfo.", e7);
        }
    }

    public final JSONObject a() throws JSONException {
        String strD;
        Bundle bundleJ;
        JSONObject jSONObject = new JSONObject();
        String strB = null;
        InterfaceC2854y0 interfaceC2854y0 = this.f21354a;
        if (interfaceC2854y0 != null) {
            try {
                strD = interfaceC2854y0.d();
            } catch (RemoteException e6) {
                u2.k.f("Could not forward getResponseId to ResponseInfo.", e6);
            }
        } else {
            strD = null;
        }
        if (strD == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strD);
        }
        if (interfaceC2854y0 != null) {
            try {
                strB = interfaceC2854y0.b();
            } catch (RemoteException e7) {
                u2.k.f("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
            }
        }
        if (strB == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strB);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f21355b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((C2554j) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        C2554j c2554j = this.f21356c;
        if (c2554j != null) {
            jSONObject.put("Loaded Adapter Response", c2554j.a());
        }
        if (interfaceC2854y0 != null) {
            try {
                bundleJ = interfaceC2854y0.j();
            } catch (RemoteException e8) {
                u2.k.f("Could not forward getResponseExtras to ResponseInfo.", e8);
            }
        } else {
            bundleJ = new Bundle();
        }
        if (bundleJ != null) {
            jSONObject.put("Response Extras", q2.r.f23260g.f23261a.k(bundleJ));
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
