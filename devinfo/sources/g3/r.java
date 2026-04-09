package g3;

import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.z3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f24528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i4) {
        super(1);
        this.f24527a = i4;
        this.f24528b = sVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f24527a) {
            case 0:
                n1.a aVar = (n1.a) obj;
                s sVar = this.f24528b;
                View viewB = k.b(sVar);
                if (!viewB.isFocused() && !viewB.hasFocus()) {
                    n1.h focusOwner = ((j2.r) i2.k.t(sVar)).getFocusOwner();
                    View viewU = i2.k.u(sVar);
                    Integer numC = n1.d.c(aVar.f29508a);
                    int[] iArr = new int[2];
                    viewU.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewB.getLocationOnScreen(iArr2);
                    n1.s sVarE = z3.e((n1.s) ((xz) focusOwner).f18586c);
                    Rect rect = null;
                    o1.c cVarH = sVarE != null ? z3.h(sVarE) : null;
                    if (cVarH != null) {
                        int i4 = (int) cVarH.f30366a;
                        int i10 = iArr[0];
                        int i11 = iArr2[0];
                        int i12 = (int) cVarH.f30367b;
                        int i13 = iArr[1];
                        int i14 = iArr2[1];
                        rect = new Rect((i4 + i10) - i11, (i12 + i13) - i14, (((int) cVarH.f30368c) + i10) - i11, (((int) cVarH.f30369d) + i13) - i14);
                    }
                    if (!n1.d.b(viewB, numC, rect)) {
                        aVar.f29509b = true;
                    }
                }
                break;
            default:
                k.b(this.f24528b);
                break;
        }
        return yj.u.f37649a;
    }
}
