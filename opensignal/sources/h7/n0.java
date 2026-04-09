package h7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10153a;

    public /* synthetic */ n0(RecyclerView recyclerView) {
        this.f10153a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(h7.n1 r9, androidx.media3.common.i0 r10, androidx.media3.common.i0 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f10153a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            h7.v0 r1 = r0.f2070l0
            r2 = r1
            h7.n r2 = (h7.n) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f1699a
            int r6 = r11.f1699a
            if (r4 != r6) goto L22
            int r1 = r10.f1700b
            int r3 = r11.f1700b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f1700b
            int r7 = r11.f1700b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f10155a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f10145i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.Y()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.n0.a(h7.n1, androidx.media3.common.i0, androidx.media3.common.i0):void");
    }

    public void b(n1 n1Var, androidx.media3.common.i0 i0Var, androidx.media3.common.i0 i0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f10153a;
        recyclerView.f2064g.m(n1Var);
        recyclerView.h(n1Var);
        n1Var.n(false);
        n nVar = (n) recyclerView.f2070l0;
        nVar.getClass();
        int i10 = i0Var.f1699a;
        int i11 = i0Var.f1700b;
        View view = n1Var.f10155a;
        int left = i0Var2 == null ? view.getLeft() : i0Var2.f1699a;
        int top = i0Var2 == null ? view.getTop() : i0Var2.f1700b;
        if (n1Var.h() || (i10 == left && i11 == top)) {
            nVar.l(n1Var);
            nVar.f10144h.add(n1Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = nVar.g(n1Var, i10, i11, left, top);
        }
        if (zG) {
            recyclerView.Y();
        }
    }
}
