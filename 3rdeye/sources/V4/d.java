package V4;

import F9.y;
import H6.I;
import O4.C1461g;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes2.dex */
public final class d implements SuccessContinuation<Void, Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12931b;

    public d(e eVar) {
        this.f12931b = eVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(Void r13) throws Exception {
        JSONObject jSONObjectC;
        FileWriter fileWriter;
        e eVar = this.f12931b;
        i iVar = eVar.f12933b;
        y yVar = eVar.f12937f;
        String str = yVar.f1789b;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapB = y.b(iVar);
            S4.a aVar = new S4.a(str, mapB);
            aVar.c("User-Agent", "Crashlytics Android SDK/19.0.3");
            aVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            y.a(aVar, iVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapB;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectC = yVar.c(aVar.b());
        } catch (IOException e4) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e4);
            jSONObjectC = null;
        }
        if (jSONObjectC != null) {
            b bVarA = eVar.f12934c.a(jSONObjectC);
            long j4 = bVarA.f12923c;
            I i = eVar.f12936e;
            i.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    jSONObjectC.put("expires_at", j4);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    fileWriter = new FileWriter((File) i.f2053c);
                    try {
                        try {
                            fileWriter.write(jSONObjectC.toString());
                            fileWriter.flush();
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            C1461g.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        C1461g.b(fileWriter, "Failed to close settings writer.");
                        e.c("Loaded settings: ", jSONObjectC);
                        String str4 = iVar.f12946f;
                        SharedPreferences.Editor editorEdit = eVar.f12932a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        editorEdit.putString("existing_instance_identifier", str4);
                        editorEdit.apply();
                        eVar.f12939h.set(bVarA);
                        eVar.i.get().trySetResult(bVarA);
                        return Tasks.forResult(null);
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileWriter = null;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    C1461g.b(fileWriter, "Failed to close settings writer.");
                    e.c("Loaded settings: ", jSONObjectC);
                    String str42 = iVar.f12946f;
                    SharedPreferences.Editor editorEdit2 = eVar.f12932a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit2.putString("existing_instance_identifier", str42);
                    editorEdit2.apply();
                    eVar.f12939h.set(bVarA);
                    eVar.i.get().trySetResult(bVarA);
                    return Tasks.forResult(null);
                }
                C1461g.b(fileWriter, "Failed to close settings writer.");
                e.c("Loaded settings: ", jSONObjectC);
                String str422 = iVar.f12946f;
                SharedPreferences.Editor editorEdit22 = eVar.f12932a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit22.putString("existing_instance_identifier", str422);
                editorEdit22.apply();
                eVar.f12939h.set(bVarA);
                eVar.i.get().trySetResult(bVarA);
            } catch (Throwable th2) {
                th = th2;
                C1461g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }
}
