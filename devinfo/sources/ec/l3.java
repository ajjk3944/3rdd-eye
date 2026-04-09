package ec;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l3 extends b4 {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f22870e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f22871f;
    public final a1 g;

    /* renamed from: h, reason: collision with root package name */
    public final a1 f22872h;

    /* renamed from: i, reason: collision with root package name */
    public final a1 f22873i;
    public final a1 j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f22874k;

    public l3(g4 g4Var) {
        super(g4Var);
        this.f22870e = new HashMap();
        b1 b1Var = ((o1) this.f218b).f22953e;
        o1.k(b1Var);
        this.f22871f = new a1(b1Var, "last_delete_stale", 0L);
        b1 b1Var2 = ((o1) this.f218b).f22953e;
        o1.k(b1Var2);
        this.g = new a1(b1Var2, "last_delete_stale_batch", 0L);
        b1 b1Var3 = ((o1) this.f218b).f22953e;
        o1.k(b1Var3);
        this.f22872h = new a1(b1Var3, "backoff", 0L);
        b1 b1Var4 = ((o1) this.f218b).f22953e;
        o1.k(b1Var4);
        this.f22873i = new a1(b1Var4, "last_upload", 0L);
        b1 b1Var5 = ((o1) this.f218b).f22953e;
        o1.k(b1Var5);
        this.j = new a1(b1Var5, "last_upload_attempt", 0L);
        b1 b1Var6 = ((o1) this.f218b).f22953e;
        o1.k(b1Var6);
        this.f22874k = new a1(b1Var6, "midnight_offset", 0L);
    }

    public final Pair F(String str) throws Throwable {
        AdvertisingIdClient.Info advertisingIdInfo;
        k3 k3Var;
        B();
        o1 o1Var = (o1) this.f218b;
        tb.a aVar = o1Var.f22957k;
        g gVar = o1Var.f22952d;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f22870e;
        k3 k3Var2 = (k3) map.get(str);
        if (k3Var2 != null && jElapsedRealtime < k3Var2.f22842c) {
            return new Pair(k3Var2.f22840a, Boolean.valueOf(k3Var2.f22841b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jI = gVar.I(str, d0.f22619b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(o1Var.f22949a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (k3Var2 != null && jElapsedRealtime < k3Var2.f22842c + gVar.I(str, d0.f22622c)) {
                    return new Pair(k3Var2.f22840a, Boolean.valueOf(k3Var2.f22841b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e2) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23059n.e(e2, "Unable to get advertising id");
            k3Var = new k3("", jI, false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        k3Var = id2 != null ? new k3(id2, jI, advertisingIdInfo.isLimitAdTrackingEnabled()) : new k3("", jI, advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, k3Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(k3Var.f22840a, Boolean.valueOf(k3Var.f22841b));
    }

    public final String G(String str, boolean z3) throws NoSuchAlgorithmException {
        B();
        String str2 = z3 ? (String) F(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestS = l4.S();
        if (messageDigestS == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestS.digest(str2.getBytes())));
    }

    @Override // ec.b4
    public final void E() {
    }
}
