package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s21 {

    /* renamed from: c, reason: collision with root package name */
    public static final ka1 f15845c = new ka1("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f15846d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final xi0 f15847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15848b;

    public s21(Context context) {
        if (w21.a(context)) {
            this.f15847a = new xi0(context.getApplicationContext(), f15845c, f15846d);
        } else {
            this.f15847a = null;
        }
        this.f15848b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(km.y yVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f15845c.d(str, new Object[0]);
        byte b10 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b10 == 3) {
            yVar.D(new o21(8160, 0, null));
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final void a(p21 p21Var, km.y yVar, int i4) {
        xi0 xi0Var = this.f15847a;
        if (xi0Var == null) {
            f15845c.d("error: %s", "Play Store not found.");
        } else if (c(yVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(p21Var.f14867a, p21Var.f14868b))) {
            xi0Var.i(new v21(xi0Var, new ry(this, p21Var, i4, yVar), 0));
        }
    }
}
