package Be;

import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;

/* renamed from: Be.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2482q {
    public static final androidx.compose.ui.e b(androidx.compose.ui.e verticalFadeScrollIndicator, final androidx.compose.foundation.o scrollState, final long j10, final float f10, final boolean z10, final boolean z11) {
        AbstractC6492s.i(verticalFadeScrollIndicator, "$this$verticalFadeScrollIndicator");
        AbstractC6492s.i(scrollState, "scrollState");
        return androidx.compose.ui.draw.b.d(verticalFadeScrollIndicator, new InterfaceC6835l() { // from class: Be.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC2482q.d(z10, scrollState, f10, j10, z11, (InterfaceC7036c) obj);
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, androidx.compose.foundation.o oVar, long j10, float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Y0.h.j(60);
        }
        return b(eVar, oVar, j10, f10, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(boolean z10, androidx.compose.foundation.o oVar, float f10, long j10, boolean z11, InterfaceC7036c drawWithContent) {
        AbstractC6492s.i(drawWithContent, "$this$drawWithContent");
        drawWithContent.X1();
        if (z10 && oVar.m() != 0) {
            long jA = AbstractC6538n.a(C6537m.i(drawWithContent.c()), Math.min(drawWithContent.getDensity() * f10, oVar.m()));
            InterfaceC7039f.l0(drawWithContent, AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(j10), C6733v0.g(C6733v0.f52951b.d())), 0.0f, C6537m.g(jA), 0, 8, null), AbstractC6532h.a(0.0f, 0.0f), jA, 0.0f, null, null, 0, 120, null);
        }
        if (z11 && oVar.m() != oVar.l()) {
            float fMin = Math.min(drawWithContent.getDensity() * f10, oVar.l() - oVar.m());
            InterfaceC7039f.l0(drawWithContent, AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.f52951b.d()), C6733v0.g(j10)), C6537m.g(drawWithContent.c()) - fMin, C6537m.g(drawWithContent.c()), 0, 8, null), AbstractC6532h.a(0.0f, C6537m.g(drawWithContent.c()) - fMin), 0L, 0.0f, null, null, 0, 124, null);
        }
        return Yg.J.f24997a;
    }
}
