package h5;

import com.google.firebase.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.snmp4j.transport.TLSTM;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5951c {

    /* renamed from: a, reason: collision with root package name */
    private File f48425a;

    /* renamed from: b, reason: collision with root package name */
    private final f f48426b;

    /* renamed from: h5.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C5951c(f fVar) {
        this.f48426b = fVar;
    }

    private File a() {
        if (this.f48425a == null) {
            synchronized (this) {
                try {
                    if (this.f48425a == null) {
                        this.f48425a = new File(this.f48426b.k().getFilesDir(), "PersistedInstallation." + this.f48426b.o() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f48425a;
    }

    private JSONObject c() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[TLSTM.TLS_MAX_FRAGMENT_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, TLSTM.TLS_MAX_FRAGMENT_SIZE);
                    if (i10 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public AbstractC5952d b(AbstractC5952d abstractC5952d) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC5952d.d());
            jSONObject.put("Status", abstractC5952d.g().ordinal());
            jSONObject.put("AuthToken", abstractC5952d.b());
            jSONObject.put("RefreshToken", abstractC5952d.f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC5952d.h());
            jSONObject.put("ExpiresInSecs", abstractC5952d.c());
            jSONObject.put("FisError", abstractC5952d.e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f48426b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(a())) {
            return abstractC5952d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public AbstractC5952d d() throws IOException {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString("AuthToken", null);
        String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return AbstractC5952d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}
