package A;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import org.snmp4j.mp.MPv3;
import r.H;

/* loaded from: classes.dex */
public final class d implements InterfaceC2396c {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3545n0 f81a = AbstractC3528f1.a(MPv3.MAX_MESSAGE_ID);

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3545n0 f82b = AbstractC3528f1.a(MPv3.MAX_MESSAGE_ID);

    @Override // A.InterfaceC2396c
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, H h10, H h11, H h12) {
        return (h10 == null && h11 == null && h12 == null) ? eVar : eVar.b0(new LazyLayoutAnimateItemElement(h10, h11, h12));
    }

    public final void d(int i10, int i11) {
        this.f81a.l(i10);
        this.f82b.l(i11);
    }
}
