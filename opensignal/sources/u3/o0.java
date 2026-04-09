package u3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f23198a;

    /* renamed from: b, reason: collision with root package name */
    public h1 f23199b;

    public o0(View view, androidx.datastore.preferences.protobuf.j jVar) {
        h1 h1VarB;
        this.f23198a = jVar;
        WeakHashMap weakHashMap = i0.f23177a;
        h1 h1VarA = a0.a(view);
        if (h1VarA != null) {
            int i10 = Build.VERSION.SDK_INT;
            h1VarB = (i10 >= 30 ? new x0(h1VarA) : i10 >= 29 ? new w0(h1VarA) : new v0(h1VarA)).b();
        } else {
            h1VarB = null;
        }
        this.f23199b = h1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f23199b = h1.g(view, windowInsets);
            return p0.i(view, windowInsets);
        }
        h1 h1VarG = h1.g(view, windowInsets);
        f1 f1Var = h1VarG.f23176a;
        if (this.f23199b == null) {
            WeakHashMap weakHashMap = i0.f23177a;
            this.f23199b = a0.a(view);
        }
        if (this.f23199b == null) {
            this.f23199b = h1VarG;
            return p0.i(view, windowInsets);
        }
        androidx.datastore.preferences.protobuf.j jVarJ = p0.j(view);
        if (jVarJ != null && Objects.equals((WindowInsets) jVarJ.f1301d, windowInsets)) {
            return p0.i(view, windowInsets);
        }
        h1 h1Var = this.f23199b;
        int i10 = 0;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if (!f1Var.f(i11).equals(h1Var.f23176a.f(i11))) {
                i10 |= i11;
            }
        }
        if (i10 == 0) {
            return p0.i(view, windowInsets);
        }
        h1 h1Var2 = this.f23199b;
        u0 u0Var = new u0(i10, (i10 & 8) != 0 ? f1Var.f(8).f14017d > h1Var2.f23176a.f(8).f14017d ? p0.f23203e : p0.f23204f : p0.f23205g, 160L);
        u0Var.f23222a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(u0Var.f23222a.a());
        k3.d dVarF = f1Var.f(i10);
        k3.d dVarF2 = h1Var2.f23176a.f(i10);
        int iMin = Math.min(dVarF.f14014a, dVarF2.f14014a);
        int i12 = dVarF.f14015b;
        int i13 = dVarF2.f14015b;
        int iMin2 = Math.min(i12, i13);
        int i14 = dVarF.f14016c;
        int i15 = dVarF2.f14016c;
        int iMin3 = Math.min(i14, i15);
        int i16 = dVarF.f14017d;
        int i17 = i10;
        int i18 = dVarF2.f14017d;
        om.f fVar = new om.f(k3.d.b(iMin, iMin2, iMin3, Math.min(i16, i18)), 19, k3.d.b(Math.max(dVarF.f14014a, dVarF2.f14014a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        p0.f(view, u0Var, windowInsets, false);
        duration.addUpdateListener(new n0(u0Var, h1VarG, h1Var2, i17, view));
        duration.addListener(new t7.j(2, view, u0Var));
        p.a(view, new o.e(view, u0Var, fVar, duration, 1, false));
        this.f23199b = h1VarG;
        return p0.i(view, windowInsets);
    }
}
