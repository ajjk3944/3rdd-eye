package N;

import T.AbstractC3561w;
import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: N.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3313c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f14374a;

    /* renamed from: b, reason: collision with root package name */
    private static final T.H0 f14375b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f14376c;

    /* renamed from: N.c0$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14377a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        T.H0 h0F = AbstractC3561w.f(a.f14377a);
        f14374a = h0F;
        f14375b = h0F;
        float f10 = 48;
        f14376c = Y0.i.b(Y0.h.j(f10), Y0.h.j(f10));
    }

    public static final T.H0 b() {
        return f14374a;
    }

    public static final T.H0 c() {
        return f14375b;
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return eVar.b0(MinimumInteractiveModifier.f28565a);
    }
}
