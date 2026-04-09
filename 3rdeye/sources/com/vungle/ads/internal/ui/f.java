package com.vungle.ads.internal.ui;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.jvm.internal.l;

/* compiled from: WatermarkView.kt */
/* loaded from: classes2.dex */
public class f extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String watermark) {
        super(context);
        l.f(context, "context");
        l.f(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        l.e(overlayBytes, "overlayBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
