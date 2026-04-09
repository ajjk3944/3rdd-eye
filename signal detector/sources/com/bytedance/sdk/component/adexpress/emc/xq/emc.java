package com.bytedance.sdk.component.adexpress.emc.xq;

import android.text.TextUtils;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private ypw bw;
    private List<C0024emc> dg;
    private String emc;
    private Map<String, emc> uym = new ConcurrentHashMap();
    private String xq;
    private String ycc;
    private String ypw;

    /* renamed from: com.bytedance.sdk.component.adexpress.emc.xq.emc$emc, reason: collision with other inner class name */
    public static class C0024emc {
        private String emc;
        private int xq;
        private String ypw;

        public String emc() {
            return this.emc;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0024emc)) {
                return super.equals(obj);
            }
            String str2 = this.emc;
            if (str2 != null) {
                C0024emc c0024emc = (C0024emc) obj;
                if (str2.equals(c0024emc.emc()) && (str = this.ypw) != null && str.equals(c0024emc.ypw())) {
                    return true;
                }
            }
            return false;
        }

        public int xq() {
            return this.xq;
        }

        public String ypw() {
            return this.ypw;
        }

        public void emc(String str) {
            this.emc = str;
        }

        public void ypw(String str) {
            this.ypw = str;
        }

        public void emc(int i) {
            this.xq = i;
        }
    }

    public static class ypw {
        private String emc;
        private List<Pair<String, String>> xq;
        private String ypw;

        public String emc() {
            return this.emc;
        }

        public void ypw(String str) {
            this.ypw = str;
        }

        public void emc(String str) {
            this.emc = str;
        }

        public List<Pair<String, String>> ypw() {
            return this.xq;
        }

        public void emc(List<Pair<String, String>> list) {
            this.xq = list;
        }
    }

    public ypw bw() {
        return this.bw;
    }

    public String dg() {
        return this.xq;
    }

    public Map<String, emc> emc() {
        return this.uym;
    }

    public boolean msw() {
        return (TextUtils.isEmpty(dg()) || TextUtils.isEmpty(xq()) || TextUtils.isEmpty(ypw())) ? false : true;
    }

    public String ru() {
        JSONObject jSONObjectZz;
        if (!msw() || (jSONObjectZz = zz()) == null) {
            return null;
        }
        return jSONObjectZz.toString();
    }

    public String uym() {
        return this.ycc;
    }

    public String xq() {
        return this.ypw;
    }

    public List<C0024emc> ycc() {
        if (this.dg == null) {
            this.dg = new ArrayList();
        }
        return this.dg;
    }

    public String ypw() {
        return this.emc;
    }

    public JSONObject zz() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", ypw());
            jSONObject.putOpt("version", xq());
            jSONObject.putOpt("main", dg());
            if (!TextUtils.isEmpty(this.ycc)) {
                jSONObject.put("template_fetch_url", this.ycc);
            }
            JSONArray jSONArray = new JSONArray();
            if (ycc() != null) {
                for (C0024emc c0024emc : ycc()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0024emc.emc());
                    jSONObject2.putOpt("md5", c0024emc.ypw());
                    jSONObject2.putOpt("level", Integer.valueOf(c0024emc.xq()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.uym.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z6 = false;
                for (String str : this.uym.keySet()) {
                    emc emcVar = this.uym.get(str);
                    if (emcVar != null) {
                        jSONObject3.put(str, emcVar.zz());
                        z6 = true;
                    }
                }
                if (z6) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            ypw ypwVarBw = bw();
            if (ypwVarBw != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", ypwVarBw.emc);
                jSONObject4.put("md5", ypwVarBw.ypw);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listYpw = ypwVarBw.ypw();
                if (listYpw != null) {
                    for (Pair<String, String> pair : listYpw) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static emc bw(String str) {
        if (str == null) {
            return null;
        }
        try {
            return emc(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void dg(String str) {
        this.ycc = str;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void xq(String str) {
        this.xq = str;
    }

    public void ypw(String str) {
        this.ypw = str;
    }

    public void emc(ypw ypwVar) {
        this.bw = ypwVar;
    }

    public void emc(List<C0024emc> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.dg = list;
    }

    public static emc emc(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        emc emcVar = new emc();
        emcVar.emc(jSONObject.optString("name"));
        emcVar.ypw(jSONObject.optString("version"));
        emcVar.xq(jSONObject.optString("main"));
        emcVar.dg(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0024emc c0024emc = new C0024emc();
                c0024emc.emc(jSONObjectOptJSONObject2.optString("url"));
                c0024emc.ypw(jSONObjectOptJSONObject2.optString("md5"));
                c0024emc.emc(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0024emc);
            }
        }
        emcVar.emc(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    emc emcVarEmc = emc(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (emcVarEmc != null) {
                        emcVar.emc().put(next, emcVarEmc);
                    }
                }
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            ypw ypwVar = new ypw();
            ypwVar.emc(jSONObjectOptJSONObject.optString("url"));
            ypwVar.ypw(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                ypwVar.emc(arrayList2);
            }
            emcVar.emc(ypwVar);
        }
        if (emcVar.msw()) {
            return emcVar;
        }
        return null;
    }
}
