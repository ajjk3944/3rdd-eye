package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m92 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ m92(String str, pv2 pv2Var) {
        this.a = 2;
        this.c = pv2Var;
        this.b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        switch (this.a) {
            case 0:
                ib2 ib2Var = (ib2) this.c;
                synchronized (ib2Var) {
                    try {
                        ArrayList arrayList = ib2Var.b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str2 = (String) this.b;
                            HashMap map = ((na2) obj).a;
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                hg4.C.h.g().t(false);
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                qc2 qc2Var = (qc2) this.c;
                synchronized (qc2Var) {
                    try {
                        ArrayList arrayList2 = qc2Var.b;
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            pc2 pc2Var = (pc2) obj2;
                            String str3 = (String) this.b;
                            qc2 qc2Var2 = pc2Var.a;
                            HashMap map2 = pc2Var.b;
                            qc2Var2.getClass();
                            if (map2.containsKey(str3) && ((Set) map2.get(str3)).contains(str)) {
                                gw3 gw3Var = qc2Var2.d;
                                ((ym) gw3Var.g).getClass();
                                ((vb2) gw3Var.h).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                pv2 pv2Var = (pv2) this.c;
                pv2Var.j.set(yc0.u(pv2Var.b, (String) this.b));
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.b;
                if (str != null && ((List) this.c).contains(str)) {
                    try {
                        Object obj3 = sharedPreferences.getAll().get(str);
                        if (obj3 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj3);
                        }
                        return;
                    } catch (JSONException e) {
                        hg4.C.h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
                        return;
                    }
                }
                return;
        }
    }

    public m92() {
        this.a = 3;
        this.b = new JSONObject();
    }

    public m92(ib2 ib2Var, String str) {
        this.a = 0;
        Objects.requireNonNull(ib2Var);
        this.c = ib2Var;
        this.b = str;
    }

    public m92(qc2 qc2Var, String str) {
        this.a = 1;
        Objects.requireNonNull(qc2Var);
        this.c = qc2Var;
        this.b = str;
    }
}
