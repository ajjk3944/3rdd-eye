package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ia0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ia0(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj2;
                Dialog dialog = (Dialog) obj;
                int[] iArr = MainActivity.d0;
                i30.m(mainActivity, "c");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName()));
                try {
                    intent.addFlags(268435456);
                    mainActivity.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                }
                SharedPreferences.Editor editorEdit = mainActivity.C().edit();
                editorEdit.putBoolean("ratedialog", false);
                editorEdit.apply();
                editorEdit.apply();
                dialog.dismiss();
                return;
            case 1:
                ((wk0) ((c10) obj2).k).g((zk0) obj);
                return;
            case 2:
                ((wk0) ((c10) obj2).k).g((ol0) obj);
                return;
            default:
                RouterAdminActivity routerAdminActivity = (RouterAdminActivity) obj;
                int i2 = RouterAdminActivity.F;
                TextInputEditText textInputEditText = (TextInputEditText) ((p21) obj2).i;
                String strValueOf = String.valueOf(textInputEditText.getText());
                if (!sy0.y(strValueOf, "http://", false) && !sy0.y(strValueOf, "https://", false)) {
                    strValueOf = "http://".concat(strValueOf);
                }
                RouterAdminActivity.y(textInputEditText);
                mc2 mc2Var = routerAdminActivity.C;
                if (mc2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                ((WebView) mc2Var.j).loadUrl(strValueOf);
                try {
                    mc2 mc2Var2 = routerAdminActivity.C;
                    if (mc2Var2 != null) {
                        ((RelativeLayout) mc2Var2.g).setVisibility(0);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
