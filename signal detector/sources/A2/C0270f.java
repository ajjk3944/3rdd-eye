package a2;

import B3.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.Q;
import q5.i;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270f extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271g f4664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f4665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f4666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0270f(AbstractC0271g abstractC0271g, GridLayoutManager gridLayoutManager, u uVar) {
        super(2, false);
        this.f4664c = abstractC0271g;
        this.f4665d = gridLayoutManager;
        this.f4666e = uVar;
    }

    @Override // B3.u
    public final int o(int i) {
        AbstractC0271g abstractC0271g = this.f4664c;
        int itemViewType = abstractC0271g.getItemViewType(i);
        F4.b bVar = abstractC0271g.f4671e;
        Q q3 = this.f4665d;
        if (bVar == null) {
            return abstractC0271g.i(itemViewType) ? ((GridLayoutManager) q3).f5285b : this.f4666e.o(i);
        }
        if (abstractC0271g.i(itemViewType)) {
            return ((GridLayoutManager) q3).f5285b;
        }
        i.b(abstractC0271g.f4671e);
        i.e((GridLayoutManager) q3, "<unused var>");
        return itemViewType == 0 ? 1 : 4;
    }
}
