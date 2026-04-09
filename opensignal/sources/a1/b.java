package a1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import ar.p;
import lq.b0;

/* loaded from: classes.dex */
public final class b extends br.n implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f9d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i10) {
        super(4);
        this.f9d = cVar;
        this.f10g = i10;
    }

    @Override // ar.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f9d;
        b9.c cVar2 = cVar.f11a;
        ((AutofillManager) cVar2.f2478d).notifyViewEntered(cVar.f13c, this.f10g, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return b0.f15562a;
    }
}
