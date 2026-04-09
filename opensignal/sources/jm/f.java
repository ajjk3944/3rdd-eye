package jm;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import br.l;
import com.staircase3.opensignal.goldstar.testshistory.TestHistoryActivity;
import o4.j0;
import o4.o0;

/* loaded from: classes.dex */
public final class f extends x7.a {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f13772b;

    /* renamed from: c, reason: collision with root package name */
    public o4.a f13773c = null;

    /* renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.b f13774d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13775e;

    /* renamed from: f, reason: collision with root package name */
    public final TestHistoryActivity f13776f;

    public f(TestHistoryActivity testHistoryActivity, j0 j0Var) {
        this.f13772b = j0Var;
        this.f13776f = testHistoryActivity;
    }

    @Override // x7.a
    public final void a(ViewPager viewPager, Object obj) {
        androidx.fragment.app.b bVar = (androidx.fragment.app.b) obj;
        if (this.f13773c == null) {
            j0 j0Var = this.f13772b;
            j0Var.getClass();
            this.f13773c = new o4.a(j0Var);
        }
        o4.a aVar = this.f13773c;
        aVar.getClass();
        androidx.fragment.app.d dVar = bVar.Q;
        if (dVar != null && dVar != aVar.f18772q) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + bVar.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new o0(6, bVar));
        if (bVar.equals(this.f13774d)) {
            this.f13774d = null;
        }
    }

    @Override // x7.a
    public final void b() {
        o4.a aVar = this.f13773c;
        if (aVar != null) {
            if (!this.f13775e) {
                try {
                    this.f13775e = true;
                    if (aVar.f18764g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.f18772q.B(aVar, true);
                } finally {
                    this.f13775e = false;
                }
            }
            this.f13773c = null;
        }
    }

    @Override // x7.a
    public final int c() {
        Integer[] numArr = g.f13777a;
        return 2;
    }

    @Override // x7.a
    public final String d(int i10) {
        String string = this.f13776f.getString(g.f13777a[i10].intValue());
        l.d(string, "getString(...)");
        return string;
    }

    @Override // x7.a
    public final Object e(ViewPager viewPager, int i10) {
        o4.a aVar = this.f13773c;
        j0 j0Var = this.f13772b;
        if (aVar == null) {
            j0Var.getClass();
            this.f13773c = new o4.a(j0Var);
        }
        long j = i10;
        androidx.fragment.app.b bVarE = j0Var.E("android:switcher:" + viewPager.getId() + ":" + j);
        if (bVarE != null) {
            o4.a aVar2 = this.f13773c;
            aVar2.getClass();
            aVar2.b(new o0(7, bVarE));
        } else {
            bVarE = new e();
            Bundle bundle = new Bundle();
            bundle.putInt("TestHistoryPage.extras_page_number", i10);
            bVarE.a0(bundle);
            this.f13773c.g(viewPager.getId(), bVarE, "android:switcher:" + viewPager.getId() + ":" + j, 1);
        }
        if (bVarE != this.f13774d) {
            bVarE.c0(false);
            bVarE.e0(false);
        }
        return bVarE;
    }

    @Override // x7.a
    public final boolean f(View view, Object obj) {
        return ((androidx.fragment.app.b) obj).f1413e0 == view;
    }

    @Override // x7.a
    public final void g(Object obj) {
        androidx.fragment.app.b bVar = (androidx.fragment.app.b) obj;
        androidx.fragment.app.b bVar2 = this.f13774d;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                bVar2.c0(false);
                this.f13774d.e0(false);
            }
            bVar.c0(true);
            bVar.e0(true);
            this.f13774d = bVar;
        }
    }

    @Override // x7.a
    public final void h(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
