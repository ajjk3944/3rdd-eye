package i2;

import android.content.Context;
import r2.C5519d;
import r2.C5520e;

/* compiled from: L.java */
/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4444d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4441a f38338a = EnumC4441a.AUTOMATIC;

    /* renamed from: b, reason: collision with root package name */
    public static volatile C5520e f38339b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C5519d f38340c;

    public static C5519d a(Context context) {
        C5519d c5519d;
        Context applicationContext = context.getApplicationContext();
        C5519d c5519d2 = f38340c;
        if (c5519d2 != null) {
            return c5519d2;
        }
        synchronized (C5519d.class) {
            try {
                c5519d = f38340c;
                if (c5519d == null) {
                    c5519d = new C5519d(new T1.t(applicationContext));
                    f38340c = c5519d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5519d;
    }
}
