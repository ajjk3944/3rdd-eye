package n0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f17282a = new z0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f17283b = new z0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f17284c = new z0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final z0 f17285d = new z0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f17286e = new z0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.media3.exoplayer.trackselection.d f17287f = new androidx.media3.exoplayer.trackselection.d(19);

    public static final void a(int i10, int i11, List list) {
        int iE = e(i10, list);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < list.size() && ((m0) list.get(iE)).f17216b < i11) {
        }
    }

    public static final void b(r1 r1Var, ArrayList arrayList, int i10) {
        boolean zL = r1Var.l(i10);
        int[] iArr = r1Var.f17298b;
        if (zL) {
            arrayList.add(r1Var.n(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(r1Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new i(h0.b.o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new i(h0.b.o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iG = br.l.g(((m0) list.get(i12)).f17216b, i10);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }
}
