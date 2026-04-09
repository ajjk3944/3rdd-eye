package a4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import b4.AbstractC0349n;
import b4.C0339d;
import b4.C0358w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final X3.e f4705c = new X3.e("SplitInstallService", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f4706d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f4707a;

    /* renamed from: b, reason: collision with root package name */
    public final C0339d f4708b;

    public k(Context context, String str) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f4707a = str;
        X3.e eVar = AbstractC0349n.f5758a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    AbstractC0349n.f5758a.d("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f4708b = new C0339d(applicationContext != null ? applicationContext : context, f4705c, f4706d);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(C1.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = bVar.f1138a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C0358w c0358w = (C0358w) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", c0358w.f5776a);
            bundle2.putLong("event_timestamp", c0358w.f5777b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList));
        return bundle;
    }
}
