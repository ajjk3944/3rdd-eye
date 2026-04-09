package kf;

import android.util.Log;
import io.sentry.android.core.e0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f14310b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final of.b f14311a;

    public g(of.b bVar) {
        this.f14311a = bVar;
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                z7.j jVar = m.f14327a;
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
            } catch (Exception e4) {
                e0.q("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e4);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(m.f14327a.b(list.get(i10))));
            } catch (JSONException e4) {
                e0.q("FirebaseCrashlytics", "Exception parsing rollout assignment!", e4);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map c(String str, boolean z10) throws IOException {
        of.b bVar = this.f14311a;
        File fileE = z10 ? bVar.e(str, "internal-keys") : bVar.e(str, "keys");
        if (!fileE.exists() || fileE.length() == 0) {
            if (fileE.exists() && fileE.delete()) {
                fileE.getAbsolutePath();
            }
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStreamJ = null;
        try {
            try {
                fileInputStreamJ = xu.d.j(fileE, new FileInputStream(fileE));
                return a(hf.f.i(fileInputStreamJ));
            } catch (Exception e4) {
                e0.q("FirebaseCrashlytics", "Error deserializing user metadata.", e4);
                f(fileE);
                hf.f.b(fileInputStreamJ, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } finally {
            hf.f.b(fileInputStreamJ, "Failed to close user metadata file.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStreamJ;
        File fileE = this.f14311a.e(str, "user-data");
        Closeable closeable = null;
        if (fileE.exists()) {
            ?? r12 = (fileE.length() > 0L ? 1 : (fileE.length() == 0L ? 0 : -1));
            try {
                if (r12 != 0) {
                    try {
                        fileInputStreamJ = xu.d.j(fileE, new FileInputStream(fileE));
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStreamJ = null;
                    } catch (Throwable th2) {
                        th = th2;
                        hf.f.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(hf.f.i(fileInputStreamJ));
                        String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        hf.f.b(fileInputStreamJ, "Failed to close user metadata file.");
                        return strOptString;
                    } catch (Exception e10) {
                        e = e10;
                        e0.q("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(fileE);
                        hf.f.b(fileInputStreamJ, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r12;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        f(fileE);
        return null;
    }

    public final void g(String str, Map map, boolean z10) {
        of.b bVar = this.f14311a;
        File fileE = z10 ? bVar.e(str, "internal-keys") : bVar.e(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(xu.l.k(new FileOutputStream(fileE), fileE), f14310b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    hf.f.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    e0.q("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileE);
                    hf.f.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    hf.f.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void h(String str, List list) {
        File fileE = this.f14311a.e(str, "rollouts-state");
        if (list.isEmpty()) {
            if (fileE.exists() && fileE.delete()) {
                fileE.getAbsolutePath();
                return;
            }
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(xu.l.k(new FileOutputStream(fileE), fileE), f14310b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    hf.f.b(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    e0.q("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(fileE);
                    hf.f.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    hf.f.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
