package s2;

import ar.n;
import java.util.Arrays;
import lq.b0;
import n0.p;
import vc.e;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21850a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21851d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object[] f21852g;

    public a(String str, String str2, Object[] objArr) {
        this.f21850a = str;
        this.f21851d = str2;
        this.f21852g = objArr;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws Exception {
        p pVar = (p) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            e.y(this.f21850a, this.f21851d, pVar, Arrays.copyOf(this.f21852g, 0));
        } else {
            pVar.N();
        }
        return b0.f15562a;
    }
}
