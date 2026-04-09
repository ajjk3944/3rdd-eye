package Y2;

import A2.C0117e;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2834o;

/* renamed from: Y2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209k {

    /* renamed from: a, reason: collision with root package name */
    public final U0.j f4342a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f4344c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f4345d = new AtomicReference();

    public C0209k(U0.j jVar, Executor executor) {
        this.f4342a = jVar;
        this.f4343b = executor;
    }

    public final void a() {
        C0210l c0210l = (C0210l) this.f4344c.get();
        if (c0210l == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        C0201c c0201c = (C0201c) this.f4342a.a();
        c0201c.getClass();
        C0200b c0200b = c0201c.f4310a;
        M mB = M.b(new U0.j(20, (A0.e) c0200b.f4304c));
        A0.e eVar = new A0.e(20, c0210l);
        C0117e c0117e = new C0117e(22, false);
        A0.e eVar2 = (A0.e) c0200b.f4304c;
        M m6 = (M) c0200b.f4308g;
        C0203e c0203e = (C0203e) c0200b.i;
        M m7 = (M) c0200b.f4305d;
        M mB2 = M.b(new C2834o(eVar2, (M) c0200b.f4306e, mB, m7, eVar, new V2.h(mB, 13, new C2834o(eVar2, mB, m6, c0203e, c0117e, m7, 6)), 5));
        if (((M) c0117e.f245b) != null) {
            throw new IllegalStateException();
        }
        c0117e.f245b = mB2;
        C0207i c0207i = (C0207i) c0117e.a();
        c0207i.f4339l = true;
        z.f4385a.post(new A1.d(this, c0207i, 18, false));
    }
}
