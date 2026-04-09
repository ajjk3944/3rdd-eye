package Q1;

import N7.G8;
import Q1.f;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class d extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final f.d f10866d;

    /* renamed from: e, reason: collision with root package name */
    public f.g f10867e;

    public d(f.d dVar) {
        this.f10866d = dVar;
    }

    @Override // Q1.f.e
    public final void onPageScrolled(int i, float f10, int i10) {
        if (this.f10867e == null) {
            return;
        }
        float f11 = -f10;
        int i11 = 0;
        while (true) {
            f.d dVar = this.f10866d;
            if (i11 >= dVar.O()) {
                return;
            }
            View viewN = dVar.N(i11);
            if (viewN == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(G8.r("LayoutManager returned a null child at pos ", i11, "/", dVar.O(), " while transforming pages"));
            }
            this.f10867e.transformPage(viewN, (RecyclerView.p.b0(viewN) - i) + f11);
            i11++;
        }
    }

    @Override // Q1.f.e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
    }
}
