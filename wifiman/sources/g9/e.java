package G9;

import N.AbstractC3343s;
import N.a1;
import Q0.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import W0.t;
import Y0.w;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.q;
import q.InterfaceC7386e;

/* loaded from: classes3.dex */
public abstract class e {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f7223b;

        a(String str, androidx.compose.ui.e eVar) {
            this.f7222a = str;
            this.f7223b = eVar;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2083386102, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetError.<anonymous> (UiSettingsWidgetError.kt:25)");
            }
            String str = this.f7222a;
            if (str == null) {
                str = "";
            }
            a1.b(str, this.f7223b, C6733v0.k(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f(), ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), w.g(12), null, A.f18971b.e(), null, w.g(0), null, null, 0L, t.f23567a.b(), false, 3, 0, null, null, interfaceC3540l, 12782592, 3120, 120656);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r21, androidx.compose.ui.e r22, T.InterfaceC3540l r23, final int r24, final int r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            r3 = -1003325922(0xffffffffc432761e, float:-713.8456)
            r4 = r23
            T.l r13 = r4.r(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L16
            r4 = r1 | 6
            goto L26
        L16:
            r4 = r1 & 6
            if (r4 != 0) goto L25
            boolean r4 = r13.T(r0)
            if (r4 == 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 2
        L23:
            r4 = r4 | r1
            goto L26
        L25:
            r4 = r1
        L26:
            r5 = r2 & 2
            if (r5 == 0) goto L2f
            r4 = r4 | 48
        L2c:
            r6 = r22
            goto L41
        L2f:
            r6 = r1 & 48
            if (r6 != 0) goto L2c
            r6 = r22
            boolean r7 = r13.T(r6)
            if (r7 == 0) goto L3e
            r7 = 32
            goto L40
        L3e:
            r7 = 16
        L40:
            r4 = r4 | r7
        L41:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L53
            boolean r7 = r13.v()
            if (r7 != 0) goto L4e
            goto L53
        L4e:
            r13.C()
            r14 = r6
            goto Lb7
        L53:
            if (r5 == 0) goto L59
            androidx.compose.ui.e$a r5 = androidx.compose.ui.e.f28771b0
            r14 = r5
            goto L5a
        L59:
            r14 = r6
        L5a:
            boolean r5 = T.AbstractC3546o.H()
            if (r5 == 0) goto L67
            r5 = -1
            java.lang.String r6 = "com.ui.core.ui.component.settings.widget.UiSettingsWidgetError (UiSettingsWidgetError.kt:19)"
            T.AbstractC3546o.Q(r3, r4, r5, r6)
        L67:
            r3 = 1
            if (r0 == 0) goto L6c
            r4 = r3
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r5 = 0
            r6 = 0
            r7 = 3
            androidx.compose.animation.i r8 = androidx.compose.animation.g.o(r5, r6, r7, r5)
            r19 = 15
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.animation.i r9 = androidx.compose.animation.g.m(r15, r16, r17, r18, r19, r20)
            androidx.compose.animation.i r8 = r8.c(r9)
            androidx.compose.animation.k r9 = androidx.compose.animation.g.y(r15, r16, r17, r18, r19, r20)
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r5, r6, r7, r5)
            androidx.compose.animation.k r7 = r9.c(r5)
            G9.e$a r5 = new G9.e$a
            r5.<init>(r0, r14)
            r6 = 54
            r9 = 2083386102(0x7c2df2f6, float:3.6127808E36)
            b0.a r9 = b0.c.e(r9, r3, r5, r13, r6)
            r11 = 200064(0x30d80, float:2.8035E-40)
            r12 = 18
            r5 = 0
            r3 = 0
            r6 = r8
            r8 = r3
            r10 = r13
            q.AbstractC7385d.f(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r3 = T.AbstractC3546o.H()
            if (r3 == 0) goto Lb7
            T.AbstractC3546o.P()
        Lb7:
            T.X0 r3 = r13.z()
            if (r3 == 0) goto Lc5
            G9.d r4 = new G9.d
            r4.<init>()
            r3.a(r4)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.b(java.lang.String, androidx.compose.ui.e, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(String str, androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(str, eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
