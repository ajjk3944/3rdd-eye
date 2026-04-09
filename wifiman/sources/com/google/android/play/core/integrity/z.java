package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC5031g;

/* loaded from: classes3.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f38112a;

    static synchronized s a(Context context) {
        try {
            if (f38112a == null) {
                q qVar = new q(null);
                qVar.a(AbstractC5031g.a(context));
                f38112a = qVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38112a;
    }
}
