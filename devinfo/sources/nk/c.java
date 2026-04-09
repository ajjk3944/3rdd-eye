package nk;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c implements tk.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient tk.a f29971a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29972b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f29973c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29974d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29975e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29976f;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f29972b = obj;
        this.f29973c = cls;
        this.f29974d = str;
        this.f29975e = str2;
        this.f29976f = z3;
    }

    public abstract tk.a c();

    public final d d() {
        boolean z3 = this.f29976f;
        Class cls = this.f29973c;
        if (!z3) {
            return v.a(cls);
        }
        v.f29987a.getClass();
        return new n(cls);
    }
}
