package com.google.android.gms.oss.licenses;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
final class m implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OssLicensesMenuActivity f36950a;

    m(OssLicensesMenuActivity ossLicensesMenuActivity) {
        this.f36950a = ossLicensesMenuActivity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String packageName = this.f36950a.getPackageName();
        if (this.f36950a.isDestroyed() || this.f36950a.isFinishing()) {
            return;
        }
        if (task.isSuccessful()) {
            packageName = (String) task.getResult();
        }
        OssLicensesMenuActivity ossLicensesMenuActivity = this.f36950a;
        ossLicensesMenuActivity.f36930G = b.a(ossLicensesMenuActivity, packageName);
        OssLicensesMenuActivity ossLicensesMenuActivity2 = this.f36950a;
        LayoutInflater layoutInflater = ossLicensesMenuActivity2.getLayoutInflater();
        a aVar = this.f36950a.f36930G;
        Resources resources = aVar.f36933a;
        ossLicensesMenuActivity2.setContentView(layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license_menu_activity", "layout", aVar.f36934b)), (ViewGroup) null, false));
        OssLicensesMenuActivity ossLicensesMenuActivity3 = this.f36950a;
        a aVar2 = ossLicensesMenuActivity3.f36930G;
        ossLicensesMenuActivity3.f36927D = (ListView) ossLicensesMenuActivity3.findViewById(aVar2.f36933a.getIdentifier("license_list", "id", aVar2.f36934b));
        OssLicensesMenuActivity ossLicensesMenuActivity4 = this.f36950a;
        OssLicensesMenuActivity ossLicensesMenuActivity5 = this.f36950a;
        ossLicensesMenuActivity4.f36928E = new n(ossLicensesMenuActivity5, ossLicensesMenuActivity5);
        OssLicensesMenuActivity ossLicensesMenuActivity6 = this.f36950a;
        ossLicensesMenuActivity6.f36927D.setAdapter((ListAdapter) ossLicensesMenuActivity6.f36928E);
        this.f36950a.f36927D.setOnItemClickListener(new l(this));
    }
}
