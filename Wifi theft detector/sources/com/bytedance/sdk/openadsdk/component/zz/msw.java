package com.bytedance.sdk.openadsdk.component.zz;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class msw {
    private static boolean emc;
    private static Drawable ypw;
    private TextView dg;
    private aa xq;

    public static Drawable xq() {
        return ypw;
    }

    public void emc(xq xqVar, rie rieVar, float f10, float f11, boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (xqVar != null) {
            this.xq = xqVar.getHostAppIcon();
            this.dg = xqVar.getHostAppName();
            View userInfo = xqVar.getUserInfo();
            if (xqVar instanceof dg) {
                aa aaVar = this.xq;
                if (aaVar != null && (layoutParams2 = aaVar.getLayoutParams()) != null) {
                    if (rieVar.ono() == 1) {
                        int iYpw = vw.ypw(this.xq.getContext(), 40.0f);
                        layoutParams2.width = iYpw;
                        layoutParams2.height = iYpw;
                    } else {
                        int iYpw2 = vw.ypw(this.xq.getContext(), 30.0f);
                        layoutParams2.width = iYpw2;
                        layoutParams2.height = iYpw2;
                    }
                    this.xq.setLayoutParams(layoutParams2);
                }
                if (this.dg != null) {
                    if (rieVar.ono() == 1) {
                        this.dg.setTextSize(30.0f);
                    } else {
                        this.dg.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (rieVar.ono() == 1) {
                        layoutParams.height = vw.ypw(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = vw.ypw(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.zz.msw.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void ypw() {
        if (emc) {
            return;
        }
        try {
            int iZz = zz.ypw().zz();
            if (iZz != 0) {
                ypw = com.bytedance.sdk.openadsdk.core.aa.emc().getResources().getDrawable(iZz);
            }
            emc = true;
        } catch (Throwable unused) {
            emc = true;
        }
    }

    public void emc() {
        String strMsw = zz.ypw().msw();
        if (TextUtils.isEmpty(strMsw)) {
            this.dg.setVisibility(8);
        } else {
            this.dg.setText(strMsw);
        }
        ypw();
        try {
            Drawable drawable = ypw;
            if (drawable == null) {
                this.xq.setVisibility(8);
                return;
            }
            this.xq.setImageDrawable(drawable);
            if (this.dg.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.xq.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.xq.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.xq.setVisibility(8);
        }
    }
}
