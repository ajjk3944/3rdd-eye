package va;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.yn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {
    public static final r g = new r();

    /* renamed from: a, reason: collision with root package name */
    public final za.d f36157a;

    /* renamed from: b, reason: collision with root package name */
    public final o f36158b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36159c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f36160d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f36161e;

    /* renamed from: f, reason: collision with root package name */
    public final String f36162f;

    public r() throws NoSuchAlgorithmException {
        za.d dVar = new za.d();
        dVar.f38142a = -1.0f;
        o oVar = new o(new yn("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new yn("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new yn("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new yn("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new yn("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new yn("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        za.a aVar = new za.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f36157a = dVar;
        this.f36158b = oVar;
        this.f36159c = false;
        this.f36160d = aVar;
        this.f36161e = random;
        this.f36162f = string;
    }

    public static void a() {
        g.f36159c = false;
    }
}
