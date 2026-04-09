package u2;

import B4.InterfaceC0140b;
import R.InterfaceC0188o;
import R.r0;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C2080wh;
import com.google.android.gms.internal.ads.Rr;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.base.activity.SuggestActivity;
import x3.InterfaceC2994C;

/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2954d implements e, InterfaceC0140b, InterfaceC0188o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23794b;

    public /* synthetic */ C2954d(Object obj, Object obj2) {
        this.f23793a = obj;
        this.f23794b = obj2;
    }

    @Override // u2.e
    public /* synthetic */ m c(String str) {
        new C2080wh((f) this.f23793a, (Context) this.f23794b, str).start();
        return m.f23816a;
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        String str;
        Object objD;
        SuggestActivity suggestActivity = (SuggestActivity) this.f23793a;
        if (dialog != null) {
            dialog.dismiss();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(suggestActivity.getString(R.string.suggest_question));
        stringBuffer.append("：\n");
        stringBuffer.append((CharSequence) ((TextInputEditText) this.f23794b).getText());
        stringBuffer.append("\n\n");
        stringBuffer.append(suggestActivity.getString(R.string.base_version));
        stringBuffer.append("：");
        try {
            str = Build.VERSION.SDK_INT >= 33 ? suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName : suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            str = "";
        }
        stringBuffer.append(str);
        String string = stringBuffer.toString();
        q5.i.d(string, "toString(...)");
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:lefan2023@126.com"));
            intent.putExtra("android.intent.extra.TEXT", string);
            intent.putExtra("android.intent.extra.SUBJECT", suggestActivity.getString(suggestActivity.getApplicationInfo().labelRes));
            suggestActivity.startActivity(intent);
            objD = C0412i.f5929a;
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (C0409f.a(objD) != null) {
            F4.d.b(suggestActivity, suggestActivity.getString(R.string.send_email_error));
        }
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        InterfaceC2994C interfaceC2994C = (InterfaceC2994C) this.f23793a;
        Rr rr = (Rr) this.f23794b;
        Rr rr2 = new Rr();
        rr2.f11054a = rr.f11054a;
        rr2.f11055b = rr.f11055b;
        rr2.f11056c = rr.f11056c;
        rr2.f11057d = rr.f11057d;
        return interfaceC2994C.l(view, r0Var, rr2);
    }
}
