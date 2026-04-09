package j4;

import android.content.Context;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6248c {
    public static InterfaceC6247b a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new g(new l(context));
    }
}
