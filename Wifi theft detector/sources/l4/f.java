package l4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class f extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public g f23164a;

    /* renamed from: b, reason: collision with root package name */
    public int f23165b;

    /* renamed from: c, reason: collision with root package name */
    public int f23166c;

    public f() {
        this.f23165b = 0;
        this.f23166c = 0;
    }

    public int I() {
        g gVar = this.f23164a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.I(view, i10);
    }

    public boolean K(int i10) {
        g gVar = this.f23164a;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f23165b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        J(coordinatorLayout, view, i10);
        if (this.f23164a == null) {
            this.f23164a = new g(view);
        }
        this.f23164a.c();
        this.f23164a.a();
        int i11 = this.f23165b;
        if (i11 != 0) {
            this.f23164a.e(i11);
            this.f23165b = 0;
        }
        int i12 = this.f23166c;
        if (i12 == 0) {
            return true;
        }
        this.f23164a.d(i12);
        this.f23166c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23165b = 0;
        this.f23166c = 0;
    }
}
