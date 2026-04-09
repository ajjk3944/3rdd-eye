package h7;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f10189a = new r0();

    /* renamed from: b, reason: collision with root package name */
    public boolean f10190b = false;

    /* renamed from: c, reason: collision with root package name */
    public p0 f10191c = p0.ALLOW;

    public final void a(n1 n1Var, int i10) {
        q0 q0Var = n1Var.f10171s;
        View view = n1Var.f10155a;
        boolean z10 = q0Var == null;
        if (z10) {
            n1Var.f10157c = i10;
            if (this.f10190b) {
                n1Var.f10159e = c(i10);
            }
            n1Var.j = (n1Var.j & (-520)) | 1;
            int i11 = p3.f.f20247a;
            Trace.beginSection("RV OnBindView");
        }
        n1Var.f10171s = this;
        if (RecyclerView.W0) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = u3.i0.f23177a;
                if (view.isAttachedToWindow() != n1Var.j()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + n1Var.j() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + n1Var);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = u3.i0.f23177a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + n1Var);
                }
            }
        }
        n1Var.c();
        j(n1Var, i10);
        if (z10) {
            ArrayList arrayList = n1Var.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            n1Var.j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof z0) {
                ((z0) layoutParams).f10294c = true;
            }
            int i12 = p3.f.f20247a;
            Trace.endSection();
        }
    }

    public abstract int b();

    public long c(int i10) {
        return -1L;
    }

    public int d(int i10) {
        return 0;
    }

    public final void e(int i10) {
        this.f10189a.d(i10, 1);
    }

    public final void f(int i10, int i11) {
        this.f10189a.c(i10, i11);
    }

    public final void g(int i10, int i11) {
        this.f10189a.e(i10, i11);
    }

    public final void h(int i10, int i11) {
        this.f10189a.f(i10, i11);
    }

    public abstract void j(n1 n1Var, int i10);

    public abstract n1 k(ViewGroup viewGroup, int i10);

    public boolean m(n1 n1Var) {
        return false;
    }

    public void i(RecyclerView recyclerView) {
    }

    public void l(RecyclerView recyclerView) {
    }

    public void n(n1 n1Var) {
    }

    public void o(n1 n1Var) {
    }

    public void p(n1 n1Var) {
    }
}
