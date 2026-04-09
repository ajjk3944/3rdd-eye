package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class dg {

    public static class emc implements View.OnLayoutChangeListener {
        private final Drawable emc;
        private int xq;
        private int ypw;

        public emc(Drawable drawable) {
            this.emc = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.ypw && i19 == this.xq) {
                return;
            }
            this.ypw = i18;
            this.xq = i19;
            this.emc.setBounds(0, 0, i18, i19);
        }
    }

    public static void emc(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (viewGroup == null || rieVar == null || TextUtils.isEmpty(rieVar.dr())) {
            return;
        }
        try {
            int i10 = vk.kx;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableEmc = emc(viewGroup.getResources(), rieVar);
            if (drawableEmc == null) {
                return;
            }
            viewGroup.setForeground(drawableEmc);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("add overlay fail", th.getMessage());
        }
    }

    public static void emc(Activity activity, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (activity == null || rieVar == null || TextUtils.isEmpty(rieVar.dr())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = vk.kx;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableEmc = emc(activity.getResources(), rieVar);
            if (drawableEmc == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableEmc);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable emc(Resources resources, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        try {
            String strDr = rieVar.dr();
            if (TextUtils.isEmpty(strDr)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strDr, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
