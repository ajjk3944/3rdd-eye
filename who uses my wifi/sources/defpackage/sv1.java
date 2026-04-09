package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sv1 {
    public static final sv1 f = new sv1();
    public final j63 a;
    public final bu1 b;
    public final String c;
    public final e51 d;
    public final Random e;

    public sv1() throws NoSuchAlgorithmException {
        j63 j63Var = new j63();
        j63Var.a = -1.0f;
        bu1 bu1Var = new bu1(new g32("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new g32("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new g32("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new g32("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new g32("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new g32("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
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
        e51 e51Var = new e51(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.a = j63Var;
        this.b = bu1Var;
        this.c = string;
        this.d = e51Var;
        this.e = random;
    }
}
