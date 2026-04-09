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
        public void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
            int i12 = i6 - i;
            int i13 = i7 - i3;
            if (i12 == this.ypw && i13 == this.xq) {
                return;
            }
            this.ypw = i12;
            this.xq = i13;
            this.emc.setBounds(0, 0, i12, i13);
        }
    }

    public static void emc(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (viewGroup == null || rieVar == null || TextUtils.isEmpty(rieVar.dr())) {
            return;
        }
        try {
            int i = vk.kx;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
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
            int i = vk.kx;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable drawableEmc = emc(activity.getResources(), rieVar);
            if (drawableEmc == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableEmc);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("add overlay fail", th.getMessage());
        }
    }

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
