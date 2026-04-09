package M6;

import N7.G7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WrapContentPageSizeProvider.kt */
/* loaded from: classes.dex */
public final class C extends n {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f4217d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4218e;

    public C(RecyclerView recyclerView, boolean z10, int i, j jVar, G7.a aVar) {
        super(i, jVar, aVar);
        this.f4217d = recyclerView;
        this.f4218e = z10;
    }

    @Override // M6.n
    public final Float d(int i) {
        View viewJ;
        RecyclerView.p layoutManager = this.f4217d.getLayoutManager();
        if (layoutManager == null || (viewJ = layoutManager.J(i)) == null) {
            return null;
        }
        return Float.valueOf(this.f4218e ? viewJ.getWidth() : viewJ.getHeight());
    }
}
