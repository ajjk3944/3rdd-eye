package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GA {

    /* renamed from: c, reason: collision with root package name */
    public static final YD f8327c = new YD("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f8328d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C0447Bq f8329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8330b;

    public GA(Context context) {
        if (KA.a(context)) {
            this.f8329a = new C0447Bq(context.getApplicationContext(), f8327c, f8328d);
        } else {
            this.f8329a = null;
        }
        this.f8330b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(h2.d dVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f8327c.f(str, new Object[0]);
        byte b5 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b5 == 3) {
            dVar.q(new CA(8160, 0, null));
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((b5 & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a(DA da, h2.d dVar, int i) {
        C0447Bq c0447Bq = this.f8329a;
        if (c0447Bq == null) {
            f8327c.f("error: %s", "Play Store not found.");
        } else if (c(dVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(da.f7731a, da.f7732b))) {
            c0447Bq.b(new JA(c0447Bq, new RunnableC2241zg(this, da, i, dVar), 0));
        }
    }
}
