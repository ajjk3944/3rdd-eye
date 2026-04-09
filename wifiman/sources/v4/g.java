package v4;

import java.util.concurrent.atomic.AtomicReference;
import y4.b;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f63436b = new g();

    /* renamed from: c, reason: collision with root package name */
    private static final b f63437c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f63438a = new AtomicReference();

    private static class b implements y4.b {
        private b() {
        }

        @Override // y4.b
        public b.a a(y4.c cVar, String str, String str2) {
            return f.f63434a;
        }
    }

    public static g b() {
        return f63436b;
    }

    public y4.b a() {
        y4.b bVar = (y4.b) this.f63438a.get();
        return bVar == null ? f63437c : bVar;
    }
}
