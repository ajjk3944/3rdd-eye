package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class wk3 {
    public static final er3 a = new er3("PhoneskyVerificationUtils");

    public static boolean a(Context context) throws NoSuchAlgorithmException {
        Signature[] signatureArr;
        String strEncodeToString;
        er3 er3Var = a;
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            er3Var.c("Play Store package is not found.", new Object[0]);
        }
        if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            er3Var.c("Play Store package is disabled.", new Object[0]);
            return false;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused2) {
            er3Var.c("Play Store package is not found.", new Object[0]);
        }
        if (signatureArr == null || (signatureArr.length) == 0) {
            er3Var.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused3) {
                strEncodeToString = "";
            }
            arrayList.add(strEncodeToString);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        er3Var.c(ex0.h("Play Store package certs are not valid. Found these sha256 certs: [", String.join(", ", arrayList), "]."), new Object[0]);
        return false;
    }
}
