package com.github.appintro.internal;

import android.content.Context;
import kotlin.jvm.internal.l;

/* compiled from: LayoutUtil.kt */
/* loaded from: classes.dex */
public final class LayoutUtil {
    public static final LayoutUtil INSTANCE = new LayoutUtil();

    private LayoutUtil() {
    }

    public static final boolean isRtl(Context ctx) {
        l.f(ctx, "ctx");
        return ctx.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
