package P4;

import O4.C1461g;
import android.util.Log;
import androidx.work.s;
import com.singular.sdk.internal.Constants;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f10612b = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final T4.e f10613a;

    public g(T4.e eVar) {
        this.f10613a = eVar;
    }

    public static HashMap a(String str) throws JSONException {
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
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                F3.f fVar = k.f10636a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j4 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j4));
            } catch (Exception e4) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e4);
            }
        }
        return arrayList;
    }

    public static String e(List<k> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(k.f10636a.a(list.get(i))));
            } catch (JSONException e4) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e4);
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

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map<String, String> c(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e4;
        T4.e eVar = this.f10613a;
        File fileB = z10 ? eVar.b(str, "internal-keys") : eVar.b(str, "keys");
        if (fileB.exists()) {
            ?? length = fileB.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                    } catch (Exception e10) {
                        fileInputStream = null;
                        e4 = e10;
                    } catch (Throwable th) {
                        th = th;
                        C1461g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        HashMap mapA = a(C1461g.i(fileInputStream));
                        C1461g.b(fileInputStream, "Failed to close user metadata file.");
                        return mapA;
                    } catch (Exception e11) {
                        e4 = e11;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e4);
                        f(fileB);
                        C1461g.b(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = length;
                    C1461g.b(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(fileB);
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileB = this.f10613a.b(str, "user-data");
        Closeable closeable = null;
        if (fileB.exists()) {
            ?? r32 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        C1461g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(C1461g.i(fileInputStream));
                        String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                        String str2 = "Loaded userId " + strOptString + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str2, null);
                        }
                        C1461g.b(fileInputStream, "Failed to close user metadata file.");
                        return strOptString;
                    } catch (Exception e10) {
                        e = e10;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(fileB);
                        C1461g.b(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String strD = s.d("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strD, null);
        }
        f(fileB);
        return null;
    }

    public final void g(String str, Map<String, String> map, boolean z10) throws Throwable {
        T4.e eVar = this.f10613a;
        File fileB = z10 ? eVar.b(str, "internal-keys") : eVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f10612b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    C1461g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileB);
                    C1461g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1461g.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void h(String str, List<k> list) throws Throwable {
        File fileB = this.f10613a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(fileB);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f10612b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    C1461g.b(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(fileB);
                    C1461g.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1461g.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File fileB = this.f10613a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                f fVar = new f();
                fVar.put("userId", str2);
                String string = fVar.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f10612b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    C1461g.b(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    C1461g.b(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1461g.b(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
