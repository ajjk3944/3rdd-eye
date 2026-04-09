package M3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f4173a;

    /* renamed from: b, reason: collision with root package name */
    public int f4174b;

    public c() {
        this.f4174b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        u(coordinatorLayout, v10, i);
        if (this.f4173a == null) {
            d dVar = new d();
            dVar.f4178d = v10;
            this.f4173a = dVar;
        }
        d dVar2 = this.f4173a;
        View view = (View) dVar2.f4178d;
        dVar2.f4175a = view.getTop();
        dVar2.f4176b = view.getLeft();
        this.f4173a.b();
        int i10 = this.f4174b;
        if (i10 == 0) {
            return true;
        }
        d dVar3 = this.f4173a;
        if (dVar3.f4177c != i10) {
            dVar3.f4177c = i10;
            dVar3.b();
        }
        this.f4174b = 0;
        return true;
    }

    public final int s() {
        d dVar = this.f4173a;
        if (dVar != null) {
            return dVar.f4177c;
        }
        return 0;
    }

    public int t() {
        return s();
    }

    public void u(CoordinatorLayout coordinatorLayout, V v10, int i) {
        coordinatorLayout.r(i, v10);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4174b = 0;
    }
}
