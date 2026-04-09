package r3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.ar.core.ImageMetadata;
import s3.n0;

/* renamed from: r3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7568f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60085a = AbstractC7570h.f60088a;

    /* renamed from: b, reason: collision with root package name */
    private static final C7568f f60086b = new C7568f();

    C7568f() {
    }

    public static C7568f f() {
        return f60086b;
    }

    public int a(Context context) {
        return AbstractC7570h.b(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = n0.f61331c;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.h.d(context)) {
            int i12 = n0.f61331c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f60085a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(w3.c.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        int i13 = n0.f61331c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(ImageMetadata.LENS_APERTURE);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return s1.q.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return AbstractC7570h.c(i10);
    }

    public int g(Context context) {
        return h(context, f60085a);
    }

    public int h(Context context, int i10) {
        int iG = AbstractC7570h.g(context, i10);
        if (AbstractC7570h.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(Context context, String str) {
        return AbstractC7570h.l(context, str);
    }

    public boolean j(int i10) {
        return AbstractC7570h.j(i10);
    }

    public void k(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        AbstractC7570h.a(context, i10);
    }
}
