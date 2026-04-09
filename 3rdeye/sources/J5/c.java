package j5;

import B4.e;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public File f42973a;

    /* renamed from: b, reason: collision with root package name */
    public final e f42974b;

    /* compiled from: PersistedInstallation.java */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(e eVar) {
        this.f42974b = eVar;
    }

    public final File a() {
        if (this.f42973a == null) {
            synchronized (this) {
                try {
                    if (this.f42973a == null) {
                        e eVar = this.f42974b;
                        eVar.a();
                        this.f42973a = new File(eVar.f487a.getFilesDir(), "PersistedInstallation." + this.f42974b.d() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f42973a;
    }

    public final void b(C5194a c5194a) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c5194a.f42956b);
            jSONObject.put("Status", c5194a.f42957c.ordinal());
            jSONObject.put("AuthToken", c5194a.f42958d);
            jSONObject.put("RefreshToken", c5194a.f42959e);
            jSONObject.put("TokenCreationEpochInSecs", c5194a.f42961g);
            jSONObject.put("ExpiresInSecs", c5194a.f42960f);
            jSONObject.put("FisError", c5194a.f42962h);
            e eVar = this.f42974b;
            eVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f487a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final C5194a c() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        a aVar = a.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", aVar.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = d.f42975a;
        if (aVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        a aVar2 = a.values()[iOptInt];
        if (aVar2 != null) {
            return new C5194a(strOptString, aVar2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
