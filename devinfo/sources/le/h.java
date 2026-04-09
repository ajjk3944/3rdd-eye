package le;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
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
import je.u;
import nm.d0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f28717b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final pe.c f28718a;

    public h(pe.c cVar) {
        this.f28718a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            try {
                d0 d0Var = n.f28734a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j));
            } catch (Exception e2) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                jSONArray.put(new JSONObject(n.f28734a.n(list.get(i4))));
            } catch (JSONException e2) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e2);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", u.u("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z3) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e2;
        pe.c cVar = this.f28718a;
        File fileB = z3 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            g(fileB, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
            } catch (Exception e10) {
                fileInputStream = null;
                e2 = e10;
            } catch (Throwable th3) {
                ?? r12 = 0;
                th2 = th3;
                je.g.b(r12, "Failed to close user metadata file.");
                throw th2;
            }
            try {
                HashMap mapA = a(je.g.i(fileInputStream));
                je.g.b(fileInputStream, "Failed to close user metadata file.");
                return mapA;
            } catch (Exception e11) {
                e2 = e11;
                Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e2);
                f(fileB);
                je.g.b(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th4) {
            th2 = th4;
            je.g.b(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileB = this.f28718a.b(str, "user-data");
        Closeable closeable = null;
        if (fileB.exists()) {
            ?? r32 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        je.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(je.g.i(fileInputStream));
                        String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                        String str2 = "Loaded userId " + strOptString + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str2, null);
                        }
                        je.g.b(fileInputStream, "Failed to close user metadata file.");
                        return strOptString;
                    } catch (Exception e10) {
                        e = e10;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(fileB);
                        je.g.b(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        String strT = u.t("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strT, null);
        }
        f(fileB);
        return null;
    }

    public final void h(String str, Map map, boolean z3) {
        pe.c cVar = this.f28718a;
        File fileB = z3 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f28717b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    je.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileB);
                    je.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    je.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void i(String str, List list) {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e2;
        String strE;
        File fileB = this.f28718a.b(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            g(fileB, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f28717b));
            } catch (Exception e10) {
                bufferedWriter = null;
                e2 = e10;
            } catch (Throwable th3) {
                IsEmpty = 0;
                th2 = th3;
                je.g.b(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
            try {
                bufferedWriter.write(strE);
                bufferedWriter.flush();
                je.g.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e11) {
                e2 = e11;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e2);
                f(fileB);
                je.g.b(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Throwable th4) {
            th2 = th4;
            je.g.b(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }
}
