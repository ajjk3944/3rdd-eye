package com.google.android.gms.oss.licenses;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
final class d implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OssLicensesActivity f36939a;

    d(OssLicensesActivity ossLicensesActivity) {
        this.f36939a = ossLicensesActivity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (this.f36939a.isDestroyed() || this.f36939a.isFinishing()) {
            return;
        }
        String packageName = this.f36939a.getPackageName();
        if (this.f36939a.f36923J.isSuccessful()) {
            packageName = (String) this.f36939a.f36923J.getResult();
        }
        OssLicensesActivity ossLicensesActivity = this.f36939a;
        ossLicensesActivity.f36925X = b.a(ossLicensesActivity, packageName);
        OssLicensesActivity ossLicensesActivity2 = this.f36939a;
        LayoutInflater layoutInflater = ossLicensesActivity2.getLayoutInflater();
        a aVar = this.f36939a.f36925X;
        Resources resources = aVar.f36933a;
        ossLicensesActivity2.setContentView(layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license_activity", "layout", aVar.f36934b)), (ViewGroup) null, false));
        OssLicensesActivity ossLicensesActivity3 = this.f36939a;
        a aVar2 = ossLicensesActivity3.f36925X;
        ossLicensesActivity3.f36919F = (ScrollView) ossLicensesActivity3.findViewById(aVar2.f36933a.getIdentifier("license_activity_scrollview", "id", aVar2.f36934b));
        OssLicensesActivity ossLicensesActivity4 = this.f36939a;
        a aVar3 = ossLicensesActivity4.f36925X;
        ossLicensesActivity4.f36920G = (TextView) ossLicensesActivity4.findViewById(aVar3.f36933a.getIdentifier("license_activity_textview", "id", aVar3.f36934b));
        if (this.f36939a.f36922I.isSuccessful()) {
            OssLicensesActivity ossLicensesActivity5 = this.f36939a;
            ossLicensesActivity5.f36918E = (String) ossLicensesActivity5.f36922I.getResult();
        }
        OssLicensesActivity ossLicensesActivity6 = this.f36939a;
        if (ossLicensesActivity6.f36918E == null || ossLicensesActivity6.f36918E.isEmpty()) {
            OssLicensesActivity ossLicensesActivity7 = this.f36939a;
            ossLicensesActivity7.f36918E = G3.f.a(ossLicensesActivity7, ossLicensesActivity7.f36917D, K3.c.f10273a);
        }
        OssLicensesActivity ossLicensesActivity8 = this.f36939a;
        if (ossLicensesActivity8.f36918E == null) {
            ossLicensesActivity8.f36918E = ossLicensesActivity8.getString(K3.d.f10274a);
        }
        OssLicensesActivity ossLicensesActivity9 = this.f36939a;
        ossLicensesActivity9.f36920G.setText(ossLicensesActivity9.f36918E);
        OssLicensesActivity ossLicensesActivity10 = this.f36939a;
        if (ossLicensesActivity10.f36921H == 0) {
            return;
        }
        ossLicensesActivity10.f36919F.post(new c(this));
    }
}
