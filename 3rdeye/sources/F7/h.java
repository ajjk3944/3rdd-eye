package F7;

import H6.C0673j;
import K6.C0751q;
import K6.D0;
import K6.E0;
import O6.C;
import O6.w;
import b9.C1992A;
import c9.C2097r;
import j6.C5195A;
import java.util.List;
import java.util.Set;
import o6.C5425b;
import p9.InterfaceC5480a;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1692h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i) {
        super(1);
        this.f1691g = i;
        this.f1692h = obj;
    }

    /* JADX WARN: Type inference failed for: r9v20, types: [R9.i, T, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f1691g) {
            case 0:
                H7.d readStateFor = (H7.d) it;
                kotlin.jvm.internal.l.f(readStateFor, "$this$readStateFor");
                break;
            case 1:
                C0673j compositeLogId = (C0673j) it;
                kotlin.jvm.internal.l.f(compositeLogId, "compositeLogId");
                break;
            case 2:
                kotlin.jvm.internal.l.f(it, "it");
                ((C0751q) this.f1692h).invoke();
                break;
            case 3:
                Exception it2 = (Exception) it;
                kotlin.jvm.internal.l.f(it2, "it");
                ((D0) this.f1692h).invoke(it2, E0.f3211g);
                break;
            case 4:
                String hint = (String) it;
                kotlin.jvm.internal.l.f(hint, "hint");
                ((w) this.f1692h).setHint(hint);
                break;
            case 5:
                ((C) this.f1692h).getDivider().setVisibility(((Boolean) it).booleanValue() ? 0 : 8);
                break;
            case 6:
                ?? it3 = (R9.i) it;
                kotlin.jvm.internal.l.f(it3, "it");
                ((kotlin.jvm.internal.w) this.f1692h).f43660b = it3;
                break;
            case 7:
                ((A4.a) this.f1692h).cancel(false);
                break;
            default:
                Z6.d v10 = (Z6.d) it;
                kotlin.jvm.internal.l.f(v10, "v");
                C5425b c5425b = (C5425b) this.f1692h;
                Set set = (Set) c5425b.i.get(v10.a());
                List<String> listG0 = set != null ? C2097r.G0(set) : null;
                if (listG0 != null) {
                    for (String str : listG0) {
                        c5425b.f44854h.remove(str);
                        C5195A c5195a = (C5195A) c5425b.f44855j.get(str);
                        if (c5195a != null) {
                            C5195A.a aVar = new C5195A.a();
                            while (aVar.hasNext()) {
                                ((InterfaceC5480a) aVar.next()).invoke();
                            }
                        }
                    }
                }
                break;
        }
        return C1992A.f18074a;
    }
}
