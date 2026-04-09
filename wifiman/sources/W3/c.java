package w3;

import android.content.Context;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final c f64365b = new c();

    /* renamed from: a, reason: collision with root package name */
    private b f64366a = null;

    public static b a(Context context) {
        return f64365b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f64366a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f64366a = new b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f64366a;
    }
}
