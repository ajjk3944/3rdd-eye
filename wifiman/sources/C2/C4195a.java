package c2;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import androidx.lifecycle.S;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4195a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4195a f33733a = new C4195a();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f33734b = AbstractC3561w.d(null, C1173a.f33736a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f33735c = 0;

    /* renamed from: c2.a$a, reason: collision with other inner class name */
    static final class C1173a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1173a f33736a = new C1173a();

        C1173a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return null;
        }
    }

    private C4195a() {
    }

    public final S a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.e(-584162872);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        S sA = (S) interfaceC3540l.t(f33734b);
        if (sA == null) {
            sA = AbstractC4196b.a(interfaceC3540l, 0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return sA;
    }

    public final I0 b(S viewModelStoreOwner) {
        AbstractC6492s.i(viewModelStoreOwner, "viewModelStoreOwner");
        return f33734b.d(viewModelStoreOwner);
    }
}
