package M0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import mh.InterfaceC6839p;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3250f {

    /* renamed from: a, reason: collision with root package name */
    public static final C3250f f12389a = new C3250f();

    private C3250f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(InterfaceC6839p interfaceC6839p, RectF rectF, RectF rectF2) {
        return ((Boolean) interfaceC6839p.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(f0 f0Var, RectF rectF, int i10, final InterfaceC6839p interfaceC6839p) {
        SegmentFinder segmentFinderA;
        if (i10 == 1) {
            segmentFinderA = N0.a.f14868a.a(new N0.j(f0Var.G(), f0Var.I()));
        } else {
            AbstractC3246b.a();
            segmentFinderA = AbstractC3247c.a(AbstractC3245a.a(f0Var.G(), f0Var.H()));
        }
        return f0Var.i().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: M0.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C3250f.b(interfaceC6839p, rectF2, rectF3);
            }
        });
    }
}
