package d0;

import C0.k;
import T2.g;
import X.f;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final int f19709d;

    /* renamed from: e, reason: collision with root package name */
    public f f19710e;

    /* renamed from: f, reason: collision with root package name */
    public final k f19711f = new k(21, this);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f19712g;

    public e(DrawerLayout drawerLayout, int i) {
        this.f19712g = drawerLayout;
        this.f19709d = i;
    }

    @Override // T2.g
    public final void A(int i) {
        this.f19712g.r(i, this.f19710e.f4142t);
    }

    @Override // T2.g
    public final void B(View view, int i, int i3) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f19712g;
        float width2 = (drawerLayout.a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.o(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // T2.g
    public final void C(View view, float f2, float f5) {
        int i;
        int[] iArr = DrawerLayout.f5134R;
        float f6 = ((c) view.getLayoutParams()).f19701b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f19712g;
        if (drawerLayout.a(3, view)) {
            i = (f2 > 0.0f || (f2 == 0.0f && f6 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f2 < 0.0f || (f2 == 0.0f && f6 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f19710e.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // T2.g
    public final boolean N(int i, View view) {
        if (!DrawerLayout.l(view)) {
            return false;
        }
        int i3 = this.f19709d;
        DrawerLayout drawerLayout = this.f19712g;
        return drawerLayout.a(i3, view) && drawerLayout.f(view) == 0;
    }

    @Override // T2.g
    public final int d(int i, View view) {
        DrawerLayout drawerLayout = this.f19712g;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // T2.g
    public final int e(int i, View view) {
        return view.getTop();
    }

    @Override // T2.g
    public final int r(View view) {
        if (DrawerLayout.l(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // T2.g
    public final void v(int i, int i3) {
        int i6 = i & 1;
        DrawerLayout drawerLayout = this.f19712g;
        View viewD = i6 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.f(viewD) != 0) {
            return;
        }
        this.f19710e.b(i3, viewD);
    }

    @Override // T2.g
    public final void w() {
        this.f19712g.postDelayed(this.f19711f, 160L);
    }

    @Override // T2.g
    public final void z(int i, View view) {
        ((c) view.getLayoutParams()).f19702c = false;
        int i3 = this.f19709d == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f19712g;
        View viewD = drawerLayout.d(i3);
        if (viewD != null) {
            drawerLayout.b(viewD, true);
        }
    }
}
