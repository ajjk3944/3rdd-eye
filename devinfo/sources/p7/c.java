package p7;

import android.view.animation.Interpolator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final km.n f31402a = km.n.q("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final km.n f31403b = km.n.q("k");

    public static void a(l7.b bVar, f7.j jVar) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) bVar.f218b;
        if (list.isEmpty()) {
            list.add(new s7.a(jVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(jVar.f23760m)));
        } else if (((s7.a) list.get(0)).f33484b == null) {
            list.set(0, new s7.a(jVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(jVar.f23760m)));
        }
    }

    public static boolean b(l7.b bVar) {
        if (bVar != null) {
            return bVar.j() && ((Float) ((s7.a) ((List) bVar.f218b).get(0)).f33484b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l7.e c(q7.b r27, f7.j r28) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.c.c(q7.b, f7.j):l7.e");
    }
}
