package k0;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6824a;
import o.C7009H;
import o.S;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C7009H f51014a = S.d();

    /* renamed from: b, reason: collision with root package name */
    private final V.b f51015b = new V.b(new InterfaceC6824a[16], 0);

    /* renamed from: c, reason: collision with root package name */
    private boolean f51016c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f51016c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.f51014a.i();
        int i10 = 0;
        this.f51016c = false;
        V.b bVar = this.f51015b;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            do {
                ((InterfaceC6824a) objArrM[i10]).invoke();
                i10++;
            } while (i10 < iO);
        }
        this.f51015b.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r14 = this;
            o.H r0 = r14.f51014a
            java.lang.Object[] r1 = r0.f54922b
            long[] r0 = r0.f54921a
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            r10.H2()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            o.H r0 = r14.f51014a
            r0.i()
            r14.f51016c = r3
            V.b r0 = r14.f51015b
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.q.h():void");
    }

    public final m i(FocusTargetNode focusTargetNode) {
        return (m) this.f51014a.c(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, m mVar) {
        C7009H c7009h = this.f51014a;
        if (mVar != null) {
            c7009h.s(focusTargetNode, mVar);
        } else {
            B0.a.c("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }
}
