package H3;

import A2.C0117e;
import A3.z;
import C0.k;
import S4.p;
import a2.AbstractC0271g;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lefan.signal.ui.noise.NoiseHistoryActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1796a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1797b;

    /* renamed from: c, reason: collision with root package name */
    public int f1798c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1799d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1800e;

    public g(C0117e c0117e, J2.d[] dVarArr, boolean z6, int i) {
        this.f1796a = 1;
        this.f1800e = c0117e;
        this.f1799d = dVarArr;
        boolean z7 = false;
        if (dVarArr != null && z6) {
            z7 = true;
        }
        this.f1797b = z7;
        this.f1798c = i;
    }

    public void a(int i) {
        int i3;
        AbstractC0271g abstractC0271g = (AbstractC0271g) this.f1799d;
        if (d() && i >= abstractC0271g.getItemCount() - 1 && (i3 = this.f1798c) == 1 && i3 != 2) {
            this.f1798c = 2;
            RecyclerView recyclerView = abstractC0271g.f4675j;
            if (recyclerView != null) {
                recyclerView.post(new z(14, this));
                return;
            }
            p pVar = (p) this.f1800e;
            if (pVar != null) {
                NoiseHistoryActivity noiseHistoryActivity = pVar.f3549a;
                int i6 = NoiseHistoryActivity.f19009T;
                noiseHistoryActivity.C();
            }
        }
    }

    public void b(int i) {
        switch (this.f1796a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1800e;
                WeakReference weakReference = sideSheetBehavior.f18420D;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1798c = i;
                    if (!this.f1797b) {
                        ((View) sideSheetBehavior.f18420D.get()).postOnAnimation((z) this.f1799d);
                        this.f1797b = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1800e;
                WeakReference weakReference2 = bottomSheetBehavior.f18156k0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1798c = i;
                    if (!this.f1797b) {
                        ((View) bottomSheetBehavior.f18156k0.get()).postOnAnimation((k) this.f1799d);
                        this.f1797b = true;
                        break;
                    }
                }
                break;
        }
    }

    public int c() {
        AbstractC0271g abstractC0271g = (AbstractC0271g) this.f1799d;
        if (abstractC0271g.h()) {
            return -1;
        }
        abstractC0271g.getClass();
        return abstractC0271g.f4668b.size();
    }

    public boolean d() {
        if (((p) this.f1800e) == null || !this.f1797b) {
            return false;
        }
        return !((AbstractC0271g) this.f1799d).f4668b.isEmpty();
    }

    public void e() {
        AbstractC0271g abstractC0271g = (AbstractC0271g) this.f1799d;
        boolean zD = d();
        this.f1797b = true;
        boolean zD2 = d();
        if (zD) {
            if (zD2) {
                return;
            }
            abstractC0271g.notifyItemRemoved(c());
        } else if (zD2) {
            this.f1798c = 1;
            abstractC0271g.notifyItemInserted(c());
        }
    }

    public g(AbstractC0271g abstractC0271g) {
        this.f1796a = 2;
        this.f1799d = abstractC0271g;
        this.f1798c = 1;
    }

    public g(SideSheetBehavior sideSheetBehavior) {
        this.f1796a = 0;
        this.f1800e = sideSheetBehavior;
        this.f1799d = new z(2, this);
    }

    public g(BottomSheetBehavior bottomSheetBehavior) {
        this.f1796a = 3;
        this.f1800e = bottomSheetBehavior;
        this.f1799d = new k(28, this);
    }
}
