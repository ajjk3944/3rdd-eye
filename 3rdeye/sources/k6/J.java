package K6;

import N7.Ba;
import N7.Q6;
import android.view.View;
import b9.C1992A;
import c9.C2097r;
import java.util.LinkedHashSet;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3246h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i, Object obj, Object obj2) {
        super(1);
        this.f3245g = i;
        this.f3246h = obj;
        this.i = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3245g) {
            case 0:
                String id = (String) obj;
                kotlin.jvm.internal.l.f(id, "id");
                H6.I i = (H6.I) this.i;
                int iF = i.f(id);
                View view = (View) this.f3246h;
                view.setNextFocusForwardId(iF);
                view.setAccessibilityTraversalBefore(i.f(id));
                break;
            case 1:
                float fLongValue = ((Number) obj).longValue();
                O6.y yVar = (O6.y) this.f3246h;
                yVar.setMaxValue(fLongValue);
                ((Z0) this.i).o(yVar);
                break;
            case 2:
                Q6 underline = (Q6) obj;
                kotlin.jvm.internal.l.f(underline, "underline");
                ((y1) this.f3246h).getClass();
                y1.A((O6.q) this.i, underline);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                N6.c divTabsAdapter = ((O6.C) this.f3246h).getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.f48208c.setDisabledScrollPages(zBooleanValue ? new LinkedHashSet<>() : C2097r.K0(new v9.g(0, ((Ba) this.i).f4949q.size() - 1, 1)));
                }
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(O6.C c10, N6.d dVar, Ba ba2) {
        super(1);
        this.f3245g = 3;
        this.f3246h = c10;
        this.i = ba2;
    }
}
