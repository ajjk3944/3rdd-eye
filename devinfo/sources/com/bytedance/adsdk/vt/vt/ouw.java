package com.bytedance.adsdk.vt.vt;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.vt.le.yu;
import com.bytedance.adsdk.vt.lh;
import com.bytedance.adsdk.vt.lh.ra;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* renamed from: le, reason: collision with root package name */
    private final AssetManager f7217le;

    /* renamed from: lh, reason: collision with root package name */
    public lh f7218lh;
    public final ra<String> ouw = new ra<>();
    public final Map<ra<String>, Typeface> vt = new HashMap();
    private final Map<String, Typeface> fkw = new HashMap();
    public String yu = ".ttf";

    public ouw(Drawable.Callback callback, lh lhVar) {
        this.f7218lh = lhVar;
        if (callback instanceof View) {
            this.f7217le = ((View) callback).getContext().getAssets();
        } else {
            yu.vt("LottieDrawable must be inside of a view for images to work.");
            this.f7217le = null;
        }
    }

    public final Typeface ouw(com.bytedance.adsdk.vt.lh.lh lhVar) {
        Typeface typefaceCreateFromAsset;
        String str = lhVar.ouw;
        Typeface typeface = this.fkw.get(str);
        if (typeface != null) {
            return typeface;
        }
        if (this.f7218lh != null) {
            typefaceCreateFromAsset = lh.vt();
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = lh.ouw();
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        if (this.f7218lh != null && typefaceCreateFromAsset == null) {
            String strYu = lh.yu();
            if (strYu == null) {
                strYu = lh.lh();
            }
            if (strYu != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.f7217le, strYu);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        Typeface typeface2 = lhVar.yu;
        if (typeface2 != null) {
            return typeface2;
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f7217le, "fonts/" + str + this.yu);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.fkw.put(str, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }
}
