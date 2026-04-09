package Y2;

import android.app.Application;

/* renamed from: Y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203e implements N {

    /* renamed from: a, reason: collision with root package name */
    public final A0.e f4318a;

    /* renamed from: b, reason: collision with root package name */
    public final O f4319b;

    /* renamed from: c, reason: collision with root package name */
    public final O f4320c;

    public C0203e(A0.e eVar, M m6, M m7) {
        this.f4318a = eVar;
        this.f4319b = m6;
        this.f4320c = m7;
    }

    @Override // Y2.O
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c1.g a() {
        Application application = (Application) this.f4318a.f73b;
        C0204f c0204f = (C0204f) this.f4319b.a();
        T t6 = (T) this.f4320c.a();
        y yVar = z.f4386b;
        A.c(yVar);
        return new c1.g(application, c0204f, t6, yVar, 10);
    }
}
