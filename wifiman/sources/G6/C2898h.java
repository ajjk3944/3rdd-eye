package G6;

import G6.InterfaceC2891a;
import java.util.concurrent.ExecutorService;

/* renamed from: G6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2898h implements y2.c {

    /* renamed from: G6.h$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C2898h f7054a = new C2898h();
    }

    public static C2898h a() {
        return a.f7054a;
    }

    public static ExecutorService c() {
        return (ExecutorService) y2.e.d(InterfaceC2891a.c.g());
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExecutorService get() {
        return c();
    }
}
