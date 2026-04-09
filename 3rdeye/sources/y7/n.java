package y7;

import V0.c;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Set;
import kotlin.KotlinVersion;

/* compiled from: ScrollableViewPager.java */
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public final o7.c f48307c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c f48308d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48309e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48310f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48311g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48312h;
    public Set<Integer> i;

    /* renamed from: j, reason: collision with root package name */
    public r7.h f48313j;

    /* compiled from: ScrollableViewPager.java */
    public class a extends c.AbstractC0180c {
        public a() {
        }

        @Override // V0.c.AbstractC0180c
        public final void e(int i) {
            boolean z10 = true;
            if ((i & 2) == 0 && (i & 1) == 0) {
                z10 = false;
            }
            n.this.f48311g = z10;
        }

        @Override // V0.c.AbstractC0180c
        public final boolean j(int i, View view) {
            return false;
        }
    }

    public n(Context context) {
        super(context);
        this.f48307c = new o7.c(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.f48309e = true;
        this.f48310f = true;
        this.f48311g = false;
        this.f48312h = false;
    }

    public final boolean b(MotionEvent motionEvent) {
        if (!this.f48310f && this.f48308d != null) {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                this.f48311g = false;
            }
            this.f48308d.k(motionEvent);
        }
        Set<Integer> set = this.i;
        if (set != null) {
            this.f48312h = this.f48309e && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.f48311g || this.f48312h || !this.f48309e) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f48307c.a(motionEvent);
        return zDispatchTouchEvent;
    }

    public r7.h getOnInterceptTouchEventListener() {
        return this.f48313j;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r7.h hVar = this.f48313j;
        if (hVar != null) {
            hVar.a(this, motionEvent);
        }
        return b(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i10, int i11, int i12) {
        super.onScrollChanged(i, i10, i11, i12);
        this.f48307c.f44874b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.i = set;
    }

    public void setEdgeScrollEnabled(boolean z10) {
        this.f48310f = z10;
        if (z10) {
            return;
        }
        V0.c cVar = new V0.c(getContext(), this, new a());
        this.f48308d = cVar;
        cVar.f12862p = 3;
    }

    public void setOnInterceptTouchEventListener(r7.h hVar) {
        this.f48313j = hVar;
    }

    public void setScrollEnabled(boolean z10) {
        this.f48309e = z10;
    }
}
