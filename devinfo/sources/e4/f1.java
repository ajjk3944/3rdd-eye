package e4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f22335a;

    /* renamed from: b, reason: collision with root package name */
    public c2 f22336b;

    public f1(View view, androidx.datastore.preferences.protobuf.j jVar) {
        c2 c2VarB;
        this.f22335a = jVar;
        WeakHashMap weakHashMap = v0.f22405a;
        c2 c2VarA = n0.a(view);
        if (c2VarA != null) {
            int i4 = Build.VERSION.SDK_INT;
            c2VarB = (i4 >= 34 ? new q1(c2VarA) : i4 >= 31 ? new p1(c2VarA) : i4 >= 30 ? new o1(c2VarA) : i4 >= 29 ? new n1(c2VarA) : new m1(c2VarA)).b();
        } else {
            c2VarB = null;
        }
        this.f22336b = c2VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z3;
        if (!view.isLaidOut()) {
            this.f22336b = c2.h(view, windowInsets);
            return g1.j(view, windowInsets);
        }
        c2 c2VarH = c2.h(view, windowInsets);
        z1 z1Var = c2VarH.f22315a;
        if (this.f22336b == null) {
            WeakHashMap weakHashMap = v0.f22405a;
            this.f22336b = n0.a(view);
        }
        if (this.f22336b == null) {
            this.f22336b = c2VarH;
            return g1.j(view, windowInsets);
        }
        androidx.datastore.preferences.protobuf.j jVarK = g1.k(view);
        if (jVarK != null && Objects.equals((c2) jVarK.f996b, c2VarH)) {
            return g1.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        c2 c2Var = this.f22336b;
        int i4 = 1;
        while (i4 <= 512) {
            v3.b bVarG = z1Var.g(i4);
            v3.b bVarG2 = c2Var.f22315a.g(i4);
            int i10 = bVarG.f35793a;
            int i11 = bVarG.f35796d;
            int i12 = bVarG.f35795c;
            int i13 = bVarG.f35794b;
            int i14 = bVarG2.f35793a;
            int i15 = bVarG2.f35796d;
            int i16 = bVarG2.f35795c;
            int i17 = bVarG2.f35794b;
            if (i10 > i14 || i13 > i17 || i12 > i16 || i11 > i15) {
                iArr = iArr2;
                z3 = true;
            } else {
                iArr = iArr2;
                z3 = false;
            }
            if (z3 != (i10 < i14 || i13 < i17 || i12 < i16 || i11 < i15)) {
                if (z3) {
                    iArr[0] = iArr[0] | i4;
                } else {
                    iArr3[0] = iArr3[0] | i4;
                }
            }
            i4 <<= 1;
            iArr2 = iArr;
        }
        boolean z10 = false;
        int i18 = iArr2[0];
        int i19 = iArr3[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f22336b = c2VarH;
            return g1.j(view, windowInsets);
        }
        c2 c2Var2 = this.f22336b;
        l1 l1Var = new l1(i20, (i18 & 8) != 0 ? g1.f22345e : (i19 & 8) != 0 ? g1.f22346f : (i18 & 519) != 0 ? g1.g : (i19 & 519) != 0 ? g1.f22347h : null, (i20 & 8) != 0 ? 160L : 250L);
        l1Var.f22371a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(l1Var.f22371a.b());
        v3.b bVarG3 = z1Var.g(i20);
        v3.b bVarG4 = c2Var2.f22315a.g(i20);
        int iMin = Math.min(bVarG3.f35793a, bVarG4.f35793a);
        int i21 = bVarG3.f35794b;
        int i22 = bVarG4.f35794b;
        int iMin2 = Math.min(i21, i22);
        int i23 = bVarG3.f35795c;
        int i24 = bVarG4.f35795c;
        int iMin3 = Math.min(i23, i24);
        int i25 = bVarG3.f35796d;
        int i26 = bVarG4.f35796d;
        yb.i iVar = new yb.i(v3.b.c(iMin, iMin2, iMin3, Math.min(i25, i26)), z10, v3.b.c(Math.max(bVarG3.f35793a, bVarG4.f35793a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)), 13);
        g1.g(view, l1Var, c2VarH, false);
        duration.addUpdateListener(new e1(l1Var, c2VarH, c2Var2, i20, view));
        duration.addListener(new b1(l1Var, view, 1));
        u.a(view, new ab.c(view, l1Var, iVar, duration, 1));
        this.f22336b = c2VarH;
        return g1.j(view, windowInsets);
    }
}
