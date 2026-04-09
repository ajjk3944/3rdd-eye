package Wa;

import Zg.d0;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f23762a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23763b;

    public i(PackageManager packageManager, a androidSdkVersion) {
        AbstractC6492s.i(packageManager, "packageManager");
        AbstractC6492s.i(androidSdkVersion, "androidSdkVersion");
        this.f23762a = packageManager;
        this.f23763b = androidSdkVersion;
    }

    @Override // Wa.e
    public Set a(String packageName) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        SigningInfo signingInfo;
        AbstractC6492s.i(packageName, "packageName");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Signature[] apkContentsSigners = null;
        if (this.f23763b.b(28)) {
            PackageInfo packageInfo = this.f23762a.getPackageInfo(packageName, 134217728);
            if (packageInfo != null && (signingInfo = packageInfo.signingInfo) != null) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
            }
        } else {
            PackageInfo packageInfo2 = this.f23762a.getPackageInfo(packageName, 64);
            if (packageInfo2 != null) {
                apkContentsSigners = packageInfo2.signatures;
            }
        }
        if (apkContentsSigners == null) {
            return d0.e();
        }
        Set setB = d0.b();
        for (Signature signature : apkContentsSigners) {
            byte[] bArrDigest = messageDigest.digest(signature.toByteArray());
            AbstractC6492s.h(bArrDigest, "digest(...)");
            setB.add(b(bArrDigest));
        }
        return d0.a(setB);
    }

    public final String b(byte[] bytes) {
        AbstractC6492s.i(bytes, "bytes");
        StringBuilder sb2 = new StringBuilder();
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bytes[i10];
            int i12 = i11 + 1;
            if (i11 != 0) {
                sb2.append(":");
            }
            U u10 = U.f51694a;
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            AbstractC6492s.h(str, "format(...)");
            sb2.append(str);
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public /* synthetic */ i(PackageManager packageManager, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i10 & 2) != 0 ? a.f23740b.a() : aVar);
    }
}
