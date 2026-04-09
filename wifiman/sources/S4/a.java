package S4;

import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final File f20246a;

    public a(Q4.g gVar) {
        this.f20246a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f20246a;
    }

    public JSONObject b() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th2;
        JSONObject jSONObject;
        I4.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File fileA = a();
            if (fileA.exists()) {
                fileInputStream = new FileInputStream(fileA);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC5107i.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th3) {
                        th2 = th3;
                        AbstractC5107i.f(fileInputStream, "Error while closing settings cache file.");
                        throw th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    I4.g.f().e("Failed to fetch cached settings", e);
                    AbstractC5107i.f(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                I4.g.f().i("Settings file does not exist.");
                jSONObject = null;
            }
            AbstractC5107i.f(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th2 = th4;
            AbstractC5107i.f(fileInputStream, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        I4.g.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    AbstractC5107i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    I4.g.f().e("Failed to cache settings", e);
                    AbstractC5107i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    AbstractC5107i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
