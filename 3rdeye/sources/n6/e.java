package N6;

import H6.C0672i;
import H6.C0683u;
import H6.I;
import N7.Ba;
import O6.C;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import java.util.ArrayList;
import z6.C5865d;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements p9.l<Boolean, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f4716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ba f4717h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f4718j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0672i f4719k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0683u f4720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C5865d f4721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4722n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C c10, Ba ba2, A7.d dVar, d dVar2, C0672i c0672i, C0683u c0683u, C5865d c5865d, ArrayList arrayList) {
        super(1);
        this.f4716g = c10;
        this.f4717h = ba2;
        this.i = dVar;
        this.f4718j = dVar2;
        this.f4719k = c0672i;
        this.f4720l = c0683u;
        this.f4721m = c5865d;
        this.f4722n = arrayList;
    }

    @Override // p9.l
    public final C1992A invoke(Boolean bool) {
        int currentItem;
        I i;
        boolean zBooleanValue = bool.booleanValue();
        C c10 = this.f4716g;
        c divTabsAdapter = c10.getDivTabsAdapter();
        if (divTabsAdapter == null || divTabsAdapter.f4687o != zBooleanValue) {
            c divTabsAdapter2 = c10.getDivTabsAdapter();
            if (divTabsAdapter2 == null || (i = divTabsAdapter2.f4697y) == null) {
                long jLongValue = this.f4717h.f4957y.a(this.i).longValue();
                long j4 = jLongValue >> 31;
                currentItem = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            } else {
                currentItem = ((y7.n) i.f2053c).getCurrentItem();
            }
            d.p(this.f4718j, this.f4719k, this.f4717h, c10, this.f4720l, this.f4721m, this.f4722n, currentItem);
        }
        return C1992A.f18074a;
    }
}
