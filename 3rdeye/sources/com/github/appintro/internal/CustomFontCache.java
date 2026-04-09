package com.github.appintro.internal;

import B0.g;
import android.content.Context;
import android.graphics.Typeface;
import b9.C1992A;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* compiled from: CustomFontCache.kt */
/* loaded from: classes.dex */
public final class CustomFontCache {
    public static final CustomFontCache INSTANCE = new CustomFontCache();
    private static final String TAG = LogHelper.INSTANCE.makeLogTag(x.a(CustomFontCache.class));
    private static final HashMap<String, Typeface> cache = new HashMap<>();

    private CustomFontCache() {
    }

    public final void getFont(Context ctx, String str, g.e fontCallback) {
        l.f(ctx, "ctx");
        l.f(fontCallback, "fontCallback");
        C1992A c1992a = null;
        if (str == null || str.length() == 0) {
            LogHelper.w$default(TAG, "Empty typeface path provided!", null, 4, null);
            return;
        }
        HashMap<String, Typeface> map = cache;
        Typeface typeface = map.get(str);
        if (typeface != null) {
            fontCallback.lambda$callbackSuccessAsync$0(typeface);
            c1992a = C1992A.f18074a;
        }
        if (c1992a == null) {
            Typeface newTypeface = Typeface.createFromAsset(ctx.getAssets(), str);
            l.e(newTypeface, "newTypeface");
            map.put(str, newTypeface);
            fontCallback.lambda$callbackSuccessAsync$0(newTypeface);
        }
    }
}
