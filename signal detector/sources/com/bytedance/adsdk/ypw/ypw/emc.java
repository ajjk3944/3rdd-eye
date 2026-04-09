package com.bytedance.adsdk.ypw.ypw;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.ypw.xq;
import com.bytedance.adsdk.ypw.xq.uym;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class emc {
    private xq bw;
    private final AssetManager dg;
    private final uym<String> emc = new uym<>();
    private final Map<uym<String>, Typeface> ypw = new HashMap();
    private final Map<String, Typeface> xq = new HashMap();
    private String ycc = ".ttf";

    public emc(Drawable.Callback callback, xq xqVar) {
        this.bw = xqVar;
        if (callback instanceof View) {
            this.dg = ((View) callback).getContext().getAssets();
        } else {
            this.dg = null;
        }
    }

    private Typeface ypw(com.bytedance.adsdk.ypw.xq.xq xqVar) {
        Typeface typefaceCreateFromAsset;
        String strEmc = xqVar.emc();
        Typeface typeface = this.xq.get(strEmc);
        if (typeface != null) {
            return typeface;
        }
        String strXq = xqVar.xq();
        String strYpw = xqVar.ypw();
        xq xqVar2 = this.bw;
        if (xqVar2 != null) {
            typefaceCreateFromAsset = xqVar2.emc(strEmc, strXq, strYpw);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.bw.emc(strEmc);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        xq xqVar3 = this.bw;
        if (xqVar3 != null && typefaceCreateFromAsset == null) {
            String strYpw2 = xqVar3.ypw(strEmc, strXq, strYpw);
            if (strYpw2 == null) {
                strYpw2 = this.bw.ypw(strEmc);
            }
            if (strYpw2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.dg, strYpw2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (xqVar.dg() != null) {
            return xqVar.dg();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.dg, "fonts/" + strEmc + this.ycc);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.xq.put(strEmc, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void emc(xq xqVar) {
        this.bw = xqVar;
    }

    public void emc(String str) {
        this.ycc = str;
    }

    public Typeface emc(com.bytedance.adsdk.ypw.xq.xq xqVar) {
        this.emc.emc(xqVar.emc(), xqVar.xq());
        Typeface typeface = this.ypw.get(this.emc);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceEmc = emc(ypw(xqVar), xqVar.xq());
        this.ypw.put(this.emc, typefaceEmc);
        return typefaceEmc;
    }

    private Typeface emc(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
