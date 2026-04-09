package k6;

import android.content.Context;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static g f21871b = new g();

    /* renamed from: a, reason: collision with root package name */
    public Context f21872a;

    public static g c() {
        return f21871b;
    }

    public Context a() {
        return this.f21872a;
    }

    public void b(Context context) {
        this.f21872a = context != null ? context.getApplicationContext() : null;
    }
}
