package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC5031g;

/* loaded from: classes3.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f38028a;

    static synchronized aw a(Context context) {
        try {
            if (f38028a == null) {
                u uVar = new u(null);
                uVar.a(AbstractC5031g.a(context));
                f38028a = uVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38028a;
    }
}
