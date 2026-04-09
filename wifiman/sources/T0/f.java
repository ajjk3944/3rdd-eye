package T0;

import L0.C3171a;
import L0.InterfaceC3186p;
import L0.InterfaceC3188s;
import L0.U;
import Q0.AbstractC3434k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class f {
    public static final InterfaceC3186p a(InterfaceC3188s interfaceC3188s, int i10, boolean z10, long j10) {
        AbstractC6492s.g(interfaceC3188s, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C3171a((d) interfaceC3188s, i10, z10, j10, null);
    }

    public static final InterfaceC3186p b(String str, U u10, List list, List list2, int i10, boolean z10, long j10, Y0.d dVar, AbstractC3434k.b bVar) {
        return new C3171a(new d(str, u10, list, list2, bVar, dVar), i10, z10, j10, null);
    }
}
