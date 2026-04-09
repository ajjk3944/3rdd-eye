package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class bg {
    public static String a(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        d91 d91Var = new d91();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new zd(1, d91Var));
        return (String) d91Var.get();
    }
}
