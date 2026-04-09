package k0;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public interface g extends e {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f51012a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean d(g gVar, KeyEvent keyEvent, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            interfaceC6824a = a.f51012a;
        }
        return gVar.h(keyEvent, interfaceC6824a);
    }

    void a(FocusTargetNode focusTargetNode);

    androidx.compose.ui.e b();

    boolean e(boolean z10, boolean z11, boolean z12, int i10);

    l f();

    q g();

    boolean h(KeyEvent keyEvent, InterfaceC6824a interfaceC6824a);

    C6533i i();

    void j(InterfaceC6354b interfaceC6354b);

    boolean l(A0.b bVar);

    boolean m(KeyEvent keyEvent);

    void n();

    void o(h hVar);

    Boolean p(int i10, C6533i c6533i, InterfaceC6835l interfaceC6835l);

    boolean q(androidx.compose.ui.focus.d dVar, C6533i c6533i);
}
