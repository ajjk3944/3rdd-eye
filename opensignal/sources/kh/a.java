package kh;

import android.util.Base64;
import ch.n;
import ih.i;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final long f14435a;

    /* renamed from: d, reason: collision with root package name */
    public final Random f14436d = new Random();

    /* renamed from: g, reason: collision with root package name */
    public final dh.b f14437g;

    public a(dh.b bVar, long j) {
        this.f14435a = 0L;
        this.f14437g = bVar;
        this.f14435a = j;
        n.b("AkamaiUploadProviderHttp", "HTTP upload to: " + bVar.f7343a);
    }

    public static String a(String str, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        String str4 = str + "/" + str3 + "/" + str2 + "\nx-akamai-acs-action:version=1&action=upload\n";
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec("10giOLzvVnN70pytwa4acvVMxf6pFMez1mFHIVHohCo2AdnQs".getBytes(), "HmacSHA256"));
            return new String(Base64.encode(mac.doFinal(str4.getBytes()), 0)).trim();
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            n.e("CommonCryptoUtils", e4);
            return "";
        }
    }

    @Override // ih.i
    public final String r() {
        return this.f14437g.f7343a;
    }

    @Override // ih.i
    public final String s() {
        return this.f14437g.f7344b;
    }

    @Override // ih.i
    public HttpURLConnection x() throws ProtocolException {
        Random random = this.f14436d;
        HttpURLConnection httpURLConnection = null;
        try {
            String str = this.f14437g.f7344b;
            String strSubstring = new URL(str).getFile().substring(1);
            String str2 = "ul" + random.nextInt(500000) + ".bin";
            String str3 = "5, 0.0.0.0, 0.0.0.0, " + this.f14435a + ", " + (random.nextInt(500000) + 1) + ", connectivityuploader";
            String strA = a(str3, str2, strSubstring);
            n.b("AkamaiUploadProviderHttp", "acs action : ", "version=1&action=upload");
            n.b("AkamaiUploadProviderHttp", "auth data  : ", str3);
            n.b("AkamaiUploadProviderHttp", "signature  : ", strA);
            String str4 = str + "/" + str2;
            n.b("AkamaiUploadProviderHttp", "==> Akamai upload to: ", str4);
            URL url = new URL(str4);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setRequestMethod("PUT");
                httpURLConnection2.setRequestProperty("Host", url.getHost());
                httpURLConnection2.setRequestProperty("X-Akamai-ACS-Action", "version=1&action=upload");
                httpURLConnection2.setRequestProperty("X-Akamai-ACS-Auth-Data", str3);
                httpURLConnection2.setRequestProperty("X-Akamai-ACS-Auth-Sign", strA);
                httpURLConnection2.setRequestProperty("User-Agent", "OS-Android");
                httpURLConnection2.setRequestProperty("Accept", "*/*");
                httpURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.setRequestProperty("Keep-Alive", "300");
                httpURLConnection2.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setDoOutput(false);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setUseCaches(false);
                return httpURLConnection2;
            } catch (Exception e4) {
                e = e4;
                httpURLConnection = httpURLConnection2;
                n.e("AkamaiUploadProviderHttp", e);
                return httpURLConnection;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
