package a6;

import android.content.Context;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static f f165b = new f();

    /* renamed from: a, reason: collision with root package name */
    public Context f166a;

    public static f c() {
        return f165b;
    }

    public Context a() {
        return this.f166a;
    }

    public void b(Context context) {
        this.f166a = context != null ? context.getApplicationContext() : null;
    }
}
