package q2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1643ob;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import u2.C2951a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public static final r f23260g = new r();

    /* renamed from: a, reason: collision with root package name */
    public final u2.f f23261a;

    /* renamed from: b, reason: collision with root package name */
    public final C2834o f23262b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23263c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f23264d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f23265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23266f;

    public r() throws NoSuchAlgorithmException {
        u2.f fVar = new u2.f();
        fVar.f23802a = -1.0f;
        C2834o c2834o = new C2834o(new C1643ob("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new C1643ob("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new C1643ob("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new C1643ob("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new C1643ob("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new C1643ob("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        C2951a c2951a = new C2951a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
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
        this.f23261a = fVar;
        this.f23262b = c2834o;
        this.f23263c = false;
        this.f23264d = c2951a;
        this.f23265e = random;
        this.f23266f = string;
    }

    public static void a() {
        f23260g.f23263c = false;
    }
}
