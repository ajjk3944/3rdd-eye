package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21719a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21720b;

    public x1(Map map, com.applovin.impl.sdk.k kVar) {
        this.f21719a = map == null ? Collections.EMPTY_MAP : map;
        this.f21720b = kVar;
    }

    public Drawable a() {
        Object obj = this.f21719a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.f21720b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21720b.O().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.k.o().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f21720b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21720b.O().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f21719a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
