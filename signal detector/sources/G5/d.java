package G5;

import E5.v;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import h5.C2376j;
import h5.InterfaceC2375i;
import java.util.concurrent.Executor;
import z5.AbstractC3042s;
import z5.L;

/* loaded from: classes3.dex */
public final class d extends L implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1705c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3042s f1706d;

    static {
        AbstractC3042s iVar = l.f1721c;
        int i = v.f1415a;
        if (64 >= i) {
            i = 64;
        }
        int iJ = E5.a.j(i, 12, "kotlinx.coroutines.io.parallelism");
        iVar.getClass();
        if (iJ < 1) {
            throw new IllegalArgumentException(AbstractC1135f5.l(iJ, "Expected positive parallelism level, but got ").toString());
        }
        if (iJ < k.f1716d) {
            if (iJ < 1) {
                throw new IllegalArgumentException(AbstractC1135f5.l(iJ, "Expected positive parallelism level, but got ").toString());
            }
            iVar = new E5.i(iVar, iJ);
        }
        f1706d = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // z5.AbstractC3042s
    public final void d(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        f1706d.d(interfaceC2375i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(C2376j.f20486a, runnable);
    }

    @Override // z5.AbstractC3042s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
