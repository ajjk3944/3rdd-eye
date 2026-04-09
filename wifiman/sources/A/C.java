package A;

import C0.D;
import Ii.O;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import Zg.U;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import dh.C5385j;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final float f48a = Y0.h.j(1);

    /* renamed from: b, reason: collision with root package name */
    private static final s f49b = new s(null, 0, false, 0.0f, new a(), 0.0f, false, O.a(C5385j.f46088a), Y0.f.b(1.0f, 0.0f, 2, null), Y0.c.b(0, 0, 0, 0, 15, null), AbstractC3689v.l(), 0, 0, 0, false, w.q.Vertical, 0, 0, null);

    public static final class a implements D {

        /* renamed from: a, reason: collision with root package name */
        private final int f50a;

        /* renamed from: b, reason: collision with root package name */
        private final int f51b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f52c = U.h();

        a() {
        }

        @Override // C0.D
        public int getHeight() {
            return this.f51b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f50a;
        }

        @Override // C0.D
        public Map p() {
            return this.f52c;
        }

        @Override // C0.D
        public void q() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f53a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11) {
            super(0);
            this.f53a = i10;
            this.f54b = i11;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B invoke() {
            return new B(this.f53a, this.f54b);
        }
    }

    public static final B c(int i10, int i11, InterfaceC3540l interfaceC3540l, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kA = B.f1y.a();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && interfaceC3540l.i(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && interfaceC3540l.i(i11)) || (i12 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new b(i10, i11);
            interfaceC3540l.K(objF);
        }
        B b10 = (B) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return b10;
    }
}
