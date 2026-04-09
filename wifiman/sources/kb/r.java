package kb;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private p f51387a;

    private final void f(ByteBuffer byteBuffer) {
        p pVarC = this.f51387a;
        if (pVarC == null) {
            pVarC = c();
        }
        try {
            pVarC.a(byteBuffer);
            e(pVarC);
            if (!pVarC.d()) {
                this.f51387a = pVarC;
                return;
            }
            this.f51387a = null;
            d(pVarC);
            if (byteBuffer.remaining() > 0) {
                f(byteBuffer);
            }
        } catch (Exception e10) {
            Sj.a.f20830a.p(e10, "Failed to append data", new Object[0]);
        }
    }

    public final void a(ByteBuffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        if (buffer.remaining() > 0) {
            f(buffer);
        }
    }

    protected abstract p c();

    protected abstract void d(p pVar);

    protected void e(p response) {
        AbstractC6492s.i(response, "response");
    }
}
