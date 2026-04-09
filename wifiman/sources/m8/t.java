package M8;

import le.C6585f;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class t extends k8.m {
    public t() {
        super(new InterfaceC6839p() { // from class: M8.s
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(t.i((C6585f) obj, (String) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(le.C6585f r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "item"
            kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
            java.lang.String r0 = "filter"
            kotlin.jvm.internal.AbstractC6492s.i(r7, r0)
            le.i r0 = r6.c()
            ke.c r0 = r0.r()
            java.lang.String r0 = r0.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            boolean r0 = kotlin.text.t.U(r0, r7, r2)
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L8a
            java.util.List r0 = r6.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L39
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L39
        L37:
            r0 = r1
            goto L70
        L39:
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r0.next()
            le.i r3 = (le.C6588i) r3
            h9.a r4 = r3.e()
            java.lang.String r5 = ""
            java.lang.String r4 = r4.d(r5)
            boolean r4 = kotlin.text.t.U(r4, r7, r2)
            if (r4 != 0) goto L6c
            h9.a r3 = r3.e()
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.d(r4)
            boolean r3 = kotlin.text.t.U(r3, r7, r2)
            if (r3 == 0) goto L6a
            goto L6c
        L6a:
            r3 = r1
            goto L6d
        L6c:
            r3 = r2
        L6d:
            if (r3 == 0) goto L3d
            r0 = r2
        L70:
            if (r0 != 0) goto L8a
            le.i r6 = r6.c()
            com.ui.wifiman.model.vendor.d r6 = r6.u()
            if (r6 == 0) goto L87
            java.lang.String r6 = r6.getName()
            if (r6 == 0) goto L87
            boolean r6 = kotlin.text.t.U(r6, r7, r2)
            goto L88
        L87:
            r6 = r1
        L88:
            if (r6 == 0) goto L8b
        L8a:
            r1 = r2
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.t.i(le.f, java.lang.String):boolean");
    }
}
