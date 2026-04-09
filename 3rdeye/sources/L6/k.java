package L6;

import android.view.View;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.z;

/* compiled from: PagerSnapStartHelper.kt */
/* loaded from: classes.dex */
public final class k extends C {

    /* renamed from: e, reason: collision with root package name */
    public z f4101e;

    /* renamed from: f, reason: collision with root package name */
    public y f4102f;

    public static int j(RecyclerView.p pVar, View view, A a10) {
        float y10;
        int height;
        int iF;
        if (pVar.v()) {
            y10 = view.getX();
            height = view.getWidth() / 2;
        } else {
            y10 = view.getY();
            height = view.getHeight() / 2;
        }
        int i = (int) (y10 + height);
        if (pVar.Q()) {
            iF = (a10.l() / 2) + a10.k();
        } else {
            iF = a10.f() / 2;
        }
        return i - iF;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // androidx.recyclerview.widget.C, androidx.recyclerview.widget.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] b(androidx.recyclerview.widget.RecyclerView.p r5, android.view.View r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layoutManager"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "targetView"
            kotlin.jvm.internal.l.f(r6, r0)
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.v()
            r2 = 0
            if (r1 == 0) goto L32
            androidx.recyclerview.widget.y r1 = r4.f4102f
            if (r1 == 0) goto L23
            androidx.recyclerview.widget.RecyclerView$p r3 = r1.f16364a
            boolean r3 = kotlin.jvm.internal.l.b(r3, r5)
            if (r3 == 0) goto L21
            r2 = r1
        L21:
            if (r2 != 0) goto L2a
        L23:
            androidx.recyclerview.widget.y r2 = new androidx.recyclerview.widget.y
            r2.<init>(r5)
            r4.f4102f = r2
        L2a:
            int r5 = j(r5, r6, r2)
            r6 = 0
            r0[r6] = r5
            return r0
        L32:
            boolean r1 = r5.w()
            if (r1 == 0) goto L55
            androidx.recyclerview.widget.z r1 = r4.f4101e
            if (r1 == 0) goto L47
            androidx.recyclerview.widget.RecyclerView$p r3 = r1.f16364a
            boolean r3 = kotlin.jvm.internal.l.b(r3, r5)
            if (r3 == 0) goto L45
            r2 = r1
        L45:
            if (r2 != 0) goto L4e
        L47:
            androidx.recyclerview.widget.z r2 = new androidx.recyclerview.widget.z
            r2.<init>(r5)
            r4.f4101e = r2
        L4e:
            int r5 = j(r5, r6, r2)
            r6 = 1
            r0[r6] = r5
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.k.b(androidx.recyclerview.widget.RecyclerView$p, android.view.View):int[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C, androidx.recyclerview.widget.G
    public final int d(RecyclerView.p pVar, int i, int i10) {
        e eVar = (e) pVar;
        if (eVar.q() != 0) {
            i = i10;
        } else if (pVar.W() != 0) {
            i = -i;
        }
        int iH = i < 0 ? eVar.h() : eVar.k();
        if (iH != -1) {
            return iH;
        }
        int iJ = eVar.j();
        int iE = eVar.e();
        if (iE == iJ) {
            if (iE == -1) {
                return 0;
            }
        } else if (i < 0) {
            return iJ;
        }
        return iE;
    }
}
