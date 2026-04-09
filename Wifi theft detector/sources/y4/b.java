package y4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final View f25125a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25126b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f25127c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f25125a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f25125a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f25125a);
        }
    }

    public int b() {
        return this.f25127c;
    }

    public boolean c() {
        return this.f25126b;
    }

    public void d(Bundle bundle) {
        this.f25126b = bundle.getBoolean("expanded", false);
        this.f25127c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f25126b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f25126b);
        bundle.putInt("expandedComponentIdHint", this.f25127c);
        return bundle;
    }

    public void f(int i10) {
        this.f25127c = i10;
    }
}
