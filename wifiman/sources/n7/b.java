package N7;

import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15414a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5912b f15415b;

    public static final class a implements InterfaceC5915e {
        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                System.loadLibrary("teleport-go");
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.l();
        AbstractC6492s.h(abstractC5912bL, "complete {\n        Syste…E)\n    }\n        .cache()");
        f15415b = abstractC5912bL;
    }

    private b() {
    }

    public final AbstractC5912b a() {
        return f15415b;
    }
}
