package m4;

import m4.a;
import m4.b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21984a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.C0112a f21985b;

    /* renamed from: c, reason: collision with root package name */
    public static final b.a f21986c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f21987d;

    static {
        boolean z6;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f21984a = z6;
        if (z6) {
            f21985b = a.f21978b;
            f21986c = b.f21980b;
            f21987d = d.f21982b;
        } else {
            f21985b = null;
            f21986c = null;
            f21987d = null;
        }
    }
}
