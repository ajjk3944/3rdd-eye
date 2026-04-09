package J0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f9649a = new AtomicInteger(0);

    public static final int a() {
        return f9649a.addAndGet(1);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new AppendedSemanticsElement(z10, interfaceC6835l));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(eVar, z10, interfaceC6835l);
    }
}
