package com.google.android.gms.internal.ads;

import android.os.Build;
import com.applovin.shadow.okio.Utf8;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fv0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11265a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11266b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] x509CertificateArrK = a80.k(file.getAbsolutePath());
            if (x509CertificateArrK.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrK[0][0].getEncoded());
            return Arrays.equals(f11265a, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(f11266b, bArrDigest));
        } catch (u9 e2) {
            throw new GeneralSecurityException("Package is not signed", e2);
        } catch (IOException | RuntimeException e10) {
            throw new GeneralSecurityException("Failed to verify signatures", e10);
        }
    }
}
