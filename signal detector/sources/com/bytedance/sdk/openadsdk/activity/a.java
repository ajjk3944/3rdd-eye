package com.bytedance.sdk.openadsdk.activity;

import F4.d;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.base.activity.SuggestActivity;
import g5.C2340a;
import java.util.Locale;
import q5.i;
import q5.m;
import q5.o;
import w4.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f6826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6829e;

    public /* synthetic */ a(Activity activity, Object obj, Object obj2, Object obj3, int i) {
        this.f6825a = i;
        this.f6826b = activity;
        this.f6827c = obj;
        this.f6828d = obj2;
        this.f6829e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f6825a;
        Object obj = this.f6829e;
        Object obj2 = this.f6828d;
        Object obj3 = this.f6827c;
        Activity activity = this.f6826b;
        switch (i) {
            case 0:
                ((TTWebsiteActivity) activity).emc((com.bytedance.sdk.openadsdk.core.ycc.ycc) obj3, (String) obj2, (rie) obj, view);
                break;
            default:
                SuggestActivity suggestActivity = (SuggestActivity) activity;
                m mVar = (m) obj3;
                TextInputEditText textInputEditText = (TextInputEditText) obj2;
                o oVar = (o) obj;
                int i3 = SuggestActivity.f18766W;
                StringBuffer stringBuffer = new StringBuffer("https://www.yifanads.com/suggest/?package=");
                stringBuffer.append(suggestActivity.getPackageName());
                stringBuffer.append("&version=v");
                try {
                    str = Build.VERSION.SDK_INT >= 33 ? suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName : suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e6) {
                    e6.printStackTrace();
                    str = "";
                }
                stringBuffer.append(str);
                stringBuffer.append("&country=");
                stringBuffer.append(Locale.getDefault().getCountry());
                stringBuffer.append("&type=");
                stringBuffer.append(mVar.f23297a);
                stringBuffer.append("&problem=");
                stringBuffer.append((CharSequence) textInputEditText.getText());
                String string = stringBuffer.toString();
                i.d(string, "toString(...)");
                if (!i.a(oVar.f23299a, string)) {
                    LinearProgressIndicator linearProgressIndicator = suggestActivity.f18767O;
                    if (linearProgressIndicator != null) {
                        linearProgressIndicator.e();
                    }
                    new C2340a(0, new h(string, suggestActivity, oVar, textInputEditText)).start();
                    break;
                } else {
                    d.b(suggestActivity, suggestActivity.getString(R.string.suggest_has_up));
                    break;
                }
        }
    }
}
