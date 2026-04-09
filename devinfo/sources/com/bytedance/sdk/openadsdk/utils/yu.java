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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements View.OnLayoutChangeListener {

        /* renamed from: lh, reason: collision with root package name */
        private int f8743lh;
        private final Drawable ouw;
        private int vt;

        public ouw(Drawable drawable) {
            this.ouw = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i4;
            int i18 = i12 - i10;
            if (i17 == this.vt && i18 == this.f8743lh) {
                return;
            }
            this.vt = i17;
            this.f8743lh = i18;
            this.ouw.setBounds(0, 0, i17, i18);
        }
    }

    public static void ouw(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.pev)) {
            return;
        }
        try {
            int i4 = rn.lht;
            if (viewGroup.getTag(i4) != null) {
                return;
            }
            viewGroup.setTag(i4, Integer.valueOf(i4));
            Drawable drawableOuw = ouw(viewGroup.getResources(), vppVar);
            if (drawableOuw == null) {
                return;
            }
            viewGroup.setForeground(drawableOuw);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("add overlay fail", th2.getMessage());
        }
    }

    public static void ouw(Activity activity, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (activity == null || vppVar == null || TextUtils.isEmpty(vppVar.pev)) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i4 = rn.lht;
            if (decorView.getTag(i4) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i4, Integer.valueOf(i4));
            Drawable drawableOuw = ouw(activity.getResources(), vppVar);
            if (drawableOuw == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableOuw);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("add overlay fail", th2.getMessage());
        }
    }

    private static Drawable ouw(Resources resources, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        try {
            String str = vppVar.pev;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
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
