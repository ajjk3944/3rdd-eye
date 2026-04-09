package j5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* compiled from: IidStore.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f42970c = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f42971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42972b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(B4.e r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f487a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f42971a = r0
            r4.a()
            B4.k r0 = r4.f489c
            java.lang.String r1 = r0.f507e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.a()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f504b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f42972b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b.<init>(B4.e):void");
    }

    public final String a() {
        String string;
        synchronized (this.f42971a) {
            string = this.f42971a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f42971a) {
            String strEncodeToString = null;
            String string = this.f42971a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
                Log.w("ContentValues", "Invalid key stored " + e4);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
