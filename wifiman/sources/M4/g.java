package M4;

import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f12508b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Q4.g f12509a;

    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12510a;

        a(String str) throws JSONException {
            this.f12510a = str;
            put("userId", str);
        }
    }

    public g(Q4.g gVar) {
        this.f12509a = gVar;
    }

    private static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static List f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                I4.g.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map map) {
        return new JSONObject(map).toString();
    }

    private static String l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f12536a.b(list.get(i10))));
            } catch (JSONException e10) {
                I4.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            I4.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            I4.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String o(String str) {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f12509a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f12509a.q(str, "keys");
    }

    public File c(String str) {
        return this.f12509a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f12509a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map i(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
            } catch (Exception e11) {
                fileInputStream = null;
                e10 = e11;
            } catch (Throwable th3) {
                ?? r12 = 0;
                th2 = th3;
                AbstractC5107i.f(r12, "Failed to close user metadata file.");
                throw th2;
            }
            try {
                Map mapE = e(AbstractC5107i.A(fileInputStream));
                AbstractC5107i.f(fileInputStream, "Failed to close user metadata file.");
                return mapE;
            } catch (Exception e12) {
                e10 = e12;
                I4.g.f().l("Error deserializing user metadata.", e10);
                m(fileA);
                AbstractC5107i.f(fileInputStream, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
        } catch (Throwable th4) {
            th2 = th4;
            AbstractC5107i.f(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public List j(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List listF = f(AbstractC5107i.A(fileInputStream2));
                    I4.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    AbstractC5107i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    I4.g.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    AbstractC5107i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    AbstractC5107i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            I4.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC5107i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strG = g(AbstractC5107i.A(fileInputStream));
                I4.g.f().b("Loaded userId " + strG + " for session " + str);
                AbstractC5107i.f(fileInputStream, "Failed to close user metadata file.");
                return strG;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                AbstractC5107i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            I4.g.f().l("Error deserializing user metadata.", e);
            m(fileD);
            AbstractC5107i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void q(String str, Map map) throws Throwable {
        r(str, map, false);
    }

    public void r(String str, Map map, boolean z10) throws Throwable {
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strH = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f12508b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    AbstractC5107i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    I4.g.f().l("Error serializing key/value metadata.", e);
                    m(fileA);
                    AbstractC5107i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    AbstractC5107i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void s(String str, List list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e10;
        String strL;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f12508b));
            } catch (Exception e11) {
                bufferedWriter = null;
                e10 = e11;
            } catch (Throwable th3) {
                IsEmpty = 0;
                th2 = th3;
                AbstractC5107i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
            try {
                bufferedWriter.write(strL);
                bufferedWriter.flush();
                IsEmpty = bufferedWriter;
            } catch (Exception e12) {
                e10 = e12;
                I4.g.f().l("Error serializing rollouts state.", e10);
                m(fileC);
                IsEmpty = bufferedWriter;
                AbstractC5107i.f(IsEmpty, "Failed to close rollouts state file.");
            }
            AbstractC5107i.f(IsEmpty, "Failed to close rollouts state file.");
        } catch (Throwable th4) {
            th2 = th4;
            AbstractC5107i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void t(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strO = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f12508b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    AbstractC5107i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    I4.g.f().l("Error serializing user metadata.", e);
                    AbstractC5107i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    AbstractC5107i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
