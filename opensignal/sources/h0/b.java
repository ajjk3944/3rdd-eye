package h0;

import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import br.y;
import ch.n;
import com.google.android.gms.internal.measurement.b4;
import g1.r;
import h9.z2;
import io.sentry.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void A(long j, String str, StringBuilder sb2) {
        sb2.append((Object) r.i(j));
        sb2.append(str);
    }

    public static void B(String str, String str2, String str3) {
        a5.a.B(str3, str + str2);
    }

    public static void C(HashMap map, String str, i4.b bVar, String str2, u0 u0Var) {
        Object obj = map.get(str);
        bVar.I(str2);
        bVar.S(u0Var, obj);
    }

    public static void D(ConcurrentHashMap concurrentHashMap, String str, i4.b bVar, String str2, u0 u0Var) {
        Object obj = concurrentHashMap.get(str);
        bVar.I(str2);
        bVar.S(u0Var, obj);
    }

    public static int a(double d6, int i10, int i11) {
        return (Double.hashCode(d6) + i10) * i11;
    }

    public static int b(int i10, int i11, long j) {
        return (Long.hashCode(j) + i10) * i11;
    }

    public static int c(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static int d(Attributes attributes, int i10) {
        return z2.fromString(attributes.getLocalName(i10)).ordinal();
    }

    public static ClassCastException e(int i10, ArrayList arrayList) {
        arrayList.get(i10).getClass();
        return new ClassCastException();
    }

    public static Object f(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String g(char c4, String str, String str2) {
        return str + str2 + c4;
    }

    public static String h(int i10, String str) {
        return str + i10;
    }

    public static String i(int i10, String str, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static String k(y yVar, Class cls, StringBuilder sb2) {
        sb2.append(yVar.b(cls));
        return sb2.toString();
    }

    public static String l(String str, int i10, int i11, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String m(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String n(String str, androidx.fragment.app.b bVar, String str2) {
        return str + bVar + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String q(StringBuilder sb2, float f10, char c4) {
        sb2.append(f10);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, String str, char c4) {
        sb2.append(str);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, List list, char c4) {
        sb2.append(list);
        sb2.append(c4);
        return sb2.toString();
    }

    public static StringBuilder u(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap v(Class cls, ag.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map w(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static JSONObject x(String str, JSONException jSONException, JSONException jSONException2) {
        n.e(str, jSONException);
        cj.a.G(jSONException2);
        return new JSONObject();
    }

    public static void y(int i10, int i11, int i12, int i13, int i14) {
        b4.b(i10);
        b4.b(i11);
        b4.b(i12);
        b4.b(i13);
        b4.b(i14);
    }

    public static void z(int i10, int i11, int i12, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i10, i11, i12)));
    }
}
