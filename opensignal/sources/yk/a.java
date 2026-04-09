package yk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.utils.q;
import fj.o;
import o2.g;
import p.l2;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26407a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f26408d;

    public /* synthetic */ a(o oVar, int i10) {
        this.f26407a = i10;
        this.f26408d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26407a) {
            case 0:
                g gVar = (g) this.f26408d.f8947f;
                if (gVar != null) {
                    o oVar = ((MainActivity) gVar.f18754d).f6002c0;
                    ((RelativeLayout) oVar.f8943b).setVisibility(8);
                    ((ViewGroup) oVar.f8942a).setVisibility(8);
                    break;
                }
                break;
            default:
                l2 l2Var = (l2) this.f26408d.f8948g;
                if (l2Var != null) {
                    MainActivity mainActivity = (MainActivity) l2Var.f20100d;
                    o oVar2 = mainActivity.f6002c0;
                    ((RelativeLayout) oVar2.f8943b).setVisibility(8);
                    ((ViewGroup) oVar2.f8942a).setVisibility(8);
                    q.a(mainActivity.T).putBoolean("prefs_survey_dialog_shown", true).commit();
                    String strConcat = (String) mainActivity.f6002c0.f8946e;
                    if (!TextUtils.isEmpty(strConcat)) {
                        if (!strConcat.contains("http")) {
                            strConcat = "https://".concat(strConcat);
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strConcat));
                        PackageManager packageManager = mainActivity.T.getPackageManager();
                        if (packageManager != null && intent.resolveActivity(packageManager) != null) {
                            mainActivity.startActivity(intent);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
