package gv;

import android.content.Context;
import br.l;
import br.n;
import g4.j;
import lq.b0;
import mp.e;
import n0.p;
import n0.w;
import pp.d;
import sp.c;
import uv.b;
import wo.g;
import y1.b1;
import z0.h;
import z0.k;
import z0.m;

/* loaded from: classes.dex */
public final class a extends n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9669d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj) {
        super(2);
        this.f9669d = i10;
        this.f9670g = obj;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f9669d) {
            case 0:
                l.e((b) obj, "$this$single");
                l.e((rv.a) obj2, "it");
                return (Context) this.f9670g;
            case 1:
                g gVar = (g) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                l.e(gVar, "answer");
                ((e) this.f9670g).g0().i(gVar, zBooleanValue);
                return b0.f15562a;
            case 2:
                g gVar2 = (g) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                l.e(gVar2, "answer");
                ((d) this.f9670g).g0().i(gVar2, zBooleanValue2);
                return b0.f15562a;
            case 3:
                g gVar3 = (g) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                l.e(gVar3, "answer");
                ((c) this.f9670g).g0().i(gVar3, zBooleanValue3);
                return b0.f15562a;
            case 4:
                g gVar4 = (g) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                l.e(gVar4, "answer");
                ((vp.c) this.f9670g).g0().i(gVar4, zBooleanValue4);
                return b0.f15562a;
            case j.STRING_FIELD_NUMBER /* 5 */:
                g gVar5 = (g) obj;
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                l.e(gVar5, "answer");
                ((xp.d) this.f9670g).g0().i(gVar5, zBooleanValue5);
                return b0.f15562a;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                p pVar = (p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((y1.a) this.f9670g).a(0, pVar);
                } else {
                    pVar.N();
                }
                return b0.f15562a;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                ((b1) this.f9670g).a(w.m(1), (p) obj);
                return b0.f15562a;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                m mVar = (m) obj;
                k kVar = (k) obj2;
                if (!(kVar instanceof h)) {
                    return mVar.c(kVar);
                }
                br.b0.c(3, null);
                throw null;
            default:
                g gVar6 = (g) obj;
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                l.e(gVar6, "answer");
                ((zo.d) this.f9670g).g0().i(gVar6, zBooleanValue6);
                return b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b1 b1Var, int i10) {
        super(2);
        this.f9669d = 7;
        this.f9670g = b1Var;
    }
}
