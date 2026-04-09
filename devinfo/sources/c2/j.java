package c2;

import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.i4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2626a;

    /* renamed from: b, reason: collision with root package name */
    public final i4 f2627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2628c;

    /* renamed from: d, reason: collision with root package name */
    public int f2629d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(java.util.List r7, com.google.android.gms.internal.measurement.i4 r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f2626a = r7
            r6.f2627b = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r8 < r0) goto L19
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L19
            int r8 = r8.getClassification()
            goto L1a
        L19:
            r8 = r1
        L1a:
            r6.f2628c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L25
            r8.getButtonState()
        L25:
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L2e
            r8.getMetaState()
        L2e:
            android.view.MotionEvent r8 = r6.a()
            r0 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L51
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L4f
            if (r7 == r3) goto L4d
            if (r7 == r2) goto L4b
            switch(r7) {
                case 5: goto L4f;
                case 6: goto L4d;
                case 7: goto L4b;
                case 8: goto L49;
                case 9: goto L47;
                case 10: goto L45;
                default: goto L44;
            }
        L44:
            goto L6e
        L45:
            r1 = 5
            goto L6e
        L47:
            r1 = 4
            goto L6e
        L49:
            r1 = 6
            goto L6e
        L4b:
            r1 = r0
            goto L6e
        L4d:
            r1 = r2
            goto L6e
        L4f:
            r1 = r3
            goto L6e
        L51:
            int r8 = r7.size()
        L55:
            if (r1 >= r8) goto L4b
            java.lang.Object r4 = r7.get(r1)
            c2.p r4 = (c2.p) r4
            boolean r5 = c2.h0.c(r4)
            if (r5 == 0) goto L64
            goto L4d
        L64:
            boolean r4 = c2.h0.a(r4)
            if (r4 == 0) goto L6b
            goto L4f
        L6b:
            int r1 = r1 + 1
            goto L55
        L6e:
            r6.f2629d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.j.<init>(java.util.List, com.google.android.gms.internal.measurement.i4):void");
    }

    public final MotionEvent a() {
        i4 i4Var = this.f2627b;
        if (i4Var != null) {
            return (MotionEvent) ((yb.i) i4Var.f19783d).f37517c;
        }
        return null;
    }
}
