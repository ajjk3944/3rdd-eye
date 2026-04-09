package a2;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import d2.InterfaceC2265a;
import q5.i;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268d extends AbstractC0271g {

    /* renamed from: l, reason: collision with root package name */
    public final Object f4660l;

    public AbstractC0268d() {
        super(0);
        this.f4660l = I5.b.s(C0267c.f4659b);
    }

    @Override // a2.AbstractC0271g
    public final int g(int i) {
        return ((InterfaceC2265a) this.f4668b.get(i)).a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c5.b, java.lang.Object] */
    @Override // a2.AbstractC0271g
    public final BaseViewHolder l(ViewGroup viewGroup, int i) {
        i.e(viewGroup, "parent");
        int i3 = ((SparseIntArray) this.f4660l.getValue()).get(i);
        if (i3 == 0) {
            throw new IllegalArgumentException(A.f.h(i, "ViewType: ", " found layoutResId，please use addItemType() first!").toString());
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i3, viewGroup, false);
        i.d(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return e(viewInflate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c5.b, java.lang.Object] */
    public final void q(int i, int i3) {
        ((SparseIntArray) this.f4660l.getValue()).put(i, i3);
    }
}
