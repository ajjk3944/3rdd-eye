package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2722l extends AbstractC6494u implements InterfaceC6839p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Q f5368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2722l(Q q10) {
        super(2);
        this.f5368a = q10;
    }

    public final String a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
        interfaceC3540l.U(-1451087197);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1451087197, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)");
        }
        String strResolvedString = this.f5368a.resolvedString(interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return strResolvedString;
    }

    @Override // mh.InterfaceC6839p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((InterfaceC3540l) obj, ((Number) obj2).intValue());
    }
}
