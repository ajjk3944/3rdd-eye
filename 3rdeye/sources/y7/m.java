package y7;

import android.content.Context;
import android.content.res.Resources;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;

/* compiled from: RtlViewPager.kt */
/* loaded from: classes.dex */
public class m extends ViewPager {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<ViewPager.j, a> f48304b;

    /* compiled from: RtlViewPager.kt */
    public final class a implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager.j f48305a;

        public a(ViewPager.j jVar) {
            this.f48305a = jVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            this.f48305a.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f10, int i10) {
            m mVar = m.this;
            androidx.viewpager.widget.a adapter = m.super.getAdapter();
            if (C6.r.d(mVar) && adapter != null) {
                int count = adapter.getCount();
                int pageWidth = ((int) ((1 - adapter.getPageWidth(i)) * mVar.getWidth())) + i10;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (adapter.getPageWidth(i) * mVar.getWidth());
                }
                i = (count - i) - 1;
                i10 = -pageWidth;
                f10 = i10 / (adapter.getPageWidth(i) * mVar.getWidth());
            }
            this.f48305a.onPageScrolled(i, f10, i10);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            m mVar = m.this;
            androidx.viewpager.widget.a adapter = m.super.getAdapter();
            if (C6.r.d(mVar) && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f48305a.onPageSelected(i);
        }
    }

    public m(Context context) {
        super(context, null);
        this.f48304b = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(ViewPager.j listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        a aVar = new a(listener);
        this.f48304b.put(listener, aVar);
        super.addOnPageChangeListener(aVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f48304b.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !C6.r.d(this)) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(ViewPager.j listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        a aVarRemove = this.f48304b.remove(listener);
        if (aVarRemove != null) {
            super.removeOnPageChangeListener(aVarRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z10) throws Resources.NotFoundException {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && C6.r.d(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z10);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && C6.r.d(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }
}
