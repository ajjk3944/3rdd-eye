package ma;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ra.f;

/* compiled from: ZoneId.java */
/* loaded from: classes3.dex */
public abstract class p implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f44145b;

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f44145b = Collections.unmodifiableMap(map);
    }

    public p() {
        if (getClass() != q.class && getClass() != r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static p a(qa.e eVar) {
        p pVar = (p) eVar.query(qa.i.f45478d);
        if (pVar != null) {
            return pVar;
        }
        throw new a("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static p d(String str, Map<String, String> map) {
        com.google.gson.internal.c.v(str, "zoneId");
        com.google.gson.internal.c.v(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        if (str.equals("Z")) {
            return q.f44148g;
        }
        if (str.length() == 1) {
            throw new a("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return q.h(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            q qVar = q.f44148g;
            qVar.getClass();
            return new r(str, new f.a(qVar));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            q qVarH = q.h(str.substring(3));
            if (qVarH.f44150c == 0) {
                return new r(str.substring(0, 3), new f.a(qVarH));
            }
            return new r(str.substring(0, 3) + qVarH.f44151d, new f.a(qVarH));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return r.g(str, true);
        }
        q qVarH2 = q.h(str.substring(2));
        if (qVarH2.f44150c == 0) {
            return new r("UT", new f.a(qVarH2));
        }
        return new r("UT" + qVarH2.f44151d, new f.a(qVarH2));
    }

    public abstract String b();

    public abstract ra.f c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return b().equals(((p) obj).b());
        }
        return false;
    }

    public abstract void f(ObjectOutput objectOutput) throws IOException;

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }
}
