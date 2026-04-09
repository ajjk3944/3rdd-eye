package zc;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f27154a;

    public /* synthetic */ t0(c1 c1Var) {
        this.f27154a = c1Var;
    }

    public boolean a() {
        c1 c1Var = this.f27154a;
        try {
            ic.b bVarA = ic.c.a(c1Var.f26884a);
            if (bVarA != null) {
                return bVarA.c(128, "com.android.vending").versionCode >= 80837300;
            }
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.K.c(e4, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // zc.f2
    public void l(int i10, Throwable th2, byte[] bArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i11;
        j0 j0Var;
        j0 j0Var2;
        c1 c1Var = this.f27154a;
        j0 j0Var3 = c1Var.f26889y;
        if (i10 != 200 && i10 != 204) {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
            }
            c1.g(j0Var3);
            j0Var3.F.d(Integer.valueOf(i11), th2, "Network Request for Deferred Deep Link failed. response, exception");
        }
        i11 = i10;
        if (th2 == null) {
            r0 r0Var = c1Var.f26888x;
            c1.e(r0Var);
            r0Var.Q.b(true);
            if (bArr == null || bArr.length == 0) {
                c1.g(j0Var3);
                j0Var3.J.b("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    c1.g(j0Var3);
                    j0Var3.J.b("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                s3 s3Var = c1Var.E;
                c1.e(s3Var);
                c1 c1Var2 = (c1) s3Var.f1504d;
                if (TextUtils.isEmpty(strOptString)) {
                    j0Var2 = j0Var3;
                } else {
                    Context context = c1Var2.f26884a;
                    j0Var2 = j0Var3;
                    try {
                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            c1Var.I.z1("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(strOptString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                editorEdit.putString("deeplink", strOptString);
                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                if (editorEdit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = c1Var2.f26884a;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e4) {
                                j0 j0Var4 = ((c1) s3Var.f1504d).f26889y;
                                c1.g(j0Var4);
                                j0Var4.B.c(e4, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        j0Var = j0Var2;
                        c1.g(j0Var);
                        j0Var.B.c(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                c1.g(j0Var2);
                j0Var = j0Var2;
                try {
                    j0Var.F.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } catch (JSONException e11) {
                    e = e11;
                    c1.g(j0Var);
                    j0Var.B.c(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e12) {
                e = e12;
                j0Var = j0Var3;
            }
        }
        c1.g(j0Var3);
        j0Var3.F.d(Integer.valueOf(i11), th2, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public t0(p3 p3Var) {
        this.f27154a = p3Var.H;
    }
}
