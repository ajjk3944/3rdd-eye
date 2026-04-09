package q5;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class b implements w5.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient w5.a f23282a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23283b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f23284c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23285d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23286e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23287f;

    public b(Object obj, Class cls, String str, String str2, boolean z6) {
        this.f23283b = obj;
        this.f23284c = cls;
        this.f23285d = str;
        this.f23286e = str2;
        this.f23287f = z6;
    }

    public final c a() {
        boolean z6 = this.f23287f;
        Class cls = this.f23284c;
        if (!z6) {
            return p.a(cls);
        }
        p.f23300a.getClass();
        return new k(cls);
    }
}
