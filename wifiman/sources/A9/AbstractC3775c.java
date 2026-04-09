package a9;

import com.ui.btle.v2.f;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: a9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3775c implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private final C3773a f25770a = new C3773a();

    /* renamed from: a9.c$a */
    public static final class a implements C {
        public a() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Object objTake = AbstractC3775c.this.f25770a.d().take();
                AbstractC6492s.h(objTake, "buffer.completeFrameQueue.take()");
                interfaceC5910A.onSuccess(f.a(((f) objTake).f()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(byte[] data) {
        AbstractC6492s.i(data, "data");
        this.f25770a.a(data);
    }

    @Override // com.ui.btle.v2.f.a
    public z f() {
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }
}
