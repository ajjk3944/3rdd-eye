package G6;

import G6.InterfaceC2891a;
import java.util.concurrent.ExecutorService;

/* renamed from: G6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2894d implements y2.c {

    /* renamed from: G6.d$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C2894d f7050a = new C2894d();
    }

    public static C2894d a() {
        return a.f7050a;
    }

    public static ExecutorService c() {
        return (ExecutorService) y2.e.d(InterfaceC2891a.c.c());
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExecutorService get() {
        return c();
    }
}
