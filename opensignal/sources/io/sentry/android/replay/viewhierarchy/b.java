package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import lq.q;
import x1.f0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f12017a = kc.f.F(a.f12016d);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12018b;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f12019c;

    public static final SemanticsConfiguration a(f0 f0Var) {
        Method method = (Method) f12017a.getValue();
        return method != null ? (SemanticsConfiguration) method.invoke(f0Var, null) : f0Var.getCollapsedSemantics$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(androidx.compose.ui.semantics.SemanticsConfiguration r3, boolean r4, io.sentry.x5 r5) {
        /*
            r0 = 0
            if (r3 == 0) goto L11
            e2.s r1 = io.sentry.android.replay.v.f12002a
            u.a0 r2 = r3.f1191a
            java.lang.Object r1 = r2.g(r1)
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r0 = (java.lang.String) r0
        L11:
            java.lang.String r1 = "unmask"
            boolean r1 = br.l.a(r0, r1)
            if (r1 == 0) goto L1a
            goto L56
        L1a:
            java.lang.String r1 = "mask"
            boolean r0 = br.l.a(r0, r1)
            if (r0 == 0) goto L24
            r3 = 1
            return r3
        L24:
            if (r4 == 0) goto L29
            java.lang.String r3 = "android.widget.ImageView"
            goto L4a
        L29:
            if (r3 == 0) goto L48
            u.a0 r3 = r3.f1191a
            e2.s r4 = e2.p.f7754x
            boolean r4 = r3.c(r4)
            if (r4 != 0) goto L45
            e2.s r4 = e2.g.f7694i
            boolean r4 = r3.c(r4)
            if (r4 != 0) goto L45
            e2.s r4 = e2.p.B
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L48
        L45:
            java.lang.String r3 = "android.widget.TextView"
            goto L4a
        L48:
            java.lang.String r3 = "android.view.View"
        L4a:
            io.sentry.b6 r4 = r5.getSessionReplay()
            java.util.concurrent.CopyOnWriteArraySet r4 = r4.f12077d
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L58
        L56:
            r3 = 0
            return r3
        L58:
            io.sentry.b6 r4 = r5.getSessionReplay()
            java.util.concurrent.CopyOnWriteArraySet r4 = r4.f12076c
            boolean r3 = r4.contains(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.b.b(androidx.compose.ui.semantics.SemanticsConfiguration, boolean, io.sentry.x5):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193 A[PHI: r3
  0x0193: PHI (r3v8 boolean) = (r3v29 boolean), (r3v31 boolean) binds: [B:73:0x0191, B:68:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(x1.f0 r23, io.sentry.android.replay.viewhierarchy.f r24, boolean r25, io.sentry.x5 r26) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.b.c(x1.f0, io.sentry.android.replay.viewhierarchy.f, boolean, io.sentry.x5):void");
    }
}
