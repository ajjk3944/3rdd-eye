package ef;

import bf.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final d f8183c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final s f8184a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8185b = new AtomicReference(null);

    public a(s sVar) {
        this.f8184a = sVar;
        sVar.a(new bf.a(16, this));
    }

    public final d a(String str) {
        a aVar = (a) this.f8185b.get();
        return aVar == null ? f8183c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f8185b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f8185b.get();
        return aVar != null && aVar.c(str);
    }
}
